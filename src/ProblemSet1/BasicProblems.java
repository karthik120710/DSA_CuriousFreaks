package ProblemSet1;

import java.util.Scanner;

public class BasicProblems {
    public static void main(String[] args) {
        printName();
    }

    public static void ioOperation(){
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
        String name=in.next();
        char initial=in.next().charAt(0);
        System.out.println("Initial :"+initial+" Name : "+name+" Age : "+age);
    }

    public static void checkTriangle(int side1,int side2,int side3){
        int sides=side1+side2+side3;
        if(sides==180)
            System.out.println("Triangle can form "+sides);
        else
            System.out.println("Triangle cant be form with "+sides);
    }

    public static void checkGrade(long Total){
        if(Total>=90)
            System.out.println("Grade A");
        else if(Total>=80)
            System.out.println("Grade B");
        else if (Total>=60)
            System.out.println("Grade C");
        else if(Total>=35)
            System.out.println("Grade D");
        else
            System.out.println("Fail");
    }

    public static void checkSize(int size){
        switch (size){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");break;
            case 38:
                System.out.println("Large");break;
            case 42:
                System.out.println("Extra Large");break;
        }
    }

    public static void printXforYtimes(int x,int y){
        for (int i=1;i<=y;i++){
            System.out.print(x+" ");
        }
    }

    public static void multiplesOfXtill1000(int x){
        for(int i=1;i<=1000;i++){
            System.out.print(i*x+" ");
        }
    }

    public static void printName(){
        Scanner in=new Scanner(System.in);
        String firstName=in.next();
        String lastName=in.next();
        int n=in.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println(firstName+lastName+" ");
        }
    }
}
