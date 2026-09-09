package io.github.pgatzka.stash.pojo.json;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Item {

    private Map<String, Object> attributes;

    private double count;

    private String item;

    private String baseId;

}
