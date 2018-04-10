/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jdominguezmartinan
 */
public class Evento implements ActionListener
{
   JFrame marco;
   JPanel panel;
   JLabel etiqueta;
   JButton boton;
   
    public Evento(){
       marco=new JFrame("venta de eventos");
       panel=new JPanel();
       boton=new JButton("premer");
       etiqueta=new JLabel("premeches o boton");
       etiqueta.setVisible(false);
       
       marco.setSize(400,200);
       panel.add(boton);
       panel.add(etiqueta);
       marco.add(panel);
       boton.addActionListener(this);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(etiqueta.isVisible()==false) // se a etiqueta esta visible a quita e se non esta visible a pon visible 
      etiqueta.setVisible(true);
        else
            etiqueta.setVisible(false);
    }

   
}
