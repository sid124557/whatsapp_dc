package X;

import android.view.ViewGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

/* renamed from: X.8PH  reason: invalid class name */
public abstract class AnonymousClass8PH implements C188468yw {
    public Object A00;

    public void Bnj(Object obj, Object obj2, C188488yy r8) {
        C183528qB r0;
        C162457s7.A0J(r8, 1);
        Object obj3 = this.A00;
        this.A00 = obj2;
        C175648Ze r4 = (C175648Ze) this;
        AnonymousClass75V r7 = (AnonymousClass75V) obj2;
        if (obj3.getClass() != r7.getClass()) {
            WDSTextLayout wDSTextLayout = r4.A00;
            wDSTextLayout.removeAllViews();
            wDSTextLayout.A01 = null;
            wDSTextLayout.A00 = null;
            if (r7 instanceof C140086t8) {
                ViewGroup.LayoutParams layoutParams = wDSTextLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    wDSTextLayout.setLayoutParams(layoutParams);
                    AnonymousClass6G9 r02 = new AnonymousClass6G9(C18290x4.A0F(wDSTextLayout));
                    wDSTextLayout.addView(r02);
                    wDSTextLayout.A00 = r02;
                } else {
                    throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (r7 instanceof C140096t9) {
                ViewGroup.LayoutParams layoutParams2 = wDSTextLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -1;
                    wDSTextLayout.setLayoutParams(layoutParams2);
                    AnonymousClass6GA r03 = new AnonymousClass6GA(C18290x4.A0F(wDSTextLayout));
                    wDSTextLayout.addView(r03);
                    wDSTextLayout.A01 = r03;
                } else {
                    throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (r7 instanceof C140106tA) {
                ViewGroup.LayoutParams layoutParams3 = wDSTextLayout.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -2;
                    wDSTextLayout.setLayoutParams(layoutParams3);
                } else {
                    throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        WDSTextLayout wDSTextLayout2 = r4.A00;
        if (r7 instanceof C140086t8) {
            r0 = wDSTextLayout2.A00;
        } else if (r7 instanceof C140096t9) {
            r0 = wDSTextLayout2.A01;
        } else {
            r7.equals(C140106tA.A00);
            return;
        }
        if (r0 != null) {
            r0.setViewState(r7);
        }
    }

    public AnonymousClass8PH(Object obj) {
        this.A00 = obj;
    }

    public Object BEB(Object obj, C188488yy r3) {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ObservableProperty(value=");
        return C18260x0.A04(this.A00, A0o);
    }
}
