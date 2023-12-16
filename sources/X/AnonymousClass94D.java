package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.94D  reason: invalid class name */
public class AnonymousClass94D extends FrameLayout implements AnonymousClass4GJ {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public C116855qy A04;
    public boolean A05;

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setBottomDividerSpaceVisibility(int i) {
        float f = 0.0f;
        if (i == 0) {
            f = 24.0f;
        }
        setPadding(AnonymousClass5YI.A04(getContext(), 24.0f), 0, AnonymousClass5YI.A04(getContext(), 24.0f), AnonymousClass5YI.A04(getContext(), f));
    }

    public void setCard(C133736hr r8) {
        int A002;
        TextView textView = this.A02;
        Context context = getContext();
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = C133736hr.A03(r8.A01);
        A0M[1] = C166587yw.A06(r8.A00);
        AnonymousClass001.A0y(context, textView, A0M, R.string.f11nameremoved);
        TextView textView2 = this.A03;
        AnonymousClass001.A0y(getContext(), textView2, new Object[]{C1899593h.A0X(r8.A09)}, R.string.f11nameremoved);
        ImageView imageView = this.A01;
        int i = r8.A01;
        if (i == 0) {
            A002 = R.drawable.card_default;
        } else {
            A002 = C195169Wk.A00(i);
        }
        imageView.setImageResource(A002);
    }

    public void setCardNameTextViewVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setCardNetworkIconVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setCardNumberTextColor(int i) {
        this.A03.setTextColor(i);
    }

    public AnonymousClass94D(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        setBottomDividerSpaceVisibility(0);
        this.A02 = AnonymousClass002.A09(this, R.id.card_name);
        this.A03 = AnonymousClass002.A09(this, R.id.card_number);
        this.A01 = AnonymousClass0x9.A0F(this, R.id.card_network_icon);
        this.A00 = AnonymousClass0x9.A0F(this, R.id.card_view_background);
        this.A00.setImageDrawable(new C1900393p(context));
        this.A00.setClipToOutline(true);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((int) (((float) (View.MeasureSpec.getSize(i) - (getPaddingLeft() + getPaddingRight()))) * 0.62f)) + getPaddingTop() + getPaddingBottom(), 1073741824));
    }
}
