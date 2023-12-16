package X;

/* renamed from: X.2Wc  reason: invalid class name and case insensitive filesystem */
public class C44452Wc {
    public final C619032s A00;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C59552x6 A00(java.io.InputStream r11) {
        /*
            r10 = this;
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
            r2.<init>(r11)
        L_0x0005:
            java.util.zip.ZipEntry r0 = r2.getNextEntry()     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "metadata.json"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0005
            android.util.JsonReader r9 = X.C18300x5.A0D(r2)     // Catch:{ all -> 0x0110 }
            r9.beginObject()     // Catch:{ all -> 0x00fe }
            r6 = 0
            r5 = r6
            r1 = r6
            r4 = r6
        L_0x0023:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r3 = r9.nextName()     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "scheme"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x003b
            java.lang.String r6 = r9.nextString()     // Catch:{ all -> 0x00fe }
            goto L_0x0023
        L_0x003b:
            java.lang.String r0 = "data_id"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0048
            java.lang.String r5 = r9.nextString()     // Catch:{ all -> 0x00fe }
            goto L_0x0023
        L_0x0048:
            java.lang.String r0 = "source_id"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0056
            java.lang.String r4 = r9.nextString()     // Catch:{ all -> 0x00fe }
            goto L_0x0023
        L_0x0056:
            java.lang.String r0 = "key_id"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00ba
            r9.beginObject()     // Catch:{ all -> 0x00fe }
            r8 = 0
            r7 = r8
            r3 = r8
        L_0x0064:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = r9.nextName()     // Catch:{ all -> 0x00fe }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x00fe }
            switch(r0) {
                case -758621230: goto L_0x0079;
                case 351608024: goto L_0x0087;
                case 1091060704: goto L_0x0099;
                default: goto L_0x0075;
            }     // Catch:{ all -> 0x00fe }
        L_0x0075:
            r9.skipValue()     // Catch:{ all -> 0x00fe }
            goto L_0x0064
        L_0x0079:
            java.lang.String r0 = "server_salt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0075
            java.lang.String r3 = r9.nextString()     // Catch:{ all -> 0x00fe }
            goto L_0x0064
        L_0x0087:
            java.lang.String r0 = "version"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0075
            int r0 = r9.nextInt()     // Catch:{ all -> 0x00fe }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x0064
        L_0x0099:
            java.lang.String r0 = "account_hash"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0075
            java.lang.String r7 = r9.nextString()     // Catch:{ all -> 0x00fe }
            goto L_0x0064
        L_0x00a6:
            r9.endObject()     // Catch:{ all -> 0x00fe }
            if (r8 == 0) goto L_0x00c6
            if (r7 == 0) goto L_0x00bf
            if (r3 == 0) goto L_0x00f7
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x00fe }
            X.2Zs r1 = new X.2Zs     // Catch:{ all -> 0x00fe }
            r1.<init>(r0, r7, r3)     // Catch:{ all -> 0x00fe }
            goto L_0x0023
        L_0x00ba:
            r9.skipValue()     // Catch:{ all -> 0x00fe }
            goto L_0x0023
        L_0x00bf:
            java.lang.String r0 = "Invalid key info: account hash is missing."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x00fd
        L_0x00c6:
            java.lang.String r0 = "Invalid key info: version is missing."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x00fd
        L_0x00cd:
            r9.endObject()     // Catch:{ all -> 0x00fe }
            if (r6 == 0) goto L_0x00f0
            if (r5 == 0) goto L_0x00e9
            if (r1 == 0) goto L_0x00e2
            X.2x6 r0 = new X.2x6     // Catch:{ all -> 0x00fe }
            r0.<init>(r1, r6, r5, r4)     // Catch:{ all -> 0x00fe }
            r9.close()     // Catch:{ all -> 0x0110 }
            r2.close()
            return r0
        L_0x00e2:
            java.lang.String r0 = "Invalid metadata file: key info is missing."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x00fd
        L_0x00e9:
            java.lang.String r0 = "Invalid metadata file: data id is missing."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x00fd
        L_0x00f0:
            java.lang.String r0 = "Invalid metadata file: scheme is missing."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x00fd
        L_0x00f7:
            java.lang.String r0 = "Invalid key info: server salt is missing."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x00fe }
        L_0x00fd:
            throw r0     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0110 }
        L_0x0107:
            throw r1     // Catch:{ all -> 0x0110 }
        L_0x0108:
            java.lang.String r0 = "metadata.json was not found in zip file."
            java.io.FileNotFoundException r0 = X.C18330xA.A05(r0)     // Catch:{ all -> 0x0110 }
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0115 }
            throw r1
        L_0x0115:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44452Wc.A00(java.io.InputStream):X.2x6");
    }

    public C44452Wc(C619032s r1) {
        this.A00 = r1;
    }
}
