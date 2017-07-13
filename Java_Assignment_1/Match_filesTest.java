package Matches_files;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 11/7/17.
 */
public class Match_filesTest {
    @Test
    public void firstcase() {

        assertTrue(Match_files.filefounder(new File("."), ".txt"));
    }
    @Test
    public void secondtest() {
        assertTrue(Match_files.filefounder(new File("/home"), ""));
    }
    @Test
    public void third() {

        assertFalse(Match_files.filefounder(new File("/home"), "@It wont match"));
        System.out.println("It didn't match");
    }





}