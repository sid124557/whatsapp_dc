package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.4u1  reason: invalid class name and case insensitive filesystem */
public class C95644u1 extends C103225Ma {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final TextEmojiLabel A06;
    public final AnonymousClass5YB A07;
    public final AnonymousClass5GI A08;
    public final /* synthetic */ GroupChatInfoActivity A09;

    public C95644u1(View view, AnonymousClass5GI r4, GroupChatInfoActivity groupChatInfoActivity) {
        this.A09 = groupChatInfoActivity;
        this.A01 = C06560Yg.A02(view, R.id.group_chat_info_layout_root);
        this.A07 = AnonymousClass5YB.A00(view, groupChatInfoActivity.A0Z, R.id.name);
        this.A04 = AnonymousClass0x7.A0K(view, R.id.status);
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.wdsProfilePicture);
        C86624Kv.A13(A0E, C06560Yg.A02(view, R.id.avatar));
        this.A02 = A0E;
        this.A03 = C18300x5.A0G(view, R.id.owner);
        this.A06 = AnonymousClass0x7.A0K(view, R.id.secondary_name_view);
        this.A05 = AnonymousClass0x7.A0K(view, R.id.secondary_name_alternative_view);
        this.A00 = C06560Yg.A02(view, R.id.group_chat_info_layout);
        this.A08 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01db, code lost:
        if (r16 != false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ed, code lost:
        if (r7 <= 0) goto L_0x01ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass65F r26, X.AnonymousClass5OF r27, java.util.ArrayList r28) {
        /*
            r25 = this;
            r12 = r26
            r14 = r25
            r14.A00 = r12
            android.widget.TextView r11 = r14.A03
            r10 = 8
            r11.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r13 = r14.A06
            r13.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r9 = r14.A05
            r9.setVisibility(r10)
            boolean r0 = r12 instanceof X.C114535nC
            X.C626936e.A0C(r0)
            X.5nC r12 = (X.C114535nC) r12
            X.3ZH r3 = r12.A00
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass3ZH.A07(r3)
            com.whatsapp.group.GroupChatInfoActivity r8 = r14.A09
            boolean r18 = X.AnonymousClass4SG.A46(r8, r2)
            X.5YB r5 = r14.A07
            r7 = 0
            com.whatsapp.TextEmojiLabel r1 = r5.A02
            r1.setText(r7)
            r4 = 2130969995(0x7f04058b, float:1.7548688E38)
            r0 = 2131101335(0x7f060697, float:1.7815077E38)
            X.AnonymousClass5Yj.A0B(r8, r1, r4, r0)
            com.whatsapp.TextEmojiLabel r6 = r14.A04
            r6.setText(r7)
            r0 = 2131101333(0x7f060695, float:1.7815073E38)
            X.AnonymousClass0x2.A0q(r8, r6, r0)
            X.5ZU r4 = r8.A0t
            X.1fJ r0 = r8.A1h
            int r16 = r4.A06(r3, r0)
            X.58i r4 = X.C998258i.UNKNOWN
            if (r18 == 0) goto L_0x016b
            r5.A05()
            X.5Uq r0 = r8.A0v
            r15 = r0
            X.2sr r0 = r8.A01
            X.1RR r0 = X.C86634Kw.A0V(r0)
            android.widget.ImageView r5 = r14.A02
            r15.A08(r5, r0)
        L_0x0063:
            X.5ZU r15 = r8.A0t
            r0 = r16
            java.lang.String r17 = r15.A0G(r4, r3, r0)
            boolean r0 = r12 instanceof X.C95654u2
            r4 = 0
            r19 = r28
            if (r0 == 0) goto L_0x00fe
            r0 = 1
            r5.setClickable(r0)
            r9 = 5839(0x16cf, float:8.182E-42)
            if (r18 == 0) goto L_0x018f
            X.1VX r0 = r8.A0D
            boolean r0 = r0.A0X(r9)
            if (r0 == 0) goto L_0x00f4
            X.2pb r0 = r8.A1I
            X.2mD r1 = r0.A00()
            if (r1 == 0) goto L_0x00f2
            java.lang.String r12 = r1.A02
            if (r12 == 0) goto L_0x00f2
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L_0x00f2
            long r2 = r1.A00
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
            long r0 = r1.A01
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x00f2
            long r14 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r13.toMillis(r2)
            long r0 = r0 + r2
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00f2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r12)
            java.lang.String r0 = " "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r9, r1)
        L_0x00b9:
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 != 0) goto L_0x00ee
            r6.setVisibility(r4)
            r6.A0K(r7, r1)
        L_0x00c5:
            boolean r0 = X.AnonymousClass4SG.A48(r8)
            if (r0 == 0) goto L_0x00df
            r11.setVisibility(r4)
            X.2ss r1 = r8.A0L
            X.1fJ r0 = r8.A1h
            int r1 = r1.A06(r0)
            r0 = 3
            if (r1 != r0) goto L_0x00e7
            r0 = 2131887930(0x7f12073a, float:1.941048E38)
            r11.setText(r0)
        L_0x00df:
            r5.setOnClickListener(r7)
            r0 = 2
            X.AnonymousClass0YY.A06(r5, r0)
        L_0x00e6:
            return
        L_0x00e7:
            r0 = 2131889771(0x7f120e6b, float:1.9414215E38)
            r11.setText(r0)
            goto L_0x00df
        L_0x00ee:
            r6.setVisibility(r10)
            goto L_0x00c5
        L_0x00f2:
            r1 = r7
            goto L_0x00b9
        L_0x00f4:
            X.2o5 r0 = r8.A0Y
            java.lang.String r0 = r0.A00()
            r6.A0K(r7, r0)
            goto L_0x00c5
        L_0x00fe:
            boolean r0 = r12 instanceof X.AnonymousClass4u3
            X.C626936e.A0C(r0)
            X.4u3 r12 = (X.AnonymousClass4u3) r12
            X.33j r10 = r8.A11
            long r2 = r12.A00
            boolean r7 = r12.A01
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.C107175ap.A00(r0, r2)
            java.lang.String r12 = X.C107145am.A00(r10, r2)
            r11 = 1
            if (r0 != 0) goto L_0x0157
            r1 = 2131891679(0x7f1215df, float:1.9418085E38)
        L_0x011d:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r4] = r12
        L_0x0121:
            java.lang.String r0 = r8.getString(r1, r0)
            java.lang.String r1 = X.C107145am.A01(r10, r0, r2)
            if (r18 == 0) goto L_0x014e
            r0 = 2131891682(0x7f1215e2, float:1.941809E38)
            if (r7 == 0) goto L_0x0133
            r0 = 2131891681(0x7f1215e1, float:1.9418089E38)
        L_0x0133:
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r8, r1, r11, r0)
            r5.setClickable(r4)
            r6.setVisibility(r4)
            r0 = 0
            r6.A0K(r0, r1)
            if (r17 == 0) goto L_0x00e6
            r9.setVisibility(r4)
            r1 = r19
            r0 = r17
            r9.A0K(r1, r0)
            return
        L_0x014e:
            r0 = 2131891677(0x7f1215dd, float:1.941808E38)
            if (r7 == 0) goto L_0x0133
            r0 = 2131891676(0x7f1215dc, float:1.9418079E38)
            goto L_0x0133
        L_0x0157:
            if (r0 != r11) goto L_0x015d
            r1 = 2131891680(0x7f1215e0, float:1.9418087E38)
            goto L_0x011d
        L_0x015d:
            java.lang.String r0 = X.C107505bQ.A06(r10, r2)
            r1 = 2131891678(0x7f1215de, float:1.9418083E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r0, r4)
            r0[r11] = r12
            goto L_0x0121
        L_0x016b:
            X.5ZU r4 = r8.A0t
            r0 = r16
            X.7HU r0 = r4.A0B(r3, r0)
            X.58i r4 = r0.A00
            boolean r24 = r3.A0V()
            r20 = r0
            r21 = r3
            r22 = r7
            r23 = r16
            r19 = r5
            r19.A07(r20, r21, r22, r23, r24)
            X.5Uq r0 = r8.A0v
            android.widget.ImageView r5 = r14.A02
            r0.A08(r5, r3)
            goto L_0x0063
        L_0x018f:
            android.view.View r7 = r14.A00
            r0 = 2131886117(0x7f120025, float:1.9406804E38)
            X.C107295b4.A03(r7, r0)
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            X.5MG r12 = new X.5MG
            r12.<init>(r8)
            r0 = 2131896402(0x7f122852, float:1.9427664E38)
            java.lang.String r0 = r12.A03(r0)
            r7.append(r0)
            java.lang.String r0 = X.C627336j.A07(r2)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r7)
            X.AnonymousClass0YZ.A0F(r5, r0)
            r0 = 10
            X.AnonymousClass54E.A00(r5, r2, r14, r0)
            boolean r0 = r5 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            r14 = r27
            if (r0 == 0) goto L_0x01e0
            r12 = r5
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r12 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r12
            if (r27 == 0) goto L_0x0210
            int r7 = r14.A01
            if (r7 <= 0) goto L_0x020d
            X.593 r0 = X.AnonymousClass593.UNSEEN
        L_0x01cb:
            X.AnonymousClass576.A00(r12, r0)
            boolean r0 = r8.A2D
            r16 = r0
            r15 = 1
            boolean r0 = r14.A00()
            if (r0 != r15) goto L_0x0210
            if (r7 > 0) goto L_0x01dd
            if (r16 == 0) goto L_0x0210
        L_0x01dd:
            r12.setStatusIndicatorEnabled(r15)
        L_0x01e0:
            if (r27 == 0) goto L_0x01ef
            boolean r0 = r14.A00()
            if (r0 == 0) goto L_0x01ef
            int r7 = r14.A01
            r0 = 2131886123(0x7f12002b, float:1.9406816E38)
            if (r7 > 0) goto L_0x01f2
        L_0x01ef:
            r0 = 2131886122(0x7f12002a, float:1.9406814E38)
        L_0x01f2:
            X.C107295b4.A03(r5, r0)
            X.10x r0 = r8.A1R
            boolean r0 = r0.A0F(r2)
            if (r0 == 0) goto L_0x0212
            r0 = 2131100235(0x7f06024b, float:1.7812846E38)
            X.AnonymousClass0x2.A0q(r8, r1, r0)
            X.AnonymousClass0x2.A0q(r8, r6, r0)
            r0 = 2131894308(0x7f122024, float:1.9423417E38)
            r6.setText(r0)
            return
        L_0x020d:
            X.593 r0 = X.AnonymousClass593.SEEN
            goto L_0x01cb
        L_0x0210:
            r15 = 0
            goto L_0x01dd
        L_0x0212:
            X.2sj r1 = r8.A0O
            X.1fJ r0 = r8.A1h
            X.C626936e.A06(r2)
            boolean r0 = r1.A0I(r0, r2)
            if (r0 == 0) goto L_0x0236
            r11.setVisibility(r4)
            X.2ss r1 = r8.A0L
            X.1fJ r0 = r8.A1h
            int r2 = r1.A06(r0)
            r1 = 3
            r0 = 2131889771(0x7f120e6b, float:1.9414215E38)
            if (r2 != r1) goto L_0x0233
            r0 = 2131887930(0x7f12073a, float:1.941048E38)
        L_0x0233:
            r11.setText(r0)
        L_0x0236:
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x0246
            r13.setVisibility(r4)
            r1 = r19
            r0 = r17
            r13.A0K(r1, r0)
        L_0x0246:
            X.1VX r0 = r8.A0D
            boolean r0 = r0.A0X(r9)
            if (r0 == 0) goto L_0x0262
            X.2sH r0 = r8.A06
            java.lang.String r1 = X.AnonymousClass31U.A01(r8, r0, r3)
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 != 0) goto L_0x026c
            r6.setVisibility(r4)
        L_0x025d:
            r0 = 0
            r6.A0K(r0, r1)
            return
        L_0x0262:
            java.lang.String r0 = r3.A0X
            if (r0 == 0) goto L_0x026c
            r6.setVisibility(r4)
            java.lang.String r1 = r3.A0X
            goto L_0x025d
        L_0x026c:
            r6.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95644u1.A00(X.65F, X.5OF, java.util.ArrayList):void");
    }
}
