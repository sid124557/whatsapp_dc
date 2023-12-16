package X;

import android.text.TextUtils;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;

/* renamed from: X.952  reason: invalid class name */
public class AnonymousClass952 extends AnonymousClass0OM {
    public final /* synthetic */ AnonymousClass95D A00;

    public AnonymousClass952(AnonymousClass95D r1) {
        this.A00 = r1;
    }

    public int A00(int i) {
        AnonymousClass95D r4 = this.A00;
        AnonymousClass9SY r2 = (AnonymousClass9SY) r4.A04.get(i);
        int i2 = r2.A00;
        if (i2 != 3 && i2 != 1) {
            return 4;
        }
        AnonymousClass99H r22 = r2.A01;
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) r4.A01;
        if (!TextUtils.isEmpty((CharSequence) AnonymousClass0x9.A0C(indiaUpiBankPickerActivity.A0A, indiaUpiBankPickerActivity.A0B).first) || r22 == null || !r22.A0K) {
            return 4;
        }
        return 1;
    }
}
