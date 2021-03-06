package models;

/**
 * Created by mauricio on 16/05/17.
 */
public class Pedido {

    private int id;
    private int clienteId;
    private int entregadorId;
    private String dataDoPedido;
    private double valor;
    private String tipoDePagamento;
    private boolean pendente;
    private boolean devolvido;

    public Pedido(){}

    public Pedido(int id, int clienteId, int entregadorId, String dataDoPedido, double valor, String tipoDePagamento) {
        this.id = id;
        this.clienteId = clienteId;
        this.entregadorId = entregadorId;
        this.dataDoPedido = dataDoPedido;
        this.valor = valor;
        this.tipoDePagamento = tipoDePagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getEntregadorId() {
        return entregadorId;
    }

    public void setEntregadorId(int entregadorId) {
        this.entregadorId = entregadorId;
    }

    public String getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(String dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public boolean isPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", entregadorId=" + entregadorId +
                ", dataDoPedido='" + dataDoPedido + '\'' +
                ", valor=" + valor +
                ", tipoDePagamento='" + tipoDePagamento + '\'' +
                '}';
    }
}
