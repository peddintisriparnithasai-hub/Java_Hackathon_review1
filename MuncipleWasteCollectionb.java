import java.util.Scanner;
public class MuncipleWasteCollectionb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Waste collected in kg=");
        double wastecollected = sc.nextDouble();

        if(wastecollected>=100){
            System.out.println("Collection Target Achieved");
        }else{
            System.out.println("More Waste Collection Required");
        }
    }
}
