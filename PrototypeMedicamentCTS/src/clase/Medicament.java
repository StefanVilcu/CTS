package clase;

import java.util.ArrayList;
import java.util.List;

public class Medicament implements IMedicament{
    List<String> ingrediente;

    public Medicament(List<String> ingrediente) {
        this.ingrediente = new ArrayList<>(ingrediente);
    }

    @Override
    public Medicament copiaza() {
        List<String> ingredienteCopiate = new ArrayList<>(this.ingrediente);
        Medicament mCopiat = new Medicament(ingredienteCopiate);
        return mCopiat;
    }

    @Override
    public void adaugaIngredient(String ingredient) {
        this.ingrediente.add(ingredient);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("ingrediente=").append(ingrediente);
        sb.append('}');
        return sb.toString();
    }
}
