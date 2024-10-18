package com.example.parkinglot.entity;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.example.parkinglot.enums.Role;
// import com.example.parkinglot.entity.Car;
import jakarta.persistence.*;


import jakarta.validation.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    //need validation
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String password;


    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private final String email;

    @Enumerated(EnumType.STRING)
    private final Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Car> cars;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //this is just for now
        return Arrays.asList(new SimpleGrantedAuthority("USER"));

    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }

}
