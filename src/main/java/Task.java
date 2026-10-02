public class Task {
    private String title = "Task B";
    private String description;

    public Task(String title, String description){
       this.title = title;
       this.description = description;

    }
    public  String getTitle(){
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printTitle(){
        System.out.println(title);
    }


}
