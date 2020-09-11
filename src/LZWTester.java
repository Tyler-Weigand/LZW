import java.io.*;
public class LZWTester {
	public static void main (String [] args) throws IOException{
		LZWEncoder encoder = new LZWEncoder();
		encoder.encode("big.txt", "out.txt");
	}
}