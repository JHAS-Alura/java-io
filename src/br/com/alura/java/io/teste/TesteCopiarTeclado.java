package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarTeclado {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com Arquivo
		InputStream fis = System.in; //new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		//Fluxo de Saida com Arquivo
		OutputStream fos = System.out; //new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while(linha != null && !linha.isEmpty()) {			
			bw.write(linha);
			bw.newLine();
			bw.flush(); //escreve conforme vc vai escrevendo
			linha = br.readLine();	
		}

		br.close();
		bw.close();

	}

}
