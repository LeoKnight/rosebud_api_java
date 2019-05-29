package leo123.party.rosebud_api.model;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private Long id;
    private String title;
    private Long userId;
    private String commitId;  //一个帖子的 commitId 统一
    private String content;
    private Boolean isDeleted;
    private Date createTime;
    private Date updateTime;
}
