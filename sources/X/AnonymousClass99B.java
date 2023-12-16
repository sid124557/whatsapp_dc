package X;

import com.whatsapp.util.Log;

/* renamed from: X.99B  reason: invalid class name */
public class AnonymousClass99B extends AnonymousClass9GI {
    public final /* synthetic */ C194569Tl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass99B(C194569Tl r2) {
        super((Runnable) null);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z;
        boolean z2;
        AnonymousClass8EA r5 = this.A00.A01;
        boolean A0J = r5.A0J();
        C85284Fq A0C = r5.A00.A0C();
        try {
            int A07 = ((AnonymousClass3H0) A0C).A03.A07("contacts", (String) null, "PaymentStore/removeAllContacts/DELETE_SCHEMA_PAY_CONTACTS", (String[]) null);
            if (A07 >= 0) {
                C18260x0.A0y("PAY: PaymentStore removeAllContacts deleted num rows: ", AnonymousClass001.A0o(), A07);
                z = true;
            } else {
                Log.w(AnonymousClass000.A0Y("PAY: PaymentStore removeAllContacts could not delete all rows: ", AnonymousClass001.A0o(), A07));
                z = false;
            }
            A0C.close();
            boolean z3 = A0J & z;
            A0C = r5.A00.A0C();
            int A072 = ((AnonymousClass3H0) A0C).A03.A07("tmp_transactions", (String) null, "removeAllPaymentTransactionTmpInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP", (String[]) null);
            if (A072 >= 0) {
                C18260x0.A0w("PAY: PaymentStore removeAllPaymentTransactionTmpInfo deleted num rows: ", AnonymousClass001.A0o(), A072);
                z2 = true;
            } else {
                Log.w(AnonymousClass000.A0Y("PAY: PaymentStore removeAllPaymentTransactionTmpInfo could not delete all rows: ", AnonymousClass001.A0o(), A072));
                z2 = false;
            }
            A0C.close();
            return Boolean.valueOf(z3 & z2);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
