package leo123.party.rosebud_api.controller;

import leo123.party.rosebud_api.api.PostService;
import leo123.party.rosebud_api.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping()
    public int createPost(
            @RequestBody Post post
    ){
        return postService.createPost(post);
    }

    @GetMapping("/{id}")
    public Long getPostById(@PathVariable Long id){
        return id;
    }


}
