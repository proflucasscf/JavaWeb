package com.cotemig.JsonJackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class App 
{	
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
    	Exemplo1.execute(); // Pessoa
    	Exemplo2.execute(); // Time / Atletas
    	Exemplo3.execute(); // Faculdade

    }
}