package aula9.exercicio05.entities;
import java.util.List;

public class ItemOrcamentoComplexo extends ItemOrcamento {

    private List<ItemOrcamento> subitens;

    public ItemOrcamentoComplexo(String historico, List<ItemOrcamento> subitens) {
        super(historico, 0);
        this.subitens = subitens;
    }

    @Override
    public float getValor() {
        float soma = 0;

        for (ItemOrcamento item : subitens) {
            soma += item.getValor();
        }

        return soma;
    }

    public ItemOrcamento encontrarItem(String historico) {
        if (this.getHistorico().equals(historico)) {
            return this;
        }
        for (ItemOrcamento item : subitens) {
            if (item.getHistorico().equals(historico)) {
                return item;
            }

            
            if (item instanceof ItemOrcamentoComplexo complexo) {
                ItemOrcamento encontrado = complexo.encontrarItem(historico);
                if (encontrado != null) {
                    return encontrado;
                }
            }
        }

        return null;
    }
}
