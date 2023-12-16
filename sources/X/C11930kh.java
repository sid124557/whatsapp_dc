package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0kh  reason: invalid class name and case insensitive filesystem */
public class C11930kh implements Runnable {
    public final /* synthetic */ C011709l A00;
    public final /* synthetic */ ArrayList A01;

    public C11930kh(C011709l r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C05570Ua r9 = (C05570Ua) it.next();
            C011709l r8 = this.A00;
            View view = r9.A0H;
            ViewPropertyAnimator animate = view.animate();
            r8.A00.add(r9);
            animate.alpha(1.0f).setDuration(r8.A03()).setListener(new C17470vd(view, animate, r8, r9, 1)).start();
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
