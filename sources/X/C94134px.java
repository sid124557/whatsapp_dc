package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4px  reason: invalid class name and case insensitive filesystem */
public class C94134px extends AnonymousClass5ZN implements C179258ir {
    public C990054b A00;
    public AnonymousClass4q0 A01;
    public AnonymousClass4q8 A02;
    public AnonymousClass4q8 A03;
    public AnonymousClass5OF A04;
    public final int A05;
    public final C116985rC A06;
    public final C53582nK A07;
    public final C69263Wi A08;
    public final C56722sS A09;
    public final C56942so A0A;
    public final AnonymousClass5UX A0B;
    public final C105365Uq A0C;
    public final C103445Mz A0D;
    public final C1230266t A0E;
    public final AnonymousClass33p A0F;
    public final C56762sW A0G;
    public final C56542sA A0H;
    public final C56322rn A0I;
    public final C56152rV A0J;
    public final C620333f A0K;
    public final AnonymousClass2R8 A0L;
    public final C40532Gt A0M;
    public final C43642Sx A0N;
    public final AnonymousClass1R1 A0O;
    public final AnonymousClass4FS A0P;
    public final C156257gJ A0Q = new C140026t2(AnonymousClass592.VIDEO);
    public final C156257gJ A0R = new C140026t2(AnonymousClass592.VOICE);
    public final C156257gJ A0S = new C140026t2(AnonymousClass592.VOICE_CHAT);
    public final Runnable A0T = C117625sE.A00(this, 26);

    public static void A00(View view, ViewHolder viewHolder) {
        view.setVisibility(8);
        viewHolder.A0J.setVisibility(8);
        viewHolder.A08.setVisibility(8);
        viewHolder.A0H.setVisibility(8);
        viewHolder.A0D.setVisibility(8);
        viewHolder.A0E.setVisibility(8);
        viewHolder.A0T.setVisibility(8);
        viewHolder.A0F.setVisibility(8);
        viewHolder.A02.setVisibility(8);
        viewHolder.A0F(false, false);
    }

