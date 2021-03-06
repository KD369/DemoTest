package com.ds4;

public class QueueClass<T> {

	public class Node {
		private int data;
		private Node next;

		private Node(T item) {
			this.data = data;
			// this.next = null;
		}

	}

	private Node head;
	private Node tail;

	// enqueue(item)
	public void enqueue(T item) {
		Node node = new Node(item);
		if (tail != null) {
			tail.next = null;

		}
		tail = node;
		if (head == null) {
			head = node;
		}

	}

	// dequeue
	
	public int dequeue() {
		int data = head.data;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		return data;

	}

	// isEmpty
	public boolean isEmpty() {
		return head == null;

	}

	// size
	public int size() {

		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;

	}

}
