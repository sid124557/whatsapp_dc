package X;

import java.util.concurrent.ConcurrentMap;

/* renamed from: X.7iB  reason: invalid class name and case insensitive filesystem */
public final class C157367iB {
    public static final C157367iB A02 = new C157367iB();
    public final C178578hl A00;
    public final ConcurrentMap A01 = AnonymousClass0x9.A1D();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.8Ab} */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.8Aa] */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013c, code lost:
        if (r1 == null) goto L_0x0142;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0200 A[EDGE_INSN: B:121:0x0200->B:113:0x0200 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C186258v0 A00(java.lang.Class r39) {
        /*
            r38 = this;
            java.lang.String r0 = "messageType"
            r7 = r39
            if (r39 == 0) goto L_0x0230
            r0 = r38
            java.util.concurrent.ConcurrentMap r15 = r0.A01
            java.lang.Object r4 = r15.get(r7)
            X.8v0 r4 = (X.C186258v0) r4
            if (r4 != 0) goto L_0x022f
            X.8hl r1 = r0.A00
            X.8Ac r1 = (X.C169648Ac) r1
            java.lang.Class<X.6Va> r2 = X.C128166Va.class
            boolean r0 = r2.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x002f
            java.lang.Class r0 = X.C162487sD.A03
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        L_0x002f:
            X.8qv r0 = r1.A00
            X.8hi r3 = r0.Bta(r7)
            r10 = r3
            X.8AT r10 = (X.AnonymousClass8AT) r10
            X.7iu r6 = r10.A01
            int r4 = r6.A0I
            r1 = 2
            r0 = r4 & 2
            if (r0 != r1) goto L_0x0068
            boolean r0 = r2.isAssignableFrom(r7)
            if (r0 == 0) goto L_0x005b
            X.72V r2 = X.C162487sD.A02
            X.72U r1 = X.AnonymousClass78U.A00
        L_0x004b:
            X.8xr r0 = r10.A00
            X.8Aa r4 = new X.8Aa
            r4.<init>(r1, r0, r2)
        L_0x0052:
            java.lang.Object r0 = r15.putIfAbsent(r7, r4)
            X.8v0 r0 = (X.C186258v0) r0
            if (r0 == 0) goto L_0x022f
            return r0
        L_0x005b:
            X.72V r2 = X.C162487sD.A00
            X.72U r1 = X.AnonymousClass78U.A01
            if (r1 != 0) goto L_0x004b
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0068:
            boolean r2 = r2.isAssignableFrom(r7)
            r1 = 1
            r5 = r4 & 1
            boolean r0 = X.AnonymousClass000.A1U(r5, r1)
            if (r2 == 0) goto L_0x01e8
            X.8hj r27 = X.AnonymousClass78X.A01
            X.7j2 r24 = X.C157877j2.A01
            X.72V r28 = X.C162487sD.A02
            if (r0 == 0) goto L_0x01e2
            X.72U r23 = X.AnonymousClass78U.A00
            X.8ly r25 = X.AnonymousClass78W.A01
        L_0x0081:
            boolean r0 = r3 instanceof X.AnonymousClass8AT
            if (r0 == 0) goto L_0x0221
            if (r5 == r1) goto L_0x0088
            r1 = 2
        L_0x0088:
            r0 = 2
            r4 = 1
            boolean r37 = X.AnonymousClass000.A1U(r1, r0)
            int r0 = r6.A0M
            if (r0 != 0) goto L_0x01d8
            r0 = 0
            r14 = 0
            r16 = 0
        L_0x0096:
            int r1 = r0 << 2
            int[] r3 = new int[r1]
            int r0 = r0 << 1
            java.lang.Object[] r13 = new java.lang.Object[r0]
            int r0 = r6.A0O
            r12 = 0
            if (r0 <= 0) goto L_0x01d4
            int[] r0 = new int[r0]
            r22 = r0
        L_0x00a7:
            int r0 = r6.A0Q
            if (r0 <= 0) goto L_0x00ad
            int[] r12 = new int[r0]
        L_0x00ad:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0200
            int r8 = r6.A08
            r2 = 0
            r21 = 0
            r20 = 0
        L_0x00ba:
            int r0 = r6.A0L
            if (r8 >= r0) goto L_0x00d0
            int r0 = r8 - r14
            int r0 = r0 << 2
            if (r2 >= r0) goto L_0x00d0
            r1 = 0
        L_0x00c5:
            int r9 = r2 + r1
            r0 = -1
            r3[r9] = r0
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x0156
            goto L_0x00c5
        L_0x00d0:
            int r1 = r6.A0A
            X.6v7 r19 = X.C141156v7.A09
            r0 = r19
            int r0 = r0.id
            if (r1 <= r0) goto L_0x0193
            int r0 = r6.A0B
            int r8 = r0 << 1
            java.lang.Object[] r9 = r6.A0T
            r0 = r9[r8]
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0187
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L_0x00e8:
            X.7bt r8 = X.C162337rj.A02
            long r0 = r8.A06(r0)
            int r11 = (int) r0
            int r0 = r6.A0B
            int r0 = r0 << 1
            int r17 = r0 + 1
            r1 = r9[r17]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x017b
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x00fd:
            long r0 = r8.A06(r1)
            int r8 = (int) r0
            r9 = 0
        L_0x0103:
            int r0 = r6.A08
            r3[r2] = r0
            int r18 = r2 + 1
            int r1 = r6.A09
            r0 = r1 & 512(0x200, float:7.175E-43)
            r17 = 0
            if (r0 == 0) goto L_0x0113
            r17 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0113:
            r0 = r1 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L_0x011a
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x011a:
            r17 = r17 | r1
            int r0 = r6.A0A
            int r1 = r0 << 20
            r17 = r17 | r1
            r17 = r17 | r11
            r3[r18] = r17
            int r11 = r2 + 2
            int r1 = r9 << 20
            r1 = r1 | r8
            r3[r11] = r1
            java.lang.Object r1 = r6.A0G
            if (r1 == 0) goto L_0x016f
            int r8 = r2 / 4
            int r8 = r8 << r4
            r13[r8] = r1
            java.lang.Object r1 = r6.A0E
            if (r1 != 0) goto L_0x013e
            java.lang.Object r1 = r6.A0F
            if (r1 == 0) goto L_0x0142
        L_0x013e:
            int r8 = r8 + 1
            r13[r8] = r1
        L_0x0142:
            int r1 = r19.ordinal()
            if (r0 != r1) goto L_0x015a
            int r0 = r21 + 1
            r22[r21] = r2
            r21 = r0
        L_0x014e:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0200
            int r8 = r6.A08
        L_0x0156:
            int r2 = r2 + 4
            goto L_0x00ba
        L_0x015a:
            r1 = 18
            if (r0 < r1) goto L_0x014e
            r1 = 49
            if (r0 > r1) goto L_0x014e
            int r8 = r20 + 1
            r1 = r3[r18]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            r12[r20] = r1
            r20 = r8
            goto L_0x014e
        L_0x016f:
            java.lang.Object r1 = r6.A0E
            if (r1 != 0) goto L_0x0177
            java.lang.Object r1 = r6.A0F
            if (r1 == 0) goto L_0x0142
        L_0x0177:
            int r8 = r2 / 4
            int r8 = r8 << r4
            goto L_0x013e
        L_0x017b:
            java.lang.Class r0 = r6.A0D
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = X.C157807iu.A00(r0, r1)
            r9[r17] = r1
            goto L_0x00fd
        L_0x0187:
            java.lang.Class r1 = r6.A0D
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = X.C157807iu.A00(r1, r0)
            r9[r8] = r0
            goto L_0x00e8
        L_0x0193:
            java.lang.reflect.Field r0 = r6.A0H
            X.7bt r8 = X.C162337rj.A02
            long r0 = r8.A06(r0)
            int r11 = (int) r0
            if (r5 != r4) goto L_0x01d0
            int r1 = r6.A0A
            X.6v7 r0 = X.C141156v7.A03
            int r0 = r0.id
            if (r1 > r0) goto L_0x01d0
            int r0 = r6.A0N
            int r17 = r0 << 1
            int r0 = r6.A0C
            int r0 = r0 / 32
            int r17 = r17 + r0
            java.lang.Object[] r9 = r6.A0T
            r1 = r9[r17]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x01c5
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x01ba:
            long r0 = r8.A06(r1)
            int r8 = (int) r0
            int r0 = r6.A0C
            int r9 = r0 % 32
            goto L_0x0103
        L_0x01c5:
            java.lang.Class r0 = r6.A0D
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = X.C157807iu.A00(r0, r1)
            r9[r17] = r1
            goto L_0x01ba
        L_0x01d0:
            r9 = 0
            r8 = 0
            goto L_0x0103
        L_0x01d4:
            r22 = r12
            goto L_0x00a7
        L_0x01d8:
            int r14 = r6.A0J
            int r0 = r6.A0K
            r16 = r0
            int r0 = r6.A0P
            goto L_0x0096
        L_0x01e2:
            r23 = 0
            X.8ly r25 = X.AnonymousClass78W.A01
            goto L_0x0081
        L_0x01e8:
            X.8hj r27 = X.AnonymousClass78X.A00
            X.7j2 r24 = X.C157877j2.A00
            if (r0 == 0) goto L_0x01f8
            X.72V r28 = X.C162487sD.A00
            X.72U r23 = X.AnonymousClass78U.A01
            if (r23 == 0) goto L_0x0228
            X.8ly r25 = X.AnonymousClass78W.A00
            goto L_0x0081
        L_0x01f8:
            X.72V r28 = X.C162487sD.A01
            r23 = 0
            X.8ly r25 = X.AnonymousClass78W.A00
            goto L_0x0081
        L_0x0200:
            int r1 = r6.A0L
            X.8xr r2 = r10.A00
            int[] r0 = r6.A0S
            X.8Ab r4 = new X.8Ab
            r26 = r2
            r29 = r3
            r30 = r0
            r31 = r22
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r16
            r36 = r1
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0052
        L_0x0221:
            java.lang.String r0 = "zzcf"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0228:
            java.lang.String r0 = "Protobuf runtime is not correctly loaded."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x022f:
            return r4
        L_0x0230:
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157367iB.A00(java.lang.Class):X.8v0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r0 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C157367iB() {
        /*
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass0x9.A1D()
            r2.A01 = r0
            java.lang.String r0 = "com.google.protobuf.AndroidProto3SchemaFactory"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 0
            r0 = r1[r0]
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = X.AnonymousClass6C8.A0d(r0)     // Catch:{ all -> 0x001e }
            X.8hl r0 = (X.C178578hl) r0     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0023
        L_0x001e:
            X.8Ac r0 = new X.8Ac
            r0.<init>()
        L_0x0023:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157367iB.<init>():void");
    }
}
