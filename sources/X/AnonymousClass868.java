package X;

import android.os.Handler;

/* renamed from: X.868  reason: invalid class name */
public final class AnonymousClass868 implements C186018uc {
    public final /* synthetic */ AnonymousClass6OI A00;

    public AnonymousClass868(AnonymousClass6OI r1) {
        this.A00 = r1;
    }

    public void BMt(Exception exc) {
        AnonymousClass7VZ r2 = this.A00.A0H;
        Handler handler = r2.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r2, exc, 28);
        }
    }

    public /* synthetic */ void BXJ() {
    }

    public /* synthetic */ void BXK(long j) {
    }

    public void BYQ(long j) {
        AnonymousClass7VZ r3 = this.A00.A0H;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new C70083Zv(r3, j, 2));
        }
    }

    public void BYR() {
        this.A00.A0C = true;
    }

    public void Bbk(boolean z) {
        AnonymousClass7VZ r3 = this.A00.A0H;
        Handler handler = r3.A00;
        if (handler != null) {
            handler.post(new C71703cX(2, (Object) r3, z));
        }
    }

    public void Ber(int i, long j, long j2) {
        AnonymousClass7VZ r2 = this.A00.A0H;
        Handler handler = r2.A00;
        if (handler != null) {
            handler.post(new C117285rg(r2, i, 1, j, j2));
        }
    }
}
