package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0kf  reason: invalid class name and case insensitive filesystem */
public class C11910kf implements Runnable {
    public final /* synthetic */ C011709l A00;
    public final /* synthetic */ ArrayList A01;

    public C11910kf(C011709l r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0MM r3 = (AnonymousClass0MM) it.next();
            C011709l r8 = this.A00;
            C05570Ua r9 = r3.A04;
            int i = r3.A00;
            int i2 = r3.A01;
            int i3 = r3.A02;
            int i4 = r3.A03;
            View view = r9.A0H;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            r8.A04.add(r9);
            animate.setDuration(r8.A05()).setListener(new AnonymousClass00C(view, animate, r8, r9, i5, i6)).start();
        }
        arrayList.clear();
        this.A00.A05.remove(arrayList);
    }
}
