package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass742;
import X.C102995Lb;
import com.whatsapp.jid.UserJid;

public class CallLinkInfo {
    public static final String DEFAULT_CALL_LINK_CALL_ID = "default";
    public final UserJid creatorJid;
    public final int linkState;
    public C102995Lb self;
    public final String token;
    public final boolean videoEnabled;

    private void setSelfParticipantInfo(UserJid userJid, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4, int i5, boolean z5, boolean z6) {
        this.self = new C102995Lb(userJid, i, i2, i3, i4, i5, 0, 1, 0, true, false, false, false, false, z, z2, z3, z4, z5, z6, false, false, false, false, false);
    }

    public UserJid getCreatorJid() {
        return this.creatorJid;
    }

    public int getLinkState() {
        return this.linkState;
    }

    public C102995Lb getSelfInfo() {
        return this.self;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }

    public CallLinkInfo(int i, UserJid userJid, String str, boolean z) {
        this.linkState = i;
        this.creatorJid = userJid;
        this.token = str;
        this.videoEnabled = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("token: ");
        A0o.append(this.token);
        A0o.append(", videoEnabled: ");
        A0o.append(this.videoEnabled);
        A0o.append(", linkState: ");
        return AnonymousClass000.A0X(AnonymousClass742.A00(this.linkState), A0o);
    }
}
