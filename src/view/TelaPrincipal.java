/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Thiago
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroFuncionario = new javax.swing.JMenuItem();
        menuCadastroCliente = new javax.swing.JMenuItem();
        menuCadastroFornecedor = new javax.swing.JMenuItem();
        menuCadastroProduto = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuRelatorio = new javax.swing.JMenu();
        menuVenda = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("estou aqui");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastros");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });

        menuCadastroFuncionario.setText("Funcionario");
        menuCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroFuncionario);

        menuCadastroCliente.setText("Cliente");
        menuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroCliente);

        menuCadastroFornecedor.setText("Fornecedor");
        menuCadastro.add(menuCadastroFornecedor);

        menuCadastroProduto.setText("Produto");
        menuCadastro.add(menuCadastroProduto);

        jMenuBar1.add(menuCadastro);

        menuConsulta.setText("Consultas");
        jMenuBar1.add(menuConsulta);

        menuRelatorio.setText("Relatorios");
        jMenuBar1.add(menuRelatorio);

        menuVenda.setText("Vendas");
        jMenuBar1.add(menuVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroFuncionarioActionPerformed
        CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
        cadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_menuCadastroFuncionarioActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroClienteActionPerformed
        CadastrarCliente cadastrarCliente = new CadastrarCliente();
        cadastrarCliente.setVisible(true);
    }//GEN-LAST:event_menuCadastroClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroCliente;
    private javax.swing.JMenuItem menuCadastroFornecedor;
    private javax.swing.JMenuItem menuCadastroFuncionario;
    private javax.swing.JMenuItem menuCadastroProduto;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuVenda;
    // End of variables declaration//GEN-END:variables
}
