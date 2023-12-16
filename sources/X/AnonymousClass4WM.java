package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4WM  reason: invalid class name */
public class AnonymousClass4WM extends AnonymousClass0R6 {
    public List A00;
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A01;

    public AnonymousClass4WM(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment, List list) {
        this.A01 = intentChooserBottomSheetDialogFragment;
        this.A00 = list;
    }

    public int A0G() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r6, int i) {
        Drawable drawable;
        AnonymousClass4YC r62 = (AnonymousClass4YC) r6;
        C108905dk r2 = (C108905dk) this.A00.get(i);
        int i2 = r2.A05;
        r62.A01.setText(r2.A06);
        View view = r62.A0H;
        C109705f3.A00(view, this, r2, 6);
        C107295b4.A02(view);
        try {
            ImageView imageView = r62.A00;
            Context context = imageView.getContext();
            Integer num = r2.A02;
            if (i2 == 0) {
                drawable = context.getPackageManager().getApplicationIcon("com.whatsapp");
            } else {
                drawable = AnonymousClass0RP.A00(context, i2);
            }
            if (!(drawable == null || num == null)) {
                drawable = C06130Wj.A01(drawable);
                AnonymousClass0YG.A06(drawable, num.intValue());
            }
            imageView.setImageDrawable(drawable);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        boolean A0X = this.A01.A04.A0X(689);
        int i2 = R.layout.f8nameremoved;
        if (A0X) {
            i2 = R.layout.f8nameremoved;
        }
        return new AnonymousClass4YC(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, i2));
    }
}
