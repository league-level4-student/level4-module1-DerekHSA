package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] list;

	public ArrayList() {
		list = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return list[loc];
	}

	public void add(T val) {
		T[] temp = (T[]) new Object[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		temp[list.length] = val;
		list = temp;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length + 1];
		for (int i = 0; i < loc; i++) {
			temp[i] = list[i];
		}
		temp[loc] = val;
		for (int i = loc + 1; i < list.length + 1; i++) {
			temp[i] = list[i - 1];
		}
		list = temp;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length];
		for (int i = 0; i < loc; i++) {
			temp[i] = list[i];
		}
		temp[loc] = val;
		for (int i = loc + 1; i < list.length; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length - 1];
		for (int i = 0; i < loc; i++) {
			temp[i] = list[i];
		}
		for (int i = loc + 1; i < list.length; i++) {
			temp[i-1] = list[i];
		}
		list = temp;
	}

	public boolean contains(T val) {
		boolean contained = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i]==val) {
				contained = true;
			}
		}
		return contained;
	}

	public int size() {
		int size = 0;
		for (int i = 0; i < list.length; i++) {
			size++;
		}
		return size;
	}
}