package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.2Zq  reason: invalid class name and case insensitive filesystem */
public class C45342Zq {
    public final C55682qk A00;
    public final AnonymousClass31C A01;
    public final C183538qC A02;

    public void A00() {
        Log.i("BroadcastXmppMethods/sendGetBroadcastLists");
        AnonymousClass31C r4 = this.A01;
        String A03 = r4.A03();
        AnonymousClass36K A0H = AnonymousClass36K.A0H("lists");
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03, A1W);
        AnonymousClass39V.A05("xmlns", "w:b", A1W);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W);
        r4.A0D(new AnonymousClass4KQ(this, 6), AnonymousClass36K.A0C(C135206kI.A00, A0H, A1W), A03, 59, 32000);
    }

    public C45342Zq(C55682qk r1, AnonymousClass31C r2, C183538qC r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
