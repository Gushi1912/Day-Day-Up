package com.gushi.dmeo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/2/26
 */
@Mojo(name = "hello")
public class DemoMojo extends AbstractMojo {

    @Parameter(name = "name", defaultValue = "gugugu")
    private String name;


    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello " + name);
    }
}
