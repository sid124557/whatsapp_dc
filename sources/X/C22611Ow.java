package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1Ow  reason: invalid class name and case insensitive filesystem */
public class C22611Ow extends C56822sc {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C56352rq A02;
    public final C46952cT A03;
    public final AnonymousClass1VX A04;
    public final C29361ih A05;
    public final C56932sn A06;
    public final C54962pZ A07;
    public final AnonymousClass4FS A08;

    public final AnonymousClass39M A0D(AnonymousClass1SP r8) {
        StringBuilder A0o;
        String str;
        C47192cr r1 = r8.A01;
        AnonymousClass39M r6 = new AnonymousClass39M();
        String str2 = r1.A07;
        r6.A0D = str2;
        r6.A0G = r1.A08;
        r6.A08 = r1.A04;
        r6.A0B = r1.A05;
        r6.A0C = r1.A06;
        r6.A03 = r1.A01;
        r6.A02 = r1.A00;
        String str3 = r1.A03;
        r6.A06 = str3;
        r6.A00 = (int) r1.A02;
        if (str3 == null) {
            Log.e("FavouriteStickerHandler/findStickerAndDownload Receive empty sticker direct path");
            return null;
        }
        C56932sn r3 = this.A06;
        C626936e.A06(str2);
        File A022 = r3.A05.A02(str2);
        C626936e.A06(A022);
        if (A022.exists()) {
            A0o = AnonymousClass001.A0o();
            str = "StickerRepository/setFileForFavoriteSticker exist in internal file, fileHash=";
        } else {
            A022 = r3.A04(r6, A022);
            if (A022 == null || !A022.exists()) {
                C18260x0.A0t("StickerRepository/setFileForFavoriteSticker download fail, fileHash=", str2, AnonymousClass001.A0o());
                return null;
            }
            A0o = AnonymousClass001.A0o();
            str = "StickerRepository/setFileForFavoriteSticker download successfully, fileHash=";
        }
        C18260x0.A0q(str, str2, A0o);
        AnonymousClass39M.A02(r6, A022);
        r3.A0I.A04(r6);
        return r6;
    }

    public final void A0E(AnonymousClass39M r4, long j) {
        if (!r4.A0J && this.A06.A0I(r4, Long.valueOf(j), true, true)) {
            this.A00.A0S(new C70193a6(this, 36, r4));
        }
    }

    public final void A0F(String str) {
        C54962pZ r2 = this.A07;
        AnonymousClass39M A002 = r2.A00(str);
        if (A002 != null) {
            this.A02.A06(str);
            C626936e.A00();
            r2.A01();
            C54492oo r1 = r2.A01;
            r1.A02(str, r1.A00(str));
            r2.A05.A03(str);
            this.A00.A0S(new C70193a6(this, 38, A002));
        }
    }

    public C22611Ow(C69263Wi r1, C56972sr r2, C56352rq r3, C46952cT r4, C623934v r5, AnonymousClass1VX r6, C29361ih r7, C56932sn r8, C54962pZ r9, AnonymousClass4FS r10) {
        super(r5);
        this.A04 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = r10;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r3;
        this.A03 = r4;
    }
}
