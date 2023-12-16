package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9pQ  reason: invalid class name and case insensitive filesystem */
public class C204479pQ implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204479pQ(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        Camera.ShutterCallback shutterCallback;
        AnonymousClass9XG r1;
        C203429ng r6;
        switch (this.A03) {
            case 0:
                AnonymousClass9ZR r7 = (AnonymousClass9ZR) this.A00;
                AnonymousClass9SQ r62 = (AnonymousClass9SQ) this.A01;
                AnonymousClass9V5 r8 = (AnonymousClass9V5) this.A02;
                r7.A0B("Cannot get camera settings");
                AnonymousClass9T8 r3 = r7.A0P;
                C195049Vr.A06(C195049Vr.A0e, r3.A02(r7.A00));
                AnonymousClass9WT.A00();
                int A032 = r7.A0J.A03(r7.A00, r7.A0Y);
                AnonymousClass96v A002 = r3.A00(r7.A00);
                AnonymousClass9My.A02(C195049Vr.A0d, A002, Integer.valueOf(A032));
                A002.A02();
                C195049Vr A022 = r3.A02(r7.A00);
                Rect rect = (Rect) C195049Vr.A04(C195049Vr.A0m, A022);
                int A023 = C195049Vr.A02(C195049Vr.A0p, A022);
                C194959Vh r2 = r7.A0U;
                UUID uuid = r7.A0T.A03;
                Objects.requireNonNull(r62);
                r2.A05(new C198689fK(r62), uuid);
                if (AnonymousClass9V5.A00(AnonymousClass9V5.A01, r8)) {
                    shutterCallback = null;
                } else {
                    shutterCallback = AnonymousClass9ZR.A0h;
                }
                C194409St r9 = new C194409St((Rect) C195049Vr.A04(C195049Vr.A0g, A022), rect, A032, r7.A00);
                if (AnonymousClass9V5.A00(AnonymousClass9V5.A02, r8)) {
                    r1 = new AnonymousClass9XG(r62, r7, r8, r9);
                } else {
                    C1899593h.A1U(r7.A0N.A00);
                    r1 = null;
                }
                r7.A0Z.getClass();
                r7.A0Z.takePicture(shutterCallback, (Camera.PictureCallback) null, r1, new AnonymousClass9XH(rect, r62, r7, r8, r9, A032, A023));
                C193919Qs r22 = r7.A0L.A00;
                ReentrantLock reentrantLock = r22.A01;
                reentrantLock.lock();
                try {
                    r22.A00 = 0;
                    reentrantLock.unlock();
                    AnonymousClass9WU.A01("Some how photo taking call is happening on the UI Thread!!");
                    try {
                        C193809Qd r23 = r7.A0N;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Object obj = r23.A00.get();
                        obj.getClass();
                        ((CountDownLatch) obj).await(10000, timeUnit);
                    } catch (InterruptedException e) {
                        Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e);
                    }
                    C193809Qd r63 = r7.A0N;
                    Object obj2 = r63.A00.get();
                    obj2.getClass();
                    if (((CountDownLatch) obj2).getCount() <= 0) {
                        boolean A003 = AnonymousClass9V5.A00(AnonymousClass9V5.A03, r8);
                        AnonymousClass9WU.A01("Performing post photo capture on UI thread");
                        if (!r7.isConnected()) {
                            return null;
                        }
                        if (A003) {
                            r7.A05();
                        }
                        r63.A00(0);
                        return null;
                    }
                    r7.A0X.set(true);
                    throw new C201669kX();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                C194549Tj r24 = (C194549Tj) this.A00;
                r24.A0A.A00("Cannot schedule reset focus task, not prepared");
                C192969Ml r0 = r24.A03;
                r0.getClass();
                if (!r0.A00.isConnected() || r24.A0E || !r24.A0D) {
                    return null;
                }
                r24.A0C = false;
                r24.A00();
                r24.A03(C192379Jm.CANCELLED, (float[]) null);
                AnonymousClass9ZW r12 = (AnonymousClass9ZW) this.A01;
                r12.A07 = null;
                r12.A05 = null;
                try {
                    r24.A01((CaptureRequest.Builder) this.A02, r12);
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            case 2:
                C194549Tj r25 = (C194549Tj) this.A00;
                r25.A0A.A00("Cannot schedule reset focus task, not prepared");
                C192969Ml r02 = r25.A03;
                r02.getClass();
                if (!r02.A00.isConnected() || r25.A0E) {
                    return null;
                }
                ((AnonymousClass9ZW) this.A01).A05 = new AnonymousClass9Mt(this);
                return null;
            case 3:
                AnonymousClass9WQ r03 = ((C195079Vu) this.A00).A02;
                if (r03 != null) {
                    C203429ng r26 = r03.A08;
                    if (r26 != null) {
                        CaptureRequest build = ((CaptureRequest.Builder) this.A01).build();
                        AnonymousClass9ZV r32 = (AnonymousClass9ZV) this.A02;
                        r26.Ayh(build, (Handler) null, r32);
                        return r32;
                    }
                    throw new C201699ka("Session closed while capturing photo.");
                }
                throw new C201699ka("Preview closed while capturing photo.");
            default:
                C195079Vu r13 = (C195079Vu) this.A00;
                AnonymousClass9WQ r04 = r13.A02;
                if (r04 == null || !r04.A0Q || (r6 = r13.A02.A08) == null) {
                    return this.A01;
                }
                CaptureRequest.Builder builder = (CaptureRequest.Builder) this.A02;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                Integer A0Z = C18290x4.A0Z();
                builder.set(key, A0Z);
                CaptureRequest build2 = builder.build();
                AnonymousClass9ZW r33 = (AnonymousClass9ZW) this.A01;
                r6.Ayh(build2, (Handler) null, r33);
                builder.set(key, AnonymousClass001.A0f());
                r6.Ayh(builder.build(), (Handler) null, r33);
                builder.set(key, A0Z);
                r6.BnB(builder.build(), (Handler) null, r33);
                return r33;
        }
    }
}
