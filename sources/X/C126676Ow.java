package X;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Handler;

/* renamed from: X.6Ow  reason: invalid class name and case insensitive filesystem */
public class C126676Ow extends AnonymousClass6OF implements C184928sm {
    public int A00;
    public long A01;
    public C166527yp A02;
    public C178018gp A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final AnonymousClass7VZ A09;
    public final C186418vH A0A;

    public void A0A() {
        try {
            super.A0A();
        } finally {
            if (this.A06) {
                this.A06 = false;
                this.A0A.reset();
            }
        }
    }

    public void A0B() {
        this.A06 = true;
        try {
            this.A0A.flush();
            super.A0B();
        } catch (Throwable th) {
            super.A0B();
            throw th;
        } finally {
            this.A09.A00(this.A0K);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126676Ow(Context context, Handler handler, C160527no r7, C186238uy r8, C186968wE r9, C187058wN... r10) {
        super(C186638vh.A00, r9, 44100.0f, 1);
        AnonymousClass86A r3 = new AnonymousClass86A(r7, new AnonymousClass86C(r10));
        this.A08 = context.getApplicationContext();
        this.A0A = r3;
        this.A09 = new AnonymousClass7VZ(handler, r8);
        r3.A0F = new AnonymousClass869(this);
    }

    public final int A0a(C166527yp r3, C160687o8 r4) {
        int i;
        UiModeManager uiModeManager;
        if (!"OMX.google.raw.decoder".equals(r4.A03) || (i = C162387ry.A01) >= 24 || (i == 23 && (uiModeManager = (UiModeManager) this.A08.getApplicationContext().getSystemService("uimode")) != null && uiModeManager.getCurrentModeType() == 4)) {
            return r3.A0A;
        }
        return -1;
    }

    public final void A0b() {
        long B6X = this.A0A.B6X(BHW());
        if (B6X != Long.MIN_VALUE) {
            if (!this.A05) {
                B6X = Math.max(this.A01, B6X);
            }
            this.A01 = B6X;
            this.A05 = false;
        }
    }

    public C158477k2 BBR() {
        return ((AnonymousClass86A) this.A0A).A04().A02;
    }

    public long BBa() {
        if (this.A01 == 2) {
            A0b();
        }
        return this.A01;
    }

    public boolean BIe() {
        if (this.A0A.BFP() || super.BIe()) {
            return true;
        }
        return false;
    }

    public void Bmy(C158477k2 r2) {
        this.A0A.Bmy(r2);
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    public void A0C(long j, boolean z) {
        super.A0C(j, z);
        this.A0A.flush();
        this.A01 = j;
        this.A04 = true;
        this.A05 = true;
    }

    public void A0D(boolean z, boolean z2) {
        super.A0D(z, z2);
        AnonymousClass7VZ r3 = this.A09;
        C150277Pz r2 = this.A0K;
        Handler handler = r3.A00;
        if (handler != null) {
            AnonymousClass8MF.A00(handler, r3, r2, 27);
        }
        C157957jC r0 = this.A04;
        r0.getClass();
        boolean z3 = r0.A00;
        AnonymousClass86A r22 = (AnonymousClass86A) this.A0A;
        if (z3) {
            C161487pm.A04(r22.A0P);
            if (!r22.A0W) {
                r22.A0W = true;
            } else {
                return;
            }
        } else if (r22.A0W) {
            r22.A0W = false;
        } else {
            return;
        }
        r22.flush();
    }

    public C151887Wr A0F(C147807Fu r7) {
        C151887Wr A0F = super.A0F(r7);
        AnonymousClass7VZ r4 = this.A09;
        C166527yp r3 = r7.A00;
        Handler handler = r4.A00;
        if (handler != null) {
            handler.post(new C172708Mj(r4, r3, A0F, 7));
        }
        return A0F;
    }

    public C126676Ow(Context context, Handler handler, C186238uy r6, C186418vH r7, C186968wE r8) {
        super(C186638vh.A00, r8, 44100.0f, 1);
        this.A08 = context.getApplicationContext();
        this.A0A = r7;
        this.A09 = new AnonymousClass7VZ(handler, r6);
        ((AnonymousClass86A) r7).A0F = new AnonymousClass869(this);
    }
}
