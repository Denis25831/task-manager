import java.util.ArrayList;
import java.util.List;
public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }
    public void completeTask(int index){
        tasks.get(index).complete();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task findByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }
}
