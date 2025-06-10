package com.mycompany.solartoyour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TXT {

    public static void salvar(String texto) throws IOException {

        FileWriter fw = new FileWriter("Usuario.txt");
        fw.write(texto);
        fw.close();
    }

    public static void salvar(int texto) throws IOException {

        FileWriter fw = new FileWriter("Usuario.txt");
        String text = String.valueOf(texto);
        fw.write(text);
        fw.close();
    }

    public static void deletar() {
        File fl = new File("Usuario.txt");
        fl.delete();
    }

    public static String ler() throws IOException{
        BufferedReader bf = new BufferedReader(new FileReader("Usuario.txt"));
        String linha = "";
        while ((linha = bf.readLine()) != null){
            System.out.println(linha);
            return linha;
        }
        return linha;
    }
}
