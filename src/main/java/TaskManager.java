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
            if (task.getTitle().equalsIgnoreCase(title)) {
                return task;

            }
        }
        return null;
    }
    public List<Task> getCompletedTasks(){
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks){
            if (task.isCompleted()){
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }
    public List<Task> getIncompleteTasks(){
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks){
            if (!task.isCompleted()){
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }
    public void clearTasks(){
        tasks.clear();
    }
    public int getCompletedTaskCount(){
        return getCompletedTasks().size();

    }
}
