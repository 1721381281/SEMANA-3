//Programación O.O

// Clase que representa la información del clima en un día
class DiaClima {
    // Atributos encapsulados
    private String dia;
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private String estadoDelTiempo; // ej: soleado, nublado, lluvioso

    // Constructor
    public DiaClima(String dia) {
        this.dia = dia;
    }

    // Métodos para ingresar datos
    public void ingresarDatos(Scanner scanner) {
        System.out.print("Ingrese la temperatura máxima para " + dia + ": ");
        this.temperaturaMaxima = scanner.nextDouble();

        System.out.print("Ingrese la temperatura mínima para " + dia + ": ");
        this.temperaturaMinima = scanner.nextDouble();
        scanner.nextLine(); // Consumir línea pendiente

        System.out.print("Ingrese el estado del tiempo para " + dia + " (ej: soleado, nublado, lluvioso): ");
        this.estadoDelTiempo = scanner.nextLine();
    }

    // Métodos para obtener datos
    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public String getDia() {
        return dia;
    }

    // Método para mostrar la información del día
    public void mostrarInfo() {
        System.out.println("Día: " + dia);
        System.out.println("Temperatura Máxima: " + temperaturaMaxima);
        System.out.println("Temperatura Mínima: " + temperaturaMinima);
        System.out.println("Estado del tiempo: " + estadoDelTiempo);
        System.out.println("--------------------------");
    }
}

// Clase que gestiona la semana y calcula promedios
class ClimaSemana {
    private List<DiaClima> dias;

    public ClimaSemana() {
        dias = new ArrayList<>();
    }

    // Añadir días a la lista
    public void agregarDia(DiaClima dia) {
        dias.add(dia);
    }

    // Calcular promedio de temperaturas máximas
    public double promedioTemperaturaMaxima() {
        double suma = 0;
        for (DiaClima dia : dias) {
            suma += dia.getTemperaturaMaxima();
        }
        return suma / dias.size();
    }

    // Calcular promedio de temperaturas mínimas
    public double promedioTemperaturaMinima() {
        double suma = 0;
        for (DiaClima dia : dias) {
            suma += dia.getTemperaturaMinima();
        }
        return suma / dias.size();
    }

    // Mostrar toda la información
    public void mostrarSemana() {
        for (DiaClima dia : dias) {
            dia.mostrarInfo();
        }
        System.out.println("Promedio de temperatura máxima de la semana: " + promedioTemperaturaMaxima());
        System.out.println("Promedio de temperatura mínima de la semana: " + promedioTemperaturaMinima());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClimaSemana semana = new ClimaSemana();

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Ingresar datos para cada día
        for (String dia : diasSemana) {
            DiaClima diaClima = new DiaClima(dia);
            diaClima.ingresarDatos(scanner);
            semana.agregarDia(diaClima);
        }

        // Mostrar información semanal y promedios
        System.out.println("\Resumen de la semana:");
        semana.mostrarSemana();

        scanner.close();
    }
}


