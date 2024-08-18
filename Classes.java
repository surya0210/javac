// class Calculator{
//     int a=0;

//     public int add(int num1,int num2){
//         return num1+num2;

//     }

//     public double add(double num1,int num2){
//         return num1+num2;

//     }
//     public String add(String num1,int num2){
//         return num1+num2;

//     }
// }



// public class Classes {
//     public static void main(String[] args) {

//         Calculator calc=new Calculator();

//         String result=calc.add("2",5);

//         System.out.println(result);
        

//     }
    
// }






class Student{
    int rollno;
    String name;
    int marks;

}



public class Classes{
    public static void main(String[] a){
        Student s1=new Student();

        s1.rollno=1;
        s1.name="Surya";
        s1.marks=500;

        Student s2=new Student();

        s2.rollno=2;
        s2.name="Sudrya";
        s2.marks=50;

        Student s3=new Student();

        s3.rollno=3;
        s3.name="Suffrya";
        s3.marks=100;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for (Student studen:students){

            System.out.println(studen);


        }
    }

}