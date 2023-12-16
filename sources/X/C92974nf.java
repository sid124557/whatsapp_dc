package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.4nf  reason: invalid class name and case insensitive filesystem */
public class C92974nf extends C93214o9 {
    public AnonymousClass5O8 A00;
    public C183538qC A01;
    public boolean A02;
    public final int A03;
    public final C08270df A04;
    public final InteractiveMessageButton A05;
    public final InteractiveMessageView A06;

    public void A0v() {
        if (!this.A02) {
            this.A02 = true;
            C88864av A0C = C87094Nz.A0C(this);
            C64333Db r2 = A0C.A0K;
            C87094Nz.A0W(r2, this);
            C87094Nz.A0X(r2, this);
            C87094Nz.A0Y(r2, this);
            C87094Nz.A0Z(r2, this);
            C87094Nz.A0a(r2, this, C87094Nz.A0D(r2));
            C116985rC A0A = C87094Nz.A0A(r2, this);
            C87094Nz.A0R(r2, r2.A00, this);
            C87094Nz.A0M(A0A, r2, this, r2.A4V);
            C87094Nz.A0S(r2, A0C, this);
            C87094Nz.A0b(r2, this, C87094Nz.A0E(r2));
            C87094Nz.A0I(A0A, r2, A0C, this, C86604Kt.A0i(r2));
            C87094Nz.A0P(A0A, r2, this);
            C87094Nz.A0U(r2, A0C, this);
            this.A01 = C72343dZ.A00(A0C.A0E);
            this.A00 = A0C.A44();
        }
    }

    public final void A2C() {
        C30471mV r3 = (C30471mV) this.A0S;
        this.A06.A03(this, r3);
        this.A05.A00(this.A04, this, this.A0m, r3);
    }

    public C31941p8 getFMessage() {
        return (C31941p8) ((C31971pB) ((C30471mV) this.A0S));
    }

    public void onMeasure(int i, int i2) {
        if (AnonymousClass36V.A06((C30471mV) this.A0S)) {
            i = C86664Kz.A05(this.A03);
        }
        super.onMeasure(i, i2);
    }

    public C92974nf(Context context, C08270df r8, AnonymousClass677 r9, C31941p8 r10, int i) {
        super(context, r9, r10);
        ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView;
        A0v();
        float A0L = this.A0O.A0L(5073);
        this.A04 = r8;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) C06560Yg.A02(this, R.id.button);
        this.A05 = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C06560Yg.A02(this, R.id.interactive_view);
        this.A06 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r10.A1J.A02 ^ true ? 1 : 0);
        AnonymousClass5R6 r4 = (AnonymousClass5R6) this.A01.get();
        r4.A03 = new C112995ki(this);
        interactiveMessageView.A02(this.A2T, r4);
        interactiveMessageButton.A0E.A00 = r4;
        if (i > 0) {
            interactiveMessageView.setDescriptionMinLines(i);
        }
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved) + (getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2);
        A2C();
        if (r4.A09 && (conversationRowVideo$RowVideoView = this.A0G) != null) {
            int A062 = C87094Nz.A06(this) - (C86614Ku.A05(this, R.dimen.f6nameremoved) * 2);
            conversationRowVideo$RowVideoView.A0H = r4.A09;
            conversationRowVideo$RowVideoView.A05 = A062;
            conversationRowVideo$RowVideoView.A04 = (int) (A0L * ((float) A062));
            C86644Kx.A1A(conversationRowVideo$RowVideoView);
            conversationRowVideo$RowVideoView.A09 = C106205Ya.A01(getContext());
            View A022 = C06560Yg.A02(this, R.id.media_container);
            if (A022 != null) {
                A022.setPadding(C86614Ku.A05(this, R.dimen.f6nameremoved), C86614Ku.A05(this, R.dimen.f6nameremoved), C86614Ku.A05(this, R.dimen.f6nameremoved), 0);
            }
        }
    }

    public void A1H() {
        super.A1H();
        A2C();
    }

    public void A1q(C624134x r2, boolean z) {
        super.A1q(r2, z);
        boolean A1W = C18300x5.A1W(r2, (C30471mV) this.A0S);
        if (z || A1W) {
            A2C();
        }
    }

    public int getMainChildMaxWidth() {
        return C87094Nz.A06(this);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A00.A00((C30471mV) this.A0S, i);
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
