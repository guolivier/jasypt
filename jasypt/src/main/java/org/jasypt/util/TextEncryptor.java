package org.jasypt.util;

import org.jasypt.encryption.pbe.PBEWithMD5AndDESStringEncryptor;

public final class TextEncryptor {

    
    private PBEWithMD5AndDESStringEncryptor encryptor = null;
    
    
    public TextEncryptor() {
        this.encryptor = new PBEWithMD5AndDESStringEncryptor();
    }
    
    public synchronized void setPassword(String password) {
        encryptor.setPassword(password);
    }

    
    public synchronized String encrypt(String message) {
        return encryptor.encrypt(message);
    }
    
    public synchronized String decrypt(String encryptedMessage) {
        return encryptor.decrypt(encryptedMessage);
    }
    
}
