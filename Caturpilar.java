import java.util.*;
class Caturpilar {
	int maxCapacity;
	int elemNum;
	Integer[] a;
	public Caturpilar(int mc) {
		maxCapacity = mc;
		a = new Integer[mc];
		elemNum = 0;
	}
	public int size() {
		return elemNum;
	}
	public int get(int elem) {
		return a[elem];
	}
	public void add(int num) {
		if (elemNum < maxCapacity) {
			a[elemNum] = num;
		} else {
			maxCapacity = maxCapacity + 1;
			Integer[] temp = new Integer[maxCapacity];
			for (int i = 0; i < maxCapacity - 1; i++) {
				temp[i] = a[i];
			}
			temp[maxCapacity - 1] = num;
			a = temp;
		}
		elemNum += 1;
	}
	public void set(int elem, int num) {
		a[elem] = num;
	}
	public void remove(int elem) {
		for (int i = elem; i < elem + (this.size() - elem); i++) {
			a[i] = a[i+1];
		}
		elemNum -= 1;
	}
	public String toString() {
		String str = new String();
		if (this.size() > 0) {
			for (int i = 0; i < this.size(); i++) {
				str = str + a[i] + ", ";
			}
		} else {
			return "[ ]";
		}
		return "[ "+str.substring(0, str.length()-2)+" ] Elements: "+elemNum+", maxCapacity: "+maxCapacity;
	}
}