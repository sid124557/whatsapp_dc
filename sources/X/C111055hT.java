package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.whatsapp.util.Log;

/* renamed from: X.5hT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111055hT implements OnSuccessListener {
    public final /* synthetic */ AnonymousClass33p A00;
    public final /* synthetic */ C184578sA A01;
    public final /* synthetic */ boolean A02;

    public final void onSuccess(Object obj) {
        boolean z = this.A02;
        AnonymousClass33p r1 = this.A00;
        C184578sA r3 = this.A01;
        Log.i("SmsRetrieverUtils/maybeUseSmsRetriever/onsuccess");
        if (z) {
            C18270x1.A0l(C18270x1.A03(r1), "registration_use_sms_retriever", true);
        }
        r3.Bpy();
    }

    public /* synthetic */ C111055hT(AnonymousClass33p r1, C184578sA r2, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = r2;
    }
}
