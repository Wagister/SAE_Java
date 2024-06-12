/*
 * public class ExectutableJO {
 * public static void main(String[] args) {
 * Pays France = new Pays("France");
 * Pays Allemagne = new Pays("Allemagne");
 * Pays France2 = new Pays("France");
 * //Initialisation des Pays
 * Equipe EquipeFrance = new Equipe(true, 3, France);
 * Equipe EquipeAllemagne = new Equipe(true, 3, Allemagne);
 * //Initialisation des Equipes
 * 
 * 
 * 
 * 
 * Athlete Benzema = new Athlete("Benzema", "Karim", true, 60,55, 76, France);
 * Athlete Benzema2 = new Athlete("Benzema", "Karim", true, 60,55, 76, France);
 * Athlete Giroud = new Athlete("Giroud", "Olivier", true, 50, 60, 70, France);
 * Athlete Pogba = new Athlete("Pogba", "Paul", true, 70, 65, 75, France);
 * Athlete Muller = new Athlete("Muller", "Thomas", true, 45,62, 82, Allemagne);
 * Athlete Reus = new Athlete("Reus", "Marco", true, 60, 70, 80, Allemagne);
 * Athlete Kroos = new Athlete("Kroos", "Toni", true, 65, 75, 85, Allemagne);
 * 
 * //Initialisation des Athletes
 * 
 * Sport Foot = new Sport("Foot");
 * Sport Basket = new Sport("Basket");
 * Sport Foot2 = new Sport("Foot");
 * Sport natation = new Sport("Natation");
 * //Initialisation des Sports
 * EpreuveCollective EpreuveFoot = new EpreuveCollective("Foot", true, Foot);
 * EpreuveIndividuelle EpreuveNatation = new EpreuveIndividuelle("Natation",
 * false, natation);
 * //Initialisation des Epreuves
 * 
 * assert EpreuveFoot.getIntitule().equals("Foot");
 * assert !EpreuveFoot.getIntitule().equals("Basket");
 * assert EpreuveFoot.estMasculine();
 * assert EpreuveFoot.getSport().equals(Foot);
 * assert !EpreuveFoot.getSport().equals(Basket);
 * assert EpreuveNatation.getSport().equals(natation);
 * assert !EpreuveNatation.estMasculine();
 * EpreuveFoot.ajouterEquipe(EquipeFrance);
 * EpreuveFoot.ajouterEquipe(EquipeAllemagne);
 * System.out.println(EpreuveFoot.genererClassement());
 * //Test des Epreuves
 * 
 * assert Foot.getNomSport().equals("Foot");
 * assert !Foot.equals(Basket);
 * assert Foot.equals(Foot2);
 * //Test des Sports
 * 
 * 
 * 
 * 
 * France.ajouterSportif(Benzema);
 * France2.ajouterSportif(Benzema);
 * assert France.equals(France2);
 * France.ajouterSportif(Giroud);
 * France.ajouterSportif(Pogba);
 * Allemagne.ajouterSportif(Reus);
 * Allemagne.ajouterSportif(Kroos);
 * Allemagne.ajouterSportif(Muller);
 * 
 * EquipeAllemagne.ajouterCoequipier(Reus);
 * EquipeAllemagne.ajouterCoequipier(Kroos);
 * EquipeAllemagne.ajouterCoequipier(Muller);
 * EquipeFrance.ajouterCoequipier(Benzema);
 * EquipeFrance.ajouterCoequipier(Giroud);
 * EquipeFrance.ajouterCoequipier(Pogba);
 * 
 * //Ajout des Athletes aux Pays et Equipes
 * 
 * assert France.getNomPays().equals("France");
 * assert !France.getNomPays().equals("Allemagne");
 * assert Allemagne.getNomPays().equals("Allemagne");
 * //Test des noms des Pays
 * 
 * assert !France.equals(Allemagne);
 * //Test de l'égalité des Pays
 * 
 * 
 * assert EquipeFrance.estMasculin();
 * assert EquipeAllemagne.estMasculin();
 * assert EquipeFrance.getForce()==(180);
 * assert EquipeAllemagne.getForce()==(170);
 * assert EquipeFrance.getEndurance()==(180);
 * assert EquipeAllemagne.getEndurance()==(2);
 * assert EquipeFrance.getAgilite()==(221);
 * EquipeFrance.enleverCoequipier(Benzema);
 * EquipeFrance.ajouterCoequipier(Benzema2);
 * assert EquipeFrance.getForce()==(180);
 * 
 * assert EquipeAllemagne.getAgilite()==(247);
 * assert EquipeFrance.getNationalite().equals(France);
 * assert !EquipeFrance.getNationalite().equals(Allemagne);
 * assert EquipeAllemagne.getNationalite().equals(Allemagne);
 * assert !EquipeFrance.equals(EquipeAllemagne);
 * //Test des Equipes
 * 
 * 
 * //Test des Athletes
 * assert Benzema.getNom().equals("Benzema");
 * assert !Benzema.getNom().equals("Muller");
 * assert Muller.getNom().equals("Muller");
 * assert Benzema.equals(Benzema2);
 * //Test des noms
 * 
 * assert Benzema.getPrenom().equals("Karim");
 * assert !Benzema.getPrenom().equals("Thomas");
 * assert Muller.getPrenom().equals("Thomas");
 * //Test des prenoms
 * 
 * assert Benzema.estMasculin();
 * assert Muller.estMasculin();
 * //Test du sexe
 * 
 * assert Benzema.getForce()==(60);
 * assert Muller.getForce()==(45);
 * //Test de la force
 * 
 * assert Benzema.getEndurance()==(55);
 * assert Muller.getEndurance()==(62);
 * assert Benzema.getEndurance()==(55);
 * //Test de l'endurance
 * 
 * assert Muller.getAgilite()==(82);
 * assert Benzema.getAgilite()==(76);
 * //Test de l'agilité
 * 
 * assert Benzema.getNationalite().equals(France);
 * assert !Benzema.getNationalite().equals(Allemagne);
 * assert Muller.getNationalite().equals(Allemagne);
 * //Test de la nationalité
 * 
 * 
 * 
 * 
 * 
 * }
 * }
 */