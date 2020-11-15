package fpt.fis.Sevice;

import fpt.fis.DTO.UserDTO;
import fpt.fis.Model.User;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();

    User Updated(User user);
    User Add(User user);
    User Deleted(User user);
}
