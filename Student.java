//Write a program to implement a class “student” with the following members. Name of the student. Marks of the student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning of the above.
class Student{
    String name;
    int marks1;
    int marks2;
    int marks3;
    int total;
    int average;
    public void assign(String name, int marks1, int marks2, int marks3){
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
         display();
    }
    public void compute(){
        total = marks1 + marks2 + marks3;
        average = total/3;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}