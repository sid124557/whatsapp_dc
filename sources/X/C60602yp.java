package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2yp  reason: invalid class name and case insensitive filesystem */
public class C60602yp {
    public final C55682qk A00;
    public final C183538qC A01;

    public void A03(String str) {
        C85284Fq A08 = C18630y0.A08(this.A01);
        try {
            ((AnonymousClass3H0) A08).A03.A07("starred_stickers", "plaintext_hash = ?", "removeStarredStickerHash/DELETE_STARRED_STICKER", C18300x5.A1a(str, 1));
            A08.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C60602yp(C55682qk r1, C183538qC r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final AnonymousClass2UB A00(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plaintext_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("enc_hash");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("mimetype");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("is_first_party");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("is_fun_sticker");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("is_lottie");
        String string = cursor2.getString(columnIndexOrThrow);
        String string2 = cursor2.getString(columnIndexOrThrow6);
        if (string == null) {
            C18260x0.A0q("StarredStickerDBTableHelper.getStarredStickerDataFromAvatarTemplateId(): sticker plainFileHash is null, file path:", string2, AnonymousClass001.A0o());
            return null;
        }
        int A012 = C18290x4.A01(cursor2, columnIndexOrThrow17);
        String string3 = cursor2.getString(columnIndexOrThrow2);
        long j = cursor2.getLong(columnIndexOrThrow3);
        String string4 = cursor2.getString(columnIndexOrThrow4);
        String string5 = cursor2.getString(columnIndexOrThrow5);
        String string6 = cursor2.getString(columnIndexOrThrow7);
        String string7 = cursor2.getString(columnIndexOrThrow8);
        int i = cursor2.getInt(columnIndexOrThrow9);
        int i2 = cursor2.getInt(columnIndexOrThrow10);
        int i3 = cursor2.getInt(columnIndexOrThrow11);
        return new AnonymousClass2UB(string, string3, string4, string5, string2, string6, string7, cursor2.getString(columnIndexOrThrow12), cursor2.getString(columnIndexOrThrow15), i, i2, i3, j, AnonymousClass000.A1U(cursor2.getInt(columnIndexOrThrow13), 1), AnonymousClass000.A1U(cursor2.getInt(columnIndexOrThrow14), 1), AnonymousClass000.A1U(cursor2.getInt(columnIndexOrThrow16), 1), AnonymousClass000.A1U(A012, 1));
    }

    public List A01(int i, int i2) {
        String str;
        String str2;
        String[] strArr;
        Cursor A0E;
        int i3;
        ArrayList A0s = AnonymousClass001.A0s();
        int i4 = i2;
        if (i2 == 0) {
            str = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers ORDER BY timestamp DESC LIMIT ?";
        } else {
            str = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE is_avatar = ? ORDER BY timestamp DESC LIMIT ?";
        }
        if (i4 == 2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        int i5 = i;
        if (i2 == 0) {
            strArr = new String[1];
            C18320x8.A1Q(strArr, i5, 0);
        } else {
            strArr = new String[2];
            strArr[0] = str2;
            C18320x8.A1Q(strArr, i5, 1);
        }
        try {
            AnonymousClass4GK A04 = C18630y0.A04(this.A01);
            try {
                A0E = ((AnonymousClass3H0) A04).A03.A0E(str, "getStarredStickersData/QUERY_RECENT_STARRED_STICKERS", strArr);
                int columnIndexOrThrow = A0E.getColumnIndexOrThrow("plaintext_hash");
                int columnIndexOrThrow2 = A0E.getColumnIndexOrThrow("hash_of_image_part");
                int columnIndexOrThrow3 = A0E.getColumnIndexOrThrow("timestamp");
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
                int columnIndexOrThrow14 = A0E.getColumnIndexOrThrow("is_avatar");
                int columnIndexOrThrow15 = A0E.getColumnIndexOrThrow("avatar_template_id");
                int columnIndexOrThrow16 = A0E.getColumnIndexOrThrow("is_fun_sticker");
                int columnIndexOrThrow17 = A0E.getColumnIndexOrThrow("is_lottie");
                while (A0E.moveToNext()) {
                    String string = A0E.getString(columnIndexOrThrow);
                    String string2 = A0E.getString(columnIndexOrThrow6);
                    if (string == null) {
                        C18260x0.A0q("StarredStickerDBTableHelper.getStarredStickersData(): sticker plainFileHash is null, direct path:", string2, AnonymousClass001.A0o());
                    } else {
                        if (A0E.isNull(columnIndexOrThrow17)) {
                            i3 = 0;
                        } else {
                            i3 = A0E.getInt(columnIndexOrThrow17);
                        }
                        String string3 = A0E.getString(columnIndexOrThrow2);
                        long j = A0E.getLong(columnIndexOrThrow3);
                        String string4 = A0E.getString(columnIndexOrThrow4);
                        String string5 = A0E.getString(columnIndexOrThrow5);
                        String string6 = A0E.getString(columnIndexOrThrow7);
                        String string7 = A0E.getString(columnIndexOrThrow8);
                        int i6 = A0E.getInt(columnIndexOrThrow9);
                        int i7 = A0E.getInt(columnIndexOrThrow10);
                        int i8 = A0E.getInt(columnIndexOrThrow11);
                        A0s.add(new AnonymousClass2UB(string, string3, string4, string5, string2, string6, string7, A0E.getString(columnIndexOrThrow12), A0E.getString(columnIndexOrThrow15), i6, i7, i8, j, AnonymousClass000.A1U(A0E.getInt(columnIndexOrThrow13), 1), AnonymousClass000.A1U(A0E.getInt(columnIndexOrThrow14), 1), AnonymousClass000.A1U(A0E.getInt(columnIndexOrThrow16), 1), AnonymousClass000.A1U(i3, 1)));
                    }
                }
                A0E.close();
                A04.close();
                return A0s;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("StarredStickerDBTableHelper.getStarredStickersData", e);
            C55682qk.A04(this.A00, "StarredStickerDBTableHelper.getStarredStickersData", e);
            return A0s;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A02(AnonymousClass2UB r7) {
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("plaintext_hash", r7.A0D);
        A06.put("hash_of_image_part", r7.A02);
        C18290x4.A19(A06, r7.A0A);
        A06.put("url", r7.A0G);
        A06.put("enc_hash", r7.A0C);
        A06.put("direct_path", r7.A0B);
        A06.put("mimetype", r7.A0F);
        A06.put("media_key", r7.A0E);
        A06.put("file_size", Integer.valueOf(r7.A07));
        A06.put("width", Integer.valueOf(r7.A09));
        A06.put("height", Integer.valueOf(r7.A08));
        A06.put("emojis", r7.A01);
        A06.put("is_first_party", Boolean.valueOf(r7.A05));
        A06.put("is_avatar", Boolean.valueOf(r7.A04));
        A06.put("avatar_template_id", r7.A00);
        A06.put("is_fun_sticker", Boolean.valueOf(r7.A03));
        A06.put("is_lottie", Boolean.valueOf(r7.A06));
        C85284Fq A08 = C18630y0.A08(this.A01);
        try {
            ((AnonymousClass3H0) A08).A03.A0C("starred_stickers", "addStarredStickerHash/INSERT_STARRED_STICKER", A06, 5);
            A08.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
