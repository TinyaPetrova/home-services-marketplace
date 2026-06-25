package com.example.home_services_marketplace.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import java.util.Date;
import org.springframework.web.bind.annotation.*;

@Entity
@Table(name = "users")
public class User {
  @Id
  int id;
  String firstName;
  String lastName;
  @Email
  String email;
  String password;
  String phone;
  Date createdAt;
  Date updatedAt;
}
