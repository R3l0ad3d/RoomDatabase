package com.example.user.roomdatabase.Database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by User on 1/14/2018.
 */
@Dao
public interface DAO {
    @Query("SELECT * FROM user")
    List<User> getAll();
    @Query("SELECT * FROM user where first_name" +
            " LIKE  :Name ")
    User findByName(String Name);
    @Query("SELECT COUNT(*) from user")
    int countUsers();
    @Insert
    void insertAll(User... users);
    @Delete
    void delete(User user);
}
