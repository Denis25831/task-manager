import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaskTest {
    @Test
    void shouldReturnTaskTitle(){
        Task task = new Task("Learn Maven");
        assertEquals("Learn Maven", task.getTitle());
    }
}
