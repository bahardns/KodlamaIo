package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

public interface LanguagesService {

	List<Languages> getAll();

	void create(Languages languages) throws Exception;

	 Languages getById(int id) throws Exception;

	void update( Languages languages,int id) throws Exception;

	void delete(int id) throws Exception;

}
