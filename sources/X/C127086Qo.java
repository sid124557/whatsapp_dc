package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* renamed from: X.6Qo  reason: invalid class name and case insensitive filesystem */
public final class C127086Qo extends C159087l6 implements C184938sn {
    public C124416Ce A00;
    public C186128un A01 = null;
    public Integer A02 = null;
    public Set A03 = AnonymousClass002.A0K();
    public final int A04;
    public final Context A05;
    public final Looper A06;
    public final AnonymousClass6Q8 A07;
    public final AnonymousClass6QU A08;
    public final AnonymousClass7BM A09 = new AnonymousClass7BM();
    public final AnonymousClass6VT A0A;
    public final C156237gH A0B;
    public final AnonymousClass7P4 A0C;
    public final C180918lq A0D;
    public final C162977t4 A0E;
    public final ArrayList A0F;
    public final Map A0G;
    public final Map A0H;
    public final Queue A0I = AnonymousClass0x9.A18();
    public final Lock A0J;
    public volatile boolean A0K;

    public C127086Qo(Context context, Looper looper, AnonymousClass6Q8 r10, AnonymousClass6QU r11, AnonymousClass7P4 r12, ArrayList arrayList, List list, List list2, Map map, Map map2, Lock lock) {
        C1695489s r1 = new C1695489s(this);
        this.A0D = r1;
        this.A05 = context;
        this.A0J = lock;
        this.A0E = new C162977t4(looper, r1);
        this.A06 = looper;
        this.A0A = new AnonymousClass6VT(looper, this);
        this.A07 = r10;
        this.A04 = -1;
        this.A0H = map;
        this.A0G = map2;
        this.A0F = arrayList;
        this.A0B = new C156237gH();
        for (Object next : list) {
            C162977t4 r5 = this.A0E;
            C162177rO.A02(next);
            synchronized (r5.A03) {
                ArrayList arrayList2 = r5.A05;
                if (arrayList2.contains(next)) {
                    String valueOf = String.valueOf(next);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("registerConnectionCallbacks(): listener ");
                    A0o.append(valueOf);
                    A0o.append(" is already registered");
                    AnonymousClass6C7.A1A(A0o, "GmsClientEvents");
                } else {
                    arrayList2.add(next);
                }
            }
            if (r5.A02.isConnected()) {
                AnonymousClass6C7.A10(r5.A01, next, 1);
            }
        }
        for (Object next2 : list2) {
            C162977t4 r0 = this.A0E;
            C162177rO.A02(next2);
            synchronized (r0.A03) {
                ArrayList arrayList3 = r0.A06;
                if (arrayList3.contains(next2)) {
                    String valueOf2 = String.valueOf(next2);
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("registerConnectionFailedListener(): listener ");
                    A0o2.append(valueOf2);
                    A0o2.append(" is already registered");
                    AnonymousClass6C7.A1A(A0o2, "GmsClientEvents");
                } else {
                    arrayList3.add(next2);
                }
            }
        }
        this.A0C = r12;
        this.A08 = r11;
    }

