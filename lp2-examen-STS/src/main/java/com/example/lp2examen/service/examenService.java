package com.example.lp2examen.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2examen.dao.examenDao;
import com.example.lp2examen.daoImpl.examenDaoImp;

@Service
public class examenService implements examenDao{

	@Autowired
	private examenDaoImp examenDaoImp;

	@Override
	public List<Map<String, Object>> readCantClienteRegion() {
		// TODO Auto-generated method stub
		return examenDaoImp.readCantClienteRegion();
	}

	@Override
	public List<Map<String, Object>> readCantOrdenTerritorio() {
		// TODO Auto-generated method stub
		return examenDaoImp.readCantOrdenTerritorio();
	}

	
}
