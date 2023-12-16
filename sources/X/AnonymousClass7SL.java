package X;

import com.whatsapp.util.Log;

/* renamed from: X.7SL  reason: invalid class name */
public class AnonymousClass7SL {
    public final /* synthetic */ AnonymousClass65H A00;
    public final /* synthetic */ C59682xJ A01;

    public AnonymousClass7SL(AnonymousClass65H r1, C59682xJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(int i) {
        AnonymousClass65H r1;
        C368620a r0;
        C18260x0.A0w("keytransparencymanager/multiserializedlookup Received error code: ", AnonymousClass001.A0o(), i);
        if (i == 16792) {
            Log.d("keytransparencymanager/multiserializedlookup Sequencing pending.");
            r1 = this.A00;
            r0 = C368620a.PENDING;
        } else {
            C18260x0.A0w("keytransparencymanager/multiserializedlookup Verification failed. Error code: ", AnonymousClass001.A0o(), i);
            r1 = this.A00;
            r0 = C368620a.FAIL;
        }
        r1.BPQ(r0);
    }
}
