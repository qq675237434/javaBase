package com.yi.design.facade.example1;

public class ClientApp {

	public static void main(String[] args) {
		/*IDao  dao = new Dao();
		dao.generade();
		
		IBussiness bus = new BusinessImpl();
		bus.generade();
		
		IModel model = new ModelImpl();
		model.generade();*/
		
		Faceda facede = new Faceda();
		facede.generate();
		
		
	}
}
