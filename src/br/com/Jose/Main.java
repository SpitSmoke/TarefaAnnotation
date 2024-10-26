package br.com.Jose;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        Class<Usuario> classeUsuario = Usuario.class;

        if (classeUsuario.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = classeUsuario.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela: " + tabela.valor());
        } else {
            System.out.println("A anotação Tabela não está presente.");
        }
    }
}

