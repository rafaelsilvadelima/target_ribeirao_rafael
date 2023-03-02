package exercicios;

public class ExercicioTres {
    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ___ A lógica é adicionar 2 a cada elemento
        int a = 7;
        int nextA = a + 2;
        System.out.println(nextA);
        // b) 2, 4, 8, 16, 32, 64, ____ A lógica é multiplicar por 2 a cada elemento
        int b = 64;
        int nextB = b * 2;
        System.out.println(nextB);
        //c) 0, 1, 4, 9, 16, 25, 36, ____ A lógica é adicionar 1 ao quadrado a cada elemento
        int c = 36;
        int nextC = c + (2 * (int)Math.sqrt(c)) + 1;
        System.out.println(nextC);
        //d) 4, 16, 36, 64, ____ A lógica correta é que os elementos correspondem aos quadrados dos números pares, começando em 2
        int d = 64;
        int nextD = (int) Math.pow(Math.sqrt(d) + 2, 2);
        System.out.println(nextD);
        //e) 1, 1, 2, 3, 5, 8, ____ A lógica é adicionar os dois números anteriores a cada elemento.
        int e1 = 5;
        int e2 = 8;
        int nextE = e1 + e2;
        System.out.println(nextE);
        //f) 2,10, 12, 16, 17, 18, 19, ____ Não consegui fazer sem consultar, então deixarei em branco
        // :(
    }
}
