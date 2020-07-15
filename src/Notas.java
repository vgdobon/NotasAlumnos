import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Notas {
    private String [] alumnos;
    private int [] notas;


    public Notas(){
        alumnos=readStringsFromFile("nombres.txt");
        notas=readIntsFromFile("notas.txt");

    }


    public String[] readStringsFromFile(String path) {
        try {
            List<String> strings = Files.readAllLines(Paths.get(path));
            return strings.toArray(new String[strings.size()]);
        } catch (IOException e) {
            return null;
        }
    }

    public int[] readIntsFromFile(String path) {
        try {
            int[] ints = Files.lines(Paths.get(path))
                    .mapToInt(Integer::parseInt).toArray();

            return ints;
        } catch (IOException e) {
            return null;
        }
    }

    public boolean aprobados(int i){
        if(notas[i]>4){
            return true;
        }else{
            return false;
        }

    }

    public float media(){
        float sumatorio=0;
        for (int i = 0; i < notas.length; i++) {
            sumatorio+=notas[i];
        }
        return sumatorio/notas.length;
    }

    public int maximo(){
        int maximo=0;
        int indiceMaximo=0;
        for (int i = 0; i <notas.length ; i++) {
            if(notas[i]>maximo){
                maximo=notas[i];
                indiceMaximo=i;
            }
        }
        return indiceMaximo;
    }

    public int minimo(){
        int minimo=20;
        int indiceMinimo=0;

        for (int i = 0; i <notas.length; i++) {
            if(notas[i]<minimo){
                minimo=notas[i];
                indiceMinimo=i;
            }
        }
        return indiceMinimo;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public int[] getNotas() {
        return notas;
    }

}
