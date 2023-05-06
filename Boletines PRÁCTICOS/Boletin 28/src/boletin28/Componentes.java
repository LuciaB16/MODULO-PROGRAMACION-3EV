/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin28;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Componentes {
    
    JFrame marco;
    JPanel panel;
    JButton bPremer, bLimpar;
    JTextField lNome, lPassword;
    JLabel etiqNome, etiqPassword;
    JTextArea aTexto;
    
    
    public void iniciarComponentes(){
        //definir componentes
        marco= new JFrame();
        panel = new JPanel();
        bPremer = new JButton("PREMER ");
        bLimpar = new JButton("LIMPAR ");
        lNome = new JTextField();
        lPassword = new JPasswordField();
        etiqNome= new JLabel("NOME ");
        etiqPassword = new JLabel("PASSWORD ");
        aTexto = new JTextArea(" Area de Texto . ");
        
        
        
        //le damos caracteristicas
        marco.setBounds(0, 0, 700, 600);
        panel.setBounds(5, 5, 650, 550);
        bPremer.setBounds(150, 450, 150, 50);
        bLimpar.setBounds(400, 450, 150, 50);
        lNome.setBounds(300, 50, 250, 50);
        lPassword.setBounds(300,150, 250, 60);
        etiqNome.setBounds(120, 50, 100, 50);
        etiqPassword.setBounds(110, 150, 100, 50);
        aTexto.setBounds(100, 250, 400, 100);
       
        
        
        //añadimos los componentes al panel
        panel.setLayout(null);
        panel.add(bPremer);
        panel.add(bLimpar);
        panel.add(lNome);
        panel.add(lPassword);
        panel.add(etiqNome);
        panel.add(etiqPassword);
        panel.add(aTexto);
        
        
        //añadimos el panel al marco
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }
    
}
