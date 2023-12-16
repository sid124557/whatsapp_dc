package com.whatsapp.stickers.avatars;

import X.AnonymousClass2TT;
import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2", f = "AvatarStickerLocatorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ List $stableIds;
    public int label;
    public final /* synthetic */ AnonymousClass2TT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2(AnonymousClass2TT r2, List list, C84814Du r4) {
        super(r4, 2);
        this.$stableIds = list;
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.3Z0] */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022e, code lost:
        if (r2 != null) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r38) {
        /*
            r37 = this;
            r3 = r37
            int r0 = r3.label
            if (r0 != 0) goto L_0x02e1
            X.C57682u2.A01(r38)
            java.util.List r0 = r3.$stableIds
            java.util.ArrayList r4 = X.C73783g4.A0d(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0013:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r1.next()
            X.2jB r0 = (X.C51042jB) r0
            java.lang.String r0 = r0.A00
            r4.add(r0)
            goto L_0x0013
        L_0x0025:
            X.2TT r0 = r3.this$0
            X.2oq r6 = r0.A06
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.3ct r10 = X.C71923ct.A00(r0)
        L_0x0038:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.String[] r9 = X.C71923ct.A01(r10)
            X.8qC r0 = r6.A01     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x008d }
            X.4GK r8 = X.C18630y0.A04(r0)     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x008d }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0083 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0083 }
            int r0 = r9.length     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = "getByStableIds/QUERY_STICKER"
            android.database.Cursor r2 = r7.A0E(r1, r0, r9)     // Catch:{ all -> 0x0083 }
            java.util.List r0 = r6.A01(r2)     // Catch:{ all -> 0x0077 }
            r5.addAll(r0)     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0073
            r2.close()     // Catch:{ all -> 0x0083 }
        L_0x0073:
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x008d }
            goto L_0x0038
        L_0x0077:
            r1 = move-exception
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0083 }
        L_0x0082:
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x008d }
        L_0x008c:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x008d }
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getByStableIds"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0038
        L_0x0094:
            int r0 = X.C57692u3.A00(r5)
            java.util.LinkedHashMap r8 = X.C18330xA.A0C(r0)
            java.util.Iterator r2 = r5.iterator()
        L_0x00a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.39M r0 = (X.AnonymousClass39M) r0
            java.lang.String r0 = r0.A05
            r8.put(r0, r1)
            goto L_0x00a0
        L_0x00b3:
            X.2TT r0 = r3.this$0
            X.2yp r6 = r0.A05
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.3ct r11 = X.C71923ct.A00(r0)
        L_0x00c6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.String[] r10 = X.C71923ct.A01(r11)
            X.8qC r0 = r6.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
            X.4GK r9 = X.C18630y0.A04(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0116 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0116 }
            int r0 = r10.length     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x0116 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "getStarredStickersByStableIds/QUERY_STICKER"
            android.database.Cursor r2 = r7.A0E(r1, r0, r10)     // Catch:{ all -> 0x0116 }
        L_0x00f5:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0103
            X.2UB r0 = X.C60602yp.A00(r2)     // Catch:{ all -> 0x010a }
            r5.add(r0)     // Catch:{ all -> 0x010a }
            goto L_0x00f5
        L_0x0103:
            r2.close()     // Catch:{ all -> 0x0116 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
            goto L_0x00c6
        L_0x010a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0115
            r2.close()     // Catch:{ all -> 0x0111 }
            goto L_0x0115
        L_0x0111:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0116 }
        L_0x0115:
            throw r1     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x011b }
            goto L_0x011f
        L_0x011b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        L_0x011f:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        L_0x0120:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getStarredStickersByStableIds"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00c6
        L_0x0127:
            X.2TT r7 = r3.this$0
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r5.iterator()
        L_0x0131:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r2 = r5.next()
            X.2UB r2 = (X.AnonymousClass2UB) r2
            X.C162457s7.A0H(r2)
            X.2qp r1 = r7.A02
            X.2rq r0 = r7.A01
            X.39M r0 = X.AnonymousClass295.A00(r0, r1, r2)
            if (r0 == 0) goto L_0x0131
            r6.add(r0)
            goto L_0x0131
        L_0x014e:
            int r0 = X.C57692u3.A00(r6)
            java.util.LinkedHashMap r7 = X.C18330xA.A0C(r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x015a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.39M r0 = (X.AnonymousClass39M) r0
            java.lang.String r0 = r0.A05
            r7.put(r0, r1)
            goto L_0x015a
        L_0x016d:
            X.2TT r0 = r3.this$0
            X.2xy r5 = r0.A04
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.3ct r11 = X.C71923ct.A00(r0)
        L_0x0180:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01e9
            java.lang.String[] r10 = X.C71923ct.A01(r11)
            X.8qC r0 = r5.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e2 }
            X.4GK r9 = X.C18630y0.A04(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e2 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x01d8 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x01d8 }
            int r0 = r10.length     // Catch:{ all -> 0x01d8 }
            java.lang.String r4 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x01d8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie FROM recent_stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r4, r1)     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = "getStarredStickersByStableIds/QUERY_STICKER"
            android.database.Cursor r4 = r6.A0E(r1, r0, r10)     // Catch:{ all -> 0x01d8 }
        L_0x01af:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01cc }
            if (r0 == 0) goto L_0x01c5
            X.8qC r0 = r5.A00     // Catch:{ all -> 0x01cc }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01cc }
            X.2qp r0 = (X.C55732qp) r0     // Catch:{ all -> 0x01cc }
            X.39M r0 = X.C60082xy.A00(r4, r0)     // Catch:{ all -> 0x01cc }
            r2.add(r0)     // Catch:{ all -> 0x01cc }
            goto L_0x01af
        L_0x01c5:
            r4.close()     // Catch:{ all -> 0x01d8 }
            r9.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e2 }
            goto L_0x0180
        L_0x01cc:
            r1 = move-exception
            if (r4 == 0) goto L_0x01d7
            r4.close()     // Catch:{ all -> 0x01d3 }
            goto L_0x01d7
        L_0x01d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01d8 }
        L_0x01d7:
            throw r1     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01dd }
            goto L_0x01e1
        L_0x01dd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e2 }
        L_0x01e1:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01e2 }
        L_0x01e2:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getStarredStickersByStableIds"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0180
        L_0x01e9:
            int r0 = X.C57692u3.A00(r2)
            java.util.LinkedHashMap r6 = X.C18330xA.A0C(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x01f5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0208
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.39M r0 = (X.AnonymousClass39M) r0
            java.lang.String r0 = r0.A05
            r6.put(r0, r1)
            goto L_0x01f5
        L_0x0208:
            java.util.List r0 = r3.$stableIds
            X.2TT r5 = r3.this$0
            java.util.ArrayList r4 = X.C73783g4.A0d(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0214:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02e0
            java.lang.Object r3 = r16.next()
            X.2jB r3 = (X.C51042jB) r3
            java.lang.String r13 = r3.A00
            boolean r0 = r8.containsKey(r13)
            if (r0 == 0) goto L_0x0239
            java.lang.Object r2 = r8.get(r13)
        L_0x022c:
            X.39M r2 = (X.AnonymousClass39M) r2
            if (r2 == 0) goto L_0x024f
        L_0x0230:
            X.1li r0 = new X.1li
            r0.<init>(r2)
        L_0x0235:
            r4.add(r0)
            goto L_0x0214
        L_0x0239:
            boolean r0 = r7.containsKey(r13)
            if (r0 == 0) goto L_0x0244
            java.lang.Object r2 = r7.get(r13)
            goto L_0x022c
        L_0x0244:
            boolean r0 = r6.containsKey(r13)
            if (r0 == 0) goto L_0x024f
            java.lang.Object r2 = r6.get(r13)
            goto L_0x022c
        L_0x024f:
            X.2mU r0 = r5.A03
            java.io.File r12 = r0.A00(r3)
            X.2qk r11 = r5.A00
            X.2qp r10 = r5.A02
            r2 = 0
            boolean r0 = r12.exists()     // Catch:{ all -> 0x02c0 }
            r14 = 0
            if (r0 == 0) goto L_0x02d7
            long r0 = r12.length()     // Catch:{ all -> 0x02c0 }
            int r9 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x02d7
            java.lang.String r11 = X.C615131b.A00(r11, r12)     // Catch:{ all -> 0x02c0 }
            X.C162457s7.A0D(r11)     // Catch:{ all -> 0x02c0 }
            r18 = 0
            r29 = 0
            X.39M r9 = new X.39M     // Catch:{ all -> 0x02c0 }
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            r28 = r18
            r31 = r29
            r32 = r29
            r33 = r29
            r34 = r29
            r35 = r29
            r36 = r29
            r17 = r9
            r19 = r18
            r30 = r29
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x02c0 }
            java.lang.String r14 = "meta-avatar"
            r9.A0F = r14     // Catch:{ all -> 0x02c0 }
            r9.A05 = r13     // Catch:{ all -> 0x02c0 }
            r10.A04(r9)     // Catch:{ all -> 0x02c0 }
            java.lang.String r10 = "image/webp"
            r9.A0C = r10     // Catch:{ all -> 0x02c0 }
            int r10 = (int) r0     // Catch:{ all -> 0x02c0 }
            r9.A00 = r10     // Catch:{ all -> 0x02c0 }
            X.AnonymousClass39M.A01(r9, r12)     // Catch:{ all -> 0x02c0 }
            r9.A0D = r11     // Catch:{ all -> 0x02c0 }
            r9.A0A = r11     // Catch:{ all -> 0x02c0 }
            r0 = 1
            r9.A0J = r0     // Catch:{ all -> 0x02c0 }
            r0 = 512(0x200, float:7.175E-43)
            r9.A02 = r0     // Catch:{ all -> 0x02c0 }
            r9.A03 = r0     // Catch:{ all -> 0x02c0 }
            goto L_0x02c5
        L_0x02c0:
            r0 = move-exception
            X.3Z0 r9 = X.AnonymousClass3Z0.A01(r0)
        L_0x02c5:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r9)
            if (r1 == 0) goto L_0x02d0
            java.lang.String r0 = "AvatarStickerUtils/unable to recreate Avatar sticker from file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02d0:
            boolean r0 = r9 instanceof X.AnonymousClass3Z0
            if (r0 != 0) goto L_0x02d5
            r2 = r9
        L_0x02d5:
            X.39M r2 = (X.AnonymousClass39M) r2
        L_0x02d7:
            if (r2 != 0) goto L_0x0230
            X.1lj r0 = new X.1lj
            r0.<init>(r3)
            goto L_0x0235
        L_0x02e0:
            return r4
        L_0x02e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2(this.this$0, this.$stableIds, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
