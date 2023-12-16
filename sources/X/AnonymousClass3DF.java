package X;

/* renamed from: X.3DF  reason: invalid class name */
public final class AnonymousClass3DF implements AnonymousClass66U {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;

    public AnonymousClass3DF(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7) {
        C18260x0.A0f(r1, r2, r3, r4, r5);
        C18260x0.A0U(r6, r7);
        this.A03 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A06 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r7;
    }

    public String BDW() {
        return "AccountSwitchingAsyncInit";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r0.length == 0) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BMd() {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "AccountSwitchingAsyncInit"
            r1.append(r3)
            java.lang.String r0 = "/onAsyncInitAnyUserState"
            X.C18260x0.A1L(r1, r0)
            X.8qC r0 = r10.A06
            X.33p r1 = X.C18320x8.A0J(r0)
            X.8qC r7 = r10.A01
            java.util.List r0 = X.C613630k.A00(r7)
            int r0 = r0.size()
            r1.A1A(r0)
            X.8qC r0 = r10.A00
            java.lang.Object r0 = r0.get()
            X.30z r0 = (X.C614930z) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x017f
            X.8qC r8 = r10.A02     // Catch:{ RuntimeException -> 0x017b }
            java.lang.Object r0 = r8.get()     // Catch:{ RuntimeException -> 0x017b }
            X.35Q r0 = (X.AnonymousClass35Q) r0     // Catch:{ RuntimeException -> 0x017b }
            X.66R r0 = r0.A0A     // Catch:{ RuntimeException -> 0x017b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ RuntimeException -> 0x017b }
            java.io.File r0 = (java.io.File) r0     // Catch:{ RuntimeException -> 0x017b }
            java.io.File[] r6 = r0.listFiles()     // Catch:{ RuntimeException -> 0x017b }
            if (r6 == 0) goto L_0x009e
            int r5 = r6.length     // Catch:{ RuntimeException -> 0x017b }
            if (r5 == 0) goto L_0x009e
            r4 = 0
        L_0x0049:
            r9 = r6[r4]     // Catch:{ RuntimeException -> 0x017b }
            java.io.File[] r0 = r9.listFiles()     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x0055
            int r0 = r0.length     // Catch:{ RuntimeException -> 0x017b }
            r1 = 0
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r1 = 1
        L_0x0056:
            r0 = 47
            if (r1 == 0) goto L_0x007c
            boolean r1 = r9.delete()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r3)     // Catch:{ RuntimeException -> 0x017b }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = r9.getName()     // Catch:{ RuntimeException -> 0x017b }
            X.C162457s7.A0D(r0)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = X.C57072t2.A01(r0)     // Catch:{ RuntimeException -> 0x017b }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = " is empty/delete: "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x017b }
            r2.append(r1)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x0096
        L_0x007c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r3)     // Catch:{ RuntimeException -> 0x017b }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = r9.getName()     // Catch:{ RuntimeException -> 0x017b }
            X.C162457s7.A0D(r0)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = X.C57072t2.A01(r0)     // Catch:{ RuntimeException -> 0x017b }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = " is non empty"
            r2.append(r0)     // Catch:{ RuntimeException -> 0x017b }
        L_0x0096:
            X.C18280x3.A14(r2)     // Catch:{ RuntimeException -> 0x017b }
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x00a7
            goto L_0x0049
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = "/stagingAccountFolders null or empty"
            X.C18260x0.A1L(r1, r0)     // Catch:{ RuntimeException -> 0x017b }
        L_0x00a7:
            java.lang.Object r0 = r8.get()     // Catch:{ RuntimeException -> 0x017b }
            X.35Q r0 = (X.AnonymousClass35Q) r0     // Catch:{ RuntimeException -> 0x017b }
            java.util.List r1 = r0.A04()     // Catch:{ RuntimeException -> 0x017b }
            boolean r0 = r1.isEmpty()     // Catch:{ RuntimeException -> 0x017b }
            r5 = 0
            if (r0 == 0) goto L_0x0111
            java.util.List r0 = X.C613630k.A00(r7)     // Catch:{ RuntimeException -> 0x017b }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ RuntimeException -> 0x017b }
        L_0x00c0:
            boolean r0 = r8.hasNext()     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x017f
            java.lang.Object r2 = r8.next()     // Catch:{ RuntimeException -> 0x017b }
            X.2nq r2 = (X.C53892nq) r2     // Catch:{ RuntimeException -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = "staged dir not found for: {"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017b }
            X.C162457s7.A0J(r2, r5)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r6 = r2.A07     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = X.C57072t2.A01(r6)     // Catch:{ RuntimeException -> 0x017b }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = "}, removing entry from data repo"
            java.lang.String r4 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x017b }
            X.8qC r0 = r10.A03     // Catch:{ RuntimeException -> 0x017b }
            java.lang.Object r2 = r0.get()     // Catch:{ RuntimeException -> 0x017b }
            X.2qk r2 = (X.C55682qk) r2     // Catch:{ RuntimeException -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = "/staged dir not found"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x017b }
            r2.A0A(r0, r5, r4)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = "/onAsyncInitAnyUserState/"
            X.C18260x0.A0s(r0, r4, r1)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.Object r0 = r7.get()     // Catch:{ RuntimeException -> 0x017b }
            X.30k r0 = (X.C613630k) r0     // Catch:{ RuntimeException -> 0x017b }
            r0.A0A(r6)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x00c0
        L_0x0111:
            java.util.List r4 = X.C613630k.A00(r7)     // Catch:{ RuntimeException -> 0x017b }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ RuntimeException -> 0x017b }
        L_0x0119:
            boolean r0 = r7.hasNext()     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x017f
            java.lang.String r6 = X.AnonymousClass001.A0m(r7)     // Catch:{ RuntimeException -> 0x017b }
            boolean r0 = r4 instanceof java.util.Collection     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x0156
            boolean r0 = r4.isEmpty()     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x0156
        L_0x012d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = " staged dir found, but accounts data repo entry not found"
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = "/onAsyncInitAnyUserState: "
            X.C18260x0.A0r(r0, r6, r1)     // Catch:{ RuntimeException -> 0x017b }
            X.8qC r0 = r10.A03     // Catch:{ RuntimeException -> 0x017b }
            java.lang.Object r2 = r0.get()     // Catch:{ RuntimeException -> 0x017b }
            X.2qk r2 = (X.C55682qk) r2     // Catch:{ RuntimeException -> 0x017b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)     // Catch:{ RuntimeException -> 0x017b }
            java.lang.String r0 = "/accounts data repo entry not found"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x017b }
            r2.A0A(r0, r5, r6)     // Catch:{ RuntimeException -> 0x017b }
            goto L_0x0119
        L_0x0156:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ RuntimeException -> 0x017b }
            r1 = 0
        L_0x015b:
            boolean r0 = r2.hasNext()     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x0170
            java.lang.Object r0 = r2.next()     // Catch:{ RuntimeException -> 0x017b }
            boolean r0 = X.C53892nq.A00(r0, r6)     // Catch:{ RuntimeException -> 0x017b }
            if (r0 == 0) goto L_0x015b
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x015b
            goto L_0x0173
        L_0x0170:
            if (r1 > 0) goto L_0x0119
            goto L_0x012d
        L_0x0173:
            X.AnonymousClass8UF.A0q()     // Catch:{ RuntimeException -> 0x017b }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()     // Catch:{ RuntimeException -> 0x017b }
            throw r0     // Catch:{ RuntimeException -> 0x017b }
        L_0x017b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DF.BMd():void");
    }

    public void BMe() {
        C53892nq A012;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitchingAsyncInit");
        C18260x0.A1L(A0o, "/onAsyncInitUserRegisteredAndDbReady");
        C183538qC r1 = this.A00;
        if (((C614930z) r1.get()).A07() && (A012 = ((C614930z) r1.get()).A01()) != null) {
            String str = A012.A07;
            ((AnonymousClass30A) this.A04.get()).A04(str);
            if (((C194979Vj) this.A05.get()).A0C()) {
                ((C613630k) this.A01.get()).A07(str);
                return;
            }
            C183538qC r2 = this.A01;
            if (C162457s7.A0P(str, ((C613630k) r2.get()).A02().A00)) {
                C18260x0.A1L(AnonymousClass000.A0l("AccountSwitchingAsyncInit"), "/onAsyncInitUserRegisteredAndDbReady/removing paymentsOnboardedLid");
                ((C613630k) r2.get()).A07((String) null);
            }
        }
    }
}
