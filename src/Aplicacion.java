
import javax.swing.text.html.HTML;
import logica.SalonDeClase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     * Se comprueba cada metodo de la clase SalonDeClase
     */
    public static void main(String[] args) {

        String[][] correos = {
            {"correo1@hotmail.com", "correo2@hotmail.com", "correo44@hotmail.com", "correo6@hotmail.com", "correo11@hotmail.com"},
            {"correo2@hotmail.com", "correo7@hotmail.com", "correo24@hotmail.com", "correo8@hotmail.com", "correo69@hotmail.com"},
            {"correo3@hotmail.com", "correo8@hotmail.com", "correo4655@hotmail.com", "correo3@hotmail.com", "correo91@hotmail.com" },
            {"correo4@hotmail.com", "correo9@hotmail.com", "correo41@hotmail.com", "correo6@hotmail.com", "correo17@hotmail.com"},
            {"correo0@hotmail.com", "correo6@hotmail.com", "correo68@hotmail.com", "correo5@hotmail.com", "correo8@hotmail.com"}};

        float[][] calificaciones = {
            {3.1f, 1.5f, 3.5f, 2.8f, 3.4f},
            {4.2f, 3.1f, 3.0f, 4.3f, 2.6f},
            {4.6f, 5.0f, 4.2f, 2.9f, 4f},
            {1.9f, 2.4f, 3.4f, 3.6f, 3.8f},
            {2.8f, 3.1f, 4.2f, 2.4f, 3.0f}};

        SalonDeClase sc = new SalonDeClase(correos, calificaciones);
        sc.generarMatriz();
        sc.correoMasLargo();
        sc.promedioMejorColumna();
        sc.mejorEstudianteFilaCentral();
    }
}
