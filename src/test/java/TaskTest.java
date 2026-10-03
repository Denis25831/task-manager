import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaskTest {

    @Test
    void shouldReturnTaskTitle() {
        Task task = new Task("Learn Maven");
        assertEquals("Learn Maven", task.getTitle());
    }

    @Test
    void shouldMarkTaskAsCompleted() {
        Task task = new Task("Learn Maven");
        task.complete();
        assertTrue(task.isCompleted());
    }

    @Test
    void shouldBeNotCompletedByDefault() {
        Task task = new Task("Learn java");
        assertFalse(task.isCompleted());
    }
    @Test
    void shouldHaveCreationDate(){
        Task task = new Task("Learn Maven");
        assertEquals("2026-10-02", task.getCreatedAt());
    }

}
