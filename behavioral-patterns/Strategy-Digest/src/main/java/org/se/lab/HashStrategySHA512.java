package org.se.lab;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

class HashStrategySHA512
    implements HashStrategy
{
    @Override
    public String toHashString(String message)
    {
        try
        {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-512");
            algorithm.update(message.getBytes("UTF-8"));
            byte[] hash = algorithm.digest();
            return Hex.encodeHexString(hash);
        }
        catch (NoSuchAlgorithmException | UnsupportedEncodingException e)
        {
            throw new IllegalStateException(e);
        }       
    }
}
