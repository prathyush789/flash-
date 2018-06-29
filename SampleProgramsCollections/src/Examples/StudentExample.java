package Examples;
class StudentExample
implements Comparable<StudentExample>{  
int rollno;  
String name;  
int age;  
StudentExample(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(StudentExample st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
}