package com.facebook.msys.mci;

public interface DataTaskListener {
    void onCancelDataTask(String str, NetworkSession networkSession);

    void onNewTask(DataTask dataTask, NetworkSession networkSession);

    void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession);
}
