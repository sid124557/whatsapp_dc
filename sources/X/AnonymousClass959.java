package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.959  reason: invalid class name */
public class AnonymousClass959 extends AnonymousClass0R6 {
    public int A00 = 0;
    public AnonymousClass39R A01;
    public final AnonymousClass9RV A02;
    public final C194589Tn A03;
    public final C202789ma A04;
    public final List A05 = AnonymousClass001.A0s();

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r8, int i) {
        AnonymousClass95W r2 = (AnonymousClass95W) r8;
        C193959Ra r3 = (C193959Ra) this.A05.get(i);
        r2.A07(r3);
        r2.A0H.setOnClickListener(new C204169ov(r2, r3, this, i, 1));
    }

    public int A0G() {
        return this.A05.size();
    }

    public AnonymousClass959(AnonymousClass9RV r2, C194589Tn r3, C202789ma r4) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass95W(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A02, this.A03);
    }
}
