package me.rldnd.demowebmvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private Integer id;

    private String name;

    @Min(0)
    private Integer limit;
}
