package X;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.4nI  reason: invalid class name and case insensitive filesystem */
public class C92804nI extends AnonymousClass4o3 {
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
            C87094Nz.A0d(r2, this);
            this.A01 = C72343dZ.A00(A0C.A0E);
            this.A00 = A0C.A44();
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, (C30471mV) this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A2G();
        }
    }

    public final void A2G() {
        C30471mV r3 = (C30471mV) this.A0S;
        this.A06.A03(this, r3);
        this.A05.A00(this.A04, this, this.A0m, r3);
    }

    public AnonymousClass1n1 getFMessage() {
        return (AnonymousClass1n1) ((AnonymousClass1n2) ((C30471mV) this.A0S));
    }

    public void onMeasure(int i, int i2) {
        if (AnonymousClass36V.A06((C30471mV) this.A0S)) {
            i = C86664Kz.A05(this.A03);
        }
        super.onMeasure(i, i2);
    }

    public C92804nI(Context context, C08270df r9, AnonymousClass677 r10, AnonymousClass1n1 r11, int i) {
        super(context, r10, r11);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView;
        A0v();
        float A0L = this.A0O.A0L(5073);
        this.A04 = r9;
        InteractiveMessageButton interactiveMessageButton = (InteractiveMessageButton) C06560Yg.A02(this, R.id.button);
        this.A05 = interactiveMessageButton;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C06560Yg.A02(this, R.id.interactive_view);
        this.A06 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r11.A1J.A02 ^ true ? 1 : 0);
        AnonymousClass5R6 r6 = (AnonymousClass5R6) this.A01.get();
        r6.A03 = new C171148Fy(this);
        interactiveMessageView.A02(this.A2T, r6);
        interactiveMessageButton.A0E.A00 = r6;
        if (i > 0) {
            interactiveMessageView.setDescriptionMinLines(i);
        }
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved) + (getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2);
        A2G();
        if (r6.A09 && (conversationRowImage$RowImageView = this.A09) != null) {
            int A062 = C87094Nz.A06(this) - (C86614Ku.A05(this, R.dimen.f6nameremoved) * 2);
            conversationRowImage$RowImageView.A0I = r6.A09;
            conversationRowImage$RowImageView.A03 = A062;
            conversationRowImage$RowImageView.A02 = (int) (A0L * ((float) A062));
            conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.MATRIX);
            conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
        }
    }

    public void A1H() {
        super.A1H();
        A2G();
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
