package org.example;

import java.util.HashMap;

public class TrieNode {
    char value;
    boolean isEndOfWord;
    HashMap<Character, TrieNode> children;

    public TrieNode(char value) {
        this.value = value;
        this.isEndOfWord = false;
        this.children = new HashMap<>();
    }
}
