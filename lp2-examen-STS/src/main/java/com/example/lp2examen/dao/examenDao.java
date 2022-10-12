package com.example.lp2examen.dao;

import java.util.List;
import java.util.Map;

public interface examenDao {

	List<Map<String, Object>> readCantClienteRegion();
	List<Map<String, Object>> readCantOrdenTerritorio();
}
