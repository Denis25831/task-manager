import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertEquals("Learn Maven", manager.getTask(0).getTitle());
    }
    @Test
    void shouldReturnAllTasks(){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Learn Java"));
        manager.addTask(new Task("Learn Maven"));
        assertEquals(2, manager.getTasks().size());
    }
    @Test
    void shouldFindTaskByTitle(){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Learn Java"));
        manager.addTask(new Task("Learn Maven"));
        Task found = manager.findByTitle("Learn Maven");
        assertEquals("Learn Maven", found.getTitle());
    }
    @Test
    void shouldReturnNullWhenTaskNotFound(){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Learn Java"));
        Task found = manager.findByTitle("Learn Maven");
        assertNull(found);
    }
    @Test
    void shouldCompleteTask(){
        TaskManager manager = new TaskManager();
        manager.addTask(new Task("Learn Java"));
        manager.completeTask(0);
        assertTrue(manager.getTask(0).isCompleted());
    }
    @Test
    void shouldThrowExceptionWhenCompletingInvalidTask(){
        TaskManager manager = new TaskManager();
        assertThrows(IndexOutOfBoundsException.class, () -> manager.completeTask(0));
    }
}
