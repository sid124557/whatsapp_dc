package X;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView;

/* renamed from: X.5RH  reason: invalid class name */
public class AnonymousClass5RH {
    public View A00;
    public ViewGroup A01;
    public ListView A02;
    public TextView A03;
    public C71733ca A04;
    public ShimmerFrameLayout A05;
    public AnonymousClass5KX A06;
    public AnonymousClass5MV A07;
    public IcebreakerBubbleView A08;
    public AnonymousClass4ZC A09;
    public C95814uZ A0A;
    public C105895Wv A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public final int A0H;
    public final Activity A0I;
    public final TextWatcher A0J = new AnonymousClass68H(this, 6);
    public final C69263Wi A0K;
    public final C56492s4 A0L;
    public final C47892e0 A0M;
    public final AnonymousClass4UA A0N;
    public final C105845Wq A0O;
    public final C104175Py A0P;
    public final AnonymousClass5GD A0Q;
    public final C104565Rl A0R;
    public final C106685Zz A0S;
    public final C56072rN A0T;
    public final boolean A0U;

    public void A00() {
        View view;
        int i;
        if (this.A0E) {
            int i2 = this.A0H;
            if (i2 == 2) {
                C86644Kx.A0w(this.A09);
                view = this.A06.A05.A01;
                i = 0;
            } else {
                view = this.A08;
                C626936e.A04(view);
                i = 8;
            }
            view.setVisibility(i);
            if (this.A0E) {
                this.A0E = false;
                if (i2 == 2) {
                    this.A01.removeView(this.A00);
                    this.A01.removeView(this.A09);
                    this.A03.removeTextChangedListener(this.A0J);
                }
            }
        }
    }

    public boolean A01() {
        if (this.A0E && this.A0H == 2) {
            AnonymousClass4ZC r2 = this.A09;
            C626936e.A04(r2);
            for (int i = 0; i < this.A01.getChildCount(); i++) {
                if (this.A01.getChildAt(i) == r2 && r2.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass5RH(Activity activity, C69263Wi r5, C56492s4 r6, C47892e0 r7, AnonymousClass4UA r8, C105845Wq r9, C104175Py r10, AnonymousClass5GD r11, C104565Rl r12, C106685Zz r13, C56072rN r14, C105895Wv r15) {
        this.A0B = r15;
        this.A0I = activity;
        this.A0K = r5;
        this.A0E = false;
        this.A0S = r13;
        this.A0L = r6;
        this.A0Q = r11;
        this.A0T = r14;
        this.A0O = r9;
        this.A0P = r10;
        this.A0N = r8;
        this.A0G = R.id.icebreaker_container;
        AnonymousClass1VX r1 = r11.A00;
        this.A0U = r1.A0X(863);
        this.A0H = C18280x3.A00(r1.A0X(1293) ? 1 : 0);
        this.A0R = r12;
        this.A0M = r7;
    }
}
