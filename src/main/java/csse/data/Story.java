package csse.data;


import csse.interfaces.StoryInterface;
import csse.interfaces.TaskInterface;

import java.util.List;

public class Story implements StoryInterface {


  public Story(String login, String userLogin, int i, int i1) {
  }

  @Override
  public String getTitle() {
    return "";
  }

  @Override
  public String getDescription() {
    return "";
  }

  @Override
  public int getPriority() {
    return 0;
  }

  @Override
  public int getEstimate() {
    return 0;
  }

  @Override
  public void addTask(TaskInterface task) {

  }

  @Override
  public List<TaskInterface> getTasks() {
    return List.of();
  }

  @Override
  public boolean isCompleted() {
    return false;
  }
}
