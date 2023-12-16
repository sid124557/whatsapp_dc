package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2sn  reason: invalid class name and case insensitive filesystem */
public class C56932sn {
    public C54722pB A00;
    public byte[] A01;
    public final C55682qk A02;
    public final C64393Dh A03;
    public final C69263Wi A04;
    public final C56352rq A05;
    public final C56492s4 A06;
    public final C620633i A07;
    public final C56612sH A08;
    public final C54292oU A09;
    public final AnonymousClass33p A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass4FV A0C;
    public final C48092eK A0D;
    public final AnonymousClass33K A0E;
    public final C49652gs A0F;
    public final C55862r2 A0G;
    public final C45112Ys A0H;
    public final C55732qp A0I;
    public final C29361ih A0J;
    public final AnonymousClass2MF A0K;
    public final C54132oE A0L;
    public final WebpUtils A0M;
    public final C49932hK A0N;
    public final C48282ee A0O;
    public final AnonymousClass2X1 A0P;
    public final C33111sS A0Q;
    public final C54962pZ A0R;
    public final AnonymousClass2X3 A0S;
    public final C54972pa A0T;
    public final C47262cy A0U;
    public final C54512oq A0V;
    public final C50262ht A0W;
    public final C60462yb A0X;
    public final C51092jG A0Y;
    public final AnonymousClass4FS A0Z;
    public final C183538qC A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6.A01 != 1) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A00(X.AnonymousClass39M r6) {
        /*
            r5 = this;
            java.lang.String r2 = r6.A09
            if (r2 == 0) goto L_0x0030
            int r1 = r6.A01
            r0 = 1
            if (r1 == r0) goto L_0x0030
        L_0x0009:
            if (r0 != 0) goto L_0x0029
            X.2qk r3 = r5.A02
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sticker is not third party sticker, pack:"
            r1.append(r0)
            java.lang.String r0 = r6.A0F
            r1.append(r0)
            java.lang.String r0 = ", file path:"
            java.lang.String r2 = X.AnonymousClass000.A0V(r0, r2, r1)
            r1 = 1
            java.lang.String r0 = "moving first party sticker to temp storage"
            r3.A0A(r0, r1, r2)
        L_0x0029:
            java.lang.String r0 = r6.A0D
            X.C626936e.A06(r0)
            r3 = 0
            goto L_0x0032
        L_0x0030:
            r0 = 0
            goto L_0x0009
        L_0x0032:
            X.2eK r2 = r5.A0D     // Catch:{ IOException -> 0x00da }
            r0 = 32
            byte[] r0 = X.AnonymousClass29O.A01(r0)     // Catch:{ IOException -> 0x00da }
            java.lang.String r0 = X.C18290x4.A0t(r0)     // Catch:{ IOException -> 0x00da }
            java.lang.String r1 = X.C107575bX.A0A(r0)     // Catch:{ IOException -> 0x00da }
            X.2gw r0 = r2.A00     // Catch:{ IOException -> 0x00da }
            java.io.File r4 = r0.A00(r1)     // Catch:{ IOException -> 0x00da }
            int r1 = r6.A01
            r0 = 3
            if (r1 == r0) goto L_0x006b
            java.lang.String r0 = r6.A09
            if (r0 == 0) goto L_0x006b
            X.3Dh r1 = r5.A03     // Catch:{ IOException -> 0x0067 }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException -> 0x0067 }
            r1.A0a(r0, r4)     // Catch:{ IOException -> 0x0067 }
            boolean r0 = r4.exists()     // Catch:{ IOException -> 0x0067 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r6.A0D     // Catch:{ IOException -> 0x0067 }
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r4, r0)     // Catch:{ IOException -> 0x0067 }
            return r0
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to copy cached file"
            goto L_0x00dd
        L_0x006b:
            X.33i r0 = r5.A07     // Catch:{ IOException -> 0x00d0 }
            X.5UR r1 = r0.A0R()     // Catch:{ IOException -> 0x00d0 }
            java.lang.String r0 = r6.A09     // Catch:{ IOException -> 0x00d0 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x00d0 }
            java.io.InputStream r2 = r1.A06(r0)     // Catch:{ IOException -> 0x00d0 }
            if (r2 == 0) goto L_0x008c
            boolean r0 = X.C627536m.A0R(r4, r2)     // Catch:{ all -> 0x0082 }
            goto L_0x008d
        L_0x0082:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00d0 }
        L_0x008b:
            throw r1     // Catch:{ IOException -> 0x00d0 }
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x0092:
            if (r0 == 0) goto L_0x00cb
            com.whatsapp.stickers.WebpUtils r1 = r5.A0M     // Catch:{ 1rO -> 0x00b7 }
            X.C57582ts.A00(r1, r4, r3, r3)     // Catch:{ 1rO -> 0x00b7 }
            X.330 r0 = r6.A04
            if (r0 == 0) goto L_0x00b0
            byte[] r0 = r0.A02()
            boolean r0 = r1.A03(r4, r0)
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to insert metadata"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.C627536m.A0O(r4)
            return r3
        L_0x00b0:
            X.2qk r0 = r5.A02     // Catch:{ IOException -> 0x00c1 }
            java.lang.String r3 = X.C615131b.A00(r0, r4)     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00cb
        L_0x00b7:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage sticker file failed validation"
            com.whatsapp.util.Log.e(r0, r1)
            X.C627536m.A0O(r4)
            return r3
        L_0x00c1:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage could not get file hash; file="
            X.C18260x0.A0k(r4, r0, r1, r2)
        L_0x00cb:
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r4, r3)
            return r0
        L_0x00d0:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to copy external file"
            com.whatsapp.util.Log.e(r0, r1)
            X.C627536m.A0O(r4)
            return r3
        L_0x00da:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveThirdPartyStickerToTempStorage failed to generate internal temp file"
        L_0x00dd:
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56932sn.A00(X.39M):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C50612iT A01(X.C84644Dd r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            X.2pa r3 = r6.A0T
            X.2iT r4 = r3.A01(r8)
            if (r4 != 0) goto L_0x000c
            X.2iT r4 = r3.A00(r8)
        L_0x000c:
            if (r9 == 0) goto L_0x002a
            if (r4 != 0) goto L_0x0065
            java.lang.String r0 = " "
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x002c
            X.2cy r0 = r6.A0U
            r0.A00()
            X.2iT r4 = r3.A00(r8)
            if (r4 != 0) goto L_0x0065
            X.2oE r0 = r6.A0L
            X.2iT r0 = r0.A00(r7, r8)
            return r0
        L_0x002a:
            if (r4 != 0) goto L_0x0065
        L_0x002c:
            java.lang.String r0 = " "
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0085
            android.util.Pair r5 = X.AnonymousClass336.A00(r8)     // Catch:{ Exception -> 0x0059 }
            if (r5 == 0) goto L_0x0085
            X.2yb r2 = r6.A0X     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0059 }
            boolean r0 = r2.A03(r1, r0)     // Catch:{ Exception -> 0x0059 }
            if (r0 == 0) goto L_0x0085
            X.2ht r2 = r6.A0W     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r1 = r5.first     // Catch:{ Exception -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r0 = r5.second     // Catch:{ Exception -> 0x0059 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0059 }
            X.2iT r4 = r2.A00(r1, r0)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0082
        L_0x0059:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerRepository/getStickerPackByIdSync/error fetching sticker pack: "
            X.C18260x0.A0u(r0, r8, r1, r2)
            r0 = 0
            return r0
        L_0x0065:
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x006f
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x0082
        L_0x006f:
            X.2oE r2 = r6.A0L
            java.lang.String r1 = r4.A0G
            r0 = 0
            X.2iT r1 = r2.A00(r0, r1)
            if (r1 == 0) goto L_0x0082
            java.util.List r0 = r1.A04
            r4.A04 = r0
            java.util.List r0 = r1.A05
            r4.A05 = r0
        L_0x0082:
            X.AnonymousClass2X2.A00(r4, r3, r8)
        L_0x0085:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56932sn.A01(X.4Dd, java.lang.String, boolean):X.2iT");
    }

    public C54722pB A02() {
        C54722pB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        Context context = this.A09.A00;
        File A0A2 = AnonymousClass002.A0A(context.getCacheDir(), "stickers_preview_images");
        if (!A0A2.exists() && !A0A2.mkdirs()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A10(A0A2, "StickerRepository/getPreviewImageLoader/could not create diskcache directory:", A0o);
            AnonymousClass0x2.A19(A0o);
        }
        long min = Math.min(4194304, A0A2.getFreeSpace() / 16);
        C69263Wi r5 = this.A04;
        AnonymousClass1LV r4 = new AnonymousClass1LV(r5, new AnonymousClass8EF(AnonymousClass0RP.A00(context, R.drawable.sticker_store_error), AnonymousClass0RP.A00(context, R.drawable.sticker_store_error)), this.A0L, A0A2, min);
        C47432dF r11 = new C47432dF(r5, this.A06, this.A0E, A0A2, "sticker-repository");
        r11.A04 = r4;
        r11.A00 = Integer.MAX_VALUE;
        r11.A01 = min;
        r11.A03 = AnonymousClass0RP.A00(context, R.drawable.sticker_store_error);
        r11.A02 = AnonymousClass0RP.A00(context, R.drawable.sticker_store_error);
        r11.A05 = true;
        C54722pB A012 = r11.A01();
        this.A00 = A012;
        return A012;
    }

    public File A03(AnonymousClass39M r7) {
        Pair A002;
        Object obj;
        Object obj2;
        File file;
        C626936e.A06(r7.A0D);
        C56352rq r5 = this.A05;
        File A012 = r5.A01(r7.A0D);
        if (!(A012 != null || (A002 = A00(r7)) == null || (obj = A002.first) == null || (obj2 = A002.second) == null)) {
            try {
                file = (File) obj;
                File A022 = r5.A02((String) obj2);
                C626936e.A06(A022);
                this.A03.A0b(file, A022);
                File file2 = A022;
                r5.A01((String) A002.second);
                return file2;
            } catch (IOException e) {
                Log.e("StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file");
                C627536m.A0O(file);
                throw e;
            } catch (IOException unused) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("StickerRepository/incrementReferenceCountOnThirdPartySticker unable to move ");
                A0o.append(((File) A002.first).getAbsolutePath());
                C18260x0.A1K(A0o, " to internal storage");
            }
        }
        return A012;
    }

    public File A04(AnonymousClass39M r5, File file) {
        File A002 = this.A0P.A00(r5, file, false);
        if (A002 != null) {
            AnonymousClass39M.A02(r5, A002);
            r5.A04 = this.A0I.A01(r5.A04(), A002.getAbsolutePath());
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("StickerRepository/downloadSticker/downloaded sticker, file_hash:");
            A0o.append(r5.A0D);
            A0o.append(",media_key:");
            A0o.append(r5.A0B);
            AnonymousClass000.A10(A002, ",file:", A0o);
            A0o.append(", direct_path:");
            C18260x0.A1L(A0o, r5.A06);
            return A002;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("StickerRepository/downloadSticker/sticker file is null for: ");
        C18260x0.A1K(A0o2, r5.A0D);
        return A002;
    }

    public final File A05(String str) {
        File A012 = C64393Dh.A01(C54292oU.A01(this.A05.A00), "Stickers");
        if (A012.exists() || A012.mkdirs()) {
            return C18270x1.A0A(A012, ".png", AnonymousClass000.A0l(str));
        }
        return null;
    }

    public List A06() {
        List<C50612iT> A012 = this.A0X.A01();
        Set A002 = this.A0Y.A00();
        for (C50612iT r2 : A012) {
            C54972pa r1 = this.A0T;
            String str = r2.A0G;
            AnonymousClass2X2.A00(r2, r1, str);
            r2.A08 = A002.contains(str);
        }
        C18260x0.A1C("StickerRepository/getCachedWhiteListedStickerPacksSync/found total cached sticker pack count: ", AnonymousClass001.A0o(), A012);
        return A012;
    }

    public List A07() {
        Map map;
        List<C50612iT> list;
        C33111sS r5 = this.A0Q;
        synchronized (r5) {
            map = r5.A00;
            if (map.containsKey(0)) {
                list = (List) ((WeakReference) map.get(0)).get();
            } else {
                list = null;
            }
        }
        if (list == null) {
            C54972pa r7 = this.A0T;
            C626936e.A00();
            C54502op r3 = r7.A04;
            C18260x0.A0q("StickerPackDBTableHelper/getInstalledStickerPacks stickerPackId:", (String) null, AnonymousClass001.A0o());
            list = r3.A01("SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)", "getInstalledStickerPacks/QUERY", (String[]) null);
            HashSet A0K2 = AnonymousClass002.A0K();
            Set A002 = this.A0Y.A00();
            for (C50612iT r10 : list) {
                String str = r10.A0G;
                if (A0K2.contains(str)) {
                    Log.e("StickerRepository/getInstalledFirstPartyStickerPacksSync duplicate sticker pack");
                } else {
                    A0K2.add(str);
                    C626936e.A00();
                    List A022 = r7.A05.A02(str);
                    Iterator it = A022.iterator();
                    while (it.hasNext()) {
                        AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
                        if (!TextUtils.isEmpty(A0b.A09)) {
                            this.A0I.A04(A0b);
                        }
                    }
                    r10.A05 = A022;
                    r10.A08 = A002.contains(str);
                    Iterator it2 = r10.A05.iterator();
                    while (it2.hasNext()) {
                        A0A(AnonymousClass0x7.A0b(it2));
                    }
                }
            }
            for (C50612iT r1 : list) {
                AnonymousClass2X2.A00(r1, r7, r1.A0G);
            }
            Collections.sort(list, new C71843cl());
            list.size();
            synchronized (r5) {
                map.put(0, AnonymousClass0x9.A14(list));
            }
        }
        return list;
    }

    public List A08(int i) {
        C54962pZ r0 = this.A0R;
        C626936e.A00();
        List<AnonymousClass2UB> A012 = r0.A05.A01(Integer.MAX_VALUE, i);
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass2UB r5 : A012) {
            C56352rq r02 = this.A05;
            String str = r5.A0D;
            File A022 = r02.A02(str);
            if (A022.exists()) {
                AnonymousClass39M r3 = new AnonymousClass39M();
                AnonymousClass39M.A02(r3, A022);
                r3.A0D = str;
                r3.A0G = r5.A0G;
                r3.A08 = r5.A0C;
                r3.A06 = r5.A0B;
                r3.A0L = r5.A06;
                String str2 = r5.A0F;
                if (str2 == null) {
                    str2 = "image/webp";
                }
                r3.A0C = str2;
                r3.A0B = r5.A0E;
                r3.A00 = r5.A07;
                r3.A03 = r5.A09;
                r3.A02 = r5.A08;
                C55732qp r2 = this.A0I;
                r3.A04 = r2.A01(r3.A04(), A022.getAbsolutePath());
                r2.A04(r3);
                r3.A0A = r5.A02;
                A0A(r3);
                A0s.add(r3);
            }
        }
        return A0s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x007c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A09(X.AnonymousClass2IB r9) {
        /*
            r8 = this;
            X.2yb r0 = r8.A0X
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.8qC r0 = r0.A00
            X.4GK r6 = X.C18630y0.A04(r0)
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00f4 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = "SELECT authority, sticker_pack_id FROM third_party_whitelist_packs"
            java.lang.String r0 = "getWhitelistedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            android.database.Cursor r5 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "authority"
            int r4 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "sticker_pack_id"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e8 }
        L_0x0026:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r5.getString(r4)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x00e8 }
            X.AnonymousClass0x2.A1F(r1, r0, r3)     // Catch:{ all -> 0x00e8 }
            goto L_0x0026
        L_0x0038:
            r5.close()     // Catch:{ all -> 0x00f4 }
            r6.close()
            java.util.HashMap r6 = X.AnonymousClass001.A0t()
            java.util.Iterator r2 = r3.iterator()
        L_0x0046:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006b
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r2)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.AnonymousClass336.A01(r1, r0)
            X.2pa r0 = r8.A0T
            X.C626936e.A00()
            X.2X2 r0 = r0.A03
            int r0 = r0.A01(r1)
            X.AnonymousClass0x2.A1I(r1, r6, r0)
            goto L_0x0046
        L_0x006b:
            r5 = 1
            X.4IR r0 = new X.4IR
            r0.<init>(r8, r5, r6)
            java.util.Collections.sort(r3, r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = r3.iterator()
        L_0x007c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00de
            android.util.Pair r0 = X.AnonymousClass0x9.A0D(r7)
            X.2ht r2 = r8.A0W     // Catch:{ 1rP -> 0x0099, Exception -> 0x0095 }
            java.lang.Object r1 = r0.first     // Catch:{ 1rP -> 0x0099, Exception -> 0x0095 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1rP -> 0x0099, Exception -> 0x0095 }
            java.lang.Object r0 = r0.second     // Catch:{ 1rP -> 0x0099, Exception -> 0x0095 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 1rP -> 0x0099, Exception -> 0x0095 }
            X.2iT r3 = r2.A00(r1, r0)     // Catch:{ 1rP -> 0x0099, Exception -> 0x0095 }
            goto L_0x00a0
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/failed to fetch sticker pack"
            goto L_0x009c
        L_0x0099:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/fetch of sticker pack restricted"
        L_0x009c:
            com.whatsapp.util.Log.e(r0, r1)
            r3 = 0
        L_0x00a0:
            if (r3 == 0) goto L_0x007c
            r4.add(r3)
            X.2jG r0 = r8.A0Y
            java.util.Set r0 = r0.A00()
            java.lang.String r2 = r3.A0G
            boolean r0 = r0.contains(r2)
            r3.A08 = r0
            java.util.List r0 = r3.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c7
            X.39M r0 = X.AnonymousClass0x7.A0b(r1)
            r8.A0A(r0)
            goto L_0x00b9
        L_0x00c7:
            java.lang.Object r0 = X.C18290x4.A0i(r2, r6)
            int r0 = X.AnonymousClass001.A0K(r0)
            r3.A00 = r0
            if (r9 == 0) goto L_0x007c
            X.1u8 r2 = r9.A00
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 0
            r1[r0] = r3
            r2.A0F(r1)
            goto L_0x007c
        L_0x00de:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerRepository/getInstalledThirdPartyStickerPacksSync/found total 3rd party sticker pack count: "
            X.C18260x0.A1B(r0, r1, r4)
            return r4
        L_0x00e8:
            r1 = move-exception
            if (r5 == 0) goto L_0x00f3
            r5.close()     // Catch:{ all -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00f3:
            throw r1     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00f9 }
            throw r1
        L_0x00f9:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56932sn.A09(X.2IB):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.AnonymousClass39M r8) {
        /*
            r7 = this;
            java.lang.String r5 = r8.A0D
            java.security.MessageDigest r4 = X.AnonymousClass0x7.A0t()     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            r6 = r7
            monitor-enter(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            byte[] r0 = r7.A01     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x002e
            X.33p r3 = r7.A0A     // Catch:{ all -> 0x0046 }
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r3)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = "sticker_hash_salt"
            java.lang.String r1 = X.C18280x3.A0Z(r0, r2)     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0031
            r0 = 32
            byte[] r0 = X.AnonymousClass29O.A01(r0)     // Catch:{ all -> 0x0046 }
            r7.A01 = r0     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x0046 }
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r3)     // Catch:{ all -> 0x0046 }
            X.C18270x1.A0j(r0, r2, r1)     // Catch:{ all -> 0x0046 }
        L_0x002e:
            byte[] r0 = r7.A01     // Catch:{ all -> 0x0046 }
            goto L_0x0039
        L_0x0031:
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x0046 }
            r7.A01 = r0     // Catch:{ all -> 0x0046 }
            goto L_0x002e
        L_0x0039:
            monitor-exit(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            r4.update(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            byte[] r0 = r5.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            java.lang.String r0 = X.C18270x1.A0V(r4, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
            throw r0     // Catch:{ NoSuchAlgorithmException -> 0x0049 }
        L_0x0049:
            r0 = 0
        L_0x004a:
            r8.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56932sn.A0A(X.39M):void");
    }

    public void A0B(C50612iT r4, C84934Eh r5) {
        Bitmap A002;
        if (!this.A0B.A0Y(C58422vE.A02, 575) || (A002 = this.A0O.A00(r4.A0G)) == null) {
            Log.d("StickerRepository/getTrayIconInAStickerPackAsync/begin");
            this.A0Z.BkL(new C33731tb(this, r5), r4);
            return;
        }
        r5.BVb(A002);
    }

    public void A0C(C84644Dd r5, String str, boolean z) {
        Log.d("StickerRepository/getStickerPackById/begin");
        this.A0Z.BkL(new AnonymousClass1t3(this.A0K, r5, this), AnonymousClass0x9.A0C(str, Boolean.valueOf(z)));
    }

    public void A0D(AnonymousClass4BO r4, String str) {
        Log.d("StickerRepository/uninstallStickerPackAsync/begin");
        this.A0Z.BkL(new C33441t4(this.A0J, r4, this), C18270x1.A1b(str));
    }

    public void A0E(Collection collection) {
        Log.d("StickerRepository/starStickersAsync/begin");
        this.A0Z.BkM(new C71573cK(this, 17, collection));
    }

    public void A0F(Collection collection) {
        Log.d("StickerRepository/unstarStickersAsync/begin");
        this.A0Z.BkM(new C71573cK(this, 13, collection));
    }

    public boolean A0H(AnonymousClass39M r6) {
        String str;
        Cursor A0E2;
        if (!r6.A0J || (str = r6.A05) == null) {
            return this.A0R.A02(r6.A0D);
        }
        C60602yp r0 = this.A0R.A05;
        String[] A1b = C18270x1.A1b(str);
        AnonymousClass4GK A042 = C18630y0.A04(r0.A01);
        try {
            A0E2 = ((AnonymousClass3H0) A042).A03.A0E("SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE avatar_template_id = ? ORDER BY timestamp DESC", "getStarredStickerDataFromFileHash/QUERY_STARRED_STICKER", A1b);
            if (A0E2.moveToNext()) {
                AnonymousClass2UB A002 = C60602yp.A00(A0E2);
                A0E2.close();
                A042.close();
                if (A002 == null) {
                    return false;
                }
                return true;
            }
            A0E2.close();
            A042.close();
            return false;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01da, code lost:
        if (r0 != false) goto L_0x01ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(X.AnonymousClass39M r38, java.lang.Long r39, boolean r40, boolean r41) {
        /*
            r37 = this;
            r12 = r38
            boolean r0 = r12.A0J
            r11 = 0
            r10 = r37
            if (r0 == 0) goto L_0x01fa
            X.2gs r0 = r10.A0F
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01fa
            java.lang.String r1 = r12.A05
            if (r1 == 0) goto L_0x01ec
            X.2oq r0 = r10.A0V
            X.39M r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x01ec
            r12 = r0
        L_0x001e:
            java.lang.String r5 = r12.A0D
            if (r5 == 0) goto L_0x01f9
            X.2pZ r9 = r10.A0R
            boolean r0 = r9.A02(r5)
            if (r0 != 0) goto L_0x01f9
            X.2rq r8 = r10.A05
            java.io.File r7 = r8.A02(r5)
            X.C626936e.A06(r7)
            boolean r0 = r7.exists()
            r6 = 1
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r12.A09
            if (r0 == 0) goto L_0x0073
            int r0 = r12.A01
            if (r0 == r6) goto L_0x0073
            android.util.Pair r0 = r10.A00(r12)
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r2 = r0.first
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r5 = r0.second
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L_0x01f9
            if (r5 == 0) goto L_0x01f9
            boolean r0 = r9.A02(r5)
            if (r0 != 0) goto L_0x01f9
            r12.A0D = r5
            java.io.File r0 = r8.A02(r5)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x008a
            java.io.File r7 = r8.A02(r5)     // Catch:{ IOException -> 0x0209 }
            X.C626936e.A06(r7)     // Catch:{ IOException -> 0x0209 }
            X.3Dh r0 = r10.A03     // Catch:{ IOException -> 0x01ff }
            r0.A0b(r2, r7)     // Catch:{ IOException -> 0x01ff }
            goto L_0x0087
        L_0x0073:
            java.io.File r7 = r8.A02(r5)
            X.C626936e.A06(r7)
            java.lang.String r0 = r12.A09
            if (r0 == 0) goto L_0x01f9
            X.3Dh r1 = r10.A03     // Catch:{ IOException -> 0x020f }
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ IOException -> 0x020f }
            r1.A0a(r0, r7)     // Catch:{ IOException -> 0x020f }
        L_0x0087:
            r17 = 1
            goto L_0x008c
        L_0x008a:
            r17 = 0
        L_0x008c:
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x01f9
            X.8qC r0 = r10.A0a
            java.lang.Object r4 = r0.get()
            if (r39 == 0) goto L_0x00bc
            long r2 = r39.longValue()
        L_0x009e:
            if (r4 == 0) goto L_0x00b5
            if (r41 != 0) goto L_0x00b5
            r16 = 1
            X.C626936e.A06(r4)
            r0 = r4
            X.3Gp r0 = (X.C65203Gp) r0
            java.util.Set r14 = r0.A0A(r12, r2, r6)
        L_0x00ae:
            X.C626936e.A00()
            r9.A01()
            goto L_0x00c3
        L_0x00b5:
            r16 = 0
            java.util.Set r14 = java.util.Collections.emptySet()
            goto L_0x00ae
        L_0x00bc:
            X.2sH r0 = r10.A08
            long r2 = r0.A0H()
            goto L_0x009e
        L_0x00c3:
            java.lang.String r1 = r12.A0D     // Catch:{ FileNotFoundException -> 0x0197 }
            if (r1 == 0) goto L_0x019d
            X.2oo r13 = r9.A01     // Catch:{ FileNotFoundException -> 0x0197 }
            monitor-enter(r13)     // Catch:{ FileNotFoundException -> 0x0197 }
            java.util.Map r0 = r13.A00     // Catch:{ all -> 0x018d }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x018d }
            monitor-exit(r13)     // Catch:{ FileNotFoundException -> 0x0197 }
            if (r0 != 0) goto L_0x019d
            X.2IC r0 = r9.A04     // Catch:{ FileNotFoundException -> 0x0197 }
            java.lang.String r1 = r12.A0D     // Catch:{ FileNotFoundException -> 0x0197 }
            X.2rq r0 = r0.A00     // Catch:{ FileNotFoundException -> 0x0197 }
            java.io.File r1 = r0.A02(r1)     // Catch:{ FileNotFoundException -> 0x0197 }
            boolean r0 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0197 }
            if (r0 == 0) goto L_0x0190
            java.lang.String r1 = com.whatsapp.stickers.WebpUtils.A00(r1)     // Catch:{ FileNotFoundException -> 0x0197 }
            if (r1 == 0) goto L_0x0102
            monitor-enter(r13)     // Catch:{ FileNotFoundException -> 0x0197 }
            java.util.Map r0 = r13.A01     // Catch:{ all -> 0x018d }
            java.lang.String r0 = X.C18310x6.A0o(r1, r0)     // Catch:{ all -> 0x018d }
            monitor-exit(r13)     // Catch:{ FileNotFoundException -> 0x0197 }
            if (r0 == 0) goto L_0x0102
            java.lang.String r15 = r12.A0D     // Catch:{ FileNotFoundException -> 0x0197 }
            boolean r0 = r15.equals(r0)     // Catch:{ FileNotFoundException -> 0x0197 }
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "StarredStickers/starSticker/found a duplicate sticker that has same image hash but different file hash, keep the old one."
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0197 }
            goto L_0x019d
        L_0x0102:
            java.lang.String r0 = r12.A0D     // Catch:{ FileNotFoundException -> 0x0197 }
            r13.A01(r0, r1)     // Catch:{ FileNotFoundException -> 0x0197 }
            X.2rq r13 = r9.A00     // Catch:{ FileNotFoundException -> 0x0197 }
            java.lang.String r0 = r12.A0D     // Catch:{ FileNotFoundException -> 0x0197 }
            java.io.File r0 = r13.A02(r0)     // Catch:{ FileNotFoundException -> 0x0197 }
            X.AnonymousClass39M.A01(r12, r0)     // Catch:{ FileNotFoundException -> 0x0197 }
            r12.A01 = r6     // Catch:{ FileNotFoundException -> 0x0197 }
            X.2qp r0 = r9.A03     // Catch:{ FileNotFoundException -> 0x0197 }
            r0.A04(r12)     // Catch:{ FileNotFoundException -> 0x0197 }
            X.2yp r13 = r9.A05     // Catch:{ FileNotFoundException -> 0x0197 }
            java.lang.String r0 = r12.A0D     // Catch:{ FileNotFoundException -> 0x0197 }
            r19 = r0
            java.lang.String r0 = r12.A0G     // Catch:{ FileNotFoundException -> 0x0197 }
            r21 = r0
            java.lang.String r0 = r12.A08     // Catch:{ FileNotFoundException -> 0x0197 }
            r22 = r0
            java.lang.String r0 = r12.A06     // Catch:{ FileNotFoundException -> 0x0197 }
            r23 = r0
            java.lang.String r0 = r12.A0C     // Catch:{ FileNotFoundException -> 0x0197 }
            r24 = r0
            java.lang.String r0 = r12.A0B     // Catch:{ FileNotFoundException -> 0x0197 }
            r25 = r0
            int r0 = r12.A00     // Catch:{ FileNotFoundException -> 0x0197 }
            r28 = r0
            int r0 = r12.A03     // Catch:{ FileNotFoundException -> 0x0197 }
            r29 = r0
            int r0 = r12.A02     // Catch:{ FileNotFoundException -> 0x0197 }
            r30 = r0
            java.lang.String r0 = r12.A07     // Catch:{ FileNotFoundException -> 0x0197 }
            r26 = r0
            boolean r0 = r12.A0K     // Catch:{ FileNotFoundException -> 0x0197 }
            r33 = r0
            boolean r0 = r12.A0J     // Catch:{ FileNotFoundException -> 0x0197 }
            r34 = r0
            java.lang.String r0 = r12.A05     // Catch:{ FileNotFoundException -> 0x0197 }
            r27 = r0
            boolean r0 = r12.A0H     // Catch:{ FileNotFoundException -> 0x0197 }
            r18 = r0
            boolean r15 = r12.A0L     // Catch:{ FileNotFoundException -> 0x0197 }
            X.2UB r0 = new X.2UB     // Catch:{ FileNotFoundException -> 0x0197 }
            r20 = r1
            r31 = r2
            r35 = r18
            r36 = r15
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36)     // Catch:{ FileNotFoundException -> 0x0197 }
            r13.A02(r0)     // Catch:{ FileNotFoundException -> 0x0197 }
            X.2Ys r0 = r9.A02     // Catch:{ FileNotFoundException -> 0x0197 }
            X.2cD r1 = r0.A01     // Catch:{ FileNotFoundException -> 0x0197 }
            java.lang.Object r2 = r1.A02     // Catch:{ FileNotFoundException -> 0x0197 }
            monitor-enter(r2)     // Catch:{ FileNotFoundException -> 0x0197 }
            android.content.SharedPreferences r0 = r1.A00()     // Catch:{ all -> 0x0188 }
            java.lang.String r9 = "sticker_add_to_favorites_count"
            int r3 = r0.getInt(r9, r11)     // Catch:{ all -> 0x0188 }
            android.content.SharedPreferences r0 = r1.A00()     // Catch:{ all -> 0x018a }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x018a }
            int r0 = r3 + 1
            X.C18270x1.A0h(r1, r9, r0)     // Catch:{ all -> 0x018a }
            monitor-exit(r2)     // Catch:{ all -> 0x018a }
            goto L_0x019f
        L_0x0188:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018a }
            goto L_0x0196
        L_0x018d:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ FileNotFoundException -> 0x0197 }
            goto L_0x0196
        L_0x0190:
            java.lang.String r0 = "StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker"
            java.io.FileNotFoundException r0 = X.C18330xA.A05(r0)     // Catch:{ FileNotFoundException -> 0x0197 }
        L_0x0196:
            throw r0     // Catch:{ FileNotFoundException -> 0x0197 }
        L_0x0197:
            r1 = move-exception
            java.lang.String r0 = "StarredStickers/starSticker/could not find sticker file corresponding to that sticker file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x019d:
            r0 = 0
            goto L_0x01a0
        L_0x019f:
            r0 = 1
        L_0x01a0:
            if (r16 == 0) goto L_0x01da
            X.C626936e.A06(r4)
            X.3Gp r4 = (X.C65203Gp) r4
            if (r0 == 0) goto L_0x01dd
            r4.A0O(r14)
        L_0x01ac:
            X.1Ye r3 = new X.1Ye
            r3.<init>()
            boolean r0 = r12.A0J
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            X.1VX r2 = r10.A0B
            r1 = 5325(0x14cd, float:7.462E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r12.A0H
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
        L_0x01cd:
            X.4FV r0 = r10.A0C
            r0.BhD(r3)
            if (r40 == 0) goto L_0x01d9
            java.lang.String r0 = r12.A0D
            r8.A01(r0)
        L_0x01d9:
            return r6
        L_0x01da:
            if (r0 == 0) goto L_0x01e0
            goto L_0x01ac
        L_0x01dd:
            r4.A0N(r14)
        L_0x01e0:
            if (r17 == 0) goto L_0x01e6
            X.C627536m.A0O(r7)
            return r11
        L_0x01e6:
            if (r40 != 0) goto L_0x01f9
            r8.A06(r5)
            return r11
        L_0x01ec:
            X.2hK r0 = r10.A0N
            X.39M r12 = r0.A00(r12)
            if (r12 != 0) goto L_0x001e
            java.lang.String r0 = "RecentStickers/unable to find ondemand sticker matching avatar stable id"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01f9:
            return r11
        L_0x01fa:
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x001e
            return r11
        L_0x01ff:
            r1 = move-exception
            java.lang.String r0 = "StickerRepository/moveTempStickerFileToInternalStorage failed to copy resulting file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0209 }
            X.C627536m.A0O(r2)     // Catch:{ IOException -> 0x0209 }
            throw r1     // Catch:{ IOException -> 0x0209 }
        L_0x0209:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy external file to internal storage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r11
        L_0x020f:
            java.lang.String r0 = "StickerRepository/starStickersSync failed to copy internal file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56932sn.A0I(X.39M, java.lang.Long, boolean, boolean):boolean");
    }

    public C56932sn(C55682qk r2, C64393Dh r3, C69263Wi r4, C56352rq r5, C56492s4 r6, C620633i r7, C56612sH r8, C54292oU r9, AnonymousClass33p r10, AnonymousClass1VX r11, AnonymousClass4FV r12, C48092eK r13, AnonymousClass33K r14, C49652gs r15, C55862r2 r16, C45112Ys r17, C55732qp r18, C29361ih r19, AnonymousClass2MF r20, C54132oE r21, WebpUtils webpUtils, C49932hK r23, C48282ee r24, AnonymousClass2X1 r25, C33111sS r26, C54962pZ r27, AnonymousClass2X3 r28, C54972pa r29, C47262cy r30, C54512oq r31, C50262ht r32, C60462yb r33, C51092jG r34, AnonymousClass4FS r35, C183538qC r36) {
        this.A08 = r8;
        this.A0B = r11;
        this.A04 = r4;
        this.A02 = r2;
        this.A09 = r9;
        this.A0Z = r35;
        this.A0M = webpUtils;
        this.A03 = r3;
        this.A06 = r6;
        this.A0C = r12;
        this.A0G = r16;
        this.A0E = r14;
        this.A0V = r31;
        this.A0I = r18;
        this.A07 = r7;
        this.A0R = r27;
        this.A0T = r29;
        this.A0J = r19;
        this.A0Q = r26;
        this.A0A = r10;
        this.A0O = r24;
        this.A0S = r28;
        this.A0F = r15;
        this.A0a = r36;
        this.A0Y = r34;
        this.A0H = r17;
        this.A0W = r32;
        this.A0K = r20;
        this.A0L = r21;
        this.A0P = r25;
        this.A05 = r5;
        this.A0U = r30;
        this.A0D = r13;
        this.A0N = r23;
        this.A0X = r33;
    }

    public void A0G(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0I(AnonymousClass0x7.A0b(it), (Long) null, z, false);
        }
        this.A04.A0S(new C71573cK(this, 19, collection));
    }
}
