package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateRowContentLayout;
import java.util.List;

/* renamed from: X.4ms  reason: invalid class name and case insensitive filesystem */
public class C92554ms extends C93314oJ {
    public AnonymousClass5O8 A00;
    public boolean A01;
    public final C08270df A02;
    public final TextEmojiLabel A03 = C86644Kx.A0M(this, R.id.title_text_message);
    public final TemplateQuickReplyButtonsLayout A04 = ((TemplateQuickReplyButtonsLayout) findViewById(R.id.template_quick_reply_buttons));
    public final TemplateRowContentLayout A05 = ((TemplateRowContentLayout) findViewById(R.id.template_message_content));

    public final void A22() {
        boolean z;
        int i;
        List list;
        int i2;
        AnonymousClass1p5 r6 = (AnonymousClass1p5) getFMessage();
        List list2 = r6.A00.A06;
        if (list2 == null || list2.isEmpty()) {
            z = false;
            i = -2;
        } else {
            z = true;
            i = C87094Nz.A05(this);
        }
        View view = this.A0l;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        TemplateRowContentLayout templateRowContentLayout = this.A05;
        C179218in r2 = this.A2V;
        templateRowContentLayout.A02(this.A02, this, r2);
        if (!C624134x.A0a(r6)) {
            String A13 = r6.A13();
            TextEmojiLabel textEmojiLabel = this.A03;
            A1d(textEmojiLabel, getFMessage(), A13, false, true);
            ViewGroup.LayoutParams layoutParams2 = textEmojiLabel.getLayoutParams();
            if (z) {
                i2 = i;
            } else {
                i2 = -1;
                if (A23(r6)) {
                    i2 = -2;
                }
            }
            layoutParams2.width = i2;
            textEmojiLabel.setLayoutParams(layoutParams2);
            textEmojiLabel.setVisibility(0);
        } else {
            this.A03.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams3 = templateRowContentLayout.getLayoutParams();
        if (!z) {
            i = -2;
            if (A23(r6)) {
                i = -1;
            }
        }
        layoutParams3.width = i;
        templateRowContentLayout.setLayoutParams(layoutParams3);
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
            C87094Nz.A0L(A0A, r2, this);
            this.A00 = A0C.A44();
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public C92554ms(Context context, C08270df r3, AnonymousClass677 r4, AnonymousClass1p5 r5) {
        super(context, r4, r5);
        A0v();
        this.A02 = r3;
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

    public final boolean A23(AnonymousClass1p5 r7) {
        float f;
        String A13 = r7.A13();
        if (TextUtils.isEmpty(A13)) {
            return false;
        }
        C47142cm r0 = r7.A00;
        String str = r0.A02;
        String str2 = r0.A03;
        float measureText = this.A03.getPaint().measureText(A13);
        TemplateRowContentLayout templateRowContentLayout = this.A05;
        float measureText2 = templateRowContentLayout.getContentTextView().getPaint().measureText(str);
        if (!TextUtils.isEmpty(str2)) {
            f = templateRowContentLayout.A02.getPaint().measureText(str2);
        } else {
            f = 0.0f;
        }
        if (measureText <= measureText2 || measureText <= f) {
            return false;
        }
        return true;
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
