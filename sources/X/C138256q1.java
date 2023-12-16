package X;

import android.graphics.Bitmap;
import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.6q1  reason: invalid class name and case insensitive filesystem */
public class C138256q1 extends C173778Rq {
    public final /* synthetic */ C153117ah A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138256q1(C153117ah r3, String str) {
        super(AnonymousClass000.A0V("PhotosDisk-", str, AnonymousClass001.A0o()));
        this.A00 = r3;
    }

    public void run() {
        AnonymousClass7PR r5;
        Process.setThreadPriority(10);
        do {
            try {
                C153117ah r4 = this.A00;
                Stack stack = r4.A0A;
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
                    Object obj = r4.A05;
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
                        if (concurrentMap.size() != 0) {
                            String str = r5.A03;
                            String A04 = C627236i.A04(str);
                            C626936e.A06(A04);
                            AnonymousClass30R r7 = r4.A03;
                            Bitmap A01 = r7.A01(A04, r5.A01, r5.A00, r5.A06);
                            if (A01 == null) {
                                synchronized (obj) {
                                    try {
                                        Iterator A0v = AnonymousClass001.A0v(concurrentMap);
                                        while (A0v.hasNext()) {
                                            C186038ue r1 = (C186038ue) A0v.next();
                                            if (r1.B31()) {
                                                if (r1.getId().equals(str)) {
                                                    concurrentMap.remove(r1);
                                                }
                                                r4.A02.A0S(new C172708Mj((Object) null, Collections.singletonList(r1), r4, 31));
                                            }
                                        }
                                        if (!r5.A07.get() && concurrentMap.size() != 0) {
                                            Stack stack2 = r4.A0B;
                                            stack2.remove(r5);
                                            stack2.push(r5);
                                            C633138t r2 = C633138t.A0C;
                                            C162457s7.A0J(r2, 1);
                                            r5.A02 = new C56852sf(r2, 0);
                                            synchronized (stack2) {
                                                stack2.notify();
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } else {
                                r7.A03(A01, str);
                                synchronized (obj) {
                                    try {
                                        r4.A09.remove(str);
                                        if (concurrentMap.size() != 0) {
                                            ArrayList A0v2 = C18300x5.A0v(concurrentMap);
                                            concurrentMap.clear();
                                            C172708Mj r22 = new C172708Mj(A01, A0v2, r4, 31);
                                            StringBuilder A0o = AnonymousClass001.A0o();
                                            A0o.append("bitmaploader/load-success from disk ");
                                            C18260x0.A1J(A0o, r5.A04);
                                            r4.A02.A0S(r22);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw th;
                                    }
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
