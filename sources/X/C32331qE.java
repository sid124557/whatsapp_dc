package X;

/* renamed from: X.1qE  reason: invalid class name and case insensitive filesystem */
public final class C32331qE extends C34021u6 {
    public final /* synthetic */ C32361qH A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32331qE(C32361qH r3) {
        super(r3, true, false, false);
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        if (r2 == false) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G() {
        /*
            r13 = this;
            X.1qH r4 = r13.A00
            X.1R1 r0 = r4.A03
            X.32y r2 = r0.A0Q
            X.2oU r0 = r0.A0E
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "chatsettings.db"
            java.io.File r1 = r1.getDatabasePath(r0)
            java.lang.String r0 = "chat_setting_store"
            int r1 = r2.A03(r1, r0)
            r0 = 19
            boolean r5 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully replaced chat setting "
            X.C18260x0.A1E(r0, r1, r5)
            X.34u r0 = r4.A04
            boolean r2 = r0.A0F()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully replaced wall paper "
            X.C18260x0.A1E(r0, r1, r2)
            X.1Qz r6 = r4.A05
            monitor-enter(r6)
            X.2eK r0 = r6.A04     // Catch:{ IOException -> 0x00bf }
            X.2gw r1 = r0.A00     // Catch:{ IOException -> 0x00bf }
            java.lang.String r0 = ""
            java.io.File r2 = r1.A00(r0)     // Catch:{ IOException -> 0x00bf }
            X.32y r1 = r6.A05     // Catch:{ IOException -> 0x00bf }
            java.lang.String r0 = "sticker_store"
            int r1 = r1.A03(r2, r0)     // Catch:{ IOException -> 0x00bf }
            r0 = 19
            if (r1 != r0) goto L_0x00c5
            X.2oU r0 = r6.A03     // Catch:{ all -> 0x01ca }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x01ca }
            boolean r3 = r6.A0F(r0, r2)     // Catch:{ all -> 0x01ca }
            if (r3 == 0) goto L_0x00c8
            X.2oq r0 = r6.A06     // Catch:{ all -> 0x01ca }
            java.lang.String r8 = "/com.whatsapp/"
            java.lang.String r2 = "/com.whatsapp.w4b/"
            X.8qC r0 = r0.A01     // Catch:{ all -> 0x01ca }
            X.4Fq r10 = X.C18630y0.A08(r0)     // Catch:{ all -> 0x01ca }
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x00b5 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00ab }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = "UPDATE stickers SET file_path = REPLACE(file_path, ?, ?);"
            java.lang.String r0 = "UPDATE_STICKER_TABLE_FILE_PATH"
            X.2sQ r1 = r7.A0G(r1, r0)     // Catch:{ all -> 0x00ab }
            r0 = 1
            r1.A07(r0, r8)     // Catch:{ all -> 0x00ab }
            r0 = 2
            r1.A07(r0, r2)     // Catch:{ all -> 0x00ab }
            r1.A00()     // Catch:{ all -> 0x00ab }
            r9.A00()     // Catch:{ all -> 0x00ab }
            r9.close()     // Catch:{ all -> 0x00b5 }
            r10.close()     // Catch:{ all -> 0x01ca }
            X.2rq r0 = r6.A01     // Catch:{ all -> 0x01ca }
            X.2Y6 r0 = r0.A03     // Catch:{ all -> 0x01ca }
            X.3dV r0 = r0.A01     // Catch:{ all -> 0x01ca }
            X.4Fq r10 = r0.A04()     // Catch:{ all -> 0x01ca }
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00b5 }
            X.AnonymousClass000.A16(r8, r2, r7)     // Catch:{ all -> 0x00b5 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b5 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = "UPDATE media_refs SET path = REPLACE (path, ?, ?);"
            java.lang.String r0 = "MEDIA_REFS_CHANGE_PATH_SQL"
            r2.A0I(r1, r0, r7)     // Catch:{ all -> 0x00b5 }
            r10.close()     // Catch:{ all -> 0x01ca }
            goto L_0x00c8
        L_0x00ab:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00b4
        L_0x00b0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b5 }
        L_0x00b4:
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00ba }
            goto L_0x00be
        L_0x00ba:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ca }
        L_0x00be:
            throw r1     // Catch:{ all -> 0x01ca }
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "StickerDBStorage/getFileToRestoreFrom: failed to copy sticker file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01ca }
        L_0x00c5:
            monitor-exit(r6)
            r3 = 0
            goto L_0x00c9
        L_0x00c8:
            monitor-exit(r6)
        L_0x00c9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored stickers "
            X.C18260x0.A1E(r0, r1, r3)
            X.32y r7 = r4.A02
            X.33p r2 = r7.A03
            java.lang.String r6 = r2.A0Z()
            java.lang.String r1 = r2.A0b()
            java.lang.String r0 = "share_preferences"
            android.net.Uri r8 = X.C619632y.A00(r0, r6, r1)
            X.33i r0 = r7.A01
            X.5UR r7 = r0.A0R()
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            android.database.Cursor r7 = r7.A03(r8, r9, r10, r11, r12)
            r8 = 0
            if (r7 != 0) goto L_0x0117
            r2 = 0
        L_0x00f8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored some shared preferences setting "
            X.C18260x0.A1E(r0, r1, r2)
            if (r5 == 0) goto L_0x0109
            if (r3 == 0) goto L_0x0109
            r0 = 1
            if (r2 != 0) goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            X.2QW r1 = r4.A01
            r0 = r0 ^ 1
            X.1au r1 = r1.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            return
        L_0x0117:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x01c0 }
            r1 = 1
            if (r0 == 0) goto L_0x01ba
            r0 = 2
            java.lang.String r9 = r7.getString(r0)     // Catch:{ all -> 0x01c0 }
            java.lang.String r6 = r7.getString(r8)     // Catch:{ all -> 0x01c0 }
            int r0 = r9.hashCode()     // Catch:{ all -> 0x01c0 }
            switch(r0) {
                case -1572742348: goto L_0x0177;
                case -891985903: goto L_0x0162;
                case 104431: goto L_0x0152;
                case 3327612: goto L_0x0142;
                case 64711720: goto L_0x012f;
                default: goto L_0x012e;
            }     // Catch:{ all -> 0x01c0 }
        L_0x012e:
            goto L_0x0117
        L_0x012f:
            java.lang.String r0 = "boolean"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0117
            int r0 = r7.getInt(r1)     // Catch:{ all -> 0x01c0 }
            if (r0 == r1) goto L_0x013e
            r1 = 0
        L_0x013e:
            X.C18270x1.A0v(r2, r6, r1)     // Catch:{ all -> 0x01c0 }
            goto L_0x0117
        L_0x0142:
            java.lang.String r0 = "long"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0117
            long r0 = r7.getLong(r1)     // Catch:{ all -> 0x01c0 }
            X.C18260x0.A0M(r2, r6, r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0117
        L_0x0152:
            java.lang.String r0 = "int"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0117
            int r0 = r7.getInt(r1)     // Catch:{ all -> 0x01c0 }
            X.C18260x0.A0L(r2, r6, r0)     // Catch:{ all -> 0x01c0 }
            goto L_0x0117
        L_0x0162:
            java.lang.String r0 = "string"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0117
            java.lang.String r1 = r7.getString(r1)     // Catch:{ all -> 0x01c0 }
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r2)     // Catch:{ all -> 0x01c0 }
            X.C18270x1.A0j(r0, r6, r1)     // Catch:{ all -> 0x01c0 }
            goto L_0x0117
        L_0x0177:
            java.lang.String r0 = "string_set"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = r7.getString(r1)     // Catch:{ JSONException -> 0x01ae }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01ae }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x01ae }
            int r0 = r10.length()     // Catch:{ JSONException -> 0x01ae }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ JSONException -> 0x01ae }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x01ae }
            r1 = 0
        L_0x0193:
            int r0 = r10.length()     // Catch:{ JSONException -> 0x01ae }
            if (r1 >= r0) goto L_0x01a5
            java.lang.Object r0 = r10.get(r1)     // Catch:{ JSONException -> 0x01ae }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01ae }
            r9.add(r0)     // Catch:{ JSONException -> 0x01ae }
            int r1 = r1 + 1
            goto L_0x0193
        L_0x01a5:
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r2)     // Catch:{ JSONException -> 0x01ae }
            X.C18300x5.A15(r0, r6, r9)     // Catch:{ JSONException -> 0x01ae }
            goto L_0x0117
        L_0x01ae:
            r9 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/replaceSharedPreferencesSetting/ failed to create json array for key: "
            X.C18260x0.A0u(r0, r6, r1, r9)     // Catch:{ all -> 0x01c0 }
            goto L_0x0117
        L_0x01ba:
            r7.close()
            r2 = 1
            goto L_0x00f8
        L_0x01c0:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x01c5 }
            throw r1
        L_0x01c5:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331qE.A0G():void");
    }
}
