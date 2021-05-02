/*
 * Copyright 2018 Dmytro Ponomarenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dimowner.audiorecorder.data;

public interface Prefs
{

    boolean isFirstRun();

    void firstRunExecuted();

    boolean isStoreDirPublic();

    void setStoreDirPublic(boolean b);

    //This is needed for scoped storage support
    boolean isShowDirectorySetting();

    boolean isAskToRenameAfterStopRecording();

    void setAskToRenameAfterStopRecording(boolean b);

    boolean hasAskToRenameAfterStopRecordingSetting();

    long getActiveRecord();

    void setActiveRecord(long id);

    long getRecordCounter();

    void incrementRecordCounter();

    boolean isKeepScreenOn();

    void setKeepScreenOn(boolean on);

    void setRecordOrder(int order);

    int getRecordsOrder();

    boolean isMigratedSettings();

    void migrateSettings();

    boolean isMigratedDb3();

    void migrateDb3Finished();

    String getSettingThemeColor();

    void setSettingThemeColor(String colorKey);

    String getSettingNamingFormat();

    void setSettingNamingFormat(String nameKay);

    String getSettingRecordingFormat();

    void setSettingRecordingFormat(String formatKey);

    int getSettingSampleRate();

    void setSettingSampleRate(int sampleRate);

    int getSettingBitrate();

    void setSettingBitrate(int rate);

    int getSettingChannelCount();

    void setSettingChannelCount(int count);

    void resetSettings();
}
