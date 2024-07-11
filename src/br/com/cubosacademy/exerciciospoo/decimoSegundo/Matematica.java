package br.com.cubosacademy.exerciciospoo.decimoSegundo;

public class Matematica {
    public static double fatorial (double num) {
        double res = 0;
        double aux = 1;

        for (int i = 1; i < num; i++) {
            res = aux * (i + 1);
            aux = res;
        }
        return res;
    }

    public static double potencia (double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static double raizQuadrada (double num) {
        return Math.sqrt(num);
    }
}
