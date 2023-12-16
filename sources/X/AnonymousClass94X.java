package X;

import android.os.Build;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.94X  reason: invalid class name */
public class AnonymousClass94X extends AnonymousClass0Q3 {
    public final /* synthetic */ C1229066h A00;
    public final /* synthetic */ AnonymousClass9W3 A01;
    public final /* synthetic */ byte[] A02;

    public AnonymousClass94X(C1229066h r1, AnonymousClass9W3 r2, byte[] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bArr;
    }

    public void A00() {
        this.A01.A02.A06("sign: authentication failed");
        this.A00.BMy();
    }

    public void A01(int i, CharSequence charSequence) {
        C160757oG r2 = this.A01.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sign: authentication error=");
        A0o.append(i);
        r2.A05(AnonymousClass000.A0Y(" errString=", A0o, i));
        this.A00.BMx(i, charSequence);
    }

    public void A02(int i, CharSequence charSequence) {
        C160757oG r2 = this.A01.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sign: authentication help=");
        A0o.append(i);
        C1899593h.A1H(r2, charSequence, " errString=", A0o);
        this.A00.BN0(i, charSequence);
    }

    public void A03(AnonymousClass0KL r5) {
        try {
            Signature signature = r5.A00.A00;
            C626936e.A06(signature);
            C1229066h r1 = this.A00;
            r1.BN2(signature);
            signature.update(this.A02);
            r1.BN1(signature.sign());
        } catch (SignatureException e) {
            C160757oG r2 = this.A01.A02;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("sign: api=");
            A0o.append(Build.VERSION.SDK_INT);
            C18270x1.A1H(A0o, " error: ", e);
            C1899693i.A0t(r2, A0o);
            this.A00.BN1((byte[]) null);
        }
    }
}
