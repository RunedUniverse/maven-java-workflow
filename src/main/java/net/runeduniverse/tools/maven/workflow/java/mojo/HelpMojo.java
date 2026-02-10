/*
 * Copyright © 2026 VenaNocta (venanocta@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.runeduniverse.tools.maven.workflow.java.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import static net.runeduniverse.lib.utils.maven3.PluginUtils.getVersionFromArtifact;

/**
 * prints the help-page
 *
 * @goal help
 * @requiresProject false
 * @requiresReports false
 * @threadSafe true
 * @since 1.0.0
 * @author VenaNocta
 */
public class HelpMojo extends AbstractMojo {

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		final String version = asVersionTag(getVersionFromArtifact(getClass(), getLog(),
				"net.runeduniverse.tools.maven.workflow", "maven-java-workflow"));
		getLog().info("");
		getLog().info("\033[1mJava Workflow" + version + "\033[m");
		getLog().info("");
		getLog().info("     R4M Maven Java Workflow, provides the r4m-metadata for");
		getLog().info("     the default workflow used in building all sorts of java projects.");
		getLog().info("");
	}

	public static String asVersionTag(final String version) {
		if (version == null)
			return "";
		return " (v" + version.trim() + ")";
	}
}
