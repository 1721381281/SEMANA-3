//Programacion Tradiconal

public class PromedioTemperaturas {

    public static void main(String[] args) {
        System.out.println("--- Calculadora de Promedio del Clima (Java) ---");
        List<Double> temperaturasSemanal = ingresarTemperaturasDiarias();
        double promedio = calcularPromedioSemanal(temperaturasSemanal);
        System.out.printf("\n----------------------------------------------------%n");
        System.out.printf("El promedio semanal de la temperatura es: %.2f°C%n", promedio);
        System.out.printf("----------------------------------------------------%n");
    }

    public static List<Double> ingresarTemperaturasDiarias() {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        for (String dia : dias) {
            while (true) {
                System.out.print("Ingrese la temperatura para el " + dia + ": ");
                String input = scanner.nextLine();
                try {
                    double temp = Double.parseDouble(input);
                    temperaturas.add(temp);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número válido.");
                }
            }
        }
        return temperaturas;
    }

    public static double calcularPromedioSemanal(List<Double> temperaturas) {
        if (temperaturas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        return suma / temperaturas.size();
    }
}

