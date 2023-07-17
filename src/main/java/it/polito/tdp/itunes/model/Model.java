package it.polito.tdp.itunes.model;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.itunes.db.ItunesDAO;

public class Model {
	
	private Graph<Album,DefaultEdge> grafo;
	
	public void creaGrafo(Double duration) {
		
		this.grafo= new SimpleGraph<Album, DefaultEdge>(DefaultEdge.class);
		
		ItunesDAO dao = new ItunesDAO();
		Graphs.addAllVertices(this.grafo, dao.getAlbumsWithDuration(duration));
		
		
		
		
	}
	
	
}
