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
package com.example.androiddevchallenge.ui.screens
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

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.AlignBodyModalList
import com.example.androiddevchallenge.data.AlignMindData
import com.example.androiddevchallenge.data.FavoriteCollectionData
import com.example.androiddevchallenge.ui.screens.component.AlignYourBodyComposable
import com.example.androiddevchallenge.ui.screens.component.AlignYourMindComposable
import com.example.androiddevchallenge.ui.screens.component.BuildSearchBar
import com.example.androiddevchallenge.ui.screens.component.FavouriteCollection
import com.example.androiddevchallenge.ui.screens.component.HomeScreenNav

@Composable
fun HomeScreen() {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*no op */ },
                backgroundColor = MaterialTheme.colors.primary,
            ) { Icon(Icons.Default.PlayArrow, contentDescription = "play") }
        },
        bottomBar = {
            HomeScreenNav()
        },
        topBar = {
            BuildSearchBar()
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            content = {
                item {
                    FavouriteCollection(
                        title = "FAVOURITE COLLECTION",
                        alignBodyList = FavoriteCollectionData
                    )
                }

                item {
                    AlignYourBodyComposable("ALIGN YOUR BODY", AlignBodyModalList)
                }
                item {
                    Spacer(modifier = Modifier.height(40.dp))
                }

                item {
                    AlignYourMindComposable("ALIGN YOUR MIND", AlignMindData)
                }
            }
        )
    }
}
