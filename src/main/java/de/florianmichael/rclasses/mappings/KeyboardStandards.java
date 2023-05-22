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

package de.florianmichael.rclasses.mappings;

import de.florianmichael.rclasses.type.ReverseHashMap;

// https://github.com/kwhat/jnativehook/blob/master/src/java/org/jnativehook/keyboard/SwingKeyAdapter.java
// https://gist.github.com/lilgallon/eb0cc2fc38920fb5081aba2c542eda55
public class KeyboardStandards {
    private final static ReverseHashMap<Integer, Integer> vcToVkMappings = new ReverseHashMap<>();

    static {
        registerVcToVkMapping(1, 27);
        registerVcToVkMapping(2, '1');
        registerVcToVkMapping(3, '2');
        registerVcToVkMapping(4, '3');
        registerVcToVkMapping(5, '4');
        registerVcToVkMapping(6, '5');
        registerVcToVkMapping(7, '6');
        registerVcToVkMapping(8, '7');
        registerVcToVkMapping(9, '8');
        registerVcToVkMapping(10, '9');
        registerVcToVkMapping(11, '0');
        registerVcToVkMapping(12, '-');
        registerVcToVkMapping(13, '=');
        registerVcToVkMapping(14, '\b');
        registerVcToVkMapping(15, '\t');
        registerVcToVkMapping(16, 'Q');
        registerVcToVkMapping(17, 'W');
        registerVcToVkMapping(18, 'E');
        registerVcToVkMapping(19, 'R');
        registerVcToVkMapping(20, 'T');
        registerVcToVkMapping(21, 'Y');
        registerVcToVkMapping(22, 'U');
        registerVcToVkMapping(23, 'I');
        registerVcToVkMapping(24, 'O');
        registerVcToVkMapping(25, 'P');
        registerVcToVkMapping(26, '[');
        registerVcToVkMapping(27, ']');
        registerVcToVkMapping(28, '\n');
        registerVcToVkMapping(29, 17);
        registerVcToVkMapping(30, 'A');
        registerVcToVkMapping(31, 'S');
        registerVcToVkMapping(32, 'D');
        registerVcToVkMapping(33, 'F');
        registerVcToVkMapping(34, 'G');
        registerVcToVkMapping(35, 'H');
        registerVcToVkMapping(36, 'J');
        registerVcToVkMapping(37, 'K');
        registerVcToVkMapping(38, 'L');
        registerVcToVkMapping(39, ';');
        registerVcToVkMapping(40, 222);
        registerVcToVkMapping(41, 192);
        registerVcToVkMapping(42, 16);
        registerVcToVkMapping(43, '\\');
        registerVcToVkMapping(44, 'Z');
        registerVcToVkMapping(45, 'X');
        registerVcToVkMapping(46, 'C');
        registerVcToVkMapping(47, 'V');
        registerVcToVkMapping(48, 'B');
        registerVcToVkMapping(49, 'N');
        registerVcToVkMapping(50, 'M');
        registerVcToVkMapping(51, ',');
        registerVcToVkMapping(52, '.');
        registerVcToVkMapping(53, '/');
        registerVcToVkMapping(56, 18);
        registerVcToVkMapping(57, ' ');
        registerVcToVkMapping(58, 20);
        registerVcToVkMapping(59, 'p');
        registerVcToVkMapping(60, 'q');
        registerVcToVkMapping(61, 'r');
        registerVcToVkMapping(62, 's');
        registerVcToVkMapping(63, 't');
        registerVcToVkMapping(64, 'u');
        registerVcToVkMapping(65, 'v');
        registerVcToVkMapping(66, 'w');
        registerVcToVkMapping(67, 'x');
        registerVcToVkMapping(68, 'y');
        registerVcToVkMapping(69, 144);
        registerVcToVkMapping(70, 145);
        registerVcToVkMapping(83, 'l');
        registerVcToVkMapping(87, 'z');
        registerVcToVkMapping(88, '{');
        registerVcToVkMapping(91, '\uf000');
        registerVcToVkMapping(92, '\uf001');
        registerVcToVkMapping(93, '\uf002');
        registerVcToVkMapping(99, '\uf003');
        registerVcToVkMapping(100, '\uf004');
        registerVcToVkMapping(101, '\uf005');
        registerVcToVkMapping(102, '\uf006');
        registerVcToVkMapping(103, '\uf007');
        registerVcToVkMapping(104, '\uf008');
        registerVcToVkMapping(105, '\uf009');
        registerVcToVkMapping(106, '\uf00a');
        registerVcToVkMapping(107, '\uf00b');
        registerVcToVkMapping(112, 241);
        registerVcToVkMapping(115, 523);
        registerVcToVkMapping(121, 25);
        registerVcToVkMapping(123, 242);
        registerVcToVkMapping(3639, 154);
        registerVcToVkMapping(3653, 19);
        registerVcToVkMapping(3655, '$');
        registerVcToVkMapping(3657, '!');
        registerVcToVkMapping(3663, '#');
        registerVcToVkMapping(3665, '"');
        registerVcToVkMapping(3666, 155);
        registerVcToVkMapping(3667, 127);
        registerVcToVkMapping(3675, 157);
        registerVcToVkMapping(3677, 525);
        registerVcToVkMapping(57416, '&');
        registerVcToVkMapping(57419, '%');
        registerVcToVkMapping(57420, '\f');
        registerVcToVkMapping(57421, '\'');
        registerVcToVkMapping(57424, '(');
        registerVcToVkMapping(65397, 156);
        registerVcToVkMapping(65400, '\uffc8');
        registerVcToVkMapping(65401, '\uffc9');
        registerVcToVkMapping(65403, '\uffd1');
        registerVcToVkMapping(65406, '\uffd0');
    }

