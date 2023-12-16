package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.5UY  reason: invalid class name */
public final class AnonymousClass5UY {
    public View.OnClickListener A00;
    public View A01;
    public ViewStub A02;
    public C183278pm A03;
    public LinkedHashMap A04;

    public static void A02(AnonymousClass5UY r1, Object obj, int i) {
        r1.A09(new AnonymousClass6B7(obj, i));
    }

    public int A03() {
        View view = this.A01;
        if (view == null) {
            return 8;
        }
        return view.getVisibility();
    }

    public View A04() {
        View view;
        View view2;
        ViewStub viewStub;
        View view3 = this.A01;
        if (view3 == null && (viewStub = this.A02) != null) {
            view3 = viewStub.inflate();
            this.A01 = view3;
            this.A02 = null;
        }
        C626936e.A07(view3, "View must be inflated in ViewStubHolder.getView()");
        C183278pm r1 = this.A03;
        if (!(r1 == null || (view2 = this.A01) == null)) {
            r1.BUX(view2);
            this.A03 = null;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (!(linkedHashMap == null || this.A01 == null)) {
            Iterator A10 = C18290x4.A10(linkedHashMap);
            while (A10.hasNext()) {
                ((C183278pm) A10.next()).BUX(this.A01);
            }
            this.A04 = null;
        }
        View.OnClickListener onClickListener = this.A00;
        if (!(onClickListener == null || (view = this.A01) == null)) {
            view.setOnClickListener(onClickListener);
            this.A00 = null;
        }
        return this.A01;
    }

    public ViewGroup.LayoutParams A05() {
        View view = this.A02;
        if (view != null || (view = this.A01) != null) {
            return view.getLayoutParams();
        }
        throw AnonymousClass001.A0e("Either viewStub or view should exist");
    }

    public void A06(int i) {
        View A042;
        if (i == 8) {
            A042 = this.A01;
            if (A042 == null) {
                return;
            }
        } else {
            A042 = A04();
        }
        A042.setVisibility(i);
    }

    public void A07(View.OnClickListener onClickListener) {
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        } else {
            this.A00 = onClickListener;
        }
    }

    public void A08(ViewGroup.LayoutParams layoutParams) {
        View view = this.A02;
        if (view == null && (view = this.A01) == null) {
            throw AnonymousClass001.A0e("Either viewStub or view should exist");
        }
        view.setLayoutParams(layoutParams);
    }

    public void A09(C183278pm r2) {
        View view = this.A01;
        if (view != null) {
            r2.BUX(view);
        } else {
            this.A03 = r2;
        }
    }

    public void A0A(C183278pm r2, String str) {
        View view = this.A01;
        if (view != null) {
            r2.BUX(view);
            return;
        }
        LinkedHashMap linkedHashMap = this.A04;
        if (linkedHashMap == null) {
            linkedHashMap = C18320x8.A0r();
            this.A04 = linkedHashMap;
        }
        if (linkedHashMap.containsKey(str)) {
            this.A04.remove(str);
        }
        this.A04.put(str, r2);
    }

    public AnonymousClass5UY(View view) {
        C626936e.A04(view);
        if (view instanceof ViewStub) {
            this.A02 = (ViewStub) view;
        } else {
            this.A01 = view;
        }
    }

    public static View A00(AnonymousClass5UY r0, int i) {
        r0.A06(i);
        return r0.A04();
    }

    public static AnonymousClass5UY A01(Activity activity, int i) {
        return new AnonymousClass5UY(C005205m.A00(activity, i));
    }
}
