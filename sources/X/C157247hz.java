package X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.concurrent.Callable;

/* renamed from: X.7hz  reason: invalid class name and case insensitive filesystem */
public class C157247hz {
    public static AnonymousClass7TE A01;
    public final Callable A00 = new AnonymousClass91H(A01, 1);

    static {
        AnonymousClass7TE r2 = new AnonymousClass7TE();
        A01 = r2;
        Class<Integer> cls = Integer.class;
        Class<Double> cls2 = Double.class;
        Class<Float> cls3 = Float.class;
        Class<String> cls4 = String.class;
        AnonymousClass7TE A002 = A00(BigInteger.class, new C175848Zy(), A00(Date.class, new C175868a0(), A00(cls4, new C175918a5(), A00(BigDecimal.class, new C175838Zx(), A00(Float.TYPE, new C175888a2(), A00(cls3, new C175888a2(), A00(Double.TYPE, new C175878a1(), A00(cls2, new C175878a1(), A00(Integer.TYPE, new C175898a3(), A00(cls, new C175898a3(), A00(Long.TYPE, new C175908a4(), A00(Long.class, new C175908a4(), r2))))))))))));
        A002.A02.put(Boolean.TYPE, new C175858Zz());
    }

    public static AnonymousClass7TE A00(Object obj, Object obj2, AnonymousClass7TE r3) {
        r3.A02.put(obj, obj2);
        return A01;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|(3:12|13|14)(1:15)|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|(3:22|23|24)(1:25)|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0058=Splitter:B:26:0x0058, B:16:0x003a=Splitter:B:16:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(java.lang.Class r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r2 = r6.getClass()
            boolean r0 = r5.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x0089
            boolean r1 = r6 instanceof java.util.Map     // Catch:{ Exception -> 0x0082 }
            if (r1 != 0) goto L_0x0023
            boolean r0 = r6 instanceof java.util.List     // Catch:{ Exception -> 0x0082 }
            if (r0 != 0) goto L_0x0023
            java.util.concurrent.Callable r0 = r4.A00     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0082 }
            X.7TE r0 = (X.AnonymousClass7TE) r0     // Catch:{ Exception -> 0x0082 }
            X.7bN r0 = r0.A00(r5)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r6 = r0.A03(r6)     // Catch:{ Exception -> 0x0082 }
            return r6
        L_0x0023:
            if (r1 == 0) goto L_0x003f
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x0082 }
            X.7nL r2 = X.C160267nL.A04     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0082 }
            if (r6 != 0) goto L_0x0035
            java.lang.String r0 = "null"
            r1.append(r0)     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x0035:
            X.8qJ r0 = X.C160377nX.A06     // Catch:{ IOException -> 0x003a }
            r0.Bsi(r1, r6, r2)     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0082 }
            goto L_0x005c
        L_0x003f:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0070
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x0082 }
            X.7nL r2 = X.C160267nL.A04     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0082 }
            if (r6 != 0) goto L_0x0053
            java.lang.String r0 = "null"
            r1.append(r0)     // Catch:{ IOException -> 0x0058 }
            goto L_0x0058
        L_0x0053:
            X.8qJ r0 = X.C160377nX.A03     // Catch:{ IOException -> 0x0058 }
            r0.Bsi(r1, r6, r2)     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0082 }
        L_0x005c:
            int r2 = X.AnonymousClass789.A00     // Catch:{ Exception -> 0x006e }
            X.7TE r0 = X.C159877mc.A02     // Catch:{ Exception -> 0x006e }
            X.7bN r1 = r0.A00(r5)     // Catch:{ Exception -> 0x006e }
            X.8Zu r0 = new X.8Zu     // Catch:{ Exception -> 0x006e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x006e }
            java.lang.Object r6 = r0.A0D(r3, r1)     // Catch:{ Exception -> 0x006e }
            return r6
        L_0x006e:
            r6 = 0
            return r6
        L_0x0070:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0082 }
            X.AnonymousClass6C9.A0y(r2, r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = " can not be converted to JSON"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)     // Catch:{ Exception -> 0x0082 }
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            X.6dM r0 = new X.6dM
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0089:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157247hz.A01(java.lang.Class, java.lang.Object):java.lang.Object");
    }
}
