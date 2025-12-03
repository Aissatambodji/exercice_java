import java.util.*;
public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	//demande la taille
	System.out.print("veillez saisir la taille du tableau ");//affiche un message 
	int n = sc.nextInt(); //taille du tableau
	int[] tab= new int[n];//creation du tableau
	//remplissage du tablau
	for(int j=0;j<n;j++) {//permet de parleur les valeur jusqua n-1
		System.out.print("veuillez saisir la " + j + "valeur ");//affiche un message 
       tab[j]=sc.nextInt();}//permet de saisir la valeur j qui sera stocké au tableau
	for(int j=0;j<n;j++) {	//permet de parcourir le boucle est affiché le contenu du tableau
		System.out.println("les valeurs sont tab["+j+"]= "+tab[j]);}//affiche les valeurs saisies dans le tableau
	System.out.print("veuillez saisir la valeur de k ");//affichage
	int k = sc.nextInt();//permet de saisir la valeur k
	int proche = tab[0]; //on prend la premier valeur au départ
	for(int j=0;j<n;j++) {//parcourir les autres valeurs
		int d_tab =  tab[j] - k ;//distancd le tableau et la valeur saisie
		if (d_tab <0) {d_tab= - d_tab;} //on rend la distance positive 
		int d_proche= proche -k ;//distance entre la valeur la plus proche qui était initialisé 
		                         //par la premier valeur du tableau et la valeur k
		if(d_proche <0) {d_proche= - d_proche;}//on rend la distance positve 
		if (d_tab < d_proche) {//on compare les deux distances
			proche = tab[j];}//on met à jour la valeur la plus proche 
	                      }
	System.out.println(k+ " est plus proche de " +proche);//on affiche la valeur la plus proche
	for(int i =0;i<tab.length;i++) { //boucle principale repete le tri
		for(int j=0;j<tab.length-i-1;j++) {//boucle secondaire compare les valeurs voisins
			if (tab[j]>tab[j+1]) {//si l'ordre est incorrecte
				int echange = tab[j];//echange
				tab[j]=tab[j+1];
				tab[j+1]=echange;}
		}
	}
	System.out.print("le tableau trié est ");//affichage du tableau trié
    for(int t:tab) {//permet de parcourir chaque élément du tableau 
    	System.out.println(t);}
 System.out.println("la valeur minimale est "+ tab[0]);//0 inndice du premier element 
 System.out.println("la valeeur maximale est "+tab[n-1]);//n-1 indice du dernier élément
 System.out.println("donner la valeur de V ");//pour donner la valeur de 
 int V = sc.nextInt();//saisir v
 int[] nouveau = new int [n+1];//nouveau tableaude taille n+1
 int i=0;//initialisation
 while(i<n && tab[i] < V) {//copie toutes les valeurs  qui sont < V
	 nouveau[i]= tab[i];//on copie tab[i]sur le nouveau tableau 
	 i++;}//avance à l'indice suivant
 nouveau[i]=V;//insére la valeur
 while(i<n) {//on copie les valeurs restantes du tableau initiale
	 nouveau[i+1]=tab[i];//on les met une case plus loin(+1) car v a deja occupé la case i
	 i++;}//passer à l'élément suivant du tableau initaile
	 System.out.println("nouveau tableau est ");//affiche ce message
	 for(int t: nouveau) {//parcourir chaque élément du nouveau tableau
		 System.out.print(t+" ");//affiche la valeur de t
	 }
 }
	}
