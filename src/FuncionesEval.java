public class FuncionesEval {

    /**
     * Método que calcula cuando un numero es un número perfecto.
     * Un número es un número perfecto cuando la suma e sus divisores
     * salvo él mismo da como resultado el propio número. Por ejemplo,
     * los divisores del 6 son 1,2,3 y 6, si sumamos todos los números salvo el 6
     * 1+2+3= 6 que es el propio número. Los primeros números perfectos son
     * el 6, el 28 y 8128
     * @param num el número a comprobar
     * @return true en caso de ser un número perfecto y false en caso contrario
     * @throws ArithmeticException se lanza cuando el número pasado es un numero negativo o cero
     */


        public static boolean esPerfecto(int num) {
            if (num <= 0) {
                throw new ArithmeticException("Debe introducir un número natural");
            }
            long suma = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma = suma + i;
                }
            }
            return suma == num;
        }

        public static String getTipoClima(double temperatura) {
            // Ajustado para coincidir con tus tests
            if (temperatura < 10) {
                return "Frio";
            } else if (temperatura <= 20) {
                return "Templado";
            } else {
                return "Caluroso";
            }
        }

        public static int contarApariciones(int[] numeros, int valor) {
            if (numeros == null) return 0;
            int contador = 0;
            for (int n : numeros) {
                if (n == valor) contador++;
            }
            return contador;
        }

        public static int[] invertirArray(int[] array) {
            if (array == null) return null;
            int inicio = 0;
            int fin = array.length - 1;
            while (inicio < fin) {
                int temp = array[inicio];
                array[inicio] = array[fin];
                array[fin] = temp;
                inicio++;
                fin--;
            }
            return array;
        }

        public static int encontrarMayor(int[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array inválido");
            }
            int mayor = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > mayor) mayor = array[i];
            }
            return mayor;
        }
    }


