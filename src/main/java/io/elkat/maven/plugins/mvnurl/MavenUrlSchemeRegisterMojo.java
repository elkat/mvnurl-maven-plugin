package io.elkat.maven.plugins.mvnurl;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * 
 * @see http://wiki.eclipse.org/Equinox/p2/Publisher
 * 
 * @author Tarun R Elankath
 * 
 */
@Mojo(name = "regscheme", defaultPhase = LifecyclePhase.PACKAGE)
public class MavenUrlSchemeRegisterMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        // TODO Auto-generated method stub

    }

}
