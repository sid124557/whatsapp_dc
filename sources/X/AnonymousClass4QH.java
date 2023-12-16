package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.4QH  reason: invalid class name */
public abstract class AnonymousClass4QH extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            GifSearchContainer gifSearchContainer = (GifSearchContainer) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            gifSearchContainer.A0D = C86644Kx.A0V(r1);
            gifSearchContainer.A0J = C86644Kx.A0b(r1);
            gifSearchContainer.A0C = C64333Db.A4H(r1);
            gifSearchContainer.A08 = C64333Db.A2o(r1);
            gifSearchContainer.A0A = C64333Db.A2t(r1);
            gifSearchContainer.A09 = C64333Db.A2s(r1);
            gifSearchContainer.A0I = C64333Db.A74(r1);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4QH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public AnonymousClass4QH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass4QH(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public AnonymousClass4QH(Context context) {
        super(context);
        A00();
    }
}
