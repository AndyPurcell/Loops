import javax.swing.JOptionPane;
import java.util.Scanner;

public class calcCarpet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        JOptionPane.showInputDialog("Please enter name:");
        String name = input.nextLine();

        JOptionPane.showInputDialog("Please enter length of Room:");
        int length = input.nextInt();

        JOptionPane.showInputDialog("Please enter breadth of Room:");
        int breadth = input.nextInt();

        JOptionPane.showInputDialog("Please enter cost per square metre of carpet:");
        float cost = input.nextFloat();


        JOptionPane.showMessageDialog(null,"Quotation for" + name + "\nLength of Room:\t\t" +
                        length+ "\nBreadth of room:\t\t" + breadth + "\nCost per square metre:" + cost +
                        "\nCost of carpet\t\t" + ((length * breadth)*cost));

    }
}
