import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
    private int ID;
    private String Name;
    private double CGPA;
    
    Student(int ID,String Name,double CGPA){
        this.ID=ID;
        this.Name=Name;
        this.CGPA=CGPA;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public double getCGPA(){
        return CGPA;
    }
}
class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> pq=new PriorityQueue<>((a,b)->{
            int result=Double.compare(b.getCGPA(),a.getCGPA());
            if(result!=0){
                return result;
            }
            result=a.getName().compareTo(b.getName());
            if(result!=0){
                return result;
            }
            return Integer.compare(a.getID(),b.getID());
            
        });
            
            for(String event:events){
                String[] parts=event.split(" ");
                if(parts[0].equals("ENTER")){
                Student student=new Student(Integer.parseInt(parts[3]),parts[1],Double.parseDouble(parts[2]));
                pq.offer(student);
                
                }
                else{
                    pq.poll();
                }
            }
            List<Student> result=new ArrayList<>();
            while(!pq.isEmpty()){
                result.add(pq.poll());
            }
        return result;
    }
    
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
