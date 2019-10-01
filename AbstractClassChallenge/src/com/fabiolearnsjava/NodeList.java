package com.fabiolearnsjava;

public interface NodeList
{
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void travere(ListItem root);
}
