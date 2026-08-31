//basic display student details program in java
class student{
    String id;
    String name;
    void setdetails(String id,String name){
        this.id=id;
        this.name=name;
    }
    void getdetails(){
        System.out.println("student id:- "+id);
        System.out.println("student name:- "+name);
    }
}
public class Main{
    public static void main(String[] args){
        student s = new student();
        s.setdetails("101","X");
        s.getdetails();
    }
}
