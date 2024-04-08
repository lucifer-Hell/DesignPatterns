package DesignPatterns.StrategyPattern;

public class FileEncryptor {
    EncrpytionStrategy encrpytionStrategy;

    FileEncryptor(EncrpytionStrategy encrpytionStrategy){
        this.encrpytionStrategy=encrpytionStrategy;
    }

    public void encryptFile(){
        encrpytionStrategy.encrypt();
    }
    public void setEncrpytionStrategy(EncrpytionStrategy encrpytionStrategy){
        this.encrpytionStrategy=encrpytionStrategy;
    }
}
