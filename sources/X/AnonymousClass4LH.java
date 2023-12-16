package X;

import android.app.SharedElementCallback;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4LH  reason: invalid class name */
public class AnonymousClass4LH extends SharedElementCallback {
    public final List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ C009707r A01;

    public AnonymousClass4LH(C009707r r2) {
        this.A01 = r2;
    }

    public void onMapSharedElements(List list, Map map) {
        super.onMapSharedElements(list, map);
        C009707r r7 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        View A0Q = AnonymousClass001.A0Q(r7);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            View view = (View) map.get(A0m);
            if (view == null) {
                view = C107275b2.A06(A0Q, A0m);
                if (view != null) {
                    map.put(A0m, view);
                }
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent != null) {
                    if (parent == A0Q) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    AnonymousClass0YZ.A0F(view, (String) null);
                    map.remove(A0m);
                    if (A0m.startsWith("thumb-transition-")) {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        ViewGroup A0m2 = C86664Kz.A0m(r7, R.id.conversation_layout);
                        if (A0m2 != null) {
                            View view2 = new View(r7);
                            A0m2.addView(view2);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(14);
                            layoutParams.topMargin = -height;
                            view2.setLayoutParams(layoutParams);
                            A0s.add(view2);
                            AnonymousClass0YZ.A0F(view2, A0m);
                            map.put(A0m, view2);
                        }
                    }
                }
            }
        }
        this.A00.addAll(A0s);
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
        super.onSharedElementEnd(list, list2, list3);
        this.A01.setExitSharedElementCallback((SharedElementCallback) null);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass0YZ.A0F(C86654Ky.A0H(it), (String) null);
        }
    }

    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            View A0H = C86654Ky.A0H(it);
            C86664Kz.A0l(A0H).removeView(A0H);
        }
    }
}