    public void A07(AnonymousClass5T4 r3) {
        AnonymousClass3ZH r1 = r3.A04;
        if (A0K(r1)) {
            A0B(this.A06.A0H(r1), false);
        } else {
            super.A07(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r10.A0A.A0C() != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A08(X.AnonymousClass659 r11, X.C182338oF r12, int r13, boolean r14) {
        /*
            r10 = this;
            X.4zQ r11 = (X.C97884zQ) r11
            X.4uZ r3 = r11.B8o()
            X.5Kt r1 = r10.A0D(r3)
            int r2 = r10.A05
            r0 = 4
            if (r2 == r0) goto L_0x0182
            r0 = 3
            if (r2 == r0) goto L_0x0182
            r0 = 5
            if (r2 == r0) goto L_0x0182
            r0 = 6
            r4 = 0
            if (r2 == r0) goto L_0x0182
            r0 = 1
            if (r2 != r0) goto L_0x0081
            X.2so r0 = r10.A0A
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0081
        L_0x0024:
            com.whatsapp.conversationslist.ViewHolder r7 = r10.A08
            android.widget.ImageView r5 = r7.A0B
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2131165882(0x7f0702ba, float:1.7945994E38)
            if (r4 == 0) goto L_0x0034
            r0 = 2131165780(0x7f070254, float:1.7945787E38)
        L_0x0034:
            int r4 = r6.getDimensionPixelSize(r0)
            r8 = 4
            r0 = 2131165912(0x7f0702d8, float:1.7946055E38)
            if (r2 != r8) goto L_0x0041
            r0 = 2131166147(0x7f0703c3, float:1.7946531E38)
        L_0x0041:
            int r9 = r6.getDimensionPixelSize(r0)
            r0 = 2131165887(0x7f0702bf, float:1.7946004E38)
            if (r2 != r8) goto L_0x004d
            r0 = 2131166147(0x7f0703c3, float:1.7946531E38)
        L_0x004d:
            int r8 = r6.getDimensionPixelSize(r0)
            r0 = 2131168276(0x7f070c14, float:1.795085E38)
            int r2 = r6.getDimensionPixelSize(r0)
            android.view.View r0 = r7.A05
            X.C107235av.A04(r0, r9, r8)
            com.whatsapp.WaImageView r0 = r7.A0S
            X.C107235av.A04(r0, r2, r2)
            android.widget.ImageView r0 = r7.A0F
            X.C107235av.A04(r0, r2, r2)
            android.widget.ImageView r0 = r7.A0E
            X.C107235av.A04(r0, r2, r2)
            X.6xO r2 = X.C142556xO.SMALL
            int r0 = r2.dimension
            int r0 = r6.getDimensionPixelSize(r0)
            if (r4 == r0) goto L_0x0078
            X.6xO r2 = X.C142556xO.MEDIUM
        L_0x0078:
            boolean r0 = r5 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x017d
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r5 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r5
            r5.setProfilePhotoSize(r2)
        L_0x0081:
            boolean r0 = r11 instanceof X.C97914zU
            if (r0 == 0) goto L_0x017a
            r0 = r11
            X.4zU r0 = (X.C97914zU) r0
            java.util.Set r4 = r0.A01
        L_0x008a:
            if (r1 == 0) goto L_0x00cc
            r10.A0G(r1, r12, r4, r13)
        L_0x008f:
            com.whatsapp.jid.GroupJid r5 = X.AnonymousClass32V.A00(r3)
            X.1VX r1 = r10.A0F
            r0 = 6120(0x17e8, float:8.576E-42)
            int r1 = r1.A0N(r0)
            r0 = 1
            if (r1 < r0) goto L_0x0197
            X.8qC r0 = r10.A0P
            java.lang.Object r6 = r0.get()
            X.34o r6 = (X.C623234o) r6
            if (r5 == 0) goto L_0x00cb
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.2sW r0 = r6.A05
            java.util.Map r0 = r0.A0O
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x00cb
            X.2rn r0 = r10.A0I
            X.2mt r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x0185
            X.2sW r2 = r10.A0G
            long r0 = r0.A00
            X.3ZF r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0185
            r6.A06(r5, r0)
        L_0x00cb:
            return
        L_0x00cc:
            r7 = 1
            if (r14 == 0) goto L_0x010e
            r1 = 0
            X.4q8 r0 = new X.4q8
            r0.<init>(r10, r3, r1)
            r10.A02 = r0
            java.lang.Object r0 = r0.call()
            X.5Kt r0 = (X.C102915Kt) r0
            r10.A0G(r0, r12, r4, r13)
            X.2ss r0 = r10.A0D
            X.31A r2 = r0.A0A(r3, r1)
            X.1VX r1 = r10.A0F
            r0 = 1605(0x645, float:2.249E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x008f
            long r5 = r2.A00()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            X.4q8 r2 = new X.4q8
            r2.<init>(r10, r3, r7)
            r10.A03 = r2
            X.5Mz r1 = r10.A0D
            X.5lG r0 = new X.5lG
            r0.<init>(r10, r12, r4, r13)
            r1.A02(r0, r2)
            goto L_0x008f
        L_0x010e:
            X.4q8 r0 = new X.4q8
            r0.<init>(r10, r3, r7)
            r10.A02 = r0
            android.content.Context r2 = r10.A01
            X.C626936e.A06(r2)
            com.whatsapp.conversationslist.ViewHolder r6 = r10.A08
            android.view.View r0 = r6.A06
            r5 = 0
            r0.setPadding(r5, r5, r5, r5)
            android.widget.ImageView r8 = r6.A0B
            r8.setEnabled(r5)
            android.view.View r7 = r6.A05
            r0 = 0
            r7.setOnClickListener(r0)
            r8.setOnClickListener(r0)
            r7.setOnLongClickListener(r0)
            r8.setOnLongClickListener(r0)
            r0 = 2131231649(0x7f0803a1, float:1.8079385E38)
            r8.setImageResource(r0)
            X.5UX r1 = r10.A0B
            X.4uZ r0 = r11.B8o()
            int r0 = r1.A01(r0, r5)
            r1.A06(r8, r0)
            r7.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r0 = r6.A0Q
            A00(r0, r6)
            X.5Tm r0 = r6.A0c
            r0.A01()
            com.whatsapp.TextEmojiLabel r1 = r6.A0P
            r1.setVisibility(r5)
            r0 = 2131101333(0x7f060695, float:1.7815073E38)
            X.AnonymousClass0x2.A0q(r2, r1, r0)
            r1.A0A()
            X.C86634Kw.A1I(r1)
            r0 = 80
            r1.setPlaceholder(r0)
            X.5Mz r2 = r10.A0D
            X.4q8 r1 = r10.A02
            X.8G6 r0 = new X.8G6
            r0.<init>(r10, r12, r4, r13)
            r2.A02(r0, r1)
            goto L_0x008f
        L_0x017a:
            r4 = 0
            goto L_0x008a
        L_0x017d:
            X.C107235av.A04(r5, r4, r4)
            goto L_0x0081
        L_0x0182:
            r4 = 1
            goto L_0x0024
        L_0x0185:
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.4q0 r4 = new X.4q0
            r4.<init>(r10, r3)
            r10.A01 = r4
            X.5Mz r2 = r10.A0D
            r0 = 1
            X.91K r1 = new X.91K
            r1.<init>(r6, r0, r5)
            goto L_0x01c2
        L_0x0197:
            r0 = 0
            if (r5 == 0) goto L_0x01ac
            X.2rn r0 = r10.A0I
            X.2mt r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x01b0
            X.2sW r2 = r10.A0G
            long r0 = r0.A00
            X.3ZF r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x01b0
        L_0x01ac:
            r10.A0I(r3, r0)
            return
        L_0x01b0:
            r0 = r3
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            X.4q0 r4 = new X.4q0
            r4.<init>(r10, r0)
            r10.A01 = r4
            X.5Mz r2 = r10.A0D
            r0 = 0
            X.91K r1 = new X.91K
            r1.<init>(r10, r0, r3)
        L_0x01c2:
            r2.A02(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94134px.A08(X.659, X.8oF, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (r14 != null) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C102915Kt A0D(X.C95814uZ r21) {
        /*
            r20 = this;
            r7 = r21
            r5 = r20
            X.3Ex r6 = r5.A05
            X.3ZH r11 = r6.A06(r7)
            X.1R1 r0 = r5.A0O
            X.2sa r16 = r0.A0L(r7)
            com.whatsapp.jid.GroupJid r1 = X.AnonymousClass32V.A00(r7)
            boolean r0 = r5.A0L(r7)
            r4 = 0
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L_0x009f
            X.8qC r0 = r5.A0P
            java.lang.Object r0 = r0.get()
            X.34o r0 = (X.C623234o) r0
            X.C162457s7.A0J(r7, r4)
            X.2sW r0 = r0.A05
            java.util.Map r0 = r0.A0O
            java.lang.Object r14 = r0.get(r7)
            X.34x r14 = (X.C624134x) r14
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r15 = r10
        L_0x0037:
            if (r14 == 0) goto L_0x0167
        L_0x0039:
            if (r11 == 0) goto L_0x0167
            X.2sr r7 = r5.A02
            X.2sS r2 = r5.A09
            X.4uZ r1 = r14.A0n()
            if (r1 == 0) goto L_0x009a
            boolean r0 = X.C155477ey.A00(r1)
            if (r0 == 0) goto L_0x009a
            X.2m4 r0 = r2.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x009a
        L_0x0053:
            if (r15 == 0) goto L_0x0098
            X.1mH r0 = r15.A01
            X.4uZ r0 = r0.A0n()
            if (r0 == 0) goto L_0x0098
            X.3ZH r12 = r6.A06(r0)
        L_0x0061:
            if (r1 == 0) goto L_0x0096
            X.3ZH r13 = r6.A06(r1)
        L_0x0067:
            java.lang.Boolean r18 = java.lang.Boolean.TRUE
            if (r15 == 0) goto L_0x007e
            X.1mH r0 = r15.A01
            X.2z0 r2 = r0.A1J
            X.4uZ r0 = r2.A00
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 == 0) goto L_0x007e
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x007e
            if (r12 != 0) goto L_0x007e
            r4 = 1
        L_0x007e:
            if (r11 == 0) goto L_0x0095
            if (r14 == 0) goto L_0x0095
            if (r16 == 0) goto L_0x0095
            if (r13 != 0) goto L_0x0088
            if (r1 != 0) goto L_0x0095
        L_0x0088:
            if (r4 != 0) goto L_0x0095
            X.5OF r0 = r5.A04
            X.5Kt r10 = new X.5Kt
            r17 = r0
            r19 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0095:
            return r10
        L_0x0096:
            r13 = r10
            goto L_0x0067
        L_0x0098:
            r12 = r10
            goto L_0x0061
        L_0x009a:
            X.4uZ r1 = X.C106795aB.A00(r7, r11, r14)
            goto L_0x0053
        L_0x009f:
            X.2ss r2 = r5.A0D
            int r0 = r2.A06(r1)
            if (r0 != r9) goto L_0x0108
            X.2so r0 = r5.A0A
            X.1fJ r7 = (X.C27991fJ) r7
            java.util.List r1 = r0.A04(r7)
            int r0 = X.C86654Ky.A06(r1, r9)
            java.util.List r3 = r1.subList(r4, r0)
            int r0 = r3.size()
            if (r0 != r9) goto L_0x0165
            java.lang.Object r0 = r3.get(r4)
            X.2mC r0 = (X.C52882mC) r0
            if (r0 == 0) goto L_0x0106
            com.whatsapp.jid.GroupJid r1 = r0.A02
            if (r1 == 0) goto L_0x0106
            boolean r0 = r5.A0L(r1)
            if (r0 == 0) goto L_0x00fd
            X.8qC r0 = r5.A0P
            java.lang.Object r0 = r0.get()
            X.34o r0 = (X.C623234o) r0
            X.2sW r0 = r0.A05
            java.util.Map r0 = r0.A0O
            java.lang.Object r14 = r0.get(r1)
            X.34x r14 = (X.C624134x) r14
        L_0x00e1:
            if (r14 == 0) goto L_0x0166
            X.33f r1 = r5.A0K
            X.2z0 r0 = r14.A1J
            X.4uZ r2 = r0.A00
            X.2ss r0 = r1.A08
            X.31A r0 = r0.A0A(r2, r4)
            if (r0 != 0) goto L_0x0102
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageAddOnManager/getLastChatsListCachedDisplayedMessageAddOnV2/no chat for "
            X.C18260x0.A1S(r1, r0, r2)
            r15 = 0
            goto L_0x0039
        L_0x00fd:
            X.34x r14 = r2.A0C(r1)
            goto L_0x00e1
        L_0x0102:
            X.2Lw r15 = r0.A0f
            goto L_0x0039
        L_0x0106:
            r14 = 0
            goto L_0x0166
        L_0x0108:
            X.34x r14 = r2.A0C(r7)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            X.33f r0 = r5.A0K
            X.2ss r0 = r0.A08
            X.31A r0 = r0.A0A(r7, r4)
            if (r0 != 0) goto L_0x0162
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageAddOnManager/getLastChatsListCachedDisplayedMessageAddOnV2/no chat for "
            X.C18260x0.A1S(r1, r0, r7)
            r15 = 0
        L_0x0124:
            X.1VX r1 = r5.A0F
            r0 = 6579(0x19b3, float:9.219E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0037
            if (r14 == 0) goto L_0x0167
            X.2sH r1 = r5.A0A
            java.lang.Long r0 = r14.A0r
            if (r0 == 0) goto L_0x0039
            long r7 = r0.longValue()
            long r1 = r1.A0H()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
            int r0 = r14.A0j()
            if (r0 == r9) goto L_0x0039
            X.2sA r7 = r5.A0H
            X.8qC r0 = r7.A02
            java.lang.Object r0 = r0.get()
            X.2UO r0 = (X.AnonymousClass2UO) r0
            X.2m9 r2 = r0.A09
            r0 = 14
            X.3Zw r1 = new X.3Zw
            r1.<init>(r7, r0, r14)
            r0 = 20
            r2.A01(r1, r0)
            goto L_0x0039
        L_0x0162:
            X.2Lw r15 = r0.A0f
            goto L_0x0124
        L_0x0165:
            r14 = r10
        L_0x0166:
            r15 = r10
        L_0x0167:
            r1 = r10
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94134px.A0D(X.4uZ):X.5Kt");
    }

    public final void A0E(int i) {
        int i2 = this.A05;
        if (i2 != 3 && i2 != 4) {
            C105075Tm r3 = this.A08.A0c;
            Context context = this.A01;
            C626936e.A06(context);
            int i3 = R.color.f5nameremoved;
            if (i > 0) {
                i3 = AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved);
            }
            int A042 = AnonymousClass0Y8.A04(context, i3);
            ConversationListRowHeaderView conversationListRowHeaderView = r3.A03;
            conversationListRowHeaderView.A01.setTextColor(A042);
            WaTextView waTextView = conversationListRowHeaderView.A01;
            if (i > 0) {
                C106905aM.A04(waTextView);
            } else {
                waTextView.A0A();
            }
        }
    }

    public final void A0F(C158447jz r14) {
        int i = r14.A02;
        int i2 = r14.A01;
        int i3 = r14.A00;
        ViewHolder viewHolder = this.A08;
        C105075Tm r5 = viewHolder.A0c;
        ConversationListRowHeaderView conversationListRowHeaderView = r5.A03;
        conversationListRowHeaderView.A01.setVisibility(8);
        C106905aM.A04(viewHolder.A0Q);
        int i4 = 8;
        if (i2 > 0) {
            i4 = 0;
        }
        conversationListRowHeaderView.getUnreadImportantIndicatorView().setVisibility(i4);
        viewHolder.A03.setVisibility(0);
        viewHolder.A0J.setVisibility(8);
        viewHolder.A0S.setVisibility(8);
        if (i > 0) {
            C620733j r7 = this.A0C;
            long j = (long) i;
            conversationListRowHeaderView.getUnreadIndicatorView().setText(r7.A0M().format(j));
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, i, 0);
            conversationListRowHeaderView.getUnreadIndicatorView().setContentDescription(r7.A0L(objArr, R.plurals.f9nameremoved, j));
            r5.A00();
            if (i3 > 1) {
                Context context = conversationListRowHeaderView.getUnreadIndicatorView().getContext();
                if (C105075Tm.A07 == null || r5.A03()) {
                    C105075Tm.A07 = C107335b8.A04(context, R.drawable.ic_drill_in_chevron, R.color.f5nameremoved);
                }
                Drawable drawable = C105075Tm.A07;
                int dimensionPixelSize = conversationListRowHeaderView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                C620733j r8 = r5.A06;
                C107555bV.A07(conversationListRowHeaderView.getUnreadIndicatorView(), r8, dimensionPixelSize, 0, 0, 0);
                WaTextView unreadIndicatorView = conversationListRowHeaderView.getUnreadIndicatorView();
                if (C102805Ki.A00(r8)) {
                    unreadIndicatorView.setCompoundDrawablesWithIntrinsicBounds(new C131666dx(drawable, r8), (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    unreadIndicatorView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
        } else {
            if (r5.A00 == null) {
                Context context2 = conversationListRowHeaderView.getContext();
                r5.A00 = new C131666dx(C02680He.A00(context2.getTheme(), context2.getResources(), R.drawable.vec_chevron_pill), r5.A06);
            }
            conversationListRowHeaderView.getUnreadIndicatorView().setText((CharSequence) null);
            conversationListRowHeaderView.getUnreadIndicatorView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            conversationListRowHeaderView.getUnreadIndicatorView().setBackground(r5.A00);
        }
        conversationListRowHeaderView.getUnreadIndicatorView().setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0455, code lost:
        if (r2 == 5) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0561, code lost:
        if (r2 == 10) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05e8, code lost:
        if (r22 != false) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05ec, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x060b, code lost:
        if (r35.A06((X.C27991fJ) r4) != 3) goto L_0x060d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0610, code lost:
        if (r0 != false) goto L_0x0612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0133, code lost:
        if (r2 != 10) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0071, code lost:
        if (r10 != 3) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ee, code lost:
        if (r7.A0U() == false) goto L_0x0207;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0623 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0688  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x06d2  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0250  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(X.C102915Kt r42, X.C182338oF r43, java.util.Set r44, int r45) {
        /*
            r41 = this;
            r40 = r42
            r0 = r40
            X.3ZH r7 = r0.A00
            X.3ZH r0 = r0.A02
            r26 = r0
            r0 = r40
            X.2Lw r0 = r0.A04
            r38 = r0
            r0 = r40
            X.3ZH r0 = r0.A01
            r25 = r0
            r0 = r40
            X.34x r0 = r0.A03
            r20 = r0
            r0 = r40
            java.util.List r0 = r0.A08
            r29 = r0
            r0 = r40
            X.2sa r5 = r0.A05
            long r3 = r5.A00()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r22 = X.AnonymousClass000.A1S(r0)
            boolean r0 = r5.A0H
            r21 = r0
            r6 = r41
            android.content.Context r0 = r6.A01
            r37 = r0
            X.C626936e.A06(r37)
            com.whatsapp.conversationslist.ViewHolder r5 = r6.A08     // Catch:{ all -> 0x072e }
            android.view.View r0 = r5.A06     // Catch:{ all -> 0x072e }
            r24 = r0
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ all -> 0x072e }
            com.whatsapp.TextEmojiLabel r0 = r5.A0P     // Catch:{ all -> 0x072e }
            r36 = r0
            r0.setPlaceholder(r1)     // Catch:{ all -> 0x072e }
            X.4uZ r4 = X.AnonymousClass3ZH.A01(r7)     // Catch:{ all -> 0x072e }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x072e }
            X.1fJ r13 = X.AnonymousClass34R.A01(r4)     // Catch:{ all -> 0x072e }
            X.2ss r0 = r6.A0D     // Catch:{ all -> 0x072e }
            r35 = r0
            int r10 = r0.A06(r13)     // Catch:{ all -> 0x072e }
            X.2so r0 = r6.A0A     // Catch:{ all -> 0x072e }
            r23 = r0
            boolean r0 = r23.A0C()     // Catch:{ all -> 0x072e }
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0073
            r0 = 3
            r14 = 1
            if (r10 == r0) goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            android.widget.ImageView r9 = r5.A0B     // Catch:{ all -> 0x072e }
            r3 = r9
            boolean r0 = r9 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto     // Catch:{ all -> 0x072e }
            r19 = r0
            if (r0 == 0) goto L_0x0085
            r1 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1     // Catch:{ all -> 0x072e }
            X.6xh r0 = X.C142746xh.CIRCLE     // Catch:{ all -> 0x072e }
            r1.setProfilePhotoShape(r0)     // Catch:{ all -> 0x072e }
        L_0x0085:
            int r2 = r6.A05     // Catch:{ all -> 0x072e }
            r0 = 4
            if (r2 == r0) goto L_0x013f
            r0 = 3
            if (r2 == r0) goto L_0x013f
            r0 = 5
            if (r2 == r0) goto L_0x013f
            r0 = 6
            r18 = 0
            if (r2 == r0) goto L_0x013f
            if (r14 == 0) goto L_0x00a1
            X.1VX r1 = r6.A0F     // Catch:{ all -> 0x072e }
            r0 = 4160(0x1040, float:5.83E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x012f
        L_0x00a1:
            if (r2 != r12) goto L_0x00ab
            boolean r0 = r23.A0C()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x00ab
            if (r21 == 0) goto L_0x0135
        L_0x00ab:
            r0 = r23
            boolean r0 = r0.A0K(r13, r10)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x012f
            X.5UY r1 = r5.A16     // Catch:{ all -> 0x072e }
            android.view.View r8 = r1.A04()     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x072e }
            boolean r0 = r8 instanceof com.whatsapp.community.SubgroupWithParentView     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x010b
            com.whatsapp.community.SubgroupWithParentView r8 = (com.whatsapp.community.SubgroupWithParentView) r8     // Catch:{ all -> 0x072e }
            X.5Uq r0 = r6.A0C     // Catch:{ all -> 0x072e }
            r8.setSubgroupProfilePhoto(r7, r10, r0)     // Catch:{ all -> 0x072e }
            X.4uZ r0 = r7.A0H     // Catch:{ all -> 0x072e }
            android.view.View r8 = r8.getTransitionView()     // Catch:{ all -> 0x072e }
            A01(r8, r0)     // Catch:{ all -> 0x072e }
        L_0x00cf:
            r0 = 8
            r9.setVisibility(r0)     // Catch:{ all -> 0x072e }
            r1.A06(r11)     // Catch:{ all -> 0x072e }
            X.5UY r8 = r5.A15     // Catch:{ all -> 0x072e }
            r8.A06(r0)     // Catch:{ all -> 0x072e }
            r0 = r23
            boolean r0 = r0.A0J(r13, r10)     // Catch:{ all -> 0x072e }
            android.view.View r13 = r1.A04()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x011d
            X.2oU r0 = r6.A0B     // Catch:{ all -> 0x072e }
            java.lang.Object[] r9 = new java.lang.Object[r12]     // Catch:{ all -> 0x072e }
            X.5ZU r8 = r6.A06     // Catch:{ all -> 0x072e }
            X.C18300x5.A1E(r8, r7, r9, r11)     // Catch:{ all -> 0x072e }
            r8 = 2131886187(0x7f12006b, float:1.9406946E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)     // Catch:{ all -> 0x072e }
            java.lang.String r0 = r0.getString(r8, r9)     // Catch:{ all -> 0x072e }
            r13.setContentDescription(r0)     // Catch:{ all -> 0x072e }
            android.view.View r1 = r1.A04()     // Catch:{ all -> 0x072e }
            r0 = 2131886194(0x7f120072, float:1.940696E38)
            X.C107295b4.A03(r1, r0)     // Catch:{ all -> 0x072e }
            goto L_0x0207
        L_0x010b:
            boolean r0 = r8 instanceof com.whatsapp.community.SubgroupPileView     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0117
            com.whatsapp.community.SubgroupPileView r8 = (com.whatsapp.community.SubgroupPileView) r8     // Catch:{ all -> 0x072e }
            X.5Uq r0 = r6.A0C     // Catch:{ all -> 0x072e }
            r8.setSubgroupProfilePhoto(r7, r10, r11, r0)     // Catch:{ all -> 0x072e }
            goto L_0x00cf
        L_0x0117:
            java.lang.String r0 = "ConversationViewFiller/setSubgroupProfilePhotoPerType/Unexpected class instance"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x072e }
            goto L_0x00cf
        L_0x011d:
            r0 = 2131886195(0x7f120073, float:1.9406962E38)
            X.C107295b4.A03(r13, r0)     // Catch:{ all -> 0x072e }
            boolean r0 = r7.A0U()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0207
            android.view.View r9 = r1.A04()     // Catch:{ all -> 0x072e }
            goto L_0x01f0
        L_0x012f:
            if (r2 == r12) goto L_0x0135
            r0 = 10
            if (r2 != r0) goto L_0x013c
        L_0x0135:
            boolean r0 = r23.A0C()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x013c
            goto L_0x0141
        L_0x013c:
            r17 = 0
            goto L_0x0143
        L_0x013f:
            r18 = 1
        L_0x0141:
            r17 = 1
        L_0x0143:
            r8 = 8
            r9.setVisibility(r11)     // Catch:{ all -> 0x072e }
            X.5UY r1 = r5.A16     // Catch:{ all -> 0x072e }
            r1.A06(r8)     // Catch:{ all -> 0x072e }
            X.5UY r0 = r5.A15     // Catch:{ all -> 0x072e }
            r0.A06(r8)     // Catch:{ all -> 0x072e }
            if (r14 == 0) goto L_0x01a8
            if (r19 == 0) goto L_0x015e
            r1 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1     // Catch:{ all -> 0x072e }
            X.6xh r0 = X.C142746xh.SQUIRCLE     // Catch:{ all -> 0x072e }
            r1.setProfilePhotoShape(r0)     // Catch:{ all -> 0x072e }
        L_0x015e:
            X.5Uq r0 = r6.A0C     // Catch:{ all -> 0x072e }
            r0.A01(r9)     // Catch:{ all -> 0x072e }
            android.content.res.Resources r16 = r9.getResources()     // Catch:{ all -> 0x072e }
            if (r17 == 0) goto L_0x0174
            boolean r0 = X.C1001059l.A03     // Catch:{ all -> 0x072e }
            r8 = 2131231003(0x7f08011b, float:1.8078075E38)
            if (r0 == 0) goto L_0x0177
            r8 = 2131231004(0x7f08011c, float:1.8078077E38)
            goto L_0x0177
        L_0x0174:
            r8 = 2131233887(0x7f080c5f, float:1.8083924E38)
        L_0x0177:
            android.content.res.Resources$Theme r14 = X.C86614Ku.A0C(r9)     // Catch:{ all -> 0x072e }
            X.922 r1 = new X.922     // Catch:{ all -> 0x072e }
            r1.<init>(r12)     // Catch:{ all -> 0x072e }
            X.1VX r0 = r6.A0F     // Catch:{ all -> 0x072e }
            r15 = r14
            r14 = r16
            android.graphics.drawable.Drawable r0 = X.C59862xc.A00(r15, r14, r1, r0, r8)     // Catch:{ all -> 0x072e }
            r9.setImageDrawable(r0)     // Catch:{ all -> 0x072e }
            if (r2 == r12) goto L_0x0192
            r0 = 10
            if (r2 != r0) goto L_0x0199
        L_0x0192:
            boolean r0 = r23.A0C()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0199
            goto L_0x01e4
        L_0x0199:
            if (r17 != 0) goto L_0x01e4
            if (r13 == 0) goto L_0x01e4
            X.4FS r1 = r6.A0P     // Catch:{ all -> 0x072e }
            X.68N r0 = new X.68N     // Catch:{ all -> 0x072e }
            r0.<init>(r13, r12, r6)     // Catch:{ all -> 0x072e }
            X.AnonymousClass0x7.A1B(r0, r1)     // Catch:{ all -> 0x072e }
            goto L_0x01e4
        L_0x01a8:
            if (r10 != r12) goto L_0x01ab
            goto L_0x01c6
        L_0x01ab:
            r9.setVisibility(r11)     // Catch:{ all -> 0x072e }
            r1.A06(r8)     // Catch:{ all -> 0x072e }
            r0.A06(r8)     // Catch:{ all -> 0x072e }
            if (r10 != r12) goto L_0x01c0
            if (r19 == 0) goto L_0x01c0
            r1 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1     // Catch:{ all -> 0x072e }
            X.6xh r0 = X.C142746xh.SQUIRCLE     // Catch:{ all -> 0x072e }
            r1.setProfilePhotoShape(r0)     // Catch:{ all -> 0x072e }
        L_0x01c0:
            X.5Uq r0 = r6.A0C     // Catch:{ all -> 0x072e }
            r0.A08(r9, r7)     // Catch:{ all -> 0x072e }
            goto L_0x01e4
        L_0x01c6:
            r9.setVisibility(r8)     // Catch:{ all -> 0x072e }
            r1.A06(r8)     // Catch:{ all -> 0x072e }
            android.view.View r0 = X.AnonymousClass5UY.A00(r0, r11)     // Catch:{ all -> 0x072e }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x072e }
            boolean r1 = r0 instanceof com.whatsapp.community.CommunityStackView     // Catch:{ all -> 0x072e }
            if (r1 == 0) goto L_0x0215
            com.whatsapp.community.CommunityStackView r0 = (com.whatsapp.community.CommunityStackView) r0     // Catch:{ all -> 0x072e }
            X.5Uq r1 = r6.A0C     // Catch:{ all -> 0x072e }
            r0.setParentGroupProfilePhoto(r7, r1)     // Catch:{ all -> 0x072e }
            X.4uZ r1 = r7.A0H     // Catch:{ all -> 0x072e }
            com.whatsapp.WaImageView r0 = r0.A00     // Catch:{ all -> 0x072e }
            A01(r0, r1)     // Catch:{ all -> 0x072e }
        L_0x01e4:
            r0 = 2131886195(0x7f120073, float:1.9406962E38)
            X.C107295b4.A03(r9, r0)     // Catch:{ all -> 0x072e }
            boolean r0 = r7.A0U()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0207
        L_0x01f0:
            X.2oU r1 = r6.A0B     // Catch:{ all -> 0x072e }
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ all -> 0x072e }
            X.5ZU r0 = r6.A06     // Catch:{ all -> 0x072e }
            X.C18300x5.A1E(r0, r7, r8, r11)     // Catch:{ all -> 0x072e }
            r0 = 2131886168(0x7f120058, float:1.9406907E38)
            android.content.res.Resources r1 = X.C54292oU.A00(r1)     // Catch:{ all -> 0x072e }
            java.lang.String r0 = r1.getString(r0, r8)     // Catch:{ all -> 0x072e }
            r9.setContentDescription(r0)     // Catch:{ all -> 0x072e }
        L_0x0207:
            boolean r8 = r4 instanceof X.C28001fK     // Catch:{ all -> 0x072e }
            if (r8 != 0) goto L_0x021b
            r0 = r23
            boolean r0 = r0.A0E(r4)     // Catch:{ all -> 0x072e }
            r1 = 1
            if (r0 == 0) goto L_0x021c
            goto L_0x021b
        L_0x0215:
            java.lang.String r0 = "ConversationViewFiller/setParentGroupProfilePhoto/Unexpected class instance"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x072e }
            goto L_0x01e4
        L_0x021b:
            r1 = 0
        L_0x021c:
            com.whatsapp.components.SelectionCheckView r0 = r5.A0X     // Catch:{ all -> 0x072e }
            r0.setEnabled(r1)     // Catch:{ all -> 0x072e }
            X.66t r0 = r6.A0E     // Catch:{ all -> 0x072e }
            r34 = r0
            java.util.Set r0 = r34.BCh()     // Catch:{ all -> 0x072e }
            boolean r9 = r0.contains(r4)     // Catch:{ all -> 0x072e }
            r0 = r34
            boolean r12 = r0.Bj7(r4)     // Catch:{ all -> 0x072e }
            X.4uZ r0 = r34.B86()     // Catch:{ all -> 0x072e }
            boolean r13 = r4.equals(r0)     // Catch:{ all -> 0x072e }
            if (r9 == 0) goto L_0x024a
            int r1 = X.AnonymousClass5Yj.A05(r24)     // Catch:{ all -> 0x072e }
            r0 = r24
            r0.setBackgroundResource(r1)     // Catch:{ all -> 0x072e }
        L_0x0246:
            r5.A0F(r9, r12)     // Catch:{ all -> 0x072e }
            goto L_0x024e
        L_0x024a:
            X.C107235av.A02(r24)     // Catch:{ all -> 0x072e }
            goto L_0x0246
        L_0x024e:
            if (r13 == 0) goto L_0x02d0
            r34.Ayr()     // Catch:{ all -> 0x072e }
            android.content.Context r12 = r24.getContext()     // Catch:{ all -> 0x072e }
            r1 = 2130970370(0x7f040702, float:1.7549448E38)
            r0 = 2131102224(0x7f060a10, float:1.781688E38)
            if (r9 == 0) goto L_0x0265
            r1 = 2130969759(0x7f04049f, float:1.7548209E38)
            r0 = 2131101253(0x7f060645, float:1.781491E38)
        L_0x0265:
            int r1 = X.AnonymousClass5Yj.A02(r12, r1, r0)     // Catch:{ all -> 0x072e }
            r0 = r37
            int r12 = X.AnonymousClass0Y8.A04(r0, r1)     // Catch:{ all -> 0x072e }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r0
            r9 = 2131099675(0x7f06001b, float:1.781171E38)
            r0 = r37
            int r13 = X.AnonymousClass0Y8.A04(r0, r9)     // Catch:{ all -> 0x072e }
            X.5bx r9 = new X.5bx     // Catch:{ all -> 0x072e }
            r0 = r24
            r9.<init>(r0, r6, r1, r12)     // Catch:{ all -> 0x072e }
            android.animation.ArgbEvaluator r1 = new android.animation.ArgbEvaluator     // Catch:{ all -> 0x072e }
            r1.<init>()     // Catch:{ all -> 0x072e }
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x072e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x072e }
            r0[r11] = r12     // Catch:{ all -> 0x072e }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x072e }
            r11 = 1
            r0[r11] = r13     // Catch:{ all -> 0x072e }
            android.animation.ValueAnimator r11 = android.animation.ValueAnimator.ofObject(r1, r0)     // Catch:{ all -> 0x072e }
            r0 = 300(0x12c, double:1.48E-321)
            r11.setStartDelay(r0)     // Catch:{ all -> 0x072e }
            r0 = 550(0x226, double:2.717E-321)
            r11.setDuration(r0)     // Catch:{ all -> 0x072e }
            r11.addUpdateListener(r9)     // Catch:{ all -> 0x072e }
            r11.start()     // Catch:{ all -> 0x072e }
            android.animation.ArgbEvaluator r1 = new android.animation.ArgbEvaluator     // Catch:{ all -> 0x072e }
            r1.<init>()     // Catch:{ all -> 0x072e }
            r0 = 2
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r13, r12, r0)     // Catch:{ all -> 0x072e }
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofObject(r1, r0)     // Catch:{ all -> 0x072e }
            r0 = 2150(0x866, double:1.062E-320)
            r12.setDuration(r0)     // Catch:{ all -> 0x072e }
            r12.addUpdateListener(r9)     // Catch:{ all -> 0x072e }
            android.animation.AnimatorSet r1 = X.C86664Kz.A0O()     // Catch:{ all -> 0x072e }
            android.animation.AnimatorSet$Builder r0 = r1.play(r12)     // Catch:{ all -> 0x072e }
            r0.after(r11)     // Catch:{ all -> 0x072e }
            r1.start()     // Catch:{ all -> 0x072e }
        L_0x02d0:
            r0 = 1
            r39 = r45
            if (r8 != 0) goto L_0x02d6
            goto L_0x02f9
        L_0x02d6:
            r8 = r4
            X.1fK r8 = (X.C28001fK) r8     // Catch:{ all -> 0x072e }
            r0 = 44
            X.5eg r1 = new X.5eg     // Catch:{ all -> 0x072e }
            r1.<init>(r6, r0, r8)     // Catch:{ all -> 0x072e }
            r0 = 0
            r3.setEnabled(r0)     // Catch:{ all -> 0x072e }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x072e }
            r8 = 0
            r3.setOnLongClickListener(r8)     // Catch:{ all -> 0x072e }
            android.view.View r0 = r5.A0H     // Catch:{ all -> 0x072e }
            r0.setOnClickListener(r1)     // Catch:{ all -> 0x072e }
            r0.setOnLongClickListener(r8)     // Catch:{ all -> 0x072e }
            android.view.View r0 = r5.A05     // Catch:{ all -> 0x072e }
            r0.setOnClickListener(r1)     // Catch:{ all -> 0x072e }
            goto L_0x0336
        L_0x02f9:
            r3.setEnabled(r0)     // Catch:{ all -> 0x072e }
            A01(r3, r4)     // Catch:{ all -> 0x072e }
            r0 = 43
            X.5eg r9 = new X.5eg     // Catch:{ all -> 0x072e }
            r9.<init>(r6, r0, r4)     // Catch:{ all -> 0x072e }
            r8 = 5
            X.5f4 r1 = new X.5f4     // Catch:{ all -> 0x072e }
            r0 = r39
            r1.<init>(r6, r4, r0, r8)     // Catch:{ all -> 0x072e }
            r0 = 0
            X.699 r8 = new X.699     // Catch:{ all -> 0x072e }
            r8.<init>(r6, r4, r10, r0)     // Catch:{ all -> 0x072e }
            android.view.View$OnCreateContextMenuListener r0 = r34.BA9()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0323
            android.view.View r11 = r5.A0H     // Catch:{ all -> 0x072e }
            android.view.View$OnCreateContextMenuListener r0 = r34.BA9()     // Catch:{ all -> 0x072e }
            r11.setOnCreateContextMenuListener(r0)     // Catch:{ all -> 0x072e }
        L_0x0323:
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x072e }
            r3.setOnLongClickListener(r8)     // Catch:{ all -> 0x072e }
            android.view.View r0 = r5.A0H     // Catch:{ all -> 0x072e }
            r0.setOnClickListener(r9)     // Catch:{ all -> 0x072e }
            r0.setOnLongClickListener(r8)     // Catch:{ all -> 0x072e }
            android.view.View r0 = r5.A05     // Catch:{ all -> 0x072e }
            r0.setOnClickListener(r1)     // Catch:{ all -> 0x072e }
        L_0x0336:
            r0.setOnLongClickListener(r8)     // Catch:{ all -> 0x072e }
            r9 = 0
            r0.setVisibility(r9)     // Catch:{ all -> 0x072e }
            r0 = r36
            r0.setVisibility(r9)     // Catch:{ all -> 0x072e }
            com.whatsapp.TextEmojiLabel r0 = r5.A0Q     // Catch:{ all -> 0x072e }
            r33 = r0
            r0.setVisibility(r9)     // Catch:{ all -> 0x072e }
            android.widget.ImageView r0 = r5.A0H     // Catch:{ all -> 0x072e }
            r32 = r0
            r0.setVisibility(r9)     // Catch:{ all -> 0x072e }
            android.widget.ImageView r0 = r5.A0D     // Catch:{ all -> 0x072e }
            r31 = r0
            r0.setVisibility(r9)     // Catch:{ all -> 0x072e }
            X.5Tm r11 = r5.A0c     // Catch:{ all -> 0x072e }
            com.whatsapp.components.ConversationListRowHeaderView r1 = r11.A03     // Catch:{ all -> 0x072e }
            com.whatsapp.WaTextView r0 = r1.A01     // Catch:{ all -> 0x072e }
            r0.setVisibility(r9)     // Catch:{ all -> 0x072e }
            X.4cu r12 = r11.A05     // Catch:{ all -> 0x072e }
            r8 = 0
            com.whatsapp.TextEmojiLabel r0 = r12.A02     // Catch:{ all -> 0x072e }
            r24 = r0
            r0.setPadding(r9, r9, r9, r9)     // Catch:{ all -> 0x072e }
            X.2sr r0 = r6.A02     // Catch:{ all -> 0x072e }
            boolean r0 = X.C56972sr.A08(r0, r7)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0391
            X.1VX r0 = r6.A0F     // Catch:{ all -> 0x072e }
            boolean r0 = X.C86644Kx.A1Z(r0)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0391
            java.util.List r13 = r34.BBO()     // Catch:{ all -> 0x072e }
            X.5ae r9 = r6.A0O     // Catch:{ all -> 0x072e }
            r0 = r24
            r0.setPlaceholder(r8)     // Catch:{ all -> 0x072e }
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A09(r7, r9, r13, r0)     // Catch:{ all -> 0x072e }
        L_0x038a:
            r0 = r35
            int r8 = r0.A03(r4)     // Catch:{ all -> 0x072e }
            goto L_0x03c7
        L_0x0391:
            r0 = r35
            boolean r0 = r0.A0N(r4)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x03bd
            if (r18 != 0) goto L_0x03a4
            r0 = 1
            if (r2 != r0) goto L_0x03bd
            boolean r0 = r23.A0C()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x03bd
        L_0x03a4:
            X.2oU r0 = r6.A0B     // Catch:{ all -> 0x072e }
            r9 = 2131887935(0x7f12073f, float:1.9410491E38)
            android.content.res.Resources r0 = X.C54292oU.A00(r0)     // Catch:{ all -> 0x072e }
            java.lang.String r13 = r0.getString(r9)     // Catch:{ all -> 0x072e }
            X.5ae r9 = r6.A0O     // Catch:{ all -> 0x072e }
            r0 = r24
            r0.setPlaceholder(r8)     // Catch:{ all -> 0x072e }
            r0 = 0
            r12.A0E(r9, r13, r0)     // Catch:{ all -> 0x072e }
            goto L_0x038a
        L_0x03bd:
            java.util.List r0 = r34.BBO()     // Catch:{ all -> 0x072e }
            X.5ae r9 = r6.A0O     // Catch:{ all -> 0x072e }
            r11.A02(r7, r9, r0)     // Catch:{ all -> 0x072e }
            goto L_0x038a
        L_0x03c7:
            r13 = 1
            if (r2 == r13) goto L_0x03ce
            r0 = 10
            if (r2 != r0) goto L_0x042f
        L_0x03ce:
            boolean r0 = r23.A0C()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x042f
            if (r10 != r13) goto L_0x040e
            X.1VX r1 = r6.A0F     // Catch:{ all -> 0x072e }
            r0 = 6884(0x1ae4, float:9.647E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x03fa
            X.7jz r0 = new X.7jz     // Catch:{ all -> 0x072e }
            r0.<init>()     // Catch:{ all -> 0x072e }
            r6.A0F(r0)     // Catch:{ all -> 0x072e }
            r0 = r4
            X.1fJ r0 = (X.C27991fJ) r0     // Catch:{ all -> 0x072e }
            X.54b r1 = new X.54b     // Catch:{ all -> 0x072e }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x072e }
            r6.A00 = r1     // Catch:{ all -> 0x072e }
            X.4FS r0 = r6.A0P     // Catch:{ all -> 0x072e }
            X.C18270x1.A0w(r1, r0)     // Catch:{ all -> 0x072e }
            r8 = 0
            goto L_0x0512
        L_0x03fa:
            r1 = r4
            X.1fJ r1 = (X.C27991fJ) r1     // Catch:{ all -> 0x072e }
            r0 = r23
            java.util.List r0 = r0.A04(r1)     // Catch:{ all -> 0x072e }
            X.7jz r0 = r6.A0C(r0)     // Catch:{ all -> 0x072e }
            int r8 = r0.A02     // Catch:{ all -> 0x072e }
            r6.A0F(r0)     // Catch:{ all -> 0x072e }
            goto L_0x0512
        L_0x040e:
            r13 = 0
            com.whatsapp.WaTextView r0 = r1.A01     // Catch:{ all -> 0x072e }
            r0.setVisibility(r13)     // Catch:{ all -> 0x072e }
            r33.A0A()     // Catch:{ all -> 0x072e }
            r10 = 8
            com.whatsapp.WaTextView r0 = r1.getUnreadIndicatorView()     // Catch:{ all -> 0x072e }
            r0.setVisibility(r10)     // Catch:{ all -> 0x072e }
            r11.A00()     // Catch:{ all -> 0x072e }
            com.whatsapp.WaImageView r0 = r1.getUnreadImportantIndicatorView()     // Catch:{ all -> 0x072e }
            r0.setVisibility(r10)     // Catch:{ all -> 0x072e }
            android.view.View r0 = r5.A03     // Catch:{ all -> 0x072e }
            r0.setVisibility(r13)     // Catch:{ all -> 0x072e }
        L_0x042f:
            r0 = r35
            int r16 = r0.A02(r4)     // Catch:{ all -> 0x072e }
            r0 = r40
            java.lang.Boolean r0 = r0.A07     // Catch:{ all -> 0x072e }
            r14 = r0
            com.whatsapp.WaImageView r0 = r5.A0S     // Catch:{ all -> 0x072e }
            r23 = r0
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ all -> 0x072e }
            com.whatsapp.WaImageView r13 = r5.A0R     // Catch:{ all -> 0x072e }
            r13.setVisibility(r1)     // Catch:{ all -> 0x072e }
            android.widget.TextView r11 = r5.A0J     // Catch:{ all -> 0x072e }
            r11.setVisibility(r1)     // Catch:{ all -> 0x072e }
            r0 = 4
            if (r2 == r0) goto L_0x0457
            r0 = 3
            if (r2 == r0) goto L_0x0457
            r0 = 5
            r1 = 0
            if (r2 != r0) goto L_0x0458
        L_0x0457:
            r1 = 1
        L_0x0458:
            r0 = -1
            r10 = 0
            if (r1 == 0) goto L_0x0479
            if (r8 > 0) goto L_0x0468
            if (r8 == r0) goto L_0x0468
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x072e }
            boolean r0 = r1.equals(r14)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0512
        L_0x0468:
            r13.setVisibility(r10)     // Catch:{ all -> 0x072e }
            X.1VX r1 = r6.A0F     // Catch:{ all -> 0x072e }
            r0 = 363(0x16b, float:5.09E-43)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0512
            if (r16 <= 0) goto L_0x0512
            goto L_0x050d
        L_0x0479:
            if (r8 <= 0) goto L_0x04d2
            X.33j r0 = r6.A0C     // Catch:{ all -> 0x072e }
            r14 = r0
            java.text.NumberFormat r13 = r0.A0M()     // Catch:{ all -> 0x072e }
            long r0 = (long) r8     // Catch:{ all -> 0x072e }
            r17 = r0
            X.C86634Kw.A1K(r11, r13, r0)     // Catch:{ all -> 0x072e }
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()     // Catch:{ all -> 0x072e }
            X.AnonymousClass000.A1P(r1, r8, r10)     // Catch:{ all -> 0x072e }
            r0 = 2131755378(0x7f100172, float:1.9141634E38)
            r15 = r14
            r14 = r1
            r13 = r0
            r0 = r17
            java.lang.String r0 = r15.A0L(r14, r13, r0)     // Catch:{ all -> 0x072e }
            r11.setContentDescription(r0)     // Catch:{ all -> 0x072e }
            android.content.Context r0 = r11.getContext()     // Catch:{ all -> 0x072e }
            r13 = 2130970974(0x7f04095e, float:1.7550673E38)
            r1 = 2131102602(0x7f060b8a, float:1.7817647E38)
            int r1 = X.AnonymousClass5Yj.A02(r0, r13, r1)     // Catch:{ all -> 0x072e }
            r11.setVisibility(r10)     // Catch:{ all -> 0x072e }
            X.C626936e.A06(r37)     // Catch:{ all -> 0x072e }
            r0 = r37
            int r1 = X.AnonymousClass0Y8.A04(r0, r1)     // Catch:{ all -> 0x072e }
            X.4Ln r0 = new X.4Ln     // Catch:{ all -> 0x072e }
            r0.<init>(r1)     // Catch:{ all -> 0x072e }
            r11.setBackground(r0)     // Catch:{ all -> 0x072e }
            X.1VX r1 = r6.A0F     // Catch:{ all -> 0x072e }
            r0 = 363(0x16b, float:5.09E-43)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0509
            if (r16 <= 0) goto L_0x0509
            r0 = r23
            r0.setVisibility(r10)     // Catch:{ all -> 0x072e }
            goto L_0x0509
        L_0x04d2:
            if (r8 == r0) goto L_0x04dc
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x072e }
            boolean r0 = r1.equals(r14)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0512
        L_0x04dc:
            X.C86634Kw.A1I(r11)     // Catch:{ all -> 0x072e }
            r1 = 2131890616(0x7f1211b8, float:1.9415929E38)
            r0 = r37
            X.C18300x5.A13(r0, r11, r1)     // Catch:{ all -> 0x072e }
            android.content.Context r13 = r11.getContext()     // Catch:{ all -> 0x072e }
            r1 = 2130970974(0x7f04095e, float:1.7550673E38)
            r0 = 2131102602(0x7f060b8a, float:1.7817647E38)
            int r1 = X.AnonymousClass5Yj.A02(r13, r1, r0)     // Catch:{ all -> 0x072e }
            r11.setVisibility(r10)     // Catch:{ all -> 0x072e }
            X.C626936e.A06(r37)     // Catch:{ all -> 0x072e }
            r0 = r37
            int r1 = X.AnonymousClass0Y8.A04(r0, r1)     // Catch:{ all -> 0x072e }
            X.4Ln r0 = new X.4Ln     // Catch:{ all -> 0x072e }
            r0.<init>(r1)     // Catch:{ all -> 0x072e }
            r11.setBackground(r0)     // Catch:{ all -> 0x072e }
        L_0x0509:
            r11.setVisibility(r10)     // Catch:{ all -> 0x072e }
            goto L_0x0512
        L_0x050d:
            r0 = r23
            r0.setVisibility(r10)     // Catch:{ all -> 0x072e }
        L_0x0512:
            r0 = r20
            boolean r0 = r0 instanceof X.C30341mI     // Catch:{ all -> 0x072e }
            r10 = 2
            if (r0 == 0) goto L_0x055a
            r0 = r20
            X.1mI r0 = (X.C30341mI) r0     // Catch:{ all -> 0x072e }
            int r1 = r0.A00     // Catch:{ all -> 0x072e }
            if (r1 == r10) goto L_0x0524
            r0 = 3
            if (r1 != r0) goto L_0x055a
        L_0x0524:
            X.1VX r1 = r6.A0F     // Catch:{ all -> 0x072e }
            java.lang.String r0 = r20.A13()     // Catch:{ all -> 0x072e }
            r10 = 0
            X.C162457s7.A0J(r1, r10)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0536
            int r0 = r0.length()     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x0555
        L_0x0536:
            r0 = 3010(0xbc2, float:4.218E-42)
            boolean r0 = X.C56952sp.A0K(r1, r0, r10)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0555
            X.2oU r0 = r6.A0B     // Catch:{ all -> 0x072e }
            android.content.res.Resources r1 = X.C54292oU.A00(r0)     // Catch:{ all -> 0x072e }
            r0 = 2131889754(0x7f120e5a, float:1.941418E38)
            java.lang.String r1 = r1.getString(r0)     // Catch:{ all -> 0x072e }
        L_0x054b:
            r0 = r24
            r0.setPlaceholder(r10)     // Catch:{ all -> 0x072e }
            r0 = 0
            r12.A0E(r9, r1, r0)     // Catch:{ all -> 0x072e }
            goto L_0x055a
        L_0x0555:
            java.lang.String r1 = r20.A13()     // Catch:{ all -> 0x072e }
            goto L_0x054b
        L_0x055a:
            r10 = 1
            if (r2 == r10) goto L_0x0563
            r0 = 10
            r30 = 0
            if (r2 != r0) goto L_0x0565
        L_0x0563:
            r30 = 1
        L_0x0565:
            r1 = 0
            r18 = 1
            r23 = r6
            r24 = r25
            r25 = r7
            r27 = r20
            r28 = r38
            r23.A09(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x072e }
            boolean r0 = r6.A0K(r7)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0584
            int r0 = r29.size()     // Catch:{ all -> 0x072e }
            if (r0 <= r10) goto L_0x0584
            X.C86634Kw.A1I(r36)     // Catch:{ all -> 0x072e }
        L_0x0584:
            r0 = 7
            r11 = 8
            if (r2 != r0) goto L_0x05c0
            r14 = r44
            if (r44 == 0) goto L_0x05c0
            r0 = r33
            r0.setVisibility(r11)     // Catch:{ all -> 0x072e }
            android.content.res.Resources r17 = r37.getResources()     // Catch:{ all -> 0x072e }
            int r16 = r14.size()     // Catch:{ all -> 0x072e }
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x072e }
            X.5ZU r0 = r6.A06     // Catch:{ all -> 0x072e }
            r15 = 2
            java.lang.String r14 = r0.A0V(r14, r15)     // Catch:{ all -> 0x072e }
            r0 = 0
            r13[r0] = r14     // Catch:{ all -> 0x072e }
            r0 = 2131755300(0x7f100124, float:1.9141475E38)
            r15 = r17
            r14 = r16
            java.lang.String r25 = r15.getQuantityString(r0, r14, r13)     // Catch:{ all -> 0x072e }
            java.util.List r26 = r34.BBO()     // Catch:{ all -> 0x072e }
            r27 = 150(0x96, float:2.1E-43)
            r23 = r36
            r24 = r9
            r28 = r10
            r23.A0H(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x072e }
        L_0x05c0:
            X.33p r13 = r6.A0F     // Catch:{ all -> 0x072e }
            r0 = r35
            boolean r0 = X.C622334f.A01(r13, r0, r4)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x05e6
            switch(r2) {
                case 0: goto L_0x05d2;
                case 1: goto L_0x05cd;
                case 2: goto L_0x05e0;
                case 3: goto L_0x05cd;
                case 4: goto L_0x05cd;
                case 5: goto L_0x05cd;
                case 6: goto L_0x05cd;
                case 7: goto L_0x05d2;
                case 8: goto L_0x05e0;
                case 9: goto L_0x05d5;
                default: goto L_0x05cd;
            }     // Catch:{ all -> 0x072e }
        L_0x05cd:
            android.widget.ImageView r9 = r5.A0E     // Catch:{ all -> 0x072e }
            if (r22 == 0) goto L_0x05ec
            goto L_0x05ea
        L_0x05d2:
            android.widget.ImageView r9 = r5.A0E     // Catch:{ all -> 0x072e }
            goto L_0x05ea
        L_0x05d5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x072e }
            java.lang.String r0 = "ConversationViewFiller/this state does not exist. State = "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r2)     // Catch:{ all -> 0x072e }
            throw r0     // Catch:{ all -> 0x072e }
        L_0x05e0:
            android.widget.ImageView r0 = r5.A0E     // Catch:{ all -> 0x072e }
            r0.setVisibility(r11)     // Catch:{ all -> 0x072e }
            goto L_0x05f1
        L_0x05e6:
            android.widget.ImageView r9 = r5.A0E     // Catch:{ all -> 0x072e }
            if (r22 == 0) goto L_0x05ec
        L_0x05ea:
            r0 = 0
            goto L_0x05ee
        L_0x05ec:
            r0 = 8
        L_0x05ee:
            r9.setVisibility(r0)     // Catch:{ all -> 0x072e }
        L_0x05f1:
            r0 = 3
            if (r2 == r0) goto L_0x05fc
            r0 = 5
            if (r2 == r0) goto L_0x05fc
            android.widget.ImageView r9 = r5.A0F     // Catch:{ all -> 0x072e }
            if (r21 == 0) goto L_0x0614
            goto L_0x0612
        L_0x05fc:
            boolean r0 = r4 instanceof X.C27991fJ     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x060d
            r9 = r4
            X.1fJ r9 = (X.C27991fJ) r9     // Catch:{ all -> 0x072e }
            r0 = r35
            int r14 = r0.A06(r9)     // Catch:{ all -> 0x072e }
            r9 = 3
            r0 = 1
            if (r14 == r9) goto L_0x060e
        L_0x060d:
            r0 = 0
        L_0x060e:
            android.widget.ImageView r9 = r5.A0F     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0614
        L_0x0612:
            r0 = 0
            goto L_0x0616
        L_0x0614:
            r0 = 8
        L_0x0616:
            r9.setVisibility(r0)     // Catch:{ all -> 0x072e }
            android.view.View r9 = r5.A02     // Catch:{ all -> 0x072e }
            r0 = r35
            boolean r0 = r0.A0M(r4)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0636
            if (r2 == 0) goto L_0x0634
            r0 = 6
            if (r2 == r0) goto L_0x0634
            r0 = 5
            if (r2 == r0) goto L_0x0634
            r0 = 4
            if (r2 == r0) goto L_0x0634
            boolean r0 = r13.A28()     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x0636
        L_0x0634:
            r0 = 0
            goto L_0x0638
        L_0x0636:
            r0 = 8
        L_0x0638:
            r9.setVisibility(r0)     // Catch:{ all -> 0x072e }
            X.1VX r9 = r6.A0F     // Catch:{ all -> 0x072e }
            X.4uZ r0 = r7.A0H     // Catch:{ all -> 0x072e }
            boolean r0 = X.C616831v.A00(r9, r0)     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x0653
            boolean r0 = r7.A0V()     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0657
            r0 = 3961(0xf79, float:5.55E-42)
            boolean r0 = r9.A0X(r0)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x0657
        L_0x0653:
            r12.A0D(r7)     // Catch:{ all -> 0x072e }
            goto L_0x065a
        L_0x0657:
            r18 = 0
            goto L_0x0653
        L_0x065a:
            if (r18 == 0) goto L_0x065f
            r12.A06(r10)     // Catch:{ all -> 0x072e }
        L_0x065f:
            X.4uZ r0 = r7.A0H     // Catch:{ all -> 0x072e }
            boolean r0 = r0 instanceof X.AnonymousClass1fS     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x0682
            X.2nK r0 = r6.A07     // Catch:{ all -> 0x072e }
            java.lang.String r1 = r0.A01(r7)     // Catch:{ all -> 0x072e }
            if (r1 == 0) goto L_0x0682
            boolean r0 = r6.A0L(r4)     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x0682
            r0 = r36
            r0.setText(r1)     // Catch:{ all -> 0x072e }
            r0 = r33
            r0.setVisibility(r11)     // Catch:{ all -> 0x072e }
            r0 = r31
            r0.setVisibility(r11)     // Catch:{ all -> 0x072e }
        L_0x0682:
            r6.A0E(r8)     // Catch:{ all -> 0x072e }
            if (r1 == 0) goto L_0x0688
            goto L_0x06cc
        L_0x0688:
            r8 = 2131101333(0x7f060695, float:1.7815073E38)
            r1 = r37
            r0 = r36
            X.AnonymousClass0x2.A0q(r1, r0, r8)     // Catch:{ all -> 0x072e }
            if (r20 == 0) goto L_0x06be
            r1 = r20
            r0 = r38
            boolean r0 = X.C106565Zm.A02(r1, r0)     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x06be
            boolean r0 = X.C627636p.A0l(r20)     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x06bc
            byte r1 = r1.A1I     // Catch:{ all -> 0x072e }
            r0 = 19
            if (r1 == r0) goto L_0x06bc
            boolean r0 = X.C627636p.A0J(r1)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x06be
            r0 = r20
            X.4DU r0 = (X.AnonymousClass4DU) r0     // Catch:{ all -> 0x072e }
            r20 = r0
            int r0 = r20.BEM()     // Catch:{ all -> 0x072e }
            if (r0 != r10) goto L_0x06be
        L_0x06bc:
            r8 = 2
            goto L_0x06bf
        L_0x06be:
            r8 = 0
        L_0x06bf:
            r36.getContext()     // Catch:{ all -> 0x072e }
            android.graphics.Typeface r1 = X.C106905aM.A01()     // Catch:{ all -> 0x072e }
            r0 = r36
            r0.setTypeface(r1, r8)     // Catch:{ all -> 0x072e }
            goto L_0x06e7
        L_0x06cc:
            boolean r0 = r6.A0L(r4)     // Catch:{ all -> 0x072e }
            if (r0 != 0) goto L_0x0688
            r0 = r32
            r0.setVisibility(r11)     // Catch:{ all -> 0x072e }
            r9 = 2130969053(0x7f0401dd, float:1.7546777E38)
            r8 = 2131100143(0x7f0601ef, float:1.781266E38)
            r1 = r37
            r0 = r36
            X.AnonymousClass5Yj.A0B(r1, r0, r9, r8)     // Catch:{ all -> 0x072e }
            X.C106905aM.A04(r36)     // Catch:{ all -> 0x072e }
        L_0x06e7:
            X.3Ex r1 = r6.A05     // Catch:{ all -> 0x072e }
            r0 = r35
            int r1 = X.AnonymousClass352.A00(r1, r0, r4)     // Catch:{ all -> 0x072e }
            boolean r0 = X.AnonymousClass001.A1W(r1)
            r5.A0E(r0, r1)     // Catch:{ all -> 0x072e }
            r1 = r43
            if (r43 == 0) goto L_0x06ff
            r0 = r39
            r1.Bah(r0)     // Catch:{ all -> 0x072e }
        L_0x06ff:
            if (r19 == 0) goto L_0x0713
            r0 = r40
            X.5OF r0 = r0.A06     // Catch:{ all -> 0x072e }
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r3 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r3     // Catch:{ all -> 0x072e }
            r6.A0J(r0, r3)     // Catch:{ all -> 0x072e }
            X.5OF r1 = r6.A04     // Catch:{ all -> 0x072e }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r4)     // Catch:{ all -> 0x072e }
            r6.A0H(r7, r0, r1, r3)     // Catch:{ all -> 0x072e }
        L_0x0713:
            if (r2 != 0) goto L_0x072d
            X.4uZ r1 = r7.A0H     // Catch:{ all -> 0x072e }
            if (r1 == 0) goto L_0x072d
            r0 = r35
            boolean r0 = r0.A0P(r1)     // Catch:{ all -> 0x072e }
            if (r0 == 0) goto L_0x072d
            java.lang.String r2 = r7.A0X     // Catch:{ all -> 0x072e }
            if (r2 != 0) goto L_0x0727
            java.lang.String r2 = ""
        L_0x0727:
            r1 = 0
            r0 = r36
            r0.A0K(r1, r2)     // Catch:{ all -> 0x072e }
        L_0x072d:
            return
        L_0x072e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94134px.A0G(X.5Kt, X.8oF, java.util.Set, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r11.A01 <= 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.AnonymousClass3ZH r9, com.whatsapp.jid.UserJid r10, X.AnonymousClass5OF r11, com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r12) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x005f
            X.2sr r0 = r8.A02
            boolean r0 = X.C56972sr.A08(r0, r9)
            if (r0 == 0) goto L_0x0060
            android.content.Context r1 = r8.A01
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x0013:
            if (r7 == 0) goto L_0x005f
            android.content.Context r6 = r8.A01
            r0 = 2131894318(0x7f12202e, float:1.9423437E38)
            java.lang.String r5 = r6.getString(r0)
            if (r11 == 0) goto L_0x002b
            boolean r0 = r11.A00()
            if (r0 == 0) goto L_0x002b
            int r0 = r11.A01
            r1 = 1
            if (r0 > 0) goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            r4 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0044
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131755368(0x7f100168, float:1.9141613E38)
            int r1 = r11.A01
            java.lang.Object[] r0 = X.C18310x6.A1b(r7, r0)
            X.AnonymousClass000.A1P(r0, r1, r4)
            java.lang.String r7 = r3.getQuantityString(r2, r1, r0)
        L_0x0044:
            if (r10 == 0) goto L_0x0057
            X.2ss r1 = r8.A0D
            X.3Ex r0 = r8.A05
            int r0 = X.AnonymousClass352.A00(r0, r1, r10)
            if (r0 <= 0) goto L_0x0057
            r0 = 2131894319(0x7f12202f, float:1.942344E38)
            java.lang.String r7 = X.AnonymousClass0x2.A0X(r6, r7, r4, r0)
        L_0x0057:
            X.4TA r0 = new X.4TA
            r0.<init>(r7, r5)
            X.C06560Yg.A0O(r12, r0)
        L_0x005f:
            return
        L_0x0060:
            X.5ZU r0 = r8.A06
            java.lang.String r7 = r0.A0H(r9)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94134px.A0H(X.3ZH, com.whatsapp.jid.UserJid, X.5OF, com.whatsapp.wds.components.profilephoto.WDSProfilePhoto):void");
    }

    public final void A0I(C95814uZ r5, AnonymousClass3ZF r6) {
        ImageView imageView;
        int i;
        Context context;
        int i2;
        WDSProfilePhoto wDSProfilePhoto;
        C156257gJ r0;
        if (r6 == null || (context = this.A01) == null) {
            ViewHolder viewHolder = this.A08;
            ImageView imageView2 = viewHolder.A0B;
            if (imageView2 instanceof WDSProfilePhoto) {
                ((WDSProfilePhoto) imageView2).setProfileBadge((C156257gJ) null);
                int A002 = AnonymousClass352.A00(this.A05, this.A0D, r5);
                viewHolder.A0E(AnonymousClass001.A1W(A002), A002);
                return;
            }
            imageView = viewHolder.A0A;
            i = 8;
        } else {
            if (r6.A0L) {
                ViewHolder viewHolder2 = this.A08;
                ImageView imageView3 = viewHolder2.A0B;
                if (imageView3 instanceof WDSProfilePhoto) {
                    wDSProfilePhoto = (WDSProfilePhoto) imageView3;
                    r0 = this.A0Q;
                } else {
                    imageView = viewHolder2.A0A;
                    imageView.setImageResource(R.drawable.ic_voip_chatlist_joinable_video);
                    i2 = R.string.f11nameremoved;
                    C18300x5.A13(context, imageView, i2);
                    i = 0;
                }
            } else if (r6.A0H == 2) {
                ImageView imageView4 = this.A08.A0B;
                if (imageView4 instanceof WDSProfilePhoto) {
                    wDSProfilePhoto = (WDSProfilePhoto) imageView4;
                    r0 = this.A0S;
                } else {
                    return;
                }
            } else {
                ViewHolder viewHolder3 = this.A08;
                ImageView imageView5 = viewHolder3.A0B;
                if (imageView5 instanceof WDSProfilePhoto) {
                    wDSProfilePhoto = (WDSProfilePhoto) imageView5;
                    r0 = this.A0R;
                } else {
                    imageView = viewHolder3.A0A;
                    imageView.setImageResource(R.drawable.ic_voip_chatlist_joinable_voice);
                    i2 = R.string.f11nameremoved;
                    C18300x5.A13(context, imageView, i2);
                    i = 0;
                }
            }
            wDSProfilePhoto.setProfileBadge(r0);
            return;
        }
        imageView.setVisibility(i);
    }

    public final void A0J(AnonymousClass5OF r2, WDSProfilePhoto wDSProfilePhoto) {
        if (r2 == null || !r2.A00() || r2.A01 <= 0) {
            wDSProfilePhoto.setStatusIndicatorEnabled(false);
            return;
        }
        wDSProfilePhoto.setProfilePhotoShape(C142746xh.CIRCLE);
        wDSProfilePhoto.setStatusIndicatorEnabled(true);
        AnonymousClass576.A00(wDSProfilePhoto, AnonymousClass593.UNSEEN);
    }

    public final boolean A0K(AnonymousClass3ZH r3) {
        if ((this.A05 != 1 || !this.A0A.A0C()) && 0 == 0) {
            return false;
        }
        return C18310x6.A1W(this.A0D.A06(AnonymousClass32V.A00(r3.A0H)));
    }

    public final boolean A0L(C95814uZ r3) {
        C162457s7.A0J(r3, 0);
        if (((C623234o) this.A0P.get()).A05.A0O.get(r3) == null || this.A0F.A0N(6120) < 1) {
            return false;
        }
        return true;
    }

    public static void A01(View view, C95814uZ r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp.conversationslist.ConversationsFragment");
        AnonymousClass0YZ.A0F(view, AnonymousClass000.A0X(C627336j.A07(r3), A0o));
    }

    public void A06() {
        super.A06();
        C86604Kt.A1R(this.A02);
        C86604Kt.A1R(this.A03);
        C86604Kt.A1R(this.A01);
        C18290x4.A1L(this.A00);
    }

    public void A0A(AnonymousClass3ZH r7, AnonymousClass3ZH r8, C624134x r9, List list, boolean z) {
        String A0D2;
        if (!A0K(r7)) {
            super.A0A(r7, r8, r9, list, z);
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GroupJid groupJid = ((C52882mC) it.next()).A02;
            C56982ss r1 = this.A0D;
            if (r1.A0N(groupJid)) {
                A0D2 = C54292oU.A00(this.A0B).getString(R.string.f11nameremoved);
            } else if (r1.A0D(groupJid) != null) {
                A0D2 = r1.A0D(groupJid);
            }
            A0s.add(A0D2);
        }
        C620733j r4 = this.A0C;
        String A002 = AnonymousClass5VS.A00(r4, A0s, false);
        super.A0B(A002, false);
        if (TextUtils.isEmpty(A002) || A0s.size() != 1) {
            this.A08.A0G.setVisibility(8);
            return;
        }
        ImageView imageView = this.A08.A0G;
        C86614Ku.A1B(AnonymousClass0VX.A01(imageView.getContext(), R.drawable.vec_ic_right_triangle), imageView, r4);
        imageView.setVisibility(0);
    }

    public final C158447jz A0C(List list) {
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            GroupJid groupJid = ((C52882mC) it.next()).A02;
            C56982ss r6 = this.A0D;
            AnonymousClass31A A002 = C56982ss.A00(r6, groupJid);
            if (A002 != null) {
                long j = (long) A002.A08;
                if (j > 0) {
                    i3++;
                    i = (int) (((long) i) + j);
                }
            }
            i2 += r6.A02(groupJid);
        }
        return new C158447jz(i, i2, i3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C94134px(android.content.Context r29, X.C116985rC r30, X.C53582nK r31, X.C69263Wi r32, X.C56972sr r33, X.C625735q r34, X.C56962sq r35, X.C56722sS r36, X.C56942so r37, X.AnonymousClass5UX r38, X.C64773Ex r39, X.AnonymousClass5ZU r40, X.C105365Uq r41, X.C103445Mz r42, X.C1230266t r43, com.whatsapp.conversationslist.ViewHolder r44, X.C620633i r45, X.C56612sH r46, X.C54292oU r47, X.AnonymousClass33p r48, X.C620733j r49, X.C56762sW r50, X.C56542sA r51, X.C56982ss r52, X.C46962cU r53, X.C56322rn r54, X.C56152rV r55, X.C620333f r56, X.AnonymousClass2R8 r57, X.AnonymousClass1VX r58, X.AnonymousClass3LP r59, X.C52472lX r60, X.C40532Gt r61, X.C43642Sx r62, X.C106195Xz r63, X.C1907099n r64, X.AnonymousClass9U4 r65, X.C195219Wq r66, X.C50222hp r67, X.AnonymousClass1R1 r68, X.AnonymousClass5OF r69, X.C56072rN r70, X.C107075ae r71, X.AnonymousClass4FS r72, X.C183538qC r73, int r74) {
        /*
            r28 = this;
            r2 = r28
            r16 = r53
            r15 = r52
            r14 = r49
            r13 = r47
            r12 = r46
            r11 = r45
            r10 = r44
            r9 = r43
            r3 = r29
            r4 = r33
            r20 = r63
            r5 = r34
            r21 = r64
            r6 = r35
            r22 = r65
            r23 = r66
            r24 = r67
            r7 = r39
            r8 = r40
            r25 = r70
            r26 = r71
            r27 = r73
            r19 = r60
            r18 = r59
            r17 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.592 r1 = X.AnonymousClass592.VIDEO
            X.6t2 r0 = new X.6t2
            r0.<init>(r1)
            r2.A0Q = r0
            X.592 r1 = X.AnonymousClass592.VOICE
            X.6t2 r0 = new X.6t2
            r0.<init>(r1)
            r2.A0R = r0
            X.592 r1 = X.AnonymousClass592.VOICE_CHAT
            X.6t2 r0 = new X.6t2
            r0.<init>(r1)
            r2.A0S = r0
            r0 = 26
            X.5sE r0 = X.C117625sE.A00(r2, r0)
            r2.A0T = r0
            r0 = r74
            r2.A05 = r0
            r0 = r32
            r2.A08 = r0
            r0 = r72
            r2.A0P = r0
            r0 = r36
            r2.A09 = r0
            r0 = r69
            r2.A04 = r0
            r0 = r38
            r2.A0B = r0
            r0 = r31
            r2.A07 = r0
            r0 = r55
            r2.A0J = r0
            r0 = r50
            r2.A0G = r0
            r0 = r68
            r2.A0O = r0
            r0 = r41
            r2.A0C = r0
            r0 = r56
            r2.A0K = r0
            r0 = r57
            r2.A0L = r0
            r0 = r48
            r2.A0F = r0
            r0 = r37
            r2.A0A = r0
            r0 = r54
            r2.A0I = r0
            r0 = r42
            r2.A0D = r0
            r0 = r30
            r2.A06 = r0
            r2.A0E = r9
            r0 = r62
            r2.A0N = r0
            r0 = r61
            r2.A0M = r0
            r0 = r51
            r2.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94134px.<init>(android.content.Context, X.5rC, X.2nK, X.3Wi, X.2sr, X.35q, X.2sq, X.2sS, X.2so, X.5UX, X.3Ex, X.5ZU, X.5Uq, X.5Mz, X.66t, com.whatsapp.conversationslist.ViewHolder, X.33i, X.2sH, X.2oU, X.33p, X.33j, X.2sW, X.2sA, X.2ss, X.2cU, X.2rn, X.2rV, X.33f, X.2R8, X.1VX, X.3LP, X.2lX, X.2Gt, X.2Sx, X.5Xz, X.99n, X.9U4, X.9Wq, X.2hp, X.1R1, X.5OF, X.2rN, X.5ae, X.4FS, X.8qC, int):void");
    }
}
