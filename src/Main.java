import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de días de la semana
        List<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        // Insertar Juernes en la posición 4
        diasSemana.add(4, "Juernes");
        System.out.println("Elemento Juernes insertado en la posición 4.");

        // Mostrar las posiciones 3 y 4
        System.out.println("Elemento en la posición 3: " + diasSemana.get(3));
        System.out.println("Elemento en la posición 4: " + diasSemana.get(4));

        // Mostrar primer y último elemento
        System.out.println("Primer elemento de la lista: " + diasSemana.get(0));
        System.out.println("Último elemento de la lista: " + diasSemana.get(diasSemana.size() - 1));

        // Eliminar Juernes de la lista y comprobar
        diasSemana.remove("Juernes");
        boolean eliminado =! diasSemana.contains("Juernes");
        if (eliminado == true){
            System.out.println("Elemento Juernes eliminado: " + eliminado);
        }

        // Crear e iterar con un iterador
        Iterator<String> iterador = diasSemana.iterator();
        System.out.println("Iterando sobre la lista:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Buscar "Lunes" en la lista
        boolean contieneLunes = diasSemana.contains("Lunes");
        System.out.println("¿La lista contiene Lunes?: " + contieneLunes);

        // Buscar "Lunes" en la lista
        contieneLunes = false;
        for (String dia : diasSemana) {
            if (dia.equalsIgnoreCase("Lunes")) {
                contieneLunes = true;
                break;
            }
        }
        System.out.println("¿La lista contiene Lunes (sin importar mayúsculas/minúsculas)? " + contieneLunes);

        // Borrar todos los elementos de la lista
        diasSemana.clear();
        System.out.println("Todos los elementos han sido borrados de la lista.");
    }
}
