package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.4Tb  reason: invalid class name and case insensitive filesystem */
public class C87474Tb extends AnonymousClass0AZ implements C181598n1 {
    public final int A00;
    public final AnonymousClass5KQ[] A01;
    public final /* synthetic */ HomeActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87474Tb(C08270df r2, HomeActivity homeActivity) {
        super(r2, 0);
        this.A02 = homeActivity;
        int size = HomeActivity.A2Z.size();
        this.A00 = size;
        this.A01 = new AnonymousClass5KQ[size];
    }

    public CharSequence A04(int i) {
        return A0J(this.A02.A7L(i));
    }

    public int A0C() {
        return this.A00;
    }

    public long A0G(int i) {
        return (long) this.A02.A7L(i);
    }

    public C08310eF A0H(int i) {
        AnonymousClass4C1 r0;
        HomeActivity homeActivity = this.A02;
        int A7L = homeActivity.A7L(i);
        if (A7L == 200) {
            return new ConversationsFragment();
        }
        if (!(A7L == 300 || A7L == 400)) {
            if (A7L != 600) {
                if (!(A7L == 700 || A7L == 800)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("The item position should be less or equal to:");
                    throw AnonymousClass001.A0c(AnonymousClass000.A0h(A0o, this.A00));
                }
            } else if (homeActivity.A1H.A01()) {
                r0 = (AnonymousClass4C1) AnonymousClass001.A0i(homeActivity.A2C, A7L);
                if (r0 == null) {
                    throw C86604Kt.A0h("No HomeFragment mapping for community tab id: ", AnonymousClass001.A0o(), A7L);
                }
                return (C08310eF) r0.get();
            } else {
                throw AnonymousClass001.A0e("Invalid tab id: 600");
            }
        }
        r0 = (AnonymousClass4C1) AnonymousClass001.A0i(homeActivity.A2C, A7L);
        if (r0 == null) {
            throw C86604Kt.A0h("No HomeFragment mapping for tab id: ", AnonymousClass001.A0o(), A7L);
        }
        return (C08310eF) r0.get();
    }

    public final AnonymousClass5KQ A0I(int i) {
        ImageView imageView;
        ColorStateList valueOf;
        AnonymousClass5KQ[] r5 = this.A01;
        if (r5[i] == null) {
            AnonymousClass5KQ r4 = new AnonymousClass5KQ();
            HomeActivity homeActivity = this.A02;
            View inflate = homeActivity.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
            r4.A01 = inflate;
            r4.A06 = C18300x5.A0G(inflate, R.id.tab);
            r4.A05 = C18300x5.A0G(r4.A01, R.id.badge);
            r4.A04 = AnonymousClass0x9.A0E(r4.A01, R.id.icon);
            r4.A02 = C86644Kx.A0I(r4.A01, R.id.tab_container);
            r4.A06.setText(A04(i));
            r4.A06.setContentDescription(A04(i));
            if (i != HomeActivity.A0C(400)) {
                C86644Kx.A0l(homeActivity, r4.A04, R.color.f5nameremoved);
            }
            if (i == HomeActivity.A0C(300)) {
                r4.A04.setImageDrawable(AnonymousClass0RP.A00(homeActivity, R.drawable.new_status_indicator).mutate());
                C107555bV.A05(r4.A04, homeActivity.A00, homeActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0);
            } else if (i == HomeActivity.A0C(400)) {
                C107555bV.A05(r4.A04, homeActivity.A00, homeActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0);
                if (Build.VERSION.SDK_INT > 21) {
                    AnonymousClass0AR A04 = AnonymousClass0AR.A04(homeActivity, R.drawable.ic_calls_tab_joinable_badge_flash);
                    homeActivity.A0Q = A04;
                    r4.A04.setImageDrawable(A04);
                } else {
                    r4.A04.setImageResource(R.drawable.vec_ic_calls_tab_joinable_badge);
                }
            } else if (homeActivity.A1H.A01() && i == HomeActivity.A0C(600)) {
                boolean z = C1001059l.A03;
                int i2 = R.drawable.vec_ic_community_tab;
                if (z) {
                    i2 = R.drawable.vec_ic_community_wds;
                }
                AnonymousClass0AQ A03 = AnonymousClass0AQ.A03((Resources.Theme) null, homeActivity.getResources(), i2);
                C107555bV.A05(r4.A04, homeActivity.A00, 0, 0);
                C107235av.A04(r4.A02, homeActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), homeActivity.A7K());
                r4.A06.setVisibility(8);
                r4.A04.setVisibility(0);
                r4.A04.setImageDrawable(A03);
                C18300x5.A13(homeActivity, r4.A04, R.string.f11nameremoved);
                if (C1001059l.A03) {
                    AnonymousClass5UY A0M = AnonymousClass0x2.A0M(r4.A01, R.id.icon_badge);
                    if (A0M.A03() != 0) {
                        ImageView imageView2 = (ImageView) AnonymousClass5UY.A00(A0M, 0);
                        r4.A03 = imageView2;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                    }
                    int dimensionPixelSize = homeActivity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                    r4.A04.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
            }
            if (C1001059l.A03) {
                int A032 = C18300x5.A03(homeActivity, R.attr.f3nameremoved, R.color.f5nameremoved);
                int A033 = C18300x5.A03(homeActivity, R.attr.f3nameremoved, R.color.f5nameremoved);
                r4.A06.setTextColor(A032);
                if (i == HomeActivity.A0C(300)) {
                    imageView = r4.A04;
                    valueOf = ColorStateList.valueOf(A033);
                } else {
                    if (i != HomeActivity.A0C(400)) {
                        imageView = r4.A04;
                        valueOf = ColorStateList.valueOf(A032);
                    }
                    AnonymousClass5Yj.A0B(homeActivity, r4.A05, R.attr.f3nameremoved, R.color.f5nameremoved);
                }
                C05040Rr.A00(valueOf, imageView);
                AnonymousClass5Yj.A0B(homeActivity, r4.A05, R.attr.f3nameremoved, R.color.f5nameremoved);
            }
            r5[i] = r4;
        }
        return r5[i];
    }

