package X;

import com.whatsapp.util.Log;

/* renamed from: X.3H4  reason: invalid class name */
public class AnonymousClass3H4 implements C84494Co {
    public final /* synthetic */ C29031iA A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass3H4(C29031iA r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public void Bd1(C129526aS r6) {
        Log.i("companion/deregister/sendCompanionDeviceLogoutRequest/onSuccess");
        C29031iA r4 = this.A00;
        r4.A0H.post(new C71703cX(20, (Object) r4, this.A01));
    }

    public void BS2(C129526aS r6, int i) {
        C18260x0.A0y("companion/deregister/sendCompanionDeviceLogoutRequest/onError: ", AnonymousClass001.A0o(), i);
        C29031iA r4 = this.A00;
        r4.A0H.post(new C71703cX(20, (Object) r4, this.A01));
    }
}
