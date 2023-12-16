package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.53d  reason: invalid class name and case insensitive filesystem */
public final class C987653d extends C88504Yz {
    public LinearLayoutManager A00 = new LinearLayoutManager(0);
    public AnonymousClass531 A01;
    public final WfalManager A02;
    public final ObservableRecyclerView A03;
    public final AnonymousClass5RX A04;
    public final UpdatesFragment A05;
    public final AnonymousClass5L2 A06;
    public final C56042rK A07;
    public final AnonymousClass5YA A08;
    public final C104745Se A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C;
    public final AnonymousClass66R A0D;
    public final AnonymousClass66R A0E;

    public final void A0A(boolean z) {
        C109755f8 r0;
        C109755f8 r02;
        AnonymousClass5L2 r9 = this.A06;
        AnonymousClass66R r3 = this.A0B;
        View A0H = C86644Kx.A0H(r3);
        ImageView A0J = C86604Kt.A0J(C86644Kx.A0H(r3), R.id.crosspost_fb_icon);
        ImageView A0J2 = C86604Kt.A0J(C86644Kx.A0H(r3), R.id.crosspost_ig_icon);
        View A0E2 = C18280x3.A0E(C86644Kx.A0H(r3), R.id.status_row_share_to_third_party_icon);
        C18260x0.A0V(A0H, A0J, A0J2);
        AnonymousClass5X4 r4 = r9.A06;
        if (z) {
            C104735Sd r32 = r9.A02;
            if (r32 == null) {
                throw C18270x1.A0S("currentShareViewStateV2");
            }
            AnonymousClass59Q r10 = r32.A00;
            boolean z2 = r10.isEnabled;
            A0J.setEnabled(z2);
            Context context = A0J.getContext();
            int i = R.color.f5nameremoved;
            if (z2) {
                i = R.color.f5nameremoved;
            }
            int A042 = AnonymousClass0Y8.A04(context, i);
            AnonymousClass0FH r92 = AnonymousClass0FH.SRC_ATOP;
            A0J.setColorFilter(C02710Hh.A00(r92, A042));
            boolean z3 = r10.isEnabled;
            AnonymousClass223 r1 = AnonymousClass223.FACEBOOK;
            if (z3) {
                r0 = new C109755f8(r1, r4);
            } else {
                r0 = null;
            }
            A0J.setOnClickListener(r0);
            AnonymousClass59Q r33 = r32.A01;
            boolean z4 = r33.isEnabled;
            A0J2.setEnabled(z4);
            Context context2 = A0J2.getContext();
            int i2 = R.color.f5nameremoved;
            if (z4) {
                i2 = R.color.f5nameremoved;
            }
            A0J2.setColorFilter(C02710Hh.A00(r92, AnonymousClass0Y8.A04(context2, i2)));
            boolean z5 = r33.isEnabled;
            AnonymousClass223 r12 = AnonymousClass223.INSTAGRAM;
            if (z5) {
                r02 = new C109755f8(r12, r4);
            } else {
                r02 = null;
            }
            A0J2.setOnClickListener(r02);
            C18320x8.A14(A0E2, r4, 16);
            WeakReference weakReference = AnonymousClass5X4.A05;
            if (weakReference == null || weakReference.get() != A0H) {
                AnonymousClass5X4.A05 = AnonymousClass0x9.A14(A0H);
                int visibility = A0H.getVisibility();
                int i3 = A0H.getLayoutParams().height;
                C86604Kt.A1C(A0H, C86604Kt.A03(A0H), Integer.MIN_VALUE);
                AnonymousClass5X4.A04 = A0H.getMeasuredHeight();
                A0H.setVisibility(visibility);
                C86624Kv.A0w(A0H, i3);
            }
            r4.A01(new AnonymousClass67L(A0H, 31), A0H, 0, AnonymousClass5X4.A04);
        } else if (A0H.getVisibility() == 8) {
            r4.A00();
        } else {
            r4.A01(new AnonymousClass67L(A0H, 30), A0H, A0H.getHeight(), 0);
        }
    }

