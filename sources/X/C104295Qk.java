package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.5Qk  reason: invalid class name and case insensitive filesystem */
public class C104295Qk {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C56612sH A03;
    public final C66543Lv A04;
    public final C29431io A05;
    public final AnonymousClass4FS A06;
    public final Map A07 = AnonymousClass001.A0t();

    public void A00(C30471mV r12) {
        byte b = r12.A1I;
        long A0I = this.A03.A0I(r12.A0K);
        String str = r12.A04;
        if (str == null) {
            C71353by.A01(this.A06, this, r12, 33);
            return;
        }
        C55682qk r5 = this.A00;
        AnonymousClass4FS r6 = this.A06;
        int i = r12.A09;
        ArrayList A0I2 = AnonymousClass002.A0I(3);
        C64393Dh r1 = this.A01;
        A0I2.add(r1.A0K(b, i, 2));
        A0I2.add(r1.A0K(b, i, 1));
        A0I2.add(r1.A0K(b, i, 3));
        C90014fe r4 = new C90014fe(r5, r6, str, A0I2, A0I);
        this.A07.put(r12, r4);
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0S(r12, "mediafilefindmanager/starting message ", A0o);
        C18260x0.A1P(A0o, "; job=", r4);
        AnonymousClass33C A002 = C30471mV.A00(r12);
        A002.A0c = true;
        A002.A0C = 0;
        this.A05.A0C(r12, -1);
        C124276Bq r13 = new C124276Bq(r12, 3, this);
        Executor executor = this.A02.A08;
        r4.A04(r13, executor);
        r4.A00.A04(new C124276Bq(r12, 4, this), executor);
        r6.BkM(r4);
    }

    public C104295Qk(C55682qk r2, C64393Dh r3, C69263Wi r4, C56612sH r5, C66543Lv r6, C29431io r7, AnonymousClass4FS r8) {
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A06 = r8;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
    }

    public final void A01(C30471mV r5, Throwable th) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A08 = C624134x.A08(r5, "mediafilefindmanager/not fixing message ", A0o);
        Log.d(AnonymousClass000.A0R(A08, A0o), th);
        this.A07.remove(r5);
        C30471mV.A00(r5).A0c = false;
        this.A05.A0C(r5, -1);
        if (th instanceof FileNotFoundException) {
            C69263Wi r2 = this.A02;
            boolean z = A08.A00 instanceof C95804uY;
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            r2.A0F(i, 1);
        }
    }
}
