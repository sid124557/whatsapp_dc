package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94R  reason: invalid class name */
public final class AnonymousClass94R extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public final AnonymousClass66R A02;
    public final AnonymousClass66R A03;
    public final AnonymousClass66R A04;
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;
    public final AnonymousClass66R A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;

    public AnonymousClass94R(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A04 = C154517dI.A01(new C201829ku(this));
        this.A08 = C154517dI.A01(new C201869ky(this));
        this.A09 = C154517dI.A01(new C201879kz(this));
        this.A02 = C154517dI.A01(new C201809ks(this));
        this.A07 = C154517dI.A01(new C201859kx(this));
        this.A05 = C154517dI.A01(new C201839kv(this));
        this.A03 = C154517dI.A01(new C201819kt(this));
        this.A06 = C154517dI.A01(new C201849kw(this));
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        setOrientation(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass9T5 r7) {
        /*
            r6 = this;
            r5 = 0
            X.66R r0 = r6.A08
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            X.3ZO r4 = r7.A02
            java.lang.String r0 = r4.A08
            r1.setText(r0)
            X.66R r0 = r6.A04
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            X.66R r0 = r6.A02
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            int r1 = r4.A01
            r3 = 1
            if (r1 == r3) goto L_0x00d3
            r0 = 2
            if (r1 == r0) goto L_0x00ab
            r0 = 3
            if (r1 != r0) goto L_0x0059
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131232072(0x7f080548, float:1.8080243E38)
            X.C18290x4.A1A(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099706(0x7f06003a, float:1.7811773E38)
            X.AnonymousClass0x2.A0p(r1, r2, r0)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099699(0x7f060033, float:1.7811759E38)
        L_0x0056:
            X.C86604Kt.A0z(r1, r2, r0)
        L_0x0059:
            android.widget.ImageView r0 = r6.getAlertCloseIcon()
            r1 = 8
            r0.setVisibility(r1)
            int r2 = r7.A00
            android.widget.LinearLayout r0 = r6.getAlertCountLayout()
            if (r2 <= r3) goto L_0x0087
            r0.setVisibility(r5)
            X.66R r0 = r6.A09
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r1.setText(r0)
            android.view.View r1 = r6.getRootView()
            r0 = 7
            X.9p3 r0 = X.C204249p3.A00(r6, r0)
        L_0x0083:
            r1.setOnClickListener(r0)
            return
        L_0x0087:
            r0.setVisibility(r1)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x00a1
            android.widget.ImageView r0 = r6.getAlertCloseIcon()
            r0.setVisibility(r5)
            android.widget.ImageView r1 = r6.getAlertCloseIcon()
            X.9oz r0 = new X.9oz
            r0.<init>(r7, r6, r7, r5)
            r1.setOnClickListener(r0)
        L_0x00a1:
            android.view.View r1 = r6.getRootView()
            X.9pJ r0 = new X.9pJ
            r0.<init>((java.lang.Object) r7, (int) r3, (java.lang.Object) r7)
            goto L_0x0083
        L_0x00ab:
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131231830(0x7f080456, float:1.8079752E38)
            X.C18290x4.A1A(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099705(0x7f060039, float:1.781177E38)
            X.AnonymousClass0x2.A0p(r1, r2, r0)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            goto L_0x0056
        L_0x00d3:
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131231831(0x7f080457, float:1.8079754E38)
            X.C18290x4.A1A(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            X.AnonymousClass0x2.A0p(r1, r2, r0)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099700(0x7f060034, float:1.781176E38)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94R.A00(X.9T5):void");
    }

    private final TextView getAlertActionText() {
        return C18280x3.A0G(this.A02);
    }

    private final LinearLayout getAlertBannerComponent() {
        Object value = this.A03.getValue();
        C162457s7.A0D(value);
        return (LinearLayout) value;
    }

    private final TextView getAlertBody() {
        return C18280x3.A0G(this.A04);
    }

    private final ImageView getAlertCloseIcon() {
        Object value = this.A05.getValue();
        C162457s7.A0D(value);
        return (ImageView) value;
    }

    private final LinearLayout getAlertCountLayout() {
        Object value = this.A06.getValue();
        C162457s7.A0D(value);
        return (LinearLayout) value;
    }

    private final ImageView getAlertIcon() {
        Object value = this.A07.getValue();
        C162457s7.A0D(value);
        return (ImageView) value;
    }

    private final TextView getAlertTitle() {
        return C18280x3.A0G(this.A08);
    }

    private final TextView getAlertsCount() {
        return C18280x3.A0G(this.A09);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
