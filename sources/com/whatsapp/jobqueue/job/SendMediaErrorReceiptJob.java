package com.whatsapp.jobqueue.job;

import X.AnonymousClass31C;
import X.C1228065u;
import X.C18330xA;
import X.C389229y;
import X.C59432wu;
import X.C64333Db;
import android.content.Context;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendMediaErrorReceiptJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C59432wu A00;
    public transient AnonymousClass31C A01;
    public final String category;
    public final boolean mediaFromMe;
    public final byte[] mediaKey;
    public final String messageId;
    public final String myPrimaryJid;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendMediaErrorReceiptJob(X.C95814uZ r3, X.C624134x r4, java.lang.String r5, byte[] r6) {
        /*
            r2 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "media-error-receipt"
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r2.<init>(r0)
            X.2z0 r1 = r4.A1J
            X.4uZ r0 = r1.A00
            java.lang.String r0 = X.C18300x5.A0i(r0)
            r2.remoteJidRawJid = r0
            X.4uZ r0 = r4.A0n()
            java.lang.String r0 = X.C627336j.A07(r0)
            r2.remoteResourceRawJid = r0
            java.lang.String r0 = X.C627336j.A07(r3)
            r2.myPrimaryJid = r0
            java.lang.String r0 = r1.A01
            r2.messageId = r0
            r2.mediaKey = r6
            r2.category = r5
            boolean r0 = r1.A02
            r2.mediaFromMe = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob.<init>(X.4uZ, X.34x, java.lang.String, byte[]):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.remoteJidRawJid)) {
            throw C18330xA.A06("remoteJid must not be empty");
        } else if (TextUtils.isEmpty(this.messageId)) {
            throw C18330xA.A06("messageId must not be empty");
        }
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A01 = A002.BLC();
        this.A00 = (C59432wu) A002.ATw.get();
    }
}
