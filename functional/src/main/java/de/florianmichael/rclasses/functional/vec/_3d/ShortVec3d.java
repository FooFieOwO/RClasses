/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.functional.vec._3d;

/**
 * This class represents a 3-dimensional vector with {@code short} values.
 */
public abstract class ShortVec3d {

    public abstract short getX();
    public abstract short getY();
    public abstract short getZ();

    public abstract void setX(final short x);
    public abstract void setY(final short y);
    public abstract void setZ(final short z);

    @Override
    public String toString() {
        return "ShortVec3d{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + this.getZ() +
                "}";
    }
}
