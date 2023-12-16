package X;

import android.os.Process;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

/* renamed from: X.91J  reason: invalid class name */
public class AnonymousClass91J implements Callable {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass91J(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i;
        int i2;
        switch (this.A02) {
            case 0:
                C1684685n r1 = (C1684685n) this.A01;
                Process.setThreadPriority(this.A00);
                AnonymousClass8U0 r3 = r1.A04;
                if (r3.mEnableThreadLockSync) {
                    r3.lock();
                }
                while (true) {
                    try {
                        if (!r1.A0K && !Thread.currentThread().isInterrupted()) {
                            if (!r3.mEnableThreadLockSync || !r1.A0M) {
                                C1683385a B1T = r1.A0I.B1T((long) r1.A07);
                                if (B1T != null) {
                                    if (B1T.B50() != null) {
                                        int A012 = r1.A0H.A01(B1T.B50());
                                        long A022 = r1.A0H.A02() - 0;
                                        if (A012 > 0) {
                                            AnonymousClass7B8 r0 = r1.A0H.A08;
                                            if (r0 != null) {
                                                i = r0.A00.getSampleFlags();
                                            } else {
                                                i = -1;
                                            }
                                            B1T.Blq(0, A012, A022, i);
                                            r1.A0I.Bi6(B1T);
                                            r1.A0H.A08();
                                        } else {
                                            B1T.Blq(0, 0, 0, 4);
                                            r1.A0I.Bi6(B1T);
                                        }
                                    } else {
                                        C1445171w.A00("VideoDemuxDecodeWrapperTag", "extractVideoFrame: byteBuffer cannot be null", new Object[0]);
                                        throw AnonymousClass001.A0e("byteBuffer cannot be null");
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
                r3.close();
                return null;
            case 1:
                AnonymousClass8KC r2 = (AnonymousClass8KC) this.A01;
                int i3 = this.A00;
                if (!r2.A0I.get()) {
                    i2 = -6;
                } else {
                    r2.A0G.setScaleType(i3);
                    i2 = 0;
                }
                return Integer.valueOf(i2);
            default:
                return ((VoipPhysicalCamera) this.A01).maybeUpdateCameraProcessorOrientationOnCameraThread(this.A00);
        }
    }
}
