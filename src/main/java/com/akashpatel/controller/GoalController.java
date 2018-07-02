package com.akashpatel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.akashpatel.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {

	@RequestMapping(value = "addgoal", method = RequestMethod.GET)
	public String addGoal(Model model) {

		Goal gg = new Goal();
		gg.setMinutes(10);

		model.addAttribute("goal", gg);

		return "addGoal";
	}

	@RequestMapping(value = "addgoal", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("goal") Goal goal) {

		System.out.println("Minutes Updated: " + goal.getMinutes());

		return "redirect:addminutes.html";
	}
}
