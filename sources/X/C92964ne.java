package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import java.util.List;

/* renamed from: X.4ne  reason: invalid class name and case insensitive filesystem */
public class C92964ne extends C93214o9 {
    public AnonymousClass5O8 A00;
    public C55882r4 A01;
    public boolean A02;
    public final C08270df A03;
    public final TemplateQuickReplyButtonsLayout A04 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A05 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

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
            this.A01 = (C55882r4) r2.ATI.get();
            this.A00 = A0C.A44();
        }
    }

    public final void A2C() {
        List list;
        TemplateRowContentLayout templateRowContentLayout = this.A05;
        C179218in r2 = this.A2V;
        templateRowContentLayout.A02(this.A03, this, r2);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A04;
        if (templateQuickReplyButtonsLayout != null) {
            AnonymousClass677 r0 = this.A0m;
            if (r0 == null || !r0.BoV()) {
                list = null;
            } else {
                list = ((AnonymousClass4FG) getFMessage()).BDY().A06;
            }
            templateQuickReplyButtonsLayout.A02(r2, list);
        }
    }

    public C92964ne(Context context, C08270df r3, AnonymousClass677 r4, AnonymousClass1p7 r5) {
        super(context, r4, r5);
        A0v();
        this.A03 = r3;
        A2C();
    }

    public void A1H() {
        A2C();
        super.A1H();
    }

    public void A1N() {
        super.A1N();
        C31971pB fMessage = getFMessage();
        if (this.A01.A05(fMessage)) {
            C45082Yp r2 = this.A1u;
            C162457s7.A0J(fMessage, 0);
            r2.A00(fMessage, "media-video", "0");
        }
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
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A04;
        if (templateQuickReplyButtonsLayout != null) {
            C87094Nz.A0G(templateQuickReplyButtonsLayout, this);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A04;
        if (templateQuickReplyButtonsLayout != null) {
            setMeasuredDimension(getMeasuredWidth(), C87094Nz.A08(this, templateQuickReplyButtonsLayout));
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A00.A00(getFMessage(), i);
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
