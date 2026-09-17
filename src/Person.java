
//private and protected are not allowed as class access modifiers.

public class Person {
    //instance variable
    double height;

    int age;

    String color;

    String name;

    double weight;


    //constructors can have private, protected, public access modifiers

     Person(){
        height = 40;
        age = 10;
        color = "black";
        name = "";
        weight = 140;
    }


    // protected members are accessible within the same package

    protected Person(double height, int age){
        this.height = 40;
       this.age = 10;

    }



    //Overloaded constructor

    private Person(double height, int age, String color, String name, double weight){
        //parameters are local variables to the constructor
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;




    }

    //setters and getters
    //methods
    public Person Call_Private(){
        Person p3 = new Person(72, 21, "black", "John Atkins", 140);

        return p3;
    }

}
