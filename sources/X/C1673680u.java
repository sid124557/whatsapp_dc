package X;

import android.os.Handler;

/* renamed from: X.80u  reason: invalid class name and case insensitive filesystem */
public final class C1673680u implements C183678qR {
    public final /* synthetic */ C125866Ju A00;

    public C1673680u(C125866Ju r1) {
        this.A00 = r1;
    }

    public void BYR() {
        this.A00.A0A = true;
    }

    public void Ber(int i, long j, long j2) {
        C150677Rt r2 = this.A00.A0E;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new C117285rg(r2, i, 0, j, j2));
        }
    }
}
