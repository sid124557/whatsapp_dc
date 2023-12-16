package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9am  reason: invalid class name and case insensitive filesystem */
public class C196399am implements C185418tc {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public Button A04;
    public Button A05;
    public GridView A06;
    public ImageButton A07;
    public TextView A08;
    public TextView A09;
    public C56422rx A0A;
    public PaymentInviteFragment A0B;
    public final C64773Ex A0C;
    public final AnonymousClass5ZU A0D;
    public final C114015mM A0E;
    public final String A0F;
    public final boolean A0G;

    public /* bridge */ /* synthetic */ void Axq(Object obj) {
        AnonymousClass7HR r5 = (AnonymousClass7HR) obj;
        Context context = this.A00.getContext();
        C626936e.A06(r5);
        if (1 == r5.A00) {
            this.A03.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        this.A03.setVisibility(8);
        Object obj2 = r5.A01;
        C626936e.A06(obj2);
        A00(context, (List) obj2);
    }

    public void BfU(View view) {
        this.A00 = view;
        this.A04 = (Button) C06560Yg.A02(view, R.id.invite_button);
        this.A05 = (Button) C06560Yg.A02(view, R.id.secondary_button);
        this.A06 = (GridView) C06560Yg.A02(view, R.id.selected_items);
        this.A02 = C86644Kx.A0I(view, R.id.invite_ui_content);
        this.A03 = C86644Kx.A0I(view, R.id.invite_ui_loader);
        this.A07 = (ImageButton) C06560Yg.A02(view, R.id.back);
        this.A08 = C18300x5.A0G(view, R.id.payment_invite_bottom_sheet_body);
        this.A09 = C18300x5.A0G(view, R.id.payment_invite_bottom_sheet_title);
        this.A01 = C86644Kx.A0I(view, R.id.incentive_info_container);
    }

    public C196399am(C64773Ex r1, C56422rx r2, AnonymousClass5ZU r3, C114015mM r4, String str, boolean z) {
        this.A0G = z;
        this.A0E = r4;
        this.A0C = r1;
        this.A0D = r3;
        this.A0F = str;
        this.A0A = r2;
    }

    public void A00(Context context, List list) {
        View view;
        Context context2 = context;
        if (list.size() == 1) {
            UserJid userJid = (UserJid) list.get(0);
            String A0M = this.A0D.A0M(this.A0C.A0A(userJid));
            C55502qS A002 = this.A0A.A00(userJid);
            if (A002 == null || !A002.A03()) {
                this.A04.setText(R.string.f11nameremoved);
                AnonymousClass001.A0y(context, this.A08, new Object[]{A0M}, R.string.f11nameremoved);
                AnonymousClass001.A0y(context, this.A09, new Object[]{A0M}, R.string.f11nameremoved);
                if (this.A0G) {
                    AnonymousClass001.A0y(context, C18300x5.A0G(this.A00, R.id.incentive_info_text), new Object[]{A0M}, R.string.f11nameremoved);
                    view = this.A01;
                    view.setVisibility(0);
                }
            } else {
                this.A0B.A1K(true);
            }
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0s.add(this.A0C.A0A((C95814uZ) it.next()));
            }
            this.A06.setAdapter(new AnonymousClass949(context2, context, this.A0E.A06(context, "payment-invite-view-component"), this, A0s, A0s));
            view = this.A06;
            view.setVisibility(0);
        }
        C204249p3.A02(this.A04, this, 124);
        C204409pJ.A00(this.A07, list, this, 20);
        C204249p3.A02(this.A05, this, 125);
        this.A02.setVisibility(0);
    }

    public int B94() {
        return R.layout.f8nameremoved;
    }

    public /* synthetic */ void BFl(ViewStub viewStub) {
        AnonymousClass9LS.A00(viewStub, this);
    }
}
