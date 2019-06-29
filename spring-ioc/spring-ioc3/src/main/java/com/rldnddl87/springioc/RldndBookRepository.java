package com.rldnddl87.springioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class RldndBookRepository implements BookRepository {
}