    public final void Bsw(int i, boolean z) {
        AtomicInteger atomicInteger;
        if (i == 1) {
            if (!this.A0K) {
                this.A0K = true;
                if (this.A00 == null) {
                    try {
                        this.A00 = this.A07.A06(this.A05.getApplicationContext(), new AnonymousClass6RB(this));
                    } catch (SecurityException unused) {
                    }
                }
                AnonymousClass6VT r3 = this.A0A;
                r3.sendMessageDelayed(r3.obtainMessage(1), 120000);
                r3.sendMessageDelayed(r3.obtainMessage(2), 5000);
            }
            i = 1;
        }
        for (BasePendingResult A072 : (BasePendingResult[]) this.A0B.A01.toArray(new BasePendingResult[0])) {
            A072.A07(C156237gH.A02);
        }
        C162977t4 r6 = this.A0E;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            handler.removeMessages(1);
            synchronized (r6.A03) {
                r6.A00 = true;
                ArrayList arrayList = r6.A05;
                ArrayList A0J2 = AnonymousClass002.A0J(arrayList);
                atomicInteger = r6.A07;
                int i2 = atomicInteger.get();
                Iterator it = A0J2.iterator();
                while (it.hasNext()) {
                    C187778xn r1 = (C187778xn) it.next();
                    if (!r6.A08 || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(r1)) {
                        r1.onConnectionSuspended(i);
                    }
                }
                r6.A04.clear();
                r6.A00 = false;
            }
            r6.A08 = false;
            atomicInteger.incrementAndGet();
            if (i == 2) {
                A07();
                return;
            }
            return;
        }
        throw AnonymousClass001.A0e("onUnintentionalDisconnection must only be called on the Handler thread");
    }

    public static /* bridge */ /* synthetic */ void A00(C127086Qo r2) {
        Lock lock = r2.A0J;
        lock.lock();
        try {
            if (r2.A0K) {
                r2.A07();
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.8un] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.89h] */
    /* JADX WARNING: type inference failed for: r15v3, types: [X.89g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0213 A[Catch:{ all -> 0x021f, all -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A[Catch:{ all -> 0x021f, all -> 0x022c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r30 = this;
            r14 = r30
            java.util.concurrent.locks.Lock r0 = r14.A0J
            r29 = r0
            r29.lock()
            int r0 = r14.A04     // Catch:{ all -> 0x022c }
            r4 = 2
            r5 = 0
            r1 = 1
            if (r0 < 0) goto L_0x001c
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x022c }
            boolean r2 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "Sign-in mode should have been set explicitly by auto-manage."
            X.C162177rO.A04(r0, r2)     // Catch:{ all -> 0x022c }
            goto L_0x0055
        L_0x001c:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x022c }
            if (r0 != 0) goto L_0x0042
            java.util.Map r0 = r14.A0G     // Catch:{ all -> 0x022c }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x022c }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x022c }
            r2 = 0
        L_0x002b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x022c }
            X.8xe r0 = (X.C187688xe) r0     // Catch:{ all -> 0x022c }
            boolean r0 = r0.Bjs()     // Catch:{ all -> 0x022c }
            r2 = r2 | r0
            goto L_0x002b
        L_0x003d:
            r0 = 3
            if (r2 == 0) goto L_0x004f
            r0 = 1
            goto L_0x004f
        L_0x0042:
            int r0 = r0.intValue()     // Catch:{ all -> 0x022c }
            if (r0 != r4) goto L_0x0055
            java.lang.String r0 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x022c }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x022c }
        L_0x004f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x022c }
            r14.A02 = r0     // Catch:{ all -> 0x022c }
        L_0x0055:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x022c }
            X.C162177rO.A02(r0)     // Catch:{ all -> 0x022c }
            int r2 = r0.intValue()     // Catch:{ all -> 0x022c }
            r29.lock()     // Catch:{ all -> 0x022c }
            r0 = 3
            if (r2 == r0) goto L_0x006a
            if (r2 == r1) goto L_0x006a
            if (r2 == r4) goto L_0x006b
            r4 = r2
            goto L_0x006c
        L_0x006a:
            r4 = r2
        L_0x006b:
            r5 = 1
        L_0x006c:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "Illegal sign-in mode: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r2, r4)     // Catch:{ all -> 0x021f }
            if (r5 == 0) goto L_0x0213
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x021f }
            if (r0 != 0) goto L_0x00a5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x021f }
            r14.A02 = r0     // Catch:{ all -> 0x021f }
        L_0x0082:
            X.8un r0 = r14.A01     // Catch:{ all -> 0x021f }
            if (r0 != 0) goto L_0x01dc
            java.util.Map r5 = r14.A0G     // Catch:{ all -> 0x021f }
            java.util.Iterator r6 = X.AnonymousClass001.A0v(r5)     // Catch:{ all -> 0x021f }
            r4 = 0
            r3 = 0
        L_0x008e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x021f }
            X.8xe r2 = (X.C187688xe) r2     // Catch:{ all -> 0x021f }
            boolean r0 = r2.Bjs()     // Catch:{ all -> 0x021f }
            r4 = r4 | r0
            boolean r0 = r2.Bhi()     // Catch:{ all -> 0x021f }
            r3 = r3 | r0
            goto L_0x008e
        L_0x00a5:
            int r3 = r0.intValue()     // Catch:{ all -> 0x021f }
            if (r3 == r4) goto L_0x0082
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "Cannot use sign-in mode: "
            r2.append(r0)     // Catch:{ all -> 0x021f }
            goto L_0x01e0
        L_0x00b6:
            java.lang.Integer r0 = r14.A02     // Catch:{ all -> 0x021f }
            int r2 = r0.intValue()     // Catch:{ all -> 0x021f }
            if (r2 == r1) goto L_0x0187
            r0 = 2
            if (r2 != r0) goto L_0x0193
            if (r4 == 0) goto L_0x0193
            android.content.Context r0 = r14.A05     // Catch:{ all -> 0x021f }
            r16 = r0
            android.os.Looper r15 = r14.A06     // Catch:{ all -> 0x021f }
            X.6Q8 r13 = r14.A07     // Catch:{ all -> 0x021f }
            X.7P4 r12 = r14.A0C     // Catch:{ all -> 0x021f }
            java.util.Map r2 = r14.A0H     // Catch:{ all -> 0x021f }
            X.6QU r11 = r14.A08     // Catch:{ all -> 0x021f }
            java.util.ArrayList r10 = r14.A0F     // Catch:{ all -> 0x021f }
            X.05C r9 = new X.05C     // Catch:{ all -> 0x021f }
            r9.<init>()     // Catch:{ all -> 0x021f }
            X.05C r8 = new X.05C     // Catch:{ all -> 0x021f }
            r8.<init>()     // Catch:{ all -> 0x021f }
            java.util.Iterator r6 = X.AnonymousClass000.A0q(r5)     // Catch:{ all -> 0x021f }
            r20 = 0
        L_0x00e3:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x010d
            java.util.Map$Entry r5 = X.AnonymousClass001.A0w(r6)     // Catch:{ all -> 0x021f }
            java.lang.Object r4 = r5.getValue()     // Catch:{ all -> 0x021f }
            X.8xe r4 = (X.C187688xe) r4     // Catch:{ all -> 0x021f }
            boolean r0 = r4.Bhi()     // Catch:{ all -> 0x021f }
            if (r1 != r0) goto L_0x00fb
            r20 = r4
        L_0x00fb:
            boolean r3 = r4.Bjs()     // Catch:{ all -> 0x021f }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x021f }
            if (r3 == 0) goto L_0x0109
            r9.put(r0, r4)     // Catch:{ all -> 0x021f }
            goto L_0x00e3
        L_0x0109:
            r8.put(r0, r4)     // Catch:{ all -> 0x021f }
            goto L_0x00e3
        L_0x010d:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x021f }
            r1 = r0 ^ 1
            java.lang.String r0 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            X.C162177rO.A04(r0, r1)     // Catch:{ all -> 0x021f }
            X.05C r7 = new X.05C     // Catch:{ all -> 0x021f }
            r7.<init>()     // Catch:{ all -> 0x021f }
            X.05C r6 = new X.05C     // Catch:{ all -> 0x021f }
            r6.<init>()     // Catch:{ all -> 0x021f }
            java.util.Iterator r4 = X.C18280x3.A0i(r2)     // Catch:{ all -> 0x021f }
        L_0x0126:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x0150
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x021f }
            X.7Jm r1 = (X.C148727Jm) r1     // Catch:{ all -> 0x021f }
            X.72H r3 = r1.A01     // Catch:{ all -> 0x021f }
            boolean r0 = r9.containsKey(r3)     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x0142
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x021f }
            r7.put(r1, r0)     // Catch:{ all -> 0x021f }
            goto L_0x0126
        L_0x0142:
            boolean r0 = r8.containsKey(r3)     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x0218
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x021f }
            r6.put(r1, r0)     // Catch:{ all -> 0x021f }
            goto L_0x0126
        L_0x0150:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x021f }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x021f }
            int r3 = r10.size()     // Catch:{ all -> 0x021f }
            r2 = 0
        L_0x015d:
            if (r2 >= r3) goto L_0x01be
            java.lang.Object r1 = r10.get(r2)     // Catch:{ all -> 0x021f }
            X.899 r1 = (X.AnonymousClass899) r1     // Catch:{ all -> 0x021f }
            X.7Jm r0 = r1.A01     // Catch:{ all -> 0x021f }
            boolean r0 = r7.containsKey(r0)     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x0171
            r5.add(r1)     // Catch:{ all -> 0x021f }
            goto L_0x017c
        L_0x0171:
            X.7Jm r0 = r1.A01     // Catch:{ all -> 0x021f }
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x017f
            r4.add(r1)     // Catch:{ all -> 0x021f }
        L_0x017c:
            int r2 = r2 + 1
            goto L_0x015d
        L_0x017f:
            java.lang.String r0 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x021f }
            goto L_0x021e
        L_0x0187:
            if (r4 == 0) goto L_0x01b7
            if (r3 == 0) goto L_0x0193
            java.lang.String r0 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x021f }
            goto L_0x021e
        L_0x0193:
            android.content.Context r8 = r14.A05     // Catch:{ all -> 0x021f }
            android.os.Looper r7 = r14.A06     // Catch:{ all -> 0x021f }
            X.6Q8 r6 = r14.A07     // Catch:{ all -> 0x021f }
            X.7P4 r4 = r14.A0C     // Catch:{ all -> 0x021f }
            java.util.Map r2 = r14.A0H     // Catch:{ all -> 0x021f }
            X.6QU r1 = r14.A08     // Catch:{ all -> 0x021f }
            java.util.ArrayList r0 = r14.A0F     // Catch:{ all -> 0x021f }
            X.89h r3 = new X.89h     // Catch:{ all -> 0x021f }
            r9 = r3
            r10 = r8
            r11 = r7
            r12 = r6
            r13 = r1
            r15 = r14
            r16 = r4
            r17 = r0
            r18 = r5
            r19 = r2
            r20 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x021f }
            goto L_0x01da
        L_0x01b7:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x021f }
            goto L_0x021e
        L_0x01be:
            X.89g r3 = new X.89g     // Catch:{ all -> 0x021f }
            r24 = r4
            r25 = r9
            r26 = r8
            r27 = r7
            r28 = r6
            r21 = r14
            r22 = r12
            r23 = r5
            r17 = r15
            r18 = r13
            r19 = r11
            r15 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x021f }
        L_0x01da:
            r14.A01 = r3     // Catch:{ all -> 0x021f }
        L_0x01dc:
            r14.A07()     // Catch:{ all -> 0x021f }
            goto L_0x0225
        L_0x01e0:
            if (r4 == r1) goto L_0x01ee
            r0 = 2
            if (r4 == r0) goto L_0x01eb
            r0 = 3
            if (r4 == r0) goto L_0x01f1
            java.lang.String r0 = "UNKNOWN"
            goto L_0x01f3
        L_0x01eb:
            java.lang.String r0 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x01f3
        L_0x01ee:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x01f3
        L_0x01f1:
            java.lang.String r0 = "SIGN_IN_MODE_NONE"
        L_0x01f3:
            r2.append(r0)     // Catch:{ all -> 0x021f }
            java.lang.String r0 = ". Mode was already set to "
            r2.append(r0)     // Catch:{ all -> 0x021f }
            if (r3 == r1) goto L_0x0209
            r0 = 2
            if (r3 == r0) goto L_0x0206
            r0 = 3
            if (r3 == r0) goto L_0x020c
            java.lang.String r0 = "UNKNOWN"
            goto L_0x020e
        L_0x0206:
            java.lang.String r0 = "SIGN_IN_MODE_OPTIONAL"
            goto L_0x020e
        L_0x0209:
            java.lang.String r0 = "SIGN_IN_MODE_REQUIRED"
            goto L_0x020e
        L_0x020c:
            java.lang.String r0 = "SIGN_IN_MODE_NONE"
        L_0x020e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r2)     // Catch:{ all -> 0x021f }
            goto L_0x021e
        L_0x0213:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0U(r0)     // Catch:{ all -> 0x021f }
            goto L_0x021e
        L_0x0218:
            java.lang.String r0 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x021f }
        L_0x021e:
            throw r0     // Catch:{ all -> 0x021f }
        L_0x021f:
            r0 = move-exception
            r29.unlock()     // Catch:{ all -> 0x022c }
            goto L_0x004e
        L_0x0225:
            r29.unlock()     // Catch:{ all -> 0x022c }
            r29.unlock()
            return
        L_0x022c:
            r0 = move-exception
            r29.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127086Qo.A05():void");
    }

    public final String A06() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append("").append("mContext=").println(this.A05);
        printWriter.append("").append("mResuming=").print(this.A0K);
        printWriter.append(" mWorkQueue.size()=").print(this.A0I.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.A0B.A01.size());
        C186128un r0 = this.A01;
        if (r0 != null) {
            r0.Bt9("", (FileDescriptor) null, printWriter, (String[]) null);
        }
        return stringWriter.toString();
    }

    public final void A07() {
        this.A0E.A08 = true;
        C186128un r0 = this.A01;
        C162177rO.A02(r0);
        r0.Bt7();
    }

    public final boolean A08() {
        boolean z = false;
        if (this.A0K) {
            this.A0K = false;
            AnonymousClass6VT r1 = this.A0A;
            r1.removeMessages(2);
            z = true;
            r1.removeMessages(1);
            C124416Ce r0 = this.A00;
            if (r0 != null) {
                r0.A00();
                this.A00 = null;
            }
        }
        return z;
    }

    public final void Bsr(C127866Tp r9) {
        AtomicInteger atomicInteger;
        Context context = this.A05;
        int i = r9.A01;
        if (i != 18 && (i != 1 || !C162117rH.A05(context))) {
            A08();
        }
        if (!this.A0K) {
            C162977t4 r7 = this.A0E;
            Handler handler = r7.A01;
            if (Looper.myLooper() == handler.getLooper()) {
                handler.removeMessages(1);
                synchronized (r7.A03) {
                    ArrayList arrayList = r7.A06;
                    ArrayList A0J2 = AnonymousClass002.A0J(arrayList);
                    atomicInteger = r7.A07;
                    int i2 = atomicInteger.get();
                    Iterator it = A0J2.iterator();
                    while (it.hasNext()) {
                        C187788xo r1 = (C187788xo) it.next();
                        if (!r7.A08 || atomicInteger.get() != i2) {
                            break;
                        } else if (arrayList.contains(r1)) {
                            r1.onConnectionFailed(r9);
                        }
                    }
                }
                r7.A08 = false;
                atomicInteger.incrementAndGet();
                return;
            }
            throw AnonymousClass001.A0e("onConnectionFailure must only be called on the Handler thread");
        }
    }

    public final void Bst(Bundle bundle) {
        IllegalStateException illegalStateException;
        while (true) {
            Queue queue = this.A0I;
            if (queue.isEmpty()) {
                break;
            }
            A01((C127186Qz) queue.remove());
        }
        C162977t4 r6 = this.A0E;
        Handler handler = r6.A01;
        if (Looper.myLooper() == handler.getLooper()) {
            synchronized (r6.A03) {
                if (!r6.A00) {
                    handler.removeMessages(1);
                    r6.A00 = true;
                    ArrayList arrayList = r6.A04;
                    if (arrayList.isEmpty()) {
                        ArrayList A0J2 = AnonymousClass002.A0J(r6.A05);
                        AtomicInteger atomicInteger = r6.A07;
                        int i = atomicInteger.get();
                        Iterator it = A0J2.iterator();
                        while (it.hasNext()) {
                            C187778xn r1 = (C187778xn) it.next();
                            if (!r6.A08 || !r6.A02.isConnected() || atomicInteger.get() != i) {
                                break;
                            } else if (!arrayList.contains(r1)) {
                                r1.onConnected(bundle);
                            }
                        }
                        arrayList.clear();
                        r6.A00 = false;
                    } else {
                        illegalStateException = AnonymousClass6CA.A0O();
                    }
                } else {
                    illegalStateException = AnonymousClass6CA.A0O();
                }
                throw illegalStateException;
            }
            return;
        }
        throw AnonymousClass001.A0e("onConnectionSuccess must only be called on the Handler thread");
    }
}
