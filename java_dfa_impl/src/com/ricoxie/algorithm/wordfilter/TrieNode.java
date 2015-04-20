package com.ricoxie.algorithm.wordfilter;

public class TrieNode {
	
	public boolean isEnd;
	public boolean isActive;
	
	public TrieNode[] child = new TrieNode[256];
	
	public TrieNode() {
		this.isEnd = false;
		this.isActive = false;
	}
	
}
