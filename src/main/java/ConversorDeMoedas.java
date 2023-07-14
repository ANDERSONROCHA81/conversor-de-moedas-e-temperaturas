import javax.swing.*;

public class ConversorDeMoedas {

    private static Object[] conversoes = {"Real para Dólar", "Real para Euro", "Real para Libra Esterlina",
            "Real para Peso Argentino", "Real para Peso Chileno"};
    private static double cotacaoDolar = 4.79;

    public static void escolheTipoDeMoeda(double valor){
        double resultado;
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha para qual moeda deseja converter", "Moedas",
                JOptionPane.INFORMATION_MESSAGE, null, conversoes, conversoes[0]);

        if (escolha.equals("Real para Dólar")) {
            resultado = valor / cotacaoDolar;
            String mensagem = String.format("Agora voce tem U$ %.2f dolares", resultado);
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
