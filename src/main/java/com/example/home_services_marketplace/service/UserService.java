package com.example.home_services_marketplace.service;

import com.example.home_services_marketplace.dto.UserRequestDTO;
import com.example.home_services_marketplace.dto.UserResponseDTO;
import com.example.home_services_marketplace.entity.User;
import com.example.home_services_marketplace.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserResponseDTO createUser(UserRequestDTO dto) {
    // dto - entity
    User user = new User();
    user.setFirstName(dto.firstName);
    user.setLastName(dto.lastName);
    user.setEmail(dto.email);
    user.setPassword(dto.password);
    user.setPhone(dto.phone);

    // save in db
    User savedUser = userRepository.save(user);

    // entity - response dto
    UserResponseDTO responseDTO = new UserResponseDTO();
    responseDTO.id = savedUser.getId();
    responseDTO.firstName = savedUser.getFirstName();
    responseDTO.lastName = savedUser.getLastName();
    responseDTO.email = savedUser.getEmail();
    responseDTO.phone = savedUser.getPhone();

    return (responseDTO);
  }
}
