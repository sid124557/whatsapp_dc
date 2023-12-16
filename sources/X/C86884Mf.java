package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.4Mf  reason: invalid class name and case insensitive filesystem */
public final class C86884Mf extends HandlerThread {
    public int A00;
    public long A01 = -1;
    public Handler A02;
    public AnonymousClass5ZQ A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Handler A07;
    public final C55682qk A08;
    public final C56612sH A09;
    public final C54292oU A0A;
    public final AnonymousClass1VX A0B;
    public final C183538qC A0C;
    public final File A0D;
    public final WeakReference A0E;

    public final int A00() {
        AnonymousClass5ZQ r0 = this.A03;
        if (r0 != null) {
            this.A00 = Math.max(this.A00, r0.A02());
        }
        int i = this.A00;
        long j = this.A01;
        if (j != -1) {
            return i + ((int) AnonymousClass0x7.A0E(j));
        }
        return i;
    }

    public final void A01() {
        long j = this.A01;
        if (j != -1) {
            this.A00 += (int) AnonymousClass0x7.A0E(j);
            this.A01 = -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.A05 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r2 = this;
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0009
            boolean r0 = r2.A05
            r1 = 1
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            X.5ZQ r0 = r2.A03
            if (r0 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x002f
            int r1 = r2.A00()     // Catch:{ IOException -> 0x0023 }
            X.5ZQ r0 = r2.A03     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x001b
            r0.A0A(r1)     // Catch:{ IOException -> 0x0023 }
        L_0x001b:
            X.5ZQ r0 = r2.A03     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0032
            r0.A07()     // Catch:{ IOException -> 0x0023 }
            return
        L_0x0023:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            android.os.Handler r1 = r2.A07
            r0 = 9
            X.C117635sF.A00(r1, r2, r0)
            return
        L_0x002f:
            r0.A04()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86884Mf.A02():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86884Mf(C55682qk r3, C56612sH r4, C54292oU r5, AnonymousClass1VX r6, C985351g r7, C183538qC r8, File file) {
        super("VoiceStatusPlayerThread");
        C18260x0.A0c(r5, r6, r3, r4);
        C162457s7.A0J(r8, 6);
        this.A0A = r5;
        this.A0B = r6;
        this.A08 = r3;
        this.A09 = r4;
        this.A0C = r8;
        this.A0D = file;
        this.A0E = AnonymousClass0x9.A14(r7);
        this.A07 = AnonymousClass000.A0A();
        this.A06 = 16;
    }
}
