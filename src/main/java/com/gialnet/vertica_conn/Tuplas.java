package com.gialnet.vertica_conn;

import lombok.Data;
import java.io.Serializable;

@Data
public class Tuplas implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long Id;
    private String nombre;

}
