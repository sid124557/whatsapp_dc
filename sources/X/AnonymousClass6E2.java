package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6E2  reason: invalid class name */
public final class AnonymousClass6E2 extends Handler implements Runnable {
    public int A00;
    public C184758sT A01;
    public AnonymousClass7A8 A02;
    public IOException A03;
    public final int A04;
    public final long A05;
    public final C183688qS A06;
    public volatile Thread A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public final /* synthetic */ C157457iK A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6E2(Looper looper, C184758sT r2, C183688qS r3, C157457iK r4, int i, long j) {
        super(looper);
        this.A0A = r4;
        this.A06 = r3;
        this.A01 = r2;
        this.A04 = i;
        this.A05 = j;
    }

    public void A00(boolean z) {
        this.A09 = z;
        this.A03 = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.A08 = true;
            this.A06.Ayc();
            Thread thread = this.A07;
            if (thread != null) {
                thread.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.A0A.A00 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C184758sT r3 = this.A01;
        r3.getClass();
        r3.BVG(this.A06, elapsedRealtime, elapsedRealtime - this.A05, true);
        this.A01 = null;
    }

    public void handleMessage(Message message) {
        int i;
        if (!this.A09) {
            Message message2 = message;
            int i2 = message2.what;
            if (i2 == 0) {
                this.A03 = null;
                C157457iK r0 = this.A0A;
                ExecutorService executorService = r0.A02;
                AnonymousClass6E2 r02 = r0.A00;
                r02.getClass();
                executorService.execute(r02);
            } else if (i2 != 4) {
                C157457iK r3 = this.A0A;
                r3.A00 = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.A05;
                C184758sT r7 = this.A01;
                r7.getClass();
                if (this.A08 || (i = message2.what) == 1) {
                    r7.BVG(this.A06, elapsedRealtime, j, false);
                } else if (i == 2) {
                    try {
                        r7.BVK(this.A06, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        Log.e("LoadTask", "Unexpected exception handling load completed", e);
                        r3.A01 = new C140426ti(e);
                    }
                } else if (i == 3) {
                    IOException iOException = (IOException) message2.obj;
                    this.A03 = iOException;
                    int i3 = this.A00 + 1;
                    this.A00 = i3;
                    AnonymousClass7A8 BVR = r7.BVR(this.A06, iOException, i3, elapsedRealtime, j);
                    this.A02 = BVR;
                    int i4 = BVR.A00;
                    if (i4 == 3) {
                        r3.A01 = this.A03;
                    } else if (i4 != 2) {
                        if (i4 == 1) {
                            this.A00 = 1;
                        }
                        long A022 = (long) AnonymousClass6CA.A02(C18290x4.A0A(this.A00 - 1) + 500, 5000);
                        C159197lM.A02(AnonymousClass000.A1X(r3.A00));
                        r3.A00 = this;
                        if (A022 > 0) {
                            sendEmptyMessageDelayed(0, A022);
                            return;
                        }
                        this.A03 = null;
                        r3.A02.execute(this);
                    }
                }
            } else {
                throw ((Throwable) message2.obj);
            }
        }
    }

    public void run() {
        try {
            this.A07 = Thread.currentThread();
            if (!this.A08) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("load:<cls>");
                C183688qS r1 = this.A06;
                AnonymousClass000.A1A(r1, A0o);
                C153827c5.A01(AnonymousClass000.A0X("</cls>", A0o));
                r1.BJl();
                C153827c5.A00();
            }
            if (!this.A09) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.A09) {
                C18290x4.A1C(this, e, 3);
            }
        } catch (InterruptedException unused) {
            C159197lM.A02(this.A08);
            if (!this.A09) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.A09) {
                C18290x4.A1C(this, new C140426ti(e2), 3);
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.A09) {
                C18290x4.A1C(this, new C140426ti(e3), 3);
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.A09) {
                C18290x4.A1C(this, e4, 4);
            }
            throw e4;
        } catch (Throwable th) {
            C153827c5.A00();
            throw th;
        }
    }
}
