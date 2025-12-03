import java.util.*;
public class Matrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);//Pour lire les entrées
     System.out.print("veuillez saisIr la taille du matrice carré ");//affiche un message 
     int m=sc.nextInt();//permet de saisir la taille du matrice
     int[][]matrice=new int [m][m];//création d'une matrice de taile m*m
     System.out.println("veuillez saisir  les valeurS dU matrice qui sont au nombre de " + m*m + " valeurs");//affichage d'un message
     for(int j=0;j<m;j++) {//permet de parcourir les lignes du matrice
    	 for(int i=0;i<m;i++) {//permet de parcourir les colonnes du matrice
    	 matrice[j][i]=sc.nextInt();}//permet de remplir cahque colonnes et lignes
     }	
System.out.println("matrice du haut en bas à coté et en haut sont ");//affiche un message
for(int j=0;j<m;j++) {
	for(int i=0;i<m;i++) {
		if(i==j || i+j==m-1 || matrice[j][i]==2) { System.out.print(" - ");//condition à exclure les diagonales principale
		//secondair et la valeur 2
		}else {
		System.out.printf("%4d",matrice[j][i]);}//affiche avec un allinement
	}
	 System.out.println();//une nouvelle aprés chaque rangement
}
sc.close();//femeture du scanner pour libirer de ressource

	}
	}

