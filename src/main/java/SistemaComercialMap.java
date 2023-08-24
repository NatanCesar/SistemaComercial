import exceptions.ClienteNaoExisteException;
import exceptions.ProdutoNaoExisteException;

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
        return false;
    }

    @Override
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
        return null;
    }

    @Override
    public boolean cadastraProduto(Produto produto) {
        return false;
    }

    @Override
    public boolean existeCliente(Cliente cliente) {
        return false;
    }

    @Override
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException {
        return null;
    }

    @Override
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        return null;
    }
}
