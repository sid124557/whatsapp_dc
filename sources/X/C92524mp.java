package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout;

/* renamed from: X.4mp  reason: invalid class name and case insensitive filesystem */
public class C92524mp extends C93314oJ {
    public boolean A00;
    public final TextEmojiLabel A01 = C86644Kx.A0M(this, R.id.title_text_message);
    public final AnonymousClass677 A02;
    public final DynamicButtonsLayout A03 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A04 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));
    public final NativeFlowButtonsRowContentLayout A05 = ((NativeFlowButtonsRowContentLayout) findViewById(R.id.native_flow_action_button_content));

    public final void A22() {
        this.A04.A00(this);
        C624134x fMessage = getFMessage();
        if (!C624134x.A0a(fMessage)) {
            String A13 = fMessage.A13();
            TextEmojiLabel textEmojiLabel = this.A01;
            A1d(textEmojiLabel, getFMessage(), A13, false, false);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A01.setVisibility(8);
        }
        DynamicButtonsLayout dynamicButtonsLayout = this.A03;
        NativeFlowButtonsRowContentLayout nativeFlowButtonsRowContentLayout = this.A05;
        C42592Ot A012 = C40802Hu.A01(fMessage);
        C100325Am.A00(this, this.A02, dynamicButtonsLayout, nativeFlowButtonsRowContentLayout, this.A0M, A012);
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
            C87094Nz.A0L(A0A, r2, this);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public C92524mp(Context context, AnonymousClass677 r4, C30481mW r5) {
        super(context, r4, r5);
        A0v();
        this.A02 = r4;
        TextEmojiLabel textEmojiLabel = this.A01;
        AnonymousClass0x2.A14(this.A0O, textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
        A22();
    }

    public void A1H() {
        A22();
        A1t(false);
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C87094Nz.A0G(this.A03, this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), C87094Nz.A07(this, this.A03, getMeasuredHeight()));
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
