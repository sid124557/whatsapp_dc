package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import java.util.List;

/* renamed from: X.03l  reason: invalid class name */
public class AnonymousClass03l extends SimpleAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String[] A02;
    public final /* synthetic */ boolean[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass03l(Context context, SingleChoiceListDialogFragment singleChoiceListDialogFragment, List list, int[] iArr, String[] strArr, String[] strArr2, boolean[] zArr, int i) {
        super(context, list, R.layout.f8nameremoved, strArr, iArr);
        this.A01 = singleChoiceListDialogFragment;
        this.A03 = zArr;
        this.A00 = i;
        this.A02 = strArr2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Context A1D;
        int A022;
        View view2 = super.getView(i, view, viewGroup);
        TextView A09 = AnonymousClass002.A09(view2, 16908308);
        TextView A092 = AnonymousClass002.A09(view2, 16908309);
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        if (singleChoiceListDialogFragment.A16()) {
            boolean[] zArr = this.A03;
            if (zArr == null || zArr[i]) {
                A09.setTextColor(AnonymousClass0Y8.A04(singleChoiceListDialogFragment.A1D(), AnonymousClass34K.A02(singleChoiceListDialogFragment.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved)));
                A1D = singleChoiceListDialogFragment.A1D();
                A022 = AnonymousClass34K.A02(singleChoiceListDialogFragment.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved);
            } else {
                Context A1D2 = singleChoiceListDialogFragment.A1D();
                A022 = R.color.f5nameremoved;
                A09.setTextColor(AnonymousClass0Y8.A04(A1D2, R.color.f5nameremoved));
                A1D = singleChoiceListDialogFragment.A1D();
            }
            A092.setTextColor(AnonymousClass0Y8.A04(A1D, A022));
        }
        if (TextUtils.isEmpty(A092.getText())) {
            A092.setVisibility(8);
        } else {
            A092.setVisibility(0);
        }
        int i2 = this.A00;
        if (i2 < 0 || !TextUtils.equals(this.A02[i2], A09.getText())) {
            ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(false);
            return view2;
        }
        ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(true);
        return view2;
    }
}
