package recursos;

import java.util.List;
import entidades.ItemVenda;
import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("itensvenda")
public class ItemVendaRecurso {
    @GET
    public List<ItemVenda> listar () {
        return ItemVenda.listAll(Sort.ascending("codigo", "valorParcial", "quantidadeParcial"));
    }
}
