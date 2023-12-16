package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1mR  reason: invalid class name and case insensitive filesystem */
public class C30431mR extends C624134x implements AnonymousClass4B9, AnonymousClass4BB {
    public int A00;
    public long A01;

    public C30431mR(AnonymousClass2z0 r9, C30431mR r10, long j) {
        super(r10, r9, j, true);
        this.A00 = r10.A00;
        this.A01 = r10.A01;
    }

    public List BDE() {
        String str;
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "invite", r2);
        int i = this.A00;
        if (i == 1) {
            str = "FBPAY";
        } else if (i == 2) {
            str = "NOVI";
        } else if (i != 3) {
            str = null;
        } else {
            str = "UPI";
        }
        C626936e.A06(str);
        AnonymousClass39V.A05("service", str, r2);
        return Collections.singletonList(AnonymousClass36K.A0I("pay", r2));
    }

    public C624134x Az3(AnonymousClass2z0 r4) {
        return new C30431mR(r4, this, this.A0K);
    }

    public C30431mR(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 51, j);
    }
}
