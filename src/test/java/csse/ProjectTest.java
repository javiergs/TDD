package csse;

import csse.data.Project;
import csse.data.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {


  @Test
  void projectShouldStoreStories() {
    Project project = new Project("Blackboard");
    project.addStory(new Story("Login", "User login", 1, 5));
    assertEquals(1, project.getStories().size());
  }

}