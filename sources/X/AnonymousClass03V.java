package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* renamed from: X.03V  reason: invalid class name */
public class AnonymousClass03V extends AnonymousClass03W {
    @ViewDebug.ExportedProperty
    public int A00;
    @ViewDebug.ExportedProperty
    public int A01;
    @ViewDebug.ExportedProperty
    public boolean A02;
    public boolean A03;
    @ViewDebug.ExportedProperty
    public boolean A04;
    @ViewDebug.ExportedProperty
    public boolean A05;

    public AnonymousClass03V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnonymousClass03V(AnonymousClass03V r2) {
        super((ViewGroup.LayoutParams) r2);
        this.A04 = r2.A04;
    }

    public AnonymousClass03V(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass03V() {
        super(-2);
        this.A04 = false;
    }
}
