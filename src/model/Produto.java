package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "produto")

public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String descricao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCompra;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataValidade;
    private String fornecedor; //necessario ligar a variavel aos fornecedores cadastrados
    private double precoCompra;
    private double precoVenda;
    private Integer quantComprada;
    private Integer quantVendido;

    private Integer quantidadeEstoque;
    @ManyToMany(mappedBy = "produtos")
    private List<Pedido> pedidos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Object[] toArray() {
        return new Object[]{id, descricao, quantidadeEstoque, precoVenda};
    }

    public Object[] toArrayCompra() {
        return new Object[]{id, descricao, precoVenda};
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getQuantVendido() {
        return quantVendido;
    }

    public void setQuantVendido(Integer quantVendido) {
        this.quantVendido = quantVendido;
    }

    public Integer getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(Integer quantComprada) {
        this.quantComprada = quantComprada;
    }
    
}
