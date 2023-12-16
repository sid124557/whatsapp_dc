package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6E1  reason: invalid class name */
public final class AnonymousClass6E1 extends Handler implements Runnable {
    public int A00;
    public C184918sl A01;
    public IOException A02;
    public Thread A03;
    public boolean A04;
    public final long A05;
    public final C183898qq A06;
    public volatile boolean A07;
    public final /* synthetic */ C157447iJ A08;

    public void run() {
        boolean A1T;
        try {
            synchronized (this) {
                try {
                    A1T = AnonymousClass000.A1T(this.A04 ? 1 : 0);
                    this.A03 = Thread.currentThread();
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                        break;
                    }
                }
            }
            if (A1T) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("load:");
                C183898qq r1 = this.A06;
                AnonymousClass000.A1A(r1, A0o);
                Trace.beginSection(A0o.toString());
                try {
                    r1.BJl();
                    Trace.endSection();
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                try {
                    this.A03 = null;
                    Thread.interrupted();
                } catch (Throwable th3) {
                    while (true) {
                        th = th3;
                        break;
                    }
                }
            }
            if (!this.A07) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.A07) {
                C18290x4.A1C(this, e, 2);
            }
        } catch (Exception e2) {
            C159307lc.A02("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.A07) {
                C18290x4.A1C(this, new C140486to(e2), 2);
            }
        } catch (OutOfMemoryError e3) {
            C159307lc.A02("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.A07) {
                C18290x4.A1C(this, new C140486to(e3), 2);
            }
        } catch (Error e4) {
            C159307lc.A02("LoadTask", "Unexpected error loading stream", e4);
            if (!this.A07) {
                C18290x4.A1C(this, e4, 3);
            }
            throw e4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6E1(Looper looper, C184918sl r2, C183898qq r3, C157447iJ r4, long j) {
        super(looper);
        this.A08 = r4;
        this.A06 = r3;
        this.A01 = r2;
        this.A05 = j;
    }

    public void A00(boolean z) {
        this.A07 = z;
        this.A02 = null;
        if (hasMessages(0)) {
            this.A04 = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            synchronized (this) {
                this.A04 = true;
                this.A06.Ayc();
                Thread thread = this.A03;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            if (!z) {
                return;
            }
        }
        this.A08.A00 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C184918sl r3 = this.A01;
        r3.getClass();
        r3.BVH(this.A06, elapsedRealtime, elapsedRealtime - this.A05, true);
        this.A01 = null;
    }

    public void handleMessage(Message message) {
        if (!this.A07) {
            Message message2 = message;
            int i = message2.what;
            if (i == 0) {
                this.A02 = null;
                C157447iJ r0 = this.A08;
                ExecutorService executorService = r0.A02;
                AnonymousClass6E1 r02 = r0.A00;
                r02.getClass();
                executorService.execute(r02);
            } else if (i != 3) {
                C157447iJ r3 = this.A08;
                r3.A00 = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.A05;
                C184918sl r8 = this.A01;
                r8.getClass();
                if (this.A04) {
                    r8.BVH(this.A06, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message2.what;
                if (i2 == 1) {
                    try {
                        r8.BVL(this.A06, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        C159307lc.A02("LoadTask", "Unexpected exception handling load completed", e);
                        r3.A01 = new C140486to(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message2.obj;
                    this.A02 = iOException;
                    int i3 = this.A00 + 1;
                    this.A00 = i3;
                    AnonymousClass7GE BVT = r8.BVT(this.A06, iOException, i3, elapsedRealtime, j);
                    int i4 = BVT.A00;
                    if (i4 == 3) {
                        r3.A01 = this.A02;
                    } else if (i4 != 2) {
                        if (i4 == 1) {
                            this.A00 = 1;
                        }
                        long j2 = BVT.A01;
                        if (j2 == -9223372036854775807L) {
                            j2 = (long) Math.min((this.A00 - 1) * 1000, 5000);
                        }
                        C161487pm.A04(AnonymousClass000.A1X(r3.A00));
                        r3.A00 = this;
                        if (j2 > 0) {
                            sendEmptyMessageDelayed(0, j2);
                            return;
                        }
                        this.A02 = null;
                        r3.A02.execute(this);
                    }
                }
            } else {
                throw ((Throwable) message2.obj);
            }
        }
    }
}
