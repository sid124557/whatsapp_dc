package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.4Pz  reason: invalid class name */
public final class AnonymousClass4Pz extends FrameLayout implements AnonymousClass4GJ {
    public C90084fo A00;
    public AnonymousClass5HH A01;
    public AnonymousClass1VX A02;
    public AnonymousClass4FS A03;
    public C116855qy A04;
    public boolean A05;
    public final C90144fu A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Pz(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            C88864av r2 = (C88864av) ((C111685iW) generatedComponent());
            this.A00 = r2.A0I.ABT();
            C64333Db r1 = r2.A0K;
            this.A03 = C64333Db.A8y(r1);
            this.A01 = r2.A41();
            this.A02 = C64333Db.A4B(r1);
        }
        this.A06 = new C90144fu(this, getProfilePrivacyTipQpManager(), getDeepLinkHelper(), getAbProps(), getWaWorkers());
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setDeepLinkHelper(AnonymousClass5HH r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setProfilePrivacyTipQpManager(C90084fo r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setWaWorkers(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final AnonymousClass5HH getDeepLinkHelper() {
        AnonymousClass5HH r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("deepLinkHelper");
    }

    public final C90084fo getProfilePrivacyTipQpManager() {
        C90084fo r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("profilePrivacyTipQpManager");
    }

    public final AnonymousClass4FS getWaWorkers() {
        AnonymousClass4FS r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }
}
