package X;

/* renamed from: X.0ff  reason: invalid class name and case insensitive filesystem */
public final class C09110ff implements C16770tw {
    public final C012209r A00;
    public final AnonymousClass0R5 A01;
    public final AnonymousClass0QE A02;
    public final AnonymousClass0QE A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.0PX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0PX BDR(X.AnonymousClass0PL r8) {
        /*
            r7 = this;
            java.lang.String r3 = r8.A01
            int r1 = r8.A00
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r2 = 2
            X.0eu r6 = X.C02920Ic.A00(r0, r2)
            r0 = 1
            r6.Axu(r0, r3)
            long r0 = (long) r1
            r6.Axs(r2, r0)
            X.0R5 r1 = r7.A01
            r1.A09()
            r0 = 0
            r5 = 0
            android.database.Cursor r4 = X.C02930Id.A00(r1, r6, r0)
            java.lang.String r0 = "work_spec_id"
            int r3 = X.AnonymousClass0X4.A02(r4, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "generation"
            int r2 = X.AnonymousClass0X4.A02(r4, r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "system_id"
            int r1 = X.AnonymousClass0X4.A02(r4, r0)     // Catch:{ all -> 0x0055 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004e
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0040
            java.lang.String r5 = r4.getString(r3)     // Catch:{ all -> 0x0055 }
        L_0x0040:
            int r2 = r4.getInt(r2)     // Catch:{ all -> 0x0055 }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0055 }
            X.0PX r0 = new X.0PX     // Catch:{ all -> 0x0055 }
            r0.<init>(r5, r2, r1)     // Catch:{ all -> 0x0055 }
            r5 = r0
        L_0x004e:
            r4.close()
            r6.A01()
            return r5
        L_0x0055:
            r0 = move-exception
            r4.close()
            r6.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09110ff.BDR(X.0PL):X.0PX");
    }

    public void BGf(AnonymousClass0PX r3) {
        AnonymousClass0R5 r1 = this.A01;
        r1.A09();
        r1.A0A();
        try {
            this.A00.A05(r3);
            r1.A0B();
        } finally {
            r1.A0C();
        }
    }

    public C09110ff(AnonymousClass0R5 r3) {
        this.A01 = r3;
        this.A00 = new C17620vs(r3, this, 2);
        this.A02 = new C17630vt(r3, this, 0);
        this.A03 = new C17630vt(r3, this, 1);
    }
}
