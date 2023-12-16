package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.FunStickersNoticeBottomSheet;
import com.whatsapp.funstickers.data.pdf.GenAiPrivacyLauncher$attemptDownloadDisclosure$1;
import com.whatsapp.util.Log;

/* renamed from: X.2wg  reason: invalid class name and case insensitive filesystem */
public final class C59292wg {
    public final C54872pQ A00;
    public final C45992au A01;

    public final void A01(C003203q r11, C632338l r12, int i) {
        int i2;
        AnonymousClass21D r1;
        C89654ea r5;
        C003203q r52 = r11;
        C162457s7.A0J(r11, 0);
        C08270df supportFragmentManager = r11.getSupportFragmentManager();
        C54872pQ r3 = this.A00;
        if ((AnonymousClass0x2.A0F(r3.A01).getBoolean("fun_stickers_notice_started_clicked", false) || !r3.A00() || !r3.A04.A0Y(C58422vE.A02, 5082)) && !r3.A02()) {
            AnonymousClass1VX r13 = r3.A04;
            C58422vE r32 = C58422vE.A02;
            if (r13.A0Y(r32, 4837) || r13.A0Y(r32, 5082)) {
                A00(supportFragmentManager, r12, i);
                return;
            }
            C45992au r6 = this.A01;
            AnonymousClass403 r2 = new AnonymousClass403(supportFragmentManager, this, r12, i);
            String A0R = r6.A00.A0R(r32, 5206);
            if (A0R != null) {
                i2 = Integer.parseInt(A0R);
            } else {
                i2 = 20900727;
            }
            AnonymousClass44C r8 = new AnonymousClass44C(r11, r6, r2, i2);
            try {
                boolean A05 = r6.A02.A05(i2);
                C18260x0.A1D("GenAiPrivacyLauncher/isAccepted, was accepted ", AnonymousClass001.A0o(), A05);
                if (A05) {
                    r1 = AnonymousClass21D.TRUE;
                } else {
                    r1 = AnonymousClass21D.FALSE;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GenAiPrivacyLauncher/isAccepted, Error getting disclosure state");
                r1 = AnonymousClass21D.ERROR;
            }
            if (r1 != AnonymousClass21D.ERROR) {
                r8.invoke(r1);
                return;
            }
            Log.d("GenAiPrivacyLauncher/getNoticeStatus Attempt to download disclosure");
            if ((r11 instanceof C89654ea) && (r5 = (C89654ea) r52) != null) {
                C616131n.A02(r6.A03, new GenAiPrivacyLauncher$attemptDownloadDisclosure$1(r5, r6, (C84814Du) null, r8, i2), AnonymousClass0IT.A00(r5), (AnonymousClass20D) null, 2);
                return;
            }
            return;
        }
        FunStickersNoticeBottomSheet funStickersNoticeBottomSheet = new FunStickersNoticeBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("stickerOrigin", i);
        if (r12 != null) {
            A08.putParcelable("funStickerData", r12);
        }
        funStickersNoticeBottomSheet.A0u(A08);
        if (supportFragmentManager.A0D("fun_stickers_notice_dialog") == null) {
            funStickersNoticeBottomSheet.A1O(supportFragmentManager, "fun_stickers_notice_dialog");
        }
    }

    public static final void A00(C08270df r3, C632338l r4, int i) {
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = new SearchFunStickersBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("stickerOrigin", i);
        if (r4 != null) {
            A08.putParcelable("funStickerData", r4);
        }
        searchFunStickersBottomSheet.A0u(A08);
        if (r3.A0D("search_fun_stickers_bottom_sheet") == null) {
            searchFunStickersBottomSheet.A1O(r3, "search_fun_stickers_bottom_sheet");
        }
    }

    public C59292wg(C54872pQ r1, C45992au r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
