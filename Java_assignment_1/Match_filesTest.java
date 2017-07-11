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
        Match_files.filefounder(new File("/home"), ".java");
        assertTrue(Match_files.countOfFile>0);
    }
    @Test
    public void secondcase() {
        Match_files.filefounder(new File("."), ".txt");
        assertTrue(Match_files.countOfFile>0);
    }
    @Test
    public void thirdcase() {
        Match_files.filefounder(new File("/home/zemoso/"), "rahul.txt");
        assertTrue(Match_files.countOfFile>0);
    }
    @Test
    public void fourthcase() {
        Match_files.filefounder(new File("/home"), "");
        assertTrue(Match_files.countOfFile>0);
    }
    @Test
    public void fifthtcase() {
        Match_files.filefounder(new File("/home"), "@It wont match");
        assertFalse(Match_files.countOfFile>0);
        System.out.println("It didn't match");
    }





}