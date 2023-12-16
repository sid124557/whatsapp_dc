package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.9W5  reason: invalid class name */
public class AnonymousClass9W5 {
    public final AnonymousClass9TM A00;
    public final AnonymousClass9VJ A01;
    public final C195539Yh A02;
    public final C192559Ko A03;
    public final C104855Sp A04;
    public final C1001959y A05;
    public final Object A06 = AnonymousClass002.A0D();
    public final List A07 = AnonymousClass001.A0s();
    public final Executor A08;
    public final Executor A09;
    public final Executor A0A;

    public static boolean A02(AnonymousClass32L r1, C104855Sp r2) {
        C162457s7.A0J(r1, 1);
        return r2.A02(r1);
    }

    public static String A00(C195349Xk r6) {
        Object[] objArr;
        String str;
        AnonymousClass9WL r62 = r6.A02;
        ARAssetType aRAssetType = r62.A02;
        switch (aRAssetType.ordinal()) {
            case 0:
                return "AREffect";
            case 1:
                VersionedCapability A032 = r62.A03();
                A032.getClass();
                switch (A032.ordinal()) {
                    case 0:
                        return "FaceTrackerModel";
                    case 1:
                        return "HandTrackerModel";
                    case 2:
                        return "SegmentationModel";
                    case 3:
                        return "TargetRecognitionModel";
                    case 4:
                        return "HairSegmentationModel";
                    case 5:
                        return "XRayModel";
                    case 8:
                        return "MSuggestionsCoreModel";
                    case 15:
                        return "BodyTrackingModel";
                    default:
                        objArr = new Object[]{r62.A03()};
                        str = "Invalid capability: ";
                        break;
                }
            case 2:
                C192449Ju r1 = r62.A05;
                if (r1 != C192449Ju.Block && r1 != C192449Ju.ShareableBlock) {
                    objArr = new Object[]{r1};
                    str = "Invalid async asset type: ";
                    break;
                } else {
                    return "Block";
                }
            case 3:
                return "RemoteAsset";
            case 4:
                return "ScriptingPackage";
            case 5:
                return "SparkVisionNativeMLModel";
            default:
                objArr = new Object[]{aRAssetType.name()};
                str = "Invalid ARAssetType: %s";
                break;
        }
        C162477s9.A0G("ARDeliveryLoggerUtil", str, objArr);
        return "UnknownAssetType";
    }

