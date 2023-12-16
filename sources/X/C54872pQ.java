package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2pQ  reason: invalid class name and case insensitive filesystem */
public final class C54872pQ {
    public final C56972sr A00;
    public final AnonymousClass33p A01;
    public final C620733j A02;
    public final C66473Lo A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass5P0 A05;

    public final boolean A00() {
        Log.d("FunStickerManagerDebug/isLanguageSupported");
        AnonymousClass1VX r4 = this.A04;
        String A08 = C56952sp.A08(r4, 4631);
        if (C175738Zn.A0V(A08)) {
            Log.d("FunStickerManagerDebug/isLanguageSupported/supportedLanguages is null or blank");
        } else {
            List A012 = AnonymousClass2AB.A01(A08, ",");
            C18260x0.A1P(AnonymousClass001.A0o(), "FunStickerManagerDebug/isLanguageSupported/languages = ", A012);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FunStickerManagerDebug/isLanguageSupported/local language = ");
            C620733j r1 = this.A02;
            C18260x0.A1J(A0o, r1.A07());
            if (!A012.contains(r1.A07()) || !r4.A0Y(C58422vE.A02, 4445)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A01), "fun_stickers_notice_started_clicked") || !A00() || !this.A04.A0Y(C58422vE.A02, 4837)) {
            return false;
        }
        return true;
    }

    public C54872pQ(C56972sr r1, AnonymousClass33p r2, C620733j r3, C66473Lo r4, AnonymousClass1VX r5, AnonymousClass5P0 r6) {
        C18260x0.A0V(r5, r1, r3);
        C18260x0.A0T(r2, r4);
        this.A04 = r5;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final boolean A01() {
        if (A00()) {
            C183538qC r3 = this.A01.A01;
            if (C18300x5.A0B(r3).getBoolean("fun_stickers_upsell_dismissed", false) || C18300x5.A0B(r3).getInt("fun_stickers_upsell_seen_count", 0) > 2 || !this.A04.A0Y(C58422vE.A02, 4543)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
