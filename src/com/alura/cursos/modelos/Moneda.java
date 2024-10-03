package com.alura.cursos.modelos;

import java.util.Map;
import java.util.Objects;

public record Moneda(String base_code,String target_code,double conversion_rate,double conversion_result) {
}
