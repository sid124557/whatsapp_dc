package X;

import com.whatsapp.payments.CheckFirstTransaction;

/* renamed from: X.9fW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198809fW implements Runnable {
    public final /* synthetic */ CheckFirstTransaction A00;

    public final void run() {
        CheckFirstTransaction checkFirstTransaction = this.A00;
        AnonymousClass3XA r6 = checkFirstTransaction.A00;
        int i = (AnonymousClass9U4.A01(checkFirstTransaction.A03).A07() > 0 ? 1 : (AnonymousClass9U4.A01(checkFirstTransaction.A03).A07() == 0 ? 0 : -1));
        boolean z = false;
        if (i <= 0) {
            z = true;
        }
        r6.A05(Boolean.valueOf(z));
    }

    public /* synthetic */ C198809fW(CheckFirstTransaction checkFirstTransaction) {
        this.A00 = checkFirstTransaction;
    }
}
