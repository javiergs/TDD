
package csse.data;

import csse.interfaces.ProjectInterface;
import csse.interfaces.StoryInterface;

import java.util.List;


public class Project implements ProjectInterface {

  public Project(String name) {
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public void addStory(StoryInterface story) {
  }

  @Override
  public List<StoryInterface> getStories() {
    return List.of();
  }

}
