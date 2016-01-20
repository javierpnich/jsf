/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.elvisburger.comedor.Camarero;

/**
 *
 * @author javierenrique
 */
public class ListaEsperaController implements ModelDriven<Object> {

	private Camarero model = new Camarero("Johnny");
	private String id;

	public HttpHeaders create() {

		return new DefaultHttpHeaders("create");
	}

	public HttpHeaders destroy() {
		return new DefaultHttpHeaders("destroy");
	}

	public HttpHeaders show() {
		return new DefaultHttpHeaders("show").disableCaching();
	}

	public HttpHeaders update() {

		return new DefaultHttpHeaders("update");
	}

	public HttpHeaders index() {		
		return new DefaultHttpHeaders("index").disableCaching();
	}

	public Object getModel() {
//		return (list != null ? list : model);
            return this.model.getvListaEspera();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
//		if (id != null) {
//			this.model = MessageService.find(id);
//		}
//		this.id = id;
	}
}
