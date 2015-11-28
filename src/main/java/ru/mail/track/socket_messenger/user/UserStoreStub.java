package ru.mail.track.socket_messenger.user;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 */
public class UserStoreStub implements UserStore {

    private static Map<Long, User> users = new HashMap<>();
    private AtomicLong nextId = new AtomicLong(4);

    static {
        User u0 = new UserImpl("A", "1");
        u0.setId(0L);

        User u1 = new UserImpl("B", "1");
        u1.setId(1L);

        User u2 = new UserImpl("C", "1");
        u2.setId(2L);

        User u3 = new UserImpl("D", "1");
        u3.setId(3L);

        users.put(0L, u0);
        users.put(1L, u1);
        users.put(2L, u2);
        users.put(3L, u3);
    }

    @Override
    public User addUser(User user) {
        user.setId(nextId.getAndIncrement());
        return users.put(user.getId(), user);
    }

    @Override
    public User getUser(String login) {
        for (User user : users.values()) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return users.get(id);
    }
}
