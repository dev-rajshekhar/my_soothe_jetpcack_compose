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
package com.example.androiddevchallenge.data
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
import com.example.androiddevchallenge.R

data class FavoriteCollection(
    val name: String,
    val image: Int,
)

val FavoriteCollectionData = listOf<FavoriteCollection>(
    FavoriteCollection("Short Mantra", R.drawable.short_mantra),
    FavoriteCollection("Stress and Anxiety", R.drawable.stress_manta),
    FavoriteCollection("Overwhelmed", R.drawable.overwhelmed),
    FavoriteCollection("Nature Meditation", R.drawable.nature_medicaation),
    FavoriteCollection("Self  Massage", R.drawable.self_massage),
    FavoriteCollection("Night Wind Down", R.drawable.night_wind_down),
)
