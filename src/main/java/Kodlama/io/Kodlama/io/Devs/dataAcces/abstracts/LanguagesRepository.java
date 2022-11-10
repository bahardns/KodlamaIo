package Kodlama.io.Kodlama.io.Devs.dataAcces.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;


public interface LanguagesRepository {

	void update( Languages languages ,int id)throws Exception;
	void delete(int id)throws Exception;
	Languages findById(int id) throws Exception ;
	List<Languages> listLanguages();
	void add(Languages languages) throws Exception;
	
	
}
