package com.brastasauce.purchaseprogress.data;

import java.util.HashMap;
import java.util.Map;
import net.runelite.api.Item;

public class BankCache
{
//    private final HashMap<String, Integer> cacheHash = new HashMap<>();
//    private final HashMap<String, Long> cacheValue = new HashMap<>();
//    final HashSet<Integer> indexedItems = new HashSet<>();

    private final HashMap<String, CachedTab> cache = new HashMap<>();

    public boolean has(final String key)
    {
        return cache.containsKey(key);
    }

    public boolean has(final String key, final Item[] items)
    {
        if (!has(key))
        {
            return false;
        }

        final CachedTab tab = cache.get(key);
        return tab.hashItems(items) == tab.getHash();
    }

    public boolean hasItem(final String key, final int itemId)
    {

    }

    public int hashItems(final Item[] items)
    {
        final Map<Integer, Integer> mapCheck = new HashMap<>(items.length);
        for (Item item : items)
        {
            mapCheck.put(item.getId(), item.getQuantity());
        }

        return mapCheck.hashCode();
    }
}
