package X;

import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.11q  reason: invalid class name and case insensitive filesystem */
public class C195511q extends AnonymousClass0R6 {
    public final AnonymousClass2R1 A00;

    public int A0G() {
        C129586aY r0 = this.A00.A01;
        if (r0 == null) {
            r0 = C129586aY.of();
        }
        return r0.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r4, int i) {
        AnonymousClass12W r42 = (AnonymousClass12W) r4;
        C129586aY r0 = this.A00.A01;
        if (r0 == null) {
            r0 = C129586aY.of();
        }
        AnonymousClass2O0 r2 = (AnonymousClass2O0) r0.get(i);
        r42.A00 = r2;
        r42.A02.setText(r2.A02.A00);
        r42.A01.setChecked(r2.A00);
        r2.A01.A0E(new AnonymousClass4K2(r42, 91));
    }

    public C195511q(AnonymousClass0O4 r4) {
        this.A00 = new AnonymousClass2R1(new C05360Ta(r4).A00(), new C08490eZ(this));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass12W(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }
}
