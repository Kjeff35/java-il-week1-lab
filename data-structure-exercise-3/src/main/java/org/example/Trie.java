package org.example;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0'); // Root node doesn't store any character
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode(c));
            current = current.children.get(c);
        }

        current.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return false;
            }
            current = current.children.get(c);
        }

        return current.isEndOfWord;
    }

    // Find words that start with a given prefix
    public List<String> getWordsWithPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        TrieNode current = root;

        // Traverse the Trie to the end of the prefix
        for (char c : prefix.toCharArray()) {
            if (!current.children.containsKey(c)) {
                return result; // No words with this prefix
            }
            current = current.children.get(c);
        }

        // Once we reach the end of the prefix, we perform a DFS to find all words
        findWordsWithPrefix(current, prefix, result);

        return result;
    }

    // Perform a DFS from a given node to find all words with the current prefix
    private void findWordsWithPrefix(TrieNode node, String prefix, List<String> result) {
        if (node.isEndOfWord) {
            result.add(prefix);
        }

        for (TrieNode child : node.children.values()) {
            findWordsWithPrefix(child, prefix + child.value, result);
        }
    }
}
