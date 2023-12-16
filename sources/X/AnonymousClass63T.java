package X;

/* renamed from: X.63T  reason: invalid class name */
public final class AnonymousClass63T extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5ZI $directoryQplLogger;
    public final /* synthetic */ boolean $isTypeahead;
    public final /* synthetic */ String $query;
    public final /* synthetic */ C104755Sf $searchQueryResult;
    public final /* synthetic */ AnonymousClass5OG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63T(AnonymousClass5OG r2, C104755Sf r3, AnonymousClass5ZI r4, String str, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$searchQueryResult = r3;
        this.$isTypeahead = z;
        this.$directoryQplLogger = r4;
        this.$query = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x011e, code lost:
        if (X.C18300x5.A1X(r5.A04, 1) != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0196, code lost:
        if (r0 != null) goto L_0x0198;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            X.73y r6 = (X.C1450473y) r6
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r1 = r18
            X.5OG r10 = r1.this$0
            X.5Sf r5 = r1.$searchQueryResult
            boolean r4 = r1.$isTypeahead
            X.5ZI r0 = r1.$directoryQplLogger
            java.lang.String r3 = r1.$query
            java.util.Set r2 = r5.A04
            java.lang.Integer r1 = X.C18280x3.A0S()
            r2.add(r1)
            boolean r1 = r6 instanceof X.C132596fd
            if (r1 == 0) goto L_0x0121
            if (r4 == 0) goto L_0x0142
            X.6fd r6 = (X.C132596fd) r6
            X.5Wd r1 = r10.A04
            X.7QA r6 = r6.A00
            r1.A01(r6)
            java.util.List r4 = r6.A0C
            X.C162457s7.A0C(r4)
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r4.iterator()
        L_0x0039:
            boolean r1 = r8.hasNext()
            r3 = 1
            if (r1 == 0) goto L_0x0057
            java.lang.Object r7 = r8.next()
            r2 = r7
            X.5e1 r2 = (X.C109065e1) r2
            X.7Y3 r1 = r5.A01
            X.C162457s7.A0H(r2)
            boolean r1 = X.AnonymousClass5V4.A01(r1, r2)
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x0039
            r9.add(r7)
            goto L_0x0039
        L_0x0057:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r9.iterator()
        L_0x005f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r2 = r8.next()
            X.7QA r1 = r5.A02
            java.util.List r1 = r1.A0C
            boolean r1 = r1.contains(r2)
            X.C86624Kv.A1Q(r2, r7, r1)
            goto L_0x005f
        L_0x0075:
            X.7QA r9 = r5.A02
            java.util.List r14 = r9.A0C
            int r2 = r7.size()
            int r1 = r14.size()
            int r1 = 3 - r1
            int r1 = java.lang.Math.min(r2, r1)
            r12 = 0
            java.util.List r1 = r7.subList(r12, r1)
            r14.addAll(r1)
            java.util.List r2 = r6.A09
            X.C162457s7.A0C(r2)
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = r2.iterator()
        L_0x009c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r8 = r11.next()
            r7 = r8
            X.5e1 r7 = (X.C109065e1) r7
            X.7Y3 r1 = r5.A01
            X.C162457s7.A0H(r7)
            boolean r1 = X.AnonymousClass5V4.A01(r1, r7)
            X.C86624Kv.A1Q(r8, r13, r1)
            goto L_0x009c
        L_0x00b6:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r13.iterator()
        L_0x00be:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00d2
            java.lang.Object r7 = r8.next()
            java.util.List r1 = r9.A09
            boolean r1 = r1.contains(r7)
            X.C86624Kv.A1Q(r7, r11, r1)
            goto L_0x00be
        L_0x00d2:
            int r1 = r14.size()
            int r1 = 3 - r1
            int r8 = java.lang.Math.max(r1, r3)
            java.util.List r15 = r9.A09
            int r7 = r11.size()
            int r1 = r15.size()
            int r8 = r8 - r1
            int r1 = java.lang.Math.min(r7, r8)
            java.util.List r1 = r11.subList(r12, r1)
            r15.addAll(r1)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r7 = r10.A00
            if (r7 == 0) goto L_0x0116
            java.lang.String r10 = r5.A03
            java.util.List r13 = r9.A0A
            X.7js r9 = r6.A01
            java.lang.String r11 = r6.A05
            java.lang.String r12 = r6.A08
            X.7Y3 r8 = r5.A01
            java.util.Set r1 = r5.A04
            boolean r1 = X.C18300x5.A1X(r1, r3)
            r16 = r1 ^ 1
            r4.size()
            r2.size()
            r2.size()
            r7.A0R(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0116:
            if (r0 == 0) goto L_0x019b
            java.util.Set r1 = r5.A04
            boolean r1 = X.C18300x5.A1X(r1, r3)
            if (r1 == 0) goto L_0x019b
            goto L_0x0198
        L_0x0121:
            boolean r1 = r6 instanceof X.C132586fc
            if (r1 == 0) goto L_0x019b
            X.6fc r6 = (X.C132586fc) r6
            int r7 = r6.A00
            r5.A00 = r7
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r6 = r10.A00
            if (r6 == 0) goto L_0x013c
            java.lang.String r4 = r5.A03
            X.3Wi r3 = r6.A0K
            r2 = 1
            X.5rY r1 = new X.5rY
            r1.<init>(r6, r4, r7, r2)
            r3.A0S(r1)
        L_0x013c:
            if (r0 == 0) goto L_0x019b
            r0.A03()
            goto L_0x019b
        L_0x0142:
            X.7QA r4 = r5.A02
            java.util.List r15 = r4.A09
            X.6fd r6 = (X.C132596fd) r6
            X.7QA r1 = r6.A00
            java.util.List r2 = r1.A09
            X.C162457s7.A0C(r2)
            r15.addAll(r2)
            java.util.List r4 = r4.A0C
            java.util.List r2 = r1.A0C
            X.C162457s7.A0C(r2)
            r4.addAll(r2)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r5 = r10.A00
            if (r5 == 0) goto L_0x0196
            X.3d3 r14 = X.C72023d3.A00
            java.util.List r6 = r1.A0B
            X.C162457s7.A0C(r6)
            java.lang.String r10 = r1.A04
            java.lang.String r11 = r1.A07
            java.lang.Double r9 = r1.A02
            java.lang.String r12 = r1.A06
            java.lang.String r13 = r1.A03
            r2 = 0
            X.7jr r8 = new X.7jr
            r8.<init>(r2, r14)
            X.5TI r7 = new X.5TI
            r16 = r4
            r17 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.7js r6 = r1.A01
            java.lang.String r4 = r1.A05
            java.lang.String r2 = r1.A08
            X.3Wi r1 = r5.A0K
            X.5rn r8 = new X.5rn
            r9 = r7
            r12 = r3
            r13 = r4
            r14 = r2
            r10 = r5
            r11 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r1.A0S(r8)
        L_0x0196:
            if (r0 == 0) goto L_0x019b
        L_0x0198:
            r0.A04()
        L_0x019b:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63T.invoke(java.lang.Object):java.lang.Object");
    }
}
