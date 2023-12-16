package X;

import android.graphics.Bitmap;
import android.os.Process;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.6q2  reason: invalid class name and case insensitive filesystem */
public class C138266q2 extends C173778Rq {
    public final /* synthetic */ C153117ah A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138266q2(C153117ah r3, String str) {
        super(AnonymousClass000.A0V("PhotosNetwork-", str, AnonymousClass001.A0o()));
        this.A00 = r3;
    }

    public void run() {
        AnonymousClass7PR r5;
        Bitmap bitmap;
        Process.setThreadPriority(10);
        do {
            try {
                C153117ah r6 = this.A00;
                Stack stack = r6.A0B;
                synchronized (stack) {
                    try {
                        if (stack.size() == 0) {
                            stack.wait();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                        throw th;
                    }
                }
                if (stack.size() != 0) {
                    Object obj = r6.A05;
                    synchronized (obj) {
                        try {
                            if (stack.size() != 0) {
                                r5 = (AnonymousClass7PR) stack.pop();
                            } else {
                                r5 = null;
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (r5 != null) {
                        ConcurrentMap concurrentMap = r5.A05;
                        if (concurrentMap.size() != 0 && r5.A07.compareAndSet(false, true)) {
                            Pair A002 = r6.A00(r5);
                            synchronized (obj) {
                                try {
                                    if (!AnonymousClass001.A1Z(A002.first)) {
                                        concurrentMap.clear();
                                        r6.A09.remove(r5.A03);
                                    } else {
                                        Bitmap bitmap2 = (Bitmap) A002.second;
                                        AnonymousClass30R r2 = r6.A03;
                                        String str = r5.A03;
                                        if (bitmap2 != null) {
                                            bitmap = bitmap2;
                                        } else {
                                            bitmap = AnonymousClass30R.A07;
                                        }
                                        r2.A03(bitmap, str);
                                        r6.A09.remove(str);
                                        if (concurrentMap.size() != 0) {
                                            ArrayList A0v = C18300x5.A0v(concurrentMap);
                                            concurrentMap.clear();
                                            C172708Mj r22 = new C172708Mj(bitmap2, A0v, r6, 31);
                                            StringBuilder A0o = AnonymousClass001.A0o();
                                            A0o.append("bitmaploader/load-success from network ");
                                            C18260x0.A1J(A0o, r5.A04);
                                            r6.A02.A0S(r22);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        } while (!Thread.interrupted());
    }
}
