package X;

import android.view.View;

/* renamed from: X.5ef  reason: invalid class name and case insensitive filesystem */
public class C109465ef implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C109465ef(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x043d, code lost:
        r2.putExtra(r1, r0);
        r4.A05.A2F(r2, r3, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0446, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x049c, code lost:
        r0.A04 = r1;
        r2.A07 = r0;
        r0.A00 = r2;
        X.C18270x1.A0t(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0524, code lost:
        if (r4.A09.A00(r4.A05.A0A(r4.A0A)) != false) goto L_0x0526;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x060b, code lost:
        r3.Boo(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x060e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0199, code lost:
        r0.invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0672;
                case 1: goto L_0x01da;
                case 2: goto L_0x019d;
                case 3: goto L_0x0185;
                case 4: goto L_0x0643;
                case 5: goto L_0x062b;
                case 6: goto L_0x061f;
                case 7: goto L_0x0613;
                case 8: goto L_0x0147;
                case 9: goto L_0x0111;
                case 10: goto L_0x001d;
                case 11: goto L_0x0013;
                case 12: goto L_0x00ef;
                case 13: goto L_0x05e6;
                case 14: goto L_0x0599;
                case 15: goto L_0x0588;
                case 16: goto L_0x00ba;
                case 17: goto L_0x0082;
                case 18: goto L_0x0561;
                case 19: goto L_0x054f;
                case 20: goto L_0x0543;
                case 21: goto L_0x052f;
                case 22: goto L_0x052f;
                case 23: goto L_0x04fb;
                case 24: goto L_0x04d4;
                case 25: goto L_0x04b2;
                case 26: goto L_0x006c;
                case 27: goto L_0x04a6;
                case 28: goto L_0x0487;
                case 29: goto L_0x0447;
                case 30: goto L_0x0052;
                case 31: goto L_0x042e;
                case 32: goto L_0x041e;
                case 33: goto L_0x0410;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x03d6;
                case 37: goto L_0x03ae;
                case 38: goto L_0x038e;
                case 39: goto L_0x0380;
                case 40: goto L_0x0040;
                case 41: goto L_0x0343;
                case 42: goto L_0x0328;
                case 43: goto L_0x0303;
                case 44: goto L_0x02f7;
                case 45: goto L_0x02e5;
                case 46: goto L_0x02d9;
                case 47: goto L_0x0267;
                case 48: goto L_0x0202;
                case 49: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.4lo r0 = (X.C91924lo) r0
            java.lang.Object r1 = r12.A01
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            r0.A1s(r1)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r12.A00
            X.6gT r0 = (X.C132986gT) r0
            java.lang.Object r1 = r12.A01
            X.4GQ r0 = r0.A03
            goto L_0x0199
        L_0x001d:
            java.lang.Object r0 = r12.A00
            X.6gR r0 = (X.C132966gR) r0
            java.lang.Object r1 = r12.A01
            X.4GQ r0 = r0.A02
            goto L_0x0199
        L_0x0027:
            java.lang.Object r5 = r12.A00
            X.4mK r5 = (X.C92244mK) r5
            java.lang.Object r0 = r12.A01
            android.view.View r0 = (android.view.View) r0
            r4 = 0
            X.66r r3 = r5.A0F
            X.3ZF r2 = r5.A08
            if (r2 == 0) goto L_0x0012
            android.content.Context r1 = r0.getContext()
            int r0 = r5.A00
            r3.BJS(r1, r2, r0, r4)
            return
        L_0x0040:
            java.lang.Object r2 = r12.A00
            X.4WK r2 = (X.AnonymousClass4WK) r2
            java.lang.Object r1 = r12.A01
            X.5Qc r1 = (X.C104215Qc) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0012
            com.whatsapp.contact.picker.PhoneContactsSelector r0 = r2.A00
            r0.A78(r1)
            return
        L_0x0052:
            java.lang.Object r0 = r12.A00
            X.5kQ r0 = (X.C112815kQ) r0
            java.lang.Object r2 = r12.A01
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            android.app.Activity r1 = r0.A03
            X.2k5 r0 = r2.A0F
            if (r0 == 0) goto L_0x0012
            X.36r r0 = X.C86664Kz.A1B()
            android.content.Intent r0 = r0.A1K(r1, r2)
            r1.startActivity(r0)
            return
        L_0x006c:
            java.lang.Object r1 = r12.A00
            X.4Rd r1 = (X.AnonymousClass4Rd) r1
            java.lang.Object r2 = r12.A01
            android.content.Context r2 = (android.content.Context) r2
            X.1fJ r0 = r1.A0A
            if (r0 == 0) goto L_0x0012
            X.5hX r1 = r1.A00
            android.content.Intent r0 = X.C627736r.A0h(r2, r0)
            r1.A0A(r2, r0)
            return
        L_0x0082:
            java.lang.Object r0 = r12.A00
            X.2FJ r0 = (X.AnonymousClass2FJ) r0
            java.lang.Object r6 = r12.A01
            X.2mC r6 = (X.C52882mC) r6
            com.whatsapp.community.ManageGroupsInCommunityActivity r5 = r0.A00
            boolean r0 = r5.BHW()
            if (r0 != 0) goto L_0x0012
            X.11H r0 = r5.A0B
            X.107 r0 = r0.A0y
            int r1 = X.C86614Ku.A06(r0)
            r0 = 2
            if (r1 > r0) goto L_0x0685
            X.1VX r1 = r5.A0D
            r0 = 3167(0xc5f, float:4.438E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0685
            r4 = 2131887938(0x7f120742, float:1.9410497E38)
            r3 = 2131887939(0x7f120743, float:1.94105E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r1 = 0
            java.lang.String r0 = r6.A03
            r2[r1] = r0
            r5.Box(r2, r4, r3)
            return
        L_0x00ba:
            java.lang.Object r1 = r12.A00
            com.whatsapp.community.CommunityAddMembersBottomSheet r1 = (com.whatsapp.community.CommunityAddMembersBottomSheet) r1
            java.lang.Object r4 = r12.A01
            X.1fJ r4 = (X.C27991fJ) r4
            android.content.Context r0 = r1.A1D()
            android.app.Activity r3 = X.C111095hX.A02(r0)
            boolean r0 = r3 instanceof X.C009707r
            if (r0 == 0) goto L_0x0012
            X.03q r3 = (X.C003203q) r3
            if (r3 == 0) goto L_0x0012
            X.0df r2 = r3.getSupportFragmentManager()
            X.66R r0 = r1.A0D
            java.lang.Object r5 = r0.getValue()
            X.1fJ r5 = (X.C27991fJ) r5
            r0 = 0
            X.27G r7 = new X.27G
            r7.<init>(r1, r0)
            r9 = 1
            X.3d3 r6 = X.C72023d3.A00
            X.63g r8 = X.C1221463g.A00
            r10 = 6
            r11 = r9
            X.AnonymousClass27C.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00ef:
            java.lang.Object r2 = r12.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.Object r3 = r12.A01
            X.0df r3 = (X.C08270df) r3
            X.2m2 r1 = r2.A0g
            X.3ZH r0 = r2.A1K
            com.whatsapp.jid.UserJid r4 = X.C86604Kt.A0d(r0)
            java.lang.String r5 = "profile_view"
            r0 = 1
            X.C162457s7.A0J(r3, r0)
            if (r4 == 0) goto L_0x0012
            X.2zY r0 = r1.A01
            boolean r6 = r0.A03(r4)
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0111:
            java.lang.Object r4 = r12.A00
            X.5Y6 r4 = (X.AnonymousClass5Y6) r4
            java.lang.Object r3 = r12.A01
            X.5ZS r3 = (X.AnonymousClass5ZS) r3
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0121
            r3.A05()
            return
        L_0x0121:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1067450368(0x3fa00000, float:1.25)
            android.view.animation.ScaleAnimation r2 = X.C86634Kw.A0Q(r1, r0)
            r0 = 220(0xdc, double:1.087E-321)
            r2.setDuration(r0)
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            r0 = 0
            X.C1232367q.A00(r2, r3, r4, r0)
            com.whatsapp.WaImageView r0 = r4.A0I
            r0.startAnimation(r2)
            com.whatsapp.CircularProgressBar r0 = r4.A05
            if (r0 == 0) goto L_0x0012
            r0.startAnimation(r2)
            return
        L_0x0147:
            java.lang.Object r3 = r12.A00
            X.2jb r3 = (X.C51302jb) r3
            java.lang.Object r2 = r12.A01
            X.2FB r2 = (X.AnonymousClass2FB) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupChatViewHolder/onGroupClicked: "
            r1.append(r0)
            java.lang.String r0 = r3.A01
            X.C18260x0.A1L(r1, r0)
            X.3ZH r4 = r3.A00
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r3 = r2.A00
            r1 = 1
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "calling-tooltip-scenario"
            r2.putInt(r0, r1)
            X.36r r1 = X.C86664Kz.A1B()
            android.content.Context r0 = r3.A0G()
            android.content.Intent r0 = r1.A1L(r0, r4)
            r0.putExtras(r2)
            r3.A0m(r0)
            X.4GP r0 = r3.A03
            if (r0 == 0) goto L_0x0012
            r0.invoke()
            return
        L_0x0185:
            java.lang.Object r0 = r12.A00
            X.1N8 r0 = (X.AnonymousClass1N8) r0
            java.lang.Object r2 = r12.A01
            X.1N7 r2 = (X.AnonymousClass1N7) r2
            X.3ZH r0 = r0.A00
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A05(r0)
            if (r1 == 0) goto L_0x0012
            X.4GQ r0 = r2.A05
        L_0x0199:
            r0.invoke(r1)
            return
        L_0x019d:
            java.lang.Object r0 = r12.A00
            X.2m7 r0 = (X.C52832m7) r0
            java.lang.Object r4 = r12.A01
            X.12e r4 = (X.C196912e) r4
            X.3ZH r0 = r0.A02
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass32Y.A05(r0)
            if (r3 == 0) goto L_0x0012
            X.66R r2 = r4.A03
            java.lang.Object r1 = X.C18300x5.A0d(r2)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.Object r0 = X.C18300x5.A0d(r2)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            X.4GR r1 = r4.A05
            java.lang.Object r0 = X.C18300x5.A0d(r2)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r3, r0)
            return
        L_0x01da:
            java.lang.Object r0 = r12.A00
            X.2m7 r0 = (X.C52832m7) r0
            java.lang.Object r3 = r12.A01
            X.12e r3 = (X.C196912e) r3
            X.3ZH r0 = r0.A02
            X.4uZ r0 = r0.A0H
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A05(r0)
            if (r2 == 0) goto L_0x0012
            X.4GR r1 = r3.A05
            X.66R r0 = r3.A03
            java.lang.Object r0 = X.C18300x5.A0d(r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r2, r0)
            return
        L_0x0202:
            java.lang.Object r4 = r12.A00
            X.4mK r4 = (X.C92244mK) r4
            java.lang.Object r6 = r12.A01
            android.view.View r6 = (android.view.View) r6
            r5 = 1
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2 = 0
            if (r3 == 0) goto L_0x0265
            com.whatsapp.voipcalling.CallState r1 = r3.callState
        L_0x0214:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0245
            com.whatsapp.jid.GroupJid r1 = r3.groupJid
            X.3ZF r0 = r4.A08
            if (r0 == 0) goto L_0x0220
            com.whatsapp.jid.GroupJid r2 = r0.A05
        L_0x0220:
            boolean r0 = X.C162457s7.A0P(r1, r2)
            if (r0 == 0) goto L_0x0245
            X.3ZF r0 = r4.A08
            if (r0 == 0) goto L_0x0245
            int r1 = r0.A0H
            r0 = 2
            if (r1 != r0) goto L_0x0245
            X.66r r1 = r4.A0F
            android.content.Context r0 = r6.getContext()
            X.5jl r1 = (X.C112455jl) r1
            boolean r0 = r1.A08(r0, r5)
            if (r0 == 0) goto L_0x0240
            com.whatsapp.voipcalling.Voip.acceptCall()
        L_0x0240:
            r0 = 9
            r4.A00 = r0
            return
        L_0x0245:
            X.3ZF r3 = r4.A08
            if (r3 == 0) goto L_0x0255
            X.66r r2 = r4.A0F
            android.content.Context r1 = r6.getContext()
            int r0 = r4.A00
            r2.BJS(r1, r3, r0, r5)
            goto L_0x0240
        L_0x0255:
            X.2i6 r3 = r4.A07
            if (r3 == 0) goto L_0x0240
            X.66r r2 = r4.A0F
            android.content.Context r1 = r6.getContext()
            int r0 = r4.A00
            r2.Bpq(r1, r3, r0)
            goto L_0x0240
        L_0x0265:
            r1 = r2
            goto L_0x0214
        L_0x0267:
            java.lang.Object r4 = r12.A00
            X.4mB r4 = (X.C92154mB) r4
            java.lang.Object r3 = r12.A01
            android.app.Activity r3 = (android.app.Activity) r3
            X.2so r6 = r4.A0D
            X.1fJ r5 = r4.A0P
            X.1fJ r2 = r6.A01(r5)
            X.2ss r0 = r4.A0J
            boolean r0 = r0.A0N(r5)
            if (r0 == 0) goto L_0x0299
            if (r2 == 0) goto L_0x0299
            X.2Vj r0 = r4.A0C
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0299
            X.67D r1 = r4.A0E
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r3.findViewById(r0)
            boolean r0 = r1.Bg9(r3, r0, r2)
            if (r0 == 0) goto L_0x0299
            return
        L_0x0299:
            X.3ZH r0 = r4.A0L
            X.4uZ r2 = r0.A0H
            boolean r0 = r4.A0R
            r1 = r0 ^ 1
            r0 = 0
            android.content.Intent r2 = X.C627736r.A0g(r3, r2, r1, r0, r0)
            int r0 = r4.A00
            boolean r0 = r6.A0J(r5, r0)
            if (r0 == 0) goto L_0x02cf
            X.5UY r0 = r4.A07
            android.view.View r0 = r0.A04()
            com.whatsapp.community.SubgroupPileView r0 = (com.whatsapp.community.SubgroupPileView) r0
            com.whatsapp.components.button.ThumbnailButton r1 = r0.A01
        L_0x02b8:
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x02cd
            X.5MG r0 = r4.A0Z
            android.os.Bundle r1 = X.AnonymousClass5MG.A00(r3, r1, r0)
        L_0x02c2:
            java.lang.String r0 = X.C18310x6.A0n(r3)
            X.AnonymousClass5VI.A00(r2, r0)
            X.AnonymousClass0RN.A00(r3, r2, r1)
            return
        L_0x02cd:
            r1 = 0
            goto L_0x02c2
        L_0x02cf:
            r1 = 2131434443(0x7f0b1bcb, float:1.84907E38)
            X.07r r0 = r4.A0U
            android.view.View r1 = r0.findViewById(r1)
            goto L_0x02b8
        L_0x02d9:
            java.lang.Object r1 = r12.A00
            X.4fT r1 = (X.C89904fT) r1
            java.lang.Object r0 = r12.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.BXQ(r0)
            return
        L_0x02e5:
            java.lang.Object r3 = r12.A00
            com.whatsapp.conversation.ConversationEntryActionButton r3 = (com.whatsapp.conversation.ConversationEntryActionButton) r3
            java.lang.Object r2 = r12.A01
            X.8uR r2 = (X.C185908uR) r2
            long r0 = java.lang.System.currentTimeMillis()
            r3.A01 = r0
            r2.BbF(r3)
            return
        L_0x02f7:
            java.lang.Object r1 = r12.A00
            X.4mA r1 = (X.C92144mA) r1
            java.lang.Object r0 = r12.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1.A0G(r0)
            return
        L_0x0303:
            java.lang.Object r4 = r12.A00
            X.4m6 r4 = (X.C92104m6) r4
            java.lang.Object r3 = r12.A01
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Integer r0 = X.C18290x4.A0a()
            X.1Wa r1 = new X.1Wa
            r1.<init>()
            r1.A00 = r0
            X.4FV r0 = r4.A0A
            r0.BhD(r1)
            X.4Fm r2 = r4.A04
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = r4.A02
            android.content.Context r1 = r0.getContext()
            r0 = 0
            r2.BkW(r1, r3, r0)
            return
        L_0x0328:
            java.lang.Object r0 = r12.A00
            com.whatsapp.conversation.CommentsBottomSheet r0 = (com.whatsapp.conversation.CommentsBottomSheet) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            X.66R r0 = r0.A0U
            java.lang.Object r1 = r0.getValue()
            X.10y r1 = (X.C194510y) r1
            java.lang.String r0 = r2.getStringText()
            X.C162457s7.A0D(r0)
            r1.A0F(r0)
            return
        L_0x0343:
            java.lang.Object r6 = r12.A00
            X.4Wf r6 = (X.C87814Wf) r6
            java.lang.Object r5 = r12.A01
            X.3ZH r5 = (X.AnonymousClass3ZH) r5
            r0 = 1
            X.C162457s7.A0J(r5, r0)
            com.whatsapp.contact.picker.SelectedListContactPickerFragment r4 = r6.A01
            java.util.Map r3 = r4.A3n
            java.util.Collection r0 = r3.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x035b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037e
            java.lang.Object r1 = r2.next()
            boolean r0 = X.C162457s7.A0P(r1, r5)
            if (r0 == 0) goto L_0x035b
        L_0x036b:
            X.3ZH r1 = (X.AnonymousClass3ZH) r1
            if (r1 == 0) goto L_0x037a
            X.4uZ r0 = r1.A0H
            r3.remove(r0)
            r4.A1b()
            r4.A1W()
        L_0x037a:
            r6.A0K(r5)
            return
        L_0x037e:
            r1 = 0
            goto L_0x036b
        L_0x0380:
            java.lang.Object r0 = r12.A00
            X.5kP r0 = (X.C112805kP) r0
            java.lang.Object r1 = r12.A01
            java.util.List r1 = (java.util.List) r1
            X.4eX r0 = r0.A01
            r0.A7W(r1)
            return
        L_0x038e:
            java.lang.Object r2 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            java.lang.Object r1 = r12.A01
            android.content.Intent r1 = (android.content.Intent) r1
            X.5Tk r0 = r2.A2T
            r0.A00()
            X.2nh r4 = r2.A1F
            X.03q r3 = r2.A0R()
            java.lang.String r0 = "newly_added_contact_phone_number_key"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r1 = "sms:"
            r0 = 0
            r4.A01(r3, r0, r2, r1)
            return
        L_0x03ae:
            java.lang.Object r4 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r12.A01
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            X.5Tk r2 = r4.A2T
            r0 = 6
            r1 = 0
            r2.A02(r1, r0)
            X.5Tk r0 = r4.A2T
            r0.A00()
            boolean r0 = r4.A3Q
            if (r0 == 0) goto L_0x03d1
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "call_type"
            r0 = 1
            android.content.Intent r1 = r2.putExtra(r1, r0)
        L_0x03d1:
            r0 = 0
            r4.A2F(r1, r3, r0)
            return
        L_0x03d6:
            java.lang.Object r4 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r12.A01
            android.content.Intent r3 = (android.content.Intent) r3
            X.5Sj r2 = r4.A2A
            java.util.Random r0 = r2.A02
            if (r0 != 0) goto L_0x03eb
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A02 = r0
        L_0x03eb:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A01 = r0
            X.4sa r1 = new X.4sa
            r1.<init>()
            java.lang.Integer r0 = X.C18290x4.A0Z()
            r1.A01 = r0
            r2.A02(r1)
            X.5hX r1 = r4.A0U
            android.content.Context r0 = r4.A0G()
            r1.A0A(r0, r3)
            X.C111355hx.A01(r4)
            return
        L_0x0410:
            java.lang.Object r0 = r12.A00
            X.4lo r0 = (X.C91924lo) r0
            java.lang.Object r1 = r12.A01
            X.8Ft r1 = (X.C171098Ft) r1
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            r0.A1p(r1)
            return
        L_0x041e:
            java.lang.Object r4 = r12.A00
            X.4lo r4 = (X.C91924lo) r4
            java.lang.Object r3 = r12.A01
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "call_type"
            r0 = 1
            goto L_0x043d
        L_0x042e:
            java.lang.Object r4 = r12.A00
            X.4lo r4 = (X.C91924lo) r4
            java.lang.Object r3 = r12.A01
            X.3ZH r3 = (X.AnonymousClass3ZH) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "call_type"
            r0 = 2
        L_0x043d:
            r2.putExtra(r1, r0)
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r4.A05
            r0 = 0
            r1.A2F(r2, r3, r0)
            return
        L_0x0447:
            java.lang.Object r0 = r12.A00
            X.12g r0 = (X.C197112g) r0
            java.lang.Object r3 = r12.A01
            X.33G r3 = (X.AnonymousClass33G) r3
            X.2FN r2 = r0.A05
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x047b
            com.whatsapp.companiondevice.LinkedDevicesActivity r4 = r2.A00
            X.1VX r1 = r4.A0D
            r0 = 4757(0x1295, float:6.666E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x047b
            com.whatsapp.jid.DeviceJid r3 = r3.A07
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "device_jid_raw_string"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            r4.startActivity(r2)
            return
        L_0x047b:
            com.whatsapp.companiondevice.LinkedDevicesActivity r2 = r2.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r2.A08
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r0 = new com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment
            r0.<init>()
            r0.A07 = r3
            goto L_0x049c
        L_0x0487:
            java.lang.Object r0 = r12.A00
            X.12g r0 = (X.C197112g) r0
            java.lang.Object r3 = r12.A01
            X.2QC r3 = (X.AnonymousClass2QC) r3
            X.2FN r0 = r0.A05
            com.whatsapp.companiondevice.LinkedDevicesActivity r2 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r2.A08
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r0 = new com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment
            r0.<init>()
            r0.A0A = r3
        L_0x049c:
            r0.A04 = r1
            r2.A07 = r0
            r0.A00 = r2
            X.C18270x1.A0t(r0, r2)
            return
        L_0x04a6:
            java.lang.Object r1 = r12.A00
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView r1 = (com.whatsapp.community.subgroup.views.CommunityViewGroupsView) r1
            java.lang.Object r0 = r12.A01
            X.07r r0 = (X.C009707r) r0
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView.setViewClickListener$lambda$0(r1, r0, r13)
            return
        L_0x04b2:
            java.lang.Object r0 = r12.A00
            X.4Rd r0 = (X.AnonymousClass4Rd) r0
            java.lang.Object r5 = r12.A01
            android.content.Context r5 = (android.content.Context) r5
            X.5hX r4 = r0.A00
            X.1fJ r3 = r0.A0A
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "parent_group_jid"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            r4.A0A(r5, r2)
            return
        L_0x04d4:
            java.lang.Object r1 = r12.A00
            X.4Rd r1 = (X.AnonymousClass4Rd) r1
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r3 = X.C111095hX.A02(r0)
            X.4ea r3 = (X.C89654ea) r3
            X.1fJ r0 = r1.A0A
            java.util.List r2 = java.util.Collections.singletonList(r0)
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "selectedParentJids"
            X.C86644Kx.A0r(r1, r0, r2)
            com.whatsapp.community.CommunityDeleteDialogFragment r0 = new com.whatsapp.community.CommunityDeleteDialogFragment
            r0.<init>()
            r0.A0u(r1)
            goto L_0x060b
        L_0x04fb:
            java.lang.Object r4 = r12.A00
            X.4Rd r4 = (X.AnonymousClass4Rd) r4
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r3 = X.C111095hX.A02(r0)
            X.4ea r3 = (X.C89654ea) r3
            X.1fJ r2 = r4.A0A
            X.1VX r1 = r4.A08
            r0 = 2818(0xb02, float:3.949E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0526
            X.3Ex r1 = r4.A05
            X.1fJ r0 = r4.A0A
            X.3ZH r1 = r1.A0A(r0)
            X.2lX r0 = r4.A09
            boolean r0 = r0.A00(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0527
        L_0x0526:
            r1 = 0
        L_0x0527:
            com.whatsapp.community.CommunitySpamReportDialogFragment r0 = com.whatsapp.community.CommunitySpamReportDialogFragment.A00(r2, r1)
            r3.Boo(r0)
            return
        L_0x052f:
            java.lang.Object r2 = r12.A00
            X.3Ej r2 = (X.C64653Ej) r2
            java.lang.Object r0 = r12.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = X.C86664Kz.A0S(r0)
            java.lang.Integer r0 = X.C18280x3.A0S()
            r2.Bph(r1, r0, r0)
            return
        L_0x0543:
            java.lang.Object r1 = r12.A00
            X.0zT r1 = (X.C19390zT) r1
            java.lang.Object r0 = r12.A01
            X.2n2 r0 = (X.C53402n2) r0
            X.C19390zT.setupPopupMenu$lambda$2(r1, r0, r13)
            return
        L_0x054f:
            java.lang.Object r0 = r12.A00
            X.12b r0 = (X.C196612b) r0
            java.lang.Object r3 = r12.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.67D r2 = r0.A03
            android.content.Context r1 = r0.A00
            android.view.View r0 = r0.A01
            r2.BgA(r1, r0, r3)
            return
        L_0x0561:
            java.lang.Object r2 = r12.A00
            com.whatsapp.community.NewCommunityActivity r2 = (com.whatsapp.community.NewCommunityActivity) r2
            r0 = 0
            r2.A0F = r0
            java.lang.Object r1 = r12.A01
            X.5UY r1 = (X.AnonymousClass5UY) r1
            r0 = 8
            r1.A06(r0)
            X.33U r1 = r2.A0A
            X.2bU r0 = r1.A01
            java.lang.String r6 = r0.A00()
            java.lang.Integer r4 = r0.A02
            java.lang.Integer r2 = X.C18300x5.A0Y()
            java.lang.Integer r3 = X.C18290x4.A0b()
            r5 = 0
            r1.A08(r2, r3, r4, r5, r6)
            return
        L_0x0588:
            java.lang.Object r2 = r12.A00
            X.4ea r2 = (X.C89654ea) r2
            java.lang.Object r1 = r12.A01
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog r0 = new com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog
            r0.<init>(r1)
            r2.Boo(r0)
            return
        L_0x0599:
            java.lang.Object r4 = r12.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            java.lang.Object r5 = r12.A01
            X.2vf r5 = (X.C58692vf) r5
            X.4kJ r2 = r4.A0x
            r1 = 2
            X.5dl r0 = r4.A0e
            r2.A0G(r0, r1)
            X.3ZH r3 = r5.A00
            if (r3 == 0) goto L_0x05b7
            X.66r r2 = r4.A0l
            r1 = 6
            X.5jl r2 = (X.C112455jl) r2
            r0 = 0
            r2.Bpk(r4, r3, r1, r0)
            return
        L_0x05b7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tel:"
            r1.append(r0)
            java.lang.String r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r2 = "android.intent.action.DIAL"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r4.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x05d5 }
            goto L_0x05e5
        L_0x05d5:
            r1 = move-exception
            java.lang.String r0 = "contact_info/dial dialer app not found"
            com.whatsapp.util.Log.w(r0, r1)
            X.3Wi r2 = r4.A05
            r1 = 2131895056(0x7f122310, float:1.9424934E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x05e5:
            return
        L_0x05e6:
            java.lang.Object r3 = r12.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            java.lang.Object r2 = r12.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.4sd r1 = r3.A1S
            if (r1 == 0) goto L_0x05f6
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A00 = r0
        L_0x05f6:
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r3.A1m
            if (r0 == 0) goto L_0x060f
            X.5OF r0 = r0.A0D(r2)
            if (r0 == 0) goto L_0x060f
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x060f
            com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r0 = new com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment
            r0.<init>()
        L_0x060b:
            r3.Boo(r0)
            return
        L_0x060f:
            r3.A7J()
            return
        L_0x0613:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            java.lang.Object r0 = r12.A01
            X.4Ql r0 = (X.AnonymousClass4Ql) r0
            X.AnonymousClass4Ql.setViewModel$lambda$7(r1, r0, r13)
            return
        L_0x061f:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            java.lang.Object r0 = r12.A01
            X.4Ql r0 = (X.AnonymousClass4Ql) r0
            X.AnonymousClass4Ql.setViewModel$lambda$5(r1, r0, r13)
            return
        L_0x062b:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            java.lang.Object r2 = r12.A01
            android.view.View r2 = (android.view.View) r2
            X.66R r0 = r0.A0J
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            android.content.Context r0 = X.C18290x4.A0F(r2)
            r1.A0N(r0)
            return
        L_0x0643:
            java.lang.Object r1 = r12.A00
            X.6J6 r1 = (X.AnonymousClass6J6) r1
            java.lang.Object r4 = r12.A01
            android.view.View r4 = (android.view.View) r4
            r0 = 1
            X.C162457s7.A0J(r4, r0)
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r1 = r1.A00
            if (r1 == 0) goto L_0x066c
            X.4xk r0 = r1.A06
            r0.A0A()
            X.107 r0 = r1.A0E
            boolean r0 = X.C86604Kt.A1Z(r0)
            if (r0 == 0) goto L_0x066c
            X.3XG r3 = r1.A07
            java.lang.Integer r2 = X.C18310x6.A0e()
            r1 = 5
            r0 = 35
            r3.A01(r2, r1, r0)
        L_0x066c:
            r0 = 8
            r4.setVisibility(r0)
            return
        L_0x0672:
            java.lang.Object r4 = r12.A00
            X.1qk r4 = (X.C32491qk) r4
            java.lang.Object r0 = r12.A01
            X.7yT r0 = (X.C166307yT) r0
            int r3 = r0.A04
            int r2 = r0.A03
            int r1 = r0.A05
            r0 = 1
            r4.A74(r0, r3, r2, r1)
            return
        L_0x0685:
            X.2wE r3 = r5.A05
            r0 = 6
            X.3a6 r2 = new X.3a6
            r2.<init>(r5, r0, r6)
            X.3Ex r1 = r5.A0D
            com.whatsapp.jid.GroupJid r0 = r6.A02
            X.3ZH r0 = r1.A07(r0)
            X.2zZ r0 = r3.A01(r5, r0, r2)
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109465ef.onClick(android.view.View):void");
    }
}
