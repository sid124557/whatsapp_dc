package X;

import android.content.ContentValues;
import java.util.List;

/* renamed from: X.3Pq  reason: invalid class name and case insensitive filesystem */
public class C67533Pq implements AnonymousClass4ET {
    public final C60082xy A00;
    public volatile List A01;

    public /* bridge */ /* synthetic */ AnonymousClass4F8 B0c(Object obj, float f) {
        return new C67573Pu((C49922hJ) obj, 1.0f);
    }

    public C67533Pq(AnonymousClass2VG r2, boolean z) {
        this.A00 = r2.A00(z);
    }

    public List BFm() {
        C626936e.A00();
        this.A01 = this.A00.A01();
        return this.A01;
    }

    public void Bgs(List list) {
        C69833Yo Axl;
        String str;
        C626936e.A00();
        this.A01 = AnonymousClass002.A0J(list);
        C60082xy r1 = this.A00;
        List<C67573Pu> list2 = this.A01;
        C85284Fq A08 = C18630y0.A08(r1.A01);
        try {
            Axl = A08.Axl();
            String[] strArr = new String[1];
            if (r1.A02) {
                str = "1";
            } else {
                str = "0";
            }
            C56862sg A04 = AnonymousClass3H0.A04(str, A08, strArr, 0);
            A04.A07("recent_stickers", "is_avocado = ?", "CLEAR_RECENT_STICKER_TABLE", strArr);
            for (C67573Pu r6 : list2) {
                ContentValues A06 = AnonymousClass0x9.A06();
                C49922hJ r8 = r6.A01;
                A06.put("plaintext_hash", r8.A02);
                A06.put("entry_weight", Float.valueOf(r6.A00));
                A06.put("hash_of_image_part", r8.A03);
                AnonymousClass39M r7 = r8.A04;
                AnonymousClass39M.A00(A06, r7);
                C18270x1.A0b(A06, "file_size", r7.A00);
                C18270x1.A0b(A06, "width", r7.A03);
                C18270x1.A0b(A06, "height", r7.A02);
                A06.put("emojis", r7.A07);
                C18270x1.A0b(A06, "is_first_party", AnonymousClass000.A1S(r7.A0K ? 1 : 0) ? 1 : 0);
                C18270x1.A0b(A06, "is_avocado", AnonymousClass000.A1S(r7.A0J ? 1 : 0) ? 1 : 0);
                C18270x1.A0c(A06, "last_sticker_sent_ts", r8.A00);
                A06.put("avatar_template_id", r7.A05);
                C18270x1.A0b(A06, "is_fun_sticker", AnonymousClass000.A1S(r7.A0H ? 1 : 0) ? 1 : 0);
                C18270x1.A0b(A06, "is_lottie", AnonymousClass000.A1S(r7.A0L ? 1 : 0) ? 1 : 0);
                A04.A0A("recent_stickers", "saveWeightedStickerIdentifierToDB/REPLACE_RECENT_STICKERS", A06);
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
}
