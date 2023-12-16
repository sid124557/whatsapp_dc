package com.whatsapp.calling.bcall.data;

import X.AnonymousClass001;
import X.C162457s7;
import X.C18260x0;
import com.whatsapp.jid.UserJid;

public final class ViewerInfo {
    public final UserJid userJid;

    public ViewerInfo(UserJid userJid2) {
        C162457s7.A0J(userJid2, 1);
        this.userJid = userJid2;
    }

    public final ViewerInfo copy(UserJid userJid2) {
        C162457s7.A0J(userJid2, 0);
        return new ViewerInfo(userJid2);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewerInfo) && C162457s7.A0P(this.userJid, ((ViewerInfo) obj).userJid));
    }

    public static /* synthetic */ ViewerInfo copy$default(ViewerInfo viewerInfo, UserJid userJid2, int i, Object obj) {
        if ((i & 1) != 0) {
            userJid2 = viewerInfo.userJid;
        }
        C162457s7.A0J(userJid2, 0);
        return new ViewerInfo(userJid2);
    }

    public int hashCode() {
        return this.userJid.hashCode();
    }

    public final UserJid component1() {
        return this.userJid;
    }

    public final UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ViewerInfo(userJid=");
        return C18260x0.A04(this.userJid, A0o);
    }
}
