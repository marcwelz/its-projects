import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {

        String originalString = "Franz hat ein Geheimnis";
        String sha256hex = Hashing.sha256()
                .hashString(originalString, StandardCharsets.UTF_8)
                .toString();

        System.out.println(sha256hex);

        try {
            String text = "Franz hat ein Geheimnis";
            MessageDigest md= MessageDigest.getInstance( "SHA-512" );
            md.update( text.getBytes() );
            byte[] digest = md.digest();
            // Umwandlung byte-array in einen String
            for ( byte d : digest ) {
                String nextByte = Integer.toHexString( d & 0xFF);
                if (nextByte.length()<2){
                    nextByte = "0" + nextByte;
                }System.out.print(nextByte);
            }
            System.out.println();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
