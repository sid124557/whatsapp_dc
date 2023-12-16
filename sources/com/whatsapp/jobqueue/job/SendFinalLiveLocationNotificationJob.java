package com.whatsapp.jobqueue.job;

import X.AnonymousClass001;
import X.AnonymousClass1EU;
import X.AnonymousClass36G;
import X.C1228065u;
import X.C135156kD;
import X.C18270x1;
import X.C389229y;
import X.C45442a1;
import X.C48972fm;
import X.C54422oh;
import X.C56972sr;
import X.C61222zu;
import X.C621133n;
import X.C621233o;
import X.C622534h;
import X.C64333Db;
import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationNotificationJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C56972sr A00;
    public transient C621133n A01;
    public transient C48972fm A02;
    public transient C622534h A03;
    public transient C621233o A04;
    public transient C61222zu A05;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawJid;
    public final int timeOffset;
    public final long timestamp;

    public final C45442a1 A08(AnonymousClass1EU r5) {
        return new C45442a1(this.A01.A07(C54422oh.A00(AnonymousClass36G.A02(C56972sr.A02(this.A00)), C135156kD.A00), r5.A0F()).A02, 2, 3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationNotificationJob(X.AnonymousClass2z0 r5, X.C54942pX r6, int r7) {
        /*
            r4 = this;
            X.2gM r3 = X.C49332gM.A01()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "final-live-location-"
            r2.append(r0)
            X.4uZ r1 = r5.A00
            java.lang.String r0 = X.C627336j.A07(r1)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            X.C49332gM.A03(r0, r3)
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r0.<init>()
            r3.A05(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A04()
            r4.<init>(r0)
            boolean r0 = r5.A02
            X.C626936e.A0C(r0)
            java.lang.String r0 = X.C18300x5.A0i(r1)
            r4.rawJid = r0
            java.lang.String r0 = r5.A01
            r4.msgId = r0
            double r0 = r6.A00
            r4.latitude = r0
            double r0 = r6.A01
            r4.longitude = r0
            long r0 = r6.A05
            r4.timestamp = r0
            r4.timeOffset = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.<init>(X.2z0, X.2pX, int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("jid must not be empty");
            throw C18270x1.A0C(A09(), A0o);
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("msgId must not be empty");
            throw C18270x1.A0C(A09(), A0o2);
        } else if (this.timestamp == 0) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("location timestamp must not be 0");
            throw C18270x1.A0C(A09(), A0o3);
        }
    }

    public final String A09() {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1I(A0o, this);
        A0o.append("; jid=");
        A0o.append(this.rawJid);
        A0o.append("; msgId=");
        A0o.append(this.msgId);
        A0o.append("; location.timestamp=");
        return AnonymousClass001.A0k(A0o, this.timestamp);
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.BL4();
        this.A02 = (C48972fm) A002.AW6.get();
        this.A03 = (C622534h) A002.A23.get();
        this.A01 = C64333Db.A2v(A002);
        this.A05 = (C61222zu) A002.AJD.get();
        this.A04 = (C621233o) A002.AJA.get();
    }
}
