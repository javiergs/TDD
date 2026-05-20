
package csse.data;


import csse.interfaces.TaskInterface;

public class Task implements TaskInterface {

  public Task(String ui, String buildUi) {
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
  public boolean isCompleted() {
    return false;
  }

  @Override
  public void markCompleted() {

  }

}
