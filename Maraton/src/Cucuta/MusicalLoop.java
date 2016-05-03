package Cucuta;

import java.io.*;

public class MusicalLoop {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine()), picos = 0, a, b;
            String linea;
            String[] array;
            int sube = 0, baja = 0;
            boolean sube_inicio = false;
            while (N != 0) {
                linea = br.readLine();

                array = linea.split(" ");
                for (int i = 1; i < array.length; i++) {
                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[i - 1])) {
                        if (i == 1) {
                            sube_inicio = false;
                        }
                        baja++;
                        sube = 0;
                        if (baja == 1) {
                            picos++;
                        }
                    } else {
                        if (i == 1) {
                            sube_inicio = true;
                        }
                        sube++;
                        baja = 0;
                        if (sube == 1) {
                            picos++;
                        }
                    }
                }
                a = Integer.parseInt(linea.split(" ")[0]);
                b = Integer.parseInt(linea.split(" ")[array.length - 1]);

                if((b > a && !sube_inicio) || (b > a && sube_inicio)|| (a > b && sube_inicio) || (a > b && !sube_inicio)|| (a == b)){
                    picos+=0;
                }else{
                    picos++;
                }
                System.out.println(picos);
                picos = 0;
                sube = 0;
                baja = 0;
                N = Integer.parseInt(br.readLine());
            }
        } catch (Exception ex) {

        }
    }

}
