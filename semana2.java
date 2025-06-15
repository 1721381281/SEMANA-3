//Abstraccion
//Ejemplo 1

interface Vehiculo {
    void conducir();
}

class Coche implements Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo un coche");
    }
}

//Encapsulacion
//Ejemplo 2

class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
}

//Herencia
//Ejemplo 3

class Animal {
    void comer() {
        System.out.println("El animal está comiendo");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

//Polimorfismo
//Ejemplo 4

class Animal {
    void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("Miau");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("Guau");
    }
}

public class TestPolimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Gato();
        Animal animal2 = new Perro();

        animal1.hacerSonido(); // Miau
        animal2.hacerSonido(); // Guau
    }
}

