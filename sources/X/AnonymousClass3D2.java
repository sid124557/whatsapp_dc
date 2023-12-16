package X;

import com.whatsapp.util.Log;

/* renamed from: X.3D2  reason: invalid class name */
public abstract class AnonymousClass3D2 implements AnonymousClass495 {
    public C27861en A00;
    public AnonymousClass4FS A01;
    public boolean A02;
    public final C49552gi A03;
    public final AnonymousClass48L A04;

    public void cancel() {
        this.A02 = true;
        C27861en r0 = this.A00;
        if (r0 != null) {
            r0.cancel(true);
        }
    }

    public void A00() {
        if (!this.A02) {
            C70023Zo.A00(this.A01, this, 37);
        }
    }

    public void A01(C160327nS r7) {
        AnonymousClass4DF r1;
        if (this instanceof AnonymousClass1h3) {
            AnonymousClass1h3 r5 = (AnonymousClass1h3) this;
            if (!r5.A02) {
                C18260x0.A1R(AnonymousClass001.A0o(), "BaseMetadataNewsletterGraphqlJob/onFailure error = ", r7);
                int B5a = r7.A00().B5a();
                C95804uY r3 = r5.A06;
                if (r3 != null) {
                    new C49142g3(r5.A04, r3, r5.A09).A00(B5a);
                }
                r1 = r5.A01;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass1h1) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "GetAllSubscribedNewslettersGraphqlHandler/error ", r7);
            return;
        } else {
            AnonymousClass1h2 r12 = (AnonymousClass1h2) this;
            Log.e("CreateNewsletterGraphqlJob/onFailure error");
            if (!r12.A02) {
                r1 = r12.A00;
            } else {
                return;
            }
        }
        if (r1 != null) {
            r1.onError(C1452274r.A00(r7));
        }
    }

    public AnonymousClass3D2(C49552gi r1, AnonymousClass48L r2, AnonymousClass4FS r3) {
        this.A01 = r3;
        this.A03 = r1;
        this.A04 = r2;
    }
}
