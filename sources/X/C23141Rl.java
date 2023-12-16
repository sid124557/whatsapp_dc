package X;

/* renamed from: X.1Rl  reason: invalid class name and case insensitive filesystem */
public class C23141Rl extends AnonymousClass31D {
    public final C56922sm A00;
    public final C52862mA A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        if (r3 != 30) goto L_0x0122;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x01a2 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0152 A[SYNTHETIC, Splitter:B:41:0x0152] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a6 A[Catch:{ SQLiteException -> 0x01bb, all -> 0x01c8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass32H A0D(android.database.Cursor r33) {
        /*
            r32 = this;
            r8 = r33
            int r30 = X.AnonymousClass0x7.A02(r8)
            java.lang.String r0 = "key_remote_jid"
            int r29 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_wa_type"
            int r28 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_name"
            int r27 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_url"
            int r26 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_duration"
            int r25 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "media_size"
            int r24 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r23 = "latitude"
            r0 = r23
            int r22 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r21 = "longitude"
            r0 = r21
            int r20 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = "thumb_image"
            int r19 = r8.getColumnIndexOrThrow(r0)
            r31 = r32
            X.4Fq r18 = X.AnonymousClass31D.A03(r31)
            r1 = -1
            r7 = 0
        L_0x004a:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x01c8 }
            if (r0 == 0) goto L_0x01c1
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x01c8 }
            r0 = r30
            long r1 = r8.getLong(r0)     // Catch:{ SQLiteException -> 0x01bb }
            X.C18270x1.A0a(r6, r1)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r29
            X.4uZ r5 = X.AnonymousClass0x2.A0K(r8, r0)     // Catch:{ SQLiteException -> 0x01bb }
            if (r5 == 0) goto L_0x004a
            r0 = r31
            X.2sm r0 = r0.A00     // Catch:{ SQLiteException -> 0x01bb }
            long r3 = r0.A07(r5)     // Catch:{ SQLiteException -> 0x01bb }
            r9 = 1
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x007d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteException -> 0x01bb }
            java.lang.String r0 = "LocationMessageStore/LocationMessageDatabaseMigration/processBatch/missing chat row_id; jid="
            X.C18260x0.A1Q(r3, r0, r5)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x004a
        L_0x007d:
            java.lang.String r0 = "chat_row_id"
            X.C18270x1.A0c(r6, r0, r3)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r22
            double r3 = r8.getDouble(r0)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r23
            X.C18300x5.A12(r6, r0, r3)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r20
            double r3 = r8.getDouble(r0)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r21
            X.C18300x5.A12(r6, r0, r3)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r28
            int r3 = r8.getInt(r0)     // Catch:{ SQLiteException -> 0x01bb }
            java.lang.String r15 = "live_location_sequence_number"
            java.lang.String r14 = "live_location_share_duration"
            java.lang.String r13 = "url"
            java.lang.String r17 = "live_location_final_timestamp"
            java.lang.String r10 = "live_location_final_longitude"
            java.lang.String r12 = "live_location_final_latitude"
            r16 = 1
            java.lang.String r11 = "place_name"
            r5 = 2
            java.lang.String r9 = "place_address"
            r0 = 5
            if (r3 == r0) goto L_0x00c0
            r0 = 16
            if (r3 == r0) goto L_0x00e3
            r0 = 30
            if (r3 == r0) goto L_0x00c0
            goto L_0x0122
        L_0x00c0:
            r0 = r27
            java.lang.String r4 = r8.getString(r0)     // Catch:{ SQLiteException -> 0x01bb }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x01bb }
            if (r0 == 0) goto L_0x0129
            r6.putNull(r11)     // Catch:{ SQLiteException -> 0x01bb }
        L_0x00cf:
            r6.putNull(r9)     // Catch:{ SQLiteException -> 0x01bb }
        L_0x00d2:
            r0 = r26
            X.AnonymousClass31D.A07(r6, r8, r13, r0)     // Catch:{ SQLiteException -> 0x01bb }
            r6.putNull(r14)     // Catch:{ SQLiteException -> 0x01bb }
            r6.putNull(r15)     // Catch:{ SQLiteException -> 0x01bb }
        L_0x00dd:
            r0 = r17
            X.C18310x6.A0w(r6, r12, r10, r0)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x0122
        L_0x00e3:
            X.C18310x6.A0w(r6, r11, r9, r13)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r25
            X.AnonymousClass31D.A06(r6, r8, r14, r0)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r24
            X.AnonymousClass31D.A06(r6, r8, r15, r0)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r27
            java.lang.String r3 = r8.getString(r0)     // Catch:{ SQLiteException -> 0x01bb }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x01bb }
            if (r0 != 0) goto L_0x00dd
            java.lang.String[] r9 = X.C18320x8.A1b(r3)     // Catch:{ SQLiteException -> 0x01bb }
            int r3 = r9.length     // Catch:{ SQLiteException -> 0x01bb }
            r0 = 4
            if (r3 != r0) goto L_0x0122
            r0 = r9[r16]     // Catch:{ SQLiteException -> 0x01bb }
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ SQLiteException -> 0x01bb }
            X.C18300x5.A12(r6, r12, r3)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r9[r5]     // Catch:{ SQLiteException -> 0x01bb }
            double r3 = java.lang.Double.parseDouble(r0)     // Catch:{ SQLiteException -> 0x01bb }
            X.C18300x5.A12(r6, r10, r3)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = 3
            r0 = r9[r0]     // Catch:{ SQLiteException -> 0x01bb }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = r17
            X.C18270x1.A0c(r6, r0, r3)     // Catch:{ SQLiteException -> 0x01bb }
        L_0x0122:
            r0 = r19
            byte[] r0 = r8.getBlob(r0)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x014d
        L_0x0129:
            r0 = 10
            int r3 = r4.indexOf(r0)     // Catch:{ SQLiteException -> 0x01bb }
            r0 = -1
            if (r3 != r0) goto L_0x0136
            r6.put(r11, r4)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x00cf
        L_0x0136:
            java.lang.String r0 = X.AnonymousClass0x7.A0r(r4, r3)     // Catch:{ SQLiteException -> 0x01bb }
            r6.put(r11, r0)     // Catch:{ SQLiteException -> 0x01bb }
            int r0 = r4.length()     // Catch:{ SQLiteException -> 0x01bb }
            if (r0 <= r3) goto L_0x00cf
            int r0 = r3 + 1
            java.lang.String r0 = r4.substring(r0)     // Catch:{ SQLiteException -> 0x01bb }
            r6.put(r9, r0)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x00d2
        L_0x014d:
            java.lang.String r4 = "map_download_status"
            if (r0 != 0) goto L_0x0152
            goto L_0x01a6
        L_0x0152:
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ Exception -> 0x01a2 }
            java.io.ObjectInputStream r9 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x01a2 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x01a2 }
            java.lang.Object r3 = r9.readObject()     // Catch:{ all -> 0x0198 }
            boolean r0 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0169
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0198 }
            r6.put(r4, r3)     // Catch:{ all -> 0x0198 }
            goto L_0x0194
        L_0x0169:
            boolean r0 = r3 instanceof X.AnonymousClass33C     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x017f
            boolean r0 = r3 instanceof com.whatsapp.MediaData     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0191
            com.whatsapp.MediaData r3 = (com.whatsapp.MediaData) r3     // Catch:{ all -> 0x0198 }
            X.33C r3 = X.AnonymousClass33C.A00(r3)     // Catch:{ all -> 0x0198 }
        L_0x0177:
            boolean r0 = r3.A0R     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0182
            X.C18270x1.A0b(r6, r4, r5)     // Catch:{ all -> 0x0198 }
            goto L_0x0194
        L_0x017f:
            X.33C r3 = (X.AnonymousClass33C) r3     // Catch:{ all -> 0x0198 }
            goto L_0x0177
        L_0x0182:
            boolean r0 = r3.A0c     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x018c
            r0 = r16
            X.C18270x1.A0b(r6, r4, r0)     // Catch:{ all -> 0x0198 }
            goto L_0x0194
        L_0x018c:
            r0 = 0
            X.C18270x1.A0b(r6, r4, r0)     // Catch:{ all -> 0x0198 }
            goto L_0x0194
        L_0x0191:
            X.C18270x1.A0b(r6, r4, r5)     // Catch:{ all -> 0x0198 }
        L_0x0194:
            r9.close()     // Catch:{ Exception -> 0x01a2 }
            goto L_0x01a9
        L_0x0198:
            r3 = move-exception
            r9.close()     // Catch:{ all -> 0x019d }
            goto L_0x01a1
        L_0x019d:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ Exception -> 0x01a2 }
        L_0x01a1:
            throw r3     // Catch:{ Exception -> 0x01a2 }
        L_0x01a2:
            X.C18270x1.A0b(r6, r4, r5)     // Catch:{ SQLiteException -> 0x01bb }
            goto L_0x01a9
        L_0x01a6:
            X.C18270x1.A0b(r6, r4, r5)     // Catch:{ SQLiteException -> 0x01bb }
        L_0x01a9:
            r0 = r18
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ SQLiteException -> 0x01bb }
            X.2sg r4 = r0.A03     // Catch:{ SQLiteException -> 0x01bb }
            java.lang.String r3 = "message_location"
            java.lang.String r0 = "INSERT_MESSAGE_LOCATION_SQL"
            r4.A09(r3, r0, r6)     // Catch:{ SQLiteException -> 0x01bb }
            int r7 = r7 + 1
            goto L_0x004a
        L_0x01bb:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x01c8 }
            goto L_0x004a
        L_0x01c1:
            r0 = r18
            X.32H r0 = X.AnonymousClass31D.A04(r0, r7, r1)
            return r0
        L_0x01c8:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x01cd }
            throw r1
        L_0x01cd:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23141Rl.A0D(android.database.Cursor):X.32H");
    }

    public C23141Rl(C56922sm r3, C52862mA r4, AnonymousClass2U4 r5) {
        super(r5, "message_location", 2);
        this.A00 = r3;
        this.A01 = r4;
    }
}
