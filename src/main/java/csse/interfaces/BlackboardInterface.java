
package csse.interfaces;

import java.util.List;

public interface BlackboardInterface {
    void addProject(ProjectInterface project);
    List<ProjectInterface> getProjects();
}
