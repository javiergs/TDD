
package csse.interfaces;

import java.util.List;

public interface ProjectInterface {
    String getName();

    void addStory(StoryInterface story);
    List<StoryInterface> getStories();
}
