package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2xV  reason: invalid class name and case insensitive filesystem */
public final class C59802xV {
    public final C56612sH A00;
    public final C54292oU A01;
    public final AnonymousClass33T A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass2HY A04;
    public final C55042ph A05;
    public final C42482Og A06;
    public final C44502Wh A07;
    public final C42492Oh A08;
    public final AnonymousClass2HZ A09;
    public final C183538qC A0A;

    public static final Object A00(Iterable iterable) {
        C162457s7.A0J(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.3RX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.3RX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.3RX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.3RX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.3RX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.3RY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.3RX} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0220 A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0224 A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0333 A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x033b A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0355 A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x035e A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03b6 A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b9 A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c8 A[Catch:{ all -> 0x050a }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C624134x r30) {
        /*
            r29 = this;
            r2 = r29
            r28 = r30
            X.35j r1 = X.C625135j.A00     // Catch:{ all -> 0x050a }
            X.1VX r7 = r2.A03     // Catch:{ all -> 0x050a }
            r0 = r28
            X.2w3 r8 = X.C625135j.A00(r7, r0)     // Catch:{ all -> 0x050a }
            if (r8 == 0) goto L_0x0532
            java.lang.Integer r0 = r1.A04(r7, r8)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0532
            int r21 = r0.intValue()     // Catch:{ all -> 0x050a }
            r6 = 0
            r15 = 2
            r0 = r21
            if (r0 != r15) goto L_0x0035
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A     // Catch:{ all -> 0x050a }
            r0.set(r15)     // Catch:{ all -> 0x050a }
            X.2ph r0 = r2.A05     // Catch:{ all -> 0x050a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x050a }
            r6 = 0
            r8 = r6
            r3 = r0
            r4 = r28
            r7 = r6
            r3.A01(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x050a }
            return
        L_0x0035:
            X.2HY r0 = r2.A04     // Catch:{ all -> 0x050a }
            X.1VX r14 = r0.A00     // Catch:{ all -> 0x050a }
            r0 = 1023(0x3ff, float:1.434E-42)
            X.2vE r5 = X.C58422vE.A02     // Catch:{ all -> 0x050a }
            boolean r0 = r14.A0Y(r5, r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x04f2
            r0 = 6174(0x181e, float:8.652E-42)
            boolean r0 = r14.A0Y(r5, r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x04f2
            r0 = r28
            X.2z0 r0 = r0.A1J     // Catch:{ all -> 0x050a }
            X.4uZ r1 = r0.A00     // Catch:{ all -> 0x050a }
            r3 = 1
            r0 = r21
            if (r0 != r3) goto L_0x0085
            r0 = 3176(0xc68, float:4.45E-42)
            boolean r0 = r14.A0Y(r5, r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x0085
            X.3RX r4 = X.AnonymousClass3RX.A04     // Catch:{ all -> 0x050a }
        L_0x0060:
            r9 = 1
            boolean r0 = X.C625135j.A02(r7, r8)     // Catch:{ all -> 0x050a }
            r3 = 0
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x050a }
            android.net.Uri r0 = com.whatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x00ef
            java.lang.String r1 = "cta_display_name"
            java.lang.String r23 = r0.getQueryParameter(r1)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = r8.A01     // Catch:{ all -> 0x050a }
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = "code_expiration_minutes"
            java.lang.String r1 = r3.getQueryParameter(r1)     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x00b8
            goto L_0x00b5
        L_0x0085:
            X.33T r0 = r2.A02     // Catch:{ all -> 0x050a }
            X.0Tx r0 = r0.A00     // Catch:{ all -> 0x050a }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x0092
            X.3RX r4 = X.AnonymousClass3RX.A03     // Catch:{ all -> 0x050a }
            goto L_0x0060
        L_0x0092:
            if (r1 == 0) goto L_0x00b3
            X.8qC r0 = r2.A0A     // Catch:{ all -> 0x050a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x050a }
            X.3Lb r0 = (X.C66363Lb) r0     // Catch:{ all -> 0x050a }
            X.1R1 r0 = r0.A04     // Catch:{ all -> 0x050a }
            X.2sa r0 = X.AnonymousClass1R1.A00(r1, r0)     // Catch:{ all -> 0x050a }
            long r9 = r0.A00()     // Catch:{ all -> 0x050a }
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x00b3
            X.3RX r4 = X.AnonymousClass3RX.A02     // Catch:{ all -> 0x050a }
            goto L_0x0060
        L_0x00b3:
            r4 = 0
            goto L_0x0060
        L_0x00b5:
            r26 = 10
            goto L_0x00bc
        L_0x00b8:
            long r26 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x050a }
        L_0x00bc:
            r1 = 5742(0x166e, float:8.046E-42)
            boolean r10 = r7.A0Y(r5, r1)     // Catch:{ all -> 0x050a }
            java.lang.String r3 = "signature_hash"
            java.lang.String r1 = "package_name"
            if (r10 == 0) goto L_0x0255
            java.lang.String r10 = r0.getQueryParameter(r1)     // Catch:{ all -> 0x050a }
            r11 = 44
            if (r10 == 0) goto L_0x0251
            char[] r1 = new char[r9]     // Catch:{ all -> 0x050a }
            r1[r6] = r11     // Catch:{ all -> 0x050a }
            java.util.List r24 = X.C175728Zm.A0O(r10, r1)     // Catch:{ all -> 0x050a }
        L_0x00da:
            java.lang.String r1 = r0.getQueryParameter(r3)     // Catch:{ all -> 0x050a }
            if (r1 == 0) goto L_0x026e
            char[] r0 = new char[r9]     // Catch:{ all -> 0x050a }
            r0[r6] = r11     // Catch:{ all -> 0x050a }
            java.util.List r25 = X.C175728Zm.A0O(r1, r0)     // Catch:{ all -> 0x050a }
        L_0x00e8:
            X.2mO r3 = new X.2mO     // Catch:{ all -> 0x050a }
            r22 = r3
            r22.<init>(r23, r24, r25, r26)     // Catch:{ all -> 0x050a }
        L_0x00ef:
            X.2Og r11 = r2.A06     // Catch:{ all -> 0x050a }
            if (r3 != 0) goto L_0x0122
            r1 = 0
            X.3d7 r0 = X.C72063d7.A00     // Catch:{ all -> 0x050a }
            X.2zC r11 = new X.2zC     // Catch:{ all -> 0x050a }
            r11.<init>(r1, r0, r0, r0)     // Catch:{ all -> 0x050a }
            X.3RY r10 = X.AnonymousClass3RY.A0A     // Catch:{ all -> 0x050a }
        L_0x00fd:
            java.lang.String r1 = r11.A00     // Catch:{ all -> 0x050a }
            r9 = r1
            if (r1 != 0) goto L_0x0272
            java.util.Set r0 = r11.A02     // Catch:{ all -> 0x050a }
            java.lang.Object r1 = A00(r0)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x0272
            java.util.Set r0 = r11.A03     // Catch:{ all -> 0x050a }
            java.lang.Object r1 = A00(r0)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x0272
            java.util.Set r0 = r11.A01     // Catch:{ all -> 0x050a }
            java.lang.Object r1 = A00(r0)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x0272
            goto L_0x027b
        L_0x0122:
            java.util.List r0 = r3.A02     // Catch:{ all -> 0x050a }
            r22 = r0
            java.util.Set r20 = X.C73723fy.A0P(r22)     // Catch:{ all -> 0x050a }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x050a }
            java.util.Iterator r12 = r20.iterator()     // Catch:{ all -> 0x050a }
        L_0x0132:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0150
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x050a }
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            X.2Oh r0 = r11.A02     // Catch:{ all -> 0x050a }
            X.C162457s7.A0J(r1, r6)     // Catch:{ all -> 0x050a }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x050a }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0132
            r10.add(r9)     // Catch:{ all -> 0x050a }
            goto L_0x0132
        L_0x0150:
            java.util.Set r19 = X.C73723fy.A0P(r10)     // Catch:{ all -> 0x050a }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x050a }
            java.util.Iterator r18 = r19.iterator()     // Catch:{ all -> 0x050a }
        L_0x015c:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r9 = r18.next()     // Catch:{ all -> 0x050a }
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x050a }
            X.2Oh r0 = r11.A02     // Catch:{ all -> 0x050a }
            X.C162457s7.A0J(r1, r6)     // Catch:{ all -> 0x050a }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x050a }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x050a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0192
            long r0 = r0.longValue()     // Catch:{ all -> 0x050a }
        L_0x0180:
            long r16 = r16 - r0
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x050a }
            long r0 = r3.A00     // Catch:{ all -> 0x050a }
            long r12 = r12.toMillis(r0)     // Catch:{ all -> 0x050a }
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x015c
            r10.add(r9)     // Catch:{ all -> 0x050a }
            goto L_0x015c
        L_0x0192:
            r0 = 0
            goto L_0x0180
        L_0x0195:
            java.util.Set r10 = X.C73723fy.A0P(r10)     // Catch:{ all -> 0x050a }
            java.lang.Object r9 = A00(r10)     // Catch:{ all -> 0x050a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x050a }
            if (r9 == 0) goto L_0x01f0
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x050a }
            java.util.Iterator r17 = r22.iterator()     // Catch:{ all -> 0x050a }
            r16 = 0
        L_0x01ab:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r13 = r17.next()     // Catch:{ all -> 0x050a }
            int r1 = r16 + 1
            if (r16 >= 0) goto L_0x01be
            java.lang.RuntimeException r0 = X.C18280x3.A0X()     // Catch:{ all -> 0x050a }
            throw r0     // Catch:{ all -> 0x050a }
        L_0x01be:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x050a }
            X.C18280x3.A17(r13, r9, r0, r12)     // Catch:{ all -> 0x050a }
            r16 = r1
            goto L_0x01ab
        L_0x01c8:
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x050a }
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x050a }
        L_0x01d0:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x01e6
            int r12 = X.C18280x3.A05(r13)     // Catch:{ all -> 0x050a }
            java.util.List r0 = r3.A03     // Catch:{ all -> 0x050a }
            java.lang.Object r0 = X.C73723fy.A06(r0, r12)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x01d0
            r1.add(r0)     // Catch:{ all -> 0x050a }
            goto L_0x01d0
        L_0x01e6:
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x01f2
        L_0x01f0:
            r9 = 0
            goto L_0x0210
        L_0x01f2:
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x050a }
        L_0x01f6:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x01f0
            java.lang.String r12 = X.AnonymousClass001.A0m(r13)     // Catch:{ all -> 0x050a }
            X.2Wh r1 = r11.A01     // Catch:{ all -> 0x050a }
            r0 = 1
            X.C162457s7.A0J(r12, r0)     // Catch:{ all -> 0x050a }
            java.util.ArrayList r0 = r1.A00(r9)     // Catch:{ all -> 0x050a }
            boolean r0 = r0.contains(r12)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x01f6
        L_0x0210:
            X.2zC r11 = new X.2zC     // Catch:{ all -> 0x050a }
            r1 = r20
            r0 = r19
            r11.<init>(r9, r1, r0, r10)     // Catch:{ all -> 0x050a }
            r9 = 1
            boolean r0 = r22.isEmpty()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0224
            X.3RY r10 = X.AnonymousClass3RY.A09     // Catch:{ all -> 0x050a }
            goto L_0x00fd
        L_0x0224:
            java.util.Set r0 = r11.A03     // Catch:{ all -> 0x050a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0230
            X.3RY r10 = X.AnonymousClass3RY.A08     // Catch:{ all -> 0x050a }
            goto L_0x00fd
        L_0x0230:
            java.util.Set r1 = r11.A02     // Catch:{ all -> 0x050a }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x023c
            X.3RY r10 = X.AnonymousClass3RY.A0B     // Catch:{ all -> 0x050a }
            goto L_0x00fd
        L_0x023c:
            int r0 = r1.size()     // Catch:{ all -> 0x050a }
            if (r0 <= r9) goto L_0x0246
            X.3RY r10 = X.AnonymousClass3RY.A05     // Catch:{ all -> 0x050a }
            goto L_0x00fd
        L_0x0246:
            java.lang.String r0 = r11.A00     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x024e
            X.3RY r10 = X.AnonymousClass3RY.A07     // Catch:{ all -> 0x050a }
            goto L_0x00fd
        L_0x024e:
            r10 = 0
            goto L_0x00fd
        L_0x0251:
            X.3d3 r24 = X.C72023d3.A00     // Catch:{ all -> 0x050a }
            goto L_0x00da
        L_0x0255:
            java.lang.String r1 = r0.getQueryParameter(r1)     // Catch:{ all -> 0x050a }
            java.lang.String r0 = r0.getQueryParameter(r3)     // Catch:{ all -> 0x050a }
            if (r1 == 0) goto L_0x0264
            java.util.List r24 = X.C18290x4.A12(r1)     // Catch:{ all -> 0x050a }
            goto L_0x0266
        L_0x0264:
            X.3d3 r24 = X.C72023d3.A00     // Catch:{ all -> 0x050a }
        L_0x0266:
            if (r0 == 0) goto L_0x026e
            java.util.List r25 = X.C18290x4.A12(r0)     // Catch:{ all -> 0x050a }
            goto L_0x00e8
        L_0x026e:
            X.3d3 r25 = X.C72023d3.A00     // Catch:{ all -> 0x050a }
            goto L_0x00e8
        L_0x0272:
            X.2Oh r0 = r2.A08     // Catch:{ all -> 0x050a }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x050a }
            java.lang.String r18 = X.C18310x6.A0o(r1, r0)     // Catch:{ all -> 0x050a }
            goto L_0x027d
        L_0x027b:
            r18 = 0
        L_0x027d:
            r1 = r9
            if (r9 != 0) goto L_0x02a1
            java.util.Set r0 = r11.A02     // Catch:{ all -> 0x050a }
            java.lang.Object r1 = A00(r0)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x02a1
            java.util.Set r0 = r11.A03     // Catch:{ all -> 0x050a }
            java.lang.Object r1 = A00(r0)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x02a1
            java.util.Set r0 = r11.A01     // Catch:{ all -> 0x050a }
            java.lang.Object r1 = A00(r0)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x050a }
            if (r1 != 0) goto L_0x02a1
            r17 = 0
            goto L_0x02bb
        L_0x02a1:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x050a }
            X.2Oh r0 = r2.A08     // Catch:{ all -> 0x050a }
            java.util.Map r0 = r0.A02     // Catch:{ all -> 0x050a }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x050a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x02c6
            long r12 = r0.longValue()     // Catch:{ all -> 0x050a }
        L_0x02b5:
            r0 = r16
            java.lang.Long r17 = X.C18310x6.A0f(r0, r12)     // Catch:{ all -> 0x050a }
        L_0x02bb:
            r0 = 3176(0xc68, float:4.45E-42)
            boolean r0 = r14.A0Y(r5, r0)     // Catch:{ all -> 0x050a }
            r1 = 0
            r12 = 1
            if (r0 == 0) goto L_0x02d7
            goto L_0x02c9
        L_0x02c6:
            r12 = 0
            goto L_0x02b5
        L_0x02c9:
            r0 = r21
            if (r0 != r12) goto L_0x02d7
            if (r10 != 0) goto L_0x02d5
            if (r3 != 0) goto L_0x02d2
            goto L_0x02e4
        L_0x02d2:
            if (r9 != 0) goto L_0x02e9
            goto L_0x02df
        L_0x02d5:
            r14 = r10
            goto L_0x0335
        L_0x02d7:
            r14 = r1
            if (r10 != 0) goto L_0x0335
            if (r3 == 0) goto L_0x02e6
            if (r9 != 0) goto L_0x030f
            goto L_0x02e1
        L_0x02df:
            X.3RY r14 = X.AnonymousClass3RY.A09     // Catch:{ all -> 0x050a }
        L_0x02e1:
            X.3RY r10 = X.AnonymousClass3RY.A09     // Catch:{ all -> 0x050a }
            goto L_0x0335
        L_0x02e4:
            X.3RY r14 = X.AnonymousClass3RY.A0A     // Catch:{ all -> 0x050a }
        L_0x02e6:
            X.3RY r10 = X.AnonymousClass3RY.A0A     // Catch:{ all -> 0x050a }
            goto L_0x0335
        L_0x02e9:
            X.2oU r0 = r2.A01     // Catch:{ all -> 0x050a }
            android.content.Context r13 = r0.A00     // Catch:{ all -> 0x050a }
            X.C162457s7.A0D(r13)     // Catch:{ all -> 0x050a }
            android.content.Intent r10 = X.C18320x8.A07()     // Catch:{ all -> 0x050a }
            r10.setPackage(r9)     // Catch:{ all -> 0x050a }
            java.lang.String r0 = "com.whatsapp.otp.OTP_RETRIEVED"
            r10.setAction(r0)     // Catch:{ all -> 0x050a }
            android.content.pm.PackageManager r0 = r13.getPackageManager()     // Catch:{ all -> 0x050a }
            java.util.List r0 = r0.queryBroadcastReceivers(r10, r6)     // Catch:{ all -> 0x050a }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x050a }
            boolean r0 = X.C18310x6.A1X(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x0399
            X.3RY r14 = X.AnonymousClass3RW.A01     // Catch:{ all -> 0x050a }
        L_0x030f:
            X.2oU r0 = r2.A01     // Catch:{ all -> 0x050a }
            android.content.Context r13 = r0.A00     // Catch:{ all -> 0x050a }
            X.C162457s7.A0D(r13)     // Catch:{ all -> 0x050a }
            android.content.Intent r10 = X.C18320x8.A07()     // Catch:{ all -> 0x050a }
            r10.setPackage(r9)     // Catch:{ all -> 0x050a }
            java.lang.String r0 = "com.whatsapp.otp.OTP_RETRIEVED"
            r10.setAction(r0)     // Catch:{ all -> 0x050a }
            android.content.pm.PackageManager r0 = r13.getPackageManager()     // Catch:{ all -> 0x050a }
            java.util.List r0 = r0.queryIntentActivities(r10, r6)     // Catch:{ all -> 0x050a }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x050a }
            boolean r0 = X.C18310x6.A1X(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x033b
            X.3RY r10 = X.AnonymousClass3RV.A01     // Catch:{ all -> 0x050a }
        L_0x0335:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A     // Catch:{ all -> 0x050a }
            r0.set(r15)     // Catch:{ all -> 0x050a }
            goto L_0x0353
        L_0x033b:
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x0342
            X.3RY r10 = X.AnonymousClass3RV.A00     // Catch:{ all -> 0x050a }
            goto L_0x0335
        L_0x0342:
            r10 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A     // Catch:{ all -> 0x050a }
            r0.set(r12)     // Catch:{ all -> 0x050a }
            r0 = 5742(0x166e, float:8.046E-42)
            boolean r0 = r7.A0Y(r5, r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0352
            r8.A02 = r9     // Catch:{ all -> 0x050a }
        L_0x0352:
            r6 = 1
        L_0x0353:
            if (r14 == 0) goto L_0x0356
            r10 = r14
        L_0x0356:
            X.2ph r3 = r2.A05     // Catch:{ all -> 0x050a }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x050a }
            if (r10 == 0) goto L_0x038d
            X.3RY r0 = X.AnonymousClass3RY.A06     // Catch:{ all -> 0x050a }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0368
            r0 = 7
            goto L_0x0386
        L_0x0368:
            X.3RY r0 = X.AnonymousClass3RY.A0A     // Catch:{ all -> 0x050a }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0373
            r0 = 8
            goto L_0x0386
        L_0x0373:
            X.3RY r0 = X.AnonymousClass3RY.A09     // Catch:{ all -> 0x050a }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x037d
            r0 = 5
            goto L_0x0386
        L_0x037d:
            X.3RY r0 = X.AnonymousClass3RV.A00     // Catch:{ all -> 0x050a }
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x038b
            r0 = 6
        L_0x0386:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x050a }
            goto L_0x038d
        L_0x038b:
            java.lang.Integer r1 = r10.A00     // Catch:{ all -> 0x050a }
        L_0x038d:
            r12 = r3
            r13 = r28
            r15 = r1
            r16 = r17
            r17 = r18
            r12.A01(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x050a }
            goto L_0x03b7
        L_0x0399:
            r3 = 3
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A     // Catch:{ all -> 0x050a }
            r0.set(r3)     // Catch:{ all -> 0x050a }
            r0 = 5742(0x166e, float:8.046E-42)
            boolean r0 = r7.A0Y(r5, r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x03a9
            r8.A02 = r9     // Catch:{ all -> 0x050a }
        L_0x03a9:
            X.2ph r0 = r2.A05     // Catch:{ all -> 0x050a }
            r16 = r1
            r13 = r0
            r14 = r28
            r15 = r1
            r13.A01(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x050a }
        L_0x03b4:
            if (r4 == 0) goto L_0x0532
            goto L_0x03ba
        L_0x03b7:
            if (r10 == 0) goto L_0x03b4
            r4 = r10
        L_0x03ba:
            r0 = 3460(0xd84, float:4.848E-42)
            boolean r0 = r7.A0Y(r5, r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0532
            boolean r0 = r4.BCy()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0532
            boolean r0 = r4.BCk()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x046e
            java.lang.String r0 = android.os.Build.BRAND     // Catch:{ all -> 0x050a }
            java.lang.String r3 = "generic"
            boolean r0 = r0.startsWith(r3)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x03e0
            java.lang.String r0 = android.os.Build.DEVICE     // Catch:{ all -> 0x050a }
            boolean r0 = r0.startsWith(r3)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
        L_0x03e0:
            java.lang.String r1 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x050a }
            boolean r0 = r1.startsWith(r3)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "unknown"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ all -> 0x050a }
            java.lang.String r0 = "goldfish"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "ranchu"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x050a }
            java.lang.String r3 = "google_sdk"
            boolean r0 = r1.contains(r3)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "Emulator"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "Android SDK built for x86"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x050a }
            java.lang.String r0 = "Genymotion"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch:{ all -> 0x050a }
            java.lang.String r0 = "sdk_google"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            boolean r0 = r1.contains(r3)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "sdk"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "sdk_gphone64_arm64"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "vbox86p"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "emulator"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 != 0) goto L_0x046e
            java.lang.String r0 = "simulator"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0532
        L_0x046e:
            r6 = 0
            if (r9 == 0) goto L_0x0472
            goto L_0x0485
        L_0x0472:
            java.util.Set r1 = r11.A02     // Catch:{ all -> 0x050a }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0489
            java.util.Set r1 = r11.A03     // Catch:{ all -> 0x050a }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0489
            java.util.Set r1 = r11.A01     // Catch:{ all -> 0x050a }
            goto L_0x0489
        L_0x0485:
            java.util.List r1 = X.C18290x4.A12(r9)     // Catch:{ all -> 0x050a }
        L_0x0489:
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x050a }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x050a }
        L_0x048f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x0532
            java.lang.String r8 = X.AnonymousClass001.A0m(r9)     // Catch:{ all -> 0x050a }
            java.lang.String r7 = r4.B6m()     // Catch:{ all -> 0x050a }
            X.3RY r0 = X.AnonymousClass3RY.A07     // Catch:{ all -> 0x050a }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x050a }
            if (r0 == 0) goto L_0x04c4
            X.2Wh r0 = r2.A07     // Catch:{ all -> 0x050a }
            java.util.ArrayList r1 = r0.A00(r8)     // Catch:{ all -> 0x050a }
            java.lang.String r0 = ", "
            java.lang.String r5 = X.C73723fy.A0A(r0, r1, r6)     // Catch:{ all -> 0x050a }
            if (r7 == 0) goto L_0x04f0
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x050a }
            r0 = 0
            r1[r0] = r5     // Catch:{ all -> 0x050a }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ all -> 0x050a }
            java.lang.String r7 = java.lang.String.format(r7, r0)     // Catch:{ all -> 0x050a }
            X.C162457s7.A0D(r7)     // Catch:{ all -> 0x050a }
        L_0x04c4:
            X.2oU r0 = r2.A01     // Catch:{ all -> 0x050a }
            android.content.Context r5 = r0.A00     // Catch:{ all -> 0x050a }
            X.C162457s7.A0D(r5)     // Catch:{ all -> 0x050a }
            r0 = 2
            X.C162457s7.A0J(r8, r0)     // Catch:{ all -> 0x050a }
            android.content.Intent r3 = X.C18320x8.A07()     // Catch:{ all -> 0x050a }
            r3.setPackage(r8)     // Catch:{ all -> 0x050a }
            java.lang.String r0 = "com.whatsapp.otp.OTP_ERROR"
            r3.setAction(r0)     // Catch:{ all -> 0x050a }
            java.lang.String r1 = "error"
            java.lang.String r0 = r4.B8w()     // Catch:{ all -> 0x050a }
            r3.putExtra(r1, r0)     // Catch:{ all -> 0x050a }
            java.lang.String r0 = "error_message"
            r3.putExtra(r0, r7)     // Catch:{ all -> 0x050a }
            X.C385027w.A00(r5, r3)     // Catch:{ all -> 0x050a }
            r5.sendBroadcast(r3)     // Catch:{ all -> 0x050a }
            goto L_0x048f
        L_0x04f0:
            r7 = r6
            goto L_0x04c4
        L_0x04f2:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0A     // Catch:{ all -> 0x050a }
            r0.set(r15)     // Catch:{ all -> 0x050a }
            X.2ph r0 = r2.A05     // Catch:{ all -> 0x050a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x050a }
            java.lang.Integer r6 = X.C18300x5.A0Y()     // Catch:{ all -> 0x050a }
            r7 = 0
            r3 = r0
            r4 = r28
            r8 = r7
            r3.A01(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x050a }
            return
        L_0x050a:
            r3 = move-exception
            X.1VX r1 = r2.A03
            r0 = r28
            X.2w3 r0 = X.C625135j.A00(r1, r0)
            if (r0 == 0) goto L_0x052d
            r1 = 2
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0A
            r0.set(r1)
            X.2ph r0 = r2.A05
            java.lang.Integer r6 = X.C18290x4.A0Z()
            java.lang.Integer r7 = X.C18300x5.A0Y()
            r8 = 0
            r4 = r0
            r5 = r28
            r9 = r8
            r4.A01(r5, r6, r7, r8, r9)
        L_0x052d:
            java.lang.String r0 = "Unexpected error while trying to parse OTP msg"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x0532:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59802xV.A01(X.34x):void");
    }

    public C59802xV(C56612sH r2, C54292oU r3, AnonymousClass33T r4, AnonymousClass1VX r5, AnonymousClass2HY r6, C55042ph r7, C42482Og r8, C44502Wh r9, C42492Oh r10, AnonymousClass2HZ r11, C183538qC r12) {
        C18260x0.A0f(r2, r5, r3, r11, r7);
        C18260x0.A0g(r10, r8, r6, r4, r9);
        C162457s7.A0J(r12, 11);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
        this.A09 = r11;
        this.A05 = r7;
        this.A08 = r10;
        this.A06 = r8;
        this.A04 = r6;
        this.A02 = r4;
        this.A07 = r9;
        this.A0A = r12;
    }
}
