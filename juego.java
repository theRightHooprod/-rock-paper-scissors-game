/*
En el juego para dos personas llamado roca, papel y tijeras, cada jugador escoge
ser t,r o p respectivamente. El jugador se determina así por medio de la función:
roca rompe tijeras, las tijeras cortan el papel, el papel cubre la roca, el juego
es un empate si ambos jugadores eligen la misma opción. Elaborar un programa para
que determine cuál jugador ganará. La salida debe mostrarse por la función de 
la siguiente forma:
t - r -> roca rompe tigeras. Gana el jugador dos.

NOTA:
Hace 3 case principales manjenados por case t, r y t. Dentro de esos case otro
switch donde va a analizar en el primer case la jugada del segundo ganador y
determinar el ganador
 */
package malalala;
import javax.swing.JOptionPane;
public class juego {
    public static void main(String []args){
        char jugador1;
        char jugador2;
        int opc;
        
        jugador1 = JOptionPane.showInputDialog(null,
                "Ingresa jugador1: ").charAt(0);
        jugador2 = JOptionPane.showInputDialog(null, 
                "Ingresa jugador2: ").charAt(0);

        
        if(jugador1 == 'p'|jugador1 == 'r'|jugador1 == 't'){
            switch (jugador1){
                case 'p':
                    switch (jugador2) {
                        case 'r':
                            JOptionPane.showMessageDialog(null,
                                    "p - r --> Papel cubre roca. Gana el jugador1");
                            break;
                        case 't':
                            JOptionPane.showMessageDialog(null,
                                    "p - t --> tijeras rompe papel. Gana el jugador2");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Empate");
                            break;
                        }
                    break;
                case 'r':
                    switch (jugador2) {
                        case 't':
                            JOptionPane.showMessageDialog(null,
                                    "r - t --> Roca rompe tijeras. Gana el jugador1");
                            break;
                        case 'p':
                            JOptionPane.showMessageDialog(null,
                                    "r - p --> papel cubre roca. Gana el jugador2");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Empate");
                            break;
                    }
                    break;
                case 't':
                    switch (jugador2) {
                        case 'p':
                            JOptionPane.showMessageDialog(null,
                                    "t - p --> Tijeras cortan papel. Gana el jugador1");
                            break;
                        case 'r':
                            JOptionPane.showMessageDialog(null,
                                    "t - r --> roca rompe tijeras. Gana el jugador2");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Empate");
                            break;
                    }
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingresa un caracter valido");
        }            
           
    }
}
