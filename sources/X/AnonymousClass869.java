package X;

import android.os.Handler;

/* renamed from: X.869  reason: invalid class name */
public final class AnonymousClass869 implements C186018uc {
    public final /* synthetic */ C126676Ow A00;

    public AnonymousClass869(C126676Ow r1) {
        this.A00 = r1;
    }

    public void BMt(Exception exc) {
        AnonymousClass7VZ r2 = this.A00.A09;
        Handler handler = r2.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r2, exc, 28);
        }
    }

    public void BXJ() {
        C178018gp r0 = this.A00.A03;
        if (r0 != null) {
            C1692188l.A00(((AnonymousClass860) r0).A00.A0Y, 2);
        }
    }

    public void BXK(long j) {
        C178018gp r3 = this.A00.A03;
        if (r3 != null) {
            AnonymousClass860 r32 = (AnonymousClass860) r3;
            if (j >= 2000) {
                r32.A00.A0G = true;
            }
        }
    }

    public void BYQ(long j) {
        AnonymousClass7VZ r3 = this.A00.A09;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new C70083Zv(r3, j, 2));
        }
    }

    public void BYR() {
        this.A00.A05 = true;
    }

    public void Bbk(boolean z) {
        AnonymousClass7VZ r3 = this.A00.A09;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new C71703cX(2, (Object) r3, z));
        }
    }

    public void Ber(int i, long j, long j2) {
        AnonymousClass7VZ r2 = this.A00.A09;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new C117285rg(r2, i, 1, j, j2));
        }
    }
}
