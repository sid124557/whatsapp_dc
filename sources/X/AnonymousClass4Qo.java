package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.checkbox.RtlCheckBox;
import java.util.List;

/* renamed from: X.4Qo  reason: invalid class name */
public class AnonymousClass4Qo extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4Qo(Context context, LinearLayout.LayoutParams layoutParams, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list) {
        super(context);
        int intValue;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this);
        setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i = 0;
        setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), dimensionPixelSize, 0);
        ImageView A0E = AnonymousClass0x9.A0E(this, R.id.image);
        TextView A0G = C18300x5.A0G(this, R.id.title);
        TextView A0G2 = C18300x5.A0G(this, R.id.subtitle);
        if (num != null) {
            A0E.setImageResource(num.intValue());
            A0E.setVisibility(0);
            if (layoutParams != null) {
                A0E.setLayoutParams(layoutParams);
            }
        } else {
            A0E.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str)) {
            A0G.setText(str);
            A0G.setVisibility(0);
        } else {
            A0G.setVisibility(8);
        }
        String str3 = str2;
        if (!TextUtils.isEmpty(str3)) {
            A0G2.setText(str3);
            if (num2 != null) {
                A0G2.setTextColor(num2.intValue());
            }
            A0G2.setVisibility(0);
        } else {
            A0G2.setVisibility(8);
        }
        if (num4 == null) {
            intValue = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        } else {
            intValue = (int) (((float) num4.intValue()) * C86614Ku.A0E(this).density);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        while (true) {
            List list2 = list;
            if (i >= list2.size()) {
                break;
            }
            AnonymousClass5IX r4 = (AnonymousClass5IX) list2.get(i);
            int i2 = dimensionPixelSize2;
            if (i == 0) {
                i2 = intValue;
            }
            RtlCheckBox rtlCheckBox = new RtlCheckBox(getContext(), (AttributeSet) null);
            rtlCheckBox.setTextSize(2, 16.0f);
            AnonymousClass0x2.A0q(getContext(), rtlCheckBox, R.color.f5nameremoved);
            C86644Kx.A0I(this, R.id.container).addView(rtlCheckBox);
            AnonymousClass001.A0T(rtlCheckBox).topMargin = i2;
            rtlCheckBox.setText(r4.A01);
            rtlCheckBox.setChecked(r4.A02);
            rtlCheckBox.setOnClickListener(new C109485eh(r4, 0, rtlCheckBox));
            i++;
        }
        if (num3 != null) {
            float f = C86614Ku.A0E(this).density;
            View view = new View(getContext());
            view.setLayoutParams(new AbsListView.LayoutParams(-1, AnonymousClass001.A06((float) num3.intValue(), f)));
            addView(view);
        }
    }
}
