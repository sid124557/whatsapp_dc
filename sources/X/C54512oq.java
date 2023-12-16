package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2oq  reason: invalid class name and case insensitive filesystem */
public class C54512oq {
    public final C55732qp A00;
    public final C183538qC A01;

    public AnonymousClass39M A00(String str) {
        Cursor A0E;
        AnonymousClass39M r0;
        try {
            AnonymousClass4GK A04 = C18630y0.A04(this.A01);
            try {
                C56862sg r4 = ((AnonymousClass3H0) A04).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                A1Y[0] = str;
                A0E = r4.A0E("SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM stickers WHERE avatar_template_id = ?", "getByPackId/QUERY_STICKER", A1Y);
                List A012 = A01(A0E);
                if (A012.size() > 0) {
                    r0 = (AnonymousClass39M) A012.get(0);
                } else {
                    r0 = null;
                }
                if (A0E != null) {
                    A0E.close();
                }
                A04.close();
                return r0;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("StickerDBTableHelper/getByPackId", e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public List A02(String str) {
        Cursor A0E;
        try {
            AnonymousClass4GK A04 = C18630y0.A04(this.A01);
            try {
                A0E = ((AnonymousClass3H0) A04).A03.A0E("SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM stickers WHERE sticker_pack_id = ?", "getByPackId/QUERY_STICKER", C18270x1.A1b(str));
                List A012 = A01(A0E);
                if (A0E != null) {
                    A0E.close();
                }
                A04.close();
                return A012;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("StickerDBTableHelper/getByPackId", e);
            return AnonymousClass001.A0s();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A03(List list) {
        C69833Yo Axl;
        C85284Fq A08 = C18630y0.A08(this.A01);
        try {
            Axl = A08.Axl();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
                C56862sg r4 = ((AnonymousClass3H0) A08).A03;
                ContentValues A06 = AnonymousClass0x9.A06();
                A06.put("plain_file_hash", A0b.A0D);
                A06.put("encrypted_file_hash", A0b.A08);
                A06.put("media_key", A0b.A0B);
                A06.put("mime_type", A0b.A0C);
                A06.put("height", Integer.valueOf(A0b.A02));
                A06.put("width", Integer.valueOf(A0b.A03));
                A06.put("sticker_pack_id", A0b.A0F);
                A06.put("file_path", A0b.A09);
                A06.put("file_size", Integer.valueOf(A0b.A00));
                A06.put("url", A0b.A0G);
                A06.put("direct_path", A0b.A06);
                A06.put("emojis", A0b.A07);
                A06.put("hash_of_image_part", A0b.A0A);
                A06.put("is_avatar", Boolean.valueOf(A0b.A0J));
                A06.put("is_fun_sticker", Boolean.valueOf(A0b.A0H));
                A06.put("is_lottie", Boolean.valueOf(A0b.A0L));
                A06.put("avatar_template_id", A0b.A05);
                r4.A0C("stickers", "insertStickerToDB/INSERT_STICKER", A06, 5);
            }
            Axl.A00();
            Axl.close();
            A08.close();
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

    public C54512oq(C55732qp r1, C183538qC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public List A01(Cursor cursor) {
        ArrayList A0s = AnonymousClass001.A0s();
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plain_file_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("encrypted_file_hash");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("mime_type");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("sticker_pack_id");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("file_path");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("is_fun_sticker");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("is_lottie");
        while (cursor2.moveToNext()) {
            AnonymousClass39M r1 = new AnonymousClass39M();
            r1.A0D = cursor2.getString(columnIndexOrThrow);
            r1.A08 = cursor2.getString(columnIndexOrThrow2);
            r1.A0B = cursor2.getString(columnIndexOrThrow3);
            r1.A0C = cursor2.getString(columnIndexOrThrow4);
            r1.A02 = cursor2.getInt(columnIndexOrThrow5);
            r1.A03 = cursor2.getInt(columnIndexOrThrow6);
            r1.A0F = cursor2.getString(columnIndexOrThrow7);
            boolean z = true;
            r1.A09 = cursor2.getString(columnIndexOrThrow8);
            r1.A01 = 1;
            r1.A00 = cursor2.getInt(columnIndexOrThrow9);
            r1.A0G = cursor2.getString(columnIndexOrThrow10);
            r1.A06 = cursor2.getString(columnIndexOrThrow11);
            r1.A07 = cursor2.getString(columnIndexOrThrow12);
            r1.A0A = cursor2.getString(columnIndexOrThrow13);
            r1.A0J = AnonymousClass000.A1U(cursor2.getInt(columnIndexOrThrow14), 1);
            r1.A05 = cursor2.getString(columnIndexOrThrow15);
            r1.A0H = AnonymousClass000.A1U(cursor2.getInt(columnIndexOrThrow16), 1);
            if (cursor2.isNull(columnIndexOrThrow17) || cursor2.getInt(columnIndexOrThrow17) != 1) {
                z = false;
            }
            r1.A0L = z;
            this.A00.A04(r1);
            A0s.add(r1);
        }
        return A0s;
    }
}
