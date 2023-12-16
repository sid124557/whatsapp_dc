package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.5hR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111035hR implements OnFailureListener {
    public final /* synthetic */ AnonymousClass33p A00;
    public final /* synthetic */ C184578sA A01;
    public final /* synthetic */ boolean A02;

    public final void onFailure(Exception exc) {
        boolean z = this.A02;
        AnonymousClass33p r1 = this.A00;
        C184578sA r3 = this.A01;
        Log.e("SmsRetrieverUtils/maybeUseSmsRetriever/onfailure/ ", exc);
        if (z) {
            C18270x1.A0l(C18270x1.A03(r1), "registration_use_sms_retriever", false);
        }
        r3.BhU();
    }

    public /* synthetic */ C111035hR(AnonymousClass33p r1, C184578sA r2, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }
}
