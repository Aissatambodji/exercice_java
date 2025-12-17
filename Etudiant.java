package etudiant;
import java.util.*;
public class Etudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int choix=0;

	Identifiant [] tab = new Identifiant[100];
	for(int j=0;j<=tab.length;j++) {//pour parcourir le boucle
		Identifiant i =new Identifiant();//pour importer notre classe identifiant
		 tab [j] = i;//initialiser l'ensemble des élément du tableau par i
         Scanner sc= new Scanner(System.in);
		i.setNom("");    //nom nvide
		i.setPrenom("");
		i.setAdresse("");
		i.setEmail("");
		i.setNote(1);  //note initialisé en 1
		i.setTel(1);
		i.setAnneeN(1);
		i.setAnneeA(1);
		
		
		System.out.println("veuillez saisir votre nom");//affiche un message à faire
		i.setNom(sc.nextLine());		
		System.out.println("veuillez saisir votre prenom");//saisir le message
		i.setPrenom(sc.nextLine());
		System.out.println("veuillez saisir votre adresse");
		i.setAdresse(sc.nextLine());
		System.out.println("veuillez saisir votre email");
		i.setEmail(sc.nextLine());
		System.out.println("veuillez saisir votre note");
		i.setNote(sc.nextInt());
		System.out.println("veuillez saisir votre tel");
		i.setTel(sc.nextInt());
		System.out.println("veuillez saisir votre année de naissance");
		i.setAnneeN(sc.nextInt());
		System.out.println("veuillez saisir votre année de naissance");
		i.setAnneeA(sc.nextInt());
	}
    Scanner sc= new Scanner(System.in);//fonction scanner pour saisir

			try {			
				choix = Integer.parseInt(sc.nextLine());//conversion de chaine en entier

				}
			catch(Exception e) {
			System.out.println(e);//si la conversion echoue l'erreur est capturé
			}
			
	
		switch(choix) {//faire un choix
		 case 1: 
			 //boucle pour prcourir l'ensemble des valeurs
			 for(int j=0;j<=tab.length;j++) { 
				 //pour comparer j l'ensemble des valeurs
			for(int k=j+1;k<=tab.length;k++) {
				if (tab[j].getAge()>tab[k].getAge()) {
				Identifiant a =tab[j];//echange
				tab[j] =tab[k];
				tab[k]=a;
				}
				}
				}
				System.out.println("le tableau trié est" );//affichage
             System.out.println("le liste des éléves triées sont");
			 for(int j=0;j<=tab.length;j++) { //parcourir l'ensemble des elements
		          System.out.println(tab[j].getNom()+""+tab[j].getPrenom()+""+tab[j].getAdresse()+""+tab[j].getEmail()+""+tab[j].getAge()+""+tab[j].getNote()+""+tab[j].getTel()+tab[j].getAge());
//affichage du liste trié
			} break;//quitter la boucle
		 case 2 :
			 System.out.println("les 5 étudiants les plus jeunes");
			 for(int j=0;j<5;j++) { //permet d'afficher les 5 premier element du tableau
		          System.out.println(tab[j].getNom()+""+tab[j].getPrenom()+""+tab[j].getAdresse()+""+tab[j].getEmail()+""+tab[j].getAge()+""+tab[j].getNote()+""+tab[j].getTel()+tab[j].getAge());
 
	}break;
		 case 3 : 
			 System.out.println("les 5 étudiants les plus agés");
			 for(int j=tab.length - 5;j<=tab.length;j++) { //permet d'avoir les 5 derniers elements du  tableau
		          System.out.println(tab[j].getNom()+""+tab[j].getPrenom()+""+tab[j].getAdresse()+""+tab[j].getEmail()+""+tab[j].getAge()+""+tab[j].getNote()+""+tab[j].getTel()+tab[j].getAge());
    
			 }  break;
			 
		case 4 :
			 Identifiant max;

		        	max = tab[0];//on part du premier element comme référence
		 for(int j=0;j<=tab.length;j++) { 

		        if (tab[j].getNote () > max.getNote()) {
		        	max=tab[j];//on met a jour max si une note plus grande est trouvé
		        			}}
		        System.out.println("la plus grande note est"+max.getNote());
		        
		 break;
		case 5 :
			Identifiant min;
        	min= tab[0];//on part du premier element comme référence
 for(int j=1;j<=tab.length;j++) { 

        if (tab[j].getNote () > min.getNote()) {
        	min=tab[j];
        			}
 }
        System.out.println("la plus faible note est"+min.getNote());
        
		break;
	default :
		System.out.println("erreur");//erreur si on met pas le bon choix
	}}}