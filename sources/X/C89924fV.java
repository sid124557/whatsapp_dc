package X;

import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.whatsapp.R;

/* renamed from: X.4fV  reason: invalid class name and case insensitive filesystem */
public final class C89924fV extends C166717z9 {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ C151977Xa A02;

    public void onTransitionEnd(Transition transition) {
        C162457s7.A0J(transition, 0);
        super.onTransitionEnd(transition);
        C89654ea r1 = this.A01;
        View findViewById = r1.findViewById(R.id.picture);
        View findViewById2 = r1.findViewById(R.id.picture_animation);
        findViewById.setVisibility(0);
        findViewById2.setVisibility(4);
        this.A00.setStatusBarColor(-16777216);
    }

    public C89924fV(Window window, C89654ea r2, C151977Xa r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = window;
    }
}
