public class Task {

    private String title = "Task A";

    private String description;

    public Task(String title){
       this.title = title;

    }
    public  String getTitle(){
        return title;
    }

    public void printTitle(){
        System.out.println(title);
    }


}
