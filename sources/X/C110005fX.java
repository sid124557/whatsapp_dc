package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

/* renamed from: X.5fX  reason: invalid class name and case insensitive filesystem */
public class C110005fX implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C113245l7 A03;
    public final /* synthetic */ boolean A04;

    public C110005fX(View view, ViewGroup viewGroup, C113245l7 r3, int i, boolean z) {
        this.A03 = r3;
        this.A02 = viewGroup;
        this.A04 = z;
        this.A01 = view;
        this.A00 = i;
    }

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A02;
        C86624Kv.A16(viewGroup, this);
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setDuration(250);
        if (this.A04) {
            this.A03.A2f.startAnimation(translateAnimation);
        }
        C113245l7 r6 = this.A03;
        if (viewGroup == r6.A0a && r6.A0W.getVisibility() == 0) {
            r6.A0W.startAnimation(translateAnimation);
        }
        if (r6.A4P.A0L) {
            r6.A0c.startAnimation(translateAnimation);
        }
        this.A01.startAnimation(translateAnimation);
        Drawable background = r6.A2c.A02.getBackground();
        C162457s7.A0D(background);
        View view = r6.A2c.A02;
        Drawable background2 = view.getBackground();
        if (!(background2 instanceof AnonymousClass4M8)) {
            background2 = new AnonymousClass4M8(view.getBackground());
            view.setBackground(background2);
        }
        AnonymousClass4M8 r1 = (AnonymousClass4M8) background2;
        r1.A00 = height;
        r1.invalidateSelf();
        AnonymousClass4OF r2 = new AnonymousClass4OF(background, this, r1, height);
        r2.setStartTime(-1);
        r2.setDuration(250);
        C1232467r.A00(r2, this, 5);
        r6.A2c.A02.startAnimation(r2);
    }
}
