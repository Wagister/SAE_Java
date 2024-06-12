package main.java.com.cdal;

/**
 * Classe représentant un athlète participant à une épreuve sportive.
 */
public class Athlete implements Participant {
    private String nom;
    private String prenom;
    private boolean sexe;
    private int force;
    private int endurance;
    private int agilite;
    private Pays nationalite;

    /**
     * Constructeur de la classe Athlete.
     * @param nom Nom de l'athlète.
     * @param prenom Prénom de l'athlète.
     * @param sexe Sexe de l'athlète (true pour masculin, false pour féminin).
     * @param force Force de l'athlète.
     * @param endurance Endurance de l'athlète.
     * @param agilite Agilité de l'athlète.
     * @param natio Nationalité de l'athlète.
     */
    public Athlete(String nom, String prenom, boolean sexe, int force, int endurance, int agilite, Pays natio) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.force = force;
        this.endurance = endurance;
        this.agilite = agilite;
        this.nationalite = natio;
        this.nationalite.ajouterSportif(this);
    }

    /**
     * Retourne le nom de l'athlète.
     * @return Le nom de l'athlète.
     */
    public String getNomAthlete() {
        return this.nom;
    }

    /**
     * Retourne le prénom de l'athlète.
     * @return Le prénom de l'athlète.
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Vérifie si l'athlète est masculin.
     * @return true si l'athlète est masculin, false sinon.
     */
    public boolean estMasculin() {
        return this.sexe;
    }

    /**
     * Retourne la force de l'athlète.
     * @return La force de l'athlète.
     */
    public int getForce() {
        return this.force;
    }

    /**
     * Retourne l'endurance de l'athlète.
     * @return L'endurance de l'athlète.
     */
    public int getEndurance() {
        return this.endurance;
    }

    /**
     * Retourne l'agilité de l'athlète.
     * @return L'agilité de l'athlète.
     */
    public int getAgilite() {
        return this.agilite;
    }

    /**
     * Retourne la moyenne des statistiques de l'athlète.
     * @return La moyenne des statistiques de l'athlète.
     */
    public double getMoyenne() {
        double somme = 0;
        somme += this.getForce() + this.getEndurance() + this.getAgilite();
        return somme / 3;
    }

    /**
     * Retourne la nationalité de l'athlète.
     * @return La nationalité de l'athlète.
     */
    public Pays getNationalite() {
        return this.nationalite;
    }

    /**
     * Vérifie l'égalité entre cet athlète et un autre objet.
     * @param o L'objet à comparer.
     * @return true si les objets sont égaux, false sinon.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {return false;}
        if (o == this) {return true;}
        if (!(o instanceof Athlete)) {return false;}
        Athlete tmp = (Athlete) o;
        return tmp.getNomAthlete().equals(this.nom) 
            && tmp.getPrenom().equals(this.prenom)
            && tmp.estMasculin() == this.sexe
            && tmp.getForce() == this.force
            && tmp.getEndurance() == this.endurance
            && tmp.getAgilite() == this.agilite
            && tmp.getNationalite().equals(this.nationalite);
    }

    /**
     * Retourne le hashCode pour cet athlète.
     * @return Le hashCode de l'athlète.
     */
    @Override
    public int hashCode() {
        int res = this.nom.hashCode() * 806289877;
        res += this.prenom.hashCode() * 928947083;
        res += Boolean.hashCode(this.sexe) * 717172681;
        res += Integer.hashCode(this.force) * 599767097;
        res += Integer.hashCode(this.endurance) * 159148903;
        res += Integer.hashCode(this.agilite) * 194723003;
        res += this.nationalite.hashCode() * 295424413;
        return res;
    }

    /**
     * Retourne l'athlète sous forme de chaine de caractères.
     * @return L'athlète sous forme de chaine de caractères.
     */
    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }
}
