package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass31C;
import X.AnonymousClass36A;
import X.C1228065u;
import X.C18270x1;
import X.C18330xA;
import X.C29021i9;
import X.C389229y;
import X.C48972fm;
import X.C614730x;
import X.C621133n;
import X.C64333Db;
import X.C73523fe;
import android.content.Context;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import org.whispersystems.jobqueue.Job;

public final class RotateSignedPreKeyJob extends Job implements C1228065u {
    public static final long serialVersionUID = 1;
    public transient C29021i9 A00;
    public transient C621133n A01;
    public transient C48972fm A02;
    public transient C614730x A03;
    public transient AnonymousClass31C A04;
    public final byte[] data;
    public final byte[] id;
    public final byte[] signature;

    public final void A09(byte[] bArr) {
        C73523fe A032 = this.A03.A03();
        try {
            if (!MessageDigest.isEqual(bArr, this.A01.A0d())) {
                this.A01.A0K();
                this.A00.A0C();
            }
            if (A032 != null) {
                A032.close();
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RotateSignedPreKeyJob(byte[] r4, byte[] r5, byte[] r6) {
        /*
            r3 = this;
            X.2gM r1 = X.C49332gM.A01()
            java.lang.String r0 = "RotateSignedPreKeyJob"
            X.C49332gM.A03(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A04()
            r3.<init>(r0)
            X.C626936e.A0G(r4)
            r3.id = r4
            X.C626936e.A0G(r5)
            r3.data = r5
            X.C626936e.A0G(r6)
            r3.signature = r6
            int r2 = r4.length
            r0 = 3
            if (r2 != r0) goto L_0x0044
            int r2 = r5.length
            r0 = 32
            if (r2 != r0) goto L_0x0039
            int r2 = r6.length
            r0 = 64
            if (r2 != r0) goto L_0x002e
            return
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "invalid signed pre-key signature length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        L_0x0039:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "invalid signed pre-key length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "invalid signed pre-key id length: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.RotateSignedPreKeyJob.<init>(byte[], byte[], byte[]):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = this.id;
        if (bArr != null) {
            byte[] bArr2 = this.data;
            if (bArr2 != null) {
                byte[] bArr3 = this.signature;
                if (bArr3 != null) {
                    int length = bArr.length;
                    if (length == 3) {
                        int length2 = bArr2.length;
                        if (length2 == 32) {
                            int length3 = bArr3.length;
                            if (length3 != 64) {
                                throw C18330xA.A06(AnonymousClass000.A0Y("invalid signed pre-key signature length: ", AnonymousClass001.A0o(), length3));
                            }
                            return;
                        }
                        throw C18330xA.A06(AnonymousClass000.A0Y("invalid signed pre-key length: ", AnonymousClass001.A0o(), length2));
                    }
                    throw C18330xA.A06(AnonymousClass000.A0Y("invalid signed pre-key id length: ", AnonymousClass001.A0o(), length));
                }
                throw C18330xA.A06("signature cannot be null");
            }
            throw C18330xA.A06("data cannot be null");
        }
        throw C18330xA.A06("id cannot be null");
    }

    public String A08() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("; signedPreKeyId=");
        A0o.append(AnonymousClass36A.A00(this.id));
        C18270x1.A1I(A0o, this);
        return A0o.toString();
    }

    public void Bm4(Context context) {
        C64333Db A002 = C389229y.A00(context);
        this.A03 = (C614730x) A002.AW8.get();
        this.A04 = A002.BLC();
        this.A02 = (C48972fm) A002.AW6.get();
        this.A00 = (C29021i9) A002.ANA.get();
        this.A01 = C64333Db.A2v(A002);
    }
}
