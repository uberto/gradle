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

@file:Incubating
package org.gradle.kotlin.dsl

import org.gradle.api.Action
import org.gradle.api.Incubating
import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.ExternalModuleDependency
import org.gradle.api.artifacts.FileCollectionDependency
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.ProjectDependency
import org.gradle.api.artifacts.dsl.ConfigurationDependencyHandler
import org.gradle.api.artifacts.dsl.DependencyFactory
import org.gradle.api.artifacts.dsl.DependencyProvider
import org.gradle.api.file.FileCollection
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderConvertible


/**
 * Add a dependency.
 *
 * @param dependencyNotation dependency to add
 * @see DependencyFactory.createFromCharSequence
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(dependencyNotation: CharSequence) = add(dependencyNotation)


/**
 * Add a dependency.
 *
 * @param dependencyNotation dependency to add
 * @param configuration an action to configure the dependency
 * @see DependencyFactory.createFromCharSequence
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(dependencyNotation: CharSequence, configuration: Action<in ExternalModuleDependency>) = add(dependencyNotation, configuration)


/**
 * Add a dependency.
 *
 * @param map a map of configuration parameters for the dependency
 * @see DependencyFactory.createFromMap
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(map: Map<String, *>) = add(map)


/**
 * Add a dependency.
 *
 * @param map a map of configuration parameters for the dependency
 * @param configuration an action to configure the dependency
 * @see DependencyFactory.createFromMap
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(map: Map<String, *>, configuration: Action<in ExternalModuleDependency>) = add(map, configuration)


/**
 * Add a dependency.
 *
 * @param project project to add as a dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(project: Project) = add(project)


/**
 * Add a dependency.
 *
 * @param project project to add as a dependency
 * @param configuration an action to configure the dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(project: Project, configuration: Action<in ProjectDependency>) = add(project, configuration)


/**
 * Add a dependency.
 *
 * @param files files to add as a dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(files: FileCollection) = add(files)


/**
 * Add a dependency.
 *
 * @param files files to add as a dependency
 * @param configuration an action to configure the dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(files: FileCollection, configuration: Action<in FileCollectionDependency>) = add(files, configuration)


/**
 * Add a dependency.
 *
 * @param externalModule external module to add as a dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(externalModule: Provider<out MinimalExternalModuleDependency>) = add(externalModule)


/**
 * Add a dependency.
 *
 * @param externalModule external module to add as a dependency
 * @param configuration an action to configure the dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(externalModule: Provider<out MinimalExternalModuleDependency>, configuration: Action<in ExternalModuleDependency>) = add(externalModule, configuration)


/**
 * Add a dependency.
 *
 * @param externalModule external module to add as a dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(externalModule: ProviderConvertible<out MinimalExternalModuleDependency>) = add(externalModule)


/**
 * Add a dependency.
 *
 * @param externalModule external module to add as a dependency
 * @param configuration an action to configure the dependency
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(externalModule: ProviderConvertible<out MinimalExternalModuleDependency>, configuration: Action<in ExternalModuleDependency>) = add(externalModule, configuration)


/**
 * Add a dependency.
 *
 * @param dependency dependency to add
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(dependency: Dependency) = add(dependency)


/**
 * Add a dependency.
 *
 * @param dependency dependency to add
 * @param configuration an action to configure the dependency
 * @since 7.6
 */
fun <D : Dependency> ConfigurationDependencyHandler.invoke(dependency: D, configuration: Action<in D>) = add(dependency, configuration)


/**
 * Add a dependency.
 *
 * @param dependency dependency to add
 * @since 7.6
 */
fun ConfigurationDependencyHandler.invoke(dependency: DependencyProvider<*>) = add(dependency)


/**
 * Add a dependency.
 *
 * @param dependency dependency to add
 * @param configuration an action to configure the dependency
 * @since 7.6
 */
fun <D : Dependency> ConfigurationDependencyHandler.invoke(dependency: DependencyProvider<out D>, configuration: Action<in D>) = add(dependency, configuration)
