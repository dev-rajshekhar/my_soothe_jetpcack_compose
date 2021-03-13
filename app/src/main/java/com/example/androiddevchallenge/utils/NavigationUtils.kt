/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.utils
/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.view.Window
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.screens.HomeScreen
import com.example.androiddevchallenge.ui.screens.LoginScreen
import com.example.androiddevchallenge.ui.screens.WelcomeScreen

object MainDestinations {
    const val WELCOME_SCREEN = "welcome"
    const val LOGIN_SCREEN = "login"
    const val HOME_SCREEN = "home"
}

@Composable
fun NavGraph(window: Window, startDestination: String = MainDestinations.WELCOME_SCREEN) {
    val navController = rememberNavController()
    val actions = remember(navController) { MainActions(navController) }
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(MainDestinations.WELCOME_SCREEN) {
            window.statusBarColor = MaterialTheme.colors.onBackground.toArgb()
            WelcomeScreen(
                onLoginClick = actions.login,
            )
        }
        composable(MainDestinations.LOGIN_SCREEN) {
            window.statusBarColor = MaterialTheme.colors.onBackground.toArgb()
            LoginScreen(
                onLoginClick = actions.home,
            )
        }
        composable(MainDestinations.HOME_SCREEN) {
            window.statusBarColor = MaterialTheme.colors.onBackground.toArgb()
            HomeScreen()
        }
    }
}

class MainActions(navController: NavHostController) {
    val login: () -> Unit = {
        navController.navigate(MainDestinations.LOGIN_SCREEN)
    }
    val home: () -> Unit = {
        navController.navigate(MainDestinations.HOME_SCREEN)
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}
