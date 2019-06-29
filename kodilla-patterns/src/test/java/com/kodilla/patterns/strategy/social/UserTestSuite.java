package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){

        //Given
        User jacob = new Millenials("Jacob");
        User steven = new YGeneration("Steven");
        User paul = new ZGeneration("Paul");

        //When
        String jacobMedia = jacob.sharePost();
        System.out.println(jacobMedia);
        String stevenMedia = steven.sharePost();
        System.out.println(stevenMedia);
        String paulMedia = paul.sharePost();
        System.out.println(paulMedia);

        //Then
        Assert.assertEquals("[Facebook]Sharing post...",jacobMedia);
        Assert.assertEquals("[Twitter] Sharing post...",stevenMedia);
        Assert.assertEquals("[Snapchat] Sharing post...",paulMedia);

    }

    @Test
    public void testIndividualSharingStrategy(){

        //Given
        User jacob = new Millenials("Jacob");

        //When
        String jacobMedia = jacob.sharePost();
        System.out.println("Old social media: " + jacobMedia);
        jacob.setSocialMedia(new TwitterPublisher());
        jacobMedia = jacob.sharePost();
        System.out.println("New social media: " + jacobMedia);

        //Then
        Assert.assertEquals("[Twitter] Sharing post...", jacobMedia);

    }
}
