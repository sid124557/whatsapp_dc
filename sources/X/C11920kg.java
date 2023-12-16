package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0kg  reason: invalid class name and case insensitive filesystem */
public class C11920kg implements Runnable {
    public final /* synthetic */ C011709l A00;
    public final /* synthetic */ ArrayList A01;

    public C11920kg(C011709l r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        View view;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0Nn r10 = (AnonymousClass0Nn) it.next();
            C011709l r11 = this.A00;
            C05570Ua r0 = r10.A05;
            View view2 = null;
            if (r0 == null) {
                view = null;
            } else {
                view = r0.A0H;
            }
            C05570Ua r02 = r10.A04;
            if (r02 != null) {
                view2 = r02.A0H;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(r11.A04());
                r11.A02.add(r10.A05);
                duration.translationX((float) (r10.A02 - r10.A00));
                duration.translationY((float) (r10.A03 - r10.A01));
                duration.alpha(0.0f).setListener(new C17470vd(view, duration, r10, r11, 2)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                r11.A02.add(r10.A04);
                animate.translationX(0.0f).translationY(0.0f).setDuration(r11.A04()).alpha(1.0f).setListener(new C17470vd(view2, animate, r10, r11, 3)).start();
            }
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
