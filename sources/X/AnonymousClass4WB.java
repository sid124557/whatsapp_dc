package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4WB  reason: invalid class name */
public final class AnonymousClass4WB extends AnonymousClass09G {
    public static final AnonymousClass0O4 A01 = new C1231067d(3);
    public final AnonymousClass4GQ A00;

    public AnonymousClass4WB(AnonymousClass4GQ r3) {
        super(A01);
        this.A00 = r3;
        A0E(true);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YQ(C18300x5.A0F(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved));
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r7, int i) {
        AnonymousClass4YQ r72 = (AnonymousClass4YQ) r7;
        C162457s7.A0J(r72, 0);
        AnonymousClass5SX r5 = (AnonymousClass5SX) A0K(i);
        C162457s7.A0H(r5);
        AnonymousClass4GQ r2 = this.A00;
        C18270x1.A14(r5, r2);
        WaImageView waImageView = r72.A01;
        waImageView.setImageResource(r5.A01);
        C18310x6.A19(r72.A00, r2, r5, 2);
        View view = r72.A0H;
        C18300x5.A13(view.getContext(), waImageView, r5.A00);
        boolean z = r5.A03;
        int i2 = R.color.f5nameremoved;
        if (z) {
            i2 = R.color.f5nameremoved;
        }
        AnonymousClass0x2.A0p(view.getContext(), waImageView, i2);
        r72.A02.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public long A0B(int i) {
        return (long) ((AnonymousClass5SX) A0K(i)).A02.hashCode();
    }
}
