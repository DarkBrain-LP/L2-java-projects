/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M@nU_LP
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copieFichier {
    public static void main(String args[]) {
try {
copierFichier("source.txt", "copie.txt");
} catch (IOException e) {
e.printStackTrace();
}
}
public static void copierFichier(String source, String destination) throws IOException 
{
FileInputStream fis = null;
FileOutputStream fos = null;
try {
byte buffer[] = new byte[1024];
int taille = 0;
fis = new FileInputStream(source);
fos = new FileOutputStream(destination);
while ((taille = fis.read(buffer)) != −1) {
System.out.println(taille);
fos.write(buffer, 0, taille);
}
} finally {
if (fis != null) {
try {
fis.close();
} catch (IOException e) {
}
}
if (fos != null) {
try {
fos.close();
} catch (IOException e) {
}
}
}
}

    
}
