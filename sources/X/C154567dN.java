package X;

/* renamed from: X.7dN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C154567dN {
    public static final AnonymousClass4C8 A01(AnonymousClass4FH r6) {
        return new C833046x(C72553du.A00, C369720l.SUSPEND, r6, -3, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0206: MOVE  (r1v4 java.util.concurrent.CancellationException) = (r3v1 java.util.concurrent.CancellationException)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0082 A[EDGE_INSN: B:129:0x0082->B:22:0x0082 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093 A[Catch:{ all -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    public static final java.lang.Object A00(X.C84814Du r26, X.AnonymousClass4FH r27, X.AnonymousClass4C9 r28, boolean r29) {
        /*
            r3 = r26
            r8 = r28
            r9 = r27
            r7 = r29
            boolean r0 = r3 instanceof X.C174378Ua
            if (r0 == 0) goto L_0x003a
            r6 = r3
            X.8Ua r6 = (X.C174378Ua) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003a
            int r2 = r2 - r1
            r6.label = r2
        L_0x001a:
            java.lang.Object r2 = r6.result
            X.218 r23 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r6.label
            r22 = 1
            if (r1 == 0) goto L_0x0054
            r0 = r22
            if (r1 == r0) goto L_0x0044
            r0 = 2
            if (r1 != r0) goto L_0x0218
            boolean r7 = r6.Z$0
            java.lang.Object r5 = r6.L$2
            X.8PQ r5 = (X.AnonymousClass8PQ) r5
            java.lang.Object r9 = r6.L$1
            X.4FH r9 = (X.AnonymousClass4FH) r9
            java.lang.Object r8 = r6.L$0
            X.4C9 r8 = (X.AnonymousClass4C9) r8
            goto L_0x0040
        L_0x003a:
            X.8Ua r6 = new X.8Ua
            r6.<init>(r3)
            goto L_0x001a
        L_0x0040:
            X.C57682u2.A01(r2)     // Catch:{ all -> 0x01fc }
            goto L_0x005b
        L_0x0044:
            boolean r7 = r6.Z$0
            java.lang.Object r5 = r6.L$2
            X.8PQ r5 = (X.AnonymousClass8PQ) r5
            java.lang.Object r9 = r6.L$1
            X.4FH r9 = (X.AnonymousClass4FH) r9
            java.lang.Object r8 = r6.L$0
            X.4C9 r8 = (X.AnonymousClass4C9) r8
            goto L_0x019d
        L_0x0054:
            X.C57682u2.A01(r2)
            X.8PQ r5 = r9.BJP()     // Catch:{ all -> 0x01fc }
        L_0x005b:
            r6.L$0 = r8     // Catch:{ all -> 0x01fc }
            r6.L$1 = r9     // Catch:{ all -> 0x01fc }
            r6.L$2 = r5     // Catch:{ all -> 0x01fc }
            r6.Z$0 = r7     // Catch:{ all -> 0x01fc }
            r0 = r22
            r6.label = r0     // Catch:{ all -> 0x01fc }
            X.8PR r4 = r5.A02     // Catch:{ all -> 0x01fc }
            r14 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = X.AnonymousClass8PR.A08     // Catch:{ all -> 0x01fc }
            java.lang.Object r10 = r15.get(r4)     // Catch:{ all -> 0x01fc }
            X.8Zq r10 = (X.C175768Zq) r10     // Catch:{ all -> 0x01fc }
        L_0x0072:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r21 = X.AnonymousClass8PR.A04     // Catch:{ all -> 0x01fc }
            r0 = r21
            long r0 = r0.get(r4)     // Catch:{ all -> 0x01fc }
            r2 = r22
            boolean r0 = r4.A0I(r0, r2)     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x0093
            X.2XH r0 = X.C1462879o.A04     // Catch:{ all -> 0x01fc }
            r5.A00 = r0     // Catch:{ all -> 0x01fc }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass8PR.A05     // Catch:{ all -> 0x01fc }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01fc }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x01fb
            r0 = 0
            goto L_0x0194
        L_0x0093:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r20 = X.AnonymousClass8PR.A03     // Catch:{ all -> 0x01fc }
            r0 = r20
            long r28 = r0.getAndIncrement(r4)     // Catch:{ all -> 0x01fc }
            int r0 = X.C1462879o.A01     // Catch:{ all -> 0x01fc }
            long r2 = (long) r0     // Catch:{ all -> 0x01fc }
            long r0 = r28 / r2
            long r11 = r28 % r2
            int r13 = (int) r11     // Catch:{ all -> 0x01fc }
            r17 = r13
            long r11 = r10.A00     // Catch:{ all -> 0x01fc }
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 == 0) goto L_0x00b2
            X.8Zq r11 = r4.A08(r10, r0)     // Catch:{ all -> 0x01fc }
            if (r11 != 0) goto L_0x00b3
            goto L_0x0072
        L_0x00b2:
            r11 = r10
        L_0x00b3:
            r24 = r4
            r25 = r14
            r26 = r11
            r27 = r17
            java.lang.Object r1 = r24.A04(r25, r26, r27, r28)     // Catch:{ all -> 0x01fc }
            X.2XH r12 = X.C1462879o.A0H     // Catch:{ all -> 0x01fc }
            if (r1 == r12) goto L_0x01f0
            X.2XH r10 = X.C1462879o.A08     // Catch:{ all -> 0x01fc }
            if (r1 != r10) goto L_0x00d4
            long r1 = r4.A03()     // Catch:{ all -> 0x01fc }
            int r0 = (r28 > r1 ? 1 : (r28 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d2
            r11.A01()     // Catch:{ all -> 0x01fc }
        L_0x00d2:
            r10 = r11
            goto L_0x0072
        L_0x00d4:
            X.2XH r19 = X.C1462879o.A0I     // Catch:{ all -> 0x01fc }
            r0 = r19
            if (r1 != r0) goto L_0x018e
            X.4Du r0 = X.C57702u4.A01(r6)     // Catch:{ all -> 0x01fc }
            X.46G r18 = X.AnonymousClass2AF.A00(r0)     // Catch:{ all -> 0x01fc }
            r0 = r18
            r5.A01 = r0     // Catch:{ all -> 0x01f7 }
            r25 = r5
            java.lang.Object r0 = r24.A04(r25, r26, r27, r28)     // Catch:{ all -> 0x01f7 }
            if (r0 == r12) goto L_0x0184
            if (r0 != r10) goto L_0x0167
            long r16 = r4.A03()     // Catch:{ all -> 0x01f7 }
            int r0 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fb
            r11.A01()     // Catch:{ all -> 0x01f7 }
        L_0x00fb:
            java.lang.Object r11 = r15.get(r4)     // Catch:{ all -> 0x01f7 }
            X.8Zq r11 = (X.C175768Zq) r11     // Catch:{ all -> 0x01f7 }
        L_0x0101:
            r0 = r21
            long r0 = r0.get(r4)     // Catch:{ all -> 0x01f7 }
            r13 = r22
            boolean r0 = r4.A0I(r0, r13)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0130
            X.46G r2 = r5.A01     // Catch:{ all -> 0x01f7 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x01f7 }
            r5.A01 = r14     // Catch:{ all -> 0x01f7 }
            X.2XH r0 = X.C1462879o.A04     // Catch:{ all -> 0x01f7 }
            r5.A00 = r0     // Catch:{ all -> 0x01f7 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass8PR.A05     // Catch:{ all -> 0x01f7 }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x01f7 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x01f7 }
            if (r1 != 0) goto L_0x012a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01f7 }
        L_0x0126:
            r2.BkD(r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x0189
        L_0x012a:
            X.3Z0 r0 = new X.3Z0     // Catch:{ all -> 0x01f7 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f7 }
            goto L_0x0126
        L_0x0130:
            r0 = r20
            long r28 = r0.getAndIncrement(r4)     // Catch:{ all -> 0x01f7 }
            long r0 = r28 / r2
            long r15 = r28 % r2
            int r13 = (int) r15     // Catch:{ all -> 0x01f7 }
            r17 = r13
            long r15 = r11.A00     // Catch:{ all -> 0x01f7 }
            int r13 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r13 == 0) goto L_0x014a
            X.8Zq r0 = r4.A08(r11, r0)     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x0101
            r11 = r0
        L_0x014a:
            r26 = r11
            r27 = r17
            java.lang.Object r1 = r24.A04(r25, r26, r27, r28)     // Catch:{ all -> 0x01f7 }
            if (r1 == r12) goto L_0x0184
            if (r1 != r10) goto L_0x0162
            long r15 = r4.A03()     // Catch:{ all -> 0x01f7 }
            int r0 = (r28 > r15 ? 1 : (r28 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0101
            r11.A01()     // Catch:{ all -> 0x01f7 }
            goto L_0x0101
        L_0x0162:
            r0 = r19
            if (r1 == r0) goto L_0x01c6
            goto L_0x0173
        L_0x0167:
            r11.A01()     // Catch:{ all -> 0x01f7 }
            r5.A00 = r0     // Catch:{ all -> 0x01f7 }
            r5.A01 = r14     // Catch:{ all -> 0x01f7 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x01f7 }
            goto L_0x017e
        L_0x0173:
            r11.A01()     // Catch:{ all -> 0x01f7 }
            r5.A00 = r1     // Catch:{ all -> 0x01f7 }
            r5.A01 = r14     // Catch:{ all -> 0x01f7 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x01f7 }
        L_0x017e:
            r0 = r18
            r0.BkA(r14, r1)     // Catch:{ all -> 0x01f7 }
            goto L_0x0189
        L_0x0184:
            r0 = r17
            r5.BGt(r11, r0)     // Catch:{ all -> 0x01f7 }
        L_0x0189:
            java.lang.Object r2 = r18.A06()     // Catch:{ all -> 0x01fc }
            goto L_0x0198
        L_0x018e:
            r11.A01()     // Catch:{ all -> 0x01fc }
            r5.A00 = r1     // Catch:{ all -> 0x01fc }
            r0 = 1
        L_0x0194:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x01fc }
        L_0x0198:
            r0 = r23
            if (r2 != r0) goto L_0x01a0
            return r23
        L_0x019d:
            X.C57682u2.A01(r2)     // Catch:{ all -> 0x01fc }
        L_0x01a0:
            boolean r0 = X.AnonymousClass001.A1Z(r2)     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x01e7
            java.lang.Object r1 = r5.A00     // Catch:{ all -> 0x01fc }
            X.2XH r0 = X.C1462879o.A0D     // Catch:{ all -> 0x01fc }
            if (r1 == r0) goto L_0x01e0
            r5.A00 = r0     // Catch:{ all -> 0x01fc }
            X.2XH r0 = X.C1462879o.A04     // Catch:{ all -> 0x01fc }
            if (r1 == r0) goto L_0x01ce
            r6.L$0 = r8     // Catch:{ all -> 0x01fc }
            r6.L$1 = r9     // Catch:{ all -> 0x01fc }
            r6.L$2 = r5     // Catch:{ all -> 0x01fc }
            r6.Z$0 = r7     // Catch:{ all -> 0x01fc }
            r0 = 2
            r6.label = r0     // Catch:{ all -> 0x01fc }
            java.lang.Object r1 = r8.B2K(r1, r6)     // Catch:{ all -> 0x01fc }
            r0 = r23
            if (r1 != r0) goto L_0x005b
            goto L_0x01cd
        L_0x01c6:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01f7 }
            throw r0     // Catch:{ all -> 0x01f7 }
        L_0x01cd:
            return r23
        L_0x01ce:
            X.8PR r1 = r5.A02     // Catch:{ all -> 0x01fc }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass8PR.A05     // Catch:{ all -> 0x01fc }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x01fc }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01fc }
            if (r0 != 0) goto L_0x01fb
            X.8Ts r0 = new X.8Ts     // Catch:{ all -> 0x01fc }
            r0.<init>()     // Catch:{ all -> 0x01fc }
            goto L_0x01fb
        L_0x01e0:
            java.lang.String r0 = "`hasNext()` has not been invoked"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x01fb
        L_0x01e7:
            if (r7 == 0) goto L_0x01ed
            r0 = 0
            r9.AyX(r0)
        L_0x01ed:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x01f0:
            java.lang.String r0 = "unreachable"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01fc }
            goto L_0x01fb
        L_0x01f7:
            r0 = move-exception
            r18.A0C()     // Catch:{ all -> 0x01fc }
        L_0x01fb:
            throw r0     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r2 = move-exception
            if (r7 == 0) goto L_0x021c
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x020a
            r1 = r3
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            if (r1 != 0) goto L_0x0214
        L_0x020a:
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            r1.<init>(r0)
            r1.initCause(r3)
        L_0x0214:
            r9.AyX(r1)
            throw r2
        L_0x0218:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0d()
        L_0x021c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154567dN.A00(X.4Du, X.4FH, X.4C9, boolean):java.lang.Object");
    }
}
