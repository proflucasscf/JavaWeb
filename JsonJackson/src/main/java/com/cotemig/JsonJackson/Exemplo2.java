package com.cotemig.JsonJackson;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.cotemig.JsonJackson.entity.Atleta;
import com.cotemig.JsonJackson.entity.Time;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Exemplo2 {
	
	public static void execute() throws JsonGenerationException, JsonMappingException, IOException {
		
		Atleta a1 = new Atleta(1, "Cristiano Ronaldo", 34, "Futebol", "Atacante");
    	Atleta a2 = new Atleta(2, "Sergio Ramos", 33, "Futebol", "Zagueiro");
    	Atleta a3 = new Atleta(3, "Marcelo", 31, "Futebol", "Lateral");
    	
    	List<Atleta> atletas = new ArrayList<Atleta>();
    	atletas.add(a1);
    	atletas.add(a2);
    	atletas.add(a3);
    	
    	Time time = new Time(1, "Real Madrid", atletas);
    	
    	// Serialize
    	String json = serialize(time);
    	System.out.println(json);
    	
    	// Deserialize
    	Time timeDeserialized = deserialize(json);
    	System.out.println(timeDeserialized); 
	}
	
	private static Time deserialize(String json) throws JsonParseException, JsonMappingException, IOException {
        
    	ObjectMapper mapper = new ObjectMapper();
    	
    	return mapper.readValue(json, new TypeReference<Time>(){});
    }
    
    private static String serialize(Time time) throws JsonGenerationException, JsonMappingException, IOException {
    	
    	ObjectMapper mapper = new ObjectMapper();
    	
    	// Serialize
    	StringWriter writer = new StringWriter();
        mapper.writeValue(writer, time);
        
        return writer.toString();
    }
}
