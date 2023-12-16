package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.89g  reason: invalid class name and case insensitive filesystem */
public final class C1694289g implements C186128un {
    public int A00 = 0;
    public Bundle A01;
    public C127866Tp A02 = null;
    public C127866Tp A03 = null;
    public boolean A04 = false;
    public final Context A05;
    public final Looper A06;
    public final C187688xe A07;
    public final C127086Qo A08;
    public final C1694389h A09;
    public final C1694389h A0A;
    public final Map A0B;
    public final Set A0C = Collections.newSetFromMap(new WeakHashMap());
    public final Lock A0D;

    public final void Bt7() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A09.Bt7();
        this.A0A.Bt7();
    }

    public final void Bt8() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A09.Bt8();
        this.A0A.Bt8();
        A01();
    }

    public C1694289g(Context context, Looper looper, C158267jh r29, AnonymousClass6QU r30, C187688xe r31, C127086Qo r32, AnonymousClass7P4 r33, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Map map3, Map map4, Lock lock) {
        Context context2 = context;
        this.A05 = context2;
        C127086Qo r9 = r32;
        this.A08 = r9;
        Lock lock2 = lock;
        this.A0D = lock2;
        Looper looper2 = looper;
        this.A06 = looper2;
        this.A07 = r31;
        C158267jh r7 = r29;
        Map map5 = map2;
        this.A09 = new C1694389h(context2, looper2, r7, (AnonymousClass6QU) null, r9, new C1694089e(this), (AnonymousClass7P4) null, arrayList2, map5, map4, lock2);
        Map map6 = map;
        this.A0A = new C1694389h(context2, looper2, r7, r30, r9, new C1694189f(this), r33, arrayList, map6, map3, lock2);
        AnonymousClass05C r4 = new AnonymousClass05C();
        Iterator A0i = C18280x3.A0i(map5);
        while (A0i.hasNext()) {
            r4.put(A0i.next(), this.A09);
        }
        Iterator A0i2 = C18280x3.A0i(map6);
        while (A0i2.hasNext()) {
            r4.put(A0i2.next(), this.A0A);
        }
        this.A0B = Collections.unmodifiableMap(r4);
    }

    public static /* bridge */ /* synthetic */ void A00(C1694289g r4) {
        C127866Tp r2 = r4.A02;
        if (r2 != null) {
            int i = r2.A01;
            C127866Tp r3 = r4.A03;
            if (i == 0) {
                if (r3 != null) {
                    int i2 = r3.A01;
                    if (AnonymousClass000.A1T(i2) || i2 == 4) {
                        int i3 = r4.A00;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                                r4.A00 = 0;
                            }
                            C127086Qo r1 = r4.A08;
                            C162177rO.A02(r1);
                            r1.Bst(r4.A01);
                        }
                        r4.A01();
                        r4.A00 = 0;
                    } else if (r4.A00 == 1) {
                        r4.A01();
                    } else {
                        r4.A02(r3);
                        r4.A09.Bt8();
                    }
                }
            } else if (r3 != null) {
                int i4 = r3.A01;
                C1694389h r0 = r4.A0A;
                if (i4 == 0) {
                    r0.Bt8();
                    r2 = r4.A02;
                    C162177rO.A02(r2);
                } else if (r0.A00 < r4.A09.A00) {
                    r2 = r3;
                }
                r4.A02(r2);
            }
        }
    }

    public final void A01() {
        Set<C178378hR> set = this.A0C;
        for (C178378hR r0 : set) {
            ((AnonymousClass6H7) r0).A01.release();
        }
        set.clear();
    }

    public final void A02(C127866Tp r4) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A08.Bsr(r4);
        }
        A01();
        this.A00 = 0;
    }

    public final C127186Qz Bsz(C127186Qz r10) {
        PendingIntent activity;
        Object obj = this.A0B.get(r10.A00);
        C162177rO.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C1694389h r2 = this.A0A;
        if (obj.equals(r2)) {
            C127866Tp r0 = this.A03;
            if (r0 != null && r0.A01 == 4) {
                C187688xe r1 = this.A07;
                if (r1 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), r1.BD3(), C1456476s.A00 | 134217728);
                }
                r10.A09(new Status(activity, (C127866Tp) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r2 = this.A09;
        }
        r2.Bsz(r10);
        return r10;
    }

    public final C127186Qz Bt2(C127186Qz r10) {
        PendingIntent activity;
        Object obj = this.A0B.get(r10.A00);
        C162177rO.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C1694389h r2 = this.A0A;
        if (obj.equals(r2)) {
            C127866Tp r0 = this.A03;
            if (r0 != null && r0.A01 == 4) {
                C187688xe r1 = this.A07;
                if (r1 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A08), r1.BD3(), C1456476s.A00 | 134217728);
                }
                r10.A09(new Status(activity, (C127866Tp) null, (String) null, 1, 4));
                return r10;
            }
        } else {
            r2 = this.A09;
        }
        return r2.Bt2(r10);
    }

    public final void Bt9(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append("").append("authClient").println(":");
        this.A0A.Bt9(String.valueOf("").concat("  "), (FileDescriptor) null, printWriter, (String[]) null);
        printWriter.append("").append("anonClient").println(":");
        this.A09.Bt9(String.valueOf("").concat("  "), (FileDescriptor) null, printWriter, (String[]) null);
    }

    public final void BtA() {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            boolean A1U = AnonymousClass000.A1U(this.A00, 2);
            lock.unlock();
            this.A0A.Bt8();
            this.A03 = new C127866Tp(4);
            if (A1U) {
                C172668Mf.A00(new C124806Dy(this.A06), this, 29);
            } else {
                A01();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5.A00 == 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BtB() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r4 = r5.A0D
            r4.lock()
            X.89h r0 = r5.A09     // Catch:{ all -> 0x002a }
            X.8um r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C1693789b     // Catch:{ all -> 0x002a }
            r3 = 0
            if (r0 == 0) goto L_0x0026
            X.89h r0 = r5.A0A     // Catch:{ all -> 0x002a }
            X.8um r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.C1693789b     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r0 != 0) goto L_0x0025
            X.6Tp r0 = r5.A03     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0021
            int r1 = r0.A01     // Catch:{ all -> 0x002a }
            r0 = 4
            if (r1 != r0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r0 = r5.A00     // Catch:{ all -> 0x002a }
            if (r0 != r2) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r4.unlock()
            return r3
        L_0x002a:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1694289g.BtB():boolean");
    }

    public final boolean BtC(C178378hR r5) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            lock.lock();
            if (AnonymousClass000.A1U(this.A00, 2) || BtB()) {
                C1694389h r2 = this.A0A;
                if (!(r2.A0E instanceof C1693789b)) {
                    this.A0C.add(r5);
                    if (this.A00 == 0) {
                        this.A00 = 1;
                    }
                    this.A03 = null;
                    r2.Bt7();
                    return true;
                }
            }
            lock.unlock();
            return false;
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }
}
