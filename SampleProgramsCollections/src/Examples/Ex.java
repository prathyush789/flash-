package Examples;
import java.util.*;  
import java.io.*;  
public class Ex{  
public static void main(String args[]){  
ArrayList<StudentExample> al=new ArrayList<StudentExample>();  
al.add(new StudentExample(101,"Vijay",23));  
al.add(new StudentExample(106,"Ajay",27));  
al.add(new StudentExample(105,"Jai",21));  
  
Collections.sort(al); 
for(StudentExample st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  
