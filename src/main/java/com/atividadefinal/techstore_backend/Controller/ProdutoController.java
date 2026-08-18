package com.atividadefinal.techstore_backend.Controller;

import com.atividadefinal.techstore_backend.Model.ProdutoModel;
import com.atividadefinal.techstore_backend.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository comandos;

    // POST - Salvar produto
    @PostMapping
    public ProdutoModel salvarProduto(@RequestBody ProdutoModel produto) {
        return comandos.save(produto);
    }

    // GET - Listar todos os produtos
    @GetMapping
    public List<ProdutoModel> listarProdutos() {
        return comandos.findAll();
    }

    // GET - Buscar produto por ID
    @GetMapping("/{id}")
    public ProdutoModel buscarProduto(@PathVariable Integer id) {
        return comandos.findById(id).orElseThrow();
    }

    // PUT - Atualizar produto
    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(
            @PathVariable Integer id,
            @RequestBody ProdutoModel dadoAtualizado) {

        ProdutoModel produtoAtual = comandos.findById(id).orElseThrow();

        produtoAtual.setTitulo(dadoAtualizado.getTitulo());
        produtoAtual.setDescricao(dadoAtualizado.getDescricao());
        produtoAtual.setPreco(dadoAtualizado.getPreco());
        produtoAtual.setCategoria(dadoAtualizado.getCategoria());
        produtoAtual.setImagem(dadoAtualizado.getImagem());

        return comandos.save(produtoAtual);
    }

    // DELETE - Excluir produto
    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Integer id) {

        ProdutoModel produto = comandos.findById(id).orElseThrow();
        String titulo = produto.getTitulo();

        comandos.deleteById(id);

        return "Produto " + titulo + " foi deletado com sucesso";
    }
}