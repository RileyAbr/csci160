/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Files;

/**
 *
 * @author riley
 */
public class Testing {
    
    public static void main(String[] args) {
        
        Cryptography.encode("files/cryptography/testmessage.txt", 3);
        Cryptography.decode("files/cryptography/testmessage-encrypted.txt", 3);
        //It works!
        
    }
    
}
