package thread;

public class Person extends Thread {
    private String personName;
    private Table table;
    private boolean isCook;

    public void setTable(Table table){
        this.table=table;
    }

    public void setPersonName(String name){
        this.personName=name;
    }

    public String getPersonName(){
        return personName;
    }

    public void setCook(boolean isCook){
        this.isCook=isCook;
    }

    public void run(){
        if(!isCook){
            table.eatFood(this);
        }
        else{
            table.addFood("짜장면");
        }
    }
}
