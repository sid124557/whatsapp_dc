package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runOnCoroutineScope$1$1;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.CancellationException;

/* renamed from: X.1Pe  reason: invalid class name and case insensitive filesystem */
public final class C22691Pe extends C93314oJ {
    public C1230066r A00;
    public C623234o A01;
    public C29111iI A02;
    public C97094xc A03;
    public C73853gB A04;
    public C73853gB A05;
    public AnonymousClass4C6 A06;
    public boolean A07;
    public final View A08 = C18290x4.A0M(this, R.id.bubble_bg);
    public final TextEmojiLabel A09 = ((TextEmojiLabel) C18290x4.A0M(this, R.id.call_log_subtitle));
    public final TextEmojiLabel A0A = ((TextEmojiLabel) C18290x4.A0M(this, R.id.call_log_title));
    public final WaImageView A0B = ((WaImageView) C18290x4.A0M(this, R.id.call_type_icon));
    public final AnonymousClass4F0 A0C = new AnonymousClass3XE(this);
    public final C185958uW A0D = new AnonymousClass4ID(this, 1);
    public final AnonymousClass66R A0E = C154517dI.A01(new C77673tm(this));
    public final AnonymousClass66R A0F = C154517dI.A01(AnonymousClass40R.A00);
    public final AnonymousClass66R A0G = C154517dI.A01(new C77683tn(this));
    public final AnonymousClass66R A0H = C154517dI.A01(new C77693to(this));

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (X.C627436k.A0J(r9.A0O) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C30401mO r8, X.C22691Pe r9, X.AnonymousClass3ZF r10) {
        /*
            r3 = 0
            r5 = r8
            X.3ZF r0 = r8.A01
            r6 = r9
            r7 = r10
            if (r0 == 0) goto L_0x007b
            com.whatsapp.jid.GroupJid r0 = r0.A05
            if (r0 == 0) goto L_0x007b
            boolean r0 = r8.A1w()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r8.A20()
            if (r0 == 0) goto L_0x0027
            X.443 r2 = new X.443
            r2.<init>(r8, r9, r10)
        L_0x001d:
            r1 = 0
            com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1 r0 = new com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1
            r0.<init>(r9, r10, r1, r2)
            r9.A23(r0)
        L_0x0026:
            return
        L_0x0027:
            X.444 r2 = new X.444
            r2.<init>(r8, r9, r10)
            goto L_0x001d
        L_0x002d:
            boolean r0 = r8.A1y()
            if (r0 == 0) goto L_0x0053
            X.66r r4 = r9.getCallsManager()
            android.content.Context r3 = r9.getContext()
            int r2 = A00(r8)
            boolean r0 = r8.A20()
            if (r0 == 0) goto L_0x004e
            X.1VX r0 = r9.A0O
            boolean r1 = X.C627436k.A0J(r0)
            r0 = 1
            if (r1 == 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r4.BJS(r3, r10, r2, r0)
            return
        L_0x0053:
            X.3Wi r0 = r9.A0X
            X.4FU r5 = r0.A00
            if (r5 == 0) goto L_0x0026
            r9.getBottomSheetBridge()
            X.39J r2 = r10.A0E
            X.C162457s7.A0C(r2)
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet r4 = new com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet
            r4.<init>()
            r0 = 1
            X.3Z6[] r1 = new X.AnonymousClass3Z6[r0]
            java.lang.String r0 = "call_log_message_key"
            X.AnonymousClass3Z6.A09(r0, r2, r1, r3)
            android.os.Bundle r0 = X.C02820Hs.A00(r1)
            r4.A0u(r0)
            r9.getBottomSheetBridge()
            java.lang.String r0 = "CallLogMessageParticipantBottomSheet"
            goto L_0x00cc
        L_0x007b:
            boolean r1 = r8.A1v()
            boolean r0 = r8.A1y()
            if (r1 == 0) goto L_0x00ef
            if (r0 == 0) goto L_0x0099
            X.66r r2 = r9.getCallsManager()
            android.content.Context r1 = r9.getContext()
            int r0 = A00(r8)
            X.5jl r2 = (X.C112455jl) r2
            r2.BJS(r1, r10, r0, r3)
            return
        L_0x0099:
            X.1VX r2 = r9.A0O
            r1 = 6497(0x1961, float:9.104E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00d0
            X.3Wi r0 = r9.A0X
            X.4FU r5 = r0.A00
            if (r5 == 0) goto L_0x0026
            r9.getAdhocBottomSheetBridge()
            X.39J r2 = r10.A0E
            X.C162457s7.A0C(r2)
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet r4 = new com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet
            r4.<init>()
            r0 = 1
            X.3Z6[] r1 = new X.AnonymousClass3Z6[r0]
            java.lang.String r0 = "call_log_message_key"
            X.AnonymousClass3Z6.A09(r0, r2, r1, r3)
            android.os.Bundle r0 = X.C02820Hs.A00(r1)
            r4.A0u(r0)
            r9.getAdhocBottomSheetBridge()
            java.lang.String r0 = "AdhocParticipantBottomSheet"
        L_0x00cc:
            r5.Bon(r4, r0)
            return
        L_0x00d0:
            android.content.Context r1 = r9.getContext()
            java.lang.Class<X.4ea> r0 = X.C89654ea.class
            android.app.Activity r0 = X.C621633u.A01(r1, r0)
            X.4ea r0 = (X.C89654ea) r0
            if (r0 == 0) goto L_0x0026
            X.1VX r3 = r0.getAbProps()
            X.2sr r1 = r9.A0Z
            X.3Ex r2 = r9.A0t
            int r5 = A00(r8)
            r4 = r10
            X.C107305b5.A06(r0, r1, r2, r3, r4, r5)
            return
        L_0x00ef:
            if (r0 == 0) goto L_0x0122
            X.36r r3 = new X.36r
            r3.<init>()
            android.content.Context r2 = r9.getContext()
            X.39J r0 = r10.A0E
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.C626936e.A06(r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            android.content.Intent r2 = r3.A1Q(r2, r1, r0)
            X.C162457s7.A0D(r2)
            X.2z0 r0 = r8.A1J
            java.lang.String r1 = r0.A01
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r2.setData(r0)
            java.lang.String r0 = "call_id"
            r2.putExtra(r0, r1)
            android.content.Context r0 = r9.getContext()
            r0.startActivity(r2)
            return
        L_0x0122:
            X.1VX r2 = r9.A0O
            r1 = 6403(0x1903, float:8.973E-42)
            X.2vE r0 = X.C58422vE.A02
            int r9 = r2.A0O(r0, r1)
            X.33p r0 = r6.A1G
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "call_log_education_dialog_shown_count"
            int r10 = r1.getInt(r0, r3)
            r8 = 0
            com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4 r4 = new com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r6.A23(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22691Pe.A01(X.1mO, X.1Pe, X.3ZF):void");
    }

    public void A1q(C624134x r2, boolean z) {
        C162457s7.A0J(r2, 0);
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public final void setCallLogObservers(C29111iI r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setCallObservers(C97094xc r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setCallingMessageUtil(C623234o r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setCallsManager(C1230066r r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public void setFMessage(C624134x r2) {
        C162457s7.A0J(r2, 0);
        C626936e.A0C(r2 instanceof C30401mO);
        this.A0S = r2;
    }

    public final void setLatencySensitiveDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setMainDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A05 = r2;
    }

    private final AnonymousClass3L8 getAdhocBottomSheetBridge() {
        return (AnonymousClass3L8) this.A0E.getValue();
    }

    private final C52762m0 getAnimatedVectorDrawableHolder() {
        return (C52762m0) this.A0F.getValue();
    }

    private final AnonymousClass3L9 getBottomSheetBridge() {
        return (AnonymousClass3L9) this.A0G.getValue();
    }

    private final AnonymousClass5UY getCallLogDeletedStub() {
        return (AnonymousClass5UY) this.A0H.getValue();
    }

    private final void setCallIconDrawable(C30401mO r7) {
        WaImageView waImageView;
        Drawable A032;
        if (!this.A0O.A0Y(C58422vE.A02, 6121)) {
            WaImageView waImageView2 = this.A0B;
            waImageView2.setImageDrawable(getCallingMessageUtil().A03(C18290x4.A0F(waImageView2), getFMessage(), false));
            if (this.A0F.BHk()) {
                getAnimatedVectorDrawableHolder().A02();
                return;
            }
            return;
        }
        getCallingMessageUtil();
        int A002 = C623234o.A00(r7);
        if (A002 != 0) {
            waImageView = this.A0B;
            A032 = getAnimatedVectorDrawableHolder().A00(C18290x4.A0F(this), A002, true);
        } else {
            getAnimatedVectorDrawableHolder().A02();
            waImageView = this.A0B;
            A032 = getCallingMessageUtil().A03(C18290x4.A0F(waImageView), getFMessage(), false);
        }
        waImageView.setImageDrawable(A032);
    }

    public void A0v() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass0x7.A0I(this).A4V(this);
        }
    }

    public final void A23(AnonymousClass4GR r5) {
        AnonymousClass4C6 r3 = this.A06;
        if (r3 == null) {
            r3 = AnonymousClass349.A02(getLatencySensitiveDispatcher());
        }
        C616131n.A02((C85494Gl) null, new ConversationRowCallLog$runOnCoroutineScope$1$1((C84814Du) null, r5), r3, (AnonymousClass20D) null, 3);
        this.A06 = r3;
    }

    public final C29111iI getCallLogObservers() {
        C29111iI r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("callLogObservers");
    }

    public final C97094xc getCallObservers() {
        C97094xc r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("callObservers");
    }

    public final C623234o getCallingMessageUtil() {
        C623234o r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("callingMessageUtil");
    }

    public final C1230066r getCallsManager() {
        C1230066r r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("callsManager");
    }

    public C30401mO getFMessage() {
        C624134x r1 = this.A0S;
        C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.calling.fmessage.FMessageCallLog");
        return (C30401mO) r1;
    }

    public final C73853gB getLatencySensitiveDispatcher() {
        C73853gB r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("latencySensitiveDispatcher");
    }

    public final C73853gB getMainDispatcher() {
        C73853gB r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22691Pe(Context context, C30401mO r4, AnonymousClass677 r5) {
        super(context, r5, r4);
        C18260x0.A0Q(context, r4);
        A0v();
        A22();
    }

    public static final int A00(C30401mO r1) {
        if (r1.A1y()) {
            return 22;
        }
        if (r1.A1x()) {
            return 45;
        }
        if (r1.A1w()) {
            return 47;
        }
        return 46;
    }

    public static /* synthetic */ void getLatencySensitiveDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void A22() {
        int intValue;
        AnonymousClass3ZF r1;
        AnonymousClass3ZF r0;
        C30401mO fMessage = getFMessage();
        AnonymousClass3ZF r3 = fMessage.A01;
        View view = this.A08;
        view.setOnLongClickListener(this.A2T);
        if (r3 == null) {
            this.A0B.setVisibility(8);
            this.A0A.setVisibility(8);
            this.A09.setVisibility(8);
            view.setVisibility(8);
            getCallLogDeletedStub().A06(0);
            view.setOnClickListener((View.OnClickListener) null);
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A0A;
        ViewGroup.LayoutParams layoutParams = textEmojiLabel.getLayoutParams();
        if (layoutParams != null) {
            C001702c r12 = (C001702c) layoutParams;
            r12.A02 = 0.0f;
            textEmojiLabel.setLayoutParams(r12);
            this.A0B.setVisibility(0);
            textEmojiLabel.setVisibility(0);
            TextEmojiLabel textEmojiLabel2 = this.A09;
            textEmojiLabel2.setVisibility(0);
            view.setVisibility(0);
            getCallLogDeletedStub().A06(8);
            textEmojiLabel.setText(getResources().getText(getCallingMessageUtil().A02(fMessage)));
            C623234o callingMessageUtil = getCallingMessageUtil();
            AnonymousClass2z0 r9 = fMessage.A1J;
            UserJid A052 = AnonymousClass32Y.A05(r9.A00);
            Integer num = null;
            if (!(A052 == null || (r0 = fMessage.A01) == null)) {
                num = Integer.valueOf(r0.A04(A052));
            }
            if (!fMessage.A1v() || !fMessage.A1y() || num == null || ((intValue = num.intValue()) != 100 && (!r9.A02 ? (r1 = fMessage.A01) == null || r1.A0S(callingMessageUtil.A00) : intValue == 100 || intValue == 5))) {
                C623234o callingMessageUtil2 = getCallingMessageUtil();
                Resources resources = getResources();
                C162457s7.A0D(resources);
                textEmojiLabel2.setText(callingMessageUtil2.A05(resources, fMessage, (String) null));
            } else {
                A23(new ConversationRowCallLog$fillView$2(fMessage, this, (C84814Du) null));
            }
            setCallIconDrawable(fMessage);
            view.setOnClickListener(new C109725f5((Object) fMessage, (Object) this, (Object) r3, 34));
            return;
        }
        throw AnonymousClass001.A0g("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
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

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public int getUserNameViewId() {
        return R.id.conversation_row_call_log_user_name;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCallLogObservers().A06(this.A0C);
        getCallObservers().A06(this.A0D);
        if (this.A0O.A0Y(C58422vE.A02, 6121)) {
            C52762m0 animatedVectorDrawableHolder = getAnimatedVectorDrawableHolder();
            Context A0F2 = C18290x4.A0F(this);
            C52172l0 r2 = animatedVectorDrawableHolder.A01;
            if (r2.A00 != 0 && animatedVectorDrawableHolder.A00 == null) {
                animatedVectorDrawableHolder.A01();
                AnonymousClass0AR A042 = AnonymousClass0AR.A04(A0F2, r2.A00);
                if (A042 == null) {
                    A042 = null;
                } else {
                    if (r2.A01) {
                        A042.A09(animatedVectorDrawableHolder.A03);
                    }
                    if (r2.A02) {
                        A042.start();
                    }
                }
                animatedVectorDrawableHolder.A00 = A042;
            }
            AnonymousClass0AR r1 = animatedVectorDrawableHolder.A00;
            if (r1 != null) {
                this.A0B.setImageDrawable(r1);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass4C6 r1 = this.A06;
        if (r1 != null) {
            AnonymousClass349.A03((CancellationException) null, r1);
        }
        this.A06 = null;
        getCallLogObservers().A07(this.A0C);
        getCallObservers().A07(this.A0D);
        if (this.A0O.A0Y(C58422vE.A02, 6121)) {
            getAnimatedVectorDrawableHolder().A01();
        }
    }
}
