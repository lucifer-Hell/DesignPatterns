package DesignPatterns.StrategyPattern.EncryptionStrategies;

import DesignPatterns.StrategyPattern.EncrpytionStrategy;

public class SHA256Strategy implements EncrpytionStrategy {
    @Override
    public void encrypt() {
        System.out.println("Encrpyting using SHA 256");
    }
}
