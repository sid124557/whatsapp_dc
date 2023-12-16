package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.4nd  reason: invalid class name and case insensitive filesystem */
public class C92954nd extends C93214o9 {
    public boolean A00;
    public final AnonymousClass677 A01;
    public final DynamicButtonsLayout A02 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A03 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));
    public final NativeFlowButtonsRowContentLayout A04 = ((NativeFlowButtonsRowContentLayout) findViewById(R.id.native_flow_action_button_content));

    public final void A2C() {
        this.A03.A00(this);
        DynamicButtonsLayout dynamicButtonsLayout = this.A02;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A04;
        C42592Ot A012 = C40802Hu.A01(getFMessage());
        C100325Am.A00(this, this.A01, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0M, A012);
    }

    public void A0v() {
        if (!this.A00) {
            this.A00 = true;
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
        }
    }

    public C92954nd(Context context, AnonymousClass677 r3, C31971pB r4) {
        super(context, r3, r4);
        A0v();
        this.A01 = r3;
        A2C();
    }

    public void A1H() {
        A2C();
        super.A1H();
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A2C();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C87094Nz.A0G(this.A02, this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), C87094Nz.A07(this, this.A02, getMeasuredHeight()));
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
