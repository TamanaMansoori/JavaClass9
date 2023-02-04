package Class12StringManipulation;

public class StringEmptyDemo {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.isEmpty());// we get the boolean as out put which give us true or false

        String str2="ioopmmvjdfnlken899";
        System.out.println(str2);//we get false here


        System.out.println("***********Blank Method******************");
        String str3=" ";
        System.out.println(str3.isBlank());//output we get as true even if there is space this blank method dosen't count it



    }
}
