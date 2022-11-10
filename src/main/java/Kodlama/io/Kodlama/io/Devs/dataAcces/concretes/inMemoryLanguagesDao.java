package Kodlama.io.Kodlama.io.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguagesRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@Repository // bu sınıf bir dataAcces nesnesidir.

public class inMemoryLanguagesDao implements LanguagesRepository {
	List<Languages> languages;

	public inMemoryLanguagesDao() {
		languages = new ArrayList<Languages>();
		languages.add(new Languages(1, "java"));
		languages.add(new Languages(2, "python"));
		languages.add(new Languages(3, "java"));
	};

	@Override
	public void update(Languages languages, int id) throws Exception {
		Languages language2 = findById(languages.getId());
		language2.setName(languages.getName());

	}

	@Override
	public void delete(int id) throws Exception {
		Languages lang2 = findById(id);
		languages.remove(lang2);
	}

	@Override

	public Languages findById(int id) throws Exception {
		for (Languages lang : languages) {
			if (lang.getId() == id) {
				return lang;
			}
		}

		throw new Exception("kayıt bulunamadı !!");
	}

	@Override
	public List<Languages> listLanguages() {
		return languages;
	}

	@Override
	public void add(Languages languages) throws Exception {

	};

}
