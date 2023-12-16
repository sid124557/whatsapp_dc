package com.whatsapp.biz.serviceofferings;

import X.AnonymousClass4WI;
import X.C002102g;
import X.C108835dd;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C86614Ku;
import X.C86654Ky;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.List;

public class ServiceOfferingsRecyclerView extends RecyclerView {
    private TextView getServiceOfferingItemView() {
        TextView textView = (TextView) C18280x3.A0D(this).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        textView.setLayoutParams(new C002102g(-1, -2));
        float applyDimension = TypedValue.applyDimension(1, 24.0f, C86614Ku.A0E(this));
        Drawable A0G = C18310x6.A0G(getContext(), R.drawable.ic_check);
        int i = (int) applyDimension;
        A0G.setBounds(0, 0, i, i);
        textView.setCompoundDrawables(A0G, (Drawable) null, (Drawable) null, (Drawable) null);
        return textView;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        String str;
        int i4;
        String str2;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0 && (this.A0N instanceof AnonymousClass4WI)) {
            Resources A0G = C18290x4.A0G(this);
            int i5 = 0;
            if (this.A0N instanceof AnonymousClass4WI) {
                Resources A0G2 = C18290x4.A0G(this);
                TextView serviceOfferingItemView = getServiceOfferingItemView();
                AnonymousClass4WI r3 = (AnonymousClass4WI) this.A0N;
                int dimensionPixelSize = A0G2.getDimensionPixelSize(R.dimen.f6nameremoved);
                int size = (View.MeasureSpec.getSize(i) / 2) - (dimensionPixelSize / 2);
                i3 = 0;
                while (true) {
                    List list = r3.A00;
                    if (i5 >= list.size()) {
                        break;
                    }
                    if (i5 < list.size()) {
                        str = ((C108835dd) list.get(i5)).A02;
                    } else {
                        str = "";
                    }
                    serviceOfferingItemView.setText(str);
                    C86614Ku.A1F(serviceOfferingItemView, size, Integer.MIN_VALUE);
                    int measuredHeight = serviceOfferingItemView.getMeasuredHeight();
                    int i6 = i5 + 1;
                    if (i6 < list.size()) {
                        if (i6 < list.size()) {
                            str2 = ((C108835dd) list.get(i6)).A02;
                        } else {
                            str2 = "";
                        }
                        serviceOfferingItemView.setText(str2);
                        C86614Ku.A1F(serviceOfferingItemView, size, Integer.MIN_VALUE);
                        i4 = serviceOfferingItemView.getMeasuredHeight();
                    } else {
                        i4 = 0;
                    }
                    i3 = i3 + Math.max(measuredHeight, i4) + dimensionPixelSize;
                    i5 += 2;
                }
            } else {
                i3 = 0;
            }
            setMeasuredDimension(i, C86654Ky.A02(A0G, R.dimen.f6nameremoved, i3));
        }
    }

    public ServiceOfferingsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ServiceOfferingsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ServiceOfferingsRecyclerView(Context context) {
        super(context, (AttributeSet) null);
    }
}
