package class3;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age=10;
        int salary;//we have created the box but not putting/assigning any value to it for now. this is an empty box
        salary=120000;// here we are accessing the variable and updating/reassigning the value of the variable
        System.out.println(salary);

        String name, city,country; //multiple variable of same data type in a single line
        char gender,letter;
        name="Daria";
        System.out.println(name);
        //System.out.println(city); here we get error because we have not stored anything inside the city variable

        city="Irving";
        System.out.println(city);


    }
}
