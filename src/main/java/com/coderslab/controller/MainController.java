/**
 * 
 */
package com.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderslab.model.Category;

/**
 * @author Zubayer Ahamed
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping
	public @ResponseBody String loadIndexPage() {
		Category category = new Category();
		category.setCategoryId(1);
		return String.valueOf(category.getCategoryId());
	}
}
