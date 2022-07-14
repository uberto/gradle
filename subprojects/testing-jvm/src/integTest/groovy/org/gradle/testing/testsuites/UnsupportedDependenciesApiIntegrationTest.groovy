/*
 * Copyright 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.testing.testsuites

import org.gradle.integtests.fixtures.AbstractIntegrationSpec

class UnsupportedDependenciesApiIntegrationTest extends AbstractIntegrationSpec {
    def setup() {
        buildFile << """
            plugins {
                id 'java'
            }
        """
    }
    /*
        Unsupported methods from DependencyHandler...

        These should not be supported
        - dynamic... testImplementation("foo")
        - add
        - addProvider
        - addProviderConvertible
        - create

        Maybe?
        - module
        - variantOf

        These should never be supported
        - getModules
        - modules
        - createArtifactResolutionQuery
        - attributesSchema
        - getAttributesSchema
        - getArtifactTypes
        - artifactTypes
        - registerTransform
        - getComponents
        - components

        These should eventually be supported
        - getConstraints
        - constraints

        These should be supported:
        - gradleApi
        - gradleTestKit
        - localGroovy
        - project
        - platform
        - enforcedPlatform
        - testFixtures

     */
    def "produces a reasonable message when trying to use #unsupported in a test suite dependencies block"() {
        buildFile << """
            testing {
                suites {
                    test {
                        dependencies {
                            ${unsupported}
                        }
                    }
                }
            }
        """
        expect:
        fails("dependencies")
        failure.assertHasCause("bad message")

        where:
        unsupported << [
                // TODO: need to test multiple overloaded methods for some of these
                'add("implementation", "com:example:1.0")',
                'addProvider("implementation", project.provider { "com:example:1.0" })',
                // 'addProviderConvertible("implementation", "com:example:1.0")',
                'create("com:example:1.0")',
                'module("com:example:1.0")',
                // 'variantOf(...)'
                'getConstraints()',
                'constraints {}',
                'getModules()',
                'modules { }',
                'createArtifactResolutionQuery()',
                'getAttributesSchema()',
                'attributesSchema {}',
                'getArtifactTypes()',
                'artifactTypes {}',
                // registerTransform
                'getComponents()',
                'components {}',
                'testImplementation("com:example:1.0")',
        ]
    }
}
