package com.naresh.movieapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@GetMapping("/create")
	public String create() {
		System.out.println("MovieController->create");
		return "addmovie"; // go to addmovie.jsp
	}

	@GetMapping("/save")
	public String save() {
		System.out.println("MovieController->save");
		return "redirect:/movies/list"; // After saving movie, redirect to movielist 
	}

	@GetMapping("/show")
	public String show() {
		System.out.println("MovieController->show");
		return "showmovie"; // go to showmovie.jsp
	}
	
	@GetMapping("/edit")
	public String edit() {
		System.out.println("MovieController->edit");
		return "editmovie"; // go to editmovie.jsp
	}

	@GetMapping("/list")
	public String list() {
		System.out.println("MovieController->list");
		return "movielist"; // go to movieList.jsp
	}

	@GetMapping("/delete")
	public String delete() {
		System.out.println("MovieController->delete");
		return "redirect:/movies/list"; // After deleting movie, redirect to movielist 
	}

	@GetMapping("/update")
	public String update() {

		return "redirect:/movies/list"; // After updating movie, redirect to
										// movie list page
	}
}
