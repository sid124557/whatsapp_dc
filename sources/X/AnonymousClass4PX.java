package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;

/* renamed from: X.4PX  reason: invalid class name */
public final class AnonymousClass4PX extends FrameLayout implements AnonymousClass4GJ {
    public C620733j A00;
    public C116855qy A01;
    public boolean A02;
    public final LottieAnimationView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4PX(Context context, AnonymousClass679 r13) {
        super(context);
        C18270x1.A10(context, 1, r13);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
        C86624Kv.A10(this, -1, -2);
        View.inflate(context, R.layout.f8nameremoved, this);
        View A0E = C18280x3.A0E(this, R.id.ti_bubble);
        Drawable A0G = C18310x6.A0G(getContext(), R.drawable.balloon_incoming_normal);
        C162457s7.A0D(A0G);
        Rect A0N = AnonymousClass001.A0N();
        A0G.getPadding(A0N);
        C131666dx r0 = new C131666dx(A0G, getWhatsAppLocale());
        r0.A00 = true;
        A0E.setBackground(r0);
        int dimensionPixelSize = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        C107555bV.A07(A0E, getWhatsAppLocale(), C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        getWhatsAppLocale();
        C107555bV.A03(A0E, r13.B4q() + A0N.left, 0);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C18280x3.A0E(this, R.id.typing_indicator);
        this.A03 = lottieAnimationView;
        lottieAnimationView.setSpeed(C102805Ki.A00(getWhatsAppLocale()) ? -1.0f : 1.0f);
        setVisibility(8);
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        LottieAnimationView lottieAnimationView = this.A03;
        if (i == 0) {
            lottieAnimationView.setAnimation((int) R.raw.typing_indicator);
            C107235av.A06(lottieAnimationView, C18290x4.A0G(this).getColor(R.color.f5nameremoved));
            lottieAnimationView.A01();
            return;
        }
        lottieAnimationView.A00();
    }
}
