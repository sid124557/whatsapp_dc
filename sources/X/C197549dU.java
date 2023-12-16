package X;

import android.content.Context;
import com.whatsapp.R;
import java.math.BigDecimal;

/* renamed from: X.9dU  reason: invalid class name and case insensitive filesystem */
public class C197549dU implements C202199lX {
    public AnonymousClass39Q A00;
    public final Context A01;
    public final C620733j A02;
    public final C85204Fi A03;
    public final AnonymousClass39Q A04;
    public final AnonymousClass39Q A05;
    public final C193599Pg A06;

    public final C193339Oc A00(String str, BigDecimal bigDecimal, int i, boolean z) {
        AnonymousClass39Q r0;
        int i2;
        if (i == 0) {
            r0 = this.A00;
        } else {
            r0 = this.A04;
        }
        BigDecimal bigDecimal2 = r0.A00;
        C193599Pg r7 = this.A06;
        if (r7 != null) {
            i2 = 0;
            C162457s7.A0J(bigDecimal, 0);
            C18270x1.A10(bigDecimal2, 1, str);
            BigDecimal A012 = C161957qt.A01(r7.A03, bigDecimal);
            if (A012.compareTo(bigDecimal2) > 0 || (A012.compareTo(bigDecimal2) == 0 && str.endsWith(".") && !z)) {
                return new C193339Oc(3, AnonymousClass002.A0F(r7.A00, r7.A02.B3W(r7.A01, bigDecimal2), new Object[1], 0, R.string.f11nameremoved));
            }
        } else {
            i2 = 0;
            if (bigDecimal.compareTo(bigDecimal2) > 0 || (bigDecimal.compareTo(bigDecimal2) == 0 && str.endsWith(".") && !z)) {
                return new C193339Oc(3, AnonymousClass002.A0F(this.A01, this.A03.B3W(this.A02, bigDecimal2), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
            }
        }
        return new C193339Oc(i2, "");
    }

    public C197549dU(Context context, C620733j r2, C85204Fi r3, AnonymousClass39Q r4, AnonymousClass39Q r5, AnonymousClass39Q r6, C193599Pg r7) {
        this.A01 = context;
        this.A06 = r7;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = r4;
        this.A05 = r5;
        this.A04 = r6;
    }
}
