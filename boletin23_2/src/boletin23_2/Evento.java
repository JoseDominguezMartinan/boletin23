/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jdominguezmartinan
 */
public class Evento implements ActionListener
{
     JFrame marco;
     JPanel panel;
    JButton programacion;
    JButton bases;
     public Evento(){
       marco=new JFrame("Curso DAM");
       panel=new JPanel();
       programacion=new JButton("Programación");
       bases=new JButton("Bases");
     
       
       marco.setSize(400,200);
       panel.add(programacion);
       panel.add(bases);
       marco.add(panel);
       
       programacion.addActionListener(this);
       bases.addActionListener(this);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object boton=e.getSource();
        if(boton==programacion){
        marco.setTitle("Programacion");
         
        }
        else 
           marco.setTitle("bases");
    }
    
}
