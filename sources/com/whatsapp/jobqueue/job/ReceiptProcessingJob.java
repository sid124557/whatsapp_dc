package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass32W;
import X.AnonymousClass3ZC;
import X.C1228065u;
import X.C389229y;
import X.C67753Qn;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public final class ReceiptProcessingJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C67753Qn A00;
    public final boolean[] keyFromMe;
    public final String[] keyId;
    public final String[] keyRemoteChatJidRawString;
    public final String participantDeviceJidRawString;
    public final AnonymousClass3ZC receiptPrivacyMode;
    public final String remoteJidRawString;
    public final int status;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReceiptProcessingJob(com.whatsapp.jid.DeviceJid r6, com.whatsapp.jid.Jid r7, X.AnonymousClass3ZC r8, X.AnonymousClass2z0[] r9, int r10, long r11) {
        /*
            r5 = this;
            X.2gM r1 = X.C49332gM.A01()
            r0 = 1
            r1.A02 = r0
            java.lang.String r0 = "ReceiptProcessingGroup"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r5.<init>(r0)
            int r4 = r9.length
            java.lang.String[] r0 = new java.lang.String[r4]
            r5.keyId = r0
            boolean[] r0 = new boolean[r4]
            r5.keyFromMe = r0
            java.lang.String[] r0 = new java.lang.String[r4]
            r5.keyRemoteChatJidRawString = r0
            r3 = 0
        L_0x0020:
            if (r3 >= r4) goto L_0x003f
            java.lang.String[] r1 = r5.keyId
            r0 = r9[r3]
            java.lang.String r0 = r0.A01
            r1[r3] = r0
            boolean[] r1 = r5.keyFromMe
            r2 = r9[r3]
            boolean r0 = r2.A02
            r1[r3] = r0
            java.lang.String[] r1 = r5.keyRemoteChatJidRawString
            X.4uZ r0 = r2.A00
            java.lang.String r0 = X.C627336j.A07(r0)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0020
        L_0x003f:
            java.lang.String r0 = r7.getRawString()
            r5.remoteJidRawString = r0
            java.lang.String r0 = X.C627336j.A07(r6)
            r5.participantDeviceJidRawString = r0
            r5.status = r10
            r5.timestamp = r11
            r5.receiptPrivacyMode = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.ReceiptProcessingJob.<init>(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, X.3ZC, X.2z0[], int, long):void");
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; remoteJid=");
        A0o.append(AnonymousClass32W.A00(this.remoteJidRawString));
        A0o.append("; number of keys=");
        A0o.append(this.keyId.length);
        A0o.append("; receiptPrivacyMode=");
        return AnonymousClass000.A0R(this.receiptPrivacyMode, A0o);
    }

    public void Bm4(Context context) {
        this.A00 = (C67753Qn) C389229y.A01(context).AMr.get();
    }
}
