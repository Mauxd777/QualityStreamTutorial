package com.qualitystrem.tutorial;

public class Principal {
    public static void main(String[] args) {
        
        GoogleSearchTests tests = new GoogleSearchTests();
        tests.SetUp();
        tests.testeGooglePage();
        tests.tearDow();
    }
    
}