    public final void A08(C104715Sb r8, boolean z) {
        AnonymousClass66R r3 = this.A0A;
        View A0H = C86644Kx.A0H(r3);
        C109395eY.A00(A0H, this, 21);
        C109395eY.A00(C18280x3.A0E(A0H, R.id.close), this, 22);
        if (r8.A01) {
            AnonymousClass5RX r5 = this.A04;
            View A0H2 = C86644Kx.A0H(r3);
            C162457s7.A0J(A0H2, 0);
            if (A0H2.getVisibility() == 0 && A0H2.getHeight() == AnonymousClass5RX.A01) {
                r5.A00();
                return;
            }
            WeakReference weakReference = AnonymousClass5RX.A02;
            if (weakReference == null || weakReference.get() != A0H2) {
                AnonymousClass5RX.A02 = AnonymousClass0x9.A14(A0H2);
                int visibility = A0H2.getVisibility();
                int i = A0H2.getLayoutParams().height;
                C86604Kt.A1C(A0H2, C86604Kt.A03(A0H2), Integer.MIN_VALUE);
                AnonymousClass5RX.A01 = A0H2.getMeasuredHeight();
                A0H2.setVisibility(visibility);
                C86624Kv.A0w(A0H2, i);
            }
            int i2 = AnonymousClass5RX.A01;
            AnonymousClass67L r0 = new AnonymousClass67L(A0H2, 23);
            r5.A00();
            ValueAnimator A062 = C86604Kt.A06(0, i2);
            r5.A00 = A062;
            if (A062 != null) {
                C86604Kt.A0v(r0, A062);
                A062.setStartDelay(C86654Ky.A07(A062, A0H2, 1, z ? 1 : 0));
                A062.start();
                return;
            }
            return;
        }
        this.A04.A01(C86644Kx.A0H(r3), r8.A00);
    }

    public final void A09(C104715Sb r5, boolean z) {
        boolean z2;
        AnonymousClass5YA r2;
        View A0H;
        int i;
        AnonymousClass66R r0;
        AnonymousClass1VX r22 = this.A09.A01;
        C58422vE r1 = C58422vE.A01;
        if (r22.A0Y(r1, 6759)) {
            z2 = r5.A01;
            r2 = this.A08;
            A0H = C86644Kx.A0H(this.A0D);
            i = 5;
        } else {
            if (r22.A0Y(r1, 6456)) {
                z2 = r5.A01;
                A00(this.A0E);
                r2 = this.A08;
                r0 = this.A0A;
            } else {
                boolean A052 = this.A07.A05(AnonymousClass21S.A04);
                z2 = r5.A01;
                if (!A052) {
                    A00(this.A0C);
                    r2 = this.A08;
                    r0 = this.A0E;
                } else {
                    A00(this.A0E);
                    r2 = this.A08;
                    A0H = C86644Kx.A0H(this.A0C);
                    i = 1;
                }
            }
            A0H = C86644Kx.A0H(r0);
            i = 2;
        }
        r2.A04(A0H, i, z2, z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C987653d(View view, WfalManager wfalManager, C620733j r6, AnonymousClass5RX r7, C115155oD r8, UpdatesFragment updatesFragment, C87954Wt r10, AnonymousClass5L2 r11, C56042rK r12, AnonymousClass5YA r13, C104745Se r14) {
        super(view);
        C18260x0.A0f(r6, r8, r14, wfalManager, r13);
        C18260x0.A0W(r11, r7, r12);
        C162457s7.A0J(view, 10);
        this.A09 = r14;
        this.A02 = wfalManager;
        this.A08 = r13;
        this.A06 = r11;
        this.A04 = r7;
        this.A07 = r12;
        this.A05 = updatesFragment;
        view.getContext();
        ObservableRecyclerView observableRecyclerView = (ObservableRecyclerView) view.findViewById(R.id.status_list);
        this.A03 = observableRecyclerView;
        this.A0A = C154517dI.A01(new C120405yX(this));
        this.A0C = C154517dI.A01(new C120425yZ(this));
        this.A0E = C154517dI.A01(new C120445yb(this));
        this.A0D = C154517dI.A01(new C120435ya(this));
        this.A0B = C154517dI.A01(new C120415yY(this));
        observableRecyclerView.setLayoutDirection(C102805Ki.A00(r6) ? 1 : 0);
        observableRecyclerView.setLayoutManager(this.A00);
        observableRecyclerView.setAdapter(r10);
        observableRecyclerView.setItemAnimator((AnonymousClass0UY) null);
        this.A03.A0q(new C88024Xa(this));
        observableRecyclerView.A01.A02(r8);
        observableRecyclerView.A00.A02(r8);
    }

    public static void A00(AnonymousClass66R r1) {
        if (r1.BHk() && ((View) r1.getValue()).getVisibility() == 0) {
            ((View) r1.getValue()).setVisibility(8);
        }
    }
}
