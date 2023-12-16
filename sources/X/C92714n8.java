package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.InteractiveMessageButton;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.4n8  reason: invalid class name and case insensitive filesystem */
public class C92714n8 extends C93114nv {
    public AnonymousClass5O8 A00;
    public boolean A01;
    public final C08270df A02;
    public final InteractiveMessageButton A03 = ((InteractiveMessageButton) C06560Yg.A02(this, R.id.button));
    public final InteractiveMessageView A04;

    public void A0v() {
        if (!this.A01) {
            this.A01 = true;
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
            C87094Nz.A0T(r2, A0C, this);
            this.A00 = A0C.A44();
        }
    }

    public C92714n8(Context context, C08270df r6, AnonymousClass677 r7, C30741mw r8) {
        super(context, r7, r8);
        A0v();
        this.A02 = r6;
        InteractiveMessageView interactiveMessageView = (InteractiveMessageView) C06560Yg.A02(this, R.id.interactive_view);
        this.A04 = interactiveMessageView;
        interactiveMessageView.setLayoutView(r8.A1J.A02 ^ true ? 1 : 0);
        interactiveMessageView.A02(this.A2T, (AnonymousClass5R6) null);
        C30471mV r3 = (C30471mV) this.A0S;
        this.A04.A03(this, r3);
        this.A03.A00(this.A02, this, this.A0m, r3);
    }

    public void A1H() {
        super.A1H();
        C30471mV r3 = (C30471mV) this.A0S;
        this.A04.A03(this, r3);
        this.A03.A00(this.A02, this, this.A0m, r3);
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
