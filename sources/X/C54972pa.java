package X;

import android.content.ContentValues;
import java.util.List;

/* renamed from: X.2pa  reason: invalid class name and case insensitive filesystem */
public class C54972pa {
    public final C56352rq A00;
    public final C54292oU A01;
    public final C55732qp A02;
    public final AnonymousClass2X2 A03;
    public final C54502op A04;
    public final C54512oq A05;
    public final C183538qC A06;

    public C54972pa(C56352rq r1, C54292oU r2, C55732qp r3, AnonymousClass2X2 r4, C54502op r5, C54512oq r6, C183538qC r7) {
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r4;
        this.A00 = r1;
    }

    public C50612iT A00(String str) {
        String[] A1b;
        String str2;
        C626936e.A00();
        C54502op r3 = this.A04;
        C18260x0.A0q("StickerPackDBTableHelper/getDownloadableStickerPacks stickerPackId:", str, AnonymousClass001.A0o());
        if (str == null) {
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id)";
            A1b = null;
        } else {
            A1b = C18270x1.A1b(str);
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id) WHERE id= ?";
        }
        List A012 = r3.A01(str2, "getDownloadableStickerPacks/QUERY", A1b);
        if (A012.isEmpty()) {
            return null;
        }
        if (A012.size() < 2) {
            return (C50612iT) C18290x4.A0k(A012);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerPack/getDownloadablePackById/there should only be one sticker that matches this id:");
        throw AnonymousClass000.A0I(str, A0o);
    }

    public C50612iT A01(String str) {
        String[] A1b;
        String str2;
        C626936e.A00();
        C54502op r3 = this.A04;
        C18260x0.A0q("StickerPackDBTableHelper/getInstalledStickerPacks stickerPackId:", str, AnonymousClass001.A0o());
        if (str == null) {
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)";
            A1b = null;
        } else {
            A1b = C18270x1.A1b(str);
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_id= ?";
        }
        List A012 = r3.A01(str2, "getInstalledStickerPacks/QUERY", A1b);
        if (A012.size() <= 0) {
            return null;
        }
        if (A012.size() < 2) {
            C50612iT r2 = (C50612iT) C18290x4.A0k(A012);
            if (r2 == null) {
                return r2;
            }
            List A022 = this.A05.A02(str);
            this.A02.A05(A022);
            r2.A05 = A022;
            return r2;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerPack/getInstalledPackById/there should only be one sticker that matches this id:");
        throw AnonymousClass000.A0I(str, A0o);
    }

    public void A02(C50612iT r9) {
        C69833Yo Axl;
        C626936e.A00();
        A03(r9, true);
        C85284Fq A08 = C18630y0.A08(this.A04.A01);
        try {
            Axl = A08.Axl();
            C56862sg r5 = ((AnonymousClass3H0) A08).A03;
            ContentValues A062 = AnonymousClass0x9.A06();
            String str = r9.A0G;
            A062.put("installed_id", str);
            A062.put("installed_name", r9.A0I);
            A062.put("installed_description", r9.A0A);
            A062.put("installed_publisher", r9.A0K);
            A062.put("installed_size", Long.valueOf(r9.A02));
            A062.put("installed_image_data_hash", r9.A0H);
            A062.put("installed_tray_image_id", r9.A0M);
            A062.put("installed_tray_image_preview_id", r9.A0N);
            A062.put("installed_animated_pack", Integer.valueOf(r9.A0O ? 1 : 0));
            A062.put("installed_is_avatar_pack", Integer.valueOf(r9.A0S ? 1 : 0));
            A062.put("installed_lottie_pack", Integer.valueOf(r9.A0U ? 1 : 0));
            A062.put("installed_empty_favorites_avatar_template_id", r9.A0D);
            A062.put("installed_empty_recents_avatar_template_id", r9.A0E);
            r5.A0C("installed_sticker_packs", "insertStickerPackToInstalledTable/INSERT_INSTALLED_STICKER_PACK", A062, 5);
            Axl.A00();
            Axl.close();
            A08.close();
            if (!r9.A05.isEmpty()) {
                this.A05.A03(r9.A05);
            }
            r9.A00 = this.A03.A01(str);
            return;
        } catch (Throwable th) {
            try {
                A08.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r5 <= 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C50612iT r11, boolean r12) {
        /*
            r10 = this;
            X.C626936e.A00()
            X.2op r0 = r10.A04
            java.lang.String r9 = r11.A0G
            X.8qC r0 = r0.A01
            X.4Fq r6 = X.C18630y0.A08(r0)
            r0 = 1
            java.lang.String[] r4 = X.C18300x5.A1a(r9, r0)     // Catch:{ all -> 0x0090 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0090 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "installed_sticker_packs"
            java.lang.String r1 = "installed_id LIKE ?"
            java.lang.String r0 = "deleteInstalledStickerPack/DELETE_INSTALLED_STICKER_PACK"
            int r5 = r3.A07(r2, r1, r0, r4)     // Catch:{ all -> 0x0090 }
            r6.close()
            X.2oq r0 = r10.A05
            X.8qC r0 = r0.A01
            X.4Fq r4 = X.C18630y0.A08(r0)
            java.lang.String r8 = "sticker_pack_id LIKE ?"
            java.lang.String[] r3 = X.C18270x1.A1b(r9)     // Catch:{ all -> 0x008b }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x008b }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "stickers"
            java.lang.String r0 = "deleteAllStickersOfStickerPack/DELETE_STICKER"
            int r0 = r2.A07(r1, r8, r0, r3)     // Catch:{ all -> 0x008b }
            r4.close()
            r7 = 1
            if (r0 <= 0) goto L_0x004a
            r6 = 1
            if (r5 > 0) goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r12 != 0) goto L_0x008a
            X.2X2 r5 = r10.A03
            monitor-enter(r5)
            X.8qC r0 = r5.A00     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0087 }
            X.1RH r0 = (X.AnonymousClass1RH) r0     // Catch:{ all -> 0x0087 }
            X.4Fq r4 = r0.A0C()     // Catch:{ all -> 0x0087 }
            java.lang.String[] r3 = X.C18300x5.A1a(r9, r7)     // Catch:{ all -> 0x007d }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x007d }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "sticker_pack_order"
            java.lang.String r0 = "StickerPackOrderDBTableHelper/deleteRow/DELETE_STICKER_PACK_ORDER"
            int r0 = r2.A07(r1, r8, r0, r3)     // Catch:{ all -> 0x007d }
            r4.close()     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            boolean r0 = X.AnonymousClass001.A1W(r0)
            if (r6 == 0) goto L_0x007b
            if (r0 == 0) goto L_0x007b
            return r7
        L_0x007b:
            r7 = 0
            return r7
        L_0x007d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0087 }
        L_0x0086:
            throw r1     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x008a:
            return r6
        L_0x008b:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0095 }
            throw r1
        L_0x0090:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0095 }
            throw r1
        L_0x0095:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54972pa.A03(X.2iT, boolean):boolean");
    }
}
