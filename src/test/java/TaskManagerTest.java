import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TaskManagerTest {
    @Test
    void shouldCountTasks(){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Learn Java"));
        manager.addTask(new Task("Learn Maven"));
        assertEquals(2, manager.getTaskCount());
    }
    @Test
    void shouldReturnTaskByIndex(){
        TaskManager manager = new TaskManager();
        Task firstTask = new Task("Learn Java");
        manager.addTask(firstTask);
        assertEquals(firstTask, manager.getTask(0));
    }
    @Test
    void shouldRemoveTask(){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Learn Java"));
        manager.addTask(new Task("Learn Maven"));
        manager.removeTask(0);
        assertEquals(1, manager.getTaskCount());
        assertEquals("learn Maven", manager.getTask(0).getTitle());
    }
    @Test
    void shouldReturnAllTasks(){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Learn Java"));
        manager.addTask(new Task("Learn Maven"));
        assertEquals(2, manager.getTasks().size());
    }
}
