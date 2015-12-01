/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedroabarcaiiproyecto.bo;

import java.util.LinkedList;
import pedroabarcaiiproyecto.entidades.Cuadro;
import pedroabarcaiiproyecto.entidades.Palabra;

/**
 *
 * @author Pedro
 */
public class CuadroBO {

    Cuadro[][] crucigrama;
    LinkedList<Palabra> palabras = new LinkedList<>();

    public CuadroBO() {
        crucigrama = new Cuadro[13][13];
        for (int i = 0; i < crucigrama.length; i++) {
            for (int j = 0; j < crucigrama[i].length; j++) {
                crucigrama[i][j] = new Cuadro();
            }
        }

        addPalabras();
        AllChoques();

    }

    //Palabras que se van a utilizar 
    private void addPalabras() {

        palabras.add(new Palabra("Futbol"));
        palabras.add(new Palabra("Basket"));
        palabras.add(new Palabra("NFL"));
        palabras.add(new Palabra("Beisbol"));

    }

    //Encontrar todos los choques de palabras
    public void AllChoques() {
        int size = palabras.size();

        //System.out.println(size);
        for (int i = 0; i < size; i++) {

            String zA = (palabras.get(i).getPalabra());

            for (int j = 0; j < size; j++) {

                String zC = (palabras.get(j).getPalabra());
                if (zA.equals(zC)) {

                } else {
                    int Choques = Choques(zA, zC);
                    System.out.println(zA + " / " + zC + " - Cant Choques :" + Choques);
                }
            }
            //colocar(zA, i + 1, i + 1, i + 1, "H");
        }
    }
   
    public int lista_choques[][] ;
    
    //Compara los choques entre 2 palabras especificas
    public int Choques(String a, String b) {

        int cont_a = 0;
        int cont_choques = 0;
        while (cont_a != a.length()) {
            int cont_b = 0;
            while (cont_b != b.length()) {
                char xA = a.charAt(cont_a);
                char xB = b.charAt(cont_b);
                // System.out.println("(" + cont_a +","+ cont_b+")" );
                if (xA == xB) {
                    System.out.println(a + " / " + b + " (" + cont_a + "," + cont_b + ")" + "(" + xA + "," + xB + ")");
                
                    cont_choques += 1;
                }
                cont_b++;
            }
            cont_a++;

        }
        return cont_choques;
    }

    //Coloca una palabra en la matriz principal
    public Cuadro[][] colocar(String word, int pY, int pX, int pista, String dir) {
        int lengthTotal = word.length() + pX;
        if (lengthTotal <= 13) {

            int wordC = 0;
            while (wordC != word.length()) {
                Cuadro c = new Cuadro(pista, "", false);
                if (dir.equals("H")) {
                    this.crucigrama[pY][pX + wordC] = c;
                } else {
                    this.crucigrama[pY + wordC][pX] = c;
                }
                wordC++;
            }
            // System.out.println(word + " : Horizontal Colocado");

        } else {
            //  System.out.println(word + " : Horizontal Sobrepasa Matriz");
            return null;
        }
        return this.crucigrama;
    }

    public Cuadro[][] getCrucigrama() {
        return crucigrama;
    }

    public void setCrucigrama(Cuadro[][] crucigrama) {
        this.crucigrama = crucigrama;
    }

}
