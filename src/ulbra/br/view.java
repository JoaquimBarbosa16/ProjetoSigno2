/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulbra.br;

import java.util.Calendar;
import javax.swing.JOptionPane;


/**
 *
 * @author aluno
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        lbDia = new javax.swing.JLabel();
        edDia = new javax.swing.JTextField();
        lbMes = new javax.swing.JLabel();
        edMes = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        edAno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        ldMasc = new javax.swing.JRadioButton();
        ldFem = new javax.swing.JRadioButton();
        btConsultar = new javax.swing.JButton();
        lbResp = new javax.swing.JLabel();
        lbSorte = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        lbNome.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbNome.setText("NOME:");

        lbSexo.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbSexo.setText("SEXO:");

        lbDia.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbDia.setText("DIA NASCIMENTO");

        lbMes.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbMes.setText("MÊS NASCIMENTO");

        lbAno.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        lbAno.setText("ANO NASCIMENTO");

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("ASTROCONSELHO LTDA");

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        buttonGroup1.add(ldMasc);
        ldMasc.setSelected(true);
        ldMasc.setText("Masculino");
        ldMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldMascActionPerformed(evt);
            }
        });

        buttonGroup1.add(ldFem);
        ldFem.setText("Feminino");
        ldFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldFemActionPerformed(evt);
            }
        });

        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lbResp.setText("Respostas:");

        lbSorte.setText("SORTE:");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aluno\\Pictures\\imgAkinator.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSorte, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbResp, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(edMes, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAno)
                            .addComponent(edAno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbDia)
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(edDia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbMes)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(ldMasc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ldFem))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbSexo)
                                            .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(440, 440, 440))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbNome)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSexo)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ldFem)
                            .addComponent(ldMasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMes)
                            .addComponent(lbDia)
                            .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(lbResp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSorte)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
  edNome.setText(null);
  edDia.setText(null);
  edMes.setText(null);
  edAno.setText(null);
  lbResp.setText(null);
        
    }//GEN-LAST:event_btLimparActionPerformed
 
    private void ldMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ldMascActionPerformed

    private void ldFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ldFemActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
 String tratamento, nome;
   int sexo, dia, mes, ano, idade;
    nome = edNome.getText();
    dia = Integer.parseInt(edDia.getText());
    mes = Integer.parseInt(edMes.getText());
    ano = Integer.parseInt(edAno.getText());
    
    gerarSigno(dia,mes);  
    idade = calcularIdade(dia, mes, ano);
      
   int sorte;
           sorte = (int)1+(int)(Math.random()*100);
           sorte = (int)1+(int)(Math.random()*10);
            
   int numero1=0;
   while(numero1==0){
     if(ldFem.isSelected()){
         tratamento = "Sra";
         lbResp.setText(tratamento+" "+nome+" nascida no dia "+dia+"/"+mes+"/"+ano+" você é do signo de"+gerarSigno(dia,mes)+". Sua Idade é:"+idade+". seu nº da sorte é: "+sorte);
         lbSorte.setText("s");
        String input=JOptionPane.showInputDialog("Você deseja continuar?(1-SIM ou 2-NÃO)");
        int numero = Integer.parseInt(input);
            if(numero==1){
                edNome.setText(null);
                 edDia.setText(null);
                 edMes.setText(null);
                 edAno.setText(null);
                lbResp.setText(null);
         }else if(numero==2){
                dispose();
         }else{
             JOptionPane.showMessageDialog(null, "ERROR");
         }
         
         
     }else{
         tratamento = "Sr.";
         lbResp.setText(tratamento+" "+nome+" nasceu no dia "+dia+"/"+mes+"/"+ano+" você é do signo de"+gerarSigno(dia,mes)+". Sua Idade é:"+idade);
        if(ldMasc.isSelected()){
         tratamento = "Sr.";
         lbResp.setText(tratamento+" "+nome+" nascido no dia "+dia+"/"+mes+"/"+ano+" você é do signo de"+gerarSigno(dia,mes)+". Sua Idade é:"+idade+". seu nº da sorte é: "+sorte);
         
        String input=JOptionPane.showInputDialog("Você deseja continuar?(1-SIM ou 2-NÃO)");
        int numero = Integer.parseInt(input);
            if(numero==1){
                edNome.setText(null);
                 edDia.setText(null);
                 edMes.setText(null);
                 edAno.setText(null);
                lbResp.setText(null);
         }else if(numero==2){
                dispose();
         }else{
             JOptionPane.showMessageDialog(null, "ERROR");
         }
         
        }}
     break;
   }
    
  
    }//GEN-LAST:event_btConsultarActionPerformed
  public int[]gerarSorte(int tamanho){
      int[]sorte1= new int[tamanho];
      Ramdom rand= new Ramdom();
      for(int i=0; i<tamanho;i++){
      sorte1[i] = rand.nextInt(101);     
      }
       return sorte1;
  }
  public double calcularMediaSorte(double[] sorte1){
      double soma = 0;
        for (double valor : sorte1) {
            soma += valor;
        }
        return (double) soma / sorte1.length;
  
  }
   
   public int calcularIdade(int dia, int mes, int ano) {
      
      
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(ano, mes - 1, dia); // mês é baseado em zero em Calendar

        Calendar dataAtual = Calendar.getInstance();

        int idade = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (dataAtual.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)
                || (dataAtual.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
                && dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }
        return idade;
}
  public String gerarSigno(int dia, int mes){
        String signo="";
        int numero2=0;
        while(numero2==0){
          if(dia>=21 && dia<=31 && mes==3 ||
           dia>=01 && dia<=20 && mes==4){
            signo = "....!!ÁRIES!!";
        }else if(dia>=21 && dia<=30 && mes==4 ||
           dia>=1 && dia<=20 && mes==5){
            signo = "...!!TOURO!!";
        }else if(dia>=21 && dia<=31 && mes==5 ||
           dia>=1 && dia<=20 && mes==6){
            signo = "...!!GÊMEOS!!";
        }else if(dia>=21 && dia<=30 && mes==6 ||
           dia>=1 && dia<=21 && mes==7){
            signo = "...!!CÂNCER!!";
        }else if(dia>=22 && dia<=31 && mes==7 ||
           dia>=1 && dia<=22 && mes==8){
            signo = "...!!LEÂO!!";
        }else if(dia>=23 && dia<=30 && mes==8 ||
           dia>=1 && dia<=22 && mes==9){
            signo = "...!!VIRGEM!!";
        }else if(dia>=23 && dia<=31 && mes==9 ||
           dia>=1 && dia<=22 && mes==10){
            signo = "...!!Libra!!";
        }else if(dia>=23 && dia<=31 && mes==10 ||
           dia>=1 && dia<=21 && mes==11){
            signo = "...!!ESCORPIÃO!!";
        }else if(dia>=22 && dia<=30 && mes==11 ||
           dia>=1 && dia<=21 && mes==12){
            signo = "...!!SAGITÁRIO!!";
        }else if(dia>=22 && dia<=31 && mes==12 ||
           dia>=1 && dia<=20 && mes==1){
            signo = "...!!CAPRICÓRNIO!!";
        }else if(dia>=21 && dia<=31 && mes==1 ||
           dia>=1 && dia<=19 && mes==2){
            signo = "...!!AQUÁRIO!!";
        }else if(dia>=20 && dia<=28 && mes==2 ||
           dia>=1 && dia<=20 && mes==3){
            signo = "...!!PEIXES!!";
        }else{
            signo = "ERROR: tente novamente";
        }
       break; }return signo;
    }
  
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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField edAno;
    private javax.swing.JTextField edDia;
    private javax.swing.JTextField edMes;
    private javax.swing.JTextField edNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbResp;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbSorte;
    private javax.swing.JRadioButton ldFem;
    private javax.swing.JRadioButton ldMasc;
    // End of variables declaration//GEN-END:variables
}
