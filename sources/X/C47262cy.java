package X;

/* renamed from: X.2cy  reason: invalid class name and case insensitive filesystem */
public final class C47262cy {
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass1VX A02;
    public final C54132oE A03;
    public final C52682ls A04;
    public final AnonymousClass2X3 A05;
    public final C54972pa A06;
    public final AnonymousClass4FS A07;
    public final C34171uL A08;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0063, code lost:
        if (r2.A00.A0F() == false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00() {
        /*
            r15 = this;
            X.2pa r0 = r15.A06
            X.C626936e.A00()
            X.2op r9 = r0.A04
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackDBTableHelper/getDownloadableStickerPacks stickerPackId:"
            X.C18260x0.A0q(r0, r2, r1)
            java.lang.String r1 = "getDownloadableStickerPacks/QUERY"
            java.lang.String r0 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)"
            r7 = 0
            java.util.List r6 = r9.A01(r0, r1, r2)
            X.2X3 r11 = r15.A05
            java.util.Set r3 = r11.A00()
            java.util.Iterator r2 = r6.iterator()
        L_0x0024:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r2.next()
            X.C162457s7.A0D(r1)
            X.2iT r1 = (X.C50612iT) r1
            java.lang.String r0 = r1.A0G
            boolean r0 = r3.contains(r0)
            r1.A07 = r0
            goto L_0x0024
        L_0x003c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from db:"
            X.C18260x0.A1C(r0, r1, r6)
            X.2ls r2 = r15.A04
            X.33p r0 = r2.A02
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "sticker_store_backoff_time"
            long r12 = X.AnonymousClass0x2.A0B(r1, r0)
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            X.1ip r0 = r2.A00
            boolean r1 = r0.A0F()
            r0 = 1
            if (r1 != 0) goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x026b
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/getting sticker packs from web"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.HashMap r10 = X.AnonymousClass001.A0t()     // Catch:{ 3f4 -> 0x0261 }
            java.util.Iterator r3 = r6.iterator()     // Catch:{ 3f4 -> 0x0261 }
        L_0x0075:
            boolean r0 = r3.hasNext()     // Catch:{ 3f4 -> 0x0261 }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r1 = r3.next()     // Catch:{ 3f4 -> 0x0261 }
            X.C162457s7.A0D(r1)     // Catch:{ 3f4 -> 0x0261 }
            X.2iT r1 = (X.C50612iT) r1     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = r1.A0G     // Catch:{ 3f4 -> 0x0261 }
            X.C162457s7.A0D(r0)     // Catch:{ 3f4 -> 0x0261 }
            r10.put(r0, r1)     // Catch:{ 3f4 -> 0x0261 }
            goto L_0x0075
        L_0x008d:
            int r0 = r6.size()     // Catch:{ 3f4 -> 0x0261 }
            boolean r4 = X.AnonymousClass001.A1W(r0)
            X.2oE r12 = r15.A03     // Catch:{ 3f4 -> 0x0261 }
            X.2sr r0 = r12.A02     // Catch:{ 3f4 -> 0x0261 }
            com.whatsapp.Me r3 = X.C56972sr.A00(r0)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = "https://static.whatsapp.net/sticker?cat=all&lg="
            r1.append(r0)     // Catch:{ 3f4 -> 0x0261 }
            X.33j r0 = r12.A07     // Catch:{ 3f4 -> 0x0261 }
            java.util.Locale r0 = X.C620733j.A02(r0)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = r0.toLanguageTag()     // Catch:{ 3f4 -> 0x0261 }
            r1.append(r0)     // Catch:{ 3f4 -> 0x0261 }
            X.1VX r8 = r12.A08     // Catch:{ 3f4 -> 0x0261 }
            r0 = 6785(0x1a81, float:9.508E-42)
            X.2vE r5 = X.C58422vE.A02     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = r8.A0R(r5, r0)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 3f4 -> 0x0261 }
            if (r3 == 0) goto L_0x00d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = "&country="
            r1.append(r0)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = X.AnonymousClass0x9.A0w(r3)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ 3f4 -> 0x0261 }
        L_0x00d4:
            X.2hI r0 = r12.A0B     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r3 = r0.A00(r1)     // Catch:{ 3f4 -> 0x0261 }
            if (r4 == 0) goto L_0x00f0
            X.33p r0 = r12.A06     // Catch:{ 3f4 -> 0x0261 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = "sticker_store_etag"
            java.lang.String r0 = r1.getString(r0, r7)     // Catch:{ 3f4 -> 0x0261 }
        L_0x00e9:
            X.2MG r4 = r12.A01(r7, r3, r0)     // Catch:{ 3f4 -> 0x0261 }
            if (r4 != 0) goto L_0x00f2
            goto L_0x012d
        L_0x00f0:
            r0 = r7
            goto L_0x00e9
        L_0x00f2:
            X.33p r0 = r12.A06     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r3 = r4.A00     // Catch:{ 3f4 -> 0x0261 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r0 = "sticker_store_etag"
            X.C18270x1.A0j(r1, r0, r3)     // Catch:{ 3f4 -> 0x0261 }
            java.util.List r3 = r4.A01     // Catch:{ 3f4 -> 0x0261 }
            r0 = 6784(0x1a80, float:9.506E-42)
            org.json.JSONObject r4 = r8.A0T(r5, r0)     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r1 = "packs"
            boolean r0 = r4.has(r1)     // Catch:{ 3f4 -> 0x0261 }
            if (r0 == 0) goto L_0x012e
            org.json.JSONArray r0 = r4.getJSONArray(r1)     // Catch:{ IOException | JSONException -> 0x0126 }
            byte[] r0 = X.AnonymousClass0x9.A1R(r0)     // Catch:{ IOException | JSONException -> 0x0126 }
            java.io.ByteArrayInputStream r0 = X.AnonymousClass0x9.A0d(r0)     // Catch:{ IOException | JSONException -> 0x0126 }
            java.util.List r1 = X.C387428y.A00(r0)     // Catch:{ IOException | JSONException -> 0x0126 }
            r0 = 0
            r3.addAll(r0, r1)     // Catch:{ IOException | JSONException -> 0x0126 }
            goto L_0x012e
        L_0x0126:
            r1 = move-exception
            java.lang.String r0 = "maybeInjectTestStickerPack/failedInjection"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 3f4 -> 0x0261 }
            goto L_0x012e
        L_0x012d:
            r3 = r7
        L_0x012e:
            if (r3 == 0) goto L_0x026b
            java.util.Iterator r14 = r3.iterator()     // Catch:{ 3f4 -> 0x0261 }
        L_0x0134:
            boolean r0 = r14.hasNext()     // Catch:{ 3f4 -> 0x0261 }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r8 = r14.next()     // Catch:{ 3f4 -> 0x0261 }
            X.C162457s7.A0D(r8)     // Catch:{ 3f4 -> 0x0261 }
            X.2iT r8 = (X.C50612iT) r8     // Catch:{ 3f4 -> 0x0261 }
            java.lang.String r1 = r8.A0G     // Catch:{ 3f4 -> 0x0261 }
            X.C162457s7.A0D(r1)     // Catch:{ 3f4 -> 0x0261 }
            boolean r0 = r10.containsKey(r1)     // Catch:{ 3f4 -> 0x0261 }
            if (r0 == 0) goto L_0x0163
            java.lang.Object r5 = r10.get(r1)     // Catch:{ 3f4 -> 0x0261 }
            X.2iT r5 = (X.C50612iT) r5     // Catch:{ 3f4 -> 0x0261 }
            if (r5 == 0) goto L_0x0134
            java.lang.String r4 = r5.A03     // Catch:{ 3f4 -> 0x0261 }
            long r0 = r5.A01     // Catch:{ 3f4 -> 0x0261 }
            r8.A01 = r0     // Catch:{ 3f4 -> 0x0261 }
            r8.A03 = r4     // Catch:{ 3f4 -> 0x0261 }
            boolean r0 = r5.A07     // Catch:{ 3f4 -> 0x0261 }
        L_0x0160:
            r8.A07 = r0     // Catch:{ 3f4 -> 0x0261 }
            goto L_0x0134
        L_0x0163:
            int r0 = r10.size()     // Catch:{ 3f4 -> 0x0261 }
            if (r0 <= 0) goto L_0x0134
            X.8qC r0 = r11.A00     // Catch:{ 3f4 -> 0x0261 }
            X.4Fq r12 = X.C18630y0.A08(r0)     // Catch:{ 3f4 -> 0x0261 }
            android.content.ContentValues r13 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = "pack_id"
            X.2sg r5 = X.AnonymousClass3H0.A03(r13, r12, r0, r1)     // Catch:{ all -> 0x0188 }
            java.lang.String r4 = "new_sticker_packs"
            r1 = 5
            java.lang.String r0 = "markPackAsNew/INSERT_NEW_STICKER_PACK"
            r5.A0C(r4, r0, r13, r1)     // Catch:{ all -> 0x0188 }
            r12.close()     // Catch:{ 3f4 -> 0x0261 }
            r0 = 1
            goto L_0x0160
        L_0x0188:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x018d }
            goto L_0x0191
        L_0x018d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 3f4 -> 0x0261 }
        L_0x0191:
            throw r1     // Catch:{ 3f4 -> 0x0261 }
        L_0x0192:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ 3f4 -> 0x025e }
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/size of sticker packs from web:"
            X.C18260x0.A1C(r0, r1, r3)     // Catch:{ 3f4 -> 0x025e }
            X.C626936e.A00()     // Catch:{ 3f4 -> 0x025e }
            X.8qC r0 = r9.A01     // Catch:{ 3f4 -> 0x025e }
            X.4Fq r10 = X.C18630y0.A08(r0)     // Catch:{ 3f4 -> 0x025e }
            X.3Yo r9 = r10.Axl()     // Catch:{ all -> 0x0254 }
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x024a }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x024a }
            java.lang.String r5 = "downloadable_sticker_packs"
            java.lang.String r0 = "addAllToDownloadable/DELETE_DOWNLOADABLE_STICKER_PACK"
            r6.A07(r5, r7, r0, r7)     // Catch:{ all -> 0x024a }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x024a }
        L_0x01b8:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x023d
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x024a }
            X.2iT r7 = (X.C50612iT) r7     // Catch:{ all -> 0x024a }
            android.content.ContentValues r4 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x024a }
            java.lang.String r1 = r7.A0G     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "id"
            r4.put(r0, r1)     // Catch:{ all -> 0x024a }
            java.lang.String r1 = "name"
            java.lang.String r0 = r7.A0I     // Catch:{ all -> 0x024a }
            r4.put(r1, r0)     // Catch:{ all -> 0x024a }
            java.lang.String r1 = "description"
            java.lang.String r0 = r7.A0A     // Catch:{ all -> 0x024a }
            r4.put(r1, r0)     // Catch:{ all -> 0x024a }
            java.lang.String r1 = "publisher"
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x024a }
            r4.put(r1, r0)     // Catch:{ all -> 0x024a }
            long r0 = r7.A02     // Catch:{ all -> 0x024a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "size"
            r4.put(r0, r1)     // Catch:{ all -> 0x024a }
            java.lang.String r1 = "tray_image_id"
            java.lang.String r0 = r7.A0M     // Catch:{ all -> 0x024a }
            r4.put(r1, r0)     // Catch:{ all -> 0x024a }
            java.lang.String r1 = "tray_image_preview_id"
            java.lang.String r0 = r7.A0N     // Catch:{ all -> 0x024a }
            r4.put(r1, r0)     // Catch:{ all -> 0x024a }
            java.lang.String r1 = "image_data_hash"
            java.lang.String r0 = r7.A0H     // Catch:{ all -> 0x024a }
            r4.put(r1, r0)     // Catch:{ all -> 0x024a }
            java.util.List r0 = r7.A04     // Catch:{ all -> 0x024a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x024a }
            if (r0 != 0) goto L_0x021f
            java.lang.String r1 = ","
            java.util.List r0 = r7.A04     // Catch:{ all -> 0x024a }
            java.lang.String r1 = android.text.TextUtils.join(r1, r0)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "preview_image_id_array"
            r4.put(r0, r1)     // Catch:{ all -> 0x024a }
        L_0x021f:
            boolean r0 = r7.A0O     // Catch:{ all -> 0x024a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "animated_pack"
            r4.put(r0, r1)     // Catch:{ all -> 0x024a }
            boolean r0 = r7.A0U     // Catch:{ all -> 0x024a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = "lottie_pack"
            r4.put(r0, r1)     // Catch:{ all -> 0x024a }
            r1 = 5
            java.lang.String r0 = "insertStickerPackToDownloadableTable/INSERT_DOWNLOADABLE_STICKER_PACK"
            r6.A0C(r5, r0, r4, r1)     // Catch:{ all -> 0x024a }
            goto L_0x01b8
        L_0x023d:
            r9.A00()     // Catch:{ all -> 0x024a }
            r9.close()     // Catch:{ all -> 0x0254 }
            r10.close()     // Catch:{ 3f4 -> 0x025e }
            r2.A00()     // Catch:{ 3f4 -> 0x025e }
            return r3
        L_0x024a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x024f }
            goto L_0x0253
        L_0x024f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0254 }
        L_0x0253:
            throw r1     // Catch:{ all -> 0x0254 }
        L_0x0254:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0259 }
            goto L_0x025d
        L_0x0259:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 3f4 -> 0x025e }
        L_0x025d:
            throw r1     // Catch:{ 3f4 -> 0x025e }
        L_0x025e:
            r1 = move-exception
            r6 = r3
            goto L_0x0262
        L_0x0261:
            r1 = move-exception
        L_0x0262:
            java.lang.String r0 = "StickerStoreInventoryManager/fetchDownloadableStickerPacks/getStickerPacksInStoreIfUpdated failed"
            com.whatsapp.util.Log.e(r0, r1)
            r2.A01()
            return r6
        L_0x026b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47262cy.A00():java.util.List");
    }

    public C47262cy(C56612sH r2, AnonymousClass33p r3, AnonymousClass1VX r4, C54132oE r5, C52682ls r6, AnonymousClass2X3 r7, C54972pa r8, AnonymousClass4FS r9, C34171uL r10) {
        C18260x0.A0f(r2, r4, r9, r10, r8);
        C18260x0.A0W(r3, r7, r5);
        C162457s7.A0J(r6, 9);
        this.A00 = r2;
        this.A02 = r4;
        this.A07 = r9;
        this.A08 = r10;
        this.A06 = r8;
        this.A01 = r3;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
    }
}
