package com.tara.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tara.model.Goal;

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
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal,BindingResult result) {
		System.out.println("result has error:"+result.hasErrors());
		if(result.hasErrors())
		{
			return "addGoal";
		}

		System.out.println("Minutes Updated: " + goal.getMinutes());

		return "redirect:addminutes.html";
	}
}
