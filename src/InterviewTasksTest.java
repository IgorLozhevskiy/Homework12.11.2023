import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterviewTasksTest {
    @Test
    void isAnagramTest() {
        String string = "yellow";
        assertTrue(InterviewTasks.isAnagram(string, "wolely"));
        assertTrue(InterviewTasks.isAnagram(string, "elolwy"));
        assertTrue(InterviewTasks.isAnagram(string, "lowely"));
        assertTrue(InterviewTasks.isAnagram(string, "ollwey"));
        assertFalse(InterviewTasks.isAnagram(string, "wolelw")); //not y
        assertFalse(InterviewTasks.isAnagram(string, string));//the same order
        assertFalse(InterviewTasks.isAnagram(string, "wglely"));//g is not from the string
        assertFalse(InterviewTasks.isAnagram(string, "wolye"));//must be two 'l'
        assertTrue(InterviewTasks.isAnagram(string, "wolley"));

    }
}
