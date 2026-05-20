
package csse.interfaces;

import java.util.List;

public interface StoryInterface {
    String getTitle();
    String getDescription();
    int getPriority();
    int getEstimate();

    void addTask(TaskInterface task);
    List<TaskInterface> getTasks();

    boolean isCompleted();
}
