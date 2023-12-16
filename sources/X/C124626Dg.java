package X;

import android.os.CountDownTimer;
import android.view.View;

/* renamed from: X.6Dg  reason: invalid class name and case insensitive filesystem */
public class C124626Dg extends CountDownTimer {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C153427bI A01;
    public final /* synthetic */ C131026cv A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124626Dg(View view, C153427bI r4, C131026cv r5, long j) {
        super(j, 1000);
        this.A02 = r5;
        this.A00 = view;
        this.A01 = r4;
    }

    public void onFinish() {
        C153427bI r6 = this.A01;
        C160817oM A022 = C162377rs.A02(r6);
        AnonymousClass84O r4 = this.A02.A00;
        A022.A0A(new AnonymousClass8D9((long) r4.A02), new C188978zn(this, 3));
        A022.A06();
        C835248t A0L = r4.A0L(36);
        if (A0L != null) {
            C159377lj.A01(r6, r4, C152057Xj.A02(r4), A0L);
        }
    }

    public void onTick(long j) {
        this.A02.A01.Bnp(this.A00, C18290x4.A0B(j));
    }
}
