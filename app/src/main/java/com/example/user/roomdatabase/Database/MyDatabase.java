package com.example.user.roomdatabase.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by User on 1/14/2018.
 */
@Database(entities = {User.class},version = 1)
public abstract class MyDatabase extends RoomDatabase {
    private static MyDatabase INSTANCE;

    public abstract DAO userDao();

    public static MyDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, "user")
                            // allow queries on the main thread.
                            // Don't do this on a real app! See PersistenceBasicSample for an example.
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
