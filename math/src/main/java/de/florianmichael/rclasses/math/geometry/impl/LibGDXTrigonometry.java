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

package de.florianmichael.rclasses.math.geometry.impl;

public class LibGDXTrigonometry implements TrigonometryBase {
    public final static float BF_PI = 3.1415927f;

    private final static int BF_SIN_BITS = 14; // 16KB. Adjust for accuracy.
    private final static int BF_SIN_MASK = ~(-1 << BF_SIN_BITS);
    private final static int BF_SIN_COUNT = BF_SIN_MASK + 1;

    private final static float BF_radFull = BF_PI * 2;
    private final static float BF_degFull = 360;
    private final static float BF_radToIndex = BF_SIN_COUNT / BF_radFull;
    private final static float BF_degToIndex = BF_SIN_COUNT / BF_degFull;

    public final static float BF_degreesToRadians = BF_PI / 180;

    private final static float[] BF_table = new float[BF_SIN_COUNT];

    static {
        for(int i = 0; i < BF_SIN_COUNT; i++) {
            BF_table[i] = (float) Math.sin((i + 0.5f) / BF_SIN_COUNT * BF_radFull);
        }
        for (int i = 0; i < 360; i += 90) {
            BF_table[(int)(i * BF_degToIndex) & BF_SIN_MASK] = (float) Math.sin(i * BF_degreesToRadians);
        }
    }

    @Override
    public float sin(float x) {
        return BF_table[(int)(x * BF_radToIndex) & BF_SIN_MASK];
    }

    @Override
    public float cos(float x) {
        return BF_table[(int)((x + BF_PI / 2) * BF_radToIndex) & BF_SIN_MASK];
    }
}
