package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ht  reason: invalid class name and case insensitive filesystem */
public class C50262ht {
    public final C69263Wi A00;
    public final C54292oU A01;
    public final AnonymousClass336 A02;
    public final C29361ih A03;
    public final C60822zE A04;
    public final AnonymousClass2ID A05;
    public final C51082jF A06;
    public final C60462yb A07;

    public C50262ht(C69263Wi r1, C54292oU r2, AnonymousClass336 r3, C29361ih r4, C60822zE r5, AnonymousClass2ID r6, C51082jF r7, C60462yb r8) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
    }

    public C50612iT A00(String str, String str2) {
        C50612iT r4;
        Cursor A0E;
        C50612iT r6;
        boolean z;
        List A012;
        Cursor A0E2;
        String str3;
        String str4;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ThirdPartyStickerManager/fetchPack/");
        String str5 = str;
        A0o.append(str5.hashCode());
        String str6 = str2;
        C18260x0.A0s("/", str6, A0o);
        C60462yb r5 = this.A07;
        if (!r5.A03(str5, str6)) {
            Log.i("ThirdPartyStickerManager/fetchPack/not using sticker cache");
            return this.A02.A02(str5, str6);
        }
        try {
            AnonymousClass336 r62 = this.A02;
            r4 = r62.A03(str5, str6);
            if (r4.A0P) {
                Log.i("ThirdPartyStickerManager/fetchPack/avoid caching is true");
                return r62.A02(str5, str6);
            }
        } catch (Exception e) {
            Log.e("ThirdPartyStickerManager/fetchPack/could not fetch pack metadata", e);
            r4 = null;
        }
        AnonymousClass4GK A042 = C18630y0.A04(r5.A00);
        try {
            C56862sg r8 = ((AnonymousClass3H0) A042).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            AnonymousClass000.A16(str5, str6, A1Z);
            A0E = r8.A0E("SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs WHERE authority = ? AND sticker_pack_id = ? LIMIT 1", "getCachedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS", A1Z);
            if (!A0E.moveToNext()) {
                A0E.close();
                A042.close();
                r6 = null;
            } else {
                r6 = C60462yb.A00(A0E, A0E.getColumnIndexOrThrow("authority"), A0E.getColumnIndexOrThrow("sticker_pack_id"), A0E.getColumnIndexOrThrow("sticker_pack_name"), A0E.getColumnIndexOrThrow("sticker_pack_publisher"), A0E.getColumnIndex("sticker_pack_image_data_hash"), A0E.getColumnIndex("avoid_cache"), A0E.getColumnIndex("is_animated_pack"));
                A0E.close();
                A042.close();
            }
            if (r4 == null || !(r6 == null || (str4 = r6.A03) == null || !str4.equals(r4.A0H))) {
                z = false;
            } else {
                z = true;
                r5.A02(r4, str5, str6);
                r6 = r4;
                Log.i("ThirdPartyStickerManager/fetchPack/repopulate sticker pack db");
                C51082jF r82 = this.A06;
                File A013 = r82.A01(r4.A0G);
                if (A013 != null && C627536m.A0O(A013)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A1J(A0o2, C18300x5.A0k(A013, "ThirdPartyStickerTrayIconCache/removeCachedTrayIcon: ", A0o2));
                }
                r82.A00(r4, this.A02.A04(r4));
            }
            C60822zE r42 = this.A04;
            synchronized (r42) {
                A012 = r42.A01(str5, str6, (String) null);
            }
            if (A012.isEmpty() || z) {
                A012 = this.A02.A02(str5, str6).A05;
                r42.A02(str5, str6, A012);
                Log.i("ThirdPartyStickerManager/fetchPack/repopulating sticker cache");
            }
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
                String str7 = A0b.A0D;
                if (str7 != null) {
                    AnonymousClass4GK A043 = C18630y0.A04(this.A05.A00);
                    try {
                        A0E2 = ((AnonymousClass3H0) A043).A03.A0E("SELECT emojis FROM third_party_sticker_emoji_mapping WHERE plaintext_hash = ?", "getEmoji/QUERY_EMOJI", C18270x1.A1b(str7));
                        if (A0E2.moveToNext()) {
                            str3 = AnonymousClass0x2.A0Z(A0E2, "emojis");
                            A0E2.close();
                            A043.close();
                        } else {
                            A0E2.close();
                            A043.close();
                            str3 = null;
                        }
                        A0b.A07 = str3;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            A043.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
            C626936e.A06(r6);
            r6.A05 = A012;
            if (z) {
                this.A00.A0S(new C71573cK(this, 24, r6));
            }
            return r6;
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
        throw th;
        throw th;
    }

    public File A01(String str) {
        Pair A002 = AnonymousClass336.A00(str);
        if (A002 != null) {
            if (this.A07.A03((String) A002.first, (String) A002.second)) {
                C51082jF r3 = this.A06;
                File A012 = r3.A01(str);
                if (A012 != null && A012.exists()) {
                    return A012;
                }
                try {
                    AnonymousClass336 r2 = this.A02;
                    C50612iT A022 = r2.A02((String) A002.first, (String) A002.second);
                    return r3.A00(A022, r2.A04(A022));
                } catch (Exception e) {
                    Log.e("ThirdPartyStickerManager/getTrayIcon/error fetching pack", e);
                    return null;
                }
            }
        }
        return null;
    }
}
