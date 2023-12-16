package X;

import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.3DG  reason: invalid class name */
public class AnonymousClass3DG implements AnonymousClass66U {
    public final C56972sr A00;
    public final AnonymousClass2NN A01;
    public final C64743Et A02;
    public final C60322yM A03;
    public final C65203Gp A04;
    public final C64673El A05;
    public final AnonymousClass3FH A06;
    public final C620733j A07;

    public void BMd() {
        C56822sc A002;
        AnonymousClass2NN r1 = this.A01;
        if (r1.A01.A0F() && !C66653Mg.A00(r1.A02)) {
            Log.i("MDOptInInitializer/Force_If_Required");
            synchronized (r1) {
                Log.i("MDOptInInitializer/Opting In");
                r1.A00.A00();
            }
        }
        if (this.A00.A0Y()) {
            this.A03.A01((AnonymousClass1nO) null);
        }
        C64743Et r12 = this.A02;
        if (r12.A0D.A00() != null) {
            r12.A03.A00();
        }
        C65203Gp r5 = this.A04;
        if (r5.A0Q()) {
            this.A05.A01();
        }
        r5.A0E();
        C620733j r0 = this.A07;
        AnonymousClass3FH r4 = this.A06;
        r0.A0A.add(r4);
        Locale locale = Locale.getDefault();
        if (!C56972sr.A0C(r5) && (A002 = r5.A0c.A00("setting_locale")) != null) {
            C70323aJ.A00(r5.A0h, r5, A002, locale, 36);
        }
        r4.A01();
    }

    public AnonymousClass3DG(C56972sr r1, AnonymousClass2NN r2, C64743Et r3, C60322yM r4, C65203Gp r5, C64673El r6, AnonymousClass3FH r7, C620733j r8) {
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
    }

    public String BDW() {
        return "CompanionInitAsync";
    }

    public /* synthetic */ void BMe() {
    }
}
