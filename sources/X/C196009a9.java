package X;

import java.security.Signature;

/* renamed from: X.9a9  reason: invalid class name and case insensitive filesystem */
public class C196009a9 implements C1229066h {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C194109Rp A01;
    public final /* synthetic */ C196029aB A02;

    public C196009a9(C194109Rp r1, C196029aB r2, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }

    public void BMx(int i, CharSequence charSequence) {
        C160757oG r2 = this.A01.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendWithBiometric/onAuthenticationError/error: ");
        r2.A05(AnonymousClass000.A0X(charSequence.toString(), A0o));
        this.A02.BMx(i, charSequence);
    }

    public void BMy() {
        this.A01.A03.A05("sendWithBiometric/onAuthenticationFailed");
        this.A02.BMy();
    }

    public void BN0(int i, CharSequence charSequence) {
        C160757oG r2 = this.A01.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendWithBiometric/onAuthenticationHelp/help: ");
        r2.A05(AnonymousClass000.A0X(charSequence.toString(), A0o));
        this.A02.BN0(i, charSequence);
    }

    public void BN1(byte[] bArr) {
        if (bArr != null) {
            C194109Rp r2 = this.A01;
            r2.A03.A06("sendWithBiometric/onAuthenticationSucceeded/success");
            this.A02.BN1(AnonymousClass9V6.A00(Boolean.FALSE, bArr, r2.A05, this.A00));
            return;
        }
        this.A01.A03.A05("sendWithBiometric/onAuthenticationSucceeded/null signature");
        this.A02.BMy();
    }

    public /* synthetic */ void BN2(Signature signature) {
    }
}
