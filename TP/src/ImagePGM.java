import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * 
 * @author bastienmarichalragot
 *
 */
public class ImagePGM {

	protected String nom;
	protected Integer [][] table;
	protected String[] taille;
	protected Integer hauteur;
	protected Integer largeur;
	
	public  ImagePGM(String texte ) throws IOException{
		nom=texte;
		/*taille=size;*/
		System.out.println(nom);

		Reader reader = new FileReader(texte);
		BufferedReader in = new BufferedReader(reader);
		String ligne = in.readLine();
		ligne = in.readLine();
		ligne = in.readLine();
		
		taille = ligne.split(" ");
		largeur=Integer.parseInt(taille[0]);
		hauteur=Integer.parseInt(taille[1]);

		ligne = in.readLine();
		System.out.println(largeur);
		System.out.println(hauteur);
		
		table=new Integer[hauteur][largeur];
		for(int i=0;i<hauteur; i++){
			for(int j=0; j<largeur; j++){
				table[i][j]=Integer.parseInt(ligne);
				System.out.println(ligne);
				ligne=in.readLine();
			}
		}
		
		System.out.println(table[511][511]);
	}
	/**
	 * 
	 */
	public void afficheTable(){
		String row = null;
		for(int i=0;i<hauteur; i++){
			row=null;
			for(int j=0; j<largeur; j++){
				row=row +";" +table[i][j];
			}
			System.out.println(row);
		}
	}
}
