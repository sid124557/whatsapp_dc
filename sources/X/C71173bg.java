package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3bg  reason: invalid class name and case insensitive filesystem */
public final class C71173bg implements Runnable {
    public final int A00;
    public final AnonymousClass4EJ A01;
    public final C54662p5 A02;
    public final C166557yt A03;
    public final C166557yt A04;
    public final C166557yt A05;
    public final C166557yt A06;
    public final C166557yt A07;
    public final Integer A08;
    public final PublicKey A09;
    public final X509Certificate A0A;
    public final /* synthetic */ AnonymousClass3MY A0B;

    public C71173bg(AnonymousClass4EJ r2, C54662p5 r3, C166557yt r4, C166557yt r5, C166557yt r6, C166557yt r7, C166557yt r8, AnonymousClass3MY r9, Integer num, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        C162457s7.A0J(publicKey, 9);
        C18270x1.A13(r2, r3);
        this.A0B = r9;
        this.A03 = r4;
        this.A08 = num;
        this.A05 = r5;
        this.A04 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = x509Certificate;
        this.A09 = publicKey;
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void run() {
        AnonymousClass3MY r0 = this.A0B;
        C166557yt r3 = this.A03;
        Integer num = this.A08;
        C166557yt r4 = this.A05;
        C166557yt r5 = this.A04;
        C166557yt r6 = this.A06;
        C166557yt r7 = this.A07;
        X509Certificate x509Certificate = this.A0A;
        r0.A06(this.A01, this.A02, r3, r4, r5, r6, r7, num, this.A09, x509Certificate, this.A00);
    }
}
