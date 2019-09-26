import java.util.*;
import java.text.DecimalFormat;
public class TipCalculator{
  public static void main(String[] args){
    DecimalFormat df = new DecimalFormat("##,##0.00");
    Scanner scan = new Scanner(System.in);
    double bill;
    double tipPercent;

    System.out.println("Input the Total price on the Bill: ");
      bill = scan.nextFloat();
    System.out.println("How much would you like to tip?");
      tipPercent = scan.nextFloat();
      tipPercent = tipPercent * .01;
    double tip = (tipPercent * bill);

    System.out.println("You should tip: $" + df.format(tip) + "\nthe total including tip would be: $" + df.format(tip + bill) );

}
}
