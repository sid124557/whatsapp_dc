package X;

/* renamed from: X.2yS  reason: invalid class name and case insensitive filesystem */
public final class C60372yS {
    public static final C60372yS A00 = new C60372yS();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A00(java.lang.Object r11, java.lang.String r12, java.util.Map r13, java.util.Map r14) {
        /*
            r10 = this;
            if (r13 != 0) goto L_0x0009
            if (r14 != 0) goto L_0x0008
            X.3d5 r14 = X.C72043d5.A00()
        L_0x0008:
            return r14
        L_0x0009:
            if (r14 == 0) goto L_0x0017
            java.lang.String r0 = "merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0018
            java.util.Map r13 = r10.A01(r14, r13)
        L_0x0017:
            return r13
        L_0x0018:
            java.lang.String r0 = "incremental_merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0025
            java.util.Map r13 = r10.A02(r14, r13)
            return r13
        L_0x0025:
            java.lang.String r0 = "wae_commerce_merge"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0017
            java.util.LinkedHashMap r7 = X.C18320x8.A0r()
            java.util.Iterator r2 = X.AnonymousClass000.A0q(r14)
        L_0x0036:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0036
            r7.put(r1, r0)
            goto L_0x0036
        L_0x004e:
            java.util.List r0 = X.AnonymousClass2BA.A00
            java.util.Iterator r9 = r0.iterator()
        L_0x0054:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r6 = r9.next()
            boolean r0 = r14.containsKey(r6)
            if (r0 != 0) goto L_0x006a
            boolean r0 = r13.containsKey(r6)
            if (r0 == 0) goto L_0x0054
        L_0x006a:
            java.lang.Object r5 = r14.get(r6)
            boolean r0 = r5 instanceof java.util.Map
            r4 = 0
            if (r0 == 0) goto L_0x00f9
            java.util.Map r5 = (java.util.Map) r5
        L_0x0075:
            java.lang.Object r1 = r13.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0080
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
        L_0x0080:
            if (r5 == 0) goto L_0x00f0
            if (r4 == 0) goto L_0x00f0
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r5)
            java.util.Iterator r8 = X.AnonymousClass000.A0q(r4)
        L_0x008d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r8)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "direct_connect"
            boolean r0 = X.C162457s7.A0P(r2, r0)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00ba
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008d
        L_0x00b6:
            r3.put(r2, r1)
            goto L_0x008d
        L_0x00ba:
            if (r1 == 0) goto L_0x008d
            goto L_0x00b6
        L_0x00bd:
            boolean r0 = r11 instanceof java.util.List
            if (r0 == 0) goto L_0x00c6
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x00c8
        L_0x00c6:
            X.3d3 r0 = X.C72023d3.A00
        L_0x00c8:
            java.util.Iterator r2 = r0.iterator()
        L_0x00cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x00cc
        L_0x00e2:
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto L_0x00ec
            X.3d5 r0 = X.C72043d5.A00()
        L_0x00ec:
            r3.put(r1, r0)
            goto L_0x00cc
        L_0x00f0:
            X.3d5 r3 = X.C72043d5.A00()
        L_0x00f4:
            r7.put(r6, r3)
            goto L_0x0054
        L_0x00f9:
            r5 = r4
            goto L_0x0075
        L_0x00fc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60372yS.A00(java.lang.Object, java.lang.String, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r3 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A01(java.util.Map r8, java.util.Map r9) {
        /*
            r7 = this;
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r8)
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r9)
        L_0x0009:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003b
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r5)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            java.lang.Object r2 = r6.get(r4)
            boolean r0 = r2 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x0039
            java.util.Map r2 = (java.util.Map) r2
        L_0x0026:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L_0x002d
            r1 = r3
            java.util.Map r1 = (java.util.Map) r1
        L_0x002d:
            if (r2 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x0035
            java.util.Map r3 = r7.A01(r2, r1)
        L_0x0035:
            r6.put(r4, r3)
            goto L_0x0009
        L_0x0039:
            r2 = r1
            goto L_0x0026
        L_0x003b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60372yS.A01(java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A02(java.util.Map r11, java.util.Map r12) {
        /*
            r10 = this;
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r11)
            java.util.Iterator r9 = X.AnonymousClass000.A0q(r12)
        L_0x0009:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r5 = r0.getKey()
            java.lang.Object r7 = r0.getValue()
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r1 = r4.get(r5)
            boolean r0 = r1 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0054
            java.lang.Object r8 = r4.get(r5)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any>"
            X.C162457s7.A0K(r8, r0)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            X.C162457s7.A0K(r7, r0)
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r7.length
            r3 = 0
        L_0x003c:
            if (r3 >= r6) goto L_0x0050
            r2 = r7[r3]
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            int r1 = r8.length
            int r0 = r1 + 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r0)
            r8[r1] = r2
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0050:
            r4.put(r5, r8)
            goto L_0x0009
        L_0x0054:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x007e
            java.lang.Object r2 = r4.get(r5)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"
            X.C162457s7.A0K(r2, r0)
            java.util.Collection r2 = (java.util.Collection) r2
            X.C162457s7.A0K(r7, r0)
            java.util.Iterator r1 = X.C18320x8.A0q(r7)
        L_0x006b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r1.next()
            java.util.List r2 = X.C73723fy.A0M(r0, r2)
            goto L_0x006b
        L_0x007a:
            r4.put(r5, r2)
            goto L_0x0009
        L_0x007e:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r3 = r4.get(r5)
            boolean r0 = r3 instanceof java.util.Map
            r2 = 0
            if (r0 == 0) goto L_0x00a5
            java.util.Map r3 = (java.util.Map) r3
        L_0x008d:
            java.lang.Object r1 = r12.get(r5)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L_0x0098
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
        L_0x0098:
            if (r3 == 0) goto L_0x0009
            if (r2 == 0) goto L_0x0009
            java.util.Map r7 = r10.A02(r3, r2)
        L_0x00a0:
            r4.put(r5, r7)
            goto L_0x0009
        L_0x00a5:
            r3 = r2
            goto L_0x008d
        L_0x00a7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60372yS.A02(java.util.Map, java.util.Map):java.util.Map");
    }
}
