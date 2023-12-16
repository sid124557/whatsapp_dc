package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass31C;
import X.AnonymousClass32W;
import X.C106405Yw;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import X.C55882r4;
import X.C55892r5;
import X.C64333Db;
import X.C95814uZ;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.Job;

public final class SendReadReceiptJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass31C A00;
    public transient C55882r4 A01;
    public transient C55892r5 A02;
    public final transient Throwable A03;
    public final String jid;
    public final long loggableStanzaId;
    public final String[] messageIds;
    public final long originalMessageTimestamp;
    public final String participant;
    public final String recipient;
    public final String remoteSender;
    public final boolean shouldForceReadSelfReceipt;

    public final String A08() {
        String str = this.jid;
        C106405Yw r1 = C95814uZ.A00;
        C95814uZ A05 = r1.A05(str);
        C95814uZ A052 = r1.A05(this.participant);
        DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass0x2.A1E(A05, A052, "; jid=", A0o);
        A0o.append("; remoteSender=");
        A0o.append(nullable);
        A0o.append("; recipient=");
        A0o.append(this.recipient);
        A0o.append("; shouldForceReadSelfReceipt=");
        A0o.append(this.shouldForceReadSelfReceipt);
        A0o.append("; ids:");
        return AnonymousClass000.A0X(Arrays.deepToString(this.messageIds), A0o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendReadReceiptJob(X.C95814uZ r4, X.C95814uZ r5, X.C95814uZ r6, com.whatsapp.jid.DeviceJid r7, java.lang.String[] r8, long r9, long r11, boolean r13) {
        /*
            r3 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "read-receipt-"
            r2.append(r0)
            X.C18280x3.A0u(r4, r2)
            java.lang.String r0 = "-"
            r2.append(r0)
            java.lang.String r0 = X.C627336j.A07(r5)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            X.C626936e.A06(r0)
            r3.jid = r0
            r1 = 0
            if (r5 != 0) goto L_0x007b
            r0 = r1
        L_0x0035:
            r3.participant = r0
            if (r7 != 0) goto L_0x0076
            r0 = r1
        L_0x003a:
            r3.remoteSender = r0
            if (r6 != 0) goto L_0x0071
            r0 = r1
        L_0x003f:
            r3.recipient = r0
            X.C626936e.A0H(r8)
            r3.messageIds = r8
            r3.originalMessageTimestamp = r9
            r3.shouldForceReadSelfReceipt = r13
            r3.loggableStanzaId = r11
            boolean r0 = r4 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x006e
            if (r5 == 0) goto L_0x006e
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r3.A03 = r0
        L_0x0059:
            int r2 = r8.length
            r1 = 0
        L_0x005b:
            if (r1 >= r2) goto L_0x006a
            r0 = r8[r1]
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "SendReadReceiptJob/can't create the job with invalid message id(s)"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006a:
            return
        L_0x006b:
            int r1 = r1 + 1
            goto L_0x005b
        L_0x006e:
            r3.A03 = r1
            goto L_0x0059
        L_0x0071:
            java.lang.String r0 = r6.getRawString()
            goto L_0x003f
        L_0x0076:
            java.lang.String r0 = r7.getRawString()
            goto L_0x003a
        L_0x007b:
            java.lang.String r0 = r5.getRawString()
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendReadReceiptJob.<init>(X.4uZ, X.4uZ, X.4uZ, com.whatsapp.jid.DeviceJid, java.lang.String[], long, long, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (AnonymousClass32W.A00(this.jid) == null) {
            throw C18330xA.A06("jid must not be empty");
        } else if (this.messageIds.length == 0) {
            throw C18330xA.A06("messageIds must not be empty");
        }
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A00 = A002.BLC();
        this.A01 = (C55882r4) A002.ATI.get();
        this.A02 = (C55892r5) A002.AJE.get();
    }
}
