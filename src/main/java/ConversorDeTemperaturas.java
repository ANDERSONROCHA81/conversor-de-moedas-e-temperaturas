import javax.swing.*;

public class ConversorDeTemperaturas {

    private static Object[] conversoes = {"Celsius para Fahrenheit", "Celsius para Kelvin", "Fahrenheit para Celsius",
            "Fahrenheit para Kelvin", "Kelvin para Celsius", "Kelvin para Fahrenheit"};

    public static void escolheTipoDeTemperatura(double temperatura){
        double resultado;
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha para qual temperatura deseja converter", "Temperaturas",
                JOptionPane.INFORMATION_MESSAGE, null, conversoes, conversoes[0]);

        switch (escolha) {
            case "Celsius para Fahrenheit" -> {
                resultado = temperatura * 1.8 + 32;
                String mensagem = String.format("%.2f°C equivalem a %.2f°F", temperatura, resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Celsius para Kelvin" -> {
                resultado = temperatura + 273.15;
                String mensagem = String.format("%.2f°C equivalem a %.2fK", temperatura, resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Fahrenheit para Celsius" -> {
                resultado = (temperatura - 32) / 1.8 ;
                String mensagem = String.format("%.2f°F equivalem a %.2f°C", temperatura, resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Fahrenheit para Kelvin" -> {
                resultado = (temperatura - 32) * 5 / 9 + 273.15 ;
                String mensagem = String.format("%.2f°F equivalem a %.2fK", temperatura, resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Kelvin para Celsius" -> {
                resultado = temperatura - 273.15;
                String mensagem = String.format("%.2fK equivalem a %.2f°C", temperatura, resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
            case "Kelvin para Fahrenheit" -> {
                resultado = (temperatura - 273.15) * 9 / 5 + 32;
                String mensagem = String.format("%.2fK equivalem a %.2f°F", temperatura, resultado);
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }
    }
}
