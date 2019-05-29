package leo123.party.rosebud_api.service;

import leo123.party.rosebud_api.api.PostService;
import leo123.party.rosebud_api.mapper.PostMapper;
import leo123.party.rosebud_api.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public int createPost(Post post) {
        post.setCommitId(UUID.randomUUID().toString());
        return postMapper.insert(post);
    }
}
