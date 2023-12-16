package X;

import com.whatsapp.backup.google.workers.GoogleBackupWorker;
import com.whatsapp.util.Log;

/* renamed from: X.0EZ  reason: invalid class name */
public class AnonymousClass0EZ extends AnonymousClass0YL {
    public final /* synthetic */ GoogleBackupWorker A00;

    public void A0E() {
        boolean z;
        C26041bU r2;
        int i;
        GoogleBackupWorker googleBackupWorker = this.A00;
        AnonymousClass0EG r1 = googleBackupWorker.A0B;
        if (!r1.A05()) {
            int i2 = googleBackupWorker.A01.A00;
            int i3 = googleBackupWorker.A00;
            if (i2 < i3) {
                if (!r1.A03()) {
                    r2 = googleBackupWorker.A0R;
                    i = 22;
                } else if (!r1.A02()) {
                    boolean A0j = googleBackupWorker.A07.A0j();
                    r2 = googleBackupWorker.A0R;
                    i = 19;
                    if (!A0j) {
                        i = 20;
                    }
                } else {
                    if (!r1.A04()) {
                        r2 = googleBackupWorker.A0R;
                        i = 21;
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("google-backup-worker/doWork conditions were not met(result code = ");
                    A0o.append(googleBackupWorker.A0R.A0U);
                    Log.i(AnonymousClass000.A0X("), retrying backup later", A0o));
                    z = false;
                }
                r2.A0U = Integer.valueOf(i);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("google-backup-worker/doWork conditions were not met(result code = ");
                A0o2.append(googleBackupWorker.A0R.A0U);
                Log.i(AnonymousClass000.A0X("), retrying backup later", A0o2));
                z = false;
            } else {
                googleBackupWorker.A0R.A0U = 24;
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("google-backup-worker/doWork worker reached the maximum amount of retries(");
                A0o3.append(i3);
                Log.e(AnonymousClass000.A0X("), failing", A0o3));
                z = true;
            }
            A0K(z);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0EZ(X.C55682qk r36, X.C64393Dh r37, X.AnonymousClass0U8 r38, X.C06430Xr r39, X.AnonymousClass0WN r40, X.AnonymousClass0WF r41, X.C10240hc r42, X.AnonymousClass0F1 r43, X.C04450Oi r44, X.AnonymousClass0QR r45, X.C04710Qi r46, X.AnonymousClass0Y7 r47, X.C16420tN r48, com.whatsapp.backup.google.workers.GoogleBackupWorker r49, X.AnonymousClass310 r50, X.C56512s6 r51, X.C56612sH r52, X.C54292oU r53, X.AnonymousClass5ZR r54, X.AnonymousClass33p r55, X.C613830m r56, X.C625835r r57, X.C72303dV r58, X.AnonymousClass1VX r59, X.AnonymousClass4FV r60, X.C26041bU r61, X.AnonymousClass31C r62, X.C34171uL r63, X.C183538qC r64, java.lang.String r65, java.util.List r66, java.util.concurrent.atomic.AtomicLong r67, java.util.concurrent.atomic.AtomicLong r68) {
        /*
            r35 = this;
            r34 = 0
            r1 = r35
            r0 = r49
            r1.A00 = r0
            r28 = r63
            r27 = r62
            r26 = r61
            r25 = r60
            r24 = r59
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r29 = r64
            r30 = r65
            r2 = r36
            r6 = r40
            r31 = r66
            r3 = r37
            r7 = r41
            r32 = r67
            r4 = r38
            r8 = r42
            r33 = r68
            r5 = r39
            r14 = r48
            r15 = r50
            r16 = r51
            r17 = r52
            r18 = r53
            r19 = r54
            r20 = r55
            r21 = r56
            r22 = r57
            r23 = r58
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EZ.<init>(X.2qk, X.3Dh, X.0U8, X.0Xr, X.0WN, X.0WF, X.0hc, X.0F1, X.0Oi, X.0QR, X.0Qi, X.0Y7, X.0tN, com.whatsapp.backup.google.workers.GoogleBackupWorker, X.310, X.2s6, X.2sH, X.2oU, X.5ZR, X.33p, X.30m, X.35r, X.3dV, X.1VX, X.4FV, X.1bU, X.31C, X.1uL, X.8qC, java.lang.String, java.util.List, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong):void");
    }
}
