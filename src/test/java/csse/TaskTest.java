package csse;

import csse.data.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

  @Test
  void taskShouldStoreTitle() {
    Task task = new Task("Login", "Implement login");

    assertEquals("Login", task.getTitle());
  }

  @Test
  void taskShouldStoreDescription() {
    Task task = new Task("Login", "Implement login");

    assertEquals("Implement login", task.getDescription());
  }

  @Test
  void taskShouldStartIncomplete() {
    Task task = new Task("Login", "Implement login");

    assertFalse(task.isCompleted());
  }

  @Test
  void taskShouldBeMarkedCompleted() {
    Task task = new Task("Login", "Implement login");

    task.markCompleted();

    assertTrue(task.isCompleted());
  }

  @Test
  void completedTaskShouldRemainCompleted() {
    Task task = new Task("Login", "Implement login");

    task.markCompleted();
    task.markCompleted();

    assertTrue(task.isCompleted());
  }
}