package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass2KY;
import X.AnonymousClass31C;
import X.C106405Yw;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import X.C55882r4;
import X.C64333Db;
import X.C95814uZ;
import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPlayedReceiptJobV2 extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass2KY A00;
    public transient AnonymousClass31C A01;
    public transient C55882r4 A02;
    public final String[] messageIds;
    public final Long[] messageRowIds;
    public final String participantRawJid;
    public final boolean playedSelfFromPeer;
    public final String toRawJid;

    public final String A08() {
        String str = this.toRawJid;
        C106405Yw r1 = C95814uZ.A00;
        C95814uZ A05 = r1.A05(str);
        C95814uZ A052 = r1.A05(this.participantRawJid);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1E(A05, A052, "; jid=", A0o);
        A0o.append("; id=");
        String[] strArr = this.messageIds;
        A0o.append(strArr[0]);
        A0o.append("; count=");
        return AnonymousClass000.A0h(A0o, strArr.length);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJobV2(X.C46062b1 r5, boolean r6) {
        /*
            r4 = this;
            X.2gM r3 = X.C49332gM.A01()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "played-receipt-v2-"
            r2.append(r0)
            X.4uZ r1 = r5.A01
            java.lang.String r0 = r1.getRawString()
            X.C626936e.A06(r0)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            X.C49332gM.A03(r0, r3)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A04()
            r4.<init>(r0)
            java.lang.String r0 = r1.getRawString()
            X.C626936e.A06(r0)
            r4.toRawJid = r0
            X.4uZ r0 = r5.A00
            if (r0 != 0) goto L_0x0046
            r0 = 0
        L_0x0033:
            r4.participantRawJid = r0
            java.lang.Long[] r0 = r5.A02
            X.C626936e.A0H(r0)
            r4.messageRowIds = r0
            java.lang.String[] r0 = r5.A03
            X.C626936e.A0H(r0)
            r4.messageIds = r0
            r4.playedSelfFromPeer = r6
            return
        L_0x0046:
            java.lang.String r0 = r0.getRawString()
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendPlayedReceiptJobV2.<init>(X.2b1, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.toRawJid)) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw C18330xA.A06("messageIds must not be empty");
            }
            return;
        }
        throw C18330xA.A06("toJid must not be empty");
    }

    public void Bm4(Context context) {
        C64333Db A012 = C389229y.A01(context);
        this.A01 = A012.BLC();
        this.A02 = (C55882r4) A012.ATI.get();
        this.A00 = (AnonymousClass2KY) A012.AcK.A00.A9B.get();
    }
}
