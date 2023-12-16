package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2yb  reason: invalid class name and case insensitive filesystem */
public class C60462yb {
    public final C183538qC A00;

    public void A02(C50612iT r8, String str, String str2) {
        C85284Fq A08 = C18630y0.A08(this.A00);
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("authority", str);
            A06.put("sticker_pack_id", str2);
            A06.put("sticker_pack_name", r8.A0I);
            A06.put("sticker_pack_publisher", r8.A0K);
            String str3 = r8.A0H;
            A06.put("sticker_pack_image_data_hash", str3);
            int i = 1;
            C18270x1.A0b(A06, "avoid_cache", AnonymousClass000.A1S(r8.A0P ? 1 : 0) ? 1 : 0);
            if (!r8.A0Q) {
                i = 0;
            }
            AnonymousClass3H0.A01(A06, A08, "is_animated_pack", i).A0C("third_party_whitelist_packs", "whitelistPack/INSERT_THIRD_PARTY_WHITELIST_PACKS", A06, 5);
            r8.A01 = r8.A02;
            r8.A03 = str3;
            A08.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public boolean A03(String str, String str2) {
        Cursor A0E;
        AnonymousClass4GK A04 = C18630y0.A04(this.A00);
        try {
            C56862sg r4 = ((AnonymousClass3H0) A04).A03;
            String[] A1Z = AnonymousClass0x9.A1Z();
            boolean z = false;
            C18280x3.A19(str, str2, A1Z);
            A0E = r4.A0E("SELECT COUNT(*) AS count FROM third_party_whitelist_packs WHERE authority= ? AND sticker_pack_id= ?", "checkExistence/QUERY_THIRD_PARTY_WHITELIST_PACKS", A1Z);
            if (A0E.moveToNext() && AnonymousClass0x2.A03(A0E) > 0) {
                z = true;
            }
            A0E.close();
            A04.close();
            return z;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C60462yb(C183538qC r1) {
        this.A00 = r1;
    }

    public static final C50612iT A00(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String string = cursor.getString(i3);
        String str = "";
        if (string == null) {
            string = str;
        }
        String string2 = cursor.getString(i4);
        if (string2 != null) {
            str = string2;
        }
        C47652db r2 = new C47652db();
        r2.A0E = AnonymousClass336.A01(cursor.getString(i), cursor.getString(i2));
        r2.A0G = string;
        r2.A0I = str;
        r2.A0N = AnonymousClass0x9.A18();
        r2.A0M = AnonymousClass0x9.A18();
        boolean z = true;
        r2.A0V = true;
        if (i5 > 0) {
            r2.A06 = cursor.getString(i5);
        }
        if (i6 > 0) {
            r2.A0P = AnonymousClass000.A1U(cursor.getInt(i6), 1);
        }
        if (i7 > 0) {
            if (cursor.getInt(i7) != 1) {
                z = false;
            }
            r2.A0Q = z;
            r2.A0O = z;
        }
        return new C50612iT(r2);
    }

    public List A01() {
        Cursor A01;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A04 = C18630y0.A04(this.A00);
        try {
            A01 = C56862sg.A01(((AnonymousClass3H0) A04).A03, "SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs", "getCachedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS");
            int columnIndexOrThrow = A01.getColumnIndexOrThrow("authority");
            int columnIndexOrThrow2 = A01.getColumnIndexOrThrow("sticker_pack_id");
            int columnIndexOrThrow3 = A01.getColumnIndexOrThrow("sticker_pack_name");
            int columnIndexOrThrow4 = A01.getColumnIndexOrThrow("sticker_pack_publisher");
            int columnIndex = A01.getColumnIndex("sticker_pack_image_data_hash");
            int columnIndex2 = A01.getColumnIndex("avoid_cache");
            int columnIndex3 = A01.getColumnIndex("is_animated_pack");
            while (A01.moveToNext()) {
                A0s.add(A00(A01, columnIndexOrThrow, columnIndexOrThrow2, columnIndexOrThrow3, columnIndexOrThrow4, columnIndex, columnIndex2, columnIndex3));
            }
            A01.close();
            A04.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
