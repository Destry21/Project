/*
 * Diese Klasse ist die allgemeine Definition für
 * das Fesnter des Spieles
 *
 * Der Pfad der Bilder ist so komisch, weil die Leerzeichen vom
 * Netbeansprojektnamen keine Leerzeichen, sondern neue Ordner
 * kennzeichnen
*/
package how.to.survive.htl.edition;

import javax.swing.*;
import java.awt.event.*;

public class MainWindow {
    
    public JFrame window(String WindowName){
        JFrame window = new JFrame(WindowName);
        
        //definiert die Größe des Fensters
        window.setSize(1280, 720);

        //einfügen des Hintergrundes
        Icon icon1 = new ImageIcon(getClass().getResource("../../../../../pic/bg.png"));
        JLabel bild = new JLabel(icon1);
        window.add(bild);
        
        //positioniert den Frame in der Mitte
        window.setLocationRelativeTo(null);
        
        //zeigt das Fesnter an
        window.setVisible(true);
        
        //nur eine Größe des Fensters
        window.setResizable(false);
        
        //beendet das Programm entgültig
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        System.out.println("Hoch");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("Runter");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("Links");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("Rechts");
                        break;
                }
            }
            public void keyReleased(KeyEvent e) {
                
            }
            public void keyTyped(KeyEvent e) {
                
            }
        });
        
        return window;
    }
}
