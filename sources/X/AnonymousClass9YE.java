package X;

import android.widget.CompoundButton;
import android.widget.RadioGroup;
import java.util.List;

/* renamed from: X.9YE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9YE implements C15930sC {
    public final /* synthetic */ RadioGroup.OnCheckedChangeListener A00;
    public final /* synthetic */ RadioGroup A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ int[] A03;

    public final void BOf(Object obj) {
        RadioGroup radioGroup = this.A01;
        int[] iArr = this.A03;
        List list = this.A02;
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.A00;
        int A0K = AnonymousClass001.A0K(C06560Yg.A02(radioGroup, radioGroup.getCheckedRadioButtonId()).getTag());
        int intValue = ((Number) obj).intValue();
        if (intValue != A0K) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
            for (int i = 0; i < iArr.length; i++) {
                if (iArr[i] == intValue) {
                    ((CompoundButton) list.get(i)).setChecked(true);
                }
            }
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }

    public /* synthetic */ AnonymousClass9YE(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, RadioGroup radioGroup, List list, int[] iArr) {
        this.A01 = radioGroup;
        this.A03 = iArr;
        this.A02 = list;
        this.A00 = onCheckedChangeListener;
    }
}
