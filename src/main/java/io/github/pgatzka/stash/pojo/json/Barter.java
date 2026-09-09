package io.github.pgatzka.stash.pojo.json;

import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

@Getter
@Setter
public class Barter {

    private int buyLimit;

    private String id;

    private int minTraderLevel;

    private Item offeredItem;

    private Item [] requiredItems;

    private int restockAmount;

    private String taskUnlock;

    private String trader;

}
