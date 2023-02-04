package Class18ThisKeyWord;

public class FurnitureTester {

    public static void main(String[] args) {

        //calling constrocter and assigning value to each varaibls

        //table is refernce varibale that we just created and it can have any name
        Furniture table=new Furniture("Table",100,"White");

        table.print();

        Furniture chair= new Furniture("Chair",200,"Brown");//this order (Type , price , color ) should be the same as we
        //created the variable otherwise we get error the order is changed
        chair.print();
    }
}
