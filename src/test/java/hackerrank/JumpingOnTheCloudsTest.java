package hackerrank;

import org.junit.Test;

import java.io.FileInputStream;

public class JumpingOnTheCloudsTest {
    @Test
    public void test1() throws Exception {
        System.setIn(new FileInputStream("src/test/resources/jumping-on-the-clouds/test1.txt"));
        JumpingOnTheClouds.main(new String[]{});
    }
}