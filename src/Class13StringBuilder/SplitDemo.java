package Class13StringBuilder;

public class SplitDemo {

    public static void main(String[] args) {
        String str="I like java. I wrire a lot of code daily. I am from batch 15.";
        //it breaks down the whole paragraph to sentences

        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);//it gives us 3 becouse we have 3 sentences in a paragraph
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2].trim());//trim remove the space

    }
}
