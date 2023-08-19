package net.srcf.user.jmft2.springbootminimal;

import java.util.List;
import lombok.Data;

@Data
public class JsonData {

    private int id;
    private String name;
    private List<String> neighbors;
}
