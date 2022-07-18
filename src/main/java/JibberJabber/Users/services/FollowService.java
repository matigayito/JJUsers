package JibberJabber.Users.services;

import JibberJabber.Users.model.Follow;

import java.util.List;

public interface FollowService {

    List<Follow> getAllFollows();

    Follow save(Follow newFollow);

    Follow find(Long id);

    Follow replace(Follow newFollow, Long id);

    void delete(Long id);

}
