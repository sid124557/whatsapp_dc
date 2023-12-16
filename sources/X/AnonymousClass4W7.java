package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.polls.PollResultsViewModel;

/* renamed from: X.4W7  reason: invalid class name */
public class AnonymousClass4W7 extends AnonymousClass09G {
    public final C101105Dm A00;
    public final C101115Dn A01;
    public final C101135Dp A02;
    public final C105365Uq A03;
    public final PollResultsViewModel A04;

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C64333Db r0 = this.A01.A00.A03;
            return new C125596Iq(inflate, C64333Db.A2o(r0), C64333Db.A3o(r0), C64333Db.A74(r0));
        } else if (i != 1) {
            LayoutInflater A0D = C18280x3.A0D(viewGroup);
            if (i != 2) {
                return new C125436Ia(A0D.inflate(R.layout.f8nameremoved, viewGroup, false), this.A04);
            }
            View inflate2 = A0D.inflate(R.layout.f8nameremoved, viewGroup, false);
            C101135Dp r02 = this.A02;
            C105365Uq r8 = this.A03;
            C64333Db r03 = r02.A00.A03;
            return new C88404Yp(inflate2, C64333Db.A06(r03), C64333Db.A26(r03), r8, C64333Db.A2p(r03), C64333Db.A2t(r03));
        } else {
            View inflate3 = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C64333Db r04 = this.A00.A00.A03;
            AnonymousClass5Y0 A3o = C64333Db.A3o(r04);
            return new C88394Yo(inflate3, C64333Db.A2o(r04), C64333Db.A2t(r04), A3o, C64333Db.A74(r04));
        }
    }

    public void BNf(C05570Ua r17, int i) {
        WaTextView waTextView;
        Context context;
        int i2;
        Object[] A0L;
        C105365Uq r2;
        AnonymousClass3ZH A0A;
        int i3;
        int i4;
        C05570Ua r5 = r17;
        int i5 = i;
        if (r5 instanceof C125596Iq) {
            C125596Iq r52 = (C125596Iq) r5;
            AnonymousClass8J8 r7 = (AnonymousClass8J8) A0K(i5);
            String str = r7.A02;
            if (str != null) {
                SpannableStringBuilder A002 = C18330xA.A00(str);
                C107635bd.A07(r52.A02, r52.A04, A002);
                WaTextView waTextView2 = r52.A00;
                waTextView2.setText(C107345b9.A03(waTextView2.getContext(), waTextView2.getPaint(), r52.A03, A002));
                if (!r7.A03 || (i4 = r7.A00) <= 1) {
                    r52.A01.setVisibility(8);
                    return;
                }
                waTextView = r52.A01;
                context = C86664Kz.A0T(r52);
                i2 = R.string.f11nameremoved;
                A0L = AnonymousClass002.A0M();
                AnonymousClass000.A1L(A0L, r7.A01);
                AnonymousClass000.A1P(A0L, i4, 1);
            } else {
                return;
            }
        } else if ((r5 instanceof C88394Yo) && (A0K(i5) instanceof AnonymousClass8JA)) {
            C88394Yo r53 = (C88394Yo) r5;
            AnonymousClass8JA r11 = (AnonymousClass8JA) A0K(i5);
            String str2 = r11.A03;
            SpannableStringBuilder A003 = C18330xA.A00(str2);
            C107635bd.A07(r53.A06, r53.A09, A003);
            WaTextView waTextView3 = r53.A05;
            waTextView3.setText(C107345b9.A03(waTextView3.getContext(), waTextView3.getPaint(), r53.A08, A003));
            WaTextView waTextView4 = r53.A04;
            C620733j r8 = r53.A07;
            int i6 = r11.A00;
            long j = (long) i6;
            Integer valueOf = Integer.valueOf(i6);
            waTextView4.setText(r8.A0L(new Object[]{valueOf}, R.plurals.f9nameremoved, j));
            LinearLayout linearLayout = r53.A01;
            Resources resources = linearLayout.getResources();
            boolean z = r11.A05;
            if (z) {
                i3 = AnonymousClass5Yj.A07(linearLayout);
            } else {
                i3 = R.color.f5nameremoved;
            }
            waTextView4.setTextColor(C06400Xn.A00((Resources.Theme) null, resources, i3));
            int i7 = 8;
            r53.A03.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
            Resources resources2 = linearLayout.getResources();
            int i8 = R.drawable.poll_results_option_count_rounded_corner_non_winner;
            if (z) {
                i8 = R.drawable.poll_results_option_count_rounded_corner_winner;
            }
            linearLayout.setBackground(C02680He.A00((Resources.Theme) null, resources2, i8));
            View view = r53.A00;
            if (!r11.A04) {
                i7 = 0;
            }
            view.setVisibility(i7);
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass0x2.A1N(A0o, str2);
            r53.A02.setContentDescription(AnonymousClass000.A0X(r8.A0L(new Object[]{valueOf}, R.plurals.f9nameremoved, j), A0o));
            return;
        } else if ((r5 instanceof C88404Yp) && (A0K(i5) instanceof AnonymousClass8J9)) {
            C88404Yp r54 = (C88404Yp) r5;
            AnonymousClass8J9 r82 = (AnonymousClass8J9) A0K(i5);
            WaTextView waTextView5 = r54.A03;
            String str3 = r82.A00;
            waTextView5.setText(str3);
            WaTextView waTextView6 = r54.A04;
            String str4 = r82.A01;
            waTextView6.setText(str4);
            CharSequence A004 = C107565bW.A00(r54.A08, r54.A09, r82.A02);
            r54.A05.setText(A004);
            C30591mh r22 = r82.A03;
            WaImageView waImageView = r54.A02;
            waImageView.setVisibility(0);
            AnonymousClass2z0 r1 = r22.A1J;
            if (r1.A02) {
                C56972sr r12 = r54.A01;
                if (C56972sr.A01(r12) != null) {
                    r2 = r54.A07;
                    A0A = C56972sr.A01(r12);
                }
                View view2 = r54.A00;
                Resources A0G = C18290x4.A0G(r54.A0H);
                Object[] A1X = AnonymousClass0x9.A1X();
                C18260x0.A0i(str3, str4, A004, A1X);
                view2.setContentDescription(A0G.getString(R.string.f11nameremoved, A1X));
                return;
            }
            C95814uZ r13 = r1.A00;
            if (C627336j.A0K(r13)) {
                r13 = r22.A0n();
            }
            C626936e.A06(r13);
            r2 = r54.A07;
            A0A = r54.A06.A0A(r13);
            r2.A08(waImageView, A0A);
            View view22 = r54.A00;
            Resources A0G2 = C18290x4.A0G(r54.A0H);
            Object[] A1X2 = AnonymousClass0x9.A1X();
            C18260x0.A0i(str3, str4, A004, A1X2);
            view22.setContentDescription(A0G2.getString(R.string.f11nameremoved, A1X2));
            return;
        } else if ((r5 instanceof C125436Ia) && (A0K(i5) instanceof AnonymousClass8J7)) {
            C125436Ia r55 = (C125436Ia) r5;
            AnonymousClass8J7 r23 = (AnonymousClass8J7) A0K(i5);
            r55.A00 = r23.A01;
            waTextView = r55.A01;
            context = waTextView.getContext();
            i2 = R.string.f11nameremoved;
            A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L, r23.A00);
        } else {
            return;
        }
        AnonymousClass001.A0y(context, waTextView, A0L, i2);
    }

    public AnonymousClass4W7(AnonymousClass0O4 r1, C101105Dm r2, C101115Dn r3, C101135Dp r4, C105365Uq r5, PollResultsViewModel pollResultsViewModel) {
        super(r1);
        this.A04 = pollResultsViewModel;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public int getItemViewType(int i) {
        return ((C185118t7) A0K(i)).BEN();
    }
}
