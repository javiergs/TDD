package csse;

import csse.data.Story;
import csse.data.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoryTest {

  @Test
  void storyShouldStoreTitle() {
    Story story = new Story("Login", "User login", 1, 5);

    assertEquals("Login", story.getTitle());
  }

  @Test
  void storyShouldStoreDescription() {
    Story story = new Story("Login", "User login", 1, 5);

    assertEquals("User login", story.getDescription());
  }

  @Test
  void storyShouldStorePriority() {
    Story story = new Story("Login", "User login", 1, 5);

    assertEquals(1, story.getPriority());
  }

  @Test
  void storyShouldStoreEstimate() {
    Story story = new Story("Login", "User login", 1, 5);

    assertEquals(5, story.getEstimate());
  }

  @Test
  void storyShouldStartWithNoTasks() {
    Story story = new Story("Login", "User login", 1, 5);

    assertEquals(0, story.getTasks().size());
  }

  @Test
  void storyShouldStoreTasks() {
    Story story = new Story("Login", "User login", 1, 5);

    story.addTask(new Task("UI", "Build UI"));

    assertEquals(1, story.getTasks().size());
  }

  @Test
  void storyShouldStoreMultipleTasks() {
    Story story = new Story("Login", "User login", 1, 5);

    story.addTask(new Task("UI", "Build UI"));
    story.addTask(new Task("Backend", "Build backend"));

    assertEquals(2, story.getTasks().size());
  }

  @Test
  void storyShouldNotBeCompletedInitially() {
    Story story = new Story("Login", "User login", 1, 5);

    assertFalse(story.isCompleted());
  }

  @Test
  void storyShouldBeCompletedWhenAllTasksCompleted() {
    Story story = new Story("Login", "User login", 1, 5);

    Task task1 = new Task("UI", "Build UI");
    Task task2 = new Task("Backend", "Build backend");

    story.addTask(task1);
    story.addTask(task2);

    task1.markCompleted();
    task2.markCompleted();

    assertTrue(story.isCompleted());
  }

  @Test
  void storyShouldNotBeCompletedIfOneTaskIncomplete() {
    Story story = new Story("Login", "User login", 1, 5);

    Task task1 = new Task("UI", "Build UI");
    Task task2 = new Task("Backend", "Build backend");

    story.addTask(task1);
    story.addTask(task2);

    task1.markCompleted();

    assertFalse(story.isCompleted());
  }
}