package br.com.anotacao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        ClasseTabela classeTabela = new ClasseTabela();

        getValueAnnotation(classeTabela);


    }

    public static void getValueAnnotation(ClasseTabela clazz){
        Field[] fields = clazz.getClass().getDeclaredFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(Tabela.class)){
                Tabela tabela = field.getAnnotation(Tabela.class);
                String nomeTabela = tabela.value();
                System.out.println(nomeTabela);
            }else {
                System.out.println("nenhuma anotação encontrada");
            }
        }
    }
}

