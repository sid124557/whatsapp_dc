package X;

import com.whatsapp.WaTextView;
import com.whatsapp.registration.EULA;
import java.util.Locale;

/* renamed from: X.5nQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C114675nQ implements AnonymousClass65L {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ AnonymousClass54E A01;

    public final void BV1() {
        AnonymousClass54E r0 = this.A01;
        WaTextView waTextView = this.A00;
        EULA eula = (EULA) r0.A00;
        waTextView.setText(AnonymousClass5YW.A00(C154327cz.A01(Locale.getDefault())));
        if (eula.A0b) {
            eula.A0b = false;
            AnonymousClass5QI r3 = eula.A0I;
            int A02 = C18280x3.A02(AnonymousClass0x2.A0F(r3.A02), "language_selector_clicked_count");
            C18270x1.A03(r3.A02).putInt("language_selector_clicked_count", A02 + 1).commit();
            if (C107385bE.A09()) {
                eula.recreate();
                return;
            }
            eula.finish();
            eula.startActivity(eula.getIntent());
            eula.overridePendingTransition(0, 0);
        }
    }

    public /* synthetic */ C114675nQ(WaTextView waTextView, AnonymousClass54E r2) {
        this.A01 = r2;
        this.A00 = waTextView;
    }
}
