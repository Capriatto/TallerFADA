package logica;

public class SalonDeClase {
    
/** 
 * Declaracion de los atributos privados
 */
    private String correos[][];
    private float calificaciones[][];
    
/** Creacion del constructor
 * @param correos almacena los correos de todos los estudiantes
 * @param calificaciones almacena las calificaciones de todos los estudiantes
 */
    public SalonDeClase(String[][] correos, float[][] calificaciones) {
        this.calificaciones = calificaciones;
        this.correos = correos;

    }

    /** Metodo en el cual concatenara las califiaciones y correos de todos los estudiantes
     * @return devolvera una matriz con la califiacion y correos en la misma pocision de la nueva matriz
     */
    
    public String[][] generarMatriz() {
        String concatenada[][] = new String[calificaciones.length][calificaciones.length];
        for (int i = 0; i < correos.length; i++) {
            for (int j = 0; j < correos.length; j++) {
                concatenada[i][j] = this.correos[i][j] + "-" + this.calificaciones[i][j];
            }
        }
        System.out.println("8) Cree un metodo que genere una matriz que concatene en cada posición el correo y la calificación de cada estudiante. \n ");
        for (int i = 0; i < concatenada.length; i++) {
            for (int j = 0; j < concatenada.length; j++) {
                System.out.print(concatenada[i][j] + "\t \t \t");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        return concatenada;
    }
    
    /** Metodo en el cual comparara los correos de cada estudiante y el estudiante con el correo mas largo se mostrara su califiacion
     * @return la califiacion del estudiante con el correo mas largo
     */
    public float correoMasLargo() {
        float calificacion = 0;
        int longitudMayor = 0;
        int posicionMayor[][] = new int[1][2];

        for (int i = 0; i < this.calificaciones.length; i++) {
            for (int j = 0; j < this.correos.length; j++) {
                int longitud = this.correos[i][j].length();

                if (longitud > longitudMayor) {
                    longitudMayor = longitud;
                    posicionMayor[0][0] = i;
                    posicionMayor[0][1] = j;
                }
            }
        }
        calificacion = this.calificaciones[posicionMayor[0][0]][posicionMayor[0][1]];
        System.out.println("9) Cree un método que permita conocer cual es la calificación del estudiante con correo más largo.");
        System.out.println("\t" + calificacion+"\n");
        return calificacion;
    }
    /** Metodo en el cual comparara el promedio de cada columna y dira cual columna tiene mejor promedio
     * 
     * @return el mayor promedio de la columna
     */
    public int promedioMejorColumna() {
        float promedioMayor = 0;
        float sumaColumna = 0;
        int columna = 0;
        int j;

        for (int i = 0; i < calificaciones.length; i++) {
            for (j = 0; j < calificaciones.length; j++) {
                sumaColumna += calificaciones[j][i];
            }
            float promedio = sumaColumna / calificaciones[0].length;
            if (promedio > promedioMayor) {
                promedioMayor = promedio;
                columna = (i + 1);
            }
            sumaColumna = 0;
        }
        System.out.println("10) Diga cual columna tiene el mejor promedio de calificaciones.");
        System.out.println("\t" + columna+"\n");
        return columna;
    }
    
    /** Metodo en el cual mostrara el correo del estudiante con mejor calificacion en la fila central
     * 
     * @return el correo del estudiante con mejor nota 
     */
    public String mejorEstudianteFilaCentral() {
        float notaMayor= 0;
        int posicionMejorNota=0;
        int filaCentral = (calificaciones.length/2);
        for (int i = 0; i < calificaciones[0].length; i++) {
            if (calificaciones [filaCentral][i]> notaMayor ) {
                notaMayor = calificaciones [filaCentral][i];
                posicionMejorNota = i;
            }
        }
        System.out.println("11) Diga cual es el correo del estudiante con mejor nota de la fila central.");
        System.out.println("\t"+correos[filaCentral][posicionMejorNota]);
        return correos[filaCentral][posicionMejorNota];
    }

}
