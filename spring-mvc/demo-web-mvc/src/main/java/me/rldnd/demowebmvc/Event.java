package me.rldnd.demowebmvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private Integer id;

    private String name;

    private Integer limit;
}
