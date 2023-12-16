package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.90g  reason: invalid class name and case insensitive filesystem */
public class C1891690g implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public C1891690g(AnonymousClass7XM r1, int i) {
        this.A01 = i;
        if (4 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomSheetBehavior bottomSheetBehavior;
        int i9;
        AnonymousClass4M1 r2;
        int length;
        int i10 = i7;
        int i11 = i4;
        int i12 = i3;
        int i13 = i;
        int i14 = i2;
        int i15 = i5;
        int i16 = i8;
        switch (this.A01) {
            case 0:
                ((BottomAppBar$Behavior) this.A00).A00.get();
                view.removeOnLayoutChangeListener(this);
                return;
            case 1:
                AnonymousClass4PF r1 = (AnonymousClass4PF) this.A00;
                ImageView imageView = r1.A0R;
                if (imageView.getVisibility() == 0 && (r2 = r1.A0I) != null) {
                    Rect A0N = AnonymousClass001.A0N();
                    imageView.getDrawingRect(A0N);
                    r2.setBounds(A0N);
                    r2.A08(imageView, (FrameLayout) null);
                    return;
                }
                return;
            case 2:
                AnonymousClass560 r0 = (AnonymousClass560) this.A00;
                if (i4 != i16) {
                    r0.A07();
                    return;
                }
                return;
            case 3:
                AnonymousClass5O4 r12 = (AnonymousClass5O4) this.A00;
                int i17 = i3 - i;
                int i18 = i4 - i2;
                if (i17 != r12.A01 || i18 != r12.A00) {
                    r12.A01 = i17;
                    r12.A00 = i18;
                    r12.A00();
                    return;
                }
                return;
            case 4:
                AnonymousClass7XM r5 = (AnonymousClass7XM) this.A00;
                TextView textView = r5.A09;
                int width = textView.getWidth();
                TextView textView2 = r5.A08;
                int width2 = textView2.getWidth();
                if (width <= width2) {
                    textView2 = textView;
                }
                int max = Math.max(width, width2);
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                if (max != layoutParams.width) {
                    layoutParams.width = max;
                    textView2.post(new C71353by(textView2, 38, layoutParams));
                }
                if (C86604Kt.A1Z(r5.A0F)) {
                    View view2 = r5.A03;
                    ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view2);
                    int A05 = C86614Ku.A05(view2, R.dimen.f6nameremoved) + C86614Ku.A05(view2, R.dimen.f6nameremoved) + (max * 2);
                    if (A0T.width != A05) {
                        A0T.width = A05;
                        view2.post(new C71353by(r5, 39, A0T));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                AnonymousClass7XM r02 = (AnonymousClass7XM) this.A00;
                View view3 = r02.A03;
                ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view3);
                int width3 = r02.A06.getWidth();
                A0T2.setMargins(0, 0, 0, 0);
                A0T2.width = C86614Ku.A05(view3, R.dimen.f6nameremoved) + C86614Ku.A05(view3, R.dimen.f6nameremoved) + width3;
                view3.setLayoutParams(A0T2);
                view3.removeOnLayoutChangeListener(this);
                return;
            case 6:
                C153447bK r03 = (C153447bK) this.A00;
                int i19 = i3 - i;
                if (i7 - i5 != i19) {
                    C125326Hj r3 = r03.A09;
                    C153447bK r13 = r3.A03;
                    boolean z = r13.A00;
                    if (r13 instanceof C135726l9) {
                        Resources A0G = C18290x4.A0G(r13.A06);
                        int i20 = R.dimen.f6nameremoved;
                        if (z) {
                            i20 = R.dimen.f6nameremoved;
                        }
                        length = i19 / A0G.getDimensionPixelSize(i20);
                    } else {
                        length = C135736lA.A01.length;
                    }
                    r3.A01 = length;
                    return;
                }
                return;
            case 7:
                VoipActivityV2.A0Y((VoipActivityV2) this.A00, i13, i14, i12, i11, i15, i6, i10, i16);
                return;
            case 8:
                C86644Kx.A0v(this, view);
                View view4 = (View) this.A00;
                bottomSheetBehavior = BottomSheetBehavior.A01(view4);
                bottomSheetBehavior.A0U(view4.getHeight(), false);
                i9 = 3;
                break;
            case 9:
                C86644Kx.A0v(this, view);
                View view5 = (View) this.A00;
                bottomSheetBehavior = BottomSheetBehavior.A01(view5);
                ViewParent parent = view5.getParent();
                C162457s7.A0K(parent, "null cannot be cast to non-null type android.view.View");
                bottomSheetBehavior.A0U(((View) parent).getHeight() / 2, false);
                i9 = 4;
                break;
            default:
                C86644Kx.A0v(this, view);
                if (!C06360Xi.A05(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new AnonymousClass91C(view, 4, this));
                } else {
                    view.addOnLayoutChangeListener(this);
                }
                view.post(new C70153a2(this.A00, 42, view));
                return;
        }
        bottomSheetBehavior.A0S(i9);
        bottomSheetBehavior.A0p = true;
    }

    public C1891690g(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
