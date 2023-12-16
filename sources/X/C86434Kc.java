package X;

import java.io.IOException;

/* renamed from: X.4Kc  reason: invalid class name and case insensitive filesystem */
public class C86434Kc implements AnonymousClass4EN {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C86434Kc(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A02 = obj2;
        this.A00 = obj3;
        this.A01 = obj;
    }

    public void AyP(AnonymousClass2SI r8) {
        if (this.A03 != 0) {
            C162457s7.A0J(r8, 0);
            if (!(!C615631i.A02())) {
                throw AnonymousClass001.A0e("Check failed.");
            } else if (r8.A00 != 0) {
                C59192wV r6 = ((C41952Mf) this.A02).A01;
                C48642fE r5 = r8.A04;
                C162457s7.A0K(r5, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
                C54662p5 r4 = new C54662p5(0, 0);
                C172578Lw r3 = new C172578Lw(30);
                r6.A00(r4, new AnonymousClass4JD(this.A00, 1), (C27131dK) r5, r3);
            } else {
                Object obj = r8.A03.A00;
                if (obj == null) {
                    ((AnonymousClass4GR) this.A00).invoke(2, (Object) null);
                } else {
                    ((AnonymousClass4GQ) this.A01).invoke(new C108895dj(new C166557yt(AnonymousClass3QD.A00(), obj, "WaFbAccessToken"), 2));
                }
            }
        } else {
            C162457s7.A0J(r8, 0);
            ((C67313Ou) this.A02).A05.markerEnd(386138113, 2);
            ((AnonymousClass4EN) this.A00).AyP(r8);
        }
    }

    public void BQq(IOException iOException) {
        if (this.A03 != 0) {
            C162457s7.A0J(iOException, 0);
            C106245Ye.A02("WebAuthAccessTokenFetcher/exchangeTokenAndBlobForAccessToken delivery failure", iOException);
            ((AnonymousClass4GR) this.A00).invoke(AnonymousClass0x7.A0f(), (Object) null);
            return;
        }
        C162457s7.A0J(iOException, 0);
        ((C67313Ou) this.A02).A05.markerEnd(386138113, 3);
        ((AnonymousClass4EN) this.A00).BQq(iOException);
    }

    public void BSB(Exception exc) {
        if (this.A03 != 0) {
            C162457s7.A0J(exc, 0);
            C106245Ye.A02("WebAuthAccessTokenFetcher/exchangeTokenAndBlobForAccessToken failed", exc);
            if (exc instanceof AnonymousClass244) {
                C618532n r2 = ((AnonymousClass244) exc).error;
                ((AnonymousClass4GR) this.A00).invoke(Integer.valueOf(r2.A01), Integer.valueOf(r2.A02));
                return;
            }
            ((AnonymousClass4GR) this.A00).invoke(C18280x3.A0S(), (Object) null);
            return;
        }
        C162457s7.A0J(exc, 0);
        if (!(exc instanceof AnonymousClass244) || ((AnonymousClass244) exc).error.A01 != 190) {
            ((C67313Ou) this.A02).A05.markerEnd(386138113, 3);
            ((AnonymousClass4EN) this.A00).BSB(exc);
            return;
        }
        C67313Ou r5 = (C67313Ou) this.A02;
        r5.A05.markerPoint(386138113, "refresh_token_with_certificate");
        Object obj = this.A00;
        r5.A01.A03((C60272yH) this.A01, new C85934Ie(r5, 2, obj), (C54662p5) null);
    }
}
