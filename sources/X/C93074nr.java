package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4nr  reason: invalid class name and case insensitive filesystem */
public class C93074nr extends AnonymousClass4nQ {
    public C183538qC A00;
    public C183538qC A01;
    public final View.OnClickListener A02 = new C109345eT(this, 16);
    public final View A03;
    public final TextView A04;
    public final ConversationRowAudioPreview A05;
    public final AnonymousClass5RC A06;
    public final C113895mA A07;
    public final AudioPlayerView A08;

    public void A1H() {
        A1t(false);
        A28();
    }

    public final void A29() {
        C30721mu r4 = (C30721mu) ((C30471mV) this.A0S);
        C113895mA r1 = this.A07;
        if (!r1.A0D(r4)) {
            A2A(r4);
            return;
        }
        C116095pj A002 = r1.A00();
        if (A002 != null) {
            if (!A002.A0I()) {
                A2A(r4);
            } else {
                AudioPlayerView audioPlayerView = this.A08;
                audioPlayerView.setPlayButtonState(1);
                audioPlayerView.setSeekbarMax((int) TimeUnit.SECONDS.toMillis((long) r4.A0B));
                audioPlayerView.setSeekbarProgress(A002.A01());
                setDuration(C107565bW.A0A(this.A0M, (long) (A002.A01() / 1000)));
                ConversationRowAudioPreview conversationRowAudioPreview = this.A05;
                if (conversationRowAudioPreview != null) {
                    C86644Kx.A15(conversationRowAudioPreview.A03, conversationRowAudioPreview);
                }
            }
            AudioPlayerView audioPlayerView2 = this.A08;
            audioPlayerView2.setSeekbarContentDescription((long) A002.A01());
            A002.A0K = new AnonymousClass5AT(this, 0);
            A002.A0J = new AnonymousClass684(this.A05, new AnonymousClass6AA(this, 0), new C124306Bt(this, 0), audioPlayerView2, this, A002, 0);
        }
    }

