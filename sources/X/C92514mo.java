package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mo  reason: invalid class name and case insensitive filesystem */
public final class C92514mo extends C93314oJ {
    public View A00;
    public View A01;
    public View A02;
    public List A03;
    public boolean A04;
    public final Drawable A05;
    public final C182208o2 A06;
    public final C182218o3 A07;
    public final C182228o4 A08;
    public final C182238o5 A09;

    public Drawable A10(int i, int i2, boolean z) {
        if (i == 1) {
            return this.A05;
        }
        Drawable A10 = super.A10(i, i2, z);
        C162457s7.A0D(A10);
        return A10;
    }

    public void A0v() {
        if (!this.A04) {
            this.A04 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A, r2, this);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public C92514mo(Context context, C182208o2 r10, C182218o3 r11, C182228o4 r12, C182238o5 r13, AnonymousClass677 r14, C31871oz r15) {
        super(context, r14, r15);
        List list;
        View view;
        View view2;
        A0v();
        this.A08 = r12;
        this.A09 = r13;
        this.A06 = r10;
        this.A07 = r11;
        Drawable A0G = C18310x6.A0G(context, R.drawable.balloon_centered_no_padding_normal);
        C162457s7.A0D(A0G);
        this.A05 = A0G;
        setClickable(false);
        this.A2M = true;
        this.A2Q = false;
        View view3 = null;
        setOnClickListener((View.OnClickListener) null);
        ViewGroup A0J = C86644Kx.A0J(this, R.id.contextCardLayout);
        C162457s7.A0H(A0J);
        if (this.A01 == null) {
            C182228o4 r2 = this.A08;
            LinearLayout.LayoutParams layoutParams = null;
            if (r2 != null) {
                view2 = (View) r2;
            } else {
                view2 = null;
            }
            this.A01 = view2;
            A0J.addView(view2, r2 != null ? r2.getHeaderLayoutParams() : layoutParams);
        }
        if (this.A02 == null) {
            C182238o5 r22 = this.A09;
            LinearLayout.LayoutParams layoutParams2 = null;
            if (r22 != null) {
                view = (View) r22;
            } else {
                view = null;
            }
            this.A02 = view;
            A0J.addView(view, r22 != null ? r22.getTitleViewLayoutParams() : layoutParams2);
        }
        if (this.A00 == null) {
            C182208o2 r0 = this.A06;
            LinearLayout.LayoutParams layoutParams3 = null;
            this.A00 = r0 != null ? (View) r0 : view3;
            layoutParams3 = r0 != null ? r0.getBodyViewLayoutParams() : layoutParams3;
            View view4 = this.A00;
            if (!(view4 == null || layoutParams3 == null)) {
                A0J.addView(view4, layoutParams3);
            }
        }
        if (this.A03 == null) {
            C182218o3 r02 = this.A07;
            if (r02 != null) {
                list = r02.getCTAViews();
            } else {
                list = null;
            }
            this.A03 = list;
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        throw C18280x3.A0X();
                    }
                    View view5 = (View) next;
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, A0J.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                    layoutParams4.gravity = 17;
                    if (i == 0) {
                        layoutParams4.topMargin = A0J.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    }
                    A0J.addView(view5, layoutParams4);
                    i = i2;
                }
            }
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
