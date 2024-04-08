package DesignPatterns.StrategyPattern.EncryptionStrategies;

import DesignPatterns.StrategyPattern.EncrpytionStrategy;

public class MD5Strategy implements EncrpytionStrategy {
    @Override
    public void encrypt() {
        System.out.println("Encrpyting using md5");
    }
}
