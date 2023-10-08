public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello, World!\n\n");
        
        TypeLiteralsInJava tlj = new TypeLiteralsInJava(78L);// 78L es el literal de 
        tlj.toStringCustom();
     }
}

class TypeLiteralsInJava {
    
    int num;
    
    public TypeLiteralsInJava(long numP) {
        num = (int)numP;
    }
    
    public void toStringCustom() {
        System.out.printf("variable num: %d", this.num);
    }
    
}
