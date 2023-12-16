package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import java.util.List;

/* renamed from: X.4o2  reason: invalid class name */
public class AnonymousClass4o2 extends C92774nF {
    public AnonymousClass5O8 A00;
    public C55882r4 A01;
    public final C08270df A02;
    public final TemplateQuickReplyButtonsLayout A03 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A04 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public final void A2G() {
        List list;
        TemplateRowContentLayout templateRowContentLayout = this.A04;
        C179218in r2 = this.A2V;
        templateRowContentLayout.A02(this.A02, this, r2);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A03;
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

    public AnonymousClass4o2(Context context, C08270df r3, AnonymousClass677 r4, AnonymousClass1n0 r5) {
        super(context, r4, r5);
        this.A09.A03();
        this.A02 = r3;
        A2G();
    }

    public void A1H() {
        A2G();
        super.A1H();
    }

    public void A1N() {
        super.A1N();
        AnonymousClass1n2 fMessage = getFMessage();
        if (this.A01.A05(fMessage)) {
            C45082Yp r2 = this.A1u;
            C162457s7.A0J(fMessage, 0);
            r2.A00(fMessage, "media-image", "0");
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A2G();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A03;
        if (templateQuickReplyButtonsLayout != null) {
            C87094Nz.A0G(templateQuickReplyButtonsLayout, this);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout = this.A03;
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
