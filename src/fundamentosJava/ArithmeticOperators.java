/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosJava;

/**
 *
 * @author sc
 */
public class ArithmeticOperators {

    public static void main(String args[]) {
        System.out.println("\nSuma:     ");
        int a = 3, b = 2, ans = a + b;
        System.out.println("        a + b = " + ans);

        System.out.println("\nResta:    ");
        ans = a - b;
        System.out.println("        a - b = " + ans);

        System.out.println("\nMultiplicación: ");
        ans = a * b;
        System.out.println("        a * b = " + ans);

        System.out.println("\nDivición:     ");
        double ansDiv = (double) a / b;
        System.out.println("        a / b = " + ansDiv);

        System.out.println("\nMódulo");
        ans = a % b;
        System.out.println("        a % b = " + ans);

        System.out.println("\nValida si es a es Par");
        if (a % 2 == 0) {
            System.out.println(a + " es Par");
        } else {
            System.out.println(a + " es Impar");
        }

        System.out.println("\nIncrementar: ");
        System.out.println("                Suma:   ");
        ans = a += b;
        System.out.println("                        a += b = " + ans);

        System.out.println("                Resta:      ");
        ans = a -= b;
        System.out.println("                        a -= b = " + ans);

        System.out.println("                Multiplicación:      ");
        ans = a *= b;
        System.out.println("                         a *= b = " + ans);

        System.out.println("                Divición:      ");
        ans = a /= b;
        System.out.println("                         a /= b = " + ans);

        System.out.println("                Módulo:      ");
        ans = a %= b;
        System.out.println("                         a %= b = " + ans);

        System.out.println("\nOperadores Unarios:     ");
        int aa = 3;
        int bb = -aa;
        System.out.println("                    Cambio de signo-: ");
        System.out.println("                                        aa =    " + aa);
        System.out.println("                                        bb =   " + bb);

        System.out.println("                    Negacigación!:       ");
        boolean c = true;
        boolean d = !c;
        System.out.println("                                        c = " + c);
        System.out.println("                                        d = " + d);

        System.out.println("                    Pre Incremento++: ");
        int e = 3;
        int f = ++e;
        System.out.println("                                        e = " + e);
        System.out.println("                                        f = " + f);

        System.out.println("                    Pos Incremento++: ");
        e = 3;
        f = e++;
        System.out.println("                                        e = " + e);
        System.out.println("                                        f = " + f);

        System.out.println("                    Pre Decremento--: ");
        e = 3;
        f = --e;
        System.out.println("                                        e = " + e);
        System.out.println("                                        f = " + f);

        System.out.println("                    Pos Decremento--: ");
        e = 3;
        f = e--;
        System.out.println("                                        e = " + e);
        System.out.println("                                        f = " + f);

        System.out.println("\nOperadores: ");

        System.out.println("                Igualdad==: ");
        System.out.println("                                " + a + " == " + b + " ? " + (a == b));

        System.out.println("                Relacionales<>: ");
        System.out.println("                                " + a + " >= " + b + " ? " + (a >= b));
        System.out.println("                                " + a + " <= " + b + " ? " + (a <= b));
        System.out.println("                                " + a + " < " + b + "  ? " + (a < b));
        System.out.println("                                " + a + " > " + b + "  ? " + (a > b));

        System.out.println("                Condicionales|| &&: ");
        System.out.println("                                    a >= 0 && a <= 10 ? " + ((a >= 0) && (a <= 10)));
        System.out.println("                                    a >= 0 || a <= 10 ? " + ((a >= 0) || (a <= 10)));

        System.out.println("                Ternario()?True:False    ");
        System.out.println("                            " + a + " > " + b + " ? " + (a > b));

        System.out.println("\n Precedencia de Operadores:");
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println("                                z = " + z);
        System.out.println("                                y = " + y);
        System.out.println("                                x = " + x);
    }
}
