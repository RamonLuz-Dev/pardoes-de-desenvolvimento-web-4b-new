package recursos;

import java.util.List;

import entidades.Produto;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("vendas")
public class VendaRecurso {
     @GET
    public List<Produto> listar () {
        return Produto.listAll(Sort.ascending("nome"));
    }
}
