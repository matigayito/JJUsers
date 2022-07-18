package JibberJabber.Users.services.impl;

import JibberJabber.Users.model.Follow;
import JibberJabber.Users.repositories.FollowRepository;
import JibberJabber.Users.services.FollowService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowServiceImpl implements FollowService {

    FollowRepository followRepository;

    public FollowServiceImpl(FollowRepository repository) {
        followRepository = repository;
    }

    @Override
    public List<Follow> getAllFollows() {
        return followRepository.findAll();
    }

    @Override
    public Follow save(Follow newFollow) {
        return null;
    }

    @Override
    public Follow find(Long id) {
        return null;
    }

    @Override
    public Follow replace(Follow newFollow, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
