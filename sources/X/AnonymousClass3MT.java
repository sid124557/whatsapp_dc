package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3MT  reason: invalid class name */
public final class AnonymousClass3MT implements AnonymousClass4EJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4EJ A01;
    public final /* synthetic */ C54662p5 A02;
    public final /* synthetic */ AnonymousClass3MY A03;
    public final /* synthetic */ PublicKey A04;
    public final /* synthetic */ X509Certificate A05;

    public void BSB(Exception exc) {
        C162457s7.A0J(exc, 0);
        this.A01.BSB(exc);
    }

    public AnonymousClass3MT(AnonymousClass4EJ r1, C54662p5 r2, AnonymousClass3MY r3, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A03 = r3;
        this.A05 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public void BQp() {
        this.A01.BQp();
    }

    public void Bd3(C60272yH r9) {
        AnonymousClass3MY r1 = this.A03;
        X509Certificate x509Certificate = this.A05;
        C162457s7.A0H(r9);
        PublicKey publicKey = this.A04;
        r1.Bgq(r9, this.A01, this.A02, Integer.valueOf(this.A00), publicKey, x509Certificate);
    }
}
