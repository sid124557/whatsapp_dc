package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.0aM  reason: invalid class name and case insensitive filesystem */
public class C07120aM implements View.OnLayoutChangeListener {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ AnonymousClass09I A01;
    public final /* synthetic */ C011309h A02;

    public C07120aM(FrameLayout frameLayout, AnonymousClass09I r2, C011309h r3) {
        this.A01 = r2;
        this.A00 = frameLayout;
        this.A02 = r3;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout frameLayout = this.A00;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.A01.A0O(this.A02);
        }
    }
}
