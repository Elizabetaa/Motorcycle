package com.example.demo.web;

import com.example.demo.model.binding.AddNewsBindingModel;
import com.example.demo.model.service.AddNewsServiceModel;
import com.example.demo.model.view.InquiryViewModel;
import com.example.demo.service.InquiryService;
import com.example.demo.service.NewsService;
import com.example.demo.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController {
    private final InquiryService inquiryService;
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final NewsService  newsService;

    public AdminController(InquiryService inquiryService, ModelMapper modelMapper, UserService userService, NewsService newsService) {
        this.inquiryService = inquiryService;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.newsService = newsService;
    }


    @GetMapping("/actions")
    public String adminActions(Model model){

        List<InquiryViewModel> allInquiriesForService = inquiryService.findAllInquiriesForService();
        model.addAttribute("service", allInquiriesForService);
        if (allInquiriesForService.size()==0){
            model.addAttribute("emptyServiceInquiries",true);
        }
        List<InquiryViewModel> allInquiriesForTuning = inquiryService.findAllInquiriesForTuning();
        model.addAttribute("tuning", allInquiriesForTuning);
        if (allInquiriesForTuning.size()==0){
            model.addAttribute("emptyTuningInquiries",true);
        }
        return "adminActions";
    }


    @PostMapping("/addNews")
    public String addNews(@Valid AddNewsBindingModel addNewsBindingModel,
                          BindingResult bindingResult, RedirectAttributes redirectAttributes, Principal principal){

        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("addNewsBindingModel", addNewsBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.addNewsBindingModel",bindingResult);

            return "redirect:/addNews";
        }
        AddNewsServiceModel addNewsServiceModel = this.modelMapper.map(addNewsBindingModel, AddNewsServiceModel.class);
        addNewsServiceModel.setAuthor(this.userService.findByEmail(principal.getName()));
        addNewsServiceModel.setAddedOn(LocalDateTime.now());

        this.newsService.addNews(addNewsServiceModel);

        return  "redirect:/news/all";
    }
}
