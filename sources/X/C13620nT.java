package X;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Callable;

/* renamed from: X.0nT  reason: invalid class name and case insensitive filesystem */
public final class C13620nT implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass0OT A03;
    public final /* synthetic */ AnonymousClass0UK A04;
    public final /* synthetic */ AnonymousClass0UK A05;
    public final /* synthetic */ C141896wJ A06;
    public final /* synthetic */ C152987aU A07;
    public final /* synthetic */ AnonymousClass84O A08;
    public final /* synthetic */ boolean A09;

    public C13620nT(AnonymousClass0OT r1, AnonymousClass0UK r2, AnonymousClass0UK r3, C141896wJ r4, C152987aU r5, AnonymousClass84O r6, int i, int i2, int i3, boolean z) {
        this.A05 = r2;
        this.A04 = r3;
        this.A03 = r1;
        this.A08 = r6;
        this.A07 = r5;
        this.A00 = i;
        this.A06 = r4;
        this.A02 = i2;
        this.A01 = i3;
        this.A09 = z;
    }

    /* renamed from: A00 */
    public final C160247nJ call() {
        AnonymousClass0UK r6 = this.A05;
        int A002 = r6.A00();
        AnonymousClass0UK r5 = this.A04;
        int A003 = r5.A00();
        AnonymousClass0OT r1 = this.A03;
        AnonymousClass84O r8 = this.A08;
        C160247nJ A004 = r1.A00(r8, true);
        C160497nj r15 = C160247nJ.A04;
        C152987aU r7 = this.A07;
        Context A022 = r7.A02();
        C158047jL r2 = new C158047jL(r8);
        Object A042 = r7.A04();
        C153427bI r3 = (C153427bI) A042;
        AnonymousClass73A.A00(r3);
        int A012 = r7.A01();
        C160247nJ A013 = r15.A01(A022, A004, r2, A042, A012, A002, A003);
        r1.A01(A013, r8, true);
        if (!r6.A03() || !r5.A03()) {
            C151847Wn A005 = A013.A00();
            int A023 = A005.A02();
            int A014 = A005.A01();
            AnonymousClass3Z6 A032 = AnonymousClass0YK.A00.A0C(this.A06, r8, A023, A014, this.A00, this.A02, this.A01, this.A09);
            int A024 = ((C172498Lj) A032.A0B()).A02();
            int A025 = ((C172498Lj) A032.A0C()).A02();
            if (!(A024 == A023 && A025 == A014)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A024, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A025, 1073741824);
                C160247nJ A006 = r1.A00(r8, false);
                C158047jL r0 = new C158047jL(r8);
                AnonymousClass73A.A00(r3);
                C160247nJ A015 = r15.A01(A022, A006, r0, A042, A012, makeMeasureSpec, makeMeasureSpec2);
                r1.A01(A015, r8, false);
                return A015;
            }
        }
        return A013;
    }
}
