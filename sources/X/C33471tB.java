package X;

import java.util.Collection;

/* renamed from: X.1tB  reason: invalid class name and case insensitive filesystem */
public class C33471tB extends AnonymousClass5ZM {
    public final AnonymousClass4AY A00;
    public final AnonymousClass2SZ A01;
    public final boolean A02 = true;
    public final /* synthetic */ AnonymousClass2QZ A03;

    public C33471tB(AnonymousClass4AY r2, AnonymousClass2QZ r3, AnonymousClass2SZ r4) {
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c0, code lost:
        if (r7 != null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            r2 = r16
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.C626936e.A06(r2)
            int r0 = r2.length
            r1 = 0
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.C626936e.A0B(r0)
            X.2SZ r3 = r15.A01
            r4 = r2[r1]
            boolean r2 = r15.A02
            java.lang.String r0 = "StickerContextualSuggestionStore fetchMatchingStickersByTextFromDb"
            X.33M r6 = X.AnonymousClass33M.A01(r0)
            X.3Pp r1 = r3.A02
            r0 = 200(0xc8, float:2.8E-43)
            java.util.List r12 = r1.A01(r4, r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Found and parsed emojis:"
            X.AnonymousClass000.A1H(r0, r1, r12)
            java.lang.String r0 = r1.toString()
            r6.A08(r0)
            boolean r1 = r12.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0040
            java.util.ArrayList r0 = X.AnonymousClass002.A0I(r0)
            return r0
        L_0x0040:
            java.util.LinkedHashSet r5 = X.AnonymousClass0x9.A17()
            java.lang.String r0 = "Start search for stickers"
            r6.A08(r0)
            int r1 = r12.size()
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SELECT plaintext_hash, from_third_party_pack_db, sticker_pack_identifier, hash_of_image_part FROM (SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10001 as primary_ordering, entry_weight as secondary_ordering, hash_of_image_part as hash_of_image_part, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10000 as primary_ordering, timestamp as secondary_ordering, hash_of_image_part as hash_of_image_part, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM starred_stickers UNION SELECT plain_file_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, sticker_pack_order.sticker_pack_id as sticker_pack_identifier, 0 as from_third_party_pack_db FROM stickers LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=stickers.sticker_pack_id UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, (third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) as sticker_pack_identifier, 1 as from_third_party_pack_db FROM third_party_sticker_emoji_mapping LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=(third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) LEFT JOIN third_party_whitelist_packs ON third_party_sticker_emoji_mapping.sticker_pack_id=third_party_whitelist_packs.sticker_pack_id WHERE avoid_cache = 0 ) WHERE emojis LIKE "
            r2.append(r0)
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)
            java.lang.String r0 = " OR emojis LIKE "
            X.C18310x6.A1G(r0, r1, r2)
            java.lang.String r0 = " GROUP BY "
            r2.append(r0)
            java.lang.String r9 = "plaintext_hash"
            r2.append(r9)
            java.lang.String r0 = " ORDER BY primary_ordering DESC, secondary_ordering DESC "
            r2.append(r0)
            java.lang.String r0 = " LIMIT 500"
            java.lang.String r11 = X.AnonymousClass000.A0X(r0, r2)
            r8 = 1
            X.8qC r0 = r3.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d5 }
            X.4GK r14 = X.C18630y0.A04(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d5 }
            r0 = r14
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01cb }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x01cb }
            int r7 = r12.size()     // Catch:{ all -> 0x01cb }
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ all -> 0x01cb }
            r2 = 0
        L_0x008a:
            if (r2 >= r7) goto L_0x00a8
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cb }
            java.lang.String r1 = "%"
            r13.append(r1)     // Catch:{ all -> 0x01cb }
            java.lang.Object r0 = r12.get(r2)     // Catch:{ all -> 0x01cb }
            X.5Zv r0 = (X.C106655Zv) r0     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r1, r13)     // Catch:{ all -> 0x01cb }
            r4[r2] = r0     // Catch:{ all -> 0x01cb }
            int r2 = r2 + 1
            goto L_0x008a
        L_0x00a8:
            java.lang.String r0 = "DISTINCT_SYMBOL_FROM_STICKER_SUGGESTION_SEARCH_TAG"
            android.database.Cursor r7 = r10.A0E(r11, r0, r4)     // Catch:{ all -> 0x01cb }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "Found stickers:"
            int r0 = X.AnonymousClass0x9.A02(r7, r0, r1)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x01bf }
            r6.A08(r0)     // Catch:{ all -> 0x01bf }
            int r0 = r7.getCount()     // Catch:{ all -> 0x01bf }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x01bf }
            r4.<init>(r0)     // Catch:{ all -> 0x01bf }
        L_0x00c8:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x01a1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "Sticker #"
            r1.append(r0)     // Catch:{ all -> 0x01bf }
            int r0 = r7.getPosition()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x01bf }
            r6.A08(r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r10 = X.AnonymousClass0x2.A0Z(r7, r9)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "from_third_party_pack_db"
            int r0 = X.AnonymousClass0x2.A04(r7, r0)     // Catch:{ all -> 0x01bf }
            boolean r12 = X.AnonymousClass000.A1S(r0)
            java.lang.String r0 = "sticker_pack_identifier"
            java.lang.String r1 = X.AnonymousClass0x2.A0Z(r7, r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "hash_of_image_part"
            java.lang.String r2 = X.AnonymousClass0x2.A0Z(r7, r0)     // Catch:{ all -> 0x01bf }
            boolean r0 = r4.contains(r2)     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x00c8
            boolean r0 = X.C107575bX.A0F(r2)     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x010c
            r4.add(r2)     // Catch:{ all -> 0x01bf }
        L_0x010c:
            X.39M r2 = new X.39M     // Catch:{ all -> 0x01bf }
            r2.<init>()     // Catch:{ all -> 0x01bf }
            r2.A0D = r10     // Catch:{ all -> 0x01bf }
            X.2rq r0 = r3.A01     // Catch:{ all -> 0x01bf }
            java.io.File r11 = r0.A02(r10)     // Catch:{ all -> 0x01bf }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = "Sticker file stored internally"
            r6.A08(r0)     // Catch:{ all -> 0x01bf }
            X.AnonymousClass39M.A01(r2, r11)     // Catch:{ all -> 0x01bf }
            r2.A01 = r8     // Catch:{ all -> 0x01bf }
            X.2qp r1 = r3.A03     // Catch:{ all -> 0x01bf }
            r0 = 0
            X.330 r0 = r1.A02(r11, r0)     // Catch:{ all -> 0x01bf }
            r2.A04 = r0     // Catch:{ all -> 0x01bf }
            r1.A04(r2)     // Catch:{ all -> 0x01bf }
            r5.add(r2)     // Catch:{ all -> 0x01bf }
            goto L_0x00c8
        L_0x0139:
            java.lang.String r0 = "Sticker file not managed internally"
            r6.A08(r0)     // Catch:{ all -> 0x01bf }
            if (r12 == 0) goto L_0x00c8
            if (r1 == 0) goto L_0x00c8
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x00c8
            java.lang.String r0 = " "
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00c8
            android.util.Pair r0 = X.AnonymousClass336.A00(r1)     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00c8
            android.util.Pair r11 = X.AnonymousClass336.A00(r1)     // Catch:{ all -> 0x01bf }
            X.C626936e.A06(r11)     // Catch:{ all -> 0x01bf }
            X.2zE r2 = r3.A04     // Catch:{ all -> 0x01bf }
            java.lang.Object r1 = r11.first     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r11.second     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01bf }
            monitor-enter(r2)     // Catch:{ all -> 0x01bf }
            java.io.File r0 = r2.A00(r1, r0)     // Catch:{ all -> 0x019e }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x019e }
            monitor-exit(r2)     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x0197
            java.lang.Object r1 = r11.first     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r11.second     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01bf }
            monitor-enter(r2)     // Catch:{ all -> 0x01bf }
            java.util.List r1 = r2.A01(r1, r0, r10)     // Catch:{ all -> 0x019e }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x019e }
            if (r0 != 0) goto L_0x018e
            java.lang.Object r0 = X.C18290x4.A0k(r1)     // Catch:{ all -> 0x019e }
            X.39M r0 = (X.AnonymousClass39M) r0     // Catch:{ all -> 0x019e }
            monitor-exit(r2)     // Catch:{ all -> 0x01bf }
            goto L_0x0190
        L_0x018e:
            monitor-exit(r2)     // Catch:{ all -> 0x01bf }
            r0 = 0
        L_0x0190:
            if (r0 == 0) goto L_0x00c8
            r5.add(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x00c8
        L_0x0197:
            java.lang.String r0 = "File not in cache, skipping"
            r6.A08(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x00c8
        L_0x019e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01a1:
            r7.close()     // Catch:{ all -> 0x01cb }
            r14.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d5 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Finished parsing stickers:"
            X.C18260x0.A19(r0, r1, r5)
            java.lang.String r0 = r1.toString()
            r6.A08(r0)
            r6.A07()
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r5)
            return r0
        L_0x01bf:
            r1 = move-exception
            if (r7 == 0) goto L_0x01ca
            r7.close()     // Catch:{ all -> 0x01c6 }
            goto L_0x01ca
        L_0x01c6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01cb }
        L_0x01ca:
            throw r1     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x01d0 }
            goto L_0x01d4
        L_0x01d0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d5 }
        L_0x01d4:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d5 }
        L_0x01d5:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)
            X.2qk r1 = r3.A00
            java.lang.String r0 = "StickerContexualSuggestionStore/fetchMatchingStickersByEmojisFromDb"
            X.C55682qk.A05(r1, r0, r2)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33471tB.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass2QZ r1 = this.A03;
        if (r1.A00 == this) {
            r1.A00 = null;
        }
        if (!C18320x8.A1T(this)) {
            C48652fF r12 = (C48652fF) ((AnonymousClass4KS) this.A00).A00;
            C626936e.A01();
            if (collection != null) {
                r12.A01.addAll(collection);
            }
            AnonymousClass4AX r0 = r12.A00;
            if (r0 != null) {
                r0.BaW(r12);
            }
        }
    }
}
