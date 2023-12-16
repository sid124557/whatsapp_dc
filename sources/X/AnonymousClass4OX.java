package X;

import android.widget.BaseAdapter;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.4OX  reason: invalid class name */
public class AnonymousClass4OX extends BaseAdapter {
    public final /* synthetic */ MessageDetailsActivity A00;

    public AnonymousClass4OX(MessageDetailsActivity messageDetailsActivity) {
        this.A00 = messageDetailsActivity;
    }

    public int getCount() {
        MessageDetailsActivity messageDetailsActivity = this.A00;
        if (messageDetailsActivity.A76()) {
            return messageDetailsActivity.A0b.size();
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0176, code lost:
        if (r9 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017d, code lost:
        if (r9 != null) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            r16 = this;
            r7 = r18
            r10 = 0
            r2 = r16
            if (r18 != 0) goto L_0x0016
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r2.A00
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625446(0x7f0e05e6, float:1.88781E38)
            r3 = r19
            android.view.View r7 = r1.inflate(r0, r3, r10)
        L_0x0016:
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r6 = r2.A00
            java.util.ArrayList r4 = r6.A0b
            java.lang.Object r2 = r4.get(r10)
            X.5Rj r2 = (X.C104545Rj) r2
            X.57a r1 = r2.A02()
            X.57a r0 = X.C995557a.KEEP_IN_CHAT
            boolean r0 = X.AnonymousClass000.A1Y(r0, r1)
            r3 = 1
            if (r0 == 0) goto L_0x0194
            int r0 = r4.size()
            if (r0 <= r3) goto L_0x0194
            X.4ol r2 = (X.C93554ol) r2
            java.lang.Object r0 = r4.get(r3)
            X.5Rj r0 = (X.C104545Rj) r0
            r5 = r2
            r2 = r0
        L_0x003d:
            X.2z3 r9 = r2.A00
            r0 = 2131433398(0x7f0b17b6, float:1.848858E38)
            android.view.View r2 = X.C06560Yg.A02(r7, r0)
            X.34x r0 = r6.A0Q
            boolean r0 = X.C627636p.A0X(r0)
            r8 = 8
            if (r0 == 0) goto L_0x018f
            r0 = 2131432490(0x7f0b142a, float:1.8486739E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r2, r0)
            r0 = 2131432489(0x7f0b1429, float:1.8486737E38)
            android.widget.ImageView r4 = X.AnonymousClass0x9.A0E(r2, r0)
            r2.setVisibility(r10)
            X.34x r0 = r6.A0Q
            X.5W2 r3 = X.AnonymousClass5W2.A00(r0, r3)
            int r0 = r3.A02
            android.content.Context r2 = X.C86654Ky.A0B(r7, r1, r0)
            int r1 = r3.A01
            int r0 = r3.A00
            X.C107335b8.A0C(r2, r4, r1, r0)
        L_0x0074:
            r0 = 2131434312(0x7f0b1b48, float:1.8490434E38)
            android.widget.TextView r2 = X.AnonymousClass002.A09(r7, r0)
            X.34x r0 = r6.A0Q
            byte r0 = r0.A1I
            if (r0 != 0) goto L_0x0181
            r1 = 2131890764(0x7f12124c, float:1.941623E38)
        L_0x0084:
            r2.setText(r1)
            r0 = 2131429293(0x7f0b07ad, float:1.8480255E38)
            android.widget.TextView r11 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131429281(0x7f0b07a1, float:1.848023E38)
            android.widget.TextView r13 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131429290(0x7f0b07aa, float:1.8480249E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131429287(0x7f0b07a7, float:1.8480242E38)
            android.widget.TextView r4 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131430240(0x7f0b0b60, float:1.8482175E38)
            r7.findViewById(r0)
            r0 = 2131429284(0x7f0b07a4, float:1.8480236E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r7, r0)
            r0 = 2131433397(0x7f0b17b5, float:1.8488579E38)
            android.view.View r2 = X.C06560Yg.A02(r7, r0)
            r0 = 2131429394(0x7f0b0812, float:1.848046E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = 2131427949(0x7f0b026d, float:1.8477529E38)
            X.C86604Kt.A1F(r7, r0, r8)
            r0 = 2131430239(0x7f0b0b5f, float:1.8482173E38)
            android.view.View r0 = r7.findViewById(r0)
            r1.setVisibility(r8)
            r0.setVisibility(r8)
            X.34x r0 = r6.A0Q
            long r0 = r0.A0K
            X.AnonymousClass4SG.A3A(r11, r6, r0)
            java.lang.String r11 = "—"
            if (r9 == 0) goto L_0x0173
            r0 = 5
            long r0 = r9.A01(r0)
            r14 = 0
            int r12 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0173
            X.AnonymousClass4SG.A3A(r13, r6, r0)
        L_0x00ea:
            r0 = 13
            long r0 = r9.A01(r0)
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x017a
            X.AnonymousClass4SG.A3A(r10, r6, r0)
        L_0x00f9:
            r12 = 0
            long r0 = r9.A01
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x010d
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x010d
            long r0 = r9.A01(r8)
            java.lang.CharSequence r11 = r6.A74(r0)
        L_0x010d:
            r4.setText(r11)
            if (r5 == 0) goto L_0x0170
            long r0 = r5.A00
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0170
            r4 = 2131430904(0x7f0b0df8, float:1.8483522E38)
            android.widget.TextView r10 = X.AnonymousClass002.A09(r7, r4)
            X.34x r4 = r6.A0Q
            X.1md r8 = r4.A1S
            X.2z0 r4 = r8.A1J
            boolean r11 = r4.A02
            X.3Ex r5 = r6.A0C
            com.whatsapp.jid.UserJid r4 = r8.A0o()
            X.3ZH r9 = r5.A0A(r4)
            X.34x r4 = r6.A0Q
            boolean r4 = X.AnonymousClass2z0.A0D(r4)
            int r8 = X.C18280x3.A01(r4)
            X.5ZU r5 = r6.A0E
            r4 = 0
            java.lang.String r9 = r5.A0R(r9, r8, r4)
            X.2oU r4 = r6.A0K
            android.content.res.Resources r8 = X.C54292oU.A00(r4)
            if (r11 != 0) goto L_0x0168
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L_0x0168
            r5 = 2131890364(0x7f1210bc, float:1.9415418E38)
            java.lang.Object[] r4 = X.AnonymousClass000.A1b(r9)
            java.lang.String r4 = r8.getString(r5, r4)
        L_0x015d:
            r10.setText(r4)
            X.AnonymousClass4SG.A3A(r3, r6, r0)
            r0 = 0
        L_0x0164:
            r2.setVisibility(r0)
            return r7
        L_0x0168:
            r4 = 2131890367(0x7f1210bf, float:1.9415424E38)
            java.lang.String r4 = r8.getString(r4)
            goto L_0x015d
        L_0x0170:
            r0 = 8
            goto L_0x0164
        L_0x0173:
            r13.setText(r11)
            if (r9 == 0) goto L_0x017a
            goto L_0x00ea
        L_0x017a:
            r10.setText(r11)
            if (r9 == 0) goto L_0x010d
            goto L_0x00f9
        L_0x0181:
            boolean r0 = X.C627636p.A0I(r0)
            r1 = 2131890768(0x7f121250, float:1.9416237E38)
            if (r0 == 0) goto L_0x0084
            r1 = 2131890772(0x7f121254, float:1.9416245E38)
            goto L_0x0084
        L_0x018f:
            r2.setVisibility(r8)
            goto L_0x0074
        L_0x0194:
            r5 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4OX.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 1;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
