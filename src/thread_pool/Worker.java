package thread_pool;

import java.util.ArrayDeque;

public class Worker implements Runnable {

	private ArrayDeque<Task> taskQueue;

	public Worker(ArrayDeque<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		if (!taskQueue.isEmpty()) {
			taskQueue.removeFirst().perform();
		}
	}
}
