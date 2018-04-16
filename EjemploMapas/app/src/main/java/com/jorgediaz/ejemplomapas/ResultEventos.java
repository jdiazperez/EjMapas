package com.jorgediaz.ejemplomapas;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ResultEventos{

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("results")
	private List<Evento> results;

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setResults(List<Evento> results){
		this.results = results;
	}

	public List<Evento> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"ResultEventos{" + 
			"meta = '" + meta + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}