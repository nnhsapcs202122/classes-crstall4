public class Door{
    private boolean isOpened = false;
    private String name;
    public Door(String name, boolean isOpened){
        this.name = name;
        this.isOpened = isOpened;
        
    }
    public void setName(String name){
        this.name = name;
    }
    public void open(){
        this.isOpened = true;
    }
    public void close(){
        this.isOpened = false;
    }
    public String getName(){
        return this.name;
    
    }
    public String getState(){
        if(isOpened){
            return "opened";
        }
        else{
            return "closed";
        }
    }
}