package org.example.class20;
// We have to calculate the average of marks obtained in three
// subjects by student A and in 4 subjects by student B. Create class
// 'Marks' with an abstract method 'getAverage' that will be returning the
// average of marks. Provide implementation of abstract method in classes 'A'
// and 'B'. The constructor of student A takes the marks in three subjects
// as its parameters and the marks in four subjects as its parameters for
// student B. Test your code
public abstract class Marks {
    abstract double getAverage();
}
class A extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getAverage() {
        return (subject1 + subject2 + subject3) / 3;
    }
}

class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getAverage() {
        return (subject1 + subject2 + subject3 + subject4) / 4;
    }
}

 class MarksTester {
    public static void main(String[] args) {
        A studentA = new A(80, 75, 90);
        B studentB = new B(85, 78, 92, 88);

        System.out.println("Average marks of Student A: " + studentA.getAverage());
        System.out.println("Average marks of Student B: " + studentB.getAverage());
    }
}