package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.6Ad  reason: invalid class name and case insensitive filesystem */
public class C123886Ad implements OnFailureListener {
    public Object A00;
    public final int A01;

    public C123886Ad(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFailure(Exception exc) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            Log.e("SMSRetrieverReceiver/onReceive/failure registering sms retriever client/ ", exc);
            AnonymousClass33p r1 = ((AnonymousClass4LS) obj).A01;
            AnonymousClass36l.A0O(r1, "timeout-waiting-for-sms");
            C18270x1.A0h(C18270x1.A03(r1), "sms_retriever_retry_count", 0);
            return;
        }
        Log.e("ChangeNumber/smsretriever/onfailure/ ", exc);
        Log.i("ChangeNumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        AnonymousClass36l.A0L((C89654ea) obj, 2);
    }
}
