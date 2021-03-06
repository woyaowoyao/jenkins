package io.cloudpipelines.steps

import groovy.transform.CompileStatic
import groovy.transform.Immutable
import javaposse.jobdsl.dsl.Job
import javaposse.jobdsl.dsl.jobs.FreeStyleJob

import io.cloudpipelines.common.Coordinates
import io.cloudpipelines.common.PipelineDescriptor

/**
 * Represents a step inside the pipeline
 *
 * @author Marcin Grzejszczak
 * @since 1.0.0
 */
@CompileStatic
interface Step<T> {
	CreatedJob step(String projectName, Coordinates coordinates, PipelineDescriptor descriptor)
	void customize(T step)
}
