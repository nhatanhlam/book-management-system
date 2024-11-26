package com.example.book_social_network.user;

import com.example.book_social_network.user.dto.PasswordUpdateDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PutMapping("/{userId}/update-password")
    public ResponseEntity<String> updatePassword(
            @PathVariable Integer userId,
            @Valid @RequestBody PasswordUpdateDTO passwordUpdateDTO) {

        userService.updatePassword(userId, passwordUpdateDTO);
        return ResponseEntity.ok("Password updated successfully");
    }
}
