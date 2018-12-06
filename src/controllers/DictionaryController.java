package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String getForm (){
        return "form";
    }

    @PostMapping("/dictionary")
    public String postFrom(@RequestParam String vn, Model model){
        Map<String, String> map = new HashMap<>();
        map.put("hello", "Xin chào");
        map.put("goodbye", "Tạm biệt");
        map.put("steadily", "Đều đều");
        map.put("dramatically", "Mạnh mẽ");
        String result = map.get(vn);
        if (result == null){
            model.addAttribute("search", vn);
            return "error";
        } else {
            model.addAttribute("result", result);
            model.addAttribute("search", vn);
            return "form";
        }
    }
}
