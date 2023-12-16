package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.1vE  reason: invalid class name and case insensitive filesystem */
public final class C34481vE extends C66613Mc {
    public final /* synthetic */ AnonymousClass4EJ A00;
    public final /* synthetic */ C54662p5 A01;
    public final /* synthetic */ C166557yt A02;
    public final /* synthetic */ C166557yt A03;
    public final /* synthetic */ C166557yt A04;
    public final /* synthetic */ C166557yt A05;
    public final /* synthetic */ C166557yt A06;
    public final /* synthetic */ AnonymousClass3MY A07;
    public final /* synthetic */ Integer A08;

    public void BdT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C18260x0.A0O(x509Certificate, x509Certificate2);
        AnonymousClass3MY r0 = this.A07;
        C166557yt r3 = this.A02;
        Integer num2 = this.A08;
        int A042 = AnonymousClass0x7.A04(num, publicKey);
        AnonymousClass4EJ r1 = this.A00;
        C54662p5 r2 = this.A01;
        r0.A06(r1, r2, r3, this.A04, this.A03, this.A05, this.A06, num2, publicKey, x509Certificate, A042);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34481vE(AnonymousClass4EJ r1, C54662p5 r2, C166557yt r3, C166557yt r4, C166557yt r5, C166557yt r6, C166557yt r7, AnonymousClass3MY r8, Integer num) {
        super(r1);
        this.A00 = r1;
        this.A07 = r8;
        this.A02 = r3;
        this.A08 = num;
        this.A04 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
    }
}
