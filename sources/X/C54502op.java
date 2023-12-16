package X;

import java.util.List;

/* renamed from: X.2op  reason: invalid class name and case insensitive filesystem */
public class C54502op {
    public final C55682qk A00;
    public final C183538qC A01;

    public C54502op(C55682qk r1, C183538qC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final List A00(int i) {
        C18260x0.A0w("StickerPackDBTableHelper/getInstalledStickerPacks typeFilter:", AnonymousClass001.A0o(), i);
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        }
        String[] strArr = new String[1];
        C18280x3.A1Q(strArr, i2, 0);
        return A01("SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_is_avatar_pack = ?", "getInstalledStickerPacks/QUERY", strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ea, code lost:
        if (android.text.TextUtils.isEmpty(r17) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fa, code lost:
        if (android.text.TextUtils.isEmpty(r15) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010a, code lost:
        if (android.text.TextUtils.isEmpty(r14) == false) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01c6 A[Catch:{ all -> 0x01d9, all -> 0x01e0, all -> 0x01e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01cb A[Catch:{ all -> 0x01d9, all -> 0x01e0, all -> 0x01e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.lang.String r38, java.lang.String r39, java.lang.String[] r40) {
        /*
            r37 = this;
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            r36 = r37
            r0 = r36
            X.8qC r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x01ef }
            X.4GK r35 = X.C18630y0.A04(r0)     // Catch:{ IllegalArgumentException -> 0x01ef }
            r3 = r38
            r2 = r39
            r1 = r40
            r0 = r35
            android.database.Cursor r11 = X.C56862sg.A03(r0, r3, r2, r1)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "id"
            int r34 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "name"
            int r33 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "publisher"
            int r32 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "description"
            int r31 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "size"
            int r30 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "tray_image_id"
            int r29 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "tray_image_preview_id"
            int r28 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "preview_image_id_array"
            int r27 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "image_data_hash"
            int r26 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "animated_pack"
            int r25 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "lottie_pack"
            int r24 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_id"
            int r23 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_name"
            int r22 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_publisher"
            int r21 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_description"
            int r20 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_size"
            int r19 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_image_data_hash"
            int r18 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_tray_image_id"
            int r9 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_tray_image_preview_id"
            int r8 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_animated_pack"
            int r7 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_is_avatar_pack"
            int r6 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_lottie_pack"
            int r5 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_empty_recents_avatar_template_id"
            int r4 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = "installed_empty_favorites_avatar_template_id"
            int r3 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d9 }
        L_0x00b0:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x01d2
            X.2db r2 = new X.2db     // Catch:{ all -> 0x01d9 }
            r2.<init>()     // Catch:{ all -> 0x01d9 }
            r0 = r34
            java.lang.String r13 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r0 = r33
            java.lang.String r12 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r0 = r32
            java.lang.String r1 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r0 = r23
            java.lang.String r17 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r0 = r22
            java.lang.String r15 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r0 = r21
            java.lang.String r14 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x00ec
            boolean r16 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x01d9 }
            r0 = 1
            if (r16 != 0) goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            if (r0 != 0) goto L_0x01c3
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x00fc
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x01d9 }
            r0 = 1
            if (r16 != 0) goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            if (r0 != 0) goto L_0x01c3
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x010c
            boolean r16 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x01d9 }
            r0 = 1
            if (r16 != 0) goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            if (r0 != 0) goto L_0x01c3
            r2.A0E = r13     // Catch:{ all -> 0x01d9 }
            r2.A0G = r12     // Catch:{ all -> 0x01d9 }
            r2.A0I = r1     // Catch:{ all -> 0x01d9 }
            r0 = r31
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r2.A03 = r0     // Catch:{ all -> 0x01d9 }
            r0 = r30
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x01d9 }
            long r0 = (long) r0     // Catch:{ all -> 0x01d9 }
            r2.A01 = r0     // Catch:{ all -> 0x01d9 }
            r0 = r29
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r2.A0K = r0     // Catch:{ all -> 0x01d9 }
            r0 = r26
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r2.A0F = r0     // Catch:{ all -> 0x01d9 }
            r0 = r28
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r2.A0L = r0     // Catch:{ all -> 0x01d9 }
            r0 = r25
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x01d9 }
            r13 = 0
            r12 = 1
            boolean r0 = X.AnonymousClass000.A1U(r0, r12)
            r2.A0O = r0     // Catch:{ all -> 0x01d9 }
            r0 = r24
            boolean r0 = X.C626135u.A03(r11, r0)     // Catch:{ all -> 0x01d9 }
            r2.A0U = r0     // Catch:{ all -> 0x01d9 }
            r0 = r27
            java.lang.String r1 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x016c
            java.lang.String r0 = ","
            java.lang.String[] r0 = android.text.TextUtils.split(r1, r0)     // Catch:{ all -> 0x01d9 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x01d9 }
            r2.A0M = r0     // Catch:{ all -> 0x01d9 }
        L_0x016c:
            r0 = r17
            r2.A05 = r0     // Catch:{ all -> 0x01d9 }
            r2.A07 = r15     // Catch:{ all -> 0x01d9 }
            r0 = r20
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r2.A04 = r0     // Catch:{ all -> 0x01d9 }
            r2.A08 = r14     // Catch:{ all -> 0x01d9 }
            r0 = r18
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x01d9 }
            r2.A06 = r0     // Catch:{ all -> 0x01d9 }
            r0 = r19
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x01d9 }
            long r0 = (long) r0     // Catch:{ all -> 0x01d9 }
            r2.A00 = r0     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r11.getString(r9)     // Catch:{ all -> 0x01d9 }
            r2.A09 = r0     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r11.getString(r8)     // Catch:{ all -> 0x01d9 }
            r2.A0A = r0     // Catch:{ all -> 0x01d9 }
            int r0 = r11.getInt(r7)     // Catch:{ all -> 0x01d9 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r12)
            r2.A0Q = r0     // Catch:{ all -> 0x01d9 }
            int r0 = r11.getInt(r6)     // Catch:{ all -> 0x01d9 }
            if (r0 != r12) goto L_0x01aa
            r13 = 1
        L_0x01aa:
            r2.A0R = r13     // Catch:{ all -> 0x01d9 }
            boolean r0 = X.C626135u.A03(r11, r5)     // Catch:{ all -> 0x01d9 }
            r2.A0S = r0     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r11.getString(r3)     // Catch:{ all -> 0x01d9 }
            r2.A0B = r0     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r11.getString(r4)     // Catch:{ all -> 0x01d9 }
            r2.A0C = r0     // Catch:{ all -> 0x01d9 }
            X.2iT r0 = r2.A00()     // Catch:{ all -> 0x01d9 }
            goto L_0x01c4
        L_0x01c3:
            r0 = 0
        L_0x01c4:
            if (r0 == 0) goto L_0x01cb
            r10.add(r0)     // Catch:{ all -> 0x01d9 }
            goto L_0x00b0
        L_0x01cb:
            java.lang.String r0 = "StickerPackDBTableHelper/readStickerPackListFromDBTable/sticker pack is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01d9 }
            goto L_0x00b0
        L_0x01d2:
            r11.close()     // Catch:{ all -> 0x01e5 }
            r35.close()     // Catch:{ IllegalArgumentException -> 0x01ef }
            return r10
        L_0x01d9:
            r1 = move-exception
            if (r11 == 0) goto L_0x01e4
            r11.close()     // Catch:{ all -> 0x01e0 }
            goto L_0x01e4
        L_0x01e0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01e5 }
        L_0x01e4:
            throw r1     // Catch:{ all -> 0x01e5 }
        L_0x01e5:
            r1 = move-exception
            r35.close()     // Catch:{ all -> 0x01ea }
            goto L_0x01ee
        L_0x01ea:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x01ef }
        L_0x01ee:
            throw r1     // Catch:{ IllegalArgumentException -> 0x01ef }
        L_0x01ef:
            r3 = move-exception
            java.lang.String r0 = "StickerPackDBTableHelper/readStickerPackListFromDBTable/exception"
            com.whatsapp.util.Log.e(r0, r3)
            r0 = r36
            X.2qk r2 = r0.A00
            java.lang.String r1 = "StickerPackDBTableHelper/readStickerPackListFromDBTable/"
            java.lang.String r0 = r3.getMessage()
            r2.A09(r1, r0, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54502op.A01(java.lang.String, java.lang.String, java.lang.String[]):java.util.List");
    }
}
