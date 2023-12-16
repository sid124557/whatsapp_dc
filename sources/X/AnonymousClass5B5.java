package X;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaEditText;

/* renamed from: X.5B5  reason: invalid class name */
public final class AnonymousClass5B5 {
    public static void A00(Context context, ScrollView scrollView, TextView textView, TextView textView2, WaEditText waEditText, C620633i r18, C620733j r19, AnonymousClass487 r20, AnonymousClass5Y0 r21, C60152y5 r22, int i) {
        int i2 = i;
        WaEditText waEditText2 = waEditText;
        waEditText2.setFilters(new InputFilter[]{new C109095e4(i2)});
        waEditText2.addTextChangedListener(new AnonymousClass52T(waEditText2, textView, r18, r19, r20, r21, r22, i2, (int) (((float) i2) * 0.1f), false));
        C635439q.A00(textView2, waEditText2, 5);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass92L(scrollView, 3, waEditText2));
        waEditText2.setOnFocusChangeListener(new C1892090k(scrollView, 4));
        waEditText2.setOnTouchListener(new C154187ck(scrollView, 4, new AnonymousClass0N1(context, new AnonymousClass4N9(scrollView, waEditText2))));
    }
}
