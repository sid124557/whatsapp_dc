package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.2X2  reason: invalid class name */
public class AnonymousClass2X2 {
    public final C183538qC A00;

    public synchronized int A01(String str) {
        int i;
        C85284Fq A0C = ((AnonymousClass1RH) this.A00.get()).A0C();
        try {
            C69833Yo Axl = A0C.Axl();
            C56862sg r4 = ((AnonymousClass3H0) A0C).A03;
            Cursor A0E = r4.A0E("SELECT pack_order FROM sticker_pack_order WHERE sticker_pack_id = ?", "getOrAddStickerPackOrder/QUERY_STICKER_PACK_ORDER", C18270x1.A1b(str));
            try {
                if (A0E.getCount() <= 0 || !A0E.moveToFirst()) {
                    A0E.close();
                    A0E = C56862sg.A01(r4, "SELECT MAX(pack_order) as max_order FROM sticker_pack_order", "GET_MAX_ORDER_STICKER_PACK");
                    if (A0E.getCount() <= 0 || !A0E.moveToFirst()) {
                        C18260x0.A0r("StickerPackOderDBTableHelper/getOrAddStickerPackOrder/max order is not available for sticker pack: ", str, AnonymousClass001.A0o());
                        i = 1000;
                    } else {
                        i = AnonymousClass0x2.A04(A0E, "max_order");
                    }
                    A0E.close();
                    C18260x0.A0w("StickerPackOrderDBTableHelper/getOrAddStickerPackOrder/max order is:", AnonymousClass001.A0o(), i);
                    int i2 = i + 1;
                    ContentValues A06 = AnonymousClass0x9.A06();
                    A06.put("sticker_pack_id", str);
                    C18270x1.A0b(A06, "pack_order", i2);
                    r4.A09("sticker_pack_order", "getOrAddStickerPackOrder/INSERT_STICKER_PACK_ORDER", A06);
                    Axl.A00();
                    Axl.close();
                    A0C.close();
                    return i2;
                }
                int A04 = AnonymousClass0x2.A04(A0E, "pack_order");
                A0E.close();
                Axl.close();
                A0C.close();
                return A04;
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A0C.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
        throw th;
    }

    public AnonymousClass2X2(C183538qC r1) {
        this.A00 = r1;
    }

    public static void A00(C50612iT r1, C54972pa r2, String str) {
        C626936e.A00();
        r1.A00 = r2.A03.A01(str);
    }
}
