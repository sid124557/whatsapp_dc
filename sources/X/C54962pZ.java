package X;

import android.database.Cursor;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.2pZ  reason: invalid class name and case insensitive filesystem */
public class C54962pZ {
    public final C56352rq A00;
    public final C54492oo A01;
    public final C45112Ys A02;
    public final C55732qp A03;
    public final AnonymousClass2IC A04;
    public final C60602yp A05;
    public volatile boolean A06 = false;

    public AnonymousClass39M A00(String str) {
        Cursor A0E;
        C60602yp r0 = this.A05;
        String[] A1b = C18270x1.A1b(str);
        AnonymousClass4GK A042 = C18630y0.A04(r0.A01);
        try {
            A0E = ((AnonymousClass3H0) A042).A03.A0E("SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC", "getStarredStickerDataFromFileHash/QUERY_STARRED_STICKER", A1b);
            if (A0E.moveToNext()) {
                AnonymousClass2UB A002 = C60602yp.A00(A0E);
                A0E.close();
                A042.close();
                if (A002 == null) {
                    return null;
                }
                return AnonymousClass295.A00(this.A00, this.A03, A002);
            }
            A0E.close();
            A042.close();
            return null;
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

    public final void A01() {
        if (!this.A06) {
            C54492oo r2 = this.A01;
            synchronized (r2) {
                if (!this.A06) {
                    C60602yp r3 = this.A05;
                    for (AnonymousClass2UB r4 : r3.A01(Integer.MAX_VALUE, 0)) {
                        if (r4.A02 == null) {
                            try {
                                AnonymousClass2IC r0 = this.A04;
                                File A022 = r0.A00.A02(r4.A0D);
                                if (A022.exists()) {
                                    r4.A02 = WebpUtils.A00(A022);
                                    r3.A02(r4);
                                } else {
                                    throw C18330xA.A05("StickerImageHashCalculator/getImageHash/could not get internally managed media file for sticker");
                                }
                            } catch (FileNotFoundException e) {
                                Log.e("StarredStickers/initStickerDedupeMappings/could not get internally managed media file for sticker, dropping it from starred", e);
                                r3.A03(r4.A0D);
                            }
                        }
                        r2.A01(r4.A0D, r4.A02);
                    }
                    this.A06 = true;
                }
            }
        }
    }

    public C54962pZ(C56352rq r2, C45112Ys r3, C55732qp r4, AnonymousClass2IC r5, C60602yp r6) {
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r2;
        this.A01 = new C54492oo();
    }

    public boolean A02(String str) {
        Cursor A0E;
        boolean containsKey;
        C626936e.A00();
        if (this.A06) {
            C54492oo r1 = this.A01;
            synchronized (r1) {
                containsKey = r1.A00.containsKey(str);
            }
            return containsKey;
        }
        C60602yp r0 = this.A05;
        boolean z = true;
        String[] A1a = C18300x5.A1a(str, 1);
        AnonymousClass4GK A042 = C18630y0.A04(r0.A01);
        try {
            A0E = ((AnonymousClass3H0) A042).A03.A0E("SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie FROM starred_stickers WHERE plaintext_hash = ? ORDER BY timestamp DESC", "checkStickerHashIsStarred/QUERY_STARRED_STICKER", A1a);
            if (A0E.getCount() <= 0) {
                z = false;
            }
            A0E.close();
            A042.close();
            return z;
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
}
