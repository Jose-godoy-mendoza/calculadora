/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Archivo;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author joseg
 */
public class Frm_calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Frm_calculadora
     */
    float numero1=0;
    float numero2=0;
    float resultado=0;
    String operacion;
    Archivo archivo;
    public Frm_calculadora() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_uno = new javax.swing.JButton();
        btn_siete = new javax.swing.JButton();
        btn_cuatro = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        btn_dos = new javax.swing.JButton();
        btn_cinco = new javax.swing.JButton();
        btn_ocho = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_tres = new javax.swing.JButton();
        btn_seis = new javax.swing.JButton();
        btn_nueve = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        bnt_resta = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        registro = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opc_opciones = new javax.swing.JMenu();
        item_nuevo = new javax.swing.JMenuItem();
        item_historial = new javax.swing.JMenuItem();
        opc_ayuda = new javax.swing.JMenu();
        item_ayuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btn_uno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_uno.setText("1");
        btn_uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unoActionPerformed(evt);
            }
        });

        btn_siete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_siete.setText("7");
        btn_siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sieteActionPerformed(evt);
            }
        });

        btn_cuatro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_cuatro.setText("4");
        btn_cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuatroActionPerformed(evt);
            }
        });

        btn_cero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_cero.setText("0");
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });

        btn_dos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_dos.setText("2");
        btn_dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosActionPerformed(evt);
            }
        });

        btn_cinco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_cinco.setText("5");
        btn_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cincoActionPerformed(evt);
            }
        });

        btn_ocho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_ocho.setText("8");
        btn_ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ochoActionPerformed(evt);
            }
        });

        btn_punto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_tres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_tres.setText("3");
        btn_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tresActionPerformed(evt);
            }
        });

        btn_seis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_seis.setText("6");
        btn_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seisActionPerformed(evt);
            }
        });

        btn_nueve.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_nueve.setText("9");
        btn_nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueveActionPerformed(evt);
            }
        });

        btn_igual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_suma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        bnt_resta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bnt_resta.setText("-");
        bnt_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_restaActionPerformed(evt);
            }
        });

        btn_multiplicar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_multiplicar.setText("*");
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });

        btn_division.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_division.setText("/");
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_limpiar.setText("C");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        pantalla.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pantallaKeyReleased(evt);
            }
        });

        registro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pantalla)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bnt_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_division, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        opc_opciones.setText("Opciones");

        item_nuevo.setText("Nuevo");
        item_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_nuevoActionPerformed(evt);
            }
        });
        opc_opciones.add(item_nuevo);

        item_historial.setText("Historial");
        item_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_historialActionPerformed(evt);
            }
        });
        opc_opciones.add(item_historial);

        jMenuBar1.add(opc_opciones);

        opc_ayuda.setText("Ayuda");

        item_ayuda.setText("Ayuda");
        item_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ayudaActionPerformed(evt);
            }
        });
        opc_ayuda.add(item_ayuda);

        jMenuBar1.add(opc_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
        // TODO add your handling code here:
        int cero=0;
        //Toolkit.getDefaultToolkit().beep(); 
        pantalla.setText(pantalla.getText()+String.valueOf(cero));
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        numero1=0;
        numero2=0;
        resultado=0;
        pantalla.setText("");
        registro.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        // TODO add your handling code here:
        try
        {
        numero1=Float.parseFloat(pantalla.getText());
        numero2=numero1;
        operacion="+";
        pantalla.setText("");
        registro.setText(registro.getText()+String.valueOf(numero1)+" + ");
        }catch(Exception ex){pantalla.setText("Syntax Error");}
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unoActionPerformed
        // TODO add your handling code here:
        int uno=1;
        pantalla.setText(pantalla.getText()+String.valueOf(uno));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_unoActionPerformed

    private void btn_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosActionPerformed
        // TODO add your handling code here:
        int dos=2;
        
        pantalla.setText(pantalla.getText()+String.valueOf(dos));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_dosActionPerformed

    private void btn_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tresActionPerformed
        // TODO add your handling code here:
        int tres=3;
        
        pantalla.setText(pantalla.getText()+String.valueOf(tres));
        //registro.setText(registro.getText()+String.valueOf(tres));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_tresActionPerformed

    private void btn_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuatroActionPerformed
        // TODO add your handling code here:
        int cuatro=4;
        
        pantalla.setText(pantalla.getText()+String.valueOf(cuatro));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_cuatroActionPerformed

    private void btn_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cincoActionPerformed
        // TODO add your handling code here:
        int cinco=5;
        
        pantalla.setText(pantalla.getText()+String.valueOf(cinco));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_cincoActionPerformed

    private void btn_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seisActionPerformed
        // TODO add your handling code here:
        int seis=6;
        
        pantalla.setText(pantalla.getText()+String.valueOf(seis));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_seisActionPerformed

    private void btn_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sieteActionPerformed
        // TODO add your handling code here:
        int siete=7;
        
        pantalla.setText(pantalla.getText()+String.valueOf(siete));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_sieteActionPerformed

    private void btn_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ochoActionPerformed
        // TODO add your handling code here:
        int ocho=8;
        
        pantalla.setText(pantalla.getText()+String.valueOf(ocho));
        //Toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_btn_ochoActionPerformed

    private void btn_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueveActionPerformed
        // TODO add your handling code here:
        int nueve=9;
        
        pantalla.setText(pantalla.getText()+String.valueOf(nueve));
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_nueveActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // TODO add your handling code here:
        try{
        numero2=Float.parseFloat(pantalla.getText());
        archivo=new Archivo();
        Toolkit.getDefaultToolkit().beep(); 
        
        switch(operacion)
        {
            case "+":
                resultado=numero1+numero2;
                pantalla.setText(String.valueOf(resultado));
                registro.setText(registro.getText()+String.valueOf(numero2)+" =");
                
                try {
                    archivo.imprimir_archivo(numero1, operacion, numero2, resultado,0);
                } catch (IOException ex) {
                    Logger.getLogger(Frm_calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                break;

            case "-":
                resultado=numero1-numero2;
                pantalla.setText(String.valueOf(resultado));
                registro.setText(registro.getText()+String.valueOf(numero2)+" =");
                
                try {
                    archivo.imprimir_archivo(numero1, operacion, numero2, resultado,0);
                } catch (IOException ex) {
                    Logger.getLogger(Frm_calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
                
            case "*":
                resultado=numero1*numero2;
                pantalla.setText(String.valueOf(resultado));
                registro.setText(registro.getText()+String.valueOf(numero2)+" =");
                try {
                    archivo.imprimir_archivo(numero1, operacion, numero2, resultado,0);
                } catch (IOException ex) {
                    Logger.getLogger(Frm_calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "/":
                resultado=numero1/numero2;
                pantalla.setText(String.valueOf(resultado));
                registro.setText(registro.getText()+String.valueOf(numero2)+" =");
                try {
                    archivo.imprimir_archivo(numero1, operacion, numero2, resultado,0);
                } catch (IOException ex) {
                    Logger.getLogger(Frm_calculadora.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
        }catch(Exception ex){pantalla.setText("Syntax Error");}
        //numero1=numero2;
    }//GEN-LAST:event_btn_igualActionPerformed

    private void bnt_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_restaActionPerformed
        // TODO add your handling code here:
        try
        {
        numero1=Float.parseFloat(pantalla.getText());
        numero2=numero1;
        operacion="-";
        pantalla.setText("");
        registro.setText(registro.getText()+String.valueOf(numero1)+" - ");
        }catch(Exception ex){pantalla.setText("Syntax Error");}
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_bnt_restaActionPerformed

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        // TODO add your handling code here:
        try
        {
        numero1=Float.parseFloat(pantalla.getText());
        numero2=numero1;
        operacion="*";
        pantalla.setText("");
        registro.setText(registro.getText()+String.valueOf(numero1)+" * ");
        }catch(Exception ex){pantalla.setText("Syntax Error");}
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_multiplicarActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        // TODO add your handling code here:
        try{
        numero1=Float.parseFloat(pantalla.getText());
        numero2=numero1;
        
        operacion="/";
        pantalla.setText("");
        registro.setText(registro.getText()+String.valueOf(numero1)+" / ");
        }catch(Exception ex){pantalla.setText("Syntax Error");}
        //Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+".");
        Toolkit.getDefaultToolkit().beep(); 
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void item_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_ayudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "1. En opciones encontrara el historial que es para ver las operaciones que ha hecho \n"
                + "2.  En opciones encontrara Nuevo, que sirve para borrar los datos actuales y empezar un nuevo registro \n"
                + "3.  Puede ingresar sus operaciones, presionando enter es como presionar el boton IGUAL, y presionar la tecla\n"
                + "espacio es como presionar el boton LIMPIAR\n"
                + "4.  https://drive.google.com/file/d/18hbdstDjp1B5gY3XPiXz9SV4Oqhd1fwt/view?usp=sharing \n"
                + "\n Para obtener ayuda, comuniquese con el creador del programa, numero: +502 5623-5823","Guia",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_item_ayudaActionPerformed
    
    private void item_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_nuevoActionPerformed
        // TODO add your handling code here:
        pantalla.setText("");
        registro.setText(" ");
        try {
            archivo=new Archivo();
            archivo.imprimir_archivo(numero1, operacion, numero2, resultado,1);
        } catch (IOException ex) {
            Logger.getLogger(Frm_calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_item_nuevoActionPerformed

    private void item_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_historialActionPerformed
        // TODO add your handling code here:
        frm_archivo archivo= new frm_archivo();
        archivo.show();
    }//GEN-LAST:event_item_historialActionPerformed

    private void pantallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pantallaKeyReleased
        // TODO add your handling code here:
        char tecla=evt.getKeyChar();
        String omitir=pantalla.getText().substring(0,pantalla.getText().length()-1);
        switch(tecla)
        {
            case KeyEvent.VK_MINUS:
                pantalla.setText(omitir);
                bnt_resta.doClick();
                Toolkit.getDefaultToolkit().beep();
                break;
            case '+':
                pantalla.setText(omitir);
                btn_suma.doClick();
                Toolkit.getDefaultToolkit().beep();
                break;
            case '*':
                pantalla.setText(omitir);
                Toolkit.getDefaultToolkit().beep();
                btn_multiplicar.doClick();
                break;
            case '/':
                pantalla.setText(omitir);
                btn_division.doClick();
                Toolkit.getDefaultToolkit().beep();
                break;
            case KeyEvent.VK_ENTER:
                btn_igual.doClick();
                Toolkit.getDefaultToolkit().beep();
                break;
            case KeyEvent.VK_SPACE:
                btn_limpiar.doClick();
                break;
            
        }
            if(Character.isDigit(tecla))
            {
                Toolkit.getDefaultToolkit().beep();
            }
           if(Character.isLetter(tecla))
           {
               pantalla.setText(omitir);
               System.out.println("esto es una letra");
           }
    }//GEN-LAST:event_pantallaKeyReleased
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_resta;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cinco;
    private javax.swing.JButton btn_cuatro;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_dos;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_nueve;
    private javax.swing.JButton btn_ocho;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_seis;
    private javax.swing.JButton btn_siete;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tres;
    private javax.swing.JButton btn_uno;
    private javax.swing.JMenuItem item_ayuda;
    private javax.swing.JMenuItem item_historial;
    private javax.swing.JMenuItem item_nuevo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu opc_ayuda;
    private javax.swing.JMenu opc_opciones;
    private javax.swing.JTextField pantalla;
    private javax.swing.JLabel registro;
    // End of variables declaration//GEN-END:variables
}
