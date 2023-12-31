package com.opus.recipeapp.springbootrecipeapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.opus.recipeapp.springbootrecipeapp.model.Ingredients;
import com.opus.recipeapp.springbootrecipeapp.repository.IngredientsRepository;

@Service
public class DatabaseStart implements CommandLineRunner{

	private final IngredientsRepository ingredientsRepo;
	
	public DatabaseStart(IngredientsRepository ingredientsRepo) {
		this.ingredientsRepo = ingredientsRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Ingredients cebola = new Ingredients("oignon");
		Ingredients chicoria = new Ingredients("chicorée");
		Ingredients banana = new Ingredients("banane");
		Ingredients uva = new Ingredients("Raisin");
		Ingredients leite = new Ingredients("Lait");
		Ingredients chocolate = new Ingredients("Chocolat");
		Ingredients abobora = new Ingredients("Potiron ou Courge");
		Ingredients batata = new Ingredients("Pomme de terre");
		Ingredients couveflor = new Ingredients(" Chou-fleur");
		Ingredients beterraba = new Ingredients("Betterave");
		Ingredients pimentao = new Ingredients("Poivron");
		Ingredients feijao = new Ingredients("Haricot");
		Ingredients quiabo = new Ingredients("Gombo");
		Ingredients lentilha = new Ingredients("Lentille");
		Ingredients mandioca = new Ingredients("Manioc");
		Ingredients pepino = new Ingredients("Concombre");
		Ingredients batatadoce = new Ingredients("Patate douce");
		Ingredients chuchu = new Ingredients("Chayote");
		Ingredients inhame = new Ingredients("Igname");	
		
		ingredientsRepo.save(cebola);
		ingredientsRepo.save(chicoria);
		ingredientsRepo.save(banana);
		ingredientsRepo.save(uva);
		ingredientsRepo.save(leite);
		ingredientsRepo.save(chocolate);
		ingredientsRepo.save(abobora);
		ingredientsRepo.save(batata);
		ingredientsRepo.save(couveflor);
		ingredientsRepo.save(beterraba);
		ingredientsRepo.save(pimentao);
		ingredientsRepo.save(feijao);
		ingredientsRepo.save(quiabo);
		ingredientsRepo.save(lentilha);
		ingredientsRepo.save(mandioca);
		ingredientsRepo.save(pepino);
		ingredientsRepo.save(batatadoce);
		ingredientsRepo.save(chuchu);
		ingredientsRepo.save(inhame);
		ingredientsRepo.save(abobora);
	}
}
