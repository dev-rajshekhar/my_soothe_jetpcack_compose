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

data class AlignBodyModal(
    val name: String,
    val image: Int,
)

val AlignBodyModalList = listOf<AlignBodyModal>(
    AlignBodyModal("Inversion", R.drawable.inversion),
    AlignBodyModal("Quick Yoga", R.drawable.quick_yoga),
    AlignBodyModal("Stretching", R.drawable.stretchin),
    AlignBodyModal("Tabata", R.drawable.tabata),
    AlignBodyModal("HIIT", R.drawable.hiit),
    AlignBodyModal("Pre Natal Yoga", R.drawable.pre_natal_yoga),
)
