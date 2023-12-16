package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1Pa  reason: invalid class name and case insensitive filesystem */
public class C22651Pa extends C93314oJ {
    public AnonymousClass36F A00;
    public AnonymousClass9U4 A01;
    public C195219Wq A02;
    public boolean A03;
    public final TextView A04 = AnonymousClass002.A09(this, R.id.info);

    public void A0v() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass0x7.A0I(this).A4d(this);
        }
    }

    public final void A22() {
        C624034w r3;
        String str;
        TextView textView = this.A04;
        textView.setTextSize(getDividerFontSize());
        textView.setBackgroundResource(R.drawable.business_balloon);
        C624134x fMessage = getFMessage();
        if ((fMessage instanceof AnonymousClass1nG) || (fMessage instanceof C30831nH)) {
            String str2 = ((C30291mD) fMessage).A00;
            if (!TextUtils.isEmpty(str2)) {
                r3 = AnonymousClass36F.A05(this.A00, str2, (String) null);
                if (r3 != null) {
                    str = this.A02.A0Y(r3, getFMessage());
                } else {
                    str = null;
                }
            } else {
                r3 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                textView.setOnClickListener(new C109475eg(this, 22, r3));
                textView.setText(str);
                AnonymousClass0x2.A0q(getContext(), textView, R.color.f5nameremoved);
                return;
            }
            textView.setOnClickListener((View.OnClickListener) null);
            return;
        }
        throw AnonymousClass001.A0e("PAY: message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if ((r3 instanceof X.AnonymousClass1nG) != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.C624134x r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C30831nH
            if (r0 != 0) goto L_0x0009
            boolean r1 = r3 instanceof X.AnonymousClass1nG
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.C626936e.A0C(r0)
            r2.A0S = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22651Pa.setFMessage(X.34x):void");
    }

    public C22651Pa(Context context, AnonymousClass677 r3, C624134x r4) {
        super(context, r3, r4);
        A0v();
        A22();
    }

    public boolean A14() {
        return true;
    }

    public void A1H() {
        A22();
        super.A1H();
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public boolean A1v() {
        return false;
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

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }
}
