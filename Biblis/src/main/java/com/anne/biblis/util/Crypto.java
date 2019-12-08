/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anne.biblis.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;


public class Crypto {

    public static String encodeSHA256(String input)
            throws UnsupportedEncodingException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(input.getBytes("UTF-8"));
            BigInteger no = new BigInteger(1, messageDigest);

            System.out.println(">>> input: " + input
                    + "\nSHA256 (b64): " + DatatypeConverter
                            .printBase64Binary(messageDigest)
                    + "\nSHA256 (hex): " + String.format("%064x", no));

            return String.format("%064x", no);

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Crypto.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static String encodeSHA512(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            return String.format("%0128x", no);

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Crypto.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
