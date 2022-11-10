package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguagesService;
import Kodlama.io.Kodlama.io.Devs.dataAcces.abstracts.LanguagesRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Languages;

@RestController // bu ifade ile erişim katmanının olduğu belirlenir
@RequestMapping("/api/languages") // buraya ulaşmak için prokol adresi belirlenir.(adresin sonuna bu ifadeyi
									// yazdığında bu sınıf çıkacağını belirtiriz.
public class LanguagesControllers {

	private LanguagesService languagesService;

	@Autowired
//istek controllere yapılır.
	public LanguagesControllers(LanguagesService languagesService) {
		this.languagesService = languagesService;
	}

	@GetMapping("/getAll")
	public List<Languages> listLanguages() {
		return languagesService.getAll();
	}

}
