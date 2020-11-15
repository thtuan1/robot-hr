package fpt.fis.Controller;

import fpt.fis.DTO.UserDTO;
import fpt.fis.Model.User;
import fpt.fis.Sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getAll")
    public List<UserDTO> getAll(){
        return  userService.getAll();
    }
    @PostMapping(value = "/updatedUser")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        User user1=userService.Updated(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }
    @PostMapping(value = "/AddUser")
    public  ResponseEntity <?>AddUser(@RequestBody User user){
        User user1=userService.Add(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }
    @PostMapping(value = "/deletedUser")
    public  ResponseEntity<?>deleted(@RequestBody User user){
        User user1=userService.Deleted(user);
        return new ResponseEntity<>(user1, HttpStatus.OK);
    }
}
