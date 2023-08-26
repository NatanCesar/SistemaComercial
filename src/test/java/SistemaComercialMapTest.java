import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class SistemaComercialMapTest {
    @Test
    public void testaCadastroProdutos() {
        SistemaComercialMap sistema = new SistemaComercialMap();
        Collection<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.size()==0);
        Produto produtoTeste = new Produto("002","Produto para teste",25.50,5,CategoriaProduto.ALIMENTO);
        sistema.cadastraProduto(produtoTeste);
        assertTrue(sistema.existeProduto(produtoTeste));
        alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.size()==1);
    }
}

