/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg019_cleverdon_calc;


import java.awt.event.*;
import static java.lang.Double.parseDouble;
import javax.swing.*;

/**
 *
 * @author compsci
 */

 
class Calculator implements ActionListener
{
    JFrame frame;
    JTextField textField;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsqr,bsqrt,bcube,blog,bsinR,bcosR,bsinD,bcosD;
 
    static double a=0,b=0,result=0;
    static int operator=0;
 
    Calculator()
    {
        frame=new JFrame("Calculator");
        textField=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");
        blog=new JButton("\u33D2");
        bsqr=new JButton("X^2");
        bcube=new JButton("X^3");
        bsqrt=new JButton("\u221A");
        bsinR=new JButton("sin(rad)");
        bcosR=new JButton("cos(rad)");
        bsinD=new JButton("sin(deg)");
        bcosD=new JButton("cos(deg)");
        
        
        
        
        textField.setBounds(40,40,350,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        bsqr.setBounds(320,100,70,40);
        bsinD.setBounds(410,100,120,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        bcube.setBounds(320,170,70,40);
        bsinR.setBounds(410,170,120,40);
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bsqrt.setBounds(320,240,70,40);
        bcosD.setBounds(410,240,120,40);
        
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        blog.setBounds(320,310,70,40);
        bcosR.setBounds(410,310,120,40);
        
        bdel.setBounds(60,380,100,40);
        bclr.setBounds(250,380,100,40);
        
        frame.add(textField);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bsub);
        frame.add(bdec);
        frame.add(b0);
        frame.add(beq);
        frame.add(badd);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(blog);
        frame.add(bsqr);
        frame.add(bsqrt);
        frame.add(bcube);
        frame.add(bsinR);
        frame.add(bsinD);
        frame.add(bcosR);
        frame.add(bcosD);
        
        
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(900,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        blog.addActionListener(this);
        bsqr.addActionListener(this);
        bsqrt.addActionListener(this);
        bcube.addActionListener(this);
        bsinR.addActionListener(this);
        bcosR.addActionListener(this);
        bsinD.addActionListener(this);
        bcosD.addActionListener(this);
        
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            textField.setText(textField.getText().concat("1"));
        
        if(e.getSource()==b2)
            textField.setText(textField.getText().concat("2"));
        
        if(e.getSource()==b3)
            textField.setText(textField.getText().concat("3"));
        
        if(e.getSource()==b4)
            textField.setText(textField.getText().concat("4"));
        
        if(e.getSource()==b5)
            textField.setText(textField.getText().concat("5"));
        
        if(e.getSource()==b6)
            textField.setText(textField.getText().concat("6"));
        
        if(e.getSource()==b7)
            textField.setText(textField.getText().concat("7"));
        
        if(e.getSource()==b8)
            textField.setText(textField.getText().concat("8"));
        
        if(e.getSource()==b9)
            textField.setText(textField.getText().concat("9"));
        
        if(e.getSource()==b0)
            textField.setText(textField.getText().concat("0"));
        
        if(e.getSource()==bdec)
            textField.setText(textField.getText().concat("."));
        
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(textField.getText());
            operator=1;
            textField.setText("");
        } 
        
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(textField.getText());
            operator=2;
            textField.setText("");
        }
        
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(textField.getText());
            operator=3;
            textField.setText("");
        }
        
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(textField.getText());
            operator=4;
            textField.setText("");
        }
        
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(textField.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            textField.setText(""+result);
        }
        
        if(e.getSource()==bclr)
            textField.setText("");
        
        if(e.getSource()==bdel)
        {
            String s=textField.getText();
            textField.setText("");
            for(int i=0;i<s.length()-1;i++)
            textField.setText(textField.getText()+s.charAt(i));
        }
        if(e.getSource()==bsqr){
            String val = textField.getText();
            double total = Math.pow(parseDouble(val), 2.0);
            textField.setText(Double.toString(total));
        }
        if(e.getSource()==bsqrt){
            String val = textField.getText();
            double total = Math.pow(parseDouble(val), 0.5);
            textField.setText(Double.toString(total));
        }
        if(e.getSource()==blog){
            String val = textField.getText();
            double total = Math.log10(parseDouble(val));
            textField.setText(Double.toString(total));
            System.out.println(total);
            System.out.println("double.toString method: "+ Double.toString(total));
        }
        if(e.getSource()==bcube){
            String val = textField.getText();
            double total = Math.pow(parseDouble(val), 3.0);
            textField.setText(Double.toString(total));
        }
        if(e.getSource() == bcosR){
            double val = Math.cos(Double.parseDouble(textField.getText()));
        textField.setText(Double.toString(val));
        }
        if(e.getSource() == bsinR){
         double val = Math.sin(Double.parseDouble(textField.getText()));
        textField.setText(Double.toString(val));
        }
        if(e.getSource() == bcosD){
        double val = Math.cos(Double.parseDouble(textField.getText()));
            double radianConstant = 180/Math.PI;
        val = val/radianConstant;
        textField.setText(Double.toString(val));
        }
        if(e.getSource() == bsinD){
        double val = Math.sin(Double.parseDouble(textField.getText()));
            double radianConstant = 180/Math.PI;
            System.out.println(val);
            System.out.println(radianConstant);
        val = val/radianConstant;
      
        textField.setText(Double.toString(val));
        }
    }
 public static void main(String...s)
    {
        new Calculator();
    }
}

    


