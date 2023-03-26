package Class23Abstruction;

public abstract class File {
/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
 */


    //below we create  a constractor and initialize th parameter.
    int size;
    File(int size){
        this.size=size;
    }
   abstract void open();

   void edit(){
       System.out.println("");
   }

   void close(){
       System.out.println("");
   }
}

class JavaFile extends File{

    JavaFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("to open Java file we need notepad++");
    }
}

class WordFile extends File{


    WordFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("to open doc file we need Microsoft word");
    }
}

class PdfFile extends File{

    PdfFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("to open PDF we need the PDF converter");
    }
}