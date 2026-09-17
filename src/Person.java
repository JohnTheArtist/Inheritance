


public class Person {
    //instance variable
    double height;

    int age;

    String color;

    String name;

    double weight;


    Person(){
        height = 40;
        age = 10;
        color = "black";
        name = "";
        weight = 140;
    }


    //Overloaded constructor

    Person(double height, int age, String color, String name, double weight){
        //parameters are local variables to the constructor
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;




    }

}
