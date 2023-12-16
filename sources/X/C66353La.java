package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.3La  reason: invalid class name and case insensitive filesystem */
public class C66353La implements AnonymousClass485 {
    public final C29411im A00;
    public final AnonymousClass31C A01;
    public final C49242gD A02;
    public final C183538qC A03;

    public boolean A00(byte[] bArr) {
        AnonymousClass31C r11 = this.A01;
        String A032 = r11.A03();
        long A07 = C18280x3.A07();
        Long valueOf = Long.valueOf(A07);
        C56052rL A04 = C56052rL.A04("add");
        byte[] bArr2 = bArr;
        C626836d.A0H(bArr2, 4, 65536);
        A04.A01 = bArr2;
        AnonymousClass36K A0F = A04.A0F();
        C56052rL A042 = C56052rL.A04("iq");
        C56052rL.A0D(A042, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C626836d.A0M(A032, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A042, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032);
        }
        AnonymousClass36K A0F2 = A042.A0F();
        C56052rL A043 = C56052rL.A04("iq");
        C56052rL.A0E(A043, "xmlns", "w:stats");
        C56052rL A044 = C56052rL.A04("add");
        if (C626836d.A0J(valueOf, 0, 9007199254740991L, false)) {
            C56052rL.A0C(A044, "t", A07);
        }
        A044.A0I(A0F);
        C56052rL.A07(A044, A043);
        A043.A0I(A0F2);
        AnonymousClass36K A0F3 = A043.A0F();
        C72183dJ r2 = new C72183dJ();
        r11.A0F(new AnonymousClass4KQ(r2, 4), A0F3, A032, 58, 32000, true);
        try {
            boolean equals = "result".equals(AnonymousClass36K.A0L((AnonymousClass36K) r2.get(), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
            if (equals && bArr != null) {
                this.A02.A01(bArr2.length, 32);
            }
            return equals;
        } catch (InterruptedException | ExecutionException unused) {
            Log.e("FieldStatsXmppImpl/error sending fieldstats IQ");
            return false;
        }
    }

    public C66353La(C29411im r1, AnonymousClass31C r2, C49242gD r3, C183538qC r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
