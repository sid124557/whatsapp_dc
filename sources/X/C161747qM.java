package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7qM  reason: invalid class name and case insensitive filesystem */
public final class C161747qM {
    public final C69263Wi A00;
    public final C64773Ex A01;
    public final C29421in A02;
    public final C56332ro A03;
    public final C56612sH A04;
    public final C28871hu A05;
    public final C56982ss A06;
    public final C56652sL A07;
    public final C53942nv A08;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C152357Yo A02(X.AnonymousClass1RL r9, X.C180008k4 r10, boolean r11) {
        /*
            r3 = 0
            if (r11 == 0) goto L_0x0075
            if (r9 == 0) goto L_0x007a
            long r0 = r9.A03
        L_0x0007:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x000b:
            r1 = -1
            if (r0 == 0) goto L_0x0072
            long r7 = r0.longValue()
        L_0x0013:
            if (r11 == 0) goto L_0x006b
            if (r9 == 0) goto L_0x0070
            java.lang.String r6 = r9.A0J
        L_0x0019:
            if (r10 != 0) goto L_0x0022
            r4 = r7
        L_0x001c:
            X.7Yo r3 = new X.7Yo
            r3.<init>(r4, r6, r7)
            return r3
        L_0x0022:
            boolean r0 = r10 instanceof X.C139536sD
            if (r0 == 0) goto L_0x004f
            X.6sD r10 = (X.C139536sD) r10
            java.lang.String r0 = r10.A01
            X.C162457s7.A0D(r0)
            java.lang.Long r0 = X.C829745q.A07(r0)
            if (r0 == 0) goto L_0x004c
            long r4 = r0.longValue()
        L_0x0037:
            java.lang.String r3 = r10.A00
        L_0x0039:
            if (r3 == 0) goto L_0x0046
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0046
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            r1 = r7
        L_0x0046:
            r6 = r3
            r7 = r1
            goto L_0x001c
        L_0x0049:
            r1 = 0
            goto L_0x0046
        L_0x004c:
            r4 = -1
            goto L_0x0037
        L_0x004f:
            boolean r0 = r10 instanceof X.C139526sC
            if (r0 == 0) goto L_0x0069
            X.6sC r10 = (X.C139526sC) r10
            java.lang.String r0 = r10.A00
            X.C162457s7.A0D(r0)
            java.lang.Long r0 = X.C829745q.A07(r0)
            if (r0 == 0) goto L_0x0066
            long r4 = r0.longValue()
        L_0x0064:
            r3 = r6
            goto L_0x0039
        L_0x0066:
            r4 = -1
            goto L_0x0064
        L_0x0069:
            r4 = r7
            goto L_0x0046
        L_0x006b:
            if (r9 == 0) goto L_0x0070
            java.lang.String r6 = r9.A0I
            goto L_0x0019
        L_0x0070:
            r6 = r3
            goto L_0x0019
        L_0x0072:
            r7 = -1
            goto L_0x0013
        L_0x0075:
            if (r9 == 0) goto L_0x007a
            long r0 = r9.A04
            goto L_0x0007
        L_0x007a:
            r0 = r3
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161747qM.A02(X.1RL, X.8k4, boolean):X.7Yo");
    }

    public static final C180008k4 A03(C138666qn r4, String str) {
        Object obj;
        String str2;
        String str3;
        String str4;
        C139516sB r2;
        C139526sC r1;
        C139536sD r12;
        if (r4 == null) {
            return null;
        }
        Iterator it = ((Iterable) r4.A00).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C180008k4 r22 = (C180008k4) ((C138666qn) obj).A00;
            if (!(r22 instanceof C139536sD) || (r12 = (C139536sD) r22) == null) {
                str2 = null;
            } else {
                str2 = r12.A02;
            }
            if (!C162457s7.A0P(str2, str)) {
                if (!(r22 instanceof C139526sC) || (r1 = (C139526sC) r22) == null) {
                    str3 = null;
                } else {
                    str3 = r1.A01;
                }
                if (!C162457s7.A0P(str3, str)) {
                    if (!(r22 instanceof C139516sB) || (r2 = (C139516sB) r22) == null) {
                        str4 = null;
                    } else {
                        str4 = r2.A00;
                    }
                    if (C162457s7.A0P(str4, str)) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        C138666qn r3 = (C138666qn) obj;
        if (r3 != null) {
            return (C180008k4) r3.A00;
        }
        return null;
    }

    public final void A06(C95814uZ r4) {
        this.A05.A0A(r4, false);
        this.A00.A0S(new C70113Zy(this, 38, r4));
    }

    public static final C372821q A00(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1219769240) {
                if (hashCode != 92668751) {
                    if (hashCode == 106164915 && str.equals("owner")) {
                        return C372821q.OWNER;
                    }
                } else if (str.equals("admin")) {
                    return C372821q.ADMIN;
                }
            } else if (str.equals("subscriber")) {
                return C372821q.SUBSCRIBED;
            }
        }
        return C372821q.GUEST;
    }

    public static final C372321l A01(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1661628965) {
            if (hashCode != -1422950650) {
                if (hashCode != 1602333098 || !str.equals("geosuspended")) {
                    return null;
                }
                return C372321l.GEOSUSPENDED;
            } else if (str.equals("active")) {
                return C372321l.NOT_ENFORCED;
            } else {
                return null;
            }
        } else if (str.equals("suspended")) {
            return C372321l.SUSPENDED;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r6 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r7 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r6 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r6 == null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        r17 = java.lang.Long.parseLong(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        r6 = r12.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r6 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r6 = (java.lang.Number) r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r6 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r6 = java.lang.Long.valueOf(r9.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        r7 = r12.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        if (r7 == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        r8 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r8 == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r8.equals("public") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r11 = X.C371421c.PUBLIC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        r7 = r12.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r7 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        r7 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a4, code lost:
        if (r7 == null) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        r15 = A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        r7 = r12.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        if (r7 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ae, code lost:
        r8 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if (r8 == null) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (r8.equals("verified") == false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        r10 = X.C371621e.VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r7 = r12.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        if (r7 == null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        r8 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
        if (r8 == null) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c4, code lost:
        r16 = r8.equals("on");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ca, code lost:
        r7 = r12.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cc, code lost:
        if (r7 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ce, code lost:
        r7 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d0, code lost:
        if (r7 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d2, code lost:
        r8 = A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r8 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d8, code lost:
        r8 = r9.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        r7 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00dc, code lost:
        if (r7 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00de, code lost:
        r14 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e0, code lost:
        if (r14 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e2, code lost:
        r14 = r9.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e4, code lost:
        r7 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e6, code lost:
        if (r7 == null) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e8, code lost:
        r12 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ea, code lost:
        if (r12 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ec, code lost:
        r12 = r9.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ee, code lost:
        r35 = r13.A02;
        r51 = r6.longValue();
        r29 = r9.A00;
        r27 = r9.A0O;
        r26 = r9.A0Q;
        r25 = r9.A0M;
        r7 = r9.A09;
        r24 = r9.A06;
        r31 = r9.A0D;
        r23 = r9.A0N;
        X.C162457s7.A0J(r15, 14);
        X.C162457s7.A0J(r11, 15);
        X.C162457s7.A0J(r10, 16);
        X.C162457s7.A0J(r8, 20);
        X.C162457s7.A0J(r7, 22);
        r54 = r25;
        r56 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0165, code lost:
        return new X.AnonymousClass1RL(r24, r9, r15, r9.A08, r7, r11, r8, r10, r31, r19, r21, r20, r35, r12, r14, r26, r29, r17, r4, r0, r2, r27, r51, r16, r54, false, r56);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0166, code lost:
        r16 = r9.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016c, code lost:
        r10 = X.C371621e.NOT_VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        r10 = r9.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0174, code lost:
        r15 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0178, code lost:
        r11 = X.C371421c.PRIVATE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017c, code lost:
        r11 = r9.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0180, code lost:
        r17 = r9.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1RL A04(X.AnonymousClass1RL r58, X.C95804uY r59, X.C138776qy r60) {
        /*
            r57 = this;
            r12 = r60
            X.6qn r1 = r12.A06
            java.lang.String r0 = "image"
            X.8k4 r2 = A03(r1, r0)
            java.lang.String r0 = "preview"
            X.8k4 r1 = A03(r1, r0)
            r0 = 1
            r9 = r58
            X.7Yo r7 = A02(r9, r2, r0)
            r6 = 0
            X.7Yo r13 = A02(r9, r1, r6)
            r21 = 0
            r20 = 0
            r2 = r57
            r3 = r59
            r15 = r9
            r16 = r21
            r17 = r3
            r18 = r7
            r19 = r13
            r14 = r2
            r14.A05(r15, r16, r17, r18, r19)
            X.6qn r0 = r12.A04
            if (r0 == 0) goto L_0x018a
            java.lang.Object r1 = r0.A00
            X.6qt r1 = (X.C138726qt) r1
            if (r1 == 0) goto L_0x0186
            java.lang.String r0 = r1.A01
            r21 = r0
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0186
            long r4 = java.lang.Long.parseLong(r0)
        L_0x0047:
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x0052
            r9.A0K = r6
            X.2nv r0 = r2.A08
            r0.A02(r3)
        L_0x0052:
            long r2 = r13.A01
            long r0 = r7.A01
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = r7.A02
            r20 = r6
        L_0x005e:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            r0 = -1
        L_0x0064:
            X.56P r7 = r12.A02
            if (r7 == 0) goto L_0x006e
            java.lang.String r6 = r7.A02
            r19 = r6
            if (r6 != 0) goto L_0x0074
        L_0x006e:
            java.lang.String r6 = r9.A0H
            r19 = r6
            if (r7 == 0) goto L_0x0180
        L_0x0074:
            java.lang.String r6 = r7.A03
            if (r6 == 0) goto L_0x0180
            long r17 = java.lang.Long.parseLong(r6)
        L_0x007c:
            X.1vs r6 = r12.A07
            if (r6 == 0) goto L_0x0086
            java.lang.Object r6 = r6.A00
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 != 0) goto L_0x008c
        L_0x0086:
            long r6 = r9.A05
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x008c:
            X.6r7 r7 = r12.A0A
            if (r7 == 0) goto L_0x017c
            java.lang.String r8 = r7.A00
            if (r8 == 0) goto L_0x017c
            java.lang.String r7 = "public"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0178
            X.21c r11 = X.C371421c.PUBLIC
        L_0x009e:
            X.1w7 r7 = r12.A08
            if (r7 == 0) goto L_0x0174
            java.lang.String r7 = r7.A00
            if (r7 == 0) goto L_0x0174
            X.21q r15 = A00(r7)
        L_0x00aa:
            X.6r9 r7 = r12.A0C
            if (r7 == 0) goto L_0x0170
            java.lang.String r8 = r7.A00
            if (r8 == 0) goto L_0x0170
            java.lang.String r7 = "verified"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x016c
            X.21e r10 = X.C371621e.VERIFIED
        L_0x00bc:
            X.6r6 r7 = r12.A09
            if (r7 == 0) goto L_0x0166
            java.lang.String r8 = r7.A00
            if (r8 == 0) goto L_0x0166
            java.lang.String r7 = "on"
            boolean r16 = r8.equals(r7)
        L_0x00ca:
            X.6r8 r7 = r12.A0B
            if (r7 == 0) goto L_0x00d8
            java.lang.String r7 = r7.A00
            if (r7 == 0) goto L_0x00d8
            X.21l r8 = A01(r7)
            if (r8 != 0) goto L_0x00da
        L_0x00d8:
            X.21l r8 = r9.A0B
        L_0x00da:
            X.1vq r7 = r12.A01
            if (r7 == 0) goto L_0x00e2
            java.lang.String r14 = r7.A00
            if (r14 != 0) goto L_0x00e4
        L_0x00e2:
            java.lang.String r14 = r9.A0G
        L_0x00e4:
            X.1vq r7 = r12.A00
            if (r7 == 0) goto L_0x00ec
            java.lang.String r12 = r7.A00
            if (r12 != 0) goto L_0x00ee
        L_0x00ec:
            java.lang.String r12 = r9.A0F
        L_0x00ee:
            java.lang.String r7 = r13.A02
            r35 = r7
            long r51 = r6.longValue()
            long r6 = r9.A00
            r29 = r6
            long r6 = r9.A0O
            r27 = r6
            java.util.List r6 = r9.A0Q
            r26 = r6
            boolean r6 = r9.A0M
            r25 = r6
            X.21r r7 = r9.A09
            X.6aY r6 = r9.A06
            r24 = r6
            java.lang.Long r6 = r9.A0D
            r31 = r6
            boolean r6 = r9.A0N
            r23 = r6
            X.599 r6 = r9.A08
            r13 = r6
            r6 = 14
            X.C162457s7.A0J(r15, r6)
            r6 = 15
            X.C162457s7.A0J(r11, r6)
            r6 = 16
            X.C162457s7.A0J(r10, r6)
            r6 = 20
            X.C162457s7.A0J(r8, r6)
            r6 = 22
            X.C162457s7.A0J(r7, r6)
            r55 = 0
            X.1RL r22 = new X.1RL
            r37 = r14
            r38 = r26
            r39 = r29
            r41 = r17
            r43 = r4
            r45 = r0
            r47 = r2
            r49 = r27
            r53 = r16
            r54 = r25
            r56 = r23
            r23 = r24
            r24 = r9
            r25 = r15
            r26 = r13
            r27 = r7
            r28 = r11
            r29 = r8
            r30 = r10
            r32 = r19
            r33 = r21
            r34 = r20
            r36 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r47, r49, r51, r53, r54, r55, r56)
            return r22
        L_0x0166:
            boolean r7 = r9.A0L
            r16 = r7
            goto L_0x00ca
        L_0x016c:
            X.21e r10 = X.C371621e.NOT_VERIFIED
            goto L_0x00bc
        L_0x0170:
            X.21e r10 = r9.A0C
            goto L_0x00bc
        L_0x0174:
            X.21q r15 = r9.A07
            goto L_0x00aa
        L_0x0178:
            X.21c r11 = X.C371421c.PRIVATE
            goto L_0x009e
        L_0x017c:
            X.21c r11 = r9.A0A
            goto L_0x009e
        L_0x0180:
            long r6 = r9.A02
            r17 = r6
            goto L_0x007c
        L_0x0186:
            r4 = 0
            goto L_0x0047
        L_0x018a:
            java.lang.String r0 = r9.A0E
            r21 = r0
            long r4 = r9.A01
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161747qM.A04(X.1RL, X.4uY, X.6qy):X.1RL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r2 != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r4.A06 == ((int) (r0 / com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS))) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r12.A00 != -1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r4.A05 == ((int) (r0 / com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS))) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass1RL r20, X.AnonymousClass1RL r21, X.C95804uY r22, X.C152357Yo r23, X.C152357Yo r24) {
        /*
            r19 = this;
            r1 = r20
            r9 = 0
            r6 = r19
            X.3Ex r5 = r6.A01
            r0 = r22
            X.3ZH r4 = r5.A07(r0)
            if (r4 == 0) goto L_0x006f
            if (r20 != 0) goto L_0x0072
            r1 = r21
            if (r21 != 0) goto L_0x0072
            int r0 = r4.A05
            long r2 = (long) r0
            int r0 = r4.A06
            long r7 = (long) r0
        L_0x001b:
            r11 = r23
            long r0 = r11.A01
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r16 = 1
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0030
            int r3 = r4.A05
            long r0 = r0 / r17
            int r2 = (int) r0
            r15 = 1
            if (r3 != r2) goto L_0x0031
        L_0x0030:
            r15 = 0
        L_0x0031:
            int r10 = r4.A05
            r13 = -1
            if (r10 <= 0) goto L_0x003e
            long r0 = r11.A00
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            r11 = 1
            if (r2 == 0) goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            r12 = r24
            long r0 = r12.A01
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x004f
            int r3 = r4.A06
            long r0 = r0 / r17
            int r2 = (int) r0
            r7 = 1
            if (r3 != r2) goto L_0x0050
        L_0x004f:
            r7 = 0
        L_0x0050:
            int r3 = r4.A06
            if (r3 <= 0) goto L_0x005b
            long r1 = r12.A00
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            if (r15 == 0) goto L_0x0060
            if (r10 != 0) goto L_0x0064
        L_0x0060:
            if (r7 == 0) goto L_0x0070
            if (r3 == 0) goto L_0x0070
        L_0x0064:
            r0 = 1
        L_0x0065:
            if (r11 != 0) goto L_0x006b
            if (r1 != 0) goto L_0x006b
            r16 = 0
        L_0x006b:
            if (r0 != 0) goto L_0x0077
            if (r16 != 0) goto L_0x008f
        L_0x006f:
            return
        L_0x0070:
            r0 = 0
            goto L_0x0065
        L_0x0072:
            long r2 = r1.A03
            long r7 = r1.A04
            goto L_0x001b
        L_0x0077:
            if (r16 != 0) goto L_0x008f
            r4.A06 = r9
            r4.A05 = r9
        L_0x007d:
            long r0 = java.lang.System.currentTimeMillis()
            r4.A0C = r0
            r5.A0P(r4)
            X.2ro r0 = r6.A03
            r0.A03(r4)
            r0.A04(r4)
            return
        L_0x008f:
            r0 = -1
            r4.A06 = r0
            r4.A05 = r0
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161747qM.A05(X.1RL, X.1RL, X.4uY, X.7Yo, X.7Yo):void");
    }

    public C161747qM(C69263Wi r2, C64773Ex r3, C29421in r4, C56332ro r5, C56612sH r6, C28871hu r7, C56982ss r8, C56652sL r9, C53942nv r10) {
        C18260x0.A0f(r6, r2, r8, r7, r3);
        C18260x0.A0W(r9, r4, r5);
        C162457s7.A0J(r10, 9);
        this.A04 = r6;
        this.A00 = r2;
        this.A06 = r8;
        this.A05 = r7;
        this.A01 = r3;
        this.A07 = r9;
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r10;
    }

    public final void A07(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C95814uZ A052 = ((AnonymousClass31A) it.next()).A05();
            C162457s7.A0D(A052);
            A06(A052);
        }
    }
}
