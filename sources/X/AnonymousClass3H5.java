package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.3H5  reason: invalid class name */
public class AnonymousClass3H5 implements C84494Co {
    public final /* synthetic */ C29041iB A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3H5(C29041iB r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public void Bd1(C129526aS r5) {
        Log.i("companion-device-manager/createDeviceRemoveRequestProtocolHelper/onSuccess");
        C29041iB r3 = this.A00;
        r3.A0N.execute(new C71423c5(r5, r3, this.A02));
    }

    public void BS2(C129526aS r5, int i) {
        C18260x0.A0y("companion-device-manager/createDeviceRemoveRequestProtocolHelper/onError: ", AnonymousClass001.A0o(), i);
        if (this.A01) {
            C29041iB r3 = this.A00;
            r3.A0N.execute(new C71423c5(r5, r3, false));
            return;
        }
        Iterator A03 = C61102zi.A03(this.A00);
        while (A03.hasNext()) {
            ((AnonymousClass4FJ) A03.next()).BR1(r5, i);
        }
    }
}
