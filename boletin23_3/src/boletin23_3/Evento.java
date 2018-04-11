/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23_3;

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
public class Evento implements ActionListener
{
   JFrame marco;
   JPanel panel;
   JLabel etiqueta;
   JButton boton1;
   JButton boton2;
   
    public Evento(){
       marco=new JFrame("venta de eventos");
       panel=new JPanel();
       boton1=new JButton("saudo");
       boton2=new JButton("despedida");
       etiqueta=new JLabel("");
       etiqueta.setVisible(false);
       
       
       marco.setSize(400,200);
       panel.add(boton1);
       panel.add(boton2);
       panel.add(etiqueta);
       marco.add(panel);
       boton1.addActionListener(this);
       boton2.addActionListener(this);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object boton=e.getSource();
        if (boton==boton1){
        if(etiqueta.isVisible()==false){ // se a etiqueta esta visible a quita e se non esta visible a pon visible 
      etiqueta.setVisible(true);
      etiqueta.setText("un saudo a DAM");
        }
        else{
            if (etiqueta.getText()=="un saudo a DAM")
                etiqueta.setVisible(false);
            else
                etiqueta.setText("un saudo a DAM");
        }
            
    }
        else {
        if(etiqueta.isVisible()==false){ // se a etiqueta esta visible a quita e se non esta visible a pon visible 
      etiqueta.setVisible(true);
      etiqueta.setText("despedida");
        }
        else{
            if(etiqueta.getText()=="despedida")
              etiqueta.setVisible(false);  
            else
                etiqueta.setText("despedida");
        }
            
    }
            
    }
   
}