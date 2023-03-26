package Class19Inheritance;

public class Employee {

    String empName;
    String empId;

    Employee(String empName, String empId){
        this.empName=empName;
        this.empId=empId;
    }
    void userInfo(){
        System.out.println(empName+" works and has the following employee ID "+empId);
    }
}
class fullTime extends Employee{
    int hours;

    fullTime(String empName, String empId, int hours) {
        super(empName, empId);
        this.hours=hours;
    }
    void works(){
        System.out.println(empName+" works for Google, has the following employee ID "+empId+" and works "+hours);
    }
}
class partTime extends Employee{
    int overTime;

    partTime(String empName, String empId, int overTime){
        super(empName,empId);
        this.overTime=overTime;
    }
    void works1(){
        System.out.println(empName+" works and has the following employee ID "+empId+" and do the OT "+overTime+" " );
    }

    public static void main(String[] args) {
        fullTime input=new fullTime("Ahmad","2345",40);
        input.works();

        partTime value=new partTime("Sara","5670",20);
        value.works1();


    }



}
