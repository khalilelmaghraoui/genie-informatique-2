package com.ensah.core.dao;

import com.ensah.core.bo.PieceJustificative;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class PieceJustificativeDaoImpl extends HibernateSpringGenericDaoImpl<PieceJustificative , Long> implements IPieceJustificativeDao {

	public PieceJustificativeDaoImpl( ) {
		super(PieceJustificative.class);
		// TODO Auto-generated constructor stub
	}

}
