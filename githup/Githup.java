/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githup;

/**
 *
 * @author lromerofajar
 */
public class Githup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // error y prueba
        Scanner sc= new Scanner (System.in);
        System.out.println("Teclea un radio: ");
        float radio =sc.nextFloat();
        System.out.println("longitud = "+ (2*Math.PI*radio));   
    }
    
}
