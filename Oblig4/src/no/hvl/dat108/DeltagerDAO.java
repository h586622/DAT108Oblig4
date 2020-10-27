package no.hvl.dat108;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DeltagerDAO {
	
	@PersistenceContext(name = "deltagerPU")
    private EntityManager em;
	
	public List<Deltager> hentAlleDeltagere() {
		return em.createQuery("SELECT b FROM Bruker b", Deltager.class).getResultList();
	}
	
	public Deltager hentBruker(String mobilnummer) {
		return em.find(Deltager.class, mobilnummer);
	}

	public void lagreNyBruker(Deltager nyDeltager) {
		em.persist(nyDeltager);
	}
}

