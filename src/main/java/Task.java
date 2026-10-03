public class Task {

    private String title = "Task A";
    private String description;
    private boolean completed;

    public Task(String title){
       this.title = title;

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
