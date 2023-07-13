import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Object[] opcoes = {"Conversor de Moedas", "Conversor de Temperaturas"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversor", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        JOptionPane.showMessageDialog(null, escolha);
    }
}
