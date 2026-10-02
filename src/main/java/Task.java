public class Task {
    private String title;
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
