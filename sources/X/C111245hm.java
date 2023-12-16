package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.Iterator;

/* renamed from: X.5hm  reason: invalid class name and case insensitive filesystem */
public class C111245hm implements C184998st {
    public static int A07 = 1;
    public static int A08 = 2;
    public static int A09 = 3;
    public static int A0A = -1;
    public static int A0B = -1;
    public static boolean A0C;
    public View A00;
    public final AnonymousClass4Pc A01;
    public final AnonymousClass314 A02;
    public final C56612sH A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass2WP A06;

    public final View A00() {
        ViewGroup.MarginLayoutParams layoutParams;
        if (this.A00 == null) {
            AnonymousClass4Pc r3 = this.A01;
            LayoutInflater A0D = C18280x3.A0D(r3);
            if (A0C) {
                WDSBanner wDSBanner = (WDSBanner) A0D.inflate(R.layout.f8nameremoved, r3, false);
                if (!C1001059l.A03) {
                    int dimensionPixelSize = C18290x4.A0G(r3).getDimensionPixelSize(R.dimen.f6nameremoved);
                    if (wDSBanner.getLayoutParams() != null) {
                        layoutParams = AnonymousClass001.A0T(wDSBanner);
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    layoutParams.setMargins(layoutParams.leftMargin, dimensionPixelSize, layoutParams.rightMargin, dimensionPixelSize);
                    wDSBanner.requestLayout();
                }
                wDSBanner.setOnDismissListener((AnonymousClass4GP) new AnonymousClass6C0(this, 0));
                C86604Kt.A0z(r3.getContext(), r3, R.color.f5nameremoved);
                this.A00 = wDSBanner;
            } else {
                View inflate = A0D.inflate(R.layout.f8nameremoved, r3, false);
                this.A00 = inflate;
                C18320x8.A15(C06560Yg.A02(inflate, R.id.dismiss_groups_banner_container), this, 13);
                AnonymousClass5Yj.A0A(r3.getContext(), r3, R.attr.f3nameremoved, R.color.f5nameremoved);
            }
        }
        return this.A00;
    }

    public final void A01() {
        this.A05.BhB(new C23871Vf());
        this.A01.A01(1, 3);
        AnonymousClass33p r5 = this.A04;
        C18270x1.A0h(C18270x1.A03(r5), "education_banner_count", A08);
        BFb();
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r5), "create_group_tip_count") + 1;
        C18270x1.A0i(C18270x1.A03(r5).putInt("create_group_tip_count", A022), "create_group_tip_time", this.A03.A0H());
    }

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        AnonymousClass33p r3 = this.A04;
        C183538qC r8 = r3.A01;
        int A022 = C18280x3.A02(C18300x5.A0B(r8), "create_group_tip_count");
        long A0B2 = AnonymousClass0x2.A0B(C18300x5.A0B(r8), "create_group_tip_time");
        AnonymousClass314 r5 = this.A02;
        if ((A0B <= 0 || C18300x5.A0B(r8).getInt("groups_banner_total_day_count", 0) <= A0B) && (A0A <= 0 || C18300x5.A0B(r8).getInt("groups_banner_click_count", 0) < A0A)) {
            r5.A02.A0G();
            AnonymousClass3ZV r2 = r5.A01;
            synchronized (r2) {
                Iterator it = r2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C627336j.A0K(((C51482jt) it.next()).A01)) {
                            break;
                        }
                    } else if (r5.A02() < A09 || A022 >= A07 || A0B2 + 2592000000L >= this.A03.A0H() || !AnonymousClass4Pc.A00(r3)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void BrS() {
        if (this.A00 == null) {
            this.A01.addView(A00());
        }
        AnonymousClass4Pc r1 = this.A01;
        C18320x8.A15(r1, this, 12);
        r1.A01(1, 1);
        AnonymousClass33p r5 = this.A04;
        if (r5.A2P("education_banner_timestamp", 86400000)) {
            C183538qC r3 = r5.A01;
            C18260x0.A0L(r5, "education_banner_count", C86664Kz.A08(C18300x5.A0B(r3), "education_banner_count", 0));
            C18260x0.A0L(r5, "groups_banner_total_day_count", C86664Kz.A08(C18300x5.A0B(r3), "groups_banner_total_day_count", 0));
            r5.A1Y("education_banner_timestamp");
        }
        A00().setVisibility(0);
    }

    public C111245hm(AnonymousClass4Pc r2, AnonymousClass314 r3, C56612sH r4, AnonymousClass33p r5, AnonymousClass1VX r6, AnonymousClass4FV r7, AnonymousClass2WP r8) {
        this.A03 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        A07 = r6.A0N(354);
        A08 = r6.A0N(351);
        A09 = r6.A0N(350);
        A0B = r6.A0N(352);
        A0A = r6.A0N(353);
        A0C = C106545Zk.A02(r6);
    }
}
