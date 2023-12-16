package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.DynamicButtonsRowContentLayout;
import java.util.List;

/* renamed from: X.4nN  reason: invalid class name and case insensitive filesystem */
public class C92854nN extends C93194o7 {
    public boolean A00;
    public final DynamicButtonsLayout A01 = ((DynamicButtonsLayout) findViewById(R.id.dynamic_reply_buttons));
    public final DynamicButtonsRowContentLayout A02 = ((DynamicButtonsRowContentLayout) findViewById(R.id.dynamic_reply_buttons_message_content));

    private void A00() {
        List A0s;
        int i;
        this.A02.A00(this);
        C624134x r1 = this.A0S;
        if (C40802Hu.A01(r1) == null || C86634Kw.A0b(this) == null) {
            A0s = AnonymousClass001.A0s();
        } else {
            A0s = C40802Hu.A01(r1).A02;
        }
        int size = A0s.size();
        DynamicButtonsLayout dynamicButtonsLayout = this.A01;
        if (size > 0) {
            dynamicButtonsLayout.A04(this.A2U, A0s);
            i = 0;
        } else {
            i = 8;
        }
        dynamicButtonsLayout.setVisibility(i);
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
            C87094Nz.A0O(A0A, r2, this);
        }
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A00();
        }
    }

    public C92854nN(Context context, AnonymousClass677 r3, AnonymousClass1n9 r4) {
        super(context, r3, r4);
        A0v();
        A00();
    }

    public void A1H() {
        A00();
        super.A1H();
    }

    public int getMainChildMaxWidth() {
        return C87094Nz.A05(this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C87094Nz.A0G(this.A01, this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), C87094Nz.A07(this, this.A01, getMeasuredHeight()));
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
