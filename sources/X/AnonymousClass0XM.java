package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.0XM  reason: invalid class name */
public class AnonymousClass0XM {
    public final C55682qk A00;
    public final C29411im A01;
    public final C54292oU A02;
    public final C44402Vx A03;
    public final AnonymousClass31C A04;

    public static final AnonymousClass36K A02(String str, String str2, byte[] bArr, byte[] bArr2) {
        return new AnonymousClass36K(new AnonymousClass36K("crypto", new AnonymousClass39V[]{new AnonymousClass39V("action", "get"), new AnonymousClass39V("version", str2)}, new AnonymousClass36K[]{new AnonymousClass36K("google", bArr2, (AnonymousClass39V[]) null), new AnonymousClass36K("code", bArr, (AnonymousClass39V[]) null)}), "iq", new AnonymousClass39V[]{new AnonymousClass39V((Jid) C135206kI.A00, "to"), new AnonymousClass39V("xmlns", "urn:xmpp:whatsapp:account"), new AnonymousClass39V((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass39V((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, str)});
    }

    public static final AnonymousClass36K A03(String str, byte[] bArr) {
        return new AnonymousClass36K(new AnonymousClass36K("crypto", new AnonymousClass39V[]{new AnonymousClass39V("action", "create")}, new AnonymousClass36K[]{new AnonymousClass36K("google", bArr, (AnonymousClass39V[]) null)}), "iq", new AnonymousClass39V[]{new AnonymousClass39V((Jid) C135206kI.A00, "to"), new AnonymousClass39V("xmlns", "urn:xmpp:whatsapp:account"), new AnonymousClass39V((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass39V((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, str)});
    }

    public void A04(Runnable runnable, String str, byte[] bArr, byte[] bArr2) {
        C55682qk r0 = this.A00;
        byte[] bArr3 = bArr2;
        C06550Ye.A0G(r0, bArr3);
        byte[] bArr4 = bArr;
        C06550Ye.A0I(r0, bArr4);
        String str2 = str;
        C06550Ye.A0F(r0, str2);
        Log.i(AnonymousClass000.A0V("BackupSendMethods/sendGetCipherKey/v=", str2, AnonymousClass001.A0o()));
        AnonymousClass31C r7 = this.A04;
        String A032 = r7.A03();
        r7.A0E(new C10330hl(this, runnable, str2, bArr4, bArr3), A02(A032, str2, bArr4, bArr3), A032, 75, 32000);
    }

    public boolean A05(Runnable runnable, byte[] bArr, byte[] bArr2, int i) {
        if (!this.A01.A0B()) {
            return false;
        }
        Log.i("sendmethods/sendcreatecipherkey");
        C55682qk r0 = this.A00;
        C06550Ye.A0G(r0, bArr);
        byte[] bArr3 = bArr2;
        C06550Ye.A0H(r0, bArr3);
        AnonymousClass31C r6 = this.A04;
        String A032 = r6.A03();
        r6.A0E(new C10340hm(this, runnable, bArr, bArr3, i), A03(A032, bArr), A032, 74, 32000);
        return true;
    }

    public AnonymousClass0XM(C55682qk r1, C29411im r2, C54292oU r3, C44402Vx r4, AnonymousClass31C r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }
}
