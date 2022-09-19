package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.PetService;

@Controller
public class PetController
{
	private final PetService petService;

	public PetController(PetService petService)
	{
		super();
		this.petService = petService;
	}
	
	public String whichPetIsTheBest()
	{
		return petService.getPetType();
	}
}
