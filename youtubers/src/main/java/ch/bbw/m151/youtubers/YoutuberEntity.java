package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity(name = "youtubers")
public class YoutuberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rank;

    private String username;

    private String url;

    private String name;

    private String category;

    private Long subscribers;

    @JoinColumn(name = "audience_country")
    @ManyToOne
    CountryEntity audienceCountry;

    private Long avgViewers;

    private Long avgLikes;

    private Long avgComments;
}
