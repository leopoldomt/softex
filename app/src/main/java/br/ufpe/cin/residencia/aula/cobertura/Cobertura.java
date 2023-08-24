package br.ufpe.cin.residencia.aula.cobertura;

public class Cobertura {
    //foo(0,2) == 0
    //foo(4,2) == 2
    //foo(0,2) == 0
    //foo(4,0) == 0
    public int foo(int a, int b) {
        boolean cond = false;
        if (a != 0 || b == 0) {
            int c = 1;
            if (cond) {
                System.out.println("nunca executa aqui");
            }
            if (b != 0) {
                c = a / b;
            }
            return c;
        }
        else {
            return 0;
        }
    }

    public int f(int i, boolean c1, boolean c2, boolean c3) {
        int x = i;
        int y = 0;
        if (c1) x++;
        if (c2) x--;
        if (c3) y = x;
        return y;
    }

    public int m(int i) {
        while (i<10) {
            if (i == 100) {
                i = i + 1;
                i *= 2;
            }
            ++i;
        }
        return i;
    }

    public int fun(boolean a) {
        int x = 0;
        if (a) x = 1;
        return 100/x;
    }

}
