import java.util.Scanner;

public class MultipleOfSix {
    public static void main(String[] args) {


    int number=100;
    System.out.println("Multiple of 6 are: ");
    for(int i=0; i<number; i++){
        if(i%6==0){
            System.out.print(i+" ");
        }
    }

    }

}