    private static void registerVcToVkMapping(final int vcKey, final int vkKey) {
        vcToVkMappings.put(vcKey, vkKey);
    }
    
    public static int vc_to_vk(final int vcKey) {
        if (vcToVkMappings.containsKey(vcKey)) {
            return vcToVkMappings.get(vcKey);
        }
        return 0;
    }

    public static int vk_to_vc(final int vkKey) {
        if (vcToVkMappings.containsValue(vkKey)) {
            return vcToVkMappings.getKey(vkKey);
        }
        return 0;
    }

    public static int vk_to_glfw(final int vk_code) {
        if (vk_code == 127) {
            // 127 -> delete
            return 261;
        }
        // 1 -> L mouse
        // 2 -> R mouse
        // 3 -> control break processing
        // 4 -> middle mouse button
        // 5 -> windows 2000 X1
        // 6 -> windows 2000 X2
        // 7 -> undefined
        if (vk_code == 8) {
            // 8 -> back space
            return 259;
        }
        if (vk_code == 9) {
            // 9 -> tab key
            return  258;
        }
        // 10, 11 -> reserved
        // 12 -> clear key
        if (vk_code == 13) {
            // 13 -> enter key
            return 257;
        }
        // 14, 15 -> undefined
        // 16 -> shift - there is no equivalent in GLFW
        // 17 -> ctrl - there is no equivalent in GLFW
        // 18 -> alt - there is no equivalent in GLFW
        if (vk_code == 19) {
            // 19 -> pause
            return 284;
        }
        if (vk_code == 20) {
            // 20 -> caps lock
            return 280;
        }
        // 21, ..., 26 -> IME stuff
        if (vk_code == 27) {
            // 27 -> esc
            return 256;
        }
        // 28, ..., 31 -> IME stuff
        if (vk_code == 32) {
            // space
            return 32;
        }
        if (vk_code == 33) {
            // 33 -> page up
            return 266;
        }
        if (vk_code == 34) {
            // 34 -> page down
            return 267;
        }
        if (vk_code == 35) {
            // 35 -> end
            return 269;
        }
        if (vk_code == 36) {
            // 36 -> home
            return 268;
        }
        if (vk_code == 37) {
            // 37 -> left arrow
            return 263;
        }
        if (vk_code == 38) {
            // 38 -> up arrow
            return 265;
        }
        if (vk_code == 39) {
            // 39 -> right arrow
            return 262;
        }
        if (vk_code == 40) {
            // 40 -> down arrow
            return 264;
        }
        // 41 -> select
        // 42 -> print
        // 43 -> execute
        // 44 -> print screen
        if (vk_code == 45) {
            // 45 -> insert
            return 260;
        }
        if (vk_code == 46) {
            // 46 -> del
            return 261;
        }
        // 47 -> help
        if (vk_code >= 48 && vk_code <= 57) {
            // 48-57 -> 0-9
            return vk_code;
        }
        // 58-64 -> undefined
        if (vk_code >= 65 && vk_code <= 90) {
            // 65-90 -> a-z
            return vk_code;
        }
        // 91-93 -> win keys
        // 94 -> reserved
        // 95 -> sleep
        if (vk_code >= 96 && vk_code <= 105) {
            // 96-105 -> 0-9 numpad
            return vk_code - 224;
        }
        if (vk_code == 106) {
            // 106 -> multiply
            return 332;
        }
        if (vk_code == 107) {
            // 107 -> add
            return 334;
        }
        // 108 -> separator
        if (vk_code == 109) {
            // 109 -> subtract
            return 333;
        }
        if (vk_code == 110) {
            // 110 -> decimal
            return 330;
        }
        if (vk_code == 111) {
            // 111 -> divide
            return 331;
        }
        if (vk_code >= 112 && vk_code <= 135) {
            // 112-135 -> F1-F25
            return vk_code + 178;
        }
        // 136-143 -> unassigned
        if (vk_code == 144) {
            // 144 -> num lock
            return 282;
        }
        if (vk_code == 145) {
            return 281;
        }
        // 146-150 -> OEM specific
        // 151-159 -> unassigned
        if (vk_code == 160) {
            // 160 -> left shift
            return 340;
        }
        if (vk_code == 161) {
            // 161 -> right shift
            return 344;
        }
        if (vk_code == 162) {
            // 162 -> left control
            return 341;
        }
        if (vk_code == 163) {
            // 163 -> right control
            return 345;
        }
        // 164 -> left menu
        // 165 -> right menu
        // 166-183 -> windows media keys
        // 184-185 -> reserved
        // 186-192 -> windows 2000 keys
        // 193-215 -> reserved
        // 216-218 -> unassigned
        // 219-222 -> windows 2000 keys
        // 223 -> ?
        // 224 -> reserved
        // 225 -> OEM specific
        // 226 -> windows 2000 key
        // 227-228 -> OEM specific
        // 229 -> IME process key
        // 230 -> OEM specific
        // 231 -> used to pass unicode chars
        // 232 -> unassigned
        // 233-245 -> OEM specific
        // 246 -> attn
        // 247 -> crsel
        // 248 -> exsel
        // 249 -> erase EOF
        // 250 -> play
        // 251 -> zoom
        // 252 -> reserved
        // 253 -> pa1
        // 254 -> clear (oem)

        // Not supported yet
        return -2;
    }
}