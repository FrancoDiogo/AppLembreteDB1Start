package br.com.db1.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import br.com.db1.dao.impl.LembreteDao;

@Path("lembrete")
public class LembreteRest {
		
	private LembreteDao dao = new LembreteDao();
	

	/*
	 * @GET
	 * 
	 * @Path("inserir/{parametro}") public Response
	 * exibirUmaMensagem(@PathParam("parametro") String nome) { return
	 * Response.status(200).entity(dao.inserir(nome) + nome).build(); }
	 */

	@GET
	@Path("inserir")
	public Response helloWorld() {
		dao.inserir("aaa");
	return Response.status(200).entity("ok").build();
	}
}
