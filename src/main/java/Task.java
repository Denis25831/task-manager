public class Task {

    private String title = "Task A";
    private String description;
    private boolean completed;
    private String createdAt;

    public Task(String title){
       this.title = title;
       this.createdAt = "2026-10-02";

    }

    public String getCreatedAt() {
        return createdAt;
    }

    public  String getTitle(){
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete(){
        this.completed = true;
    }

    public void printTitle(){
        System.out.println(title);
    }


}