    public CharSequence A0J(int i) {
        HomeActivity homeActivity;
        int i2;
        HomeActivity homeActivity2;
        int i3;
        if (i == 200) {
            homeActivity = this.A02;
            i2 = R.string.f11nameremoved;
        } else if (i == 300) {
            homeActivity = this.A02;
            boolean A1S = C18300x5.A1S((AnonymousClass5UP) homeActivity.A1t.get());
            i2 = R.string.f11nameremoved;
            if (A1S) {
                i2 = R.string.f11nameremoved;
            }
        } else if (i != 400) {
            if (i == 600) {
                homeActivity2 = this.A02;
                if (!homeActivity2.A7D().A08) {
                    return "";
                }
                i3 = R.string.f11nameremoved;
            } else if (i == 700) {
                homeActivity2 = this.A02;
                if (!homeActivity2.A7D().A08) {
                    return "";
                }
                i3 = R.string.f11nameremoved;
            } else if (i == 800) {
                homeActivity = this.A02;
                i2 = R.string.f11nameremoved;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("The item position should be less or equal to:");
                throw AnonymousClass001.A0c(AnonymousClass000.A0h(A0o, this.A00));
            }
            return homeActivity2.getString(i3);
        } else {
            homeActivity = this.A02;
            AnonymousClass58N r1 = homeActivity.A08;
            AnonymousClass58N r0 = AnonymousClass58N.RAIL;
            i2 = R.string.f11nameremoved;
            if (r1 == r0) {
                i2 = R.string.f11nameremoved;
            }
        }
        return homeActivity.getString(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r2.A7L(r5) == 700) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View BAT(int r5) {
        /*
            r4 = this;
            com.whatsapp.HomeActivity r2 = r4.A02
            com.whatsapp.PagerSlidingTabStrip r3 = r2.A05
            if (r3 == 0) goto L_0x001b
            int r1 = r2.A7L(r5)
            r0 = 600(0x258, float:8.41E-43)
            if (r1 == r0) goto L_0x0017
            int r2 = r2.A7L(r5)
            r1 = 700(0x2bc, float:9.81E-43)
            r0 = 1
            if (r2 != r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.setShouldExpand(r0)
        L_0x001b:
            X.5KQ r0 = r4.A0I(r5)
            android.view.View r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87474Tb.BAT(int):android.view.View");
    }
}
