package DesignPatterns.StrategyPattern;

import DesignPatterns.StrategyPattern.EncryptionStrategies.MD5Strategy;
import DesignPatterns.StrategyPattern.EncryptionStrategies.SHA256Strategy;

import java.util.Scanner;

public class TestEncrpytion {
    public static void main (String args[]){
        // Generate runtime strategy for file encryption
        // asiging defaut encryptor
        FileEncryptor fileEncryptor=new FileEncryptor(new MD5Strategy());
        Scanner scanner=new Scanner(System.in);
        int strategyNo=-1;
        do{
            strategyNo=scanner.nextInt();
            fileEncryptor.setEncrpytionStrategy(getEncryptionStrategy(strategyNo));
            System.out.println("starting encryption ");
            fileEncryptor.encryptFile();
        }while (strategyNo!=-1);
    }

    private static EncrpytionStrategy getEncryptionStrategy(int startegyNo) {
        return switch (startegyNo) {
            case 1 -> new MD5Strategy();
            case 2 -> new SHA256Strategy();
            default -> null;
        };
    }
}
