package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;

/* renamed from: X.4yu  reason: invalid class name and case insensitive filesystem */
public abstract class C97644yu extends C137556os implements AnonymousClass4BC, C179208im {
    public long A00;
    public boolean A01;

    public void A77(boolean z) {
        String str;
        Bp9(R.string.f11nameremoved);
        this.A0Z = true;
        this.A01 = z;
        this.A00 = SystemClock.elapsedRealtime();
        C115285oQ r10 = new C115285oQ(this.A05, this.A0L, new AnonymousClass7LH(this.A06, this.A09, this));
        AnonymousClass31C r9 = r10.A01;
        String A03 = r9.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[2];
        boolean A0F = AnonymousClass39V.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "contact", r2);
        if (z) {
            str = "revoke";
        } else {
            str = "get";
        }
        AnonymousClass39V.A0B("action", str, r2, 1);
        AnonymousClass36K r3 = new AnonymousClass36K("qr", r2);
        AnonymousClass39V[] r22 = new AnonymousClass39V[3];
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03, r22, A0F ? 1 : 0);
        AnonymousClass39V.A0B("xmlns", "w:qr", r22, 1);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22, 2);
        r9.A0E(r10, AnonymousClass36K.A0G(r3, r22), A03, 215, 32000);
    }
}
