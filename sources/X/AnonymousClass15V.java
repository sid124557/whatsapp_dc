package X;

import android.app.Activity;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.15V  reason: invalid class name */
public final class AnonymousClass15V extends AnonymousClass7XV {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ BottomSheetBehavior A01;
    public final /* synthetic */ C44052Um A02;
    public final /* synthetic */ AnonymousClass4GP A03;
    public final /* synthetic */ C69873Yv A04;
    public final /* synthetic */ C69883Yw A05;

    public void A03(View view, int i) {
        C162457s7.A0J(view, 0);
        if (i == 1) {
            view.getTop();
            this.A05.element = view.getTop();
            if (AnonymousClass001.A1Z(this.A03.invoke())) {
                return;
            }
        } else if (i == 2) {
            C69883Yw r2 = this.A05;
            if (r2.element != -1) {
                if (((double) (((float) (view.getTop() - r2.element)) / ((float) view.getMeasuredHeight()))) > ((double) ((float) this.A02.A00.A0O(C58422vE.A02, 2305))) / 100.0d) {
                    this.A04.element = true;
                    this.A01.A0S(5);
                    return;
                }
            } else {
                return;
            }
        } else if (i != 5) {
            return;
        } else {
            if (this.A04.element) {
                this.A00.finish();
                return;
            }
        }
        this.A01.A0S(3);
    }

    public AnonymousClass15V(Activity activity, BottomSheetBehavior bottomSheetBehavior, C44052Um r3, AnonymousClass4GP r4, C69873Yv r5, C69883Yw r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = bottomSheetBehavior;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = activity;
    }

    public void A02(View view, float f) {
    }
}
