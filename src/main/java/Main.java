import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Object[] opcoes = {"Conversor de Moedas", "Conversor de Temperaturas"};
        String entrada;
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de conversor", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        if (escolha.equals("Conversor de Moedas")){
            entrada = JOptionPane.showInputDialog(null, "Insira um valor", "Input",
                    JOptionPane.QUESTION_MESSAGE);
            validaEntrada(entrada);
        }
    }

    public static void validaEntrada(String entrada){
        double valor;
        if (entrada.matches("[0-9]*")){
            valor = Double.parseDouble(entrada);

        }else {
            JOptionPane.showMessageDialog(null, "A entrada deve ser apenas números");
        }
    }
}
