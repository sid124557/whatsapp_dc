package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;

/* renamed from: X.4o5  reason: invalid class name and case insensitive filesystem */
public abstract class C93174o5 extends C133446hM {
    public final View A00 = C06560Yg.A02(this, R.id.button_div);
    public final View A01 = C06560Yg.A02(this, R.id.expired_invitation_container);
    public final View A02 = C06560Yg.A02(this, R.id.group_view_contacts_btn);
    public final ImageView A03 = AnonymousClass0x9.A0E(this, R.id.avatar);
    public final TextEmojiLabel A04 = AnonymousClass0x7.A0K(this, R.id.action_text);
    public final TextEmojiLabel A05 = AnonymousClass0x7.A0K(this, R.id.group_invite_caption);
    public final TextEmojiLabel A06 = AnonymousClass0x7.A0K(this, R.id.instructions);
    public final TextEmojiLabel A07 = AnonymousClass0x7.A0K(this, R.id.group_name);
    public final TextAndDateLayout A08 = ((TextAndDateLayout) C06560Yg.A02(this, R.id.text_and_date));
    public final C185528tp A09 = new C100465Ba(this, 4);

    public abstract String getInviteCaption();

    public abstract View.OnClickListener getOnActionClickListener();

    public boolean A16() {
        return C627636p.A0v(getFMessage(), this.A28);
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public C93174o5(Context context, AnonymousClass677 r4, C624134x r5) {
        super(context, r4, r5);
        A22();
    }

    public void A1H() {
        A22();
        A1t(false);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bf, code lost:
        if (r6.A07 != false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A22() {
        /*
            r11 = this;
            X.34x r7 = r11.getFMessage()
            com.whatsapp.TextEmojiLabel r0 = r11.A07
            X.C106905aM.A04(r0)
            java.lang.String r8 = r11.getInviteCaption()
            r2 = r11
            boolean r0 = r11 instanceof X.C92814nJ
            if (r0 == 0) goto L_0x00a9
            X.4nJ r2 = (X.C92814nJ) r2
            X.1mM r1 = r2.getFMessage()
            X.2sH r0 = r2.A1E
            long r3 = r0.A0H()
            long r1 = r1.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r10 = X.AnonymousClass001.A1U(r0)
        L_0x0026:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r3 = 8
            r2 = 0
            if (r0 != 0) goto L_0x009c
            com.whatsapp.TextEmojiLabel r0 = r11.A05
            r11.setMessageText(r8, r0, r7)
            android.view.View r1 = r11.A00
            int r0 = X.C86614Ku.A01(r10)
            r1.setVisibility(r0)
        L_0x003d:
            com.whatsapp.components.TextAndDateLayout r9 = r11.A08
            if (r9 == 0) goto L_0x0060
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            r5 = 7
            r1 = -2
            r0 = -1
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r0, r1)
            r1 = 2131430820(0x7f0b0da4, float:1.8483352E38)
            if (r6 == 0) goto L_0x0091
            r4.addRule(r5, r1)
            r4.addRule(r3, r1)
            r9.setLayoutParams(r4)
            android.view.ViewGroup r0 = r11.A08
            X.C86604Kt.A19(r0)
        L_0x0060:
            if (r10 == 0) goto L_0x007d
            r0 = 0
            r11.setOnClickListener(r0)
            r11.setClickable(r2)
            android.view.View r0 = r11.A02
            r0.setVisibility(r3)
            android.view.View r0 = r11.A01
        L_0x0070:
            r0.setVisibility(r2)
            X.1sV r2 = r11.A22
            android.widget.ImageView r1 = r11.A03
            X.8tp r0 = r11.A09
            r2.A09(r1, r7, r0)
            return
        L_0x007d:
            android.view.View$OnClickListener r1 = r11.getOnActionClickListener()
            r11.setOnClickListener(r1)
            com.whatsapp.TextEmojiLabel r0 = r11.A04
            r0.setOnClickListener(r1)
            android.view.View r0 = r11.A01
            r0.setVisibility(r3)
            android.view.View r0 = r11.A02
            goto L_0x0070
        L_0x0091:
            r4.addRule(r5, r1)
            r0 = 3
            r4.addRule(r0, r1)
            r9.setLayoutParams(r4)
            goto L_0x0060
        L_0x009c:
            java.lang.String r1 = ""
            com.whatsapp.TextEmojiLabel r0 = r11.A05
            r11.setMessageText(r1, r0, r7)
            android.view.View r0 = r11.A00
            r0.setVisibility(r3)
            goto L_0x003d
        L_0x00a9:
            X.34x r6 = r11.A0S
            X.1mN r6 = (X.C30391mN) r6
            X.2sH r0 = r11.A1E
            long r4 = r0.A0H()
            long r2 = r6.A01
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            boolean r0 = r6.A07
            r10 = 0
            if (r0 == 0) goto L_0x0026
        L_0x00c1:
            r10 = 1
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93174o5.A22():void");
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
