package com.example.fd_assignment.di

import android.app.Application
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import com.example.fd_assignment.repository.AuthRepository
import com.example.fd_assignment.repository.AuthRepositoryImpl
import com.example.fd_assignment.repository.MainRepository
import com.example.fd_assignment.repository.RepositoryImpl
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAuthRepository(
        db: FirebaseFirestore,
        auth: FirebaseAuth,
    ) : AuthRepository {
        return AuthRepositoryImpl(db, auth)
    }

    @Provides
    @Singleton
    fun provideRepository(
        database: FirebaseFirestore,
        auth: FirebaseAuth

    ) : MainRepository{
        return RepositoryImpl(database, auth)
    }

    @Provides
    @Singleton
    fun provideFirestoreInstance(): FirebaseFirestore =
        FirebaseFirestore.getInstance()

    @Provides
    @Singleton
    @ApplicationContext
    fun provideApplicationContext(@ApplicationContext app: Application): Application = app

    @Provides
    @Singleton
    fun provideFirebaseAuth() : FirebaseAuth = FirebaseAuth.getInstance()

}