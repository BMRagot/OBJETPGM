import java.io.IOException;


public class HelloWorld {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("HelloWOrld");
		ImagePGM test=new ImagePGM("peppers512x512.pgm");
		test.afficheTable();
	}

}
