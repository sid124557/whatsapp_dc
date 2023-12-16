package X;

import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.util.Log;

/* renamed from: X.9gY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199419gY implements Runnable {
    public final /* synthetic */ IndiaUpiPinPrimerFullSheetActivity A00;

    public final void run() {
        C69263Wi r1;
        Runnable r0;
        IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity = this.A00;
        C166587yw A01 = AnonymousClass8EA.A01(AnonymousClass9U4.A08(indiaUpiPinPrimerFullSheetActivity.A0P));
        if (A01 == null) {
            Log.e("no valid account found, finishing");
            r1 = indiaUpiPinPrimerFullSheetActivity.A05;
            r0 = new C199399gW(indiaUpiPinPrimerFullSheetActivity);
        } else {
            indiaUpiPinPrimerFullSheetActivity.A01 = (C133686hm) A01;
            r1 = indiaUpiPinPrimerFullSheetActivity.A05;
            r0 = new C199409gX(indiaUpiPinPrimerFullSheetActivity);
        }
        r1.A0S(r0);
    }

    public /* synthetic */ C199419gY(IndiaUpiPinPrimerFullSheetActivity indiaUpiPinPrimerFullSheetActivity) {
        this.A00 = indiaUpiPinPrimerFullSheetActivity;
    }
}
