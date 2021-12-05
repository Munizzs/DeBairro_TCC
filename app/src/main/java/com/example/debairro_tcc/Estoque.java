package com.example.debairro_tcc;

public class Estoque {
    private int IDProduto, idEstabelecimento;
    private String nome, marca;
    private int quantidade, precodecompra, precodevenda, peso, lote, datafabricacao, datavalidade;

    /*public Estoque( int IDProduto, int idEstabelecimento, String nome, String marca, int quantidade, int precodecompra, int precodevenda, int peso, int lote, int datafabricacao, int datavalidade) {
        this.IDProduto = IDProduto;
        this.idEstabelecimento = idEstabelecimento;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.precodecompra = precodecompra;
        this.precodevenda = precodevenda;
        this.peso = peso;
        this.lote = lote;
        this.datafabricacao = datafabricacao;
        this.datavalidade = datavalidade;

    }*/

    public Estoque(int IDProduto, String nome, String marca, int quantidade, int precodevenda) {
        this.IDProduto = IDProduto;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.precodevenda = precodevenda;
    }


    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto){
        this.IDProduto = IDProduto;
    }

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecodecompra() {
        return precodecompra;
    }

    public void setPrecodecompra(int precodecompra) {
        this.precodecompra = precodecompra;
    }

    public int getPrecodevenda() {
        return precodevenda;
    }

    public void setPrecodevenda(int precodevenda) {
        this.precodevenda = precodevenda;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(int datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public int getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(int datavalidade) {
        this.datavalidade = datavalidade;
    }
}
