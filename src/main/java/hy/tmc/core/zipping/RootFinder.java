package hy.tmc.core.zipping;

import hy.tmc.core.domain.Course;
import hy.tmc.core.exceptions.TmcCoreException;

import com.google.common.base.Optional;

import java.io.IOException;
import java.nio.file.Path;

public interface RootFinder {

    Optional<Path> getRootDirectory(Path zipRoot);

    Optional<Course> getCurrentCourse(String path) throws IOException, TmcCoreException;
}
