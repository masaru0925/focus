/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package focus.service;

import focus.entity.口座科目;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author masaru
 */
@Stateless
@Path("focus.entity.\u53e3\u5ea7\u79d1\u76ee")
public class 口座科目FacadeREST extends AbstractFacade<口座科目> {
	@PersistenceContext(unitName = "w_focus_war_1.0-SNAPSHOTPU")
	private EntityManager em;

	public 口座科目FacadeREST() {
		super(口座科目.class);
	}

	@POST
        @Override
        @Consumes({"application/xml", "application/json"})
	public void create(口座科目 entity) {
		super.create(entity);
	}

	@PUT
        @Path("{id}")
        @Consumes({"application/xml", "application/json"})
	public void edit(@PathParam("id") Integer id, 口座科目 entity) {
		super.edit(entity);
	}

	@DELETE
        @Path("{id}")
	public void remove(@PathParam("id") Integer id) {
		super.remove(super.find(id));
	}

	@GET
        @Path("{id}")
        @Produces({"application/xml", "application/json"})
	public 口座科目 find(@PathParam("id") Integer id) {
		return super.find(id);
	}

	@GET
        @Override
        @Produces({"application/xml", "application/json"})
	public List<口座科目> findAll() {
		return super.findAll();
	}

	@GET
        @Path("{from}/{to}")
        @Produces({"application/xml", "application/json"})
	public List<口座科目> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
		return super.findRange(new int[]{from, to});
	}

	@GET
        @Path("count")
        @Produces("text/plain")
	public String countREST() {
		return String.valueOf(super.count());
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
}
