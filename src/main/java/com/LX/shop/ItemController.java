package com.LX.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;
    private final ItemService itemService;

    @GetMapping("/list")
    String list(Model model){
        List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);
        return "list.html";
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add")
    String addPost(@RequestParam String title,
                   @RequestParam Integer price
        ){
        itemService.saveItem(title, price);

        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    String detail(@PathVariable Integer id, Model model){

            Optional<Item> result = itemRepository.findById(id);
            if(result.isPresent()){
                model.addAttribute("data", result.get());
                return "detail.html";
            }else {
                return "redirect:/list";
            }
//        try{
//            Optional<Item> result = itemRepository.findById(id);
//            if(result.isPresent()){
//                model.addAttribute("data", result.get());
//                return "detail.html";
//            }else {
//                return "redirect:/list";
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            return ResponseEntity.status(400).body("니잘못");
//        }

//        @ExceptionHandler(Exception.class)
//        public void errorHandler(){
//            return ResponseEntity.status().body();
//        }




    }

}
