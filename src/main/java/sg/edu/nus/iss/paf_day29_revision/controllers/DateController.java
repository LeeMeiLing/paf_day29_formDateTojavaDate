package sg.edu.nus.iss.paf_day29_revision.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class DateController {
    
    @GetMapping("/date")
    public String getDate(@RequestParam String dueDate, @RequestParam String dateTime) throws ParseException{

        System.out.println(dueDate);
        System.out.println(dateTime);

        // Date Format 2023-03-20
        // yyyy-MM-dd
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(dueDate);
        System.out.println(formatter.format(date));

        // DateTime Format 2023-03-20T11:30
        // yyyy-MM-ddTHH:mm
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date datetime = dateTimeFormatter.parse(dateTime);
        System.out.println(dateTimeFormatter.format(datetime));

        return "redirect:/";
    }
}


