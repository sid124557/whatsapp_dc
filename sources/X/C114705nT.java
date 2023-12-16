package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5nT  reason: invalid class name and case insensitive filesystem */
public class C114705nT implements AnonymousClass667 {
    public C114495n8 A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final C111095hX A04;
    public final LinkedAccountsMediaCard A05;
    public final C106185Xy A06;
    public final C108915dl A07;
    public final C108985dt A08;
    public final C620733j A09;
    public final C989153s A0A;
    public final AnonymousClass65M A0B;
    public final Integer A0C;
    public final boolean A0D;

    public final void A00() {
        C108775dX r4;
        C165997xy r1 = this.A08.A05;
        if (r1 != null) {
            LinkedAccountsMediaCard linkedAccountsMediaCard = this.A05;
            if (linkedAccountsMediaCard.A03 != null) {
                int i = this.A02;
                if (i == 0) {
                    r4 = r1.A00;
                } else if (i == 1) {
                    r4 = r1.A01;
                } else {
                    return;
                }
                if (r4 != null) {
                    Uri A002 = AnonymousClass73Z.A00(r4, i);
                    C111095hX r2 = this.A04;
                    Context context = this.A03;
                    C106185Xy r6 = this.A06;
                    r6.A05(this.A0C, Integer.valueOf(r4.A00), linkedAccountsMediaCard.A03.getRawString(), 15, i, true);
                    r2.A0A(context, C18310x6.A0D(A002));
                    int i2 = 23;
                    if (i == 0) {
                        i2 = 20;
                    }
                    r6.A02(this.A07, i2);
                }
            }
        }
    }

    public void A01(UserJid userJid) {
        AnonymousClass5RQ r2;
        int i = this.A02;
        C989153s r1 = this.A0A;
        UserJid userJid2 = userJid;
        if (i == 0) {
            synchronized (r1) {
                r2 = (AnonymousClass5RQ) r1.A00.get(userJid2);
            }
        } else {
            r2 = r1.A05(userJid2);
        }
        String string = this.A03.getString(R.string.f11nameremoved);
        if (r2 != null) {
            List list = r2.A00;
            if (!list.isEmpty()) {
                LinkedAccountsMediaCard linkedAccountsMediaCard = this.A05;
                ArrayList A0s = AnonymousClass001.A0s();
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C104785Si r12 = (C104785Si) list.get(i2);
                    if (!r12.A04.isEmpty()) {
                        C108815db r0 = (C108815db) r12.A04.get(0);
                        A0s2.add(new C108855df(r0, r12.A02, r12.A01, r12.A03, r12.A00));
                        A0s.add(new C149947On((Drawable) null, new C116215pv(linkedAccountsMediaCard.A02, userJid2, A0s2, i2), new C1896091y(r0, 0, linkedAccountsMediaCard), (String) null, string, C107315b6.A06(AnonymousClass000.A0Y("_", AnonymousClass000.A0l(r0.A04), 0))));
                    }
                }
                linkedAccountsMediaCard.A09(A0s, Integer.MAX_VALUE);
                int i3 = R.drawable.ic_business_instagram;
                if (i == 0) {
                    i3 = R.drawable.ic_settings_fb;
                }
                C109685f1 r02 = new C109685f1((Object) this, 45);
                View openProfileView = linkedAccountsMediaCard.getOpenProfileView();
                openProfileView.setOnClickListener(r02);
                AnonymousClass0x9.A0E(openProfileView, R.id.linked_account_icon).setImageResource(i3);
                linkedAccountsMediaCard.A00.addView(openProfileView);
                return;
            }
        }
        LinkedAccountsMediaCard linkedAccountsMediaCard2 = this.A05;
        C989453v r13 = new C989453v(this, 21);
        LinearLayout linearLayout = linkedAccountsMediaCard2.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        linkedAccountsMediaCard2.A08(r13, 3);
    }

    public boolean A02(UserJid userJid) {
        int i = this.A02;
        C989153s r1 = this.A0A;
        synchronized (r1) {
            if (i == 0) {
                boolean A1W = AnonymousClass000.A1W(r1.A02.get(userJid));
                return A1W;
            }
            boolean A1W2 = AnonymousClass000.A1W(r1.A02.get(userJid));
            return A1W2;
        }
    }

    public void Bd4(UserJid userJid) {
        if (AnonymousClass75J.A00(this.A05.A03, userJid)) {
            A01(userJid);
        }
    }

    public C114705nT(C111095hX r2, LinkedAccountsMediaCard linkedAccountsMediaCard, C106185Xy r4, C108915dl r5, C108985dt r6, C620733j r7, C989153s r8, AnonymousClass65M r9, Integer num, int i, boolean z) {
        this.A05 = linkedAccountsMediaCard;
        this.A02 = i;
        this.A08 = r6;
        this.A03 = linkedAccountsMediaCard.getContext();
        this.A0A = r8;
        this.A0B = r9;
        this.A09 = r7;
        this.A04 = r2;
        this.A0C = num;
        this.A07 = r5;
        this.A06 = r4;
        this.A0D = z;
    }

    public void BSp(UserJid userJid, int i) {
        C18260x0.A0x("LinkedAccountCardViewPresenter onFailure ", AnonymousClass001.A0o(), i);
        LinkedAccountsMediaCard linkedAccountsMediaCard = this.A05;
        if (AnonymousClass75J.A00(linkedAccountsMediaCard.A03, userJid)) {
            C989453v r1 = new C989453v(this, 21);
            LinearLayout linearLayout = linkedAccountsMediaCard.A00;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            linkedAccountsMediaCard.A08(r1, 3);
        }
    }
}
