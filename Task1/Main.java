
package codealphatasks;
import codealphatasks.Student;
import java.io.IOException;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String,Student>Students=new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Welcome Sir");
        System.out.println("Press 1 to add Student grades");
        System.out.println("Press 2 to get average of the grades");
        System.out.println("Press 3 to get the lowest grade");
        System.out.println("Press 4 to get the highest grade ");
        System.out.println("Press 5 to view all grades ");

        int in= Integer.parseInt(scanner.nextLine());
        switch(in){
            case 1:
                Student temp=new Student();
                System.out.println("please enter Student name");
                String name=scanner.nextLine();
                System.out.println("please enter subject name");
                String subject=scanner.nextLine();
                System.out.println("please enter the subject grade");
                
                double grade=Double.parseDouble(scanner.nextLine());
                if(Students.containsKey(name)){
                    Students.get(name).subjects.put(subject, grade);
                    break;
                }
                temp.setName(name);
                temp.subjects.put(subject,grade);
                Students.put(name,temp);
                break;
            case 2:
                System.out.println("please enter Student name");
                String name2=scanner.nextLine();
                Student student=Students.get(name2);
                double avg=student.getAverage();
                System.out.println("the average score is :"+ avg);
                break;
            case 3:
                System.out.println("please enter Student name");
                String name3=scanner.nextLine();
                Student student2=Students.get(name3);
                Map<String,Double> low=student2.getLowestScore();
                for(Map.Entry<String, Double> entry : low.entrySet()){
                System.out.println("the lowest score is :"+ entry.getKey()+" with score: "+entry.getValue());
                }
                break;

            case 4:
                System.out.println("please enter Student name");
                String name4=scanner.nextLine();
                Student student3=Students.get(name4);
                Map<String,Double> high=student3.getHighestScore();
                for(Map.Entry<String, Double> entry : high.entrySet()){
                System.out.println("the highest score is :"+ entry.getKey()+" with score: "+entry.getValue());
                }
                break;
            case 5:
                System.out.println("please enter Student name");
                String name5=scanner.nextLine();
                if(Students.containsKey(name5)){
                 for(Map.Entry<String, Double> entry : Students.get(name5).subjects.entrySet()){
                    System.out.println("subject :"+ entry.getKey()+" with score: "+entry.getValue());
                }
                }
                else {
                    System.out.println("this student doesnot exist");
                }
                break;
            default:
                System.out.println("See u soon");
                return;
                
        }
        }
    }
    
}
