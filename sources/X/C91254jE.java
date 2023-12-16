package X;

import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.4jE  reason: invalid class name and case insensitive filesystem */
public final class C91254jE extends AnonymousClass4Z5 {
    public C112435jj A00;
    public final AnonymousClass5MQ A01;
    public final AnonymousClass5ZU A02;
    public final C105365Uq A03;
    public final C105365Uq A04;
    public final C56612sH A05;
    public final C620733j A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass66R A08 = C154517dI.A01(AnonymousClass8XG.A00);
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C;
    public final AnonymousClass66R A0D;
    public final AnonymousClass66R A0E;
    public final AnonymousClass66R A0F;
    public final AnonymousClass66R A0G;
    public final AnonymousClass66R A0H;
    public final AnonymousClass66R A0I;
    public final AnonymousClass66R A0J = C154517dI.A01(new C174588Vc(this));
    public final AnonymousClass66R A0K;
    public final AnonymousClass66R A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91254jE(View view, AnonymousClass64J r7, AnonymousClass5MQ r8, AnonymousClass5ZU r9, C105365Uq r10, C105365Uq r11, C56612sH r12, C620733j r13, AnonymousClass1VX r14, C187958y5 r15) {
        super(view);
        C18260x0.A0f(r15, r7, view, r12, r14);
        C18260x0.A0U(r9, r13);
        C18280x3.A15(r10, r11);
        this.A05 = r12;
        this.A07 = r14;
        this.A02 = r9;
        this.A06 = r13;
        this.A01 = r8;
        this.A03 = r10;
        this.A04 = r11;
        this.A0G = C154517dI.A01(new AnonymousClass8VZ(view));
        this.A0C = C154517dI.A01(new AnonymousClass8VV(view));
        this.A0E = C154517dI.A01(new AnonymousClass8VX(view));
        this.A0A = C154517dI.A01(new AnonymousClass8VU(view));
        this.A09 = C154517dI.A01(new AnonymousClass8VT(view));
        this.A0D = C154517dI.A01(new AnonymousClass8VW(view));
        this.A0I = C154517dI.A01(new C174578Vb(view));
        this.A0H = C154517dI.A01(new C174568Va(view));
        this.A0L = C154517dI.A01(new C174608Ve(view));
        this.A0K = C154517dI.A01(new C174598Vd(view));
        this.A0F = C154517dI.A01(new AnonymousClass8VY(view));
        this.A0B = C154517dI.A01(new C175048Ww(view, r7));
        AnonymousClass66R r4 = this.A0L;
        View A0H2 = C86644Kx.A0H(r4);
        AnonymousClass66R r2 = this.A08;
        A0H2.setOnTouchListener((C109885fL) r2.getValue());
        AnonymousClass66R r3 = this.A0K;
        C86644Kx.A0H(r3).setOnTouchListener((C109885fL) r2.getValue());
        if (this.A01 == null) {
            Log.w("CallsHistoryCallItemViewHolder/setEventListeners event listener is null");
        } else {
            AnonymousClass66R r1 = this.A0C;
            C18320x8.A13(C86644Kx.A0H(r1), this, 0);
            C86644Kx.A0H(r1).setOnLongClickListener(new C1891790h(this, 0));
            AnonymousClass66R r22 = this.A0E;
            C989453v.A00(C86644Kx.A0H(r22), this, 49);
            C86644Kx.A0H(r22).setOnLongClickListener(new C1891790h(this, 1));
            View view2 = this.A0H;
            C18320x8.A13(view2, this, 1);
            view2.setOnLongClickListener(new C1891790h(this, 2));
            C18300x5.A18(C86644Kx.A0H(r4), this, 35);
            C18300x5.A18(C86644Kx.A0H(r3), this, 36);
        }
        C107235av.A02(view);
    }
}
