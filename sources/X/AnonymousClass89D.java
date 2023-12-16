package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: X.89D  reason: invalid class name */
public final class AnonymousClass89D implements C180818lg {
    public final /* synthetic */ C150317Qd A00;
    public final /* synthetic */ C180908lp A01;
    public final /* synthetic */ C178418hV A02;
    public final /* synthetic */ C152017Xf A03;

    public AnonymousClass89D(C150317Qd r1, C180908lp r2, C178418hV r3, C152017Xf r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void BPP(Status status) {
        if (status.A01 <= 0) {
            C150317Qd r5 = this.A00;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) r5;
            C162177rO.A04("Result has already been consumed.", !basePendingResult.A0C);
            try {
                if (!basePendingResult.A09.await(0, timeUnit)) {
                    basePendingResult.A07(Status.A0B);
                }
            } catch (InterruptedException unused) {
                basePendingResult.A07(Status.A08);
            }
            C162177rO.A04("Result is not ready.", AnonymousClass000.A1T((basePendingResult.A09.getCount() > 0 ? 1 : (basePendingResult.A09.getCount() == 0 ? 0 : -1))));
            this.A03.A00(this.A01.Azi(basePendingResult.A01()));
            return;
        }
        C152017Xf r0 = this.A03;
        r0.A00.A03(AnonymousClass72J.A00(status));
    }
}
