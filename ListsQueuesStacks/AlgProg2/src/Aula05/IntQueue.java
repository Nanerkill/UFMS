package Aula05;

public class IntQueue implements Queue<Integer> {
	
	private Integer q[] = new Integer[5];
	private int front = 0, size = 0;

	@Override
	public void enqueue(Integer obj) {
		if(size == q.length)
			resize();
		q[front++] = obj;
		size++;
	}

	@Override
	public Integer dequeue() {
		Integer ret = q[front--];
		q[front] = null;
		size--;
		return ret;
	}

	@Override
	public Integer front() {
		return q[front];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String stg = "";
		for(Integer x: q) {
			if(x == null)
				break;
			stg += x + " ";
		}
		return stg;
	}
	
	private void resize() {
		Integer newArray[] = new Integer[q.length*2];
		int i = 0;
		for(int x: q)
			newArray[i++] = x;
		q = newArray;
	}

}
