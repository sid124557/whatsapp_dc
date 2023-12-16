package X;

import android.os.Handler;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3Xm  reason: invalid class name and case insensitive filesystem */
public final class C69553Xm implements C84954Ej {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C54362ob A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public C69553Xm(C54362ob r1, String str, List list, int i) {
        this.A02 = str;
        this.A01 = r1;
        this.A03 = list;
        this.A00 = i;
    }

    public void BQp() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/[New Status]Eligibility delivery failure for session: ");
        String str = this.A02;
        AnonymousClass356.A05(A0o, str);
        this.A01.A02(AnonymousClass217.ELIGIBILITY, str);
    }

    public void BSA(C73263fC r7) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/[New Status]Eligibility failed for session: ");
        String str = this.A02;
        A0o.append(str);
        AnonymousClass356.A01(AnonymousClass000.A0P(r7, " with exception: ", A0o));
        this.A01.A01(AnonymousClass217.ELIGIBILITY, r7, str, this.A03, this.A00);
    }

    public void BdA(C53572nJ r14, C53862nn r15) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CrosspostRequestSessionManager/[New Status]Eligibility success for session: ");
        AnonymousClass356.A05(A0o, this.A02);
        C54362ob r11 = this.A01;
        C53572nJ r9 = r14;
        C53862nn r10 = r15;
        if (r11 instanceof C34511vH) {
            C34511vH r112 = (C34511vH) r11;
            AnonymousClass30E r3 = r112.A01;
            C70513ac r7 = new C70513ac(r3.A05, r9, r10, r112, 24);
            C111145hc A022 = r3.A02();
            if (A022 != null) {
                A022.A05("SEE_CROSSPOST_SUCCESS");
            }
            C129586aY r2 = r14.A02;
            AnonymousClass228 A002 = C59462wx.A00(r112.A03);
            C69573Xo r4 = new C69573Xo(r3, r14, r112.A02);
            C162457s7.A0J(A002, 3);
            Handler A0A = AnonymousClass000.A0A();
            r2.size();
            ((C52722lw) r3.A0C.get()).A00(new AnonymousClass547(A0A, r7, r4, 26), "status_fragment", A002.autoCrosspostingSuccessText, R.string.f11nameremoved);
            A0A.postDelayed(r7, 4000);
        } else if (r11 instanceof C34501vG) {
            C34501vG r113 = (C34501vG) r11;
            AnonymousClass30E r22 = r113.A02;
            C70513ac r72 = new C70513ac(r22.A05, r9, r10, r113, 24);
            C111145hc A023 = r22.A02();
            if (A023 != null) {
                A023.A05("SEE_CROSSPOST_SUCCESS");
            }
            C52722lw r5 = (C52722lw) r22.A0C.get();
            List list = r113.A04;
            AnonymousClass228 A003 = C59462wx.A00(C18290x4.A12(r113.A01));
            String str = r113.A03;
            C70153a2 r73 = new C70153a2(r22, 31, r14);
            C162457s7.A0J(A003, 2);
            Handler A0A2 = AnonymousClass000.A0A();
            list.size();
            r5.A00(new C33211sd(A0A2, A003, r5, r72, r73, str), str, A003.crosspostingSuccessText, R.string.f11nameremoved);
            A0A2.postDelayed(r72, 4000);
        }
    }
}
