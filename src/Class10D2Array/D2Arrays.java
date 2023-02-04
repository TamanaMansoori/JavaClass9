package Class10D2Array;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        String [][] train1=new String [3][3];//2D arrays
        String []cabin0={"Adem","Zafar","Sam"};
        String []cabin1={"Nabi","Saud","Anees"};
        String []cabin2={"Safi","Abeera","Zahra"};

        train1[0]=cabin0;
        train1[1]=cabin1;
        train1[2]=cabin2;

        System.out.println(train1[1][2]); //2D array
        System.out.println(train1[0]); //1D array
        System.out.println(Arrays.toString(train1[0]));//print all the elements (value)



    }
}
