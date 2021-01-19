package ru.examle.currencyconverter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.examle.currencyconverter.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
