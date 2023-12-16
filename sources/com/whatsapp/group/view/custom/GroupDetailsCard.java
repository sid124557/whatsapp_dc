package com.whatsapp.group.view.custom;

import X.AnonymousClass0GH;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GJ;
import X.AnonymousClass58W;
import X.AnonymousClass5UG;
import X.AnonymousClass5Y0;
import X.AnonymousClass5YB;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.C106545Zk;
import X.C107345b9;
import X.C111095hX;
import X.C111685iW;
import X.C116855qy;
import X.C1224264i;
import X.C1230066r;
import X.C15110qn;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C187958y5;
import X.C27991fJ;
import X.C33401sw;
import X.C52472lX;
import X.C54292oU;
import X.C56072rN;
import X.C56892sj;
import X.C56972sr;
import X.C620533h;
import X.C620733j;
import X.C627436k;
import X.C627736r;
import X.C635439q;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88864av;
import X.C89654ea;
import X.C95084sb;
import X.C990454f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.contact.view.custom.ContactDetailsActionIcon;
import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import java.util.List;

public final class GroupDetailsCard extends LinearLayout implements C15110qn, AnonymousClass4GJ {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public TextView A05;
    public C111095hX A06;
    public C56972sr A07;
    public TextEmojiLabel A08;
    public AnonymousClass64J A09;
    public AnonymousClass5YB A0A;
    public WaTextView A0B;
    public C1230066r A0C;
    public C1224264i A0D;
    public AnonymousClass5UG A0E;
    public C64773Ex A0F;
    public AnonymousClass5ZU A0G;
    public C54292oU A0H;
    public AnonymousClass33p A0I;
    public C620733j A0J;
    public C56892sj A0K;
    public C620533h A0L;
    public AnonymousClass3ZH A0M;
    public AnonymousClass5Y0 A0N;
    public AnonymousClass1VX A0O;
    public C95084sb A0P;
    public AnonymousClass58W A0Q;
    public GroupCallButtonController A0R;
    public C66493Lq A0S;
    public C52472lX A0T;
    public C27991fJ A0U;
    public C56072rN A0V;
    public C187958y5 A0W;
    public C116855qy A0X;
    public boolean A0Y;
    public boolean A0Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A00();
        boolean A012 = C106545Zk.A01(getAbProps());
        this.A0Z = A012;
        AnonymousClass5YB.A01(C18280x3.A0D(this), this, A012 ? R.layout.f8nameremoved : R.layout.f8nameremoved);
    }

    private final void setSubtitleNumberOfParticipantsText(String str) {
        if (!(str == null || str.length() == 0)) {
            C52472lX suspensionManager = getSuspensionManager();
            AnonymousClass3ZH r0 = this.A0M;
            if (r0 == null) {
                throw C18270x1.A0S("groupChat");
            } else if (!suspensionManager.A01(r0)) {
                C52472lX suspensionManager2 = getSuspensionManager();
                AnonymousClass3ZH r02 = this.A0M;
                if (r02 == null) {
                    throw C18270x1.A0S("groupChat");
                } else if (!suspensionManager2.A00(r02)) {
                    TextView textView = this.A05;
                    textView.setVisibility(0);
                    textView.setText(str);
                    return;
                }
            }
        }
        this.A05.setVisibility(8);
    }

    public static final void setupClickListeners$lambda$1(GroupDetailsCard groupDetailsCard, View view) {
        C162457s7.A0J(groupDetailsCard, 0);
        C95084sb r1 = groupDetailsCard.A0P;
        if (r1 == null) {
            throw C18270x1.A0S("wamGroupInfo");
        }
        r1.A08 = Boolean.TRUE;
        C111095hX activityUtils = groupDetailsCard.getActivityUtils();
        Context context = groupDetailsCard.getContext();
        C627736r A1B = C86664Kz.A1B();
        Context context2 = groupDetailsCard.getContext();
        AnonymousClass3ZH r0 = groupDetailsCard.A0M;
        if (r0 == null) {
            throw C18270x1.A0S("groupChat");
        }
        activityUtils.A0C(context, C86654Ky.A0D(C86634Kw.A0D(context2, A1B, AnonymousClass3ZH.A01(r0))), "GroupChatInfoActivity");
    }

    public static final void setupClickListeners$lambda$2(GroupDetailsCard groupDetailsCard, View view) {
        C162457s7.A0J(groupDetailsCard, 0);
        C95084sb r1 = groupDetailsCard.A0P;
        if (r1 == null) {
            throw C18270x1.A0S("wamGroupInfo");
        }
        r1.A0A = Boolean.TRUE;
        groupDetailsCard.A05(groupDetailsCard.A04, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        if (r3.A01.A06(r7) != 2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c7, code lost:
        if (getGroupChatManager().A02(r10) != 1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0193, code lost:
        if (r0 != false) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass3ZH r10, com.whatsapp.group.GroupCallButtonController r11, X.C27991fJ r12, int r13, boolean r14) {
        /*
            r9 = this;
            r0 = 1
            X.C18270x1.A10(r10, r0, r11)
            r9.A0M = r10
            r9.A0R = r11
            java.lang.Class<X.1fJ> r1 = X.C27991fJ.class
            com.whatsapp.jid.Jid r7 = X.AnonymousClass3ZH.A05(r10, r1)
            X.C162457s7.A0D(r7)
            X.1fJ r7 = (X.C27991fJ) r7
            r9.A0U = r7
            if (r7 != 0) goto L_0x001e
            java.lang.String r0 = "gid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x001e:
            android.content.Context r2 = r9.getContext()
            boolean r2 = r2 instanceof X.C009707r
            if (r2 == 0) goto L_0x0053
            X.1VX r2 = r9.getAbProps()
            boolean r2 = X.C627436k.A0H(r2)
            if (r2 == 0) goto L_0x0053
            X.33h r2 = r9.getParticipantUserStore()
            boolean r2 = r2.A0M(r7)
            if (r2 == 0) goto L_0x0053
            android.content.Context r2 = r9.getContext()
            android.app.Activity r4 = X.C111095hX.A00(r2)
            X.07r r4 = (X.C009707r) r4
            X.64i r3 = r9.getGroupCallMenuHelperFactory()
            X.5jq r2 = new X.5jq
            r2.<init>(r10, r9, r7)
            X.5UG r2 = r3.B0A(r4, r2, r7, r0)
            r9.A0E = r2
        L_0x0053:
            X.1VX r2 = r9.getAbProps()
            boolean r2 = X.AnonymousClass5YT.A00(r10, r2)
            if (r2 == 0) goto L_0x014e
            X.2oU r5 = r9.getWaContext()
            X.2sr r2 = r9.getMeManager()
            X.3Ex r3 = r9.getContactManager()
            X.5ZU r4 = r9.getWaContactNames()
            X.2sj r6 = r9.getGroupParticipantsManager()
            r8 = 3
            java.lang.String r3 = X.AnonymousClass33v.A01(r2, r3, r4, r5, r6, r7, r8)
        L_0x0076:
            boolean r2 = r10.A0W()
            r9.A07(r3, r2)
            X.2rN r2 = r9.getGroupChatUtils()
            boolean r6 = r2.A05(r7)
            X.2rN r3 = r9.getGroupChatUtils()
            boolean r2 = r3.A01()
            if (r2 == 0) goto L_0x0099
            X.2ss r2 = r3.A01
            int r3 = r2.A06(r7)
            r2 = 2
            r5 = 1
            if (r3 == r2) goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            X.2rN r3 = r9.getGroupChatUtils()
            X.2ss r2 = r3.A01
            int r2 = r2.A06(r7)
            boolean r2 = r3.A02(r2)
            boolean r2 = X.AnonymousClass000.A1S(r2)
            r3 = 8
            r4 = 0
            if (r6 == 0) goto L_0x00f6
            r5 = 2131887935(0x7f12073f, float:1.9410491E38)
            android.content.res.Resources r2 = r9.getResources()
            java.lang.String r2 = r2.getString(r5)
            r9.setSubtitleText(r2)
            X.3Lq r2 = r9.getGroupChatManager()
            int r2 = r2.A02(r10)
            if (r2 == r0) goto L_0x00d7
        L_0x00c9:
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131755133(0x7f10007d, float:1.9141137E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r2, r13, r4, r0)
            r9.setSubtitleNumberOfParticipantsText(r0)
        L_0x00d7:
            X.1VX r2 = r9.getAbProps()
            r0 = 5525(0x1595, float:7.742E-42)
            boolean r0 = r2.A0X(r0)
            java.lang.String r6 = "groupChat"
            X.2sj r5 = r9.getGroupParticipantsManager()
            if (r0 == 0) goto L_0x015d
            X.2lX r2 = r9.getSuspensionManager()
            X.3ZH r0 = r9.A0M
            if (r0 != 0) goto L_0x0158
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x00f6:
            if (r5 != 0) goto L_0x00fa
            if (r2 == 0) goto L_0x012f
        L_0x00fa:
            X.2sj r2 = r9.getGroupParticipantsManager()
            boolean r2 = r2.A0C(r7)
            if (r2 == 0) goto L_0x012f
            X.5ZU r2 = r9.getWaContactNames()
            java.lang.String r6 = r2.A0T(r12)
            boolean r2 = X.C107575bX.A0F(r6)
            if (r2 != 0) goto L_0x0123
            android.content.res.Resources r5 = r9.getResources()
            r2 = 2131894139(0x7f121f7b, float:1.9423074E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = X.C18320x8.A0b(r5, r6, r0, r4, r2)
        L_0x011f:
            r9.setSubtitleText(r0)
            goto L_0x00c9
        L_0x0123:
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131894140(0x7f121f7c, float:1.9423076E38)
            java.lang.String r0 = r2.getString(r0)
            goto L_0x011f
        L_0x012f:
            X.2lX r0 = r9.getSuspensionManager()
            boolean r0 = r0.A01(r10)
            if (r0 == 0) goto L_0x013f
            com.whatsapp.TextEmojiLabel r0 = r9.A08
            r0.setVisibility(r3)
            goto L_0x00d7
        L_0x013f:
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131755142(0x7f100086, float:1.9141155E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0Y(r2, r13, r4, r0)
            r9.setSubtitleText(r0)
            goto L_0x00d7
        L_0x014e:
            X.5ZU r2 = r9.getWaContactNames()
            java.lang.String r3 = r2.A0H(r10)
            goto L_0x0076
        L_0x0158:
            boolean r2 = X.AnonymousClass31Y.A01(r5, r0, r2)
            goto L_0x0196
        L_0x015d:
            X.1fJ r0 = r9.A0U
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = "gid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0168:
            boolean r0 = r5.A0D(r0)
            if (r0 == 0) goto L_0x0195
            X.2lX r2 = r9.getSuspensionManager()
            X.3ZH r0 = r9.A0M
            if (r0 != 0) goto L_0x017b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x017b:
            boolean r0 = r2.A01(r0)
            if (r0 != 0) goto L_0x0195
            X.2lX r2 = r9.getSuspensionManager()
            X.3ZH r0 = r9.A0M
            if (r0 != 0) goto L_0x018e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x018e:
            boolean r0 = r2.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0196
        L_0x0195:
            r2 = 0
        L_0x0196:
            android.view.View r0 = r9.A00
            X.C86624Kv.A11(r0, r2, r4, r3)
            android.view.View r2 = r9.A03
            int r0 = X.AnonymousClass001.A08(r14)
            r2.setVisibility(r0)
            android.view.View r0 = r9.A02
            if (r14 != 0) goto L_0x01a9
            r3 = 0
        L_0x01a9:
            r0.setVisibility(r3)
            android.view.View r2 = r9.A02
            X.2lX r0 = r9.getSuspensionManager()
            boolean r0 = r0.A02(r7)
            r0 = r0 ^ 1
            r2.setEnabled(r0)
            X.3ZH r0 = r11.A03
            if (r0 == r10) goto L_0x01eb
            X.1sw r0 = r11.A01
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x01ca
            r0.A0D(r2)
            r11.A01 = r3
        L_0x01ca:
            X.54f r0 = r11.A00
            if (r0 == 0) goto L_0x01d3
            r0.A0D(r2)
            r11.A00 = r3
        L_0x01d3:
            r11.A03 = r3
            r11.A06 = r3
            X.58W r0 = X.AnonymousClass58W.NONE
            r11.A04 = r0
            r11.A08 = r3
            r11.A05 = r3
            r11.A02 = r3
            r11.A03 = r10
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3ZH.A05(r10, r1)
            X.1fJ r0 = (X.C27991fJ) r0
            r11.A06 = r0
        L_0x01eb:
            X.5GJ r0 = new X.5GJ
            r0.<init>(r9)
            r11.A05 = r0
            r9.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.view.custom.GroupDetailsCard.A06(X.3ZH, com.whatsapp.group.GroupCallButtonController, X.1fJ, int, boolean):void");
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A0O = r2;
    }

    public final void setActivityUtils(C111095hX r2) {
        C162457s7.A0J(r2, 0);
        this.A06 = r2;
    }

    public final void setCallsManager(C1230066r r2) {
        C162457s7.A0J(r2, 0);
        this.A0C = r2;
    }

    public final void setContactManager(C64773Ex r2) {
        C162457s7.A0J(r2, 0);
        this.A0F = r2;
    }

    public final void setEmojiLoader(AnonymousClass5Y0 r2) {
        C162457s7.A0J(r2, 0);
        this.A0N = r2;
    }

    public final void setGroupCallButton(View view) {
        C162457s7.A0J(view, 0);
        this.A01 = view;
    }

    public final void setGroupCallMenuHelperFactory(C1224264i r2) {
        C162457s7.A0J(r2, 0);
        this.A0D = r2;
    }

    public final void setGroupChatManager(C66493Lq r2) {
        C162457s7.A0J(r2, 0);
        this.A0S = r2;
    }

    public final void setGroupChatUtils(C56072rN r2) {
        C162457s7.A0J(r2, 0);
        this.A0V = r2;
    }

    public final void setGroupInfoLoggingEvent(C95084sb r2) {
        C162457s7.A0J(r2, 0);
        this.A0P = r2;
    }

    public final void setGroupParticipantsManager(C56892sj r2) {
        C162457s7.A0J(r2, 0);
        this.A0K = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A07 = r2;
    }

    public final void setParticipantUserStore(C620533h r2) {
        C162457s7.A0J(r2, 0);
        this.A0L = r2;
    }

    public final void setSearchChatButton(View view) {
        C162457s7.A0J(view, 0);
        this.A02 = view;
    }

    public final void setSecondSubtitleText(String str) {
        if (str == null || str.length() == 0) {
            this.A0B.setVisibility(8);
            return;
        }
        WaTextView waTextView = this.A0B;
        waTextView.setVisibility(0);
        waTextView.setText(str);
    }

    public final void setSuspensionManager(C52472lX r2) {
        C162457s7.A0J(r2, 0);
        this.A0T = r2;
    }

    public final void setSystemFeatures(C187958y5 r2) {
        C162457s7.A0J(r2, 0);
        this.A0W = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(AnonymousClass64J r2) {
        C162457s7.A0J(r2, 0);
        this.A09 = r2;
    }

    public final void setVideoCallButton(View view) {
        C162457s7.A0J(view, 0);
        this.A04 = view;
    }

    public final void setWaContactNames(AnonymousClass5ZU r2) {
        C162457s7.A0J(r2, 0);
        this.A0G = r2;
    }

    public final void setWaContext(C54292oU r2) {
        C162457s7.A0J(r2, 0);
        this.A0H = r2;
    }

    public final void setWaSharedPreferences(AnonymousClass33p r2) {
        C162457s7.A0J(r2, 0);
        this.A0I = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A0J = r2;
    }

    public static /* synthetic */ void getGroupCallButton$annotations() {
    }

    public static /* synthetic */ void getGroupCallButtonController$annotations() {
    }

    public static /* synthetic */ void getSearchChatButton$annotations() {
    }

    public static /* synthetic */ void getVideoCallButton$annotations() {
    }

    public void A00() {
        if (!this.A0Y) {
            this.A0Y = true;
            C88864av r2 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r1 = r2.A0K;
            this.A0O = C64333Db.A4B(r1);
            this.A07 = C64333Db.A06(r1);
            this.A0H = C64333Db.A2q(r1);
            this.A0N = C64333Db.A3o(r1);
            this.A0C = C86644Kx.A0Q(r1);
            this.A06 = C64333Db.A00(r1);
            this.A0F = C64333Db.A26(r1);
            this.A0W = C86614Ku.A0o(r1);
            this.A0G = C64333Db.A28(r1);
            this.A0J = C64333Db.A2t(r1);
            this.A0V = C64333Db.A8w(r1);
            this.A0S = C64333Db.A5A(r1);
            this.A0T = C86644Kx.A0W(r1);
            this.A0I = C64333Db.A2s(r1);
            this.A0L = (C620533h) r1.APC.get();
            this.A0K = C64333Db.A3G(r1);
            this.A0D = (C1224264i) r2.A0I.A1D.get();
            this.A09 = C86614Ku.A0N(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r3 == X.AnonymousClass58W.ONE_TAP_VOICE_CHAT) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        getSystemFeatures();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r2 = r14.A01;
        r1 = com.whatsapp.R.drawable.vec_ic_action_voicechat;
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r1 == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
        if (r1 != 2) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        A04(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r14 = this;
            com.whatsapp.group.GroupCallButtonController r2 = r14.A0R
            if (r2 == 0) goto L_0x0055
            X.3ZH r0 = r2.A03
            if (r0 != 0) goto L_0x0108
            X.58W r0 = X.AnonymousClass58W.NONE
        L_0x000a:
            r2.A04 = r0
        L_0x000c:
            X.58W r3 = r2.A04
            r14.A0Q = r3
            X.3ZH r9 = r2.A03
            r1 = 0
            if (r9 == 0) goto L_0x0033
            X.1VX r10 = r2.A0K
            X.1fJ r11 = r2.A06
            X.5TW r6 = r2.A0E
            X.2rN r12 = r2.A0O
            X.2sj r8 = r2.A0I
            X.2sr r4 = r2.A0A
            X.3Mh r5 = r2.A0B
            X.3Ex r7 = r2.A0F
            X.58W r0 = X.AnonymousClass58W.VOICE_CHAT_ONLY
            if (r3 == r0) goto L_0x002e
            X.58W r0 = X.AnonymousClass58W.ONE_TAP_VOICE_CHAT
            r13 = 0
            if (r3 != r0) goto L_0x002f
        L_0x002e:
            r13 = 1
        L_0x002f:
            boolean r1 = X.AnonymousClass36T.A06(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0033:
            android.view.View r0 = r14.A01
            r0.setEnabled(r1)
            android.view.View r0 = r14.A04
            r0.setEnabled(r1)
            X.58W r0 = r14.A0Q
            if (r0 != 0) goto L_0x0102
            r4 = -1
        L_0x0042:
            r3 = 0
            r1 = 8
            android.view.View r0 = r14.A01
            switch(r4) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0074;
                case 3: goto L_0x0088;
                case 4: goto L_0x00ed;
                case 5: goto L_0x0056;
                default: goto L_0x004a;
            }
        L_0x004a:
            r0.setVisibility(r1)
            android.view.View r0 = r14.A04
            r0.setVisibility(r1)
        L_0x0052:
            r14.getSystemFeatures()
        L_0x0055:
            return
        L_0x0056:
            r0.setVisibility(r3)
            r14.A02()
            android.view.View r0 = r14.A04
            r0.setVisibility(r1)
            goto L_0x007f
        L_0x0062:
            r0.setVisibility(r3)
            android.view.View r0 = r14.A04
            r0.setVisibility(r3)
            android.view.View r2 = r14.A01
            r1 = 2131231718(0x7f0803e6, float:1.8079525E38)
            r0 = 2131888137(0x7f120809, float:1.94109E38)
            goto L_0x00fd
        L_0x0074:
            r0.setVisibility(r3)
            r14.A02()
            android.view.View r0 = r14.A04
            r0.setVisibility(r3)
        L_0x007f:
            android.view.View r2 = r14.A01
            r1 = 2131233869(0x7f080c4d, float:1.8083888E38)
            r0 = 2131895182(0x7f12238e, float:1.942519E38)
            goto L_0x00fd
        L_0x0088:
            r0.setVisibility(r3)
            android.view.View r0 = r14.A04
            r0.setVisibility(r1)
            android.view.View r4 = r14.A01
            X.2mt r0 = r2.A09
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x00dd
            r3 = 2131231803(0x7f08043b, float:1.8079697E38)
        L_0x009d:
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.1fJ r1 = r2.A06
            if (r1 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            com.whatsapp.jid.GroupJid r0 = r0.groupJid
            boolean r1 = r1.equals(r0)
            r0 = 2131895416(0x7f122478, float:1.9425664E38)
            if (r1 != 0) goto L_0x00b5
        L_0x00b2:
            r0 = 2131896425(0x7f122869, float:1.942771E38)
        L_0x00b5:
            r14.A04(r4, r3, r0)
            android.view.View r4 = r14.A01
            X.3ZH r0 = r2.A03
            if (r0 != 0) goto L_0x00c3
            r2 = 0
        L_0x00bf:
            r4.setEnabled(r2)
            goto L_0x0052
        L_0x00c3:
            X.1fJ r3 = r2.A06
            X.5TW r0 = r2.A0E
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2 = 0
            if (r3 == 0) goto L_0x00bf
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00db
            boolean r0 = X.C627436k.A0N(r3, r1)
            if (r0 != 0) goto L_0x00db
            goto L_0x00bf
        L_0x00db:
            r2 = 1
            goto L_0x00bf
        L_0x00dd:
            X.3ZF r0 = r2.A08
            if (r0 == 0) goto L_0x00e9
            int r1 = r0.A0H
            r0 = 2
            r3 = 2131233869(0x7f080c4d, float:1.8083888E38)
            if (r1 == r0) goto L_0x009d
        L_0x00e9:
            r3 = 2131231718(0x7f0803e6, float:1.8079525E38)
            goto L_0x009d
        L_0x00ed:
            r0.setVisibility(r3)
            android.view.View r0 = r14.A04
            r0.setVisibility(r1)
            android.view.View r2 = r14.A01
            r1 = 2131231757(0x7f08040d, float:1.8079604E38)
            r0 = 2131889783(0x7f120e77, float:1.941424E38)
        L_0x00fd:
            r14.A04(r2, r1, r0)
            goto L_0x0052
        L_0x0102:
            int r4 = r0.ordinal()
            goto L_0x0042
        L_0x0108:
            X.1fJ r1 = r2.A06
            X.2ss r5 = r2.A0H
            if (r1 == 0) goto L_0x000c
            boolean r0 = r0.A0j
            if (r0 != 0) goto L_0x000c
            int r1 = r5.A06(r1)
            r0 = 3
            if (r1 == r0) goto L_0x000c
            X.2rn r4 = r2.A0J
            X.1fJ r0 = r2.A06
            boolean r0 = r4.A07(r0)
            if (r0 == 0) goto L_0x0175
            X.1fJ r0 = r2.A06
            X.2mt r0 = r4.A02(r0)
            r2.A09 = r0
            if (r0 == 0) goto L_0x0132
            long r0 = r0.A00
            r2.A00(r0)
        L_0x0132:
            X.2i6 r0 = r2.A02
            if (r0 != 0) goto L_0x014b
            X.1VX r0 = r2.A0K
            boolean r0 = X.C627436k.A0I(r0)
            if (r0 == 0) goto L_0x014b
            X.30F r4 = r2.A0L
            X.1fJ r3 = r2.A06
            r1 = 1
            X.6A3 r0 = new X.6A3
            r0.<init>(r2, r1)
            r4.A03(r3, r0)
        L_0x014b:
            X.2mt r0 = r2.A09
            if (r0 != 0) goto L_0x01aa
            X.2i6 r0 = r2.A02
            if (r0 != 0) goto L_0x01aa
            X.1fJ r3 = r2.A06
            X.3Mh r1 = r2.A0B
            X.2sj r4 = r2.A0I
            X.3ZH r0 = r2.A03
            boolean r0 = X.AnonymousClass36T.A07(r1, r5, r4, r0, r3)
            if (r0 == 0) goto L_0x018a
            X.1VX r3 = r2.A0K
            X.2sr r1 = r2.A0A
            X.1fJ r0 = r2.A06
            int r0 = X.C86664Kz.A0H(r4, r0)
            boolean r0 = X.C627436k.A0C(r1, r3, r0)
            if (r0 == 0) goto L_0x0186
            X.58W r0 = X.AnonymousClass58W.ONE_TAP_VOICE_CHAT
            goto L_0x000a
        L_0x0175:
            X.49R r3 = r2.A0D
            X.1fJ r0 = r2.A06
            X.1sw r1 = new X.1sw
            r1.<init>(r3, r4, r0)
            r2.A01 = r1
            X.4FS r0 = r2.A0P
            X.C86614Ku.A1R(r1, r0)
            goto L_0x0132
        L_0x0186:
            X.58W r0 = X.AnonymousClass58W.ONE_TAP_VOICE_CALL
            goto L_0x000a
        L_0x018a:
            X.1fJ r0 = r2.A06
            boolean r0 = r4.A0C(r0)
            if (r0 == 0) goto L_0x000c
            X.1VX r3 = r2.A0K
            X.2sr r1 = r2.A0A
            X.1fJ r0 = r2.A06
            int r0 = X.C86664Kz.A0H(r4, r0)
            boolean r0 = X.C627436k.A0C(r1, r3, r0)
            if (r0 == 0) goto L_0x01a6
            X.58W r0 = X.AnonymousClass58W.VOICE_CHAT_ONLY
            goto L_0x000a
        L_0x01a6:
            X.58W r0 = X.AnonymousClass58W.CALL_PICKER
            goto L_0x000a
        L_0x01aa:
            X.58W r0 = X.AnonymousClass58W.JOIN_CALL
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.view.custom.GroupDetailsCard.A01():void");
    }

    public final void A02() {
        float f;
        View view = this.A01;
        AnonymousClass1VX abProps = getAbProps();
        C56972sr meManager = getMeManager();
        C56892sj groupParticipantsManager = getGroupParticipantsManager();
        C27991fJ r0 = this.A0U;
        if (r0 == null) {
            throw C18270x1.A0S("gid");
        }
        int A0H2 = C86664Kz.A0H(groupParticipantsManager, r0);
        if (!C627436k.A0C(meManager, abProps, A0H2) || C627436k.A0B(meManager, abProps, A0H2)) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        view.setAlpha(f);
    }

    public final void A03() {
        C18310x6.A18(this.A03, this, 43);
        this.A02.setOnClickListener(new C635439q(this, 16));
        this.A01.setOnClickListener(new C635439q(this, 18));
        this.A04.setOnClickListener(new C635439q(this, 17));
    }

    public final void A04(View view, int i, int i2) {
        ContactDetailsActionIcon contactDetailsActionIcon;
        WDSActionTile wDSActionTile;
        if (this.A0Z) {
            if ((view instanceof WDSActionTile) && (wDSActionTile = (WDSActionTile) view) != null) {
                wDSActionTile.setIcon(i);
                wDSActionTile.setText(i2);
            }
        } else if ((view instanceof ContactDetailsActionIcon) && (contactDetailsActionIcon = (ContactDetailsActionIcon) view) != null) {
            contactDetailsActionIcon.A02.setImageResource(i);
            contactDetailsActionIcon.setTitle(i2);
        }
    }

    public final void A05(View view, boolean z) {
        AnonymousClass5UG r0 = this.A0E;
        if (r0 != null) {
            r0.A03(view, z ? 1 : 0);
        } else if (getContext() instanceof C89654ea) {
            C89654ea A052 = C111095hX.A05(getContext());
            AnonymousClass33p waSharedPreferences = getWaSharedPreferences();
            AnonymousClass3ZH r1 = this.A0M;
            if (r1 == null) {
                throw C18270x1.A0S("groupChat");
            }
            CallConfirmationFragment.A02(A052, waSharedPreferences, r1, AnonymousClass0x7.A0h(), z);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0X;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0X = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A0O;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C111095hX getActivityUtils() {
        C111095hX r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("activityUtils");
    }

    public final C1230066r getCallsManager() {
        C1230066r r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("callsManager");
    }

    public final C64773Ex getContactManager() {
        C64773Ex r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("contactManager");
    }

    public final AnonymousClass5Y0 getEmojiLoader() {
        AnonymousClass5Y0 r0 = this.A0N;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public final View getGroupCallButton() {
        return this.A01;
    }

    public final GroupCallButtonController getGroupCallButtonController() {
        return this.A0R;
    }

    public final C1224264i getGroupCallMenuHelperFactory() {
        C1224264i r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupCallMenuHelperFactory");
    }

    public final C66493Lq getGroupChatManager() {
        C66493Lq r0 = this.A0S;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupChatManager");
    }

    public final C56072rN getGroupChatUtils() {
        C56072rN r0 = this.A0V;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupChatUtils");
    }

    public final C56892sj getGroupParticipantsManager() {
        C56892sj r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupParticipantsManager");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final C620533h getParticipantUserStore() {
        C620533h r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("participantUserStore");
    }

    public final View getSearchChatButton() {
        return this.A02;
    }

    public final C52472lX getSuspensionManager() {
        C52472lX r0 = this.A0T;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("suspensionManager");
    }

    public final C187958y5 getSystemFeatures() {
        C187958y5 r0 = this.A0W;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("systemFeatures");
    }

    public final AnonymousClass64J getTextEmojiLabelViewControllerFactory() {
        AnonymousClass64J r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("textEmojiLabelViewControllerFactory");
    }

    public final View getVideoCallButton() {
        return this.A04;
    }

    public final AnonymousClass5ZU getWaContactNames() {
        AnonymousClass5ZU r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContactNames");
    }

    public final C54292oU getWaContext() {
        C54292oU r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContext");
    }

    public final AnonymousClass33p getWaSharedPreferences() {
        AnonymousClass33p r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_CREATE)
    public final void onActivityCreated() {
        GroupCallButtonController groupCallButtonController = this.A0R;
        if (groupCallButtonController != null) {
            groupCallButtonController.A0R.A06(groupCallButtonController.A0Q);
            groupCallButtonController.A0T.A06(groupCallButtonController.A0S);
            groupCallButtonController.A0N.A06(groupCallButtonController.A0M);
        }
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_DESTROY)
    public final void onActivityDestroyed() {
        GroupCallButtonController groupCallButtonController = this.A0R;
        if (groupCallButtonController != null) {
            groupCallButtonController.A0R.A07(groupCallButtonController.A0Q);
            groupCallButtonController.A0T.A07(groupCallButtonController.A0S);
            groupCallButtonController.A0N.A07(groupCallButtonController.A0M);
            C33401sw r0 = groupCallButtonController.A01;
            if (r0 != null) {
                r0.A0D(true);
                groupCallButtonController.A01 = null;
            }
            C990454f r02 = groupCallButtonController.A00;
            if (r02 != null) {
                r02.A0D(true);
                groupCallButtonController.A00 = null;
            }
            groupCallButtonController.A03 = null;
            groupCallButtonController.A06 = null;
            groupCallButtonController.A04 = AnonymousClass58W.NONE;
            groupCallButtonController.A08 = null;
            groupCallButtonController.A05 = null;
            groupCallButtonController.A02 = null;
        }
    }

    public final void setAddPersonOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    public final void setSubtitleText(String str) {
        this.A08.A0K((List) null, str);
    }

    public final void setTitleColor(int i) {
        AnonymousClass5YB.A03(this.A0A, i);
    }

    public final void A07(String str, boolean z) {
        Context context = getContext();
        AnonymousClass5YB r4 = this.A0A;
        TextEmojiLabel textEmojiLabel = r4.A02;
        textEmojiLabel.setText(C107345b9.A04(context, textEmojiLabel.getPaint(), getEmojiLoader(), str, 0.9f));
        r4.A06(C18310x6.A02(z ? 1 : 0));
    }

    public final void setGroupCallButtonController(GroupCallButtonController groupCallButtonController) {
        this.A0R = groupCallButtonController;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A00();
        boolean A012 = C106545Zk.A01(getAbProps());
        this.A0Z = A012;
        AnonymousClass5YB.A01(C18280x3.A0D(this), this, A012 ? R.layout.f8nameremoved : R.layout.f8nameremoved);
    }

    public GroupDetailsCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A00();
        boolean A012 = C106545Zk.A01(getAbProps());
        this.A0Z = A012;
        AnonymousClass5YB.A01(C18280x3.A0D(this), this, A012 ? R.layout.f8nameremoved : R.layout.f8nameremoved);
    }
}
