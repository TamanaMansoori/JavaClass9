package Class26EncapsulationAndWrapper;

public class Demo2ArrayList {
    public static void main(String[] args) {

        String name1="Savo";
        String[]name={"Hiral","Nima","Laura","Nat"};

        //here we call the method
        System.out.println(contains(name1,name));//here we get false becouse name1 is not inside the array , but if we put one of the name
        //which is in array into the name1 then we will get true.

    }
    //create a method which can search a name from this array return true if name is present in the array
    public static boolean contains (String nameToBeSearched,String[]name){

        // Contain is class in ArrayList that checks if a specific value is present inside an Array or not and the return type of contain
        //is the boolean (true/false)

        for(String names:name){//inhance for loop
            if(nameToBeSearched.equals(name)){
                return true;
            }
        }
        return false;
    }
}
