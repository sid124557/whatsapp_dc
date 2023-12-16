package X;

import android.text.TextUtils;
import com.facebook.quicklog.EventBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.9YN  reason: invalid class name */
public class AnonymousClass9YN implements C186468vN {
    public static final String[] A0G = new String[0];
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C56612sH A04;
    public final C197759dp A05;
    public final C193159Nj A06;
    public final String A07;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A0A = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue A0B = new ConcurrentLinkedQueue();
    public final AtomicBoolean A0C;
    public final AtomicInteger A0D;
    public final AtomicLong A0E;
    public volatile String A0F;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9YN(X.C56612sH r14, X.C197759dp r15, X.C193159Nj r16, java.lang.String r17, int r18, int r19, long r20, long r22) {
        /*
            r13 = this;
            r3 = 0
            r8 = 1
            r13.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r13.A09 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r13.A08 = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r13.A0A = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r13.A0B = r0
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r3)
            r13.A0C = r2
            r0 = 0
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r4.<init>(r0)
            r13.A0E = r4
            r13.A04 = r14
            r13.A05 = r15
            r0 = r16
            r13.A06 = r0
            r4 = r17
            r13.A07 = r4
            r7 = r18
            r13.A01 = r7
            r9 = r19
            r13.A00 = r9
            r0 = r20
            r13.A03 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r3)
            r13.A0D = r0
            r10 = r22
            r13.A02 = r10
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.NANOSECONDS
            if (r17 == 0) goto L_0x00a4
            X.9TW r6 = r15.A06
            r6.A01()
            java.util.concurrent.ConcurrentHashMap r0 = r6.A04
            java.lang.Object r5 = r0.get(r4)
            X.9Og r5 = (X.C193379Og) r5
            if (r5 != 0) goto L_0x0075
            r1 = 812974081(0x30750001, float:8.9130486E-10)
            r0 = -1
            X.9Og r5 = new X.9Og
            r5.<init>(r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = r6.A04
            r0.put(r4, r5)
        L_0x0075:
            int r1 = r5.A00
        L_0x0077:
            if (r1 != r8) goto L_0x009e
            X.8vZ r6 = r15.A03
        L_0x007b:
            r6.markerStartWithCancelPolicy(r7, r8, r9, r10, r12)
        L_0x007e:
            if (r17 == 0) goto L_0x0085
            java.lang.String r0 = "app_id"
            r15.markerAnnotate((int) r7, (int) r9, (java.lang.String) r0, (java.lang.String) r4)
        L_0x0085:
            X.4FX r4 = r15.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.6N2 r1 = new X.6N2
            r1.<init>(r4, r15, r0, r7)
            java.lang.String r0 = "ttrc_tracking_version"
            r1.annotate((java.lang.String) r0, (int) r8)
            java.lang.String r0 = "ttrc_back_start_on_touch_up"
            r1.annotate((java.lang.String) r0, (boolean) r3)
            r2.set(r3)
            return
        L_0x009e:
            r0 = 2
            if (r1 != r0) goto L_0x007e
            X.8vZ r6 = r15.A02
            goto L_0x007b
        L_0x00a4:
            X.9TW r0 = r15.A06
            X.9PT r0 = r0.A00(r7)
            int r1 = r0.A00
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YN.<init>(X.2sH, X.9dp, X.9Nj, java.lang.String, int, int, long, long):void");
    }

    public void A05(long j, String str) {
        String str2 = str;
        if (str != null) {
            this.A05.markerPoint(this.A01, this.A00, str2, (String) null, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS);
        }
    }

    public final void A06(String str) {
        A08(3, str);
        if (A09()) {
            A0C(C142096wd.MARKER_FAILED);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("marker_id:");
        int i = this.A01;
        A0o.append(i);
        String A0V = AnonymousClass000.A0V(",error:", str, A0o);
        StringBuilder A0l = AnonymousClass000.A0l("marker_id:");
        A0l.append(i);
        A0l.append(",instance_key:");
        A0l.append(this.A00);
        String A0V2 = AnonymousClass000.A0V(",error:", str, A0l);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("TTRCTrace|");
        String A0X = AnonymousClass000.A0X(this.A07, A0o2);
        C197759dp r2 = this.A05;
        StringBuilder A0l2 = AnonymousClass000.A0l(A0X);
        A0l2.append(" : ");
        A0l2.append(A0V);
        r2.A00.Bji(AnonymousClass000.A0V(" : ", A0V2, A0l2));
    }

    public void BKa(String str, long j) {
        String str2 = str;
        if (str != null) {
            this.A05.markerAnnotate(this.A01, this.A00, str2, j);
        }
    }

    public void BKk(String str, long j) {
        String str2 = str;
        if (str != null && !"surface_core_created_at".equals(str)) {
            this.A05.markerPoint(this.A01, this.A00, str2, (String) null, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS);
        }
    }

    public static void A00(AnonymousClass9YN r5) {
        ConcurrentLinkedQueue concurrentLinkedQueue = r5.A0A;
        String[] strArr = A0G;
        r5.A07("cache_and_network_queries", (String[]) concurrentLinkedQueue.toArray(strArr));
        r5.A07("network_only_queries", (String[]) r5.A0B.toArray(strArr));
        r5.A07("steps", (String[]) r5.A08.keySet().toArray(strArr));
    }

    public final void A02() {
        Iterator A10 = C18290x4.A10(this.A09);
        while (A10.hasNext()) {
            AnonymousClass9VL r0 = (AnonymousClass9VL) A10.next();
            if (r0 != null) {
                AtomicInteger atomicInteger = r0.A05;
                if (C192359Ji.values()[atomicInteger.get()] != C192359Ji.QUERY_SUCCESSFULLY_COMPLETED) {
                    if (C192359Ji.values()[atomicInteger.get()] != C192359Ji.QUERY_NOT_NEEDED) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        if (A0A()) {
            A01();
            A03();
        }
    }

    public final void A03() {
        String str = this.A0F;
        if (str == null) {
            this.A05.markerEnd(this.A01, this.A00, 2);
        } else {
            C197759dp r0 = this.A05;
            r0.A03.BKf(this.A01, this.A00, 2, str);
        }
        A0C(C142096wd.SUCCESSFULLY_FINISHED);
    }

    public final void A04(long j) {
        C192359Ji A002;
        AtomicBoolean atomicBoolean = this.A0C;
        if (!atomicBoolean.get() && A0A()) {
            C142096wd BDr = BDr();
            int i = 0;
            C142096wd[] r3 = {C142096wd.ZERO_QUERIES_AND_ZERO_STEPS, C142096wd.PROCESSING_QUERIES_AND_STEPS};
            while (BDr != r3[i]) {
                i++;
                if (i >= 2) {
                    return;
                }
            }
            if (!atomicBoolean.getAndSet(true)) {
                Iterator A10 = C18290x4.A10(this.A09);
                while (A10.hasNext()) {
                    AnonymousClass9VL r0 = (AnonymousClass9VL) A10.next();
                    if (r0 != null && (A002 = C192359Ji.A00(r0)) != C192359Ji.QUERY_SUCCESSFULLY_COMPLETED && A002 != C192359Ji.QUERY_NOT_NEEDED && A002 != C192359Ji.CACHE_DONE_NETWORK_PENDING) {
                        return;
                    }
                }
                A05(TimeUnit.NANOSECONDS.toMillis(j), "time_to_initial_content");
            }
        }
    }

    public void A07(String str, String[] strArr) {
        if (str != null && strArr != null) {
            this.A05.markerAnnotate(this.A01, this.A00, str, strArr);
        }
    }

    public final boolean A0A() {
        Iterator A10 = C18290x4.A10(this.A08);
        while (A10.hasNext()) {
            C193169Nk r0 = (C193169Nk) A10.next();
            if (r0 != null) {
                AtomicInteger atomicInteger = r0.A00;
                if (C192309Jb.values()[atomicInteger.get()] != C192309Jb.DONE) {
                    if (C192309Jb.values()[atomicInteger.get()] != C192309Jb.REVOKED) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public void Awl(String str, TimeUnit timeUnit, long j) {
        AnonymousClass9VL r2;
        if (str != null && A0B(C142096wd.REGISTERING_QUERIES_AND_STEPS)) {
            if (j == -1) {
                r2 = new AnonymousClass9VL(this, str);
            } else {
                r2 = new AnonymousClass9VL(this, str, timeUnit.toMillis(j));
            }
            if (this.A09.putIfAbsent(str, r2) != null) {
                A06(AnonymousClass000.A0V("Attempted to Add Query Twice for: ", str, AnonymousClass001.A0o()));
            }
        }
    }

    public void Awn(String str) {
        if (str != null && A0B(C142096wd.REGISTERING_QUERIES_AND_STEPS)) {
            if (this.A08.putIfAbsent(str, new C193169Nk()) != null) {
                A06(AnonymousClass000.A0V("Attempted to Add Additional Step Twice for: ", str, AnonymousClass001.A0o()));
            }
        }
    }

    public void AyH(long j, String str, boolean z, long j2) {
        C192359Ji r2;
        if (str != null && A0B(C142096wd.PROCESSING_QUERIES_AND_STEPS)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
            AnonymousClass9VL r6 = (AnonymousClass9VL) this.A09.get(str);
            if (r6 != null) {
                if (z) {
                    r2 = C192359Ji.QUERY_SUCCESSFULLY_COMPLETED;
                } else {
                    r2 = C192359Ji.CACHE_DONE_NETWORK_PENDING;
                }
                boolean z2 = false;
                if (r6.A01(r2)) {
                    r6.A02 = true;
                    if (j > r6.A03) {
                        z2 = true;
                    }
                    r6.A00 = z2;
                    AnonymousClass9YN r5 = r6.A06;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("cache_was_recent_for_");
                    String str2 = r6.A04;
                    r5.BKc(AnonymousClass000.A0X(str2, A0o), !z2);
                    r5.BKa(AnonymousClass000.A0V("cache_age_ms_for_", str2, AnonymousClass001.A0o()), j);
                    r5.A0F = AnonymousClass000.A0V("ttcc_for_", str2, AnonymousClass001.A0o());
                    r5.A0E.set(nanos);
                    r5.A05(TimeUnit.NANOSECONDS.toMillis(nanos), r5.A0F);
                    A04(nanos);
                    if (z) {
                        r6.A00();
                        A02();
                    }
                }
            }
        }
    }

    public void B30(String str) {
        EventBuilder eventBuilder;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (A09()) {
            A0C(C142096wd.MARKER_FAILED);
            A01();
            A08(3, str);
            long nanos = TimeUnit.MILLISECONDS.toNanos(millis) - this.A02;
            C197759dp r6 = this.A05;
            String str2 = this.A07;
            if (r6.A01.BIn(78315522)) {
                eventBuilder = new AnonymousClass847(r6.A00, r6, (Integer) null, str2, 78315522);
            } else {
                eventBuilder = AnonymousClass848.A00;
            }
            EventBuilder level = eventBuilder.annotate("duration", TimeUnit.NANOSECONDS.toMillis(nanos)).setLevel(3);
            if (str != null) {
                level.annotate("message", str);
            }
            level.report();
        }
    }

    public C142096wd BDr() {
        return C142096wd.values()[this.A0D.get()];
    }

    public void BJe() {
        BJf("leftSurface");
    }

    public void BJf(String str) {
        C192359Ji A002;
        EventBuilder eventBuilder;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (A09()) {
            A01();
            ConcurrentHashMap concurrentHashMap = this.A09;
            if (!concurrentHashMap.isEmpty() || !this.A08.isEmpty()) {
                Iterator A10 = C18290x4.A10(concurrentHashMap);
                while (true) {
                    if (A10.hasNext()) {
                        AnonymousClass9VL r4 = (AnonymousClass9VL) A10.next();
                        if (r4 != null && (((A002 = C192359Ji.A00(r4)) != C192359Ji.CACHE_DONE_NETWORK_PENDING || r4.A00) && A002 != C192359Ji.QUERY_SUCCESSFULLY_COMPLETED && A002 != C192359Ji.QUERY_NOT_NEEDED)) {
                            break;
                        }
                    } else if (A0A()) {
                        Iterator A102 = C18290x4.A10(concurrentHashMap);
                        while (A102.hasNext()) {
                            AnonymousClass9VL r2 = (AnonymousClass9VL) A102.next();
                            if (r2 != null && C192359Ji.A00(r2) == C192359Ji.CACHE_DONE_NETWORK_PENDING) {
                                r2.A00();
                            }
                        }
                        A03();
                        return;
                    }
                }
            }
            A0C(C142096wd.MARKER_CANCELLED);
            A08(4, str);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanos = timeUnit.toNanos(millis) - this.A02;
            if (nanos > timeUnit.toNanos(5000)) {
                String str2 = this.A07;
                if (str2 == null) {
                    str2 = Integer.toString(this.A01);
                }
                C197759dp r5 = this.A05;
                if (r5.A01.BIn(78315521)) {
                    eventBuilder = new AnonymousClass847(r5.A00, r5, (Integer) null, str2, 78315521);
                } else {
                    eventBuilder = AnonymousClass848.A00;
                }
                eventBuilder.annotate("duration", TimeUnit.NANOSECONDS.toMillis(nanos)).setLevel(5).report();
            }
        }
    }

    public void BKb(String str, String str2) {
        if (str != null && str2 != null) {
            this.A05.markerAnnotate(this.A01, this.A00, str, str2);
        }
    }

    public void BKc(String str, boolean z) {
        if (str != null) {
            this.A05.markerAnnotate(this.A01, this.A00, str, z);
        }
    }

    public void BKj(String str) {
        if (str != null) {
            C197759dp r0 = this.A05;
            r0.A03.markerPoint(this.A01, this.A00, str);
        }
    }

    public void BLS(String str, boolean z) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (str != null && A0B(C142096wd.PROCESSING_QUERIES_AND_STEPS)) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(millis);
            AnonymousClass9VL r6 = (AnonymousClass9VL) this.A09.get(str);
            if (r6 != null && r6.A01(C192359Ji.QUERY_SUCCESSFULLY_COMPLETED)) {
                r6.A01 = true;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ttnc_for_");
                String A0X = AnonymousClass000.A0X(r6.A04, A0o);
                AnonymousClass9YN r4 = r6.A06;
                r4.A0F = A0X;
                r4.A0E.set(nanos);
                r4.A05(TimeUnit.NANOSECONDS.toMillis(nanos), A0X);
                r6.A00();
                A04(nanos);
                A02();
            }
        }
    }

    public void Bq9(String str) {
        C193169Nk r0;
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        if (str != null && A0B(C142096wd.PROCESSING_QUERIES_AND_STEPS) && (r0 = (C193169Nk) this.A08.get(str)) != null) {
            AtomicInteger atomicInteger = r0.A00;
            if (C192309Jb.values()[atomicInteger.get()] == C192309Jb.PENDING && atomicInteger.compareAndSet(0, 1)) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(millis);
                String A0V = AnonymousClass000.A0V("step_completed_", str, AnonymousClass001.A0o());
                AtomicLong atomicLong = this.A0E;
                if (atomicLong.get() <= nanos) {
                    this.A0F = A0V;
                    atomicLong.set(nanos);
                }
                A05(millis, A0V);
                A04(atomicLong.get());
                A02();
            }
        }
    }

    public final void A01() {
        String obj;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ConcurrentHashMap concurrentHashMap = this.A09;
        Iterator A10 = C18290x4.A10(concurrentHashMap);
        while (A10.hasNext()) {
            AnonymousClass9VL r2 = (AnonymousClass9VL) A10.next();
            if (r2 != null && C192359Ji.A00(r2) == C192359Ji.QUERY_NOT_NEEDED) {
                A0s.add(r2.A04);
            }
        }
        Iterator A0u = AnonymousClass001.A0u(this.A08);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (A0w != null) {
                Object key = A0w.getKey();
                C193169Nk r0 = (C193169Nk) A0w.getValue();
                if (r0 != null) {
                    if (C192309Jb.values()[r0.A00.get()] == C192309Jb.REVOKED) {
                        A0s2.add(key);
                    }
                }
            }
        }
        if (!A0s.isEmpty()) {
            A07("revoked_queries", (String[]) A0s.toArray(A0G));
        }
        if (!A0s2.isEmpty()) {
            A07("revoked_steps", (String[]) A0s2.toArray(A0G));
        }
        ArrayList A0s3 = AnonymousClass001.A0s();
        ArrayList A0s4 = AnonymousClass001.A0s();
        Iterator A102 = C18290x4.A10(concurrentHashMap);
        while (A102.hasNext()) {
            AnonymousClass9VL r3 = (AnonymousClass9VL) A102.next();
            if (r3 != null && C192359Ji.A00(r3) == C192359Ji.QUERY_SUCCESSFULLY_COMPLETED) {
                if (!r3.A02 || r3.A01) {
                    A0s4.add(r3.A04);
                } else {
                    A0s3.add(r3.A04);
                }
            }
        }
        if (!A0s3.isEmpty() || !A0s4.isEmpty()) {
            if (A0s4.isEmpty()) {
                obj = "CACHE";
            } else if (A0s3.isEmpty()) {
                obj = "NETWORK";
            } else {
                Collections.sort(A0s3);
                Collections.sort(A0s4);
                StringBuilder A0o = AnonymousClass001.A0o();
                Iterator it = A0s3.iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    if (A0m != null) {
                        if (A0o.length() != 0) {
                            A0o.append(", ");
                        }
                        A0o.append(A0m);
                        A0o.append("_C");
                    }
                }
                Iterator it2 = A0s4.iterator();
                while (it2.hasNext()) {
                    String A0m2 = AnonymousClass001.A0m(it2);
                    if (A0m2 != null) {
                        A0o.append(", ");
                        A0o.append(A0m2);
                        A0o.append("_N");
                    }
                }
                obj = A0o.toString();
            }
            BKb("ttrc_source", obj);
        }
        ArrayList A0s5 = AnonymousClass001.A0s();
        Iterator A103 = C18290x4.A10(concurrentHashMap);
        while (A103.hasNext()) {
            AnonymousClass9VL r1 = (AnonymousClass9VL) A103.next();
            if (r1 != null && r1.A02) {
                A0s5.add(r1.A04);
            }
        }
        if (!A0s5.isEmpty()) {
            Collections.sort(A0s5);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            Iterator it3 = A0s5.iterator();
            while (it3.hasNext()) {
                String A0m3 = AnonymousClass001.A0m(it3);
                if (A0m3 != null) {
                    if (A0o2.length() != 0) {
                        A0o2.append(", ");
                    }
                    A0o2.append(A0m3);
                }
            }
            BKb("ttrc_cache_rendered", A0o2.toString());
        }
    }

    public void A08(short s, String str) {
        if (!TextUtils.isEmpty(str)) {
            C197759dp r4 = this.A05;
            AnonymousClass6N2 r1 = new AnonymousClass6N2(r4.A00, r4, Integer.valueOf(this.A00), this.A01);
            r1.annotate("end_reason", str);
            r1.markerEditingCompleted();
        }
        this.A05.markerEnd(this.A01, this.A00, s);
    }

    public boolean A09() {
        C142096wd BDr = BDr();
        C142096wd[] r2 = {C142096wd.ZERO_QUERIES_AND_ZERO_STEPS, C142096wd.REGISTERING_QUERIES_AND_STEPS, C142096wd.PROCESSING_QUERIES_AND_STEPS};
        int i = 0;
        while (BDr != r2[i]) {
            i++;
            if (i >= 3) {
                return false;
            }
        }
        return true;
    }

    public boolean A0B(C142096wd r5) {
        if (BDr() == new C142096wd[]{r5}[0] || A0C(r5)) {
            return true;
        }
        if (BDr() != new C142096wd[]{r5}[0]) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r2 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(X.C142096wd r6) {
        /*
            r5 = this;
            int r3 = r6.ordinal()
            r2 = 1
            switch(r3) {
                case 1: goto L_0x004b;
                case 2: goto L_0x0055;
                case 3: goto L_0x0061;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A0D
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.compareAndSet(r2, r3)
            if (r0 != 0) goto L_0x0021
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L_0x0072
            A00(r5)
        L_0x0021:
            X.9Nj r3 = r5.A06
            long r0 = r5.A03
            java.util.concurrent.ConcurrentHashMap r4 = r3.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r4.get(r3)
            X.8vN r0 = (X.C186468vN) r0
            if (r0 == 0) goto L_0x004a
            X.6wd r1 = r0.BDr()
            X.6wd r0 = X.C142096wd.MARKER_CANCELLED
            if (r1 == r0) goto L_0x0047
            X.6wd r0 = X.C142096wd.MARKER_DROPPED
            if (r1 == r0) goto L_0x0047
            X.6wd r0 = X.C142096wd.MARKER_FAILED
            if (r1 == r0) goto L_0x0047
            X.6wd r0 = X.C142096wd.SUCCESSFULLY_FINISHED
            if (r1 != r0) goto L_0x004a
        L_0x0047:
            r4.remove(r3)
        L_0x004a:
            return r2
        L_0x004b:
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A0D
            r0 = 0
            boolean r2 = r1.compareAndSet(r0, r3)
            if (r2 == 0) goto L_0x004a
            goto L_0x0021
        L_0x0055:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0D
            boolean r2 = r0.compareAndSet(r2, r3)
            if (r2 == 0) goto L_0x004a
            A00(r5)
            goto L_0x0021
        L_0x0061:
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A0D
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 != 0) goto L_0x0021
            r0 = 2
            boolean r0 = r1.compareAndSet(r0, r3)
            if (r0 == 0) goto L_0x0072
            goto L_0x0021
        L_0x0072:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YN.A0C(X.6wd):boolean");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        A0o.append("_");
        return AnonymousClass000.A0h(A0o, this.A00);
    }
}
