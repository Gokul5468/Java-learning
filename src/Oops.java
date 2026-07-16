/*
class Student{
    int id ;
    int roll_no;
    Student(int id,int roll_no){
        this.id = id;
        this.roll_no = roll_no;
    }
}
public class Oops {
    public static void main(String[] args){
        Student obj = new Student(12219200,34);
        System.out.println(obj.id);
        System.out.println(obj.roll_no);
    }
}


public class Oops {

    String name;
    String breed;
    int age;
    String color;

    public Oops(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Name is: " + name
                + "\nBreed age and color are: "
                + breed + " " + age + " " + color;
    }

    public static void main(String[] args) {
        Oops tuffy = new Oops("tuffy", "papillon", 5, "white");
        System.out.println(tuffy);
    }
}



class Product{
    String name;
    float price;
    Product(String name,float price){
        this.name = name;
        this.price=price;
    }
    public void Setname(String name){
        this.name = name;
    }
    public void Setprice(float price){
        this.price = price;
    }
    public String getname() {
        return name;
    }
    public float getprice(){
        return price;
    }

}
class Oops{
    public static void main(String[] args){
        Product obj = new Product("TV",124.4f);
        Product obj1 = new Product("TV",125.4f);
        System.out.println(obj.getname());
        System.out.println(obj1.getprice());

    }
}

 */

class Geeks{
    String name;
    int age;
    Geeks(String name ,int age){
        this.name = name;
        this.age = age;
    }
    Geeks(Geeks obj2){
        this.name = obj2.name;
        this.age = obj2.age;
    }
}
class Oops{
    public static void main(String[] args){
        Geeks obj = new Geeks("Gokul",21);
        System.out.println(obj.name);
        System.out.println(obj.age);
        Geeks obj1 = new Geeks(obj);
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}