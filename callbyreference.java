//call by reference
class student{
    String name;
    int marks;
    student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class Main{
    static void updatemarks(student s){
        System.out.println("inside method before update, name:- "+s.name+" marks= "+s.marks);
        s.marks=s.marks+5;
        System.out.println("inside method after update, name:- "+s.name+" marks= "+s.marks);
    }
    public static void main(String[] args){
        student s1=new student("Karunasri",95);
        System.out.println("before method call:- "+s1.name+"  marks= "+s1.marks);
        updatemarks(s1);
        System.out.println("after method call:- "+s1.name+" marks= "+s1.marks);
    }
} 
