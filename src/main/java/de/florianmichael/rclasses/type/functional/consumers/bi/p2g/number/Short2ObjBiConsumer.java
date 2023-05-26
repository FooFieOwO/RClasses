/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.rclasses.type.functional.consumers.bi.p2g.number;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Short2ObjBiConsumer<V> extends BiConsumer<Short, V> {
    void acceptShort(final short left, final V right);

    @Deprecated
    @Override
    default void accept(final Short left, final V right) {
        this.acceptShort(left, right);
    }

    default Short2ObjBiConsumer<V> andThenShort(final Short2ObjBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptShort(l, r);
            after.acceptShort(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Short, V> andThen(final BiConsumer<? super Short, ? super V> after) {
        return (l, r) -> {
            this.acceptShort(l, r);
            after.accept(l, r);
        };
    }
}