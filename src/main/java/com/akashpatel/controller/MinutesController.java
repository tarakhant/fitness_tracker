package com.akashpatel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akashpatel.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addminutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("EXERCISE: " + exercise.getMinutes());
		return "addMinutes";
	}

}
