package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;

/* renamed from: X.3Re  reason: invalid class name and case insensitive filesystem */
public final class C67923Re implements C203069n4 {
    public final /* synthetic */ AnonymousClass1jI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public void BZ3(AnonymousClass34V r3) {
        C162457s7.A0J(r3, 0);
        Log.e("PAY: FcsPaymentsDataEncryptionResource getProviderEncryptionKeyAsync iq returned null");
        AnonymousClass1jI.A00(this.A00, r3.A00);
    }

    public void BZ4(C67993Rl r8) {
        String encodeToString;
        C162457s7.A0J(r8, 0);
        AnonymousClass1jI r4 = this.A00;
        String str = this.A02;
        String str2 = this.A01;
        C162457s7.A0J(str2, 1);
        if (C162457s7.A0P(str, "OTP")) {
            encodeToString = r4.A03.A03(r8, str2);
        } else {
            String str3 = C58152un.A0B;
            C162457s7.A0F(str3);
            Charset forName = Charset.forName(str3);
            C162457s7.A0D(forName);
            encodeToString = Base64.encodeToString(r8.A00.B2R(C18320x8.A1a(str2, forName), AnonymousClass29O.A01(16)), 2);
        }
        if (encodeToString == null || encodeToString.length() == 0) {
            AnonymousClass1jI.A00(r4, -1);
            return;
        }
        AnonymousClass4DK r42 = r4.A00;
        if (r42 == null) {
            throw C18270x1.A0S("resourceResultCallback");
        }
        AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[4];
        AnonymousClass3Z6.A09("data", encodeToString, r2, 0);
        AnonymousClass3Z6.A09("key_type", r8.A03, r2, 1);
        AnonymousClass3Z6.A09("key_provider", r8.A05, r2, 2);
        AnonymousClass3Z6.A07("key_version", r8.A04, r2);
        r42.BdH(C73813g7.A0G(r2));
    }

    public C67923Re(AnonymousClass1jI r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }
}
