public class Produto {
    private String codigo;
    private String descricao;
    private double precoVenda;
    private int quantEmEstoque;
    private CategoriaProduto categoria;

    public Produto(String codigo, String descricao, double precoVenda, int quantEmEstoque, CategoriaProduto categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.quantEmEstoque = quantEmEstoque;
        this.categoria = categoria;
    }
    public Produto(){
        this.codigo = "";
        this.descricao = "";
        this.precoVenda = 0;
        this.quantEmEstoque = 0;
        this.categoria = null;
    }

    @Override
    public String toString() {
        return "Código: " + this.codigo + ", Descrição: " + this.descricao + ", Preço da venda: " + this.precoVenda +
                ", Quantidade em estoque: " + this.quantEmEstoque + ", Categoria: " + this.categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantEmEstoque() {
        return quantEmEstoque;
    }

    public void setQuantEmEstoque(int quantEmEstoque) {
        this.quantEmEstoque = quantEmEstoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
}
