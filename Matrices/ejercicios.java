import java.util.Scanner;

public class Matrices {
    Scanner lt = new Scanner(System.in);

    public void ejercicio6() {
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio7() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= (matriz.length - 1) - f; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio8() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = f; c < matriz[f].length; c++) {
                matriz[f][c] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
    
    public void ejercicio9() {
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz[0].length - 1) - f; c <= matriz[0].length - 1; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio11() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz.length - 1) - f; c >= 0; c--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio12() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[f][c] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio13() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f <= (matriz.length - 1) - c; f++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio20() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = (matriz[0].length - 1); f >= 0; f--) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[c][f] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio22() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz[0].length; c++) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void ejercicio23() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = (matriz[0].length - 1); c >= 0; c--) {
            if (c % 2 == 0) {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void ejercicio24() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = (matriz[0].length - 1); c >= 0; c--) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void ejercicio25() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void ejercicio26() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void ejercicio27() {
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = (matriz.length - 1); f >= 0; f--) {
            if (f % 2 == 0) {
                for (int c = (matriz.length - 1); c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio30() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio31() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio32() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio33() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
            for (int ls = v; ls > (dimension - 1) - v; ls--) {
                matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
                valor++;
            }
            for (int liz = (dimension - 1) - v; liz < v; liz++) {
                matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = (dimension - 1) - v; lin < v; lin++) {
                matriz[v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld > (dimension - 1) - v; ld--) {
                matriz[ld][v] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio34() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
            for (int liz = (dimension - 1) - v; liz < v; liz++) {
                matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = (dimension - 1) - v; lin < v; lin++) {
                matriz[v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld > (dimension - 1) - v; ld--) {
                matriz[ld][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls > (dimension - 1) - v; ls--) {
                matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public void ejercicio36() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
            for (int ld = v; ld > (dimension - 1) - v; ld--) {
                matriz[ld][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls > (dimension - 1) - v; ls--) {
                matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
                valor++;
            }
            for (int liz = (dimension - 1) - v; liz < v; liz++) {
                matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = (dimension - 1) - v; lin < v; lin++) {
                matriz[v][lin] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c] == null) {
                    System.out.print("\t");
                } else {
                    System.out.print(m[f][c] + "\t");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        new Matrices().ejercicio11();

        
}
}