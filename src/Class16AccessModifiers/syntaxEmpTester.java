package Class16AccessModifiers;

public class syntaxEmpTester {
    public static void main(String[] args) {

        syntaxEmp syntaxEmp=new syntaxEmp();
        syntaxEmp.empID=1234;
        syntaxEmp.salary=1000;
        syntaxEmp.CEO="Sumair";

        syntaxEmp syntaxEmp1=new syntaxEmp();
        syntaxEmp1.empID=7890;
        syntaxEmp1.salary=2000;
        syntaxEmp1.CEO="Sumair";

        System.out.println(syntaxEmp.empID);
        System.out.println(syntaxEmp.salary);
        System.out.println(syntaxEmp.CEO);




    }
}
