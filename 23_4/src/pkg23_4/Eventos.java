/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jdominguezmartinan
 */
public class Eventos implements ActionListener
{
    JFrame marco;
   JPanel panel;
   JButton boton;
   
    public Eventos(){
       marco=new JFrame("Primeira ventá");
       panel=new JPanel();
       boton=new JButton("ventá 1");

       marco.setSize(400,200);
       panel.add(boton);
       marco.add(panel);
       boton.addActionListener(this);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        marco.dispose();
       Eventos2 evento=new Eventos2();
       
      
    }

    
}
