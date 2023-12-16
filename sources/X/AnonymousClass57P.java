package X;

import android.content.Context;
import android.os.Handler;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.57P  reason: invalid class name */
public final class AnonymousClass57P extends C54262oR {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5YA A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public void A01(C52732lx r14, C53872no r15) {
        AnonymousClass5YA r2 = this.A01;
        C70513ac r5 = new C70513ac(r2.A0H.get(), r14, r15, this, 29);
        C86644Kx.A0c(r2.A0J).A05("SEE_CROSSPOST_SUCCESS");
        C105945Xa A002 = AnonymousClass5YA.A00(r2);
        List list = this.A05;
        String str = r14.A01;
        Integer num = this.A02;
        String str2 = this.A04;
        Handler A0A = AnonymousClass000.A0A();
        A002.A01(new AnonymousClass54C(A0A, A002, num, r5, str2, str, list), str2, R.string.f11nameremoved, R.string.f11nameremoved, false);
        A0A.postDelayed(r5, 4000);
    }

    public AnonymousClass57P(Context context, AnonymousClass5YA r2, Integer num, String str, String str2, List list) {
        this.A01 = r2;
        this.A05 = list;
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = context;
    }

    public void A00() {
        AnonymousClass5YA r1 = this.A01;
        ((C105695Wa) C18300x5.A0b(r1.A0B)).A01((Boolean) null, this.A02, (Integer) null, (Integer) null, this.A03, this.A05, 1, false);
        C183538qC r3 = r1.A0J;
        C86644Kx.A0c(r3).A06("is_account_linked", Boolean.TRUE);
        C86644Kx.A0c(r3).A05("FINISH_CROSSPOST");
        C86644Kx.A0c(r3).A01();
    }

    public void A02(Integer num, Integer num2, String str, boolean z) {
        AnonymousClass5YA r2 = this.A01;
        ((C105945Xa) C18300x5.A0b(r2.A0C)).A02(this.A04);
        ((C105695Wa) C18300x5.A0b(r2.A0B)).A01((Boolean) null, this.A02, num, num2, str, this.A05, 4, false);
        C183538qC r0 = r2.A0J;
        AnonymousClass5YA.A01(r2, r0);
        C86644Kx.A0c(r0).A07("SEE_CROSSPOST_ERROR", "Error code: -1, error subcode: null");
    }

    public void A03(Integer num, String str, int i, boolean z) {
        AnonymousClass5YA r2 = this.A01;
        r2.A03(this.A00, num, this.A04, i);
        C105695Wa r3 = (C105695Wa) C18300x5.A0b(r2.A0B);
        List list = this.A05;
        r3.A01((Boolean) null, this.A02, Integer.valueOf(i), num, str, list, 3, false);
        C183538qC r0 = r2.A0J;
        AnonymousClass5YA.A01(r2, r0);
        C111135hb A0c = C86644Kx.A0c(r0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error code: ");
        A0o.append(i);
        A0c.A07("SEE_CROSSPOST_ERROR", AnonymousClass000.A0P(num, ", error subcode: ", A0o));
    }
}
