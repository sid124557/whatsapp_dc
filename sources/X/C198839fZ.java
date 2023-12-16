package X;

import com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9fZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198839fZ implements Runnable {
    public final /* synthetic */ IndiaUpiPaymentInvitePickerActivity A00;

    public final void run() {
        IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity = this.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        indiaUpiPaymentInvitePickerActivity.A0B.A0b(A0s);
        C194389Sr r7 = indiaUpiPaymentInvitePickerActivity.A03;
        AnonymousClass9PH r11 = new AnonymousClass9PH(new C204989qF(indiaUpiPaymentInvitePickerActivity, 2), new C204989qF(indiaUpiPaymentInvitePickerActivity, 3), new C204989qF(indiaUpiPaymentInvitePickerActivity, 3), A0s);
        AnonymousClass31C r5 = r7.A05;
        String A03 = r5.A03();
        C35371wl r6 = new C35371wl(A03, 13);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0s2.add(new AnonymousClass9II(AnonymousClass3ZH.A07(C18310x6.A0R(it))));
        }
        AnonymousClass9IZ r13 = new AnonymousClass9IZ(r6, A0s2);
        C1899593h.A1C(r5, new AnonymousClass9AS(indiaUpiPaymentInvitePickerActivity, r7.A00, r11, r7.A0A, r13), r13.A00, A03);
    }

    public /* synthetic */ C198839fZ(IndiaUpiPaymentInvitePickerActivity indiaUpiPaymentInvitePickerActivity) {
        this.A00 = indiaUpiPaymentInvitePickerActivity;
    }
}
