package X;

/* renamed from: X.7SQ  reason: invalid class name */
public final class AnonymousClass7SQ {
    public final AnonymousClass2VN A00;
    public final C40642He A01;

    public AnonymousClass7SQ(AnonymousClass2VN r2, C40642He r3) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.7ht} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.7ht} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.7ht} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: X.7ht} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: X.7ht} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: X.7ht} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: X.7ht} */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass7SR A00(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.Map r29, java.util.Map r30) {
        /*
            r25 = this;
            java.lang.String r1 = "type"
            r0 = r29
            java.lang.Object r12 = r0.get(r1)
            java.lang.String r1 = "resource"
            boolean r4 = X.C162457s7.A0P(r12, r1)
            java.lang.String r7 = "result_selector"
            java.lang.String r2 = "next"
            java.lang.String r5 = "result_path"
            java.lang.String r8 = "parameters"
            java.lang.String r9 = "input_selector"
            java.lang.String r3 = "catch"
            r14 = 0
            r1 = r26
            if (r4 == 0) goto L_0x0090
            java.lang.String r4 = "id"
            java.lang.String r18 = X.C18290x4.A0p(r4, r0)
            java.util.Map r22 = X.AnonymousClass6C8.A0l(r9, r0)
            java.lang.Object r6 = r0.get(r8)
            boolean r4 = r6 instanceof java.util.Map
            if (r4 == 0) goto L_0x008d
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x008d
            X.21z r4 = X.C373721z.ADDITIONAL_PARAMS
            java.lang.String r4 = r4.key
            r8 = r30
            X.3Z6 r4 = X.AnonymousClass3Z6.A02(r4, r8)
            java.util.Map r23 = X.C73813g7.A0E(r6, r4)
        L_0x0043:
            java.util.Map r24 = X.AnonymousClass6C8.A0l(r7, r0)
            java.lang.Object r5 = r0.get(r5)
            boolean r4 = r5 instanceof java.lang.String
            if (r4 == 0) goto L_0x008a
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x008a
            java.lang.String r19 = X.AnonymousClass6C9.A0e(r5)
        L_0x0057:
            java.lang.String r20 = X.AnonymousClass0x2.A0c(r2, r0)
            java.lang.String r2 = "merge"
            java.lang.Object r4 = r0.get(r2)
            if (r4 != 0) goto L_0x0065
            java.lang.String r4 = "replace"
        L_0x0065:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r2 = "merge_param"
            java.lang.Object r15 = r0.get(r2)
            java.lang.Object r2 = r0.get(r3)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x007e
            X.7ht r14 = new X.7ht
            r14.<init>(r2)
        L_0x007e:
            X.6ni r13 = new X.6ni
            r16 = r27
            r21 = r4
            r17 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r13
        L_0x008a:
            java.lang.String r19 = "$"
            goto L_0x0057
        L_0x008d:
            r23 = r14
            goto L_0x0043
        L_0x0090:
            java.lang.String r4 = "choice"
            boolean r4 = X.C162457s7.A0P(r12, r4)
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>"
            java.lang.String r10 = "choices"
            java.lang.String r13 = "default"
            if (r4 == 0) goto L_0x00df
            java.lang.String r6 = X.C18290x4.A0p(r13, r0)
            java.lang.Object r2 = r0.get(r10)
            X.C162457s7.A0K(r2, r11)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r2.iterator()
        L_0x00b3:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r4.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r2 = X.C18280x3.A0d(r2)
            X.C162457s7.A0D(r2)
            r5.add(r2)
            goto L_0x00b3
        L_0x00ca:
            java.lang.Object r2 = r0.get(r3)
            if (r2 == 0) goto L_0x00d9
            java.lang.String r0 = X.C18290x4.A0p(r3, r0)
            X.7ht r14 = new X.7ht
            r14.<init>(r0)
        L_0x00d9:
            X.6ne r0 = new X.6ne
            r0.<init>(r14, r1, r6, r5)
            return r0
        L_0x00df:
            java.lang.String r4 = "succeed"
            boolean r4 = X.C162457s7.A0P(r12, r4)
            if (r4 == 0) goto L_0x00ed
            X.6nd r14 = new X.6nd
            r14.<init>(r1)
            return r14
        L_0x00ed:
            java.lang.String r4 = "pass"
            boolean r4 = X.C162457s7.A0P(r12, r4)
            if (r4 == 0) goto L_0x011c
            java.util.Map r6 = X.AnonymousClass6C8.A0l(r9, r0)
            java.util.Map r7 = X.AnonymousClass6C8.A0l(r8, r0)
            java.lang.Object r4 = r0.get(r5)
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L_0x0119
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0119
            java.lang.String r4 = X.AnonymousClass6C9.A0e(r4)
        L_0x010d:
            java.lang.String r5 = X.AnonymousClass0x2.A0c(r2, r0)
            X.6nf r14 = new X.6nf
            r2 = r14
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r14
        L_0x0119:
            java.lang.String r4 = "$"
            goto L_0x010d
        L_0x011c:
            java.lang.String r4 = "version_check"
            boolean r4 = X.C162457s7.A0P(r12, r4)
            r6 = r25
            if (r4 == 0) goto L_0x0160
            java.lang.String r4 = X.C18290x4.A0p(r13, r0)
            java.lang.Object r0 = r0.get(r10)
            X.C162457s7.A0K(r0, r11)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x013b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r0 = r2.next()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r0 = X.C18280x3.A0d(r0)
            X.C162457s7.A0D(r0)
            r3.add(r0)
            goto L_0x013b
        L_0x0152:
            java.lang.Object r2 = X.AnonymousClass0x9.A0t(r3)
            java.lang.String r2 = (java.lang.String) r2
            X.2He r0 = r6.A01
            X.6ng r14 = new X.6ng
            r14.<init>(r0, r1, r4, r2)
            return r14
        L_0x0160:
            java.lang.String r4 = "subflow"
            boolean r4 = X.C162457s7.A0P(r12, r4)
            if (r4 == 0) goto L_0x01be
            X.2VN r4 = r6.A00
            java.util.Map r11 = X.AnonymousClass6C8.A0l(r9, r0)
            java.util.Map r12 = X.AnonymousClass6C8.A0l(r8, r0)
            java.util.Map r13 = X.AnonymousClass6C8.A0l(r7, r0)
            java.lang.Object r6 = r0.get(r5)
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L_0x01bb
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x01bb
            java.lang.String r7 = X.AnonymousClass6C9.A0e(r6)
        L_0x0186:
            java.lang.Object r6 = r0.get(r3)
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x01b9
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x01b9
            X.7ht r5 = new X.7ht
            r5.<init>(r6)
        L_0x0197:
            java.lang.Object r3 = r0.get(r2)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x01a2
            java.lang.String r3 = (java.lang.String) r3
            r14 = r3
        L_0x01a2:
            java.lang.String r2 = "launch_mode"
            java.lang.String r8 = X.C18290x4.A0p(r2, r0)
            java.lang.String r2 = "config"
            java.lang.String r9 = X.C18290x4.A0p(r2, r0)
            r10 = r28
            r3 = r4
            r4 = r5
            r5 = r1
            r6 = r14
            X.6nh r14 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x01b9:
            r5 = r14
            goto L_0x0197
        L_0x01bb:
            java.lang.String r7 = "$"
            goto L_0x0186
        L_0x01be:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7SQ.A00(java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map):X.7SR");
    }
}
