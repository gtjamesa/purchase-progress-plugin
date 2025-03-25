package com.brastasauce.purchaseprogress.data;

import java.util.HashSet;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CachedTab
{
    private final Integer hash;
    private final long value;
    private final HashSet<Integer> index = new HashSet<>();
}
