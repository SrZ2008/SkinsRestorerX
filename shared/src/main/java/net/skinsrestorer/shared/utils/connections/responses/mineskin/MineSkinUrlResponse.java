/*
 * SkinsRestorer
 *
 * Copyright (C) 2022 SkinsRestorer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 */
package net.skinsrestorer.shared.utils.connections.responses.mineskin;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class MineSkinUrlResponse {
    private String id;
    private String idStr;
    private String uuid;
    private String name;
    private String variant;
    private MineSkinData data;
    private long timestamp;
    private int duration;
    private int account;
    private String server;
    @SerializedName("private")
    private boolean private_;
    private int views;
    private int nextRequest;
    private boolean duplicate;
}
