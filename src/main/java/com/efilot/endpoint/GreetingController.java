
package com.efilot.endpoint;




import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

@RestController
public class GreetingController {
    @Autowired
    private Validator validator;
    
    @RequestMapping(value = "/greeting", method = RequestMethod.POST,
                    consumes = {"application/x-yaml"})
    public ResponseEntity<Greeting> greeting(
            @Valid @RequestBody Greeting greeting
    ) {
        System.out.println(greeting.toString());
        ResponseEntity<Greeting> responseEntity = new ResponseEntity<>(greeting, HttpStatus.OK);
        return responseEntity;
    }
}
