package class3;

public class RelationalOperators_6 {
    public static void main(String[] args) {
        int number=10;
        int number2=10;
        System.out.println(number+number2);// Arithmetic operation, the result of this operation is exactly the same data type we have in the variable

// for relational operator, no matter what data type we use for variable, the result will be boolean and we get (true) or (false)

        //relational operator is below
        /*
        >
        <
        =>
        =<
        ==
        !=
         */

        boolean result=20>10;
        System.out.println(result);// we get the true result in the consul
        System.out.println(20>10); // we get the true result in the consul
        System.out.println(5>10); // we get the false result in the consul
        System.out.println(5!=10); // we get the true result in the consul
        System.out.println(5==10); // we get the false result in the consul
        System.out.println(10>=20); // we get the false result in the consul
        System.out.println(10<=20); // we get the ture result in the consul because one condition is met

        //Note: if we have two conditions then even if we get only one condition true then the resul will be true

        System.out.println(10<=10); // the result is true






    }
}
