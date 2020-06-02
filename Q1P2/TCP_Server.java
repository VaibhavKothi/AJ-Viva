import java.net.*;
import java.io.*;
import java.util.*;
class Server{
	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(8000);
			Socket s = ss.accept();
			StringBuffer reverse = new StringBuffer();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			StringBuffer str=new StringBuffer(dis.readUTF());
			System.out.println("Client say:"+str);
			DataOutputStream dos= new DataOutputStream(s.getOutputStream());
			reverse = str.reverse();
			StringBuffer ans = new StringBuffer(reverse);
			for (int i=0; i<reverse.length(); i++)
	         	{
	            		Character c = reverse.charAt(i);
	            		if (Character.isLowerCase(c))
	             	 		ans.replace(i, i+1, Character.toUpperCase(c)+"");
	            		else
	              			ans.replace(i, i+1, Character.toLowerCase(c)+"");
	         	}
	     String	r = ans.toString();
       s.close();
			 dos.writeUTF(r);
		}
    catch(IOException e){
        System.out.println("IO Error!");
		}
	}
}
