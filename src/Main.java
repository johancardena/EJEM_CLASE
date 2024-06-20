import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        String primerNumero= JOptionPane.showInputDialog("INTRODUCE UN NUMERO");
        String segundoNumero= JOptionPane.showInputDialog("INTRODUCE UN segundo NUMERO");

        int numero1= Integer.parseInt(primerNumero);
        int numero2= Integer.parseInt(segundoNumero);
        int resultado= numero1*numero2;



        JOptionPane.showMessageDialog(null, "El resultado de la aplicacion es: "+resultado);




        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}