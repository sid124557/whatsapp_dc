package com.whatsapp.jobqueue.job;

import X.AnonymousClass001;
import X.C1228065u;
import X.C18270x1;
import X.C28071fd;
import X.C389229y;
import X.C48972fm;
import X.C55492qR;
import X.C56972sr;
import X.C61222zu;
import X.C621133n;
import X.C64333Db;
import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationRetryJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56972sr A00;
    public transient C55492qR A01;
    public transient C621133n A02;
    public transient C48972fm A03;
    public transient C28071fd A04;
    public transient C61222zu A05;
    public final String contextRawJid;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawDeviceJid;
    public final int retryCount;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationRetryJob(com.whatsapp.jid.DeviceJid r4, X.AnonymousClass2z0 r5, X.C54942pX r6, byte[] r7, int r8, int r9) {
        /*
            r3 = this;
            X.2gM r2 = X.C49332gM.A01()
            if (r7 == 0) goto L_0x0010
            int r0 = r7.length
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x0010:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r4)
            r2.A05(r0)
            if (r7 == 0) goto L_0x0022
            com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r4, r7)
            r2.A05(r0)
        L_0x0022:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "final-live-location-"
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)
            X.C49332gM.A03(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A04()
            r3.<init>(r0)
            boolean r0 = X.AnonymousClass001.A1W(r9)
            X.C626936e.A0C(r0)
            java.lang.String r0 = r4.getRawString()
            r3.rawDeviceJid = r0
            X.4uZ r1 = r5.A00
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = X.C627336j.A07(r1)
        L_0x004f:
            r3.contextRawJid = r0
            java.lang.String r0 = r5.A01
            r3.msgId = r0
            double r0 = r6.A00
            r3.latitude = r0
            double r0 = r6.A01
            r3.longitude = r0
            long r0 = r6.A05
            r3.timestamp = r0
            r3.timeOffset = r8
            r3.retryCount = r9
            return
        L_0x0066:
            r0 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.<init>(com.whatsapp.jid.DeviceJid, X.2z0, X.2pX, byte[], int, int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawDeviceJid)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("jid must not be empty");
            throw C18270x1.A0C(A08(), A0o);
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("msgId must not be empty");
            throw C18270x1.A0C(A08(), A0o2);
        } else if (this.timestamp == 0) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("location timestamp must not be 0");
            throw C18270x1.A0C(A08(), A0o3);
        }
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1I(A0o, this);
        A0o.append("; jid=");
        A0o.append(this.rawDeviceJid);
        A0o.append("; msgId=");
        A0o.append(this.msgId);
        A0o.append("; location.timestamp=");
        return AnonymousClass001.A0k(A0o, this.timestamp);
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.BL4();
        this.A04 = (C28071fd) A002.AJC.get();
        this.A03 = (C48972fm) A002.AW6.get();
        this.A02 = C64333Db.A2v(A002);
        this.A05 = (C61222zu) A002.AJD.get();
        this.A01 = (C55492qR) A002.AR3.get();
    }
}
