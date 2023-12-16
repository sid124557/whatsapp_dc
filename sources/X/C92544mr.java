package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4mr  reason: invalid class name and case insensitive filesystem */
public class C92544mr extends C93314oJ {
    public AnonymousClass5UX A00;
    public C90004fd A01;
    public boolean A02;
    public final LinearLayout A03;
    public final TextView A04 = AnonymousClass002.A09(this, R.id.vcard_text);
    public final TextView A05;
    public final C105365Uq A06;
    public final C95894up A07;
    public final ImageView[] A08;

    public void A1H() {
        A1t(false);
        A22();
    }

    public final void A23(List list, int i, String str) {
        CharSequence A022;
        int i2 = 0;
        do {
            if (list == null || i2 >= list.size()) {
                this.A00.A06(this.A08[i2], R.drawable.avatar_contact);
            } else {
                this.A06.A0B(this.A08[i2], (C106705a1) list.get(i2));
            }
            i2++;
        } while (i2 < 3);
        if (!TextUtils.isEmpty(str)) {
            int i3 = i - 1;
            Object[] A1b = C18310x6.A1b(C107575bX.A0D(str, 50), 0);
            AnonymousClass000.A1P(A1b, i3, 1);
            String A0L = this.A0M.A0L(A1b, R.plurals.f9nameremoved, (long) i3);
            Context context = getContext();
            TextView textView = this.A04;
            TextPaint paint = textView.getPaint();
            AnonymousClass5Y0 r1 = this.A1R;
            if (A0L == null) {
                A022 = null;
            } else {
                A022 = C107345b9.A02(context, paint, new AnonymousClass8GT(), r1, A0L);
            }
            textView.setText(A1E(A022));
            return;
        }
        this.A04.setText(C86604Kt.A0q(this.A0M, i, 0, R.plurals.f9nameremoved));
    }

    public void A0v() {
        if (!this.A02) {
            this.A02 = true;
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
            this.A00 = C86614Ku.A0Q(r2);
        }
    }

    public int getMainChildMaxWidth() {
        if (this.A0n.BHf(getFMessage())) {
            return 0;
        }
        return C87094Nz.A06(this);
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.AnonymousClass31H.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.C624134x r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C30411mP
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.AnonymousClass31H.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C626936e.A0C(r0)
            r2.A0S = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92544mr.setFMessage(X.34x):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.widget.ImageView[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92544mr(android.content.Context r4, X.C105365Uq r5, X.AnonymousClass677 r6, X.C624134x r7, X.C95894up r8) {
        /*
            r3 = this;
            r3.<init>(r4, r6, r7)
            r3.A0v()
            r0 = 3
            android.widget.ImageView[] r2 = new android.widget.ImageView[r0]
            r3.A08 = r2
            r3.A06 = r5
            r3.A07 = r8
            r0 = 2131434608(0x7f0b1c70, float:1.8491035E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r3, r0)
            r3.A04 = r0
            r0 = 2131432437(0x7f0b13f5, float:1.8486631E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131432438(0x7f0b13f6, float:1.8486633E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 1
            r2[r0] = r1
            r0 = 2131432439(0x7f0b13f7, float:1.8486635E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2
            r2[r0] = r1
            r0 = 2131434690(0x7f0b1cc2, float:1.8491201E38)
            android.widget.TextView r0 = X.AnonymousClass002.A09(r3, r0)
            r3.A05 = r0
            r0 = 2131428961(0x7f0b0661, float:1.8479581E38)
            android.widget.LinearLayout r1 = X.C86664Kz.A0v(r3, r0)
            r3.A03 = r1
            r0 = 30
            X.AnonymousClass54F.A00(r1, r3, r0)
            X.C93314oJ.A0q(r1, r3)
            r3.A22()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92544mr.<init>(android.content.Context, X.5Uq, X.677, X.34x, X.4up):void");
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public final void A22() {
        Runnable A022;
        boolean z;
        AnonymousClass3ZH A002;
        boolean z2;
        C624134x fMessage = getFMessage();
        int A003 = C615731j.A00(fMessage);
        TextView textView = this.A04;
        AnonymousClass2z0 r5 = fMessage.A1J;
        textView.setTag(r5);
        C90004fd r1 = this.A01;
        if (r1 != null) {
            this.A07.A04(r1);
        }
        C95894up r12 = this.A07;
        synchronized (r12) {
            A022 = r12.A02(fMessage, (Object) null);
        }
        C90004fd r2 = (C90004fd) A022;
        this.A01 = r2;
        r2.A04(new C124266Bp(this, 5), this.A0X.A08);
        A23((List) null, A003, (String) null);
        ImageView imageView = this.A08[2];
        if (A003 == 2) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
        if (!r5.A02) {
            C95814uZ r22 = r5.A00;
            boolean A0K = C627336j.A0K(r22);
            boolean z3 = true;
            C64773Ex r13 = this.A0t;
            if (A0K) {
                A002 = C64773Ex.A00(r13, fMessage.A0n());
                z2 = (!this.A1V.A0b.A0G((C27991fJ) r22)) & this.A1y.A05(r22) & true;
            } else {
                A002 = C64773Ex.A00(r13, r22);
                z2 = true;
            }
            if (A002.A0F != null) {
                z3 = false;
            }
            z = z2 & z3 & this.A1y.A05(C86604Kt.A0a(A002));
        } else {
            z = false;
        }
        View findViewById = findViewById(R.id.button_div);
        TextView textView2 = this.A05;
        if (!z) {
            textView2.setVisibility(0);
            AnonymousClass54F.A00(textView2, this, 30);
            return;
        }
        C86624Kv.A12(textView2, findViewById);
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
