import java.util.ArrayList;
import java.util.List;
public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }
    public  int getTaskCount(){
        return tasks.size();
    }
    public  Task getTask(int index){
        return tasks.get(index);
    }
    public void removeTask(int index){
        tasks.remove(index);
    }
    public List<Task> getTasks(){
        return tasks;
    }
}
