package X;

import java.util.Iterator;

/* renamed from: X.2nP  reason: invalid class name and case insensitive filesystem */
public class C53632nP {
    public C60682yx A00 = new C60682yx();
    public Runnable A01;
    public final C56972sr A02;
    public final C66663Mh A03;
    public final C28971i4 A04;
    public final C28981i5 A05;
    public final AnonymousClass4FS A06;

    public synchronized void A02(boolean z) {
        C60682yx r1 = this.A00;
        if (!r1.A01() && C60682yx.A00(r1.A00, z)) {
            C18260x0.A1E("CriticalDataUploadManager/onAppStateSyncComplete isSuccess=", AnonymousClass001.A0o(), z);
            A00();
        }
    }

    public final void A00() {
        C60682yx r4 = this.A00;
        if (r4.A03()) {
            boolean A022 = r4.A02();
            boolean z = r4.A02;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CriticalDataUploadManager/handleCompleted isSuccess=");
            A0o.append(A022);
            C18260x0.A1E(", hasTimedOut=", A0o, z);
            synchronized (this) {
                Runnable runnable = this.A01;
                if (runnable != null) {
                    this.A06.BjN(runnable);
                    this.A01 = null;
                }
                C55992rF r1 = r4.A01;
                synchronized (r1) {
                    r1.A00 = 1;
                }
                C55992rF r12 = r4.A00;
                synchronized (r12) {
                    r12.A00 = 1;
                }
                r4.A02 = false;
            }
            Iterator A032 = C61102zi.A03(this.A04);
            if (A022) {
                while (A032.hasNext()) {
                    ((C84484Cn) A032.next()).onSuccess();
                }
                return;
            }
            while (A032.hasNext()) {
                ((C84484Cn) A032.next()).BSj(z);
            }
        }
    }

    public void A01(boolean z) {
        C60682yx r1 = this.A00;
        if (!r1.A01() && C60682yx.A00(r1.A01, z)) {
            C18260x0.A1E("CriticalDataUploadManager/onHistorySyncComplete isSuccess=", AnonymousClass001.A0o(), z);
            A00();
        }
    }

    public C53632nP(C56972sr r2, C66663Mh r3, C28971i4 r4, C28981i5 r5, AnonymousClass4FS r6) {
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }
}
