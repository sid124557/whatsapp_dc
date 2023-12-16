package com.whatsapp.voipcalling;

import X.C18280x3;
import X.C18320x8;
import com.whatsapp.jid.UserJid;
import java.util.Map;

public class CallLogInfo {
    public final int callLogResultType;
    public Map groupCallLogs;
    public final UserJid initialPeerJid;
    public final long rxTotalBytes;
    public final long txTotalBytes;

    public void addGroupCallLog(String str, int i) {
        Map map = this.groupCallLogs;
        if (map == null) {
            map = C18320x8.A0r();
            this.groupCallLogs = map;
        }
        C18280x3.A1D(str, map, i);
    }

    public CallLogInfo(UserJid userJid, int i, long j, long j2) {
        this.callLogResultType = i;
        this.txTotalBytes = j;
        this.rxTotalBytes = j2;
        this.initialPeerJid = userJid;
    }

    public Map getGroupCallLogs() {
        return this.groupCallLogs;
    }
}
