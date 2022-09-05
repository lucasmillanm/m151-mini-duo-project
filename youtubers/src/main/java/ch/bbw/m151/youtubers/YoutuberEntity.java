package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity(name = "youtubers")
public class YoutuberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rank;

    @Column
    private String username;

    @Column
    private String url;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private Long subscribers;

    @Column
    private String audienceCountry;

    @Column
    private Long avgViewers;

    @Column
    private Long avgLikes;

    @Column
    private Long avgComments;
}
