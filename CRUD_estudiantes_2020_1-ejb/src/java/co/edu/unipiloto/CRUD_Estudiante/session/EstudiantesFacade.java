/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.CRUD_Estudiante.session;

import co.edu.unipiloto.CRUD_Estudiante.entity.Estudiantes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fabit
 */
@Stateless
public class EstudiantesFacade extends AbstractFacade<Estudiantes> implements EstudiantesFacadeLocal {

    @PersistenceContext(unitName = "CRUD_estudiantes_2020_1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudiantesFacade() {
        super(Estudiantes.class);
    }
    
}
