package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.2cW  reason: invalid class name and case insensitive filesystem */
public class C46982cW {
    public final AnonymousClass08M A00;
    public final C69263Wi A01;
    public final C29441ip A02;
    public final C56612sH A03;
    public final C56112rR A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass31C A06;

    public void A00() {
        Log.i("DisappearingModeManager/getDisappearingModeSetting");
        AnonymousClass31C r3 = this.A06;
        String A032 = r3.A03();
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        A1W[0] = AnonymousClass39V.A00();
        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        AnonymousClass39V.A06("xmlns", "disappearing_mode", A1W);
        AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W);
        r3.A0K(new AnonymousClass4KQ(this, 0), AnonymousClass36K.A0I("iq", A1W), A032, 296, 20000);
    }

    public C46982cW(C69263Wi r2, C29441ip r3, C56612sH r4, C56112rR r5, AnonymousClass4FV r6, AnonymousClass31C r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r5.A00;
    }
}
