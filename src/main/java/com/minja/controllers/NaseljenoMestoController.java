package com.minja.controllers;

import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.minja.entities.NaseljenoMesto;
import com.minja.services.NaseljenoMestoService;

@RestController
public class NaseljenoMestoController {
	
	@Autowired
	NaseljenoMestoService naseljenoMestoService;
		
	@RequestMapping(value = "/rest/mesto/getall", method = RequestMethod.GET)
	public Collection<NaseljenoMesto> getMesta() throws IOException {
		return naseljenoMestoService.getMesta();
	}
	
}
