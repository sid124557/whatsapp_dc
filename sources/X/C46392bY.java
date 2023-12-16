package X;

/* renamed from: X.2bY  reason: invalid class name and case insensitive filesystem */
public final class C46392bY {
    public final C55682qk A00;
    public final AnonymousClass1RJ A01;
    public final AnonymousClass2GC A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4FV A04;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|20|21|22|(2:24|25)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long A00(X.C54562ov r9, int r10) {
        /*
            r8 = this;
            X.1VX r2 = r8.A03
            r1 = 6542(0x198e, float:9.167E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r3 = 0
            if (r0 != 0) goto L_0x000e
            return r3
        L_0x000e:
            java.lang.String r5 = r9.A02
            X.C162457s7.A0D(r5)
            int r0 = r9.A01
            java.lang.String r6 = "AxolotlLidJidMigrationUtils/getLidNumberFromSignalAddress: invalid LID, DB source: "
            r4 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r4) goto L_0x001d
            return r3
        L_0x001d:
            r7 = 0
            long r0 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x006b }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x0074
        L_0x0027:
            X.2GC r0 = r8.A02     // Catch:{ 24P -> 0x0080 }
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass32X.A00(r5)     // Catch:{ 24P -> 0x0080 }
            X.2sM r0 = r0.A00     // Catch:{ 24P -> 0x0080 }
            X.1fH r0 = r0.A01(r1)     // Catch:{ 24P -> 0x0080 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r2 = r0.user     // Catch:{ 24P -> 0x0080 }
            goto L_0x0039
        L_0x0038:
            r2 = r3
        L_0x0039:
            if (r2 != 0) goto L_0x004c
            X.1W2 r1 = new X.1W2     // Catch:{ 24P -> 0x0080 }
            r1.<init>()     // Catch:{ 24P -> 0x0080 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ 24P -> 0x0080 }
            r1.A00 = r0     // Catch:{ 24P -> 0x0080 }
            X.4FV r0 = r8.A04     // Catch:{ 24P -> 0x0080 }
            r0.BhD(r1)     // Catch:{ 24P -> 0x0080 }
            return r3
        L_0x004c:
            r7 = 0
            long r0 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0056 }
            goto L_0x005f
        L_0x0056:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 24P -> 0x0080 }
            java.lang.String r0 = "AxolotlLidJidMigrationUtils/ bad lid:"
            X.C18260x0.A0r(r0, r2, r1)     // Catch:{ 24P -> 0x0080 }
        L_0x005f:
            if (r7 != 0) goto L_0x007f
            X.2qk r1 = r8.A00     // Catch:{ 24P -> 0x0080 }
            java.lang.String r0 = X.C18260x0.A05(r6, r10)     // Catch:{ 24P -> 0x0080 }
            r1.A0A(r0, r4, r3)     // Catch:{ 24P -> 0x0080 }
            return r7
        L_0x006b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AxolotlLidJidMigrationUtils/ bad lid:"
            X.C18260x0.A0r(r0, r5, r1)
        L_0x0074:
            if (r7 != 0) goto L_0x007f
            X.2qk r1 = r8.A00
            java.lang.String r0 = X.C18260x0.A05(r6, r10)
            r1.A0A(r0, r4, r3)
        L_0x007f:
            return r7
        L_0x0080:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid user jid address: "
            X.C18260x0.A0r(r0, r5, r1)
            X.2qk r2 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AxolotlLidJidMigrationUtils/getLidNumberFromSignalAddress: invalid JID : "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)
            r2.A0A(r0, r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46392bY.A00(X.2ov, int):java.lang.Long");
    }

    public C46392bY(C55682qk r1, AnonymousClass1RJ r2, AnonymousClass2GC r3, AnonymousClass1VX r4, AnonymousClass4FV r5) {
        C18260x0.A0c(r4, r1, r5, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
