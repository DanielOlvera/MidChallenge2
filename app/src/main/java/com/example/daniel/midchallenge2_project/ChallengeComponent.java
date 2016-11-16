package com.example.daniel.midchallenge2_project;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Daniel on 11/15/16.
 */

@Singleton
@Component(modules = {ChallengeModule.class})
public interface ChallengeComponent {
    void inject(MainActivity mainActivity);
}
