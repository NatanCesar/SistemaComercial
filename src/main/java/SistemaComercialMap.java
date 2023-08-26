import exceptions.ClienteNaoExisteException;
import exceptions.ProdutoNaoExisteException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaComercialMap implements SistemaComercial {
    private Map<String, Cliente> clientes;
    private Map<String, Produto> produtos;

    public SistemaComercialMap(){
        this.clientes = new HashMap<String, Cliente>();
        this.produtos = new HashMap<String, Produto>();
    }
    @Override
    public boolean existeProduto(Produto produto) {
        if (produtos.containsKey(produto.getCodigo())){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        if (produtos.containsKey(codigoProduto)){
            return this.produtos.get(codigoProduto);
        }
    throw new ProdutoNaoExisteException("Produto não existe no sistema!");
    }

    @Override
    public boolean cadastraProduto(Produto produto) {
        if (existeProduto(produto)){
            return false;
        } else{
            this.produtos.put(produto.getCodigo(),produto);
            return true;
        }
    }

    @Override
    public boolean existeCliente(Cliente cliente) {
        if (clientes.containsKey(cliente.getID())){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException {
        if (clientes.containsKey(id)){
            return this.clientes.get(id);
        }
        throw new ClienteNaoExisteException("Produto não existe no sistema!");
    }


    @Override
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        Collection<Produto> produtosCategoria = new ArrayList<>();
        for (Produto p: produtos.values()){
            if (p.getCategoria().equals(categoria)){
                produtosCategoria.add(p);
            }
        }
        return produtosCategoria;
    }
}
