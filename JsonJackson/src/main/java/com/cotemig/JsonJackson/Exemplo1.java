package com.cotemig.JsonJackson;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.cotemig.JsonJackson.entity.Pessoa;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Exemplo1 {
	
	public static void execute() throws JsonParseException, JsonMappingException, IOException {
		
		Pessoa p1 = new Pessoa(1, "Lucas");
		Pessoa p2 = new Pessoa(2, "Maria");
		Pessoa p3 = new Pessoa(3, "Jose");
    	
    	List<Pessoa> pessoas = new ArrayList<Pessoa>();
    	pessoas.add(p1);
    	pessoas.add(p2);
    	pessoas.add(p3);
    	
    	// Serialize
    	String json = serialize(pessoas);
    	System.out.println(json);
    	
    	// Deserialize
    	List<Pessoa> pessoasDeserialized = deserialize(json);
    	System.out.println(pessoasDeserialized); 
	}
	
	private static List<Pessoa> deserialize(String json) throws JsonParseException, JsonMappingException, IOException {
        
    	ObjectMapper mapper = new ObjectMapper();
    	
    	return mapper.readValue(json, new TypeReference<List<Pessoa>>(){});
    }
    
    private static String serialize(List<Pessoa> pessoas) throws JsonGenerationException, JsonMappingException, IOException {
    	
    	ObjectMapper mapper = new ObjectMapper();
    	
    	// Serialize
    	StringWriter writer = new StringWriter();
        mapper.writeValue(writer, pessoas);
        
        return writer.toString();
    }
}
