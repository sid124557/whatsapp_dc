package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import java.util.concurrent.FutureTask;

/* renamed from: X.9Tj  reason: invalid class name and case insensitive filesystem */
public class C194549Tj {
    public CameraDevice A00;
    public CameraManager A01;
    public C202329lq A02;
    public C192969Ml A03;
    public AnonymousClass9WQ A04;
    public AnonymousClass9WO A05;
    public AnonymousClass96t A06;
    public C194899Ux A07;
    public FutureTask A08;
    public boolean A09;
    public final AnonymousClass9T1 A0A;
    public final C194959Vh A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public synchronized void A00() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0B.A08(futureTask);
            this.A08 = null;
        }
    }

    public synchronized void A02(CaptureRequest.Builder builder, AnonymousClass9ZW r5, long j) {
        C204479pQ r2 = new C204479pQ(builder, this, r5, 1);
        A00();
        this.A08 = this.A0B.A02("reset_focus", r2, j);
    }

    public C194549Tj(C194959Vh r2) {
        AnonymousClass9T1 r0 = new AnonymousClass9T1(r2);
        this.A0B = r2;
        this.A0A = r0;
    }

    public void A01(CaptureRequest.Builder builder, AnonymousClass9ZW r15) {
        C203429ng r2;
        this.A0A.A01("Can only reset focus on the Optic thread.");
        if (this.A04 != null && this.A05 != null) {
            CaptureRequest.Builder builder2 = builder;
            if (builder != null && this.A07 != null && this.A0D && (r2 = this.A04.A08) != null) {
                this.A0E = false;
                this.A0C = false;
                AnonymousClass9WO r1 = this.A05;
                AnonymousClass9WO r12 = this.A05;
                Rect rect = r12.A04;
                MeteringRectangle[] A052 = r12.A05(r12.A0D);
                AnonymousClass9WO r13 = this.A05;
                MeteringRectangle[] A053 = r13.A05(r13.A0C);
                AnonymousClass9WQ.A00(rect, builder2, this.A07, A052, A053, r1.A03(r1.A02()) * 100.0f);
                C1899593h.A0l(builder, CaptureRequest.CONTROL_AF_TRIGGER, 2);
                r2.Ayh(builder.build(), (Handler) null, r15);
                CameraManager cameraManager = this.A01;
                CameraDevice cameraDevice = this.A00;
                cameraDevice.getClass();
                String id = cameraDevice.getId();
                AnonymousClass96t r9 = this.A06;
                r9.getClass();
                int A002 = AnonymousClass9U8.A00(cameraManager, builder, r9, this.A07, id, 0);
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                r2.BnB(builder.build(), (Handler) null, r15);
                if (A002 == 1) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    C1899593h.A0l(builder, key, 1);
                    r2.Ayh(builder.build(), (Handler) null, r15);
                    builder.set(key, 0);
                }
            }
        }
    }

    public void A03(C192379Jm r2, float[] fArr) {
        if (this.A02 != null) {
            AnonymousClass9WU.A00(new AnonymousClass9j3(r2, this, fArr));
        }
    }

    public void A04(AnonymousClass9ZW r3) {
        AnonymousClass96t r1;
        C194899Ux r12 = this.A07;
        r12.getClass();
        if (C194899Ux.A04(C194899Ux.A03, r12)) {
            if (C194899Ux.A04(C194899Ux.A02, this.A07) && (r1 = this.A06) != null && C195049Vr.A07(C195049Vr.A0O, r1)) {
                this.A09 = true;
                r3.A07 = new AnonymousClass9ZT(this);
                return;
            }
        }
        r3.A07 = null;
        this.A09 = false;
    }
}
