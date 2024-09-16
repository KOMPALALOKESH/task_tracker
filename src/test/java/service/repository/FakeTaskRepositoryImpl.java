package service.repository;

import com.project.task_tracker.model.Task;
import com.project.task_tracker.repository.TaskRepository;

import java.util.HashSet;
import java.util.Set;

public class FakeTaskRepositoryImpl implements TaskRepository {

    private final Set<Task> tasks;

    public FakeTaskRepositoryImpl() {
        this.tasks = new HashSet<>();
    }

    @Override
    public void saveTasks(Set<Task> tasks) {
        this.tasks.clear();
        this.tasks.addAll(tasks);
    }

    @Override
    public Set<Task> getTasks() {
        return tasks;
    }
}