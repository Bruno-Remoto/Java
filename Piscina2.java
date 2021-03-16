/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piscina2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Piscina2 extends JFrame implements ActionListener{

    JLabel lbllargura, lblprofundidade, lblcomprimento, lblvalor; 
    JTextField txtlargura, txtprofundidade, txtcomprimento, txtvalor;
    JButton btncalcular, btnlimpar, btnsair;

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame aba = new Piscina2();
        aba.setUndecorated(true);
        aba.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        aba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aba.setVisible(true);
    }
    Piscina2()
    {
        setTitle("Exercício Área Piscina");
        setBounds(250, 90, 350,90);
        getContentPane().setBackground(new Color(176,224,230));
        getContentPane().setLayout(new GridLayout(5,2));
        
        lbllargura = new JLabel("Largura");
        lbllargura.setForeground(Color.black);
        lbllargura.setFont(new Font("",Font.BOLD,12));
        
        lblprofundidade = new JLabel("Profundidade");
        lblprofundidade.setForeground(Color.black);
        lblprofundidade.setFont(new Font("",Font.BOLD,12));

        lblcomprimento = new JLabel("Comprimento");
        lblcomprimento.setForeground(Color.black);
        lblcomprimento.setFont(new Font("",Font.BOLD,12));

        lblvalor = new JLabel("Valor Total");
        lblvalor.setForeground(Color.black);
        lblvalor.setFont(new Font("",Font.BOLD,12));

        btncalcular = new JButton("Calcular");
        btncalcular.addActionListener(this);

        btnlimpar = new JButton("Limpar");
        btnlimpar.addActionListener(this);

        btnsair = new JButton("Sair");
        btnsair.addActionListener(this);

        txtlargura = new JTextField();
        txtprofundidade = new JTextField();
        txtcomprimento = new JTextField();
        txtvalor = new JTextField();
        txtvalor.setEditable(false);

        getContentPane().add(lbllargura);               
        getContentPane().add(txtlargura);

        getContentPane().add(lblprofundidade);          
        getContentPane().add(txtprofundidade);

        getContentPane().add(lblcomprimento);           
        getContentPane().add(txtcomprimento);

        getContentPane().add(lblvalor);                 
        getContentPane().add(txtvalor);

        getContentPane().add(btncalcular);              
        getContentPane().add(btnlimpar);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnlimpar)
        {
            txtlargura.setText("");
            txtprofundidade.setText("");
            txtcomprimento.setText("");
            txtvalor.setText("");
            return;
        }
        double largura=0,profundidade=0,comprimento=0,area=0;
        try
        {
            largura = Double.parseDouble(txtlargura.getText());
            profundidade = Double.parseDouble(txtprofundidade.getText());
            comprimento = Double.parseDouble(txtcomprimento.getText());
        }
        catch(NumberFormatException error)
        {
            txtvalor.setText("Apenas Numerais");
            return;
        }
        
        if(e.getSource() == btncalcular)
        {
            area = (largura*profundidade*comprimento)*30;
            txtvalor.setText("" + area);
        }
    }
}