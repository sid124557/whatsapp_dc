package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.5Ub  reason: invalid class name and case insensitive filesystem */
public class C105225Ub {
    public int A00;
    public View.OnClickListener A01 = new C109745f7(this, 31);
    public SearchView A02;
    public final Activity A03;
    public final View A04;
    public final C16510tW A05;
    public final Toolbar A06;
    public final C620733j A07;

    public void A00(Bundle bundle) {
        if (this.A02 != null && C86604Kt.A1Y(this.A04)) {
            bundle.putCharSequence("search_text", this.A02.A0k.getText());
            bundle.putInt("search_button_x_pos", this.A00);
        }
    }

    public void A01(boolean z) {
        int i;
        View view = this.A04;
        if (C86604Kt.A1Y(view)) {
            this.A02.A0H("");
            this.A06.setVisibility(0);
            if (!view.isAttachedToWindow() || !z) {
                this.A02.A08();
                view.setVisibility(4);
            } else {
                int i2 = this.A00;
                int width = view.getWidth();
                int i3 = this.A00;
                int A0C = AnonymousClass001.A0C(width, i3, i2);
                if (i3 == 0) {
                    this.A00 = C86664Kz.A0B(view);
                }
                if (C620733j.A04(this.A07)) {
                    i = view.getWidth() - this.A00;
                } else {
                    i = this.A00;
                }
                AnonymousClass67L.A00(C86654Ky.A0A(view, i, C86654Ky.A04(view), (float) A0C, 0.0f), this, 18);
            }
            Activity activity = this.A03;
            C107405bG.A0C(activity.getWindow(), false);
            C107405bG.A04(activity);
        }
    }

    public void A02(boolean z) {
        int A0E;
        int i;
        int i2;
        View view = this.A04;
        if (!C86604Kt.A1Y(view)) {
            if (this.A02 == null) {
                int i3 = R.drawable.search_background;
                if (z) {
                    i3 = R.drawable.search_background_bottom_sheet;
                }
                view.setBackgroundResource(i3);
                Activity activity = this.A03;
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                if (this instanceof C97904zS) {
                    i2 = R.layout.f8nameremoved;
                } else {
                    i2 = R.layout.f8nameremoved;
                }
                layoutInflater.inflate(i2, (ViewGroup) view, true);
                SearchView searchView = (SearchView) C06560Yg.A02(view, R.id.search_view);
                this.A02 = searchView;
                TextView A0G = C18300x5.A0G(searchView, R.id.search_src_text);
                AnonymousClass5Yj.A0B(activity, A0G, R.attr.f3nameremoved, R.color.f5nameremoved);
                A0G.setHintTextColor(AnonymousClass0Y8.A04(activity, R.color.f5nameremoved));
                this.A02.setIconifiedByDefault(false);
                this.A02.setQueryHint(activity.getString(R.string.f11nameremoved));
                SearchView searchView2 = this.A02;
                searchView2.A0B = this.A05;
                AnonymousClass0x9.A0F(searchView2, R.id.search_mag_icon).setImageDrawable(new AnonymousClass6DC(AnonymousClass0RP.A00(activity, R.drawable.ic_back), this));
                ImageView A0F = AnonymousClass0x9.A0F(view, R.id.search_back);
                SearchView searchView3 = this.A02;
                if (!(searchView3 == null || searchView3.getContext() == null)) {
                    C86614Ku.A1B(C107335b8.A04(this.A02.getContext(), R.drawable.ic_back, R.color.f5nameremoved), A0F, this.A07);
                }
                A0F.setOnClickListener(new C109745f7(this, 30));
            }
            if (this instanceof C97904zS) {
                C97904zS r7 = (C97904zS) this;
                Activity activity2 = r7.A07;
                C97904zS.A0G = activity2.getString(R.string.f11nameremoved);
                C97904zS.A0H = "";
                C97904zS.A0F = "";
                View view2 = r7.A08;
                r7.A04 = C18300x5.A0G(view2, R.id.search_hint_fade_in);
                r7.A05 = C18300x5.A0G(view2, R.id.search_hint_fade_out);
                SearchView searchView4 = (SearchView) C06560Yg.A02(view2, R.id.search_view);
                r7.A06 = searchView4;
                if (TextUtils.equals(searchView4.getQueryHint(), activity2.getString(R.string.f11nameremoved))) {
                    r7.A06.setQueryHint("");
                }
                AnonymousClass0x2.A0q(activity2, r7.A04, R.color.f5nameremoved);
                AnonymousClass0x2.A0q(activity2, r7.A05, R.color.f5nameremoved);
                r7.A04.setHint("");
                r7.A05.setHint("");
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r7.A05, "translationY", new float[]{0.0f, 50.0f});
                r7.A03 = ofFloat;
                ofFloat.setDuration(300);
                r7.A03.setStartDelay(700);
                AnonymousClass67L.A01(r7.A03, r7, 4);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r7.A04, "translationY", new float[]{-50.0f, 0.0f});
                r7.A01 = ofFloat2;
                ofFloat2.setDuration(300);
                r7.A01.setStartDelay(700);
                AnonymousClass67L.A01(r7.A01, r7, 5);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r7.A04, "alpha", new float[]{0.0f, 1.0f});
                r7.A00 = ofFloat3;
                ofFloat3.setInterpolator(r7.A09);
                r7.A00.setDuration(300);
                r7.A00.setStartDelay(700);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r7.A05, "alpha", new float[]{1.0f, 0.0f});
                r7.A02 = ofFloat4;
                ofFloat4.setInterpolator(r7.A0A);
                r7.A02.setDuration(300);
                r7.A02.setStartDelay(700);
            }
            view.setVisibility(0);
            if (view.isAttachedToWindow()) {
                View findViewById = this.A06.findViewById(R.id.menuitem_search);
                if (findViewById != null) {
                    int[] iArr = new int[2];
                    findViewById.getLocationInWindow(iArr);
                    if (C620733j.A04(this.A07)) {
                        A0E = (view.getWidth() - iArr[0]) - C86664Kz.A0E(findViewById, 2);
                    } else {
                        A0E = iArr[0] + C86664Kz.A0E(findViewById, 2);
                    }
                } else {
                    A0E = C86664Kz.A0E(view, 2);
                }
                this.A00 = A0E;
                int A0C = AnonymousClass001.A0C(view.getWidth(), this.A00, A0E);
                if (C620733j.A04(this.A07)) {
                    i = view.getWidth() - this.A00;
                } else {
                    i = this.A00;
                }
                AnonymousClass67L.A00(C86654Ky.A0A(view, i, view.getHeight() / 2, 0.0f, (float) A0C), this, 17);
            }
            boolean A022 = C107385bE.A02();
            Activity activity3 = this.A03;
            if (A022) {
                C107405bG.A05(activity3);
            } else {
                C86634Kw.A13(activity3, activity3.getWindow(), R.color.f5nameremoved);
            }
        }
    }

    public boolean A03() {
        return C86604Kt.A1Y(this.A04);
    }

    public C105225Ub(Activity activity, View view, C16510tW r5, Toolbar toolbar, C620733j r7) {
        this.A03 = activity;
        this.A07 = r7;
        this.A04 = view;
        this.A06 = toolbar;
        this.A05 = r5;
    }
}
