package X;

import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5hk  reason: invalid class name and case insensitive filesystem */
public class C111225hk implements C184998st {
    public View A00;
    public final C116985rC A01;
    public final C116985rC A02;
    public final AnonymousClass4Pc A03;
    public final C56612sH A04;
    public final C54292oU A05;
    public final AnonymousClass33p A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass9Df A08;

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        return false;
    }

    public void BrS() {
        if (this.A00 == null) {
            AnonymousClass4Pc r2 = this.A03;
            View A0R = AnonymousClass001.A0R(C18280x3.A0D(r2), r2, R.layout.f8nameremoved);
            this.A00 = A0R;
            A0R.setBackgroundResource(R.drawable.selector_orange_gradient);
            r2.addView(this.A00);
        }
        if (this.A00 == null) {
            AnonymousClass4Pc r22 = this.A03;
            View A0R2 = AnonymousClass001.A0R(C18280x3.A0D(r22), r22, R.layout.f8nameremoved);
            this.A00 = A0R2;
            A0R2.setBackgroundResource(R.drawable.selector_orange_gradient);
        }
        this.A00.setVisibility(8);
    }

    public C111225hk(C116985rC r1, C116985rC r2, AnonymousClass4Pc r3, C56612sH r4, C54292oU r5, AnonymousClass33p r6, AnonymousClass1VX r7, AnonymousClass9Df r8) {
        this.A04 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
        this.A02 = r2;
        this.A08 = r8;
    }
}
