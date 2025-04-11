import com.app.herencia.Cliente;
import com.app.herencia.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Smith", "Milla", 23);
        Persona persona2 = new Persona("Edgar", "Ramirez", 29);


        System.out.println(persona1);
        System.out.println(persona2);

        Cliente cliente1 = new Cliente(
                "Shirley",
                "Gonzales",
                24,
                LocalDate.of(2001,5,6));

        Cliente cliente2 = new Cliente(
                "Adriano",
                "Santivañez",
                35,
                LocalDate.of(1990, 8,24)
        );

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
