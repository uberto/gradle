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

package org.gradle.api.plugins.jvm.internal;

import groovy.lang.Closure;
import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.artifacts.ExternalModuleDependency;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.api.artifacts.dsl.ComponentMetadataHandler;
import org.gradle.api.artifacts.dsl.ComponentModuleMetadataHandler;
import org.gradle.api.artifacts.dsl.DependencyConstraintHandler;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.artifacts.dsl.ExternalModuleDependencyVariantSpec;
import org.gradle.api.artifacts.query.ArtifactResolutionQuery;
import org.gradle.api.artifacts.transform.TransformAction;
import org.gradle.api.artifacts.transform.TransformParameters;
import org.gradle.api.artifacts.transform.TransformSpec;
import org.gradle.api.artifacts.transform.VariantTransform;
import org.gradle.api.artifacts.type.ArtifactTypeContainer;
import org.gradle.api.attributes.AttributesSchema;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderConvertible;

import javax.annotation.Nullable;
import java.util.Map;

public interface UnsupportedDependencyHandler extends DependencyHandler {
    @Nullable
    @Override
    default Dependency add(String configurationName, Object dependencyNotation) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency add(String configurationName, Object dependencyNotation, Closure configureClosure) {
        throw new GradleException("bad message");
    }

    @Override
    default <T, U extends ExternalModuleDependency> void addProvider(String configurationName, Provider<T> dependencyNotation, Action<? super U> configuration) {
        throw new GradleException("bad message");
    }

    @Override
    default <T> void addProvider(String configurationName, Provider<T> dependencyNotation) {
        throw new GradleException("bad message");
    }

    @Override
    default <T, U extends ExternalModuleDependency> void addProviderConvertible(String configurationName, ProviderConvertible<T> dependencyNotation, Action<? super U> configuration) {
        throw new GradleException("bad message");
    }

    @Override
    default <T> void addProviderConvertible(String configurationName, ProviderConvertible<T> dependencyNotation) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency create(Object dependencyNotation) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency create(Object dependencyNotation, Closure configureClosure) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency module(Object notation) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency module(Object notation, Closure configureClosure) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency project(Map<String, ?> notation) {
        throw new GradleException("bad message");
    }

    @Override
    default DependencyConstraintHandler getConstraints() {
        throw new GradleException("bad message");
    }

    @Override
    default void constraints(Action<? super DependencyConstraintHandler> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default ComponentMetadataHandler getComponents() {
        throw new GradleException("bad message");
    }

    @Override
    default void components(Action<? super ComponentMetadataHandler> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default ComponentModuleMetadataHandler getModules() {
        throw new GradleException("bad message");
    }

    @Override
    default void modules(Action<? super ComponentModuleMetadataHandler> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default ArtifactResolutionQuery createArtifactResolutionQuery() {
        throw new GradleException("bad message");
    }

    @Override
    default AttributesSchema attributesSchema(Action<? super AttributesSchema> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default AttributesSchema getAttributesSchema() {
        throw new GradleException("bad message");
    }

    @Override
    default ArtifactTypeContainer getArtifactTypes() {
        throw new GradleException("bad message");
    }

    @Override
    default void artifactTypes(Action<? super ArtifactTypeContainer> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default void registerTransform(Action<? super VariantTransform> registrationAction) {
        throw new GradleException("bad message");
    }

    @Override
    default <T extends TransformParameters> void registerTransform(Class<? extends TransformAction<T>> actionType, Action<? super TransformSpec<T>> registrationAction) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency platform(Object notation) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency platform(Object notation, Action<? super Dependency> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency enforcedPlatform(Object notation) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency enforcedPlatform(Object notation, Action<? super Dependency> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency testFixtures(Object notation) {
        throw new GradleException("bad message");
    }

    @Override
    default Dependency testFixtures(Object notation, Action<? super Dependency> configureAction) {
        throw new GradleException("bad message");
    }

    @Override
    default Provider<MinimalExternalModuleDependency> variantOf(Provider<MinimalExternalModuleDependency> dependencyProvider, Action<? super ExternalModuleDependencyVariantSpec> variantSpec) {
        throw new GradleException("bad message");
    }

    @Override
    default Provider<MinimalExternalModuleDependency> enforcedPlatform(Provider<MinimalExternalModuleDependency> dependencyProvider) {
        throw new GradleException("bad message");
    }
}
