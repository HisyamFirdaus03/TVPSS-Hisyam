package com.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class HomeController {
	
	@RequestMapping("/school-review")
	@ResponseBody()
	public ModelAndView schoolReview() {
		ModelAndView modelAndView = new ModelAndView("viewAdminReview");
		return modelAndView;
	}
	
	@RequestMapping("/school-submission")
	@ResponseBody()
	public ModelAndView schoolVersionCheck() {
		ModelAndView modelAndView = new ModelAndView("viewVersionCheck");
		return modelAndView;
	}
	
	@RequestMapping("/school-profile")
	@ResponseBody()
	public ModelAndView schoolProfile() {
		ModelAndView modelAndView = new ModelAndView("viewSchoolProfile");
		return modelAndView;
	}
	
	@RequestMapping("/school-list")
	@ResponseBody()
	public ModelAndView schoolList() {
		ModelAndView modelAndView = new ModelAndView("viewSchoolList");
		return modelAndView;
	}
	
	@RequestMapping("/crew-resource")
	@ResponseBody()
	public ModelAndView crewResource() {
		ModelAndView modelAndView = new ModelAndView("crewResourcePage");
		return modelAndView;
	}
	
	@RequestMapping("/video-validation")
	@ResponseBody()
	public ModelAndView validateVideo() {
		ModelAndView modelAndView = new ModelAndView("validateVideo");
		return modelAndView;
	}
	
	@RequestMapping("/video-upload")
	@ResponseBody()
	public ModelAndView uploadVideo() {
		ModelAndView modelAndView = new ModelAndView("uploadVideo");
		return modelAndView;
	}
	
	@RequestMapping("/video-library-student")
	@ResponseBody()
	public ModelAndView videoLibraryStudent() {
		ModelAndView modelAndView = new ModelAndView("videoLibraryStudent");
		return modelAndView;
	}
	
	@RequestMapping("/video-library-teacher")
	@ResponseBody()
	public ModelAndView videoLibraryTeacher() {
		ModelAndView modelAndView = new ModelAndView("videoLibraryTeacher");
		return modelAndView;
	}
	
	@RequestMapping("/view-video")
	@ResponseBody()
	public ModelAndView viewVideo() {
		ModelAndView modelAndView = new ModelAndView("viewVideo");
		return modelAndView;
	}
	
	@GetMapping("/") 
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("crewResourcePage");
		modelAndView.addObject("message", "Welcome to the TVPSS app!");
		return modelAndView;
	}
}