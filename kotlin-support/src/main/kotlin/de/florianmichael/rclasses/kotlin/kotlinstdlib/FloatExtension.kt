/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.kotlin.kotlinstdlib

import kotlin.math.pow

/**
 * @param decimals The amount of decimals to round to
 * @return Rounds a float to the given amount of decimals
 */
fun Float.roundAvoid(decimals: Float): Float {
    val scale = 10F.pow(decimals)

    return (Math.round(this * scale) / scale)
}