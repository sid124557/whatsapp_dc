package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.5TV  reason: invalid class name */
public class AnonymousClass5TV {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public boolean A03;
    public final ViewStub A04;
    public final TextView A05;
    public final RecyclerView A06;
    public final C69263Wi A07;
    public final WaTextView A08;
    public final WfalManager A09;
    public final C54232oO A0A;
    public final C29301ib A0B;
    public final C64773Ex A0C;
    public final C56602sG A0D;
    public final C29421in A0E;
    public final AnonymousClass5ZU A0F;
    public final C105365Uq A0G;
    public final C56612sH A0H;
    public final C620733j A0I;
    public final C55702qm A0J;
    public final C29241iV A0K;
    public final C87834Wh A0L;
    public final C101885Gq A0M;
    public final AnonymousClass5H2 A0N;
    public final C104745Se A0O;
    public final Boolean A0P;
    public final Boolean A0Q;
    public final Runnable A0R = new C117635sF(this, 12);

    public final void A00() {
        C69263Wi r7 = this.A07;
        Runnable runnable = this.A0R;
        r7.A0R(runnable);
        C87834Wh r1 = this.A0L;
        if (r1.A00.size() > 0) {
            long j = 0;
            for (C102225Hy r0 : r1.A00) {
                long j2 = r0.A00;
                if (j2 > j) {
                    j = j2;
                }
            }
            r7.A0T(runnable, C107175ap.A01(j));
        }
    }

    public void A01(Boolean bool) {
        ImageView imageView = this.A01;
        if (imageView != null && bool != null) {
            if (this.A0O.A02() || this.A09.A02()) {
                imageView.setVisibility(AnonymousClass001.A08(bool.booleanValue() ? 1 : 0));
            }
        }
    }

    public void A02(Boolean bool) {
        ImageView imageView = this.A02;
        if (imageView != null && bool != null) {
            if (this.A0O.A02() || this.A09.A02()) {
                imageView.setVisibility(AnonymousClass001.A08(bool.booleanValue() ? 1 : 0));
            }
        }
    }

    public AnonymousClass5TV(ViewGroup viewGroup, C69263Wi r13, WfalManager wfalManager, C29301ib r15, C64773Ex r16, C29421in r17, AnonymousClass5ZU r18, C114015mM r19, C56612sH r20, AnonymousClass33p r21, C620733j r22, C29241iV r23, C101885Gq r24, AnonymousClass5H2 r25, C104745Se r26, Boolean bool, Boolean bool2) {
        AnonymousClass681 A002 = AnonymousClass681.A00(this, 44);
        this.A0D = A002;
        C1233167y r5 = new C1233167y(this, 17);
        this.A0A = r5;
        AnonymousClass687 r4 = new AnonymousClass687(this, 17);
        this.A0J = r4;
        this.A0H = r20;
        this.A07 = r13;
        C104745Se r2 = r26;
        this.A0O = r2;
        this.A0C = r16;
        this.A0F = r18;
        this.A0I = r22;
        C29421in r7 = r17;
        this.A0E = r7;
        this.A0B = r15;
        this.A09 = wfalManager;
        this.A0P = bool;
        this.A0Q = bool2;
        C29241iV r8 = r23;
        this.A0K = r8;
        this.A0M = r24;
        this.A0N = r25;
        this.A0G = r19.A06(viewGroup.getContext(), "status-details-panel");
        View A0h = C86664Kz.A0h(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
        ViewStub A0n = C86664Kz.A0n(A0h, R.id.panel_action_buttons);
        if (this.A09.A02()) {
            View A0M2 = C86634Kw.A0M(A0n, R.layout.f8nameremoved);
            View inflate = C86664Kz.A0n(A0M2, R.id.status_details_action_buttons_xfamily_crossposting_stub).inflate();
            View inflate2 = C86664Kz.A0n(A0M2, R.id.status_details_action_buttons_waffle_ig_crossposting_stub).inflate();
            this.A01 = AnonymousClass0x9.A0F(inflate, R.id.status_details_action_buttons_xfamily_fb_crossposting_icon);
            this.A02 = AnonymousClass0x9.A0F(inflate2, R.id.status_details_action_buttons_waffle_ig_crossposting_icon);
            C86634Kw.A14(A0M2.getContext(), this.A01, R.color.f5nameremoved);
            this.A02.setColorFilter(C86624Kv.A02(A0M2, R.color.f5nameremoved));
            C989753y.A00(this.A01, this, 14);
            C989753y.A00(this.A02, this, 15);
            A01(this.A0P);
            A02(this.A0Q);
        } else if (r2.A00()) {
            View A0M3 = C86634Kw.A0M(A0n, R.layout.f8nameremoved);
            Boolean bool3 = this.A0P;
            if (bool3 != null && this.A0O.A02()) {
                ImageView A0F2 = AnonymousClass0x9.A0F(C86664Kz.A0n(A0M3, R.id.status_details_action_buttons_xfamily_crossposting_stub).inflate(), R.id.status_details_action_buttons_xfamily_fb_crossposting_icon);
                this.A01 = A0F2;
                C86634Kw.A14(A0M3.getContext(), A0F2, R.color.f5nameremoved);
                C989753y.A00(this.A01, this, 13);
                A01(bool3);
            }
        } else {
            A0n.setLayoutResource(R.layout.f8nameremoved);
            A0n.inflate();
        }
        RecyclerView recyclerView = (RecyclerView) C86664Kz.A0i(A0h);
        this.A06 = recyclerView;
        viewGroup.getContext();
        C18270x1.A0u(recyclerView);
        ViewStub viewStub = (ViewStub) C06560Yg.A02(A0h, R.id.list_container_header_stub);
        this.A04 = viewStub;
        if (this.A09.A02()) {
            C162457s7.A0J(viewStub, 0);
            View A0M4 = C86634Kw.A0M(viewStub, R.layout.f8nameremoved);
            C162457s7.A0D(A0M4);
            this.A00 = A0M4;
        }
        TextView A092 = AnonymousClass002.A09(A0h, 16908292);
        this.A05 = A092;
        A092.setText(r21.A2G() ? R.string.f11nameremoved : R.string.f11nameremoved);
        C87834Wh r1 = new C87834Wh(this);
        this.A0L = r1;
        WaTextView A0O2 = C86644Kx.A0O(viewGroup, R.id.title);
        this.A08 = A0O2;
        C106905aM.A04(A0O2);
        recyclerView.setAdapter(r1);
        r7.A06(A002);
        r15.A06(r5);
        r8.A06(r4);
    }
}
