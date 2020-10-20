package com.hibernate.spring_boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hibernate.spring_boot.Model.Sanpham;
import com.hibernate.spring_boot.Model.SpReponsitory;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Autowired
	SpReponsitory sp;

	@GetMapping
	public String getSearch(@RequestParam String key, ModelMap modelMap) {
		if (key == "") {
			return "redirect:./home";
		} else {
			List<Sanpham> spe = sp.findByName(key);

			modelMap.addAttribute("list", spe);

			return "home";
		}

	}
}
