This project simulates a simplified agile project management system.

The domain model includes:

- Projects
- Stories
- Tasks

The provided test cases act as executable requirements.

Your goal is to complete the implementation so that all tests pass.


# Project Structure

```text
src/main/java
    csse/data/
        Project.java
        Story.java
        Task.java

src/test/java
    csse/
        ProjectTest.java
        StoryTest.java
        TaskTest.java
```


# Goal

Complete the implementation classes inside:

```text
src/main/java/csse/data/
```

You must implement the required behavior described by the tests.


# Important Rules

Do NOT modify:

- test cases
- method names
- package names
- GitHub Actions workflow
- pom.xml

The tests are part of the assignment specification.


# Running Tests

Run the tests locally using Maven:

```bash
mvn test
```

When the project starts, several tests will fail.

This is expected.

This represents the RED phase of Test-Driven Development (TDD).

Your goal is to implement the missing functionality until all tests pass.


# TDD Workflow

The expected workflow is:

1. Run tests
2. Observe failures
3. Implement small changes
4. Run tests again
5. Refactor safely


# Continuous Integration (CI)

This repository uses GitHub Actions.

Every push automatically:

- compiles the project
- runs all test cases
- reports pass/fail status

You should verify that:

- tests pass locally
- GitHub Actions passes remotely


# Expected Final Result

Successful builds should display:

```text
BUILD SUCCESS
```

and all tests should pass.


# Automated Grade Feedback

This repository includes an automated GitHub Actions workflow.
Every time you push code to GitHub:

- the project is compiled,
- all test cases are executed,
- a summary of passed and failed tests is generated.

The workflow also provides an estimated score based on the percentage of passing tests.

Example:

```text

Total tests: 16

Passed tests: 12

Failed tests: 4

Estimated score: 75%