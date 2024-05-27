package com.example.android.hilt.di

import androidx.fragment.app.FragmentActivity
import com.example.android.hilt.navigator.AppNavigator
import com.example.android.hilt.navigator.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

@InstallIn(ActivityComponent::class)
@Module
abstract class NavigationModule
{
    @Binds
    abstract fun bindNavigator(impl: AppNavigatorImpl): AppNavigator
}