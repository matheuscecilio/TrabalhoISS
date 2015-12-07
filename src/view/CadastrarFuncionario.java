/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FuncionarioController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;

/**
 *
 * @author Thiago
 */
public class CadastrarFuncionario extends javax.swing.JFrame {

    FuncionarioController controller = new FuncionarioController();

    /**
     * Creates new form CadastrarFuncionario
     */
    public CadastrarFuncionario() {
        initComponents();
        controller.desabilitarErros( txtNaoDigitouCpf, txtNaoDigitouData, txtNaoDigitouEmail,
               txtItensObrigatorios, txtNaoDigitouEnd, txtNaoDigitouLogin, txtNaoDigitouNome, txtNaoDigitouSenha, txtNaoDigitouTel, txtNaoInformouSexo,
                txtNaoInformouTipo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel23 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnM = new javax.swing.JRadioButton();
        btnF = new javax.swing.JRadioButton();
        btnFarmaceutico = new javax.swing.JRadioButton();
        btnComum = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtNaoDigitouNome = new javax.swing.JLabel();
        txtNaoDigitouEnd = new javax.swing.JLabel();
        txtNaoDigitouTel = new javax.swing.JLabel();
        txtNaoInformouSexo = new javax.swing.JLabel();
        txtNaoDigitouData = new javax.swing.JLabel();
        txtNaoDigitouEmail = new javax.swing.JLabel();
        txtNaoDigitouCpf = new javax.swing.JLabel();
        txtNaoInformouTipo = new javax.swing.JLabel();
        txtNaoDigitouLogin = new javax.swing.JLabel();
        txtNaoDigitouSenha = new javax.swing.JLabel();
        txtItensObrigatorios = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel.setText("Nome:");

        jLabel1.setText("Endereço:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Data Contratação:");

        jLabel5.setText("Email:");

        jLabel6.setText("Cpf:");

        jLabel8.setText("Tipo:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel9.setText("Login:");

        jLabel10.setText("Senha:");

        btnM.setText("M");
        btnM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMMouseClicked(evt);
            }
        });
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        btnF.setText("F");
        btnF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFMouseClicked(evt);
            }
        });

        btnFarmaceutico.setText("Farmacêutico");
        btnFarmaceutico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFarmaceuticoMouseClicked(evt);
            }
        });
        btnFarmaceutico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmaceuticoActionPerformed(evt);
            }
        });

        btnComum.setText("Comum");
        btnComum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComumMouseClicked(evt);
            }
        });
        btnComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComumActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastro de Funcionário");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNaoDigitouNome.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouNome.setText("*");

        txtNaoDigitouEnd.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouEnd.setText("*");

        txtNaoDigitouTel.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouTel.setText("*");

        txtNaoInformouSexo.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoInformouSexo.setText("*");

        txtNaoDigitouData.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouData.setText("*");

        txtNaoDigitouEmail.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouEmail.setText("*");

        txtNaoDigitouCpf.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouCpf.setText("*");

        txtNaoInformouTipo.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoInformouTipo.setText("*");

        txtNaoDigitouLogin.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouLogin.setText("*");

        txtNaoDigitouSenha.setForeground(new java.awt.Color(255, 0, 0));
        txtNaoDigitouSenha.setText("*");

        txtItensObrigatorios.setForeground(new java.awt.Color(255, 0, 0));
        txtItensObrigatorios.setText("* Itens Obrigatórios");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFarmaceutico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItensObrigatorios)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnComum)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNaoInformouTipo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(btnM)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(btnF)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtNaoInformouSexo))
                                                    .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                                    .addComponent(txtCpf))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtSenha)
                                                .addGap(4, 4, 4)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNaoDigitouTel)
                                            .addComponent(txtNaoDigitouData)
                                            .addComponent(txtNaoDigitouEmail)
                                            .addComponent(txtNaoDigitouCpf)
                                            .addComponent(txtNaoDigitouLogin)
                                            .addComponent(txtNaoDigitouSenha)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNaoDigitouEnd))
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnCancelar)
                        .addGap(103, 103, 103)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaoDigitouNome, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaoDigitouNome)
                    .addComponent(jLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaoDigitouEnd)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaoDigitouTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaoDigitouData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaoDigitouEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNaoDigitouCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaoDigitouLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaoDigitouSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnM)
                    .addComponent(btnF)
                    .addComponent(txtNaoInformouSexo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnFarmaceutico)
                    .addComponent(btnComum)
                    .addComponent(txtNaoInformouTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtItensObrigatorios)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Funcionario funcionario = new Funcionario();

        controller.validarNome(this, funcionario, txtNome, txtNaoDigitouNome, txtItensObrigatorios);
        controller.validarCpf(this, funcionario, txtCpf, txtNaoDigitouCpf, txtItensObrigatorios);
        controller.validarEmail(this, funcionario, txtEmail, txtNaoDigitouEmail, txtItensObrigatorios);
        controller.validarSexo(this, funcionario, btnM, btnF, txtNaoInformouSexo, txtItensObrigatorios);
        controller.validarLogin(this, funcionario, txtLogin, txtNaoDigitouLogin, txtItensObrigatorios);
        controller.validarSenha(this, funcionario, txtSenha, txtNaoDigitouSenha, txtItensObrigatorios);
        try {
            controller.validarData(this, funcionario, txtData, txtNaoDigitouData, txtItensObrigatorios);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.validarEndereco(this, funcionario, txtEndereco, txtNaoDigitouEnd, txtItensObrigatorios);
        controller.validarTipo(this, funcionario, btnComum, btnFarmaceutico, txtNaoInformouTipo, txtItensObrigatorios);

        funcionario.setTelefone(txtTel.getText());

        controller.cadastrarFuncionario(this, funcionario, txtNaoDigitouCpf, txtNaoDigitouEmail, txtNaoDigitouNome, txtNaoInformouSexo,
                txtNaoDigitouData, txtNaoDigitouEnd, txtNaoDigitouLogin, txtNaoDigitouSenha, txtNaoInformouTipo);

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComumActionPerformed

    }//GEN-LAST:event_btnComumActionPerformed

    private void btnFarmaceuticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmaceuticoActionPerformed

    }//GEN-LAST:event_btnFarmaceuticoActionPerformed

    private void btnFarmaceuticoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFarmaceuticoMouseClicked
        if (btnComum.isSelected()) {
            btnComum.setSelected(false);
        }
    }//GEN-LAST:event_btnFarmaceuticoMouseClicked

    private void btnComumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComumMouseClicked
        if (btnFarmaceutico.isSelected()) {
            btnFarmaceutico.setSelected(false);}    }//GEN-LAST:event_btnComumMouseClicked

    private void btnMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMMouseClicked
        if (btnF.isSelected()) {
            btnF.setSelected(false);
        }
    }//GEN-LAST:event_btnMMouseClicked

    private void btnFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFMouseClicked
        if (btnM.isSelected()) {
            btnM.setSelected(false);
        }
    }//GEN-LAST:event_btnFMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed

    }//GEN-LAST:event_btnMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnComum;
    private javax.swing.JRadioButton btnF;
    private javax.swing.JRadioButton btnFarmaceutico;
    private javax.swing.JRadioButton btnM;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JLabel txtItensObrigatorios;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JLabel txtNaoDigitouCpf;
    private javax.swing.JLabel txtNaoDigitouData;
    private javax.swing.JLabel txtNaoDigitouEmail;
    private javax.swing.JLabel txtNaoDigitouEnd;
    private javax.swing.JLabel txtNaoDigitouLogin;
    private javax.swing.JLabel txtNaoDigitouNome;
    private javax.swing.JLabel txtNaoDigitouSenha;
    private javax.swing.JLabel txtNaoDigitouTel;
    private javax.swing.JLabel txtNaoInformouSexo;
    private javax.swing.JLabel txtNaoInformouTipo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