    public C202249ld A04(AnonymousClass9QN r10, C202879mj r11, C192529Kl r12, AnonymousClass32L r13, List list) {
        C194339Sm r3;
        Executor executor;
        synchronized (this.A06) {
            AnonymousClass9VJ r0 = this.A01;
            r3 = new C194339Sm(r10, r11, r12, r13, list);
            r0.A04.put(r3, AnonymousClass001.A0s());
        }
        if (r13.A02) {
            executor = this.A0A;
        } else {
            executor = this.A08;
        }
        executor.execute(new C200829ix(this, r3, list));
        return new AnonymousClass9YS(this, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r4.A01 > 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A05(X.C194249Sd r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            int r0 = r4.A00     // Catch:{ all -> 0x0019 }
            if (r0 > 0) goto L_0x000c
            int r1 = r4.A01     // Catch:{ all -> 0x0019 }
            r0 = 0
            if (r1 <= 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.List r0 = r3.A06(r4)     // Catch:{ all -> 0x0019 }
            goto L_0x0017
        L_0x0015:
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W5.A05(X.9Sd):java.util.List");
    }

    public final List A06(C194249Sd r4) {
        C129586aY copyOf;
        synchronized (this.A06) {
            AnonymousClass9VJ r1 = this.A01;
            Collection collection = (List) r1.A05.get(r4);
            if (collection == null) {
                if (!r1.A00) {
                    r1.A00 = true;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("InternalLoadRequest not present in mInternalToExternalMap: ");
                    C162457s7.A0J(AnonymousClass000.A0X(r4.A03.A02.A0A, A0o), 1);
                }
                collection = AnonymousClass001.A0s();
            }
            copyOf = C129586aY.copyOf(collection);
        }
        return copyOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (r4.A01 > 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r5.A01 > 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A07(java.util.List r22, java.util.List r23, boolean r24) {
        /*
            r21 = this;
            r7 = r21
            r1 = r22
            r0 = r23
            r10 = r24
            X.0PJ r1 = r7.A03(r1, r0, r10)
            java.lang.Object r0 = r1.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r8 = r1.A01
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.lang.Object r6 = r7.A06
            monitor-enter(r6)
            java.util.Iterator r20 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x019a }
        L_0x001f:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0109
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r20)     // Catch:{ all -> 0x019a }
            java.lang.Object r5 = r2.getKey()     // Catch:{ all -> 0x019a }
            X.9Sd r5 = (X.C194249Sd) r5     // Catch:{ all -> 0x019a }
            int r0 = r5.A00     // Catch:{ all -> 0x019a }
            if (r0 > 0) goto L_0x0038
            int r1 = r5.A01     // Catch:{ all -> 0x019a }
            r0 = 0
            if (r1 <= 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == 0) goto L_0x001f
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x019a }
            X.9No r4 = (X.C193209No) r4     // Catch:{ all -> 0x019a }
            java.util.List r2 = r7.A06(r5)     // Catch:{ all -> 0x019a }
            if (r4 != 0) goto L_0x006c
            if (r24 == 0) goto L_0x004d
            r8.add(r5)     // Catch:{ all -> 0x019a }
            goto L_0x001f
        L_0x004d:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x019a }
        L_0x0051:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x019a }
            X.9Sm r0 = (X.C194339Sm) r0     // Catch:{ all -> 0x019a }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0051
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x006c
            r9.add(r5)     // Catch:{ all -> 0x019a }
            goto L_0x001f
        L_0x006c:
            java.util.Iterator r19 = r2.iterator()     // Catch:{ all -> 0x019a }
        L_0x0070:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r12 = r19.next()     // Catch:{ all -> 0x019a }
            X.9Sm r12 = (X.C194339Sm) r12     // Catch:{ all -> 0x019a }
            X.9Xk r0 = r5.A03     // Catch:{ all -> 0x019a }
            r2 = 1
            X.9QN r11 = r12.A05     // Catch:{ all -> 0x019a }
            if (r11 == 0) goto L_0x0070
            X.9WL r0 = r0.A02     // Catch:{ all -> 0x019a }
            java.lang.String r13 = r0.A0A     // Catch:{ all -> 0x019a }
            double r0 = (double) r2     // Catch:{ all -> 0x019a }
            double r0 = r0 / r0
            monitor-enter(r12)     // Catch:{ all -> 0x019a }
            java.util.Map r3 = r12.A09     // Catch:{ all -> 0x0105 }
            boolean r2 = r3.containsKey(r13)     // Catch:{ all -> 0x0105 }
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r2 = r3.get(r13)     // Catch:{ all -> 0x0105 }
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ all -> 0x0105 }
            double r14 = r2.doubleValue()     // Catch:{ all -> 0x0105 }
        L_0x009d:
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0105 }
            r3.put(r13, r2)     // Catch:{ all -> 0x0105 }
            double r2 = r12.A00     // Catch:{ all -> 0x0105 }
            double r2 = r2 + r0
            double r2 = r2 - r14
            r12.A00 = r2     // Catch:{ all -> 0x0105 }
            monitor-exit(r12)     // Catch:{ all -> 0x0105 }
            goto L_0x00af
        L_0x00ac:
            r14 = 0
            goto L_0x009d
        L_0x00af:
            int r0 = r12.A04     // Catch:{ all -> 0x019a }
            double r0 = (double) r0     // Catch:{ all -> 0x019a }
            double r2 = r2 / r0
            boolean r0 = r11 instanceof X.C1903195h     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x00e7
            X.95h r11 = (X.C1903195h) r11     // Catch:{ all -> 0x019a }
            X.9RQ r12 = r11.A01     // Catch:{ all -> 0x019a }
            if (r12 == 0) goto L_0x0070
            java.util.concurrent.atomic.AtomicReference r14 = r11.A04     // Catch:{ all -> 0x019a }
            double r17 = X.C1899593h.A00(r14)     // Catch:{ all -> 0x019a }
            java.util.concurrent.atomic.AtomicReference r13 = r11.A03     // Catch:{ all -> 0x019a }
            double r0 = X.C1899593h.A00(r13)     // Catch:{ all -> 0x019a }
            double r15 = r2 - r0
            int r0 = r11.A00     // Catch:{ all -> 0x019a }
            double r0 = (double) r0     // Catch:{ all -> 0x019a }
            double r15 = r15 / r0
            double r17 = r17 + r15
            java.lang.Double r0 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x019a }
            r14.set(r0)     // Catch:{ all -> 0x019a }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x019a }
            r13.set(r0)     // Catch:{ all -> 0x019a }
            double r0 = X.C1899593h.A00(r14)     // Catch:{ all -> 0x019a }
            r12.A00(r0)     // Catch:{ all -> 0x019a }
            goto L_0x0070
        L_0x00e7:
            X.95g r11 = (X.C1903095g) r11     // Catch:{ all -> 0x019a }
            java.util.concurrent.atomic.AtomicReference r13 = r11.A01     // Catch:{ all -> 0x019a }
            java.util.concurrent.atomic.AtomicReference r0 = r11.A03     // Catch:{ all -> 0x019a }
            double r11 = X.C1899593h.A00(r0)     // Catch:{ all -> 0x019a }
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r11
            double r2 = r2 * r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x019a }
            r13.set(r0)     // Catch:{ all -> 0x019a }
            goto L_0x0070
        L_0x00fe:
            r1 = 0
            r0 = 1
            r7.A0A(r5, r4, r1, r0)     // Catch:{ all -> 0x019a }
            goto L_0x001f
        L_0x0105:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0105 }
            goto L_0x0197
        L_0x0109:
            java.util.Iterator r13 = r8.iterator()     // Catch:{ all -> 0x019a }
        L_0x010d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x019a }
            if (r0 == 0) goto L_0x0198
            java.lang.Object r4 = r13.next()     // Catch:{ all -> 0x019a }
            X.9Sd r4 = (X.C194249Sd) r4     // Catch:{ all -> 0x019a }
            int r2 = r4.A00     // Catch:{ all -> 0x019a }
            if (r2 > 0) goto L_0x0122
            int r1 = r4.A01     // Catch:{ all -> 0x019a }
            r0 = 0
            if (r1 <= 0) goto L_0x0123
        L_0x0122:
            r0 = 1
        L_0x0123:
            if (r0 == 0) goto L_0x010d
            X.9Xk r10 = r4.A03     // Catch:{ all -> 0x019a }
            X.9TM r12 = r7.A00     // Catch:{ all -> 0x019a }
            boolean r0 = X.AnonymousClass001.A1W(r2)
            r11 = r0 ^ 1
            X.9Oi r8 = new X.9Oi     // Catch:{ all -> 0x019a }
            r8.<init>(r7, r4, r10)     // Catch:{ all -> 0x019a }
            java.lang.String r5 = r10.A0A     // Catch:{ all -> 0x019a }
            java.lang.Object r3 = r12.A06     // Catch:{ all -> 0x019a }
            monitor-enter(r3)     // Catch:{ all -> 0x019a }
            if (r5 != 0) goto L_0x013c
            goto L_0x014f
        L_0x013c:
            java.util.Map r2 = r12.A09     // Catch:{ all -> 0x0186 }
            boolean r0 = r2.containsKey(r5)     // Catch:{ all -> 0x0186 }
            if (r0 == 0) goto L_0x0157
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = "Already download "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r5, r1)     // Catch:{ all -> 0x0186 }
            goto L_0x0151
        L_0x014f:
            java.lang.String r1 = "Uri is null "
        L_0x0151:
            r0 = 1
            X.C162457s7.A0J(r1, r0)     // Catch:{ all -> 0x0186 }
            monitor-exit(r3)     // Catch:{ all -> 0x0186 }
            goto L_0x010d
        L_0x0157:
            X.9V8 r1 = new X.9V8     // Catch:{ all -> 0x0186 }
            r1.<init>(r8, r10, r11)     // Catch:{ all -> 0x0186 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0186 }
            java.util.Queue r0 = r12.A0A     // Catch:{ all -> 0x0186 }
            r0.offer(r1)     // Catch:{ all -> 0x0186 }
            r12.A01()     // Catch:{ all -> 0x0186 }
            java.util.List r0 = r12.A00()     // Catch:{ all -> 0x0186 }
            monitor-exit(r3)     // Catch:{ all -> 0x0186 }
            r12.A02(r0)     // Catch:{ all -> 0x019a }
            X.9SP r3 = new X.9SP     // Catch:{ all -> 0x019a }
            r3.<init>(r1, r12)     // Catch:{ all -> 0x019a }
            X.9VJ r0 = r7.A01     // Catch:{ all -> 0x019a }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x019a }
            X.9WL r0 = r10.A02     // Catch:{ all -> 0x019a }
            java.lang.String r2 = r0.A0A     // Catch:{ all -> 0x019a }
            java.lang.Object r0 = r1.put(r2, r3)     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0189
            r0 = 1
            r4.A02 = r0     // Catch:{ all -> 0x019a }
            goto L_0x010d
        L_0x0186:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0186 }
            goto L_0x0197
        L_0x0189:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x019a }
            java.lang.String r0 = "InternalLoadRequest already has linked token: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x019a }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x019a }
        L_0x0197:
            throw r0     // Catch:{ all -> 0x019a }
        L_0x0198:
            monitor-exit(r6)     // Catch:{ all -> 0x019a }
            return r9
        L_0x019a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x019a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W5.A07(java.util.List, java.util.List, boolean):java.util.List");
    }

    public final void A08() {
        ArrayList A0J;
        C202879mj r4;
        AnonymousClass9KQ r3;
        Object obj;
        synchronized (this.A06) {
            List list = this.A07;
            A0J = AnonymousClass002.A0J(list);
            list.clear();
        }
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            C194339Sm r5 = (C194339Sm) it.next();
            ArrayList A0s = AnonymousClass001.A0s();
            synchronized (r5) {
                boolean z = false;
                AnonymousClass9LA.A00(AnonymousClass000.A1U(r5.A01, r5.A04));
                if (!r5.A03) {
                    z = true;
                }
                AnonymousClass9LA.A00(z);
                r5.A03 = true;
                r4 = r5.A06;
                r3 = r5.A02;
                if (r3 == null) {
                    for (AnonymousClass0PJ r1 : r5.A0A.values()) {
                        if (AnonymousClass001.A1Z(r1.A00) && (obj = r1.A01) != null) {
                            A0s.add((C193209No) obj);
                        }
                    }
                }
            }
            if (r3 != null) {
                r4.BSl(r3);
            } else {
                r4.onSuccess(A0s);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0094 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C194249Sd r11, X.C193209No r12, X.AnonymousClass9KQ r13, boolean r14) {
        /*
            r10 = this;
            java.lang.Object r2 = r10.A06
            monitor-enter(r2)
            X.9VJ r5 = r10.A01     // Catch:{ all -> 0x00f1 }
            java.util.Map r1 = r5.A02     // Catch:{ all -> 0x00f1 }
            X.9Xk r0 = r11.A03     // Catch:{ all -> 0x00f1 }
            X.9WL r0 = r0.A02     // Catch:{ all -> 0x00f1 }
            java.lang.String r4 = r0.A0A     // Catch:{ all -> 0x00f1 }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00d7
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x00f1 }
            r0.remove(r4)     // Catch:{ all -> 0x00f1 }
            java.util.Map r1 = r5.A05     // Catch:{ IllegalStateException -> 0x0021 }
            java.util.Map r0 = r5.A04     // Catch:{ IllegalStateException -> 0x0021 }
            java.util.List r0 = X.AnonymousClass9VJ.A00(r11, r1, r0)     // Catch:{ IllegalStateException -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00f1 }
        L_0x0025:
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0029:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00f1 }
            X.9Sm r3 = (X.C194339Sm) r3     // Catch:{ all -> 0x00f1 }
            monitor-enter(r3)     // Catch:{ all -> 0x00f1 }
            if (r14 == 0) goto L_0x003c
            if (r13 == 0) goto L_0x0040
            goto L_0x00ca
        L_0x003c:
            if (r13 != 0) goto L_0x0040
            goto L_0x00c3
        L_0x0040:
            java.util.Map r7 = r3.A0A     // Catch:{ all -> 0x00d2 }
            java.lang.Object r0 = r7.get(r4)     // Catch:{ all -> 0x00d2 }
            r8 = 0
            boolean r0 = X.AnonymousClass000.A1X(r0)
            X.AnonymousClass9LA.A00(r0)     // Catch:{ all -> 0x00d2 }
            int r1 = r3.A01     // Catch:{ all -> 0x00d2 }
            int r6 = r3.A04     // Catch:{ all -> 0x00d2 }
            r0 = 0
            if (r1 >= r6) goto L_0x0056
            r0 = 1
        L_0x0056:
            X.AnonymousClass9LA.A00(r0)     // Catch:{ all -> 0x00d2 }
            boolean r0 = r3.A03     // Catch:{ all -> 0x00d2 }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.AnonymousClass9LA.A00(r0)     // Catch:{ all -> 0x00d2 }
            if (r14 == 0) goto L_0x0065
            goto L_0x0076
        L_0x0065:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00d2 }
            r0 = 0
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)     // Catch:{ all -> 0x00d2 }
            r7.put(r4, r0)     // Catch:{ all -> 0x00d2 }
            X.9KQ r0 = r3.A02     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x007f
            r3.A02 = r13     // Catch:{ all -> 0x00d2 }
            goto L_0x007f
        L_0x0076:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00d2 }
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r0, r12)     // Catch:{ all -> 0x00d2 }
            r7.put(r4, r0)     // Catch:{ all -> 0x00d2 }
        L_0x007f:
            int r0 = r3.A01     // Catch:{ all -> 0x00d2 }
            int r0 = r0 + 1
            r3.A01 = r0     // Catch:{ all -> 0x00d2 }
            if (r0 != r6) goto L_0x0088
            r8 = 1
        L_0x0088:
            monitor-exit(r3)     // Catch:{ all -> 0x00f1 }
            if (r8 == 0) goto L_0x0029
            java.util.Map r1 = r5.A04     // Catch:{ IllegalStateException -> 0x0094 }
            java.util.Map r0 = r5.A05     // Catch:{ IllegalStateException -> 0x0094 }
            java.util.List r1 = X.AnonymousClass9VJ.A00(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x0094 }
            goto L_0x0098
        L_0x0094:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00f1 }
        L_0x0098:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00bc
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x00a6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00f1 }
            X.9Sd r0 = (X.C194249Sd) r0     // Catch:{ all -> 0x00f1 }
            X.9Xk r0 = r0.A03     // Catch:{ all -> 0x00f1 }
            X.9WL r0 = r0.A02     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x00f1 }
            r3.add(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x00a6
        L_0x00bc:
            java.util.List r0 = r10.A07     // Catch:{ all -> 0x00f1 }
            r0.add(r3)     // Catch:{ all -> 0x00f1 }
            goto L_0x0029
        L_0x00c3:
            java.lang.String r0 = "Got null exception for failure"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d1
        L_0x00ca:
            java.lang.String r1 = "Got non-null exception for success"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d2 }
            r0.<init>(r1, r13)     // Catch:{ all -> 0x00d2 }
        L_0x00d1:
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f0
        L_0x00d5:
            monitor-exit(r2)     // Catch:{ all -> 0x00f1 }
            return
        L_0x00d7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "InternalLoadRequest still has associated download token: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ all -> 0x00f1 }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f0
        L_0x00e6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Internal loads still pending for finished ExternalLoadRequest: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r3, r0, r1)     // Catch:{ all -> 0x00f1 }
        L_0x00f0:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W5.A0A(X.9Sd, X.9No, X.9KQ, boolean):void");
    }

    public AnonymousClass9W5(AnonymousClass9TM r2, C195539Yh r3, C192559Ko r4, C104855Sp r5, C1001959y r6, Executor executor, Executor executor2, Executor executor3) {
        this.A08 = executor;
        this.A0A = executor2;
        this.A09 = executor3;
        this.A02 = r3;
        this.A00 = r2;
        this.A04 = r5;
        this.A01 = new AnonymousClass9VJ(r6);
        this.A03 = r4;
        this.A05 = r6;
        AnonymousClass9M5.A00();
    }

    public final AnonymousClass0PJ A03(List list, List list2, boolean z) {
        C193209No r0;
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C194249Sd r3 = (C194249Sd) it.next();
            C195349Xk r12 = r3.A03;
            AnonymousClass9WL r2 = r12.A02;
            List list3 = list;
            A09(AnonymousClass9JK.CACHE_CHECK_START, r12, (AnonymousClass9KQ) null, list3, -1, true);
            C195539Yh r6 = this.A02;
            boolean BH7 = r6.BH7(r2, false);
            A09(AnonymousClass9JK.CACHE_CHECK_END, r12, (AnonymousClass9KQ) null, list3, -1, BH7);
            if (BH7) {
                if (z || r2.A03 == ARRequestAsset$CompressionMethod.NONE) {
                    File B53 = r6.B53(r2, new C195559Yj(this, r12, list3));
                    if (AnonymousClass9U6.A01(B53)) {
                        r0 = new C193209No(r12, B53);
                    } else {
                        C162477s9.A0G("DefaultAssetManager", "Cached file not found? id=%s", r2.A0A);
                        r6.Bj3(r2);
                    }
                } else {
                    r6.Bs2(r2);
                    r0 = null;
                }
                A0t.put(r3, r0);
            }
            A0s.add(r3);
        }
        return AnonymousClass0x9.A0G(A0t, A0s);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        r3.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0182, code lost:
        if (r15 != false) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0184, code lost:
        if (r11 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0186, code lost:
        r1 = r11.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018a, code lost:
        if (r1 != null) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018c, code lost:
        r1 = "missing failure reason";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018e, code lost:
        r3.A02(r2, "failure_reason", r1);
        r3.A03(r2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ce, code lost:
        r2.A01(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass9JK r9, X.C195349Xk r10, X.AnonymousClass9KQ r11, java.util.List r12, long r13, boolean r15) {
        /*
            r8 = this;
            java.util.Iterator r7 = r12.iterator()
        L_0x0004:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x023e
            java.lang.Object r5 = r7.next()
            X.32L r5 = (X.AnonymousClass32L) r5
            int r0 = r9.ordinal()
            switch(r0) {
                case 0: goto L_0x01f7;
                case 1: goto L_0x01d3;
                case 2: goto L_0x0096;
                case 3: goto L_0x0017;
                case 4: goto L_0x0017;
                case 5: goto L_0x002d;
                case 6: goto L_0x01be;
                case 7: goto L_0x01ad;
                case 8: goto L_0x019c;
                case 9: goto L_0x0169;
                case 10: goto L_0x0158;
                case 11: goto L_0x013e;
                case 12: goto L_0x012c;
                case 13: goto L_0x0112;
                case 14: goto L_0x0100;
                case 15: goto L_0x00ee;
                case 16: goto L_0x00dc;
                case 17: goto L_0x00b7;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r1 = 0
            java.lang.String r0 = r9.name()
            r2[r1] = r0
            java.lang.String r0 = "unknown asset loading stage reported : {0}"
            java.lang.String r0 = java.text.MessageFormat.format(r0, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x002d:
            X.5Sp r1 = r8.A04
            r0 = 3
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r1.A02(r5)
            if (r0 != 0) goto L_0x0004
            X.4fZ r4 = r1.A00
            r2 = 3
            java.lang.String r6 = r5.A01
            int r3 = X.C89964fZ.A00(r10, r6)
            if (r15 == 0) goto L_0x0080
            java.lang.String r0 = "download_success"
        L_0x0046:
            r4.A01(r3, r0)
            if (r15 == 0) goto L_0x0083
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0076
            java.lang.String r5 = A00(r10)
            java.lang.String r2 = X.C192519Kk.A00(r10)
            X.C162457s7.A0D(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AssetQPLogger/logAssetDownloadFinish Successful download with empty result: "
            r1.append(r0)
            r1.append(r6)
            r0 = 32
            r1.append(r0)
            r1.append(r5)
            r1.append(r0)
            X.C18260x0.A1K(r1, r2)
        L_0x0076:
            java.lang.String r1 = "downloaded_bytes"
            java.lang.String r0 = java.lang.String.valueOf(r13)
            r4.A02(r3, r1, r0)
            goto L_0x0004
        L_0x0080:
            java.lang.String r0 = "download_fail"
            goto L_0x0046
        L_0x0083:
            if (r11 == 0) goto L_0x0091
            java.lang.String r1 = r11.A01()
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "failure_reason"
            r4.A02(r3, r0, r1)
        L_0x0091:
            r4.A03(r3, r2)
            goto L_0x0004
        L_0x0096:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r3 = r1.A00
            int r2 = X.C1899693i.A00(r10, r5)
            java.lang.String r1 = "UNKNOWN"
            java.lang.String r0 = "connection_class"
            r3.A02(r2, r0, r1)
            java.lang.String r0 = "connection_name"
            r3.A02(r2, r0, r1)
            java.lang.String r0 = "download_start"
            r3.A01(r2, r0)
            goto L_0x0004
        L_0x00b7:
            X.5Sp r1 = r8.A04
            r0 = 2
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r1.A02(r5)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            if (r15 == 0) goto L_0x00d9
            java.lang.String r0 = "put_to_cache_success"
        L_0x00cd:
            r2.A01(r1, r0)
            r0 = 3
            if (r15 == 0) goto L_0x00d4
            r0 = 2
        L_0x00d4:
            r2.A03(r1, r0)
            goto L_0x0004
        L_0x00d9:
            java.lang.String r0 = "put_to_cache_fail"
            goto L_0x00cd
        L_0x00dc:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "put_to_cache_start"
            goto L_0x01ce
        L_0x00ee:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "encoding_operation_finish"
            goto L_0x01ce
        L_0x0100:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "encoding_operation_start"
            goto L_0x01ce
        L_0x0112:
            X.5Sp r1 = r8.A04
            r0 = 2
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r1.A02(r5)
            if (r0 != 0) goto L_0x0004
            X.4fZ r3 = r1.A00
            int r2 = X.C1899693i.A00(r10, r5)
            if (r15 == 0) goto L_0x0129
            java.lang.String r0 = "encoding_success"
            goto L_0x017f
        L_0x0129:
            java.lang.String r0 = "encoding_fail"
            goto L_0x017f
        L_0x012c:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "encoding_start"
            goto L_0x01ce
        L_0x013e:
            X.5Sp r1 = r8.A04
            r0 = 2
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r1.A02(r5)
            if (r0 != 0) goto L_0x0004
            X.4fZ r3 = r1.A00
            int r2 = X.C1899693i.A00(r10, r5)
            if (r15 == 0) goto L_0x0155
            java.lang.String r0 = "extraction_success"
            goto L_0x017f
        L_0x0155:
            java.lang.String r0 = "extraction_fail"
            goto L_0x017f
        L_0x0158:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "extraction_start"
            goto L_0x01ce
        L_0x0169:
            X.5Sp r1 = r8.A04
            r0 = 2
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r1.A02(r5)
            if (r0 != 0) goto L_0x0004
            X.4fZ r3 = r1.A00
            int r2 = X.C1899693i.A00(r10, r5)
            if (r15 == 0) goto L_0x0199
            java.lang.String r0 = "decryption_success"
        L_0x017f:
            r3.A01(r2, r0)
            if (r15 != 0) goto L_0x0004
            if (r11 == 0) goto L_0x018c
            java.lang.String r1 = r11.A01()
            if (r1 != 0) goto L_0x018e
        L_0x018c:
            java.lang.String r1 = "missing failure reason"
        L_0x018e:
            java.lang.String r0 = "failure_reason"
            r3.A02(r2, r0, r1)
            r0 = 3
            r3.A03(r2, r0)
            goto L_0x0004
        L_0x0199:
            java.lang.String r0 = "decryption_fail"
            goto L_0x017f
        L_0x019c:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "decryption_operation_finish"
            goto L_0x01ce
        L_0x01ad:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "decryption_operation_start"
            goto L_0x01ce
        L_0x01be:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r2 = r1.A00
            int r1 = X.C1899693i.A00(r10, r5)
            java.lang.String r0 = "decryption_start"
        L_0x01ce:
            r2.A01(r1, r0)
            goto L_0x0004
        L_0x01d3:
            X.5Sp r1 = r8.A04
            r0 = 2
            X.C162457s7.A0J(r5, r0)
            boolean r0 = r1.A02(r5)
            if (r0 != 0) goto L_0x0004
            X.4fZ r3 = r1.A00
            r2 = 2
            int r1 = X.C1899693i.A00(r10, r5)
            if (r15 == 0) goto L_0x01f4
            java.lang.String r0 = "cache_check_hit"
        L_0x01ea:
            r3.A01(r1, r0)
            if (r15 == 0) goto L_0x0004
            r3.A03(r1, r2)
            goto L_0x0004
        L_0x01f4:
            java.lang.String r0 = "cache_check_miss"
            goto L_0x01ea
        L_0x01f7:
            X.5Sp r1 = r8.A04
            boolean r0 = A02(r5, r1)
            if (r0 != 0) goto L_0x0004
            X.4fZ r3 = r1.A00
            int r2 = X.C1899693i.A00(r10, r5)
            X.8JP r4 = r3.A01
            r1 = 22413316(0x1560004, float:3.9305604E-38)
            r0 = 0
            r4.BKl(r1, r2, r0)
            X.9WL r0 = r10.A02
            java.lang.Boolean r0 = r0.A07
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = X.C1899693i.A0Z(r0)
            java.lang.String r0 = "is_encrypted"
            r3.A02(r2, r0, r1)
            java.lang.String r0 = "cache_check_start"
            r3.A01(r2, r0)
            java.lang.String r1 = X.C192519Kk.A00(r10)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "asset_id"
            r3.A02(r2, r0, r1)
            java.lang.String r1 = A00(r10)
            java.lang.String r0 = "asset_type"
            r3.A02(r2, r0, r1)
            r3.A04(r5, r2)
            goto L_0x0004
        L_0x023e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W5.A09(X.9JK, X.9Xk, X.9KQ, java.util.List, long, boolean):void");
    }
}
