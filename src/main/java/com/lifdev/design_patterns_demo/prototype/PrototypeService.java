package com.lifdev.design_patterns_demo.prototype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class PrototypeService {
    Order original = new Order("Ordinateur", 2);
    Order copie = original.clone();
    log.info(original);
    log.info(copie);
}
