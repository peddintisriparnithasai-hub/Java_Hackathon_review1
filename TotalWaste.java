import java.util.*;
class TotalWaste{
    static double totalwaste(double point1waste, double point2waste){
        return point1waste + point2waste;

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("point1waste");
    double point1Waste = sc.nextDouble();

    System.out.println("point2waste");
    double point2waste = sc.nextDouble();
    
    double totalWaste = totalwaste(point1Waste, point2waste);
    System.out.println(totalWaste);
}
}
