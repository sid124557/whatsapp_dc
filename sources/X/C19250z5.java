package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.0z5  reason: invalid class name and case insensitive filesystem */
public final class C19250z5 extends LinearLayout implements C182208o2, AnonymousClass4GJ {
    public C625735q A00;
    public C116855qy A01;
    public boolean A02;

    public C19250z5(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C625735q) ((C88864av) ((C111685iW) generatedComponent())).A0K.AYF.get();
        }
        setGravity(17);
        setOrientation(1);
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        layoutParams.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), dimensionPixelSize, layoutParams.bottomMargin);
        return layoutParams;
    }

    public final void setSystemMessageTextResolver(C625735q r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C625735q getSystemMessageTextResolver() {
        C625735q r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemMessageTextResolver");
    }

    public View getBodyView() {
        return this;
    }
}
