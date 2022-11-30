package br.com.questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, FullStackException {



        Stack<String> nomes_pilha = new Stack();


        Scanner scan = new Scanner(new File("./nomes.txt"));
        while (scan.hasNextLine()){
            nomes_pilha.push(scan.nextLine());
        }
    
        ArrayStack y = new ArrayStack();
        while(y.size() > 0){
            y.push(nomes_pilha.pop());
        }

        System.out.println(y);

    }

}
