package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass32W;
import X.AnonymousClass3ZC;
import X.C1228065u;
import X.C389229y;
import X.C67753Qn;
import android.content.Context;
import com.whatsapp.jid.Jid;
import org.whispersystems.jobqueue.Job;

public final class ReceiptMultiTargetProcessingJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C67753Qn A00;
    public final boolean keyFromMe;
    public final String keyId;
    public final String keyRemoteChatJidRawString;
    public final String[] participantDeviceJidRawString;
    public final AnonymousClass3ZC receiptPrivacyMode;
    public final String remoteJidString;
    public final int status;
    public final long[] timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReceiptMultiTargetProcessingJob(com.whatsapp.jid.Jid r7, X.AnonymousClass2z0 r8, X.AnonymousClass3ZC r9, java.util.List r10, int r11) {
        /*
            r6 = this;
            X.2gM r1 = X.C49332gM.A01()
            r0 = 1
            r1.A02 = r0
            java.lang.String r0 = "ReceiptProcessingGroup"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r6.<init>(r0)
            int r5 = r10.size()
            java.lang.String r0 = r8.A01
            r6.keyId = r0
            boolean r0 = r8.A02
            r6.keyFromMe = r0
            X.4uZ r0 = r8.A00
            java.lang.String r0 = X.C18300x5.A0i(r0)
            r6.keyRemoteChatJidRawString = r0
            java.lang.String r0 = r7.getRawString()
            r6.remoteJidString = r0
            r6.status = r11
            java.lang.String[] r0 = new java.lang.String[r5]
            r6.participantDeviceJidRawString = r0
            long[] r0 = new long[r5]
            r6.timestamp = r0
            r6.receiptPrivacyMode = r9
            r4 = 0
        L_0x0039:
            if (r4 >= r5) goto L_0x005d
            java.lang.Object r3 = r10.get(r4)
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.String[] r1 = r6.participantDeviceJidRawString
            java.lang.Object r0 = r3.first
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = X.C627336j.A07(r0)
            r1[r4] = r0
            long[] r2 = r6.timestamp
            java.lang.Object r0 = r3.second
            X.C626936e.A06(r0)
            long r0 = X.C18310x6.A0B(r0)
            r2[r4] = r0
            int r4 = r4 + 1
            goto L_0x0039
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob.<init>(com.whatsapp.jid.Jid, X.2z0, X.3ZC, java.util.List, int):void");
    }

    public final String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; keyRemoteJid=");
        String str = this.keyRemoteChatJidRawString;
        AnonymousClass32W r1 = Jid.Companion;
        A0o.append(r1.A03(str));
        A0o.append("; remoteJid=");
        A0o.append(r1.A03(this.remoteJidString));
        A0o.append("; number of participants=");
        A0o.append(this.participantDeviceJidRawString.length);
        A0o.append("; recepitPrivacyMode=");
        return AnonymousClass000.A0R(this.receiptPrivacyMode, A0o);
    }

    public void Bm4(Context context) {
        this.A00 = (C67753Qn) C389229y.A00(context).AMr.get();
    }
}
