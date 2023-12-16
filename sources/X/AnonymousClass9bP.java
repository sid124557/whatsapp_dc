package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.9bP  reason: invalid class name */
public class AnonymousClass9bP implements AnonymousClass4EY {
    public final int A00;
    public final C203549nv A01;
    public final C203499no A02;
    public final WeakReference A03;

    public final void A00(AnonymousClass34V r4, AnonymousClass9C3 r5) {
        int i;
        C203499no r1 = this.A02;
        if (r1 != null) {
            r1.BK0(r4, this.A00);
        }
        r5.BjL();
        if (r4 != null) {
            C203549nv r2 = this.A01;
            if (r2 == null || (i = r2.B7Q((C153607bd) null, r4.A00)) == 0) {
                i = R.string.f11nameremoved;
            }
            r5.Bot(i);
        }
    }

    public void Ba4(AnonymousClass34V r5) {
        AnonymousClass9C3 r3 = (AnonymousClass9C3) this.A03.get();
        if (r3 != null) {
            C1899593h.A1H(r3.A0L, r5, "setDefault/onRequestError. paymentNetworkError: ", AnonymousClass001.A0o());
            A00(r5, r3);
        }
    }

    public void BaB(AnonymousClass34V r5) {
        AnonymousClass9C3 r3 = (AnonymousClass9C3) this.A03.get();
        if (r3 != null) {
            r3.A0L.A04(AnonymousClass000.A0P(r5, "setDefault/onResponseError. paymentNetworkError: ", AnonymousClass001.A0o()));
            A00(r5, r3);
        }
    }

    public void BaC(AnonymousClass2Oi r6) {
        int i;
        C133796hx r0;
        if (this instanceof AnonymousClass9DM) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = ((AnonymousClass9DM) this).A00;
            if (!indiaUpiBankAccountDetailsActivity.isFinishing()) {
                indiaUpiBankAccountDetailsActivity.A0L.A06("setDefault Success");
                indiaUpiBankAccountDetailsActivity.A0D.BK0((AnonymousClass34V) null, 15);
                Iterator it = ((C190859Ac) r6).A00.iterator();
                while (it.hasNext()) {
                    C166587yw A0C = C1899693i.A0C(it);
                    if (A0C.A0A.equals(indiaUpiBankAccountDetailsActivity.A00.A0A)) {
                        indiaUpiBankAccountDetailsActivity.A76(A0C, false);
                    }
                }
                indiaUpiBankAccountDetailsActivity.BjL();
                C133686hm r02 = indiaUpiBankAccountDetailsActivity.A00;
                if (r02 != null && (r0 = r02.A08) != null && ((AnonymousClass99H) r0).A0H) {
                    indiaUpiBankAccountDetailsActivity.Bou(indiaUpiBankAccountDetailsActivity.getString(R.string.f11nameremoved));
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass9C3 r3 = (AnonymousClass9C3) this.A03.get();
        if (r3 != null) {
            r3.A0L.A06("setDefault Success");
            C203499no r2 = this.A02;
            if (r2 != null) {
                r2.BK0((AnonymousClass34V) null, this.A00);
            }
            r3.A0F.A03(((C190859Ac) r6).A00);
            r3.BjL();
            if (this instanceof AnonymousClass9DL) {
                boolean equals = "p2m".equals(((AnonymousClass9DL) this).A01);
                i = R.string.f11nameremoved;
                if (equals) {
                    i = R.string.f11nameremoved;
                }
            } else {
                i = R.string.f11nameremoved;
            }
            r3.Bou(r3.getString(i));
        }
    }

    public AnonymousClass9bP(C203549nv r2, C203499no r3, AnonymousClass9C3 r4, int i) {
        this.A02 = r3;
        this.A00 = i;
        this.A01 = r2;
        this.A03 = AnonymousClass0x9.A14(r4);
    }
}
