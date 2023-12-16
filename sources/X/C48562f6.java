package X;

/* renamed from: X.2f6  reason: invalid class name and case insensitive filesystem */
public final class C48562f6 {
    public final C72303dV A00;
    public final AnonymousClass1VX A01;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C624134x r8) {
        /*
            r7 = this;
            r5 = 0
            X.1VX r2 = r7.A01
            r1 = 5718(0x1656, float:8.013E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0081
            X.3dV r0 = r7.A00     // Catch:{ all -> 0x0071 }
            X.4GK r4 = r0.get()     // Catch:{ all -> 0x0071 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006a }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "SELECT reporting_tag, reporting_token_content, version FROM reporting_token WHERE message_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x006a }
            X.C624134x.A0Y(r8, r1, r5)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "GET_REPORTING_TOKEN_INFO"
            android.database.Cursor r5 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x006a }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x0063 }
            r6 = 0
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "reporting_token_content"
            byte[] r3 = X.C18280x3.A1Z(r5, r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "reporting_tag"
            byte[] r2 = X.C18280x3.A1Z(r5, r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "version"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0063 }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x004d
            java.lang.Integer r6 = X.C18300x5.A0a(r5, r1)     // Catch:{ all -> 0x0063 }
        L_0x004d:
            if (r2 == 0) goto L_0x005a
            int r0 = r2.length     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005a
            X.2lp r0 = new X.2lp     // Catch:{ all -> 0x0063 }
            r0.<init>(r6, r2, r3)     // Catch:{ all -> 0x0063 }
            r8.A1S(r0)     // Catch:{ all -> 0x0063 }
        L_0x005a:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0063 }
            r5.close()     // Catch:{ all -> 0x006a }
            r4.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0076
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x0076:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "ReportingTokenStore/failed to retrieve message reporting token data"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48562f6.A01(X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r7) {
        /*
            r6 = this;
            X.1VX r2 = r6.A01
            r1 = 5718(0x1656, float:8.013E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0063
            X.2lp r2 = r7.A0g
            if (r2 == 0) goto L_0x0063
            X.3dV r0 = r6.A00     // Catch:{ all -> 0x0053 }
            X.4Fq r4 = r0.A04()     // Catch:{ all -> 0x0053 }
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x004c }
            X.C624134x.A0H(r5, r7)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "version"
            java.lang.Integer r0 = r2.A00     // Catch:{ all -> 0x004c }
            r5.put(r1, r0)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "reporting_token_content"
            byte[] r0 = r2.A02     // Catch:{ all -> 0x004c }
            r5.put(r1, r0)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "reporting_tag"
            byte[] r0 = r2.A01     // Catch:{ all -> 0x004c }
            r5.put(r1, r0)     // Catch:{ all -> 0x004c }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004c }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "reporting_token"
            r1 = 5
            java.lang.String r0 = "ReportingTokenStore/insertMessage"
            long r0 = r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x004c }
            r4.close()     // Catch:{ all -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0058
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x0058:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "ReportingTokenStore/failed to insert message reporting token data"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48562f6.A00(X.34x):void");
    }

    public C48562f6(C72303dV r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
