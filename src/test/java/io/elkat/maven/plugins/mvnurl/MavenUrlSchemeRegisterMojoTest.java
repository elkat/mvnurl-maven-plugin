package io.elkat.maven.plugins.mvnurl;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

public class MavenUrlSchemeRegisterMojoTest extends AbstractMojoTestCase {

    /**
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {

        // required for mojo lookups to work
        super.setUp();
    }

    /** {@inheritDoc} */
    protected void tearDown() throws Exception {
        // required
        super.tearDown();

    }

    /**
     * @throws Exception
     */
    public void testRepoPub() throws Exception {
        File testPom = new File(getBasedir(), "src/test/resources/unit/basic-test/basic-test-plugin-config.xml");

//        YourMojo mojo = (YourMojo) lookupMojo("yourGoal", testPom);

//        assertNotNull(mojo);
    }
}
