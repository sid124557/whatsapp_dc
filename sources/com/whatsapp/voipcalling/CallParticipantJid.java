package com.whatsapp.voipcalling;

import X.AnonymousClass001;
import X.C18320x8;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

public class CallParticipantJid {
    public final DeviceJid[] deviceJids;
    public final PhoneUserJid phoneUserJid;
    public final byte[] privacyToken;
    public final UserJid userJid;

    public CallParticipantJid(UserJid userJid2, DeviceJid[] deviceJidArr, byte[] bArr) {
        this.userJid = userJid2;
        this.phoneUserJid = null;
        this.deviceJids = deviceJidArr;
        this.privacyToken = bArr;
    }

    public DeviceJid[] getDeviceJids() {
        return this.deviceJids;
    }

    public PhoneUserJid getPhoneUserJid() {
        return this.phoneUserJid;
    }

    public byte[] getPrivacyToken() {
        return this.privacyToken;
    }

    public UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallParticipantJid userJid=");
        A0o.append(this.userJid);
        A0o.append(", deviceJids=(");
        C18320x8.A1P(A0o, this.deviceJids);
        A0o.append(')');
        A0o.append(", privacyToken=");
        if (this.privacyToken == null) {
            str = "missing";
        } else {
            str = "present";
        }
        A0o.append(str);
        A0o.append(", phoneUserJid=");
        A0o.append(this.phoneUserJid);
        return AnonymousClass001.A0j(A0o, ')');
    }

    public CallParticipantJid(UserJid userJid2, byte[] bArr, DeviceJid[] deviceJidArr, PhoneUserJid phoneUserJid2) {
        this.userJid = userJid2;
        this.deviceJids = deviceJidArr;
        this.privacyToken = bArr;
        this.phoneUserJid = phoneUserJid2;
    }
}
