package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2xy  reason: invalid class name and case insensitive filesystem */
public class C60082xy {
    public final C183538qC A00;
    public final C183538qC A01;
    public final boolean A02;

    public static final AnonymousClass39M A00(Cursor cursor, C55732qp r6) {
        AnonymousClass39M r4 = new AnonymousClass39M();
        r4.A0D = AnonymousClass0x2.A0Z(cursor, "plaintext_hash");
        r4.A0G = AnonymousClass0x2.A0Z(cursor, "url");
        r4.A08 = AnonymousClass0x2.A0Z(cursor, "enc_hash");
        r4.A06 = AnonymousClass0x2.A0Z(cursor, "direct_path");
        r4.A0C = AnonymousClass0x2.A0Z(cursor, "mimetype");
        r4.A0B = AnonymousClass0x2.A0Z(cursor, "media_key");
        r4.A00 = AnonymousClass0x2.A04(cursor, "file_size");
        r4.A03 = AnonymousClass0x2.A04(cursor, "width");
        r4.A02 = AnonymousClass0x2.A04(cursor, "height");
        r4.A07 = AnonymousClass0x2.A0Z(cursor, "emojis");
        boolean z = false;
        r4.A0K = AnonymousClass000.A1U(AnonymousClass0x2.A04(cursor, "is_first_party"), 1);
        r4.A05 = AnonymousClass0x2.A0Z(cursor, "avatar_template_id");
        r4.A0H = C18260x0.A1Z(cursor, "is_fun_sticker");
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("is_lottie");
        if (!cursor.isNull(columnIndexOrThrow) && cursor.getInt(columnIndexOrThrow) == 1) {
            z = true;
        }
        r4.A0L = z;
        r6.A04(r4);
        return r4;
    }

    public void A02(AnonymousClass39M r10) {
        if (r10.A0D == null) {
            Log.e("RecentStickerDBStorage/updateSticker/sticker filehash is null, could not be updated");
            return;
        }
        C85284Fq A08 = C18630y0.A08(this.A01);
        int i = 1;
        try {
            String[] strArr = {r10.A0D};
            ContentValues A06 = AnonymousClass0x9.A06();
            AnonymousClass39M.A00(A06, r10);
            C18270x1.A0b(A06, "file_size", r10.A00);
            C18270x1.A0b(A06, "width", r10.A03);
            C18270x1.A0b(A06, "height", r10.A02);
            A06.put("emojis", r10.A07);
            C18270x1.A0b(A06, "is_first_party", AnonymousClass000.A1S(r10.A0K ? 1 : 0) ? 1 : 0);
            if (!r10.A0L) {
                i = 0;
            }
            AnonymousClass3H0.A01(A06, A08, "is_lottie", i).A05(A06, "recent_stickers", "plaintext_hash = ?", "updateSticker/UPDATE_RECENT_STICKERS", strArr);
            A08.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C60082xy(C183538qC r1, C183538qC r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public List A01() {
        String str;
        Cursor A0E;
        int i;
        boolean z;
        ArrayList A0s = AnonymousClass001.A0s();
        String[] A1Y = AnonymousClass0x9.A1Y();
        if (this.A02) {
            str = "1";
        } else {
            str = "0";
        }
        A1Y[0] = str;
        AnonymousClass4GK A04 = C18630y0.A04(this.A01);
        try {
            A0E = ((AnonymousClass3H0) A04).A03.A0E("SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie FROM recent_stickers WHERE is_avocado = ? ORDER BY entry_weight DESC", "loadWeightedStickerIdentifiersFromDB/QUERY_RECENT_STICKER", A1Y);
            int columnIndexOrThrow = A0E.getColumnIndexOrThrow("plaintext_hash");
            int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("entry_weight");
            int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("hash_of_image_part");
            int columnIndexOrThrow4 = A0E.getColumnIndexOrThrow("url");
            int columnIndexOrThrow5 = A0E.getColumnIndexOrThrow("enc_hash");
            int columnIndexOrThrow6 = A0E.getColumnIndexOrThrow("direct_path");
            int columnIndexOrThrow7 = A0E.getColumnIndexOrThrow("mimetype");
            int columnIndexOrThrow8 = A0E.getColumnIndexOrThrow("media_key");
            int columnIndexOrThrow9 = A0E.getColumnIndexOrThrow("file_size");
            int columnIndexOrThrow10 = A0E.getColumnIndexOrThrow("width");
            int columnIndexOrThrow11 = A0E.getColumnIndexOrThrow("height");
            int columnIndexOrThrow12 = A0E.getColumnIndexOrThrow("emojis");
            int columnIndexOrThrow13 = A0E.getColumnIndexOrThrow("is_first_party");
            int columnIndexOrThrow14 = A0E.getColumnIndexOrThrow("last_sticker_sent_ts");
            int columnIndexOrThrow15 = A0E.getColumnIndexOrThrow("is_avocado");
            int columnIndexOrThrow16 = A0E.getColumnIndexOrThrow("avatar_template_id");
            int columnIndexOrThrow17 = A0E.getColumnIndexOrThrow("is_fun_sticker");
            int columnIndexOrThrow18 = A0E.getColumnIndexOrThrow("is_lottie");
            while (A0E.moveToNext()) {
                String string = A0E.getString(columnIndexOrThrow);
                float f = A0E.getFloat(columnIndexOrThrow2);
                String string2 = A0E.getString(columnIndexOrThrow3);
                AnonymousClass39M r1 = new AnonymousClass39M();
                r1.A0D = string;
                r1.A0G = A0E.getString(columnIndexOrThrow4);
                r1.A08 = A0E.getString(columnIndexOrThrow5);
                r1.A06 = A0E.getString(columnIndexOrThrow6);
                r1.A0C = A0E.getString(columnIndexOrThrow7);
                r1.A0B = A0E.getString(columnIndexOrThrow8);
                r1.A00 = A0E.getInt(columnIndexOrThrow9);
                r1.A03 = A0E.getInt(columnIndexOrThrow10);
                r1.A02 = A0E.getInt(columnIndexOrThrow11);
                r1.A07 = A0E.getString(columnIndexOrThrow12);
                boolean z2 = true;
                r1.A0K = AnonymousClass000.A1U(A0E.getInt(columnIndexOrThrow13), 1);
                r1.A0A = string2;
                if (A0E.getInt(columnIndexOrThrow15) != 1) {
                    z2 = false;
                }
                r1.A0J = z2;
                r1.A05 = A0E.getString(columnIndexOrThrow16);
                r1.A0H = AnonymousClass001.A1T(A0E.getInt(columnIndexOrThrow17));
                if (A0E.isNull(columnIndexOrThrow18)) {
                    z = true;
                    i = 0;
                } else {
                    i = A0E.getInt(columnIndexOrThrow18);
                    z = true;
                }
                if (i != z) {
                    z = false;
                }
                r1.A0L = z;
                long j = A0E.getLong(columnIndexOrThrow14);
                ((C55732qp) this.A00.get()).A04(r1);
                A0s.add(new C67573Pu(new C49922hJ(r1, string, string2, r1.A05, j), f));
            }
            A0E.close();
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
