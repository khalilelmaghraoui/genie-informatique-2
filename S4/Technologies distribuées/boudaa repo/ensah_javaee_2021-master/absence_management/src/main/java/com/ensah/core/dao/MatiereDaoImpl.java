package com.ensah.core.dao;

import com.ensah.core.bo.Matiere;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class MatiereDaoImpl extends HibernateSpringGenericDaoImpl<Matiere , Long> implements IMatiereDao {

	public MatiereDaoImpl() {
		super(Matiere.class);
	}

}
