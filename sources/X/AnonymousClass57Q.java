package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.57Q  reason: invalid class name */
public final class AnonymousClass57Q extends C54262oR {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5JT A01;
    public final /* synthetic */ AnonymousClass5YA A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public AnonymousClass57Q(Context context, AnonymousClass5JT r2, AnonymousClass5YA r3, Integer num, String str, List list) {
        this.A02 = r3;
        this.A05 = list;
        this.A03 = num;
        this.A04 = str;
        this.A01 = r2;
        this.A00 = context;
    }

    public void A00() {
        AnonymousClass5YA r1 = this.A02;
        ((C105695Wa) C18300x5.A0b(r1.A0B)).A01((Boolean) null, this.A03, (Integer) null, (Integer) null, this.A04, this.A05, 1, true);
        C183538qC r2 = r1.A0J;
        AnonymousClass5YA.A01(r1, r2);
        C86644Kx.A0c(r2).A05("FINISH_CROSSPOST");
        C86644Kx.A0c(r2).A01();
    }

    public void A01(C52732lx r14, C53872no r15) {
        C106245Ye.A00("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/success Eligibility check successful");
        AnonymousClass5YA r2 = this.A02;
        C70513ac r7 = new C70513ac(r2.A0H.get(), r14, r15, this, 29);
        C86644Kx.A0c(r2.A0J).A05("SEE_CROSSPOST_SUCCESS");
        C105945Xa A002 = AnonymousClass5YA.A00(r2);
        List list = this.A05;
        String str = r14.A01;
        Integer num = this.A03;
        AnonymousClass5JT r3 = this.A01;
        Handler A0A = AnonymousClass000.A0A();
        A002.A01(new AnonymousClass54B(A0A, r3, A002, num, r7, str, list), "status_fragment", R.string.f11nameremoved, R.string.f11nameremoved, false);
        A0A.postDelayed(r7, 4000);
    }

    public void A02(Integer num, Integer num2, String str, boolean z) {
        C106245Ye.A00("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/delivery failure");
        AnonymousClass5YA r6 = this.A02;
        List list = this.A05;
        ((C105695Wa) C18300x5.A0b(r6.A0B)).A01((Boolean) null, this.A03, num, num2, str, list, 4, true);
        C183538qC r2 = r6.A0J;
        AnonymousClass5YA.A01(r6, r2);
        AnonymousClass5JT r5 = this.A01;
        if (z) {
            C109525el r4 = new C109525el(r6, r5, list, 17);
            C1232267p r3 = new C1232267p(r6, 2);
            C105945Xa A002 = AnonymousClass5YA.A00(r6);
            A002.A01.BkS(new C71613cO((View.OnClickListener) r4, (C88674aZ) r3, r5, A002));
            return;
        }
        ((C105945Xa) C18300x5.A0b(r6.A0C)).A02("status_fragment");
        C86644Kx.A0c(r2).A07("SEE_CROSSPOST_ERROR", "Error code: -1, error subcode: null");
    }

    public void A03(Integer num, String str, int i, boolean z) {
        C106245Ye.A00(AnonymousClass000.A0Y("XFamilyCrosspostManager/generateAutoShareSessionManagerCallback/error Failed eligibility check. Errorcode: ", AnonymousClass001.A0o(), i));
        AnonymousClass5YA r1 = this.A02;
        List list = this.A05;
        ((C105695Wa) C18300x5.A0b(r1.A0B)).A01((Boolean) null, this.A03, Integer.valueOf(i), num, str, list, 3, true);
        C183538qC r3 = r1.A0J;
        AnonymousClass5YA.A01(r1, r3);
        Context context = this.A00;
        AnonymousClass5JT r5 = this.A01;
        if (z) {
            C109525el r4 = new C109525el(r1, r5, list, 17);
            C88704ac r32 = new C88704ac(context, r1, num, i);
            C105945Xa A002 = AnonymousClass5YA.A00(r1);
            A002.A01.BkS(new C71613cO((View.OnClickListener) r4, (C88674aZ) r32, r5, A002));
            return;
        }
        r1.A03(context, num, "status_fragment", i);
        C111135hb A0c = C86644Kx.A0c(r3);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error code: ");
        A0o.append(i);
        A0c.A07("SEE_CROSSPOST_ERROR", AnonymousClass000.A0P(num, ", error subcode: ", A0o));
    }
}
