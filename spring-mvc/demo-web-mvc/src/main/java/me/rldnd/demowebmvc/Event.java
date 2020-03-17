package me.rldnd.demowebmvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    interface ValidateLimit{}
    interface ValidateName{}

    @NotBlank(groups = ValidateName.class)
    private Integer id;

    private String name;

    @Min(value = 0, groups = ValidateLimit.class)
    private Integer limit;
}
