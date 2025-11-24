
// default constructor
/* 
class Bike{   
            Bike()
            {
                System.out.println("Bike is created");
            }  
        }
         public class constructor{
            public static void main(String args[])
            {  
                Bike constructor =new Bike();  
            }  
        }  


// parameterized constructor
class student
{  
        int id;  
        String name;  
        Student(int i,String n)
        {  
        id = i;  
        name = n;  
        }  
        void display()
        {
            System.out.println(id+" "+name);
        }  
    }
 public class constructor{
        public static void main(String args[])
        {  
        Student s1 = new Student(111,"vasanth");  
        Student s2 = new Student(222,"samuel");  
        s1.display();  
        s2.display();  
    }  
    }  


// overloading constructor

 class Student{  
            int id;  
            String name;  
            int age;  
            Student(int i,String n)
            {  
                id = i;  
                name = n;  
                }  
            Student(int i,String n,int a)
            {  
                id = i;  
                name = n;  
                age = a;  
                }  
            void display()
            {
                System.out.println(id+" "+name+" "+age);
                }  
            }
        public class constructor{
            public static void main(String args[])
            {  
            Student s1 = new Student(111,"vasanth");  
            Student s2 = new Student(222,"samuel",25);  
            s1.display();  
            s2.display();  
        }  
        } 

// this keyword
class Student{  
        int rollno;  
        String name;  
        float fee;  
        Student(int rollno,String name,float fee){  
        this.rollno=rollno;  
        this.name=name;  
        this.fee=fee;  
        }  
        void display()
        {System.out.println(rollno+" "+name+" "+fee);}  
        }  
        
        public class constructor{  
        public static void main(String args[]){  
        Student s1=new Student(111,"ankit",5000f);  
        Student s2=new Student(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
        }}  

// current class invoke

class A{  
        void m()
        {
            System.out.println("hello m");
        }  
        void n()
        {  
        System.out.println("hello n");  
        m();//same as this.m()  
        this.m();  
        }  
        }  
    public class constructor{  
    public static void main(String args[]){  
    A a=new A();  
    a.n();  
    }
}  

// current class constructor

    class A{  
        A()
        {
            System.out.println("hello a");
        }  
        A(int x)
        {  
            this();  
            System.out.println(x);  
        }  
    }  
    public class constructor
    {  
        public static void main(String args[])
        {  
            A a=new A(10);  
        }
    }  

// polymorphism method overloading
class adder
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a, double b)
    {
        return a+b;
    }
}
public class constructor{
    public static void main(String args[])
    {
        system.out.println(adder.add(25,29))
        system.out.println(adder.add(15.7,12.6))
    }
}
*/
// polymorphism Method OverRiding
class Animal
{
    public void displayInfo()
    {
        System.out.println("i'm animal");
    }
}
class Dog extends Animal
{
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("i'm dog");
    }
}
class constructor
{
    public static void main(String args[])
    {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}