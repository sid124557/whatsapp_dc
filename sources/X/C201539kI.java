package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.9kI  reason: invalid class name and case insensitive filesystem */
public class C201539kI implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ AnonymousClass9SA A02;
    public final /* synthetic */ AnonymousClass9ZW A03;

    public C201539kI(CaptureRequest.Builder builder, AnonymousClass9SA r2, AnonymousClass9ZW r3, long j) {
        this.A02 = r2;
        this.A01 = builder;
        this.A03 = r3;
        this.A00 = j;
    }

    public /* bridge */ /* synthetic */ Object call() {
        CaptureRequest.Builder builder;
        C203589nz r1;
        AnonymousClass9SA r6 = this.A02;
        if (!r6.A0D) {
            throw AnonymousClass001.A0e("Not recording video.");
        } else if (r6.A0B == null || r6.A06 == null || r6.A04 == null || r6.A03 == null || r6.A02 == null) {
            throw AnonymousClass001.A0e("Cannot stop recording video, camera is closed");
        } else if (r6.A07 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r6.A00;
            if (elapsedRealtime < 500) {
                SystemClock.sleep(500 - elapsedRealtime);
            }
            AnonymousClass9VT r3 = r6.A07;
            r3.A02(AnonymousClass9VT.A0Q, Long.valueOf(SystemClock.elapsedRealtime()));
            Exception A002 = r6.A00();
            AnonymousClass96t r0 = r6.A04;
            AnonymousClass9Mx r5 = C195049Vr.A0A;
            if (!(C195049Vr.A02(r5, r0) == 0 || (builder = this.A01) == null || ((r1 = r6.A05) != null && C1899593h.A1V(C203589nz.A03, r1)))) {
                C194429Sv r12 = new C194429Sv();
                r12.A01(r5, 0);
                r6.A04.A0A(r12.A00());
                AnonymousClass9U8.A01(builder, r6.A04, r6.A06, 0);
                r6.A03.A03();
            }
            if (A002 == null) {
                r3.A02(AnonymousClass9VT.A0P, Long.valueOf(this.A00));
                return r3;
            }
            throw A002;
        } else {
            throw AnonymousClass001.A0e("Cannot stop recording video, VideoCaptureInfo is null");
        }
    }
}
