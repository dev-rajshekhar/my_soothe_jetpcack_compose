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

data class AlignMindModal(
    val name: String,
    val image: Int,
)

val AlignMindData = listOf<AlignMindModal>(
    AlignMindModal("Meditate", R.drawable.meditative),
    AlignMindModal("With Kids", R.drawable.with_kids),
    AlignMindModal("Aromatherapy", R.drawable.aromatherapy),
    AlignMindModal("On the Go", R.drawable.on_the_go),
    AlignMindModal("With Pets", R.drawable.with_pets),
    AlignMindModal("High Stress", R.drawable.high_stress),
)
