package com.threelm.vsgame.services;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ServicesModule {

    @Provides
    FireBaseRepositoryService provideFireBaseRepositoryService() {
        return new FireBaseRepositoryService();
    }
}
