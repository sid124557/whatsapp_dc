package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.5pH  reason: invalid class name and case insensitive filesystem */
public class C115815pH implements C1226165b {
    public View A00;
    public View A01;
    public final /* synthetic */ StatusesFragment A02;

    public C115815pH(StatusesFragment statusesFragment) {
        this.A02 = statusesFragment;
    }

    public final void A00(boolean z, boolean z2) {
        int measuredHeight = this.A01.getMeasuredHeight();
        if (this.A01.getVisibility() != 0) {
            C86614Ku.A1F(this.A01, this.A00.getMeasuredWidth(), Integer.MIN_VALUE);
            measuredHeight = this.A01.getMeasuredHeight();
        }
        StatusesFragment statusesFragment = this.A02;
        AnimatorSet animatorSet = statusesFragment.A01;
        if (animatorSet == null || (!animatorSet.isRunning() && !statusesFragment.A01.isStarted())) {
            statusesFragment.A01 = C86664Kz.A0O();
            statusesFragment.A1E.get();
            int i = 8;
            float f = 100.0f;
            float f2 = 0.0f;
            if (z) {
                i = 0;
                f2 = 100.0f;
                f = 0.0f;
            }
            int i2 = 1;
            if (z2) {
                i2 = 500;
            }
            float[] fArr = new float[2];
            fArr[0] = f2;
            ValueAnimator A0P = C86664Kz.A0P(fArr, f);
            A0P.setDuration((long) i2);
            C86644Kx.A0i(A0P);
            A0P.addUpdateListener(new C100365Aq(this, measuredHeight, 4));
            A0P.addListener(new AnonymousClass4L7(this, i, z));
            statusesFragment.A01.playSequentially(new Animator[]{A0P});
            statusesFragment.A01.addListener(new AnonymousClass67G(2, this, z));
            if (z) {
                statusesFragment.A01.setStartDelay(700);
            }
            statusesFragment.A01.start();
        }
    }

    public View BEK(Context context, View view, ViewGroup viewGroup, C105365Uq r7, List list, List list2, List list3, List list4, boolean z) {
        if (view != null) {
            this.A00 = view;
            this.A01 = view.findViewById(R.id.status_sharing_row_view);
        } else {
            StatusesFragment statusesFragment = this.A02;
            statusesFragment.A1E.get();
            View A0R = AnonymousClass001.A0R(LayoutInflater.from(context), viewGroup, R.layout.f8nameremoved);
            this.A00 = A0R;
            C86634Kw.A1D(A0R, statusesFragment, R.string.f11nameremoved);
            C107295b4.A03(this.A00, R.string.f11nameremoved);
            C634139d.A00(this.A00, this, 48);
            C634139d.A00(this.A00.findViewById(R.id.status_row_share_to_third_party_button), this, 49);
            this.A01 = this.A00.findViewById(R.id.status_sharing_row_view);
            C103825Oo r1 = statusesFragment.A0x;
            r1.A00 = new C102165Hs(viewGroup, this);
            C104715Sb r0 = r1.A02;
            A00(r0.A01, r0.A00);
        }
        return this.A00;
    }
}
