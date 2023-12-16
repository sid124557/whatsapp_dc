package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import com.whatsapp.wds.components.internal.header.WDSHeader;

/* renamed from: X.6G9  reason: invalid class name */
public final class AnonymousClass6G9 extends ConstraintLayout implements C183528qB {
    public final Button A00 = ((Button) C18280x3.A0E(this, R.id.primary_button));
    public final Button A01 = ((Button) C18280x3.A0E(this, R.id.secondary_button));
    public final WaTextView A02 = C86604Kt.A0O(this, R.id.footnote);
    public final WDSButtonGroup A03 = ((WDSButtonGroup) C18280x3.A0E(this, R.id.button_group));
    public final WDSHeader A04 = ((WDSHeader) C18280x3.A0E(this, R.id.header));

    public AnonymousClass6G9(Context context) {
        super(context, (AttributeSet) null);
        int dimension = (int) context.getResources().getDimension(R.dimen.f6nameremoved);
        setPadding(dimension, 0, dimension, 0);
        C86604Kt.A0z(context, this, R.color.f5nameremoved);
        View.inflate(context, R.layout.f8nameremoved, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r2 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setViewState(X.C140086t8 r5) {
        /*
            r4 = this;
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            com.whatsapp.wds.components.internal.header.WDSHeader r1 = r4.A04
            X.7ZQ r0 = r5.A02
            r1.setViewState(r0)
            java.lang.CharSequence r1 = r5.A03
            com.whatsapp.WaTextView r0 = r4.A02
            X.C106895aL.A02(r0, r1)
            r0.setText(r1)
            X.7YW r3 = r5.A00
            X.7YW r2 = r5.A01
            android.widget.Button r0 = r4.A00
            r1 = 4
            X.AnonymousClass75S.A00(r0, r3, r1)
            android.widget.Button r0 = r4.A01
            X.AnonymousClass75S.A00(r0, r2, r1)
            com.whatsapp.wds.components.button.WDSButtonGroup r1 = r4.A03
            if (r3 != 0) goto L_0x002c
            r0 = 8
            if (r2 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6G9.setViewState(X.6t8):void");
    }
}
