package X;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0Zw  reason: invalid class name */
public class AnonymousClass0Zw implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C010007y A01;
    public final /* synthetic */ ArrayList A02;

    public AnonymousClass0Zw(View view, C010007y r2, ArrayList arrayList) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass001.A0S(arrayList, i).setVisibility(0);
        }
    }

    public void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }
}