    public void A1N() {
        C107465bM.A04(this.A03.getRootView(), this.A07, this.A00);
        if (this.A02 != null) {
            if (!RequestPermissionActivity.A0r(getContext(), this.A02, this.A0O)) {
                return;
            }
        }
        C30721mu r6 = (C30721mu) ((C30471mV) this.A0S);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A0o(C624134x.A08(r6, "conversationrowvoicenote/viewmessage ", A0o), A0o);
        Context context = getContext();
        AnonymousClass92K r7 = new AnonymousClass92K(this, 0);
        C105025Tg r8 = this.A0T;
        C626936e.A06(r8);
        if (C107135al.A03(context, this.A0X, r6, r7, r8, this.A22)) {
            C116095pj A002 = this.A06.A00(C111095hX.A04(this), r6, false);
            A002.A0B(r6);
            A002.A0K = new AnonymousClass5AT(this, 0);
            A002.A0E(AnonymousClass000.A1U(r6.A1I, 82));
            A1H();
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A28();
        } else if (C87094Nz.A0j(this)) {
            A29();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A28() {
        /*
            r8 = this;
            X.34x r7 = r8.A0S
            X.1mV r7 = (X.C30471mV) r7
            X.1mu r7 = (X.C30721mu) r7
            X.33C r1 = X.C30471mV.A00(r7)
            android.content.Context r2 = r8.getContext()
            X.2sH r5 = r8.A1E
            X.3Ex r3 = r8.A0t
            X.5ZU r4 = r8.A0v
            X.33j r6 = r8.A0M
            java.lang.String r2 = X.AnonymousClass5YN.A01(r2, r3, r4, r5, r6, r7)
            android.view.View r0 = r8.A03
            r0.setContentDescription(r2)
            android.widget.TextView r3 = r8.A04
            r4 = 0
            r3.setVisibility(r4)
            int r0 = r7.A0B
            if (r0 != 0) goto L_0x0031
            java.io.File r0 = r1.A0F
            int r0 = X.C107655bf.A0F(r0)
            r7.A0B = r0
        L_0x0031:
            boolean r0 = X.C87094Nz.A0m(r8)
            if (r0 == 0) goto L_0x0072
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r0 = r8.A05
            if (r0 == 0) goto L_0x003e
            r0.A00()
        L_0x003e:
            X.33j r2 = r8.A0M
            long r0 = r7.A00
            X.C86634Kw.A1J(r3, r2, r0)
            com.whatsapp.search.views.itemviews.AudioPlayerView r1 = r8.A08
            r0 = 4
            r1.setPlayButtonState(r0)
            X.5ez r0 = r8.A08
            r1.setOnControlButtonClickListener(r0)
            r1.setSeekbarProgress(r4)
        L_0x0053:
            X.33j r2 = r8.A0M
            long r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass35V.A03(r2, r0)
        L_0x005b:
            r8.setDuration(r0)
        L_0x005e:
            r8.A1L()
            r8.A26(r7)
            X.1VX r1 = r8.A0O
            r0 = 5885(0x16fd, float:8.247E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0071
            r8.A1l(r7)
        L_0x0071:
            return
        L_0x0072:
            boolean r0 = X.C87094Nz.A0j(r8)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r7.A1x()
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 == 0) goto L_0x008c
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r0.getName()
            r7.A06 = r0
        L_0x008c:
            java.lang.String r0 = r7.A1x()
            boolean r0 = X.C107575bX.A0F(r0)
            if (r0 == 0) goto L_0x00b4
            r0 = 8
            r3.setVisibility(r0)
        L_0x009b:
            com.whatsapp.search.views.itemviews.AudioPlayerView r2 = r8.A08
            android.content.Context r1 = r8.getContext()
            r0 = 2131101955(0x7f060903, float:1.7816334E38)
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r2.setSeekbarColor(r0)
            r8.A29()
            android.view.View$OnClickListener r0 = r8.A02
            r2.setOnControlButtonClickListener(r0)
            goto L_0x005e
        L_0x00b4:
            java.lang.String r0 = r7.A1x()
            r3.setText(r0)
            goto L_0x009b
        L_0x00bc:
            com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview r0 = r8.A05
            if (r0 == 0) goto L_0x00c3
            r0.A00()
        L_0x00c3:
            X.33j r2 = r8.A0M
            long r0 = r7.A00
            X.C86634Kw.A1J(r3, r2, r0)
            boolean r0 = X.C383227b.A00(r7)
            com.whatsapp.search.views.itemviews.AudioPlayerView r1 = r8.A08
            if (r0 != 0) goto L_0x00e7
            r0 = 2
            r1.setPlayButtonState(r0)
            X.5ez r0 = r8.A0A
        L_0x00d8:
            r1.setOnControlButtonClickListener(r0)
            int r0 = r7.A0B
            if (r0 == 0) goto L_0x0053
            X.33j r0 = r8.A0M
            java.lang.String r0 = X.C107565bW.A0G(r0, r7)
            goto L_0x005b
        L_0x00e7:
            r0 = 3
            r1.setPlayButtonState(r0)
            X.5ez r0 = r8.A09
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93074nr.A28():void");
    }

    public final void A2A(C30721mu r4) {
        int intValue;
        Number A0p = AnonymousClass0x9.A0p(r4.A1J, C116095pj.A13);
        if (A0p == null) {
            intValue = 0;
        } else {
            intValue = A0p.intValue();
        }
        AudioPlayerView audioPlayerView = this.A08;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r4.A0B * 1000);
        audioPlayerView.setSeekbarProgress(intValue);
        audioPlayerView.setSeekbarContentDescription((long) intValue);
        setDuration(C107565bW.A0G(this.A0M, r4));
        ConversationRowAudioPreview conversationRowAudioPreview = this.A05;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    public C30721mu getFMessage() {
        return (C30721mu) ((C30471mV) this.A0S);
    }

    public void setDuration(String str) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A05;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.setDuration(str);
        }
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30721mu);
        super.setFMessage(r2);
    }

    public C93074nr(Context context, AnonymousClass677 r9, AnonymousClass5RC r10, C113895mA r11, C30721mu r12) {
        super(context, r9, r12);
        this.A06 = r10;
        this.A07 = r11;
        this.A03 = findViewById(R.id.conversation_row_root);
        AudioPlayerView audioPlayerView = (AudioPlayerView) C06560Yg.A02(this, R.id.conversation_row_audio_player_view);
        this.A08 = audioPlayerView;
        this.A05 = (ConversationRowAudioPreview) findViewById(R.id.conversation_row_audio_preview);
        this.A04 = C18300x5.A0G(this, R.id.description);
        audioPlayerView.setPlaybackListener(new C110295g0(r11, audioPlayerView, new AnonymousClass90O(this, 0), new AnonymousClass68F(this, 0), this.A01));
        View.OnLongClickListener onLongClickListener = this.A2T;
        audioPlayerView.setSeekbarLongClickListener(onLongClickListener);
        audioPlayerView.setOnControlButtonLongClickListener(onLongClickListener);
        A28();
        int BBm = ((C185738uA) this.A01.get()).BBm(r12.A1L);
        if (BBm >= 0) {
            audioPlayerView.setSeekbarProgress(BBm);
        }
    }

    public int getMainChildMaxWidth() {
        if (C87094Nz.A0h(this)) {
            return 0;
        }
        return C87094Nz.A05(this);
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
