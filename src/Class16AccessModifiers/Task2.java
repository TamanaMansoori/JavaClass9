package Class16AccessModifiers;

public class Task2 {

          /*
4)Create a method that will say Hello
         in different language based on the country
         that will be passed when method is executed

         return type=String or void
         name=sayHello
         parameter=String countryName
     */
        String sayHello (String countryName){
            switch (countryName){
                case "USA":
                    return "Hello";
                case "Kazakhstan":
                    return "Salem";
                case "Italy":
                    return "Ciao";
                case "China":
                    return "Ni hao";
                default:
                    return "Country not supported";
            }

        }

    public static void main(String[] args) {
        //here we call the method
        Task2 task2=new Task2();
        System.out.println(task2.sayHello("Italy"));
    }
}
