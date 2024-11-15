package MGT.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class Controller {
    @GetMapping("/get")
    public String doGet(){
        return "Get Working";
    }

    @PostMapping("/post")
    public String doPost() {
        //TODO: process POST request        
        return "Post Working";
    }

    @PutMapping("/put")
    public String doPut() {
        //TODO: process PUT request
        
        return "Put is working";
    }
    
}
