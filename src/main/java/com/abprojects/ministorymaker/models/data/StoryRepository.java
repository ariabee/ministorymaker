package com.abprojects.ministorymaker.models.data;

import com.abprojects.ministorymaker.models.Story;
import org.springframework.data.repository.CrudRepository;

public interface StoryRepository extends CrudRepository<Story, Integer> {
}
