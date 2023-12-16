package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.whatsapp.util.Log;

/* renamed from: X.5hS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111045hS implements OnSuccessListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4LS A01;

    public final void onSuccess(Object obj) {
        AnonymousClass4LS r2 = this.A01;
        int i = this.A00;
        Log.i("SMSRetrieverReceiver/onReceive/re-registered sms retriever client");
        AnonymousClass33p r0 = r2.A01;
        C18270x1.A0h(C18270x1.A03(r0), "sms_retriever_retry_count", i + 1);
    }

    public /* synthetic */ C111045hS(AnonymousClass4LS r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
