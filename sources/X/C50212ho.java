package X;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.2ho  reason: invalid class name and case insensitive filesystem */
public class C50212ho {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C66543Lv A02;
    public final C623334p A03;
    public final C72303dV A04;
    public final C56662sM A05;
    public final C58252ux A06;
    public final C66443Ll A07;

    public final C30571mf A00(C95814uZ r14, C624134x r15, boolean z) {
        long j;
        Cursor A032;
        long j2 = r15.A1L;
        if (r14 != null) {
            j = this.A03.A05(r14);
        } else {
            j = -1;
        }
        AnonymousClass4GK A033 = this.A04.get();
        try {
            C66443Ll r5 = this.A07;
            A032 = r5.A03(A033, (byte) 56, j2, j, z);
            if (A032.moveToNext()) {
                HashMap A002 = AnonymousClass26E.A00(A032, (byte) 56);
                C30331mH A052 = r5.A05(A032, A002);
                if (!(A052 instanceof C30571mf)) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "MessageAddOnReactionManager/getMessageAddOnReactionForMessageAndSender unexpected fmessage ", A052);
                } else {
                    C30571mf r2 = (C30571mf) A052;
                    r2.A1y(A032, this.A03, A002);
                    C30331mH.A04(r15, r2);
                    A032.close();
                    A033.close();
                    return r2;
                }
            }
            A032.close();
            A033.close();
            return null;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C50212ho(C55682qk r1, C56972sr r2, C66543Lv r3, C623334p r4, C72303dV r5, C56662sM r6, C58252ux r7, C66443Ll r8) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
    }

    public final void A01(C624134x r5, C30571mf r6, C30571mf r7) {
        if (!AnonymousClass2z0.A0C(r5)) {
            AnonymousClass4FP r3 = r5.A0L;
            if (r3 != null) {
                if (r6 != null) {
                    r3.BjZ(r6, r7, this.A05.A0B(AnonymousClass32Y.A07(r6), AnonymousClass32Y.A05(r7.A0n())));
                } else {
                    r3.Awm(r7);
                }
                this.A02.A0y.A02(r5);
            } else if (!AnonymousClass000.A1U(r5.A08 & 1, 1)) {
                r5.A1t(new C111495iB(this.A01, Collections.singletonList(r7)));
                C624134x.A0K(r5, 1);
                this.A02.A0X(r5);
            }
        }
    }
}
