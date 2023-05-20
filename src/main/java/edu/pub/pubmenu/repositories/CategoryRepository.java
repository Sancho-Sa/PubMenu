package edu.pub.pubmenu.repositories;

import edu.pub.pubmenu.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
