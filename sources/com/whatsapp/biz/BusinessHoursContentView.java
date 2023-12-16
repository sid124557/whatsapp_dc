package com.whatsapp.biz;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C18280x3;
import X.C86654Ky;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public class BusinessHoursContentView extends FrameLayout implements AnonymousClass4GJ {
    public static final int[] A04 = {R.id.business_hours_day_layout_0, R.id.business_hours_day_layout_1, R.id.business_hours_day_layout_2, R.id.business_hours_day_layout_3, R.id.business_hours_day_layout_4, R.id.business_hours_day_layout_5, R.id.business_hours_day_layout_6};
    public C116855qy A00;
    public List A01;
    public List A02;
    public boolean A03;

    public void setFullView(boolean z) {
        for (int i = 0; i < this.A02.size(); i++) {
            if (i != 0) {
                ((View) this.A02.get(i)).setVisibility(AnonymousClass001.A08(z ? 1 : 0));
            }
        }
    }

    public void setup(List list) {
        for (int i = 0; i < list.size(); i++) {
            ((TextView) C86654Ky.A0k(this.A01, i)).setText((CharSequence) C86654Ky.A0k(list, i));
            ((TextView) ((Pair) this.A01.get(i)).second).setText((CharSequence) ((Pair) list.get(i)).second);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r5 = X.C86634Kw.A0I(getContext(), com.whatsapp.R.color.f5nameremoved);
        r0 = getContext().getString(com.whatsapp.R.string.f11nameremoved);
        r4 = X.AnonymousClass4L0.A0A(r0);
        r4.setSpan(r5, 0, r0.length(), 33);
        ((android.widget.TextView) X.C86654Ky.A0k(r8.A01, r2)).setText(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupWithOpenNow(java.util.List r9, long r10, X.C108705dQ r12) {
        /*
            r8 = this;
            r3 = 0
            r2 = 0
        L_0x0002:
            int r0 = r9.size()
            if (r2 >= r0) goto L_0x00c4
            if (r2 != 0) goto L_0x0057
            java.lang.String r1 = r12.A01
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 == 0) goto L_0x0052
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
        L_0x0016:
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r1.setTimeInMillis(r10)
            r0 = 7
            int r5 = r1.get(r0)
            r0 = 11
            int r0 = r1.get(r0)
            int r4 = r0 * 60
            r0 = 12
            int r0 = r1.get(r0)
            int r4 = r4 + r0
            java.util.List r0 = r12.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r6 = r7.next()
            X.7yB r6 = (X.C166127yB) r6
            int r0 = r6.A00
            if (r0 != r5) goto L_0x0037
            int r1 = r6.A01
            r0 = 1
            if (r1 == 0) goto L_0x0069
            if (r1 == r0) goto L_0x0079
            r0 = 2
            if (r1 == r0) goto L_0x0079
            goto L_0x0037
        L_0x0052:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r1)
            goto L_0x0016
        L_0x0057:
            java.util.List r0 = r8.A01
            java.lang.Object r1 = X.C86654Ky.A0k(r0, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = X.C86654Ky.A0k(r9, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            goto L_0x00a7
        L_0x0069:
            java.lang.Integer r0 = r6.A03
            int r0 = X.C86664Kz.A0K(r0)
            if (r4 < r0) goto L_0x0037
            java.lang.Integer r0 = r6.A02
            int r0 = X.C86664Kz.A0K(r0)
            if (r4 > r0) goto L_0x0037
        L_0x0079:
            android.content.Context r1 = r8.getContext()
            r0 = 2131099943(0x7f060127, float:1.7812253E38)
            android.text.style.ForegroundColorSpan r5 = X.C86634Kw.A0I(r1, r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131887152(0x7f120430, float:1.9408903E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableString r4 = X.AnonymousClass4L0.A0A(r0)
            int r1 = r0.length()
            r0 = 33
            r4.setSpan(r5, r3, r1, r0)
            java.util.List r0 = r8.A01
            java.lang.Object r0 = X.C86654Ky.A0k(r0, r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r4)
        L_0x00a7:
            java.util.List r0 = r8.A01
            java.lang.Object r0 = r0.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.second
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r9.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            int r2 = r2 + 1
            goto L_0x0002
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.BusinessHoursContentView.setupWithOpenNow(java.util.List, long, X.5dQ):void");
    }

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        A01();
    }

    public final void A01() {
        View A0h = C86664Kz.A0h(C18280x3.A0D(this), this, R.layout.f8nameremoved);
        this.A02 = AnonymousClass002.A0I(r5);
        this.A01 = AnonymousClass002.A0I(r5);
        for (int findViewById : A04) {
            View findViewById2 = A0h.findViewById(findViewById);
            View findViewById3 = findViewById2.findViewById(R.id.business_hours_day_layout_title);
            View findViewById4 = findViewById2.findViewById(R.id.business_hours_day_layout_description);
            this.A02.add(findViewById2);
            this.A01.add(AnonymousClass0x9.A0C(findViewById3, findViewById4));
        }
    }

    public int getLayout() {
        return R.layout.f8nameremoved;
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        A01();
    }

    public BusinessHoursContentView(Context context) {
        super(context);
        A00();
        A01();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
