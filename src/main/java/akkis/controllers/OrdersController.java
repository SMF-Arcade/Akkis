package akkis.controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import akkis.AkkisEjb;
import akkis.Tilaus;

import java.sql.Timestamp;
import java.util.List;
import javax.ejb.EJB;

@ManagedBean
public class OrdersController {

	// EJB-komponentti sisältää datan tallennuksen ja haun tietokannasta JPA:lla
	@EJB
	private AkkisEjb tuoteEjb;

	public List<Tilaus> getOrders() {
		return tuoteEjb.getOrders();
	}
}
