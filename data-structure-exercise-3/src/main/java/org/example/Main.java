package org.example;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("applet");
        trie.insert("bat");
        trie.insert("ball");
        trie.insert("batman");

        System.out.println("Search 'apple': " + trie.search("apple"));
        System.out.println("Search 'app': " + trie.search("app"));
        System.out.println("Search 'appl': " + trie.search("appl"));

        System.out.println("Autocomplete for 'ap': " + trie.getWordsWithPrefix("ap"));
        System.out.println("Autocomplete for 'bat': " + trie.getWordsWithPrefix("bat"));
        System.out.println("Autocomplete for 'b': " + trie.getWordsWithPrefix("b"));
    }
}