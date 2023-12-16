package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4bP  reason: invalid class name and case insensitive filesystem */
public class C89054bP extends AnonymousClass6JG {
    public final C620733j A00;
    public final /* synthetic */ AnonymousClass5ZF A01;

    public C89054bP(AnonymousClass5ZF r1, C620733j r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public int A0C() {
        return this.A01.A0T.length;
    }

    public /* bridge */ /* synthetic */ Object A0H(ViewGroup viewGroup, int i) {
        Log.d("EmojiPicker/instantiate start");
        AnonymousClass5ZF r4 = this.A01;
        View A0H = C18310x6.A0H(r4.A0B, R.layout.f8nameremoved);
        AbsListView absListView = (AbsListView) C86664Kz.A0i(A0H);
        C620733j r6 = this.A00;
        if (!C620733j.A04(r6)) {
            i = (r4.A0T.length - 1) - i;
        }
        AnonymousClass4OW[] r5 = r4.A0T;
        if (r5[i] == null) {
            r5[i] = new AnonymousClass4OW(r4.A09, r4, r6, i);
        }
        absListView.setAdapter(r5[i]);
        absListView.setEmptyView(A0H.findViewById(16908292));
        absListView.setTag(Integer.valueOf(i));
        if (i == r4.A00) {
            absListView.setOnScrollListener(r4.A0I);
        }
        viewGroup.addView(A0H, 0);
        return A0H;
    }

    public /* bridge */ /* synthetic */ void A0I(ViewGroup viewGroup, Object obj, int i) {
        View view = (View) obj;
        viewGroup.removeView(view);
        ((AbsListView) C86664Kz.A0i(view)).setOnScrollListener((AbsListView.OnScrollListener) null);
    }

    public /* bridge */ /* synthetic */ boolean A0K(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }
}
