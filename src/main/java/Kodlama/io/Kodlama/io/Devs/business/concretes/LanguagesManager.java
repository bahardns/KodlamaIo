package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import Kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguagesRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@Service //bu sınıf bir businnes nesnesidir.
public class LanguagesManager implements LanguagesService {
@Autowired
	public LanguagesManager(LanguagesRepository languagesRepository) {
		super();
		this.languagesRepository = languagesRepository;
	}

	private LanguagesRepository languagesRepository;

	@Override
	public List<Languages> getAll() {
		return languagesRepository.listLanguages();
	}

	@Override
	public void create(Languages languages) throws Exception {
		if (languages.getName().isEmpty()) {
			throw new Exception("programlama dili boş olamaz.");
		}
		for (Languages languages1 : getAll()) {
			if (languages1.getName() == languages.getName()) {
				throw new Exception("programlama ismi tekrar edemez.");
			}
			languagesRepository.add(languages);
		}

	}

	@Override
	public Languages getById(int id) throws Exception {
		return languagesRepository.findById(id);

	}

	@Override
	public void update(Languages languages, int id) throws Exception {
		if(languagesRepository.findById(id)==null){
			throw new Exception ("programlama dili veritabanında mevcut değil.");
		}
			languagesRepository.update(languages, id);
	}

	@Override
	public void delete(int id) throws Exception {
		languagesRepository.delete(id);

	}

}
