public class Main {



    public static void main(String[] args) {
        //create two person object

        Person p1 = new Person();

//        Person p2 = new Person(72, 21, "black", "John Atkins", 140);


        Person p2 = new Person(72, 21);

        System.out.println(p2.age);


        Person p3 = p2.Call_Private();

        Student s1 = new Student();

        s1.age = 21;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);

    }


}
