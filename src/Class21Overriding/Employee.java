package Class21Overriding;

public class Employee {

    String name;
  static  int baseSalary=30000;
   static int baseHolidays=10;

    void printSalary(){
        System.out.println(baseHolidays);
    }
    void printHolidays(){
        System.out.println(baseHolidays);
    }
}

class OfficeBoy extends Employee {

}

class Manager extends Employee{//override since we want a different salary method for managers plus some bounus , so here we have same method from
    //line 10 and just bring some changes

    void printSalary(){
        System.out.println((baseHolidays*4)+200000);
    }

}


class Developer extends Employee{//overriding

    void printSalary(){
        System.out.println((baseHolidays*3)+30000);
    }
}

class QA extends Employee{//overriding

    void printSalary(){
        System.out.println((baseHolidays*5)+30000);//overriding
    }

    void printHolidays(){
        System.out.println(baseHolidays+5);//overriding
    }
}