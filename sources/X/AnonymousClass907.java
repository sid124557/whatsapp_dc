package X;

import android.content.Context;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.907  reason: invalid class name */
public class AnonymousClass907 extends C1908099x {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass907(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass7EM r12, C35721xK r13) {
        super(context, r9, r10, r11, "update-alias");
        this.A00 = r12;
        this.A01 = r13;
    }

    public void A03(AnonymousClass34V r9) {
        AnonymousClass34V r2 = r9;
        if (this.A02 != 0) {
            C162457s7.A0J(r9, 0);
            super.A03(r9);
            ((AnonymousClass7EM) this.A00).A00.A00.A0H(new C158597kF(r2, (AnonymousClass34V) null, false, false, false, false));
            return;
        }
        C162457s7.A0J(r9, 0);
        super.A03(r9);
        ((C184518rx) this.A00).BS6(r9);
    }

    public void A04(AnonymousClass34V r9) {
        AnonymousClass34V r2 = r9;
        if (this.A02 != 0) {
            C162457s7.A0J(r9, 0);
            super.A04(r9);
            ((AnonymousClass7EM) this.A00).A00.A00.A0H(new C158597kF(r2, (AnonymousClass34V) null, false, false, false, false));
            return;
        }
        C162457s7.A0J(r9, 0);
        super.A04(r9);
        ((C184518rx) this.A00).BS6(r9);
    }

    public void A05(AnonymousClass36K r12) {
        if (this.A02 != 0) {
            C162457s7.A0J(r12, 0);
            super.A05(r12);
            AnonymousClass36K A022 = C41032Ir.A02(r12, (C41032Ir) this.A01);
            Class<String> cls = String.class;
            C626836d.A0F(r12, cls, "update-alias", new String[]{"account", "action"});
            C138966rI r1 = (C138966rI) C626836d.A04(r12, C1896292a.A00(38), new String[]{"account", "alias"});
            AnonymousClass92Z.A01(A022, r12, 11);
            C162457s7.A0D(r1);
            AnonymousClass3QD A002 = AnonymousClass3QD.A00();
            C139016rN r2 = (C139016rN) r1.A00;
            C166557yt r5 = new C166557yt(A002, cls, r2.A03, "upiAlias");
            String str = r2.A02;
            C162457s7.A0D(str);
            String str2 = r2.A00;
            C162457s7.A0D(str2);
            String str3 = r2.A01;
            C162457s7.A0H(str3);
            Locale locale = Locale.US;
            C162457s7.A0F(locale);
            String lowerCase = str3.toLowerCase(locale);
            C162457s7.A0D(lowerCase);
            C166157yE r22 = new C166157yE(r5, str, str2, lowerCase);
            IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = ((AnonymousClass7EM) this.A00).A00;
            indiaUpiNumberSettingsViewModel.A01.A02(r22);
            indiaUpiNumberSettingsViewModel.A00.A0H(new C158597kF((AnonymousClass34V) null, (AnonymousClass34V) null, false, false, true, false));
            return;
        }
        C162457s7.A0J(r12, 0);
        super.A05(r12);
        try {
            ((C184518rx) this.A00).BaO(new C139766sa(r12, (C35681xG) this.A01));
        } catch (AnonymousClass24Y unused) {
            Log.e("PAY: IndiaUpiGetP2mCheckoutSessionAction/getCheckoutSession: invalid response message");
            ((C184518rx) this.A00).BS6(new AnonymousClass34V());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass907(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, C184518rx r12, C35681xG r13) {
        super(context, r9, r10, r11, "upi-get-p2m-checkout-session");
        this.A00 = r12;
        this.A01 = r13;
    }
}
