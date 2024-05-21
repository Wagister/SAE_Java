public class Athlete implements Participant{
    private String nom;
    private String prenom;
    private boolean sexe;
    private int force;
    private int endurance;
    private int agilite;
    private Pays nationalite;

    public Athlete(String nom, String prenom, boolean sexe, int force, int endurance, int agilite, Pays nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.force = force;
        this.endurance = endurance;
        this.agilite = agilite;
        this.nationalite = nationalite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    @Override
    public int getForce() {
        return force;
    }
    @Override
    public int getEndurance() {
        return endurance;
    }
    @Override
    public int getAgilite() {
        return agilite;
    }
    @Override
    public Pays getNationalite() {
        return nationalite;
    }
    @Override
    public boolean estMasculin() {
        return this.sexe;


}
}
