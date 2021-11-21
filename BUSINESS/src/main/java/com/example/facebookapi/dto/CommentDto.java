package com.example.facebookapi.dto;

import com.example.facebookapi.entity.Post;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {


    private UserDto userDto;
    private PostDto postDto;
    private String comment;
    private LocalDateTime time;
}
