package me.rldnd.demowebmvc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private Integer id;

    @NotBlank
    private String name;

    @Min(0)
    private Integer limit;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    public LocalDate startDate;
}
