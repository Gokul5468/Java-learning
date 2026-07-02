//varibles..

//public class Methodes{
//    public static void main(String[] args){
//        int $gokul = 30;
//        System.out.println($gokul);
//    }
//}

//instance varibles.
//static var
//local var

//parameter scope

public class Methodes{
    static int x = 56;
    private int y = 33;
    public void testfunc(int x,int y){
        Methodes t = new Methodes();
        this.x = 22;
        y = 67;
        y = 45;
               System.out.println("Geeks:" + t.x);
               System.out.println("Geeks:" + t.y);
               System.out.println(y);
    }

    public static void main(String[] args){
        Methodes m = new Methodes();
        m.testfunc(5,6);
    }
}




/*
public class Methodes {
    public static void main(String[] args){
        Methodes obj = new Methodes();
        obj.greet();
    }
    void greet()
    {
        System.out.println("Hello");
    }
}


class Methodes{
    int sum(int a , int b){ //parameters
        return a+b;
    }
    public static void main(String[] args){
     int a = 3;
     int b = 4;
        Methodes m = new Methodes();
        int result = m.sum(5,3); // arguments
        System.out.println(result);
    }
}



//types of instance methodes..
//1.Getter..

class Methodes{
    private int balance = 1000;

    public int getbalance(){
        //int balance = 2000;
        return balance;
    }
    public static void main(String[] args){
        Methodes m = new Methodes();
        int res = m.getbalance();
        System.out.println(res);

    }
}



//setters -->
/*
class Methodes{
    private int amount = 100;

    public void setBalance(int balance){
       amount += balance;
    }

    public int getBalance(){
        return amount;
    }
    public static void main(String[] args){
        Methodes m = new Methodes();
        int result = m.getBalance();
        System.out.println(result);
    }
}



//Static methodess..

class Methodes{
    int a = 40;
    static int b = 50;

    void simpleDisplay(){
        System.out.println(a);
        System.out.println(b);
    }
    static void simpleDisplay1(){
        System.out.println(b); // if b is replaced by a it will error.
    }
    public static void main(String[] args){
        Methodes m = new Methodes();
        m.simpleDisplay();
        m.simpleDisplay1();
    }
}



//2. Static methodes  can access both non static methode and static methode.

class Methodes{
    static int num = 100;
    static String str = "Gokul";

    static void display(){
        System.out.println("Static number is :" + num);
        System.out.println("Static string is :" + str);
    }

    void nonstatic(){
        display();
    }
    public static void main(String[] args){
        Methodes obj = new Methodes();
        obj.display();
        obj.nonstatic();
    }
}




public class Methodes {
    String name;
    static int employeeCount = 0; // shared counter across ALL Employee objects

    Methodes(String name) {
        this.name = name;
        employeeCount++; // every time a new object is created, increment the shared counter
    }

    public static void main(String[] args) {
        Methodes e1 = new Methodes("Ravi");
        Methodes e2 = new Methodes("Priya");
        Methodes e3 = new Methodes("Amit");

        System.out.println("Total Employees: " + Methodes.employeeCount); // Output: 3
    }
}

 */