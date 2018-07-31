package com.yi.design.facade.example2;

public class Faceda {

	public void generate(){
		IDao  dao = new Dao();
		dao.generade();
		
		IBussiness bus = new BusinessImpl();
		bus.generade();
		
		IModel model = new ModelImpl();
		model.generade();
		
	}
}
