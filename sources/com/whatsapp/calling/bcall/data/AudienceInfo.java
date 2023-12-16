package com.whatsapp.calling.bcall.data;

import X.AnonymousClass001;
import X.C162457s7;
import X.C18260x0;
import X.C18310x6;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class AudienceInfo {
    public final String sessionId;
    public final int viewerCount;
    public final ArrayList viewers = AnonymousClass001.A0s();

    public AudienceInfo(String str, int i) {
        C162457s7.A0J(str, 1);
        this.sessionId = str;
        this.viewerCount = i;
    }

    public final void addViewerInfo(UserJid userJid) {
        C162457s7.A0J(userJid, 0);
        this.viewers.add(new ViewerInfo(userJid));
    }

    public final AudienceInfo copy(String str, int i) {
        C162457s7.A0J(str, 0);
        return new AudienceInfo(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceInfo) {
                AudienceInfo audienceInfo = (AudienceInfo) obj;
                if (!C162457s7.A0P(this.sessionId, audienceInfo.sessionId) || this.viewerCount != audienceInfo.viewerCount) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AudienceInfo copy$default(AudienceInfo audienceInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = audienceInfo.sessionId;
        }
        if ((i2 & 2) != 0) {
            i = audienceInfo.viewerCount;
        }
        C162457s7.A0J(str, 0);
        return new AudienceInfo(str, i);
    }

    public int hashCode() {
        return C18310x6.A09(this.sessionId) + this.viewerCount;
    }

    public final String component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.viewerCount;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getViewerCount() {
        return this.viewerCount;
    }

    public final ArrayList getViewers() {
        return this.viewers;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudienceInfo(sessionId='");
        A0o.append(this.sessionId);
        A0o.append("', viewerCount=");
        A0o.append(this.viewerCount);
        A0o.append(", viewers=");
        return C18260x0.A04(this.viewers, A0o);
    }
}
