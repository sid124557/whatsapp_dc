package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.3cQ  reason: invalid class name and case insensitive filesystem */
public class C71633cQ implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public C71633cQ(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MY r5, PublicKey publicKey, X509Certificate x509Certificate, int i, int i2) {
        this.A07 = i2;
        if (1 - i2 != 0) {
            C162457s7.A0J(publicKey, 3);
        } else {
            C162457s7.A0J(publicKey, 3);
            C18260x0.A0T(r3, r4);
        }
        this.A05 = r5;
        this.A02 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r3;
        this.A03 = r4;
        this.A06 = r2;
    }

    public final void run() {
        switch (this.A07) {
            case 0:
                AnonymousClass3ZF r1 = (AnonymousClass3ZF) this.A01;
                C1230066r r9 = (C1230066r) this.A02;
                Context context = (Context) this.A03;
                int i = this.A00;
                C50392i6 r6 = (C50392i6) this.A04;
                if (r1 != null) {
                    ((C112455jl) r9).BJS(context, r1, i, false);
                    return;
                } else if (r6 == null || r6.A03 < System.currentTimeMillis() - 86400000) {
                    Activity A022 = C111095hX.A02(context);
                    boolean z = A022 instanceof C89654ea;
                    C626936e.A0D(z, "Activity should be instance of DialogActivity");
                    if (z) {
                        ((C89654ea) A022).Bon(VoipErrorDialogFragment.A01(new C47702dg(), 30), (String) null);
                        return;
                    }
                    return;
                } else {
                    r9.Bpq(context, r6, i);
                    return;
                }
            case 1:
                C60272yH r0 = (C60272yH) this.A06;
                C166557yt r3 = r0.A04;
                C162457s7.A0D(r3);
                AnonymousClass4EJ r12 = (AnonymousClass4EJ) this.A01;
                String A0b = C18280x3.A0b(r0.A05);
                PublicKey publicKey = (PublicKey) this.A04;
                int i2 = this.A00;
                AnonymousClass3MY.A00(r12, (C54662p5) this.A03, r3, (AnonymousClass3MY) this.A05, A0b, publicKey, (X509Certificate) this.A02, i2);
                return;
            case 2:
                C60272yH r2 = (C60272yH) this.A06;
                PublicKey publicKey2 = (PublicKey) this.A04;
                Integer valueOf = Integer.valueOf(this.A00);
                ((AnonymousClass3MY) this.A05).Bgq(r2, (AnonymousClass4EJ) this.A01, (C54662p5) this.A03, valueOf, publicKey2, (X509Certificate) this.A02);
                return;
            case 3:
                C60272yH r13 = (C60272yH) this.A06;
                PublicKey publicKey3 = (PublicKey) this.A04;
                int i3 = this.A00;
                ((AnonymousClass3MY) this.A05).A05(r13, (AnonymousClass4EJ) this.A01, (C54662p5) this.A03, publicKey3, (X509Certificate) this.A02, i3);
                return;
            default:
                C60272yH r22 = (C60272yH) this.A06;
                PublicKey publicKey4 = (PublicKey) this.A04;
                Integer valueOf2 = Integer.valueOf(this.A00);
                ((AnonymousClass3MY) this.A05).Bgr(r22, (AnonymousClass4EJ) this.A01, (C54662p5) this.A03, valueOf2, publicKey4, (X509Certificate) this.A02);
                return;
        }
    }

    public C71633cQ(C60272yH r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass3MY r5, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A07 = 3;
        C162457s7.A0J(publicKey, 4);
        C18260x0.A0U(r3, r4);
        this.A05 = r5;
        this.A06 = r2;
        this.A02 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r3;
        this.A03 = r4;
    }

    public C71633cQ(Context context, C1230066r r3, AnonymousClass3LB r4, C56612sH r5, C50392i6 r6, AnonymousClass3ZF r7, int i) {
        this.A07 = 0;
        this.A01 = r7;
        this.A02 = r3;
        this.A03 = context;
        this.A00 = i;
        this.A04 = r6;
        this.A05 = r5;
        this.A06 = r4;
    }
}
