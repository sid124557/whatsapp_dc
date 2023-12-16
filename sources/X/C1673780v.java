package X;

import android.os.Handler;

/* renamed from: X.80v  reason: invalid class name and case insensitive filesystem */
public final class C1673780v implements C183678qR {
    public final /* synthetic */ AnonymousClass6JR A00;

    public C1673780v(AnonymousClass6JR r1) {
        this.A00 = r1;
    }

    public void BYR() {
        this.A00.A0C = true;
    }

    public void Ber(int i, long j, long j2) {
        C150677Rt r2 = this.A00.A0I;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new C117285rg(r2, i, 0, j, j2));
        }
    }
}
