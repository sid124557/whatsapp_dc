package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4mv  reason: invalid class name and case insensitive filesystem */
public class C92584mv extends C93314oJ {
    public C146897Ca A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final LinearLayout A06;
    public final LinearLayout A07;
    public final LinearLayout A08;
    public final TextEmojiLabel A09;
    public final WaTextView A0A;
    public final C105365Uq A0B;
    public final AnonymousClass5UY A0C;
    public final List A0D = AnonymousClass001.A0s();
    public final boolean A0E;

    public void A1H() {
        A1t(false);
        A01(true);
    }

    public static /* synthetic */ void A00(C92584mv r1) {
        boolean z;
        if (C86644Kx.A1X(r1.A06)) {
            if (r1.A02) {
                Log.d("ConversationRowPoll/collapseOptions");
                z = false;
            } else {
                Log.d("ConversationRowPoll/expandOptions");
                z = true;
            }
            r1.A02 = z;
            r1.setEnabledForAccessibility(z);
        }
    }

    private void setEnabledForAccessibility(boolean z) {
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView;
        int i;
        LinearLayout linearLayout = this.A07;
        if (z) {
            i = 1;
            linearLayout.setImportantForAccessibility(1);
            conversationRowParticipantHeaderMainView = this.A13;
            if (conversationRowParticipantHeaderMainView == null) {
                return;
            }
        } else {
            linearLayout.setImportantForAccessibility(4);
            conversationRowParticipantHeaderMainView = this.A13;
            if (conversationRowParticipantHeaderMainView != null) {
                i = 2;
            } else {
                return;
            }
        }
        conversationRowParticipantHeaderMainView.setImportantForAccessibility(i);
    }

    public void A0v() {
        if (!this.A04) {
            this.A04 = true;
            C88864av A0C2 = C87094Nz.A0C(this);
            C64333Db r2 = A0C2.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A2 = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A2, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C2, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A2, r2, A0C2, this, C86604Kt.A0i(r2));
            C87094Nz.A0L(A0A2, r2, this);
            this.A00 = (C146897Ca) A0C2.A0C.get();
        }
    }

    public final void A22(int i) {
        int i2;
        if (this.A05) {
            LinearLayout linearLayout = this.A08;
            linearLayout.setVisibility(0);
            TextView A0G = C18300x5.A0G(linearLayout, R.id.poll_type_text);
            ImageView A0E2 = AnonymousClass0x9.A0E(linearLayout, R.id.multi_selection_poll_check_mark);
            Context context = getContext();
            if (i == 1) {
                C18290x4.A1A(context, A0E2, R.drawable.ic_round_check_poll_type);
                i2 = R.string.f11nameremoved;
            } else {
                C18290x4.A1A(context, A0E2, R.drawable.ic_round_check_multi_selection_poll_type);
                i2 = R.string.f11nameremoved;
            }
            A0G.setText(i2);
        }
    }

    public int getMainChildMaxWidth() {
        if (this.A0n.BHf(getFMessage())) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public List getPollVoteSelectedOptionIds() {
        return this.A01;
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof C30451mT);
        this.A0S = r2;
    }

    public C92584mv(Context context, C105365Uq r10, AnonymousClass677 r11, C30451mT r12) {
        super(context, r11, r12);
        AnonymousClass1RL r0;
        A0v();
        this.A0B = r10;
        LinearLayout A0N = C86654Ky.A0N(this, R.id.polls_main_layout);
        this.A06 = A0N;
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(this, R.id.poll_name);
        this.A09 = A0K;
        AnonymousClass0x2.A14(this.A0O, A0K);
        A0K.setAutoLinkMask(0);
        A0K.setLinksClickable(false);
        this.A07 = C86654Ky.A0N(this, R.id.poll_options);
        this.A08 = C86654Ky.A0N(this, R.id.poll_type_label);
        this.A05 = AnonymousClass31e.A02(this.A0O);
        AnonymousClass5UY A0M = AnonymousClass0x2.A0M(this, R.id.invalid_poll_text);
        this.A0C = A0M;
        A0M.A09(new AnonymousClass6B6(r12, 1, this));
        this.A0A = AnonymousClass0x7.A0L(this, R.id.view_details);
        C95814uZ r1 = getFMessage().A1J.A00;
        boolean z = false;
        if ((r1 instanceof C95804uY) && ((r0 = (AnonymousClass1RL) this.A0N.A0A(r1, false)) == null || !r0.A0K() || !this.A0O.A0X(6382))) {
            z = true;
        }
        int i = 8;
        if (z) {
            this.A0A.setVisibility(8);
        } else {
            WaTextView waTextView = this.A0A;
            C109475eg.A00(waTextView, this, context, 23);
            waTextView.setVisibility(this.A0O.A0X(1948) ? 0 : i);
            C107295b4.A02(waTextView);
        }
        A22(r12.A01);
        C93314oJ.A0q(A0K, this);
        boolean A0X = this.A0O.A0X(2390);
        this.A0E = A0X;
        if (!A0X) {
            setEnabledForAccessibility(false);
            this.A03 = false;
        } else if (C86644Kx.A1X(A0N)) {
            this.A03 = true;
            C107295b4.A03(A0N, R.string.f11nameremoved);
            setEnabledForAccessibility(false);
            C109345eT.A00(A0N, this, 29);
        }
        A01(false);
    }

    private void A01(boolean z) {
        C30451mT r5 = (C30451mT) getFMessage();
        String str = r5.A03;
        if (str != null) {
            setMessageText(str, this.A09, r5);
        }
        A22(r5.A01);
        C117665sI r4 = new C117665sI(this, r5, 16, z);
        LinearLayout linearLayout = this.A07;
        AnonymousClass2z0 r3 = r5.A1J;
        linearLayout.setTag(r3);
        boolean A002 = AnonymousClass3N0.A00(r5, (byte) 67);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!A002) {
            A0o.append("ConversationRowPoll/poll message doesn't need loading vote id=");
            C18260x0.A1J(A0o, r3.A01);
            r4.run();
            return;
        }
        A0o.append("ConversationRowPoll/poll message need loading votes id=");
        C18260x0.A1J(A0o, r3.A01);
        this.A0j.A00(r5, r4, (byte) 67);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1q(X.C624134x r5, boolean r6) {
        /*
            r4 = this;
            X.34x r0 = r4.getFMessage()
            r3 = 1
            r1 = 0
            r2 = 0
            if (r5 == r0) goto L_0x0016
            r2 = 1
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0016
            r4.A02 = r1
            android.widget.LinearLayout r1 = r4.A07
            r0 = 4
            r1.setImportantForAccessibility(r0)
        L_0x0016:
            super.A1q(r5, r6)
            if (r6 != 0) goto L_0x0022
            if (r2 == 0) goto L_0x0021
        L_0x001d:
            r3 = 0
        L_0x001e:
            r4.A01(r3)
        L_0x0021:
            return
        L_0x0022:
            if (r2 != 0) goto L_0x001d
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92584mv.A1q(X.34x, boolean):void");
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
