import java.time.LocalDate;
public class Task {

    private String title = "Task A";
    private boolean completed;
    private LocalDate createdAt;

    public Task(String title){
       this.title = title;
       this.createdAt = LocalDate.now();

    }
    public  String getSummary(){
        return title + " - " + (completed ? "completed" : "not completed");
    }

    public LocalDate getCreatedAt(){
        return createdAt;
    }

    public  String getTitle(){
        return title;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void complete(){
        this.completed = true;
    }



}
