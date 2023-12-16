package com.whatsapp.backup.google.workers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0JO;
import X.AnonymousClass0U8;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.C01390An;
import X.C01400Ao;
import X.C03070Is;
import X.C06260Ww;
import X.C162457s7;
import X.C16990uM;
import X.C34171uL;
import X.C389229y;
import X.C56972sr;
import X.C59022wD;
import X.C73853gB;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class BackupGpbSignalWorker extends CoroutineWorker {
    public final C56972sr A00;
    public final AnonymousClass0U8 A01;
    public final C06260Ww A02;
    public final AnonymousClass33p A03;
    public final C73853gB A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackupGpbSignalWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C162457s7.A0J(context, 1);
        C162457s7.A0J(workerParameters, 2);
        C16990uM r1 = (C16990uM) C389229y.A02(context, C16990uM.class);
        this.A00 = r1.BL4();
        this.A02 = r1.BEk();
        this.A03 = r1.BsO();
        this.A01 = r1.Axg();
        this.A04 = r1.BJY();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(X.C84814Du r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C14010o6
            if (r0 == 0) goto L_0x0020
            r5 = r7
            X.0o6 r5 = (X.C14010o6) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0020
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = X.C73883gE.A05()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r3) goto L_0x002a
            goto L_0x0026
        L_0x0020:
            X.0o6 r5 = new X.0o6
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0026:
            X.C57682u2.A01(r1)     // Catch:{ 0EN | 0EU -> 0x004b, 0EJ | 0EL | 0EW | 0EX -> 0x0045 }
            return r1
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x002f:
            X.C57682u2.A01(r1)
            X.3gB r2 = r6.A04     // Catch:{ 0EN | 0EU -> 0x004b, 0EJ | 0EL | 0EW | 0EX -> 0x0045 }
            r1 = 0
            com.whatsapp.backup.google.workers.BackupGpbSignalWorker$doWork$2 r0 = new com.whatsapp.backup.google.workers.BackupGpbSignalWorker$doWork$2     // Catch:{ 0EN | 0EU -> 0x004b, 0EJ | 0EL | 0EW | 0EX -> 0x0045 }
            r0.<init>(r6, r1)     // Catch:{ 0EN | 0EU -> 0x004b, 0EJ | 0EL | 0EW | 0EX -> 0x0045 }
            r5.L$0 = r6     // Catch:{ 0EN | 0EU -> 0x004b, 0EJ | 0EL | 0EW | 0EX -> 0x0045 }
            r5.label = r3     // Catch:{ 0EN | 0EU -> 0x004b, 0EJ | 0EL | 0EW | 0EX -> 0x0045 }
            java.lang.Object r1 = X.C57722u6.A00(r5, r2, r0)     // Catch:{ 0EN | 0EU -> 0x004b, 0EJ | 0EL | 0EW | 0EX -> 0x0045 }
            if (r1 != r4) goto L_0x0050
            return r4
        L_0x0045:
            r0 = move-exception
            X.0Is r1 = A00(r0)
            return r1
        L_0x004b:
            r0 = move-exception
            X.0Is r1 = A01(r0)
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.BackupGpbSignalWorker.A0D(X.4Du):java.lang.Object");
    }

    public static final C03070Is A00(Exception exc) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupGpbSignalWorker/failed with non-retryable error, failing. ");
        exc.printStackTrace();
        Log.w(AnonymousClass000.A0R(C59022wD.A00, A0o));
        return new C01400Ao();
    }

    public static final C03070Is A01(Exception exc) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupGpbSignalWorker/failed with retryable error, retrying later. ");
        exc.printStackTrace();
        Log.w(AnonymousClass000.A0R(C59022wD.A00, A0o));
        return new C01390An();
    }

    public static final void A04(AnonymousClass0U8 r0, AnonymousClass33p r1, AnonymousClass1VX r2, C34171uL r3) {
        AnonymousClass0JO.A00(r0, r1, r2, r3);
    }
}
