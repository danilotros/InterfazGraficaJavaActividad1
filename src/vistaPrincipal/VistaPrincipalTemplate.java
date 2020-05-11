
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * Author Daniel Garcia Perea
*/
public class VistaPrincipalTemplate extends JFrame {
    private JButton btnLog;
    private JTextField userLog;
    private JTextField passLog;
    private JLabel luser;
    private JLabel lpass;
public VistaPrincipalTemplate(){
    setTitle("Discord Login");
    this.mensaje("Daniel");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    setSize(1400,1200);
    setLocationRelativeTo(this);
    getContentPane().setBackground(Color.red);
    setVisible(true);
}
public void mensaje(String nombre){
    System.out.println("Hola Bienvenido a Discord "+nombre);
}
}