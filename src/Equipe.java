import java.util.Set;
import java.util.HashSet;

public class Equipe implements Participant {
    private boolean sexe;
    private int taille;
    private Pays nationalite;
    private Set<Athlete> coequipiers;

    public Equipe(boolean sexe, int taille, Pays natio) {
        this.sexe = sexe;
        this.taille = taille;
        this.nationalite = natio;
        this.coequipiers = new HashSet<>(taille);
    }

    public boolean estMasculin() {
        return this.sexe;
    }

    public int getTaille() {
        return this.taille;
    }

    public int getForce() {
        int somme = 0;
        for (Athlete coequipier : this.coequipiers) {
            somme += coequipier.getForce();
        }
        return somme;
    }

    public int getEndurance() {
        int somme = 0;
        for (Athlete coequipier : this.coequipiers) {
            somme += coequipier.getEndurance();
        }
        return somme;
    }

    public int getAgilite() {
        int somme = 0;
        for (Athlete coequipier : this.coequipiers) {
            somme += coequipier.getAgilite();
        }
        return somme;
    }

    public Pays getNationalite() {
        return this.nationalite;
    }

    public boolean ajouterCoequipier(Athlete coequipier) {
        if (coequipier.getNationalite().equals(this.nationalite) && coequipier.estMasculin() == this.estMasculin()) {
            return this.coequipiers.add(coequipier);
        }
        return false;
    }   

    public boolean enleverCoequipier(Athlete coequipier) {
        return this.coequipiers.remove(coequipier);
    }
}
