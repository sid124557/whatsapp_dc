package X;

/* renamed from: X.2e7  reason: invalid class name and case insensitive filesystem */
public final class C47962e7 {
    public final C72303dV A00;

    public C47962e7(C72303dV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C51062jD r7, long r8) {
        /*
            r6 = this;
            r0 = 1
            X.C162457s7.A0J(r7, r0)
            X.3dV r0 = r6.A00
            X.4Fq r4 = r0.A04()
            android.content.ContentValues r5 = X.C18280x3.A09()     // Catch:{ all -> 0x0033 }
            X.C18270x1.A0a(r5, r8)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "show_mm_disclosure"
            boolean r0 = r7.A00     // Catch:{ all -> 0x0033 }
            X.AnonymousClass0x2.A0o(r5, r1, r0)     // Catch:{ all -> 0x0033 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0033 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "data_sharing_disclosure_metadata"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_DATA_SHARING_DISCLOSURE_METADATA"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x0033 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = "DataSharingDisclosureMetadataStore/insertOrUpdateMetadata rowId="
            X.C18260x0.A10(r0, r1, r8)     // Catch:{ all -> 0x0033 }
            r4.close()
            return
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47962e7.A01(X.2jD, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C51062jD A00(long r6) {
        /*
            r5 = this;
            X.3dV r0 = r5.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003c }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "SELECT show_mm_disclosure FROM data_sharing_disclosure_metadata WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C18260x0.A1b(r6)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "GET_DATA_SHARING_DISCLOSURE_METADATA_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x003c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "show_mm_disclosure"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0035 }
            boolean r0 = X.C382426h.A00(r2, r0)     // Catch:{ all -> 0x0035 }
            X.2jD r1 = new X.2jD     // Catch:{ all -> 0x0035 }
            r1.<init>(r0)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            r2.close()     // Catch:{ all -> 0x003c }
            r4.close()
            return r1
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47962e7.A00(long):X.2jD");
    }
}
