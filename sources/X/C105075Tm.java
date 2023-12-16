package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;
import java.util.List;

/* renamed from: X.5Tm  reason: invalid class name and case insensitive filesystem */
public class C105075Tm {
    public static Drawable A07;
    public Drawable A00 = null;
    public AnonymousClass4Ln A01;
    public Integer A02 = null;
    public final ConversationListRowHeaderView A03;
    public final AnonymousClass5ZU A04;
    public final C89414cu A05;
    public final C620733j A06;

    public void A00() {
        if (this.A01 == null || A03()) {
            ConversationListRowHeaderView conversationListRowHeaderView = this.A03;
            this.A01 = new AnonymousClass4Ln(AnonymousClass5Yj.A03(conversationListRowHeaderView.getContext(), conversationListRowHeaderView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        ConversationListRowHeaderView conversationListRowHeaderView2 = this.A03;
        conversationListRowHeaderView2.getUnreadIndicatorView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        conversationListRowHeaderView2.getUnreadIndicatorView().setPadding(0, 0, 0, 0);
        conversationListRowHeaderView2.getUnreadIndicatorView().setBackground(this.A01);
    }

    public void A01() {
        this.A03.A01.setVisibility(8);
        TextEmojiLabel textEmojiLabel = this.A05.A02;
        textEmojiLabel.setText("");
        textEmojiLabel.setPlaceholder(50);
    }

    public void A02(AnonymousClass3ZH r4, C107075ae r5, List list) {
        C89414cu r2 = this.A05;
        r2.A02.setPlaceholder(0);
        r2.A0E(r5, this.A04.A0I(r4), list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0.intValue() != r2) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r3 = this;
            com.whatsapp.components.ConversationListRowHeaderView r0 = r3.A03
            com.whatsapp.WaTextView r0 = r0.getUnreadIndicatorView()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r2 = r0.getResources()
            int r1 = X.AnonymousClass5Yj.A01(r0)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r2 = X.C06400Xn.A00(r0, r2, r1)
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x0025
            int r0 = r0.intValue()
            r1 = 0
            if (r0 == r2) goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A02 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105075Tm.A03():boolean");
    }

    public C105075Tm(Context context, C116985rC r9, ConversationListRowHeaderView conversationListRowHeaderView, AnonymousClass5ZU r11, C620733j r12, AnonymousClass1VX r13) {
        this.A03 = conversationListRowHeaderView;
        this.A06 = r12;
        this.A04 = r11;
        TextEmojiLabel textEmojiLabel = conversationListRowHeaderView.A00;
        Context context2 = context;
        C116985rC r2 = r9;
        this.A05 = new C89414cu(context2, r2, textEmojiLabel, r11, r12, r13);
    }
}
