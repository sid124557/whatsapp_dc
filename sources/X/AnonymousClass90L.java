package X;

import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;
import com.whatsapp.wabloks.ui.WaBloksGenericBottomSheetActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2;

/* renamed from: X.90L  reason: invalid class name */
public class AnonymousClass90L implements C15890s8 {
    public Object A00;
    public final int A01;

    public AnonymousClass90L(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BMj(C08310eF r4, C08270df r5) {
        AnonymousClass08A r1;
        switch (this.A01) {
            case 0:
                CsatSurveyBloksActivity.A0C(r4, (CsatSurveyBloksActivity) this.A00);
                return;
            case 1:
                WaBloksBottomSheetActivity.A0C(r4, (WaBloksBottomSheetActivity) this.A00);
                return;
            case 2:
                WaBloksGenericBottomSheetActivity.A0C(r4, (WaBloksGenericBottomSheetActivity) this.A00);
                return;
            default:
                BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = (BloksCDSBottomSheetActivity) this.A00;
                if ((r4 instanceof BkCdsBottomSheetFragment) && (r1 = r4.A0L) != null) {
                    r1.A00(new BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2(r4, bloksCDSBottomSheetActivity));
                    return;
                }
                return;
        }
    }
}
