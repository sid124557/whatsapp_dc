package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4X7  reason: invalid class name */
public class AnonymousClass4X7 extends AnonymousClass0R6 {
    public C27991fJ A00;
    public List A01 = AnonymousClass001.A0s();
    public AnonymousClass4GQ A02;
    public AnonymousClass4GQ A03;
    public final Context A04;
    public final C111095hX A05;
    public final AnonymousClass5ZU A06;
    public final C105365Uq A07;
    public final C114015mM A08;
    public final C620633i A09;
    public final C56612sH A0A;
    public final C620733j A0B;
    public final AnonymousClass1VX A0C;
    public final C106715a2 A0D;

    public AnonymousClass4X7(Context context, C111095hX r4, AnonymousClass5ZU r5, C114015mM r6, C620633i r7, C56612sH r8, C620733j r9, AnonymousClass1VX r10, C106715a2 r11) {
        C18260x0.A0e(r10, r8, r4, r11);
        C18260x0.A0W(r7, r6, r9);
        C162457s7.A0J(r5, 9);
        this.A04 = context;
        this.A0C = r10;
        this.A0A = r8;
        this.A05 = r4;
        this.A0D = r11;
        this.A09 = r7;
        this.A08 = r6;
        this.A0B = r9;
        this.A06 = r5;
        this.A07 = r6.A06(context, "group-pending-participants");
        A0E(true);
    }

    public void A0D(RecyclerView recyclerView) {
        C162457s7.A0J(recyclerView, 0);
        this.A07.A00();
    }

