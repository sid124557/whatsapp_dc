package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.4oF  reason: invalid class name and case insensitive filesystem */
public class C93274oF extends C92704n7 {
    public C1906899l A00;
    public C1907099n A01;
    public AnonymousClass9U4 A02;
    public final TextView A03 = AnonymousClass002.A09(this, R.id.setup_payment_account_button);

    public boolean A14() {
        return true;
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A25();
        }
    }

    public final void A25() {
        TextView textView;
        int i;
        View view;
        boolean z = true;
        int i2 = 8;
        if (!this.A01.A02()) {
            Log.i("PAY: Cannot render payment invite system messages because payment is not enabled");
            C86604Kt.A1F(this, R.id.divider, 8);
            this.A03.setVisibility(8);
            this.A0F.A0A("ConversationRowPaymentInviteSystemMessage/fillView", true, "Cannot render payment invite message because payment is disabled");
            return;
        }
        C30341mI r3 = (C30341mI) this.A0S;
        int i3 = r3.A00;
        if (i3 != 40) {
            if (i3 != 41) {
                if (i3 == 64) {
                    if (!(r3 instanceof C31301o4) || !((C31301o4) r3).A01) {
                        z = false;
                    }
                } else if (i3 == 42 || i3 == 65 || i3 == 66) {
                    C86604Kt.A1F(this, R.id.divider, 8);
                    view = this.A03;
                } else {
                    return;
                }
            }
            findViewById(R.id.divider).setVisibility(C86614Ku.A09(z));
            textView = this.A03;
            if (z) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            textView.setText(R.string.f11nameremoved);
            i = 21;
            if (!this.A00.A0E()) {
                i = 20;
            }
            C109475eg.A00(textView, this, r3, i);
            return;
        } else if (this.A00.A0E()) {
            this.A03.setVisibility(8);
            view = findViewById(R.id.divider);
        } else {
            C86604Kt.A1F(this, R.id.divider, 0);
            textView = this.A03;
            textView.setVisibility(0);
            textView.setText(R.string.f11nameremoved);
            i = 19;
            C109475eg.A00(textView, this, r3, i);
            return;
        }
        view.setVisibility(8);
    }

    public int getBackgroundResource() {
        return 0;
    }

    public C93274oF(Context context, AnonymousClass677 r3, C30341mI r4) {
        super(context, r3, r4);
        A25();
    }

    public void A1H() {
        A25();
        super.A1H();
    }

    public int getMainChildMaxWidth() {
        return AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved) + (AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved) * 2);
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
