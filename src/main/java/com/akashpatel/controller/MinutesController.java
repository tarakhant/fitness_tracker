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
		// return "forward:addmoreminutes.html";
		// return "redirect:addmoreminutes.html";

	}

	// @RequestMapping(value = "/addmoreminutes")
	// public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
	//
	// System.out.println("EXERCISING: " + exercise.getMinutes());
	//
	// return "addMinutes";
	// }

}
