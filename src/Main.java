//08. notas [PENDIENTE]
//A partir de 2 ficheros, uno de nombres y otro de notas, escribir un programa que nos permita mostrar:
//- nómbres/notas de los alumnos aprobados
//- nota media del curso
//- nota mínima/nota máxima junto con el nombre del alumno

public class Main {
    public static void main(String[] args) {

        Notas notas=new Notas();

        for (int i = 0; i < notas.getAlumnos().length; i++) {
            if(notas.aprobados(i)){
                System.out.println("El alumno "+notas.getAlumnos()[i]+" ha aprobado con un "+notas.getNotas()[i]);
            }
        }


        System.out.println("La media de los "+notas.getNotas().length+" es "+notas.media());

        System.out.println("La maxima nota es de "+notas.getAlumnos()[notas.maximo()]+" con un "+notas.getNotas()[notas.maximo()]);

        System.out.println("La minima nota es de "+notas.getAlumnos()[notas.minimo()]+" con un "+notas.getNotas()[notas.minimo()]);

    }
}
