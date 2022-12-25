package com.bayu.student.controller;

import com.bayu.student.dto.UserFormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    // handler method to handle user registration page request
    @GetMapping("register")
    public String userRegistrationPage(Model model) {
        // Empty UserFormDTO model object to store form data
        UserFormDTO userFormDTO = new UserFormDTO();
        model.addAttribute("userForm", userFormDTO);

        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);
        return "register-form";
    }

    // handler method to handle user registration form submission request
    @PostMapping("register/save")
    public String submitForm(Model model,
                             @ModelAttribute("userForm") UserFormDTO userFormDTO) {

        model.addAttribute("userForm", userFormDTO);
        return "register-success";
    }


}
