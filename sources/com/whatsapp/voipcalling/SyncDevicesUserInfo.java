package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C86624Kv;
import com.whatsapp.jid.UserJid;

public class SyncDevicesUserInfo {
    public final UserJid jid;
    public final String phash;

    public SyncDevicesUserInfo(String str, String str2) {
        this.jid = C86624Kv.A0U(str);
        this.phash = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SyncDevicesUserInfo {jid=");
        A0o.append(this.jid);
        A0o.append(", phash=");
        A0o.append(this.phash);
        return AnonymousClass000.A0d(A0o);
    }
}