    public void A0K(AnonymousClass3ZH r5, C88384Yn r6) {
        C162457s7.A0J(r6, 0);
        TextEmojiLabel textEmojiLabel = r6.A02;
        AnonymousClass5ZU r1 = this.A06;
        textEmojiLabel.setText(r1.A0B(r5, -1).A01);
        if (!r5.A0Q()) {
            String A032 = AnonymousClass5ZU.A03(r1, r5);
            C162457s7.A0D(A032);
            if (A032.length() != 0) {
                ((TextView) AnonymousClass5UY.A00(r6.A06, 0)).setText(A032);
                this.A07.A08(r6.A01, r5);
            }
        }
        r6.A06.A06(8);
        this.A07.A08(r6.A01, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0140, code lost:
        if (r2 != r1) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BNf(X.C05570Ua r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            java.util.List r0 = r10.A01
            java.lang.Object r7 = r0.get(r12)
            X.8j1 r7 = (X.C179358j1) r7
            boolean r0 = r7 instanceof X.C171418Gz
            if (r0 != 0) goto L_0x008e
            X.8Gy r0 = X.C171408Gy.A00
            boolean r0 = X.C162457s7.A0P(r7, r0)
            if (r0 != 0) goto L_0x008e
            boolean r0 = r7 instanceof X.C171398Gx
            if (r0 == 0) goto L_0x00af
            X.8Gx r7 = (X.C171398Gx) r7
            r5 = 0
            r8 = 1
            X.C162457s7.A0J(r7, r8)
            X.4Yn r11 = (X.C88384Yn) r11
            X.3ZH r6 = r7.A07
            android.view.View r1 = r11.A00
            X.4uZ r0 = r6.A0H
            r1.setTag(r0)
            r10.A0K(r6, r11)
            int r3 = r7.A00
            if (r3 <= 0) goto L_0x00a7
            X.5UY r0 = r11.A05
            android.view.View r2 = X.AnonymousClass5UY.A00(r0, r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r0 = r10.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755211(0x7f1000cb, float:1.9141295E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r1, r3, r5, r0)
            r2.setText(r0)
        L_0x004d:
            X.3ZH r9 = r7.A06
            if (r9 != 0) goto L_0x008f
            X.5UY r1 = r11.A04
            r0 = 8
            r1.A06(r0)
        L_0x0058:
            X.598 r2 = r7.A03
            X.598 r0 = X.AnonymousClass598.PENDING
            r1 = 8
            if (r2 != r0) goto L_0x00df
            com.whatsapp.wds.components.button.WDSButton r4 = r11.A07
            r4.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r3 = r11.A08
            r3.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r11.A03
            r0.setVisibility(r1)
            X.5ZU r1 = r10.A06
            r0 = -1
            X.7HU r0 = r1.A0B(r6, r0)
            java.lang.String r2 = r0.A01
            android.content.Context r1 = r10.A04
            r0 = 2131889926(0x7f120f06, float:1.941453E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r2, r8, r0)
            r4.setContentDescription(r0)
            r0 = 2131889933(0x7f120f0d, float:1.9414544E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r2, r8, r0)
            r3.setContentDescription(r0)
        L_0x008e:
            return
        L_0x008f:
            X.5UY r0 = r11.A04
            android.view.View r4 = X.AnonymousClass5UY.A00(r0, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.Context r3 = r10.A04
            r2 = 2131889923(0x7f120f03, float:1.9414523E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.5ZU r0 = r10.A06
            X.C18300x5.A1E(r0, r9, r1, r5)
            X.AnonymousClass001.A0y(r3, r4, r1, r2)
            goto L_0x0058
        L_0x00a7:
            X.5UY r1 = r11.A05
            r0 = 8
            r1.A06(r0)
            goto L_0x004d
        L_0x00af:
            boolean r0 = r7 instanceof X.C171368Gu
            if (r0 == 0) goto L_0x00c5
            X.8Gu r7 = (X.C171368Gu) r7
            long r1 = r7.A00
            X.6IV r11 = (X.AnonymousClass6IV) r11
            com.whatsapp.TextEmojiLabel r4 = r11.A00
            X.33j r0 = r10.A0B
            java.lang.String r0 = X.C107565bW.A0E(r0, r1)
        L_0x00c1:
            r4.setText(r0)
            return
        L_0x00c5:
            boolean r0 = r7 instanceof X.C171378Gv
            if (r0 == 0) goto L_0x008e
            X.8Gv r7 = (X.C171378Gv) r7
            X.6IV r11 = (X.AnonymousClass6IV) r11
            com.whatsapp.TextEmojiLabel r4 = r11.A00
            android.content.Context r3 = r10.A04
            int r2 = r7.A00
            java.lang.Object[] r1 = r7.A01
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = r3.getString(r2, r0)
            goto L_0x00c1
        L_0x00df:
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A07
            r0.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A08
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r6 = r11.A03
            r6.setVisibility(r5)
            android.content.Context r5 = r10.A04
            r0 = 2130969727(0x7f04047f, float:1.7548144E38)
            r2 = 2131101198(0x7f06060e, float:1.7814799E38)
            int r4 = X.AnonymousClass5Yj.A02(r5, r0, r2)
            r3 = 2131231659(0x7f0803ab, float:1.8079405E38)
            X.598 r0 = r7.A03
            int r1 = r0.ordinal()
            if (r1 == r8) goto L_0x012c
            r0 = 2
            if (r1 == r0) goto L_0x0117
            r0 = 4
            if (r1 == r0) goto L_0x011e
            java.lang.String r0 = ""
        L_0x010d:
            X.AnonymousClass0x2.A0q(r5, r6, r4)
            X.C86614Ku.A11(r5, r6, r3)
            r6.setText(r0)
            return
        L_0x0117:
            r4 = 2131101196(0x7f06060c, float:1.7814795E38)
            r0 = 2131889941(0x7f120f15, float:1.941456E38)
            goto L_0x0124
        L_0x011e:
            r4 = 2131101196(0x7f06060c, float:1.7814795E38)
            r0 = 2131889940(0x7f120f14, float:1.9414558E38)
        L_0x0124:
            java.lang.String r0 = X.C18290x4.A0l(r5, r0)
            r3 = 2131231658(0x7f0803aa, float:1.8079403E38)
            goto L_0x010d
        L_0x012c:
            r0 = 2130969727(0x7f04047f, float:1.7548144E38)
            int r4 = X.AnonymousClass5Yj.A02(r5, r0, r2)
            X.6xW r1 = r7.A04
            X.6xW r0 = X.C142636xW.A03
            if (r1 != r0) goto L_0x0142
            X.59I r2 = r7.A02
            X.59I r1 = X.AnonymousClass59I.A06
            r0 = 2131889965(0x7f120f2d, float:1.9414608E38)
            if (r2 == r1) goto L_0x0145
        L_0x0142:
            r0 = 2131889934(0x7f120f0e, float:1.9414546E38)
        L_0x0145:
            java.lang.String r0 = X.C18290x4.A0l(r5, r0)
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X7.BNf(X.0Ua, int):void");
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new AnonymousClass6IH(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this);
                }
                if (i != 4) {
                    return new C88384Yn(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this.A05, this);
                }
            }
            return new AnonymousClass6IV(C18310x6.A0I(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this);
        }
        C111095hX r5 = this.A05;
        C106715a2 r8 = this.A0D;
        return new AnonymousClass12U(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), r5, this.A09, this, r8);
    }

    public long A0B(int i) {
        UserJid userJid;
        boolean z = this instanceof AnonymousClass4u4;
        C179358j1 r1 = (C179358j1) this.A01.get(i);
        if (z) {
            if (!(r1 instanceof C171388Gw)) {
                return 0;
            }
            userJid = ((C171388Gw) r1).A00.A03;
        } else if (!(r1 instanceof C171398Gx)) {
            return 0;
        } else {
            userJid = ((C171398Gx) r1).A05.A04;
        }
        return (long) userJid.hashCode();
    }

    public int A0G() {
        return this.A01.size();
    }

    public int getItemViewType(int i) {
        Object obj = this.A01.get(i);
        if (obj instanceof C171408Gy) {
            return 1;
        }
        if (obj instanceof C171418Gz) {
            return 3;
        }
        if (obj instanceof C171368Gu) {
            return 2;
        }
        return AnonymousClass0x9.A00(obj instanceof C171378Gv ? 1 : 0);
    }
}
