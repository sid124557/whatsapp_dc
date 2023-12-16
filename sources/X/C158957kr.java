package X;

import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.MmapBufferManager;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.7kr  reason: invalid class name and case insensitive filesystem */
public final class C158957kr {
    public static final ThreadLocal A09 = new C173828Rv();
    public static volatile C158957kr A0A;
    public C124796Dx A00;
    public final SparseArray A01;
    public final AnonymousClass843 A02;
    public final C185308tQ A03;
    public final MmapBufferManager A04;
    public final File A05;
    public final AtomicInteger A06 = AnonymousClass6CA.A0d();
    public final AtomicReference A07;
    public final AtomicReferenceArray A08 = new AtomicReferenceArray(2);

    public final C166567yu A00(int i, long j) {
        if (this.A06.get() != 0) {
            int i2 = 0;
            do {
                C166567yu r3 = (C166567yu) this.A08.get(i2);
                if (!(r3 == null || (r3.A01 & i) == 0)) {
                    long j2 = r3.A05;
                    if (r3.A0B == null && j2 == j) {
                        return r3;
                    }
                }
                i2++;
            } while (i2 < 2);
        }
        return null;
    }

    public final void A05(C166567yu r5) {
        AtomicInteger atomicInteger;
        int i;
        int i2 = 0;
        while (!AnonymousClass71W.A00(r5, (Object) null, this.A08, i2)) {
            i2++;
            if (i2 >= 2) {
                Log.w("Profilo/TraceControl", "Could not reset Trace Context to null");
                return;
            }
        }
        do {
            atomicInteger = this.A06;
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, (1 << i2) ^ i));
    }

    public final C166567yu A01(long j) {
        if (this.A06.get() != 0) {
            int i = 0;
            do {
                C166567yu r3 = (C166567yu) this.A08.get(i);
                if (r3 != null && r3.A06 == j) {
                    return r3;
                }
                i++;
            } while (i < 2);
        }
        return null;
    }

    public final void A02() {
        C147617Ez r2;
        HandlerThread handlerThread;
        if (this.A00 == null) {
            AnonymousClass843 r3 = this.A02;
            synchronized (C147617Ez.class) {
                r2 = C147617Ez.A01;
                if (r2 == null) {
                    r2 = new C147617Ez();
                    C147617Ez.A01 = r2;
                }
            }
            synchronized (r2) {
                if (r2.A00 == null) {
                    HandlerThread handlerThread2 = new HandlerThread("Prflo:TraceCtl");
                    r2.A00 = handlerThread2;
                    handlerThread2.start();
                }
                handlerThread = r2.A00;
            }
            this.A00 = new C124796Dx(handlerThread.getLooper(), r3, this.A03);
        }
    }

    public C158957kr(SparseArray sparseArray, C147627Fa r4, AnonymousClass843 r5, C185308tQ r6, MmapBufferManager mmapBufferManager, File file) {
        this.A01 = sparseArray;
        this.A07 = new AtomicReference(r4);
        this.A04 = mmapBufferManager;
        this.A05 = file;
        this.A03 = r6;
        this.A02 = r5;
    }

    public final void A03(int i, int i2, long j, int i3) {
        C166567yu A002 = A00(i, j);
        if (A002 != null) {
            A05(A002);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("STOP PROFILO_TRACEID: ");
            long j2 = A002.A06;
            AnonymousClass000.A1F(C154637dV.A00(j2), "Profilo/TraceControl", A0o);
            synchronized (this) {
                A02();
                if (i2 != 0) {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 61, 0, 0, 0, 0, j2);
                    this.A00.A02(A002);
                } else {
                    BufferLogger.writeStandardEntry(A002.A09, 6, 37, 0, 0, 0, 0, j2);
                    this.A00.A01(new C166567yu(A002, i3));
                }
            }
        }
    }

    public void A04(long j, int i) {
        C166567yu A012 = A01(j);
        if (A012 != null && A012.A06 == j) {
            A05(A012);
            synchronized (this) {
                A02();
                this.A00.A01(new C166567yu(A012, i));
            }
        }
    }
}
