package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.9R8  reason: invalid class name */
public class AnonymousClass9R8 {
    public final /* synthetic */ C197219cl A00;
    public final /* synthetic */ String A01;

    public AnonymousClass9R8(C197219cl r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void A00(AnonymousClass34V r8) {
        AnonymousClass043 A002;
        C197219cl r5 = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = r5.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1a();
        } else {
            C89644eZ r1 = r5.A00;
            if (r1 instanceof BrazilAccountRecoveryPinActivity) {
                r1.BjL();
            }
        }
        int i = r8.A00;
        if (i != 1440) {
            if (i == 1448) {
                r5.A02.A0H.A02(r8, "FB", "PIN");
            }
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1L();
            }
            C89644eZ r2 = r5.A00;
            A002 = AnonymousClass9WM.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.f11nameremoved));
        } else {
            int i2 = r8.A01;
            if (i2 == 0) {
                AnonymousClass9W1 r0 = r5.A02;
                C89644eZ r4 = r5.A00;
                r0.A01(r4);
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1L();
                }
                boolean z = r5.A03;
                A002 = AnonymousClass9WM.A01(r4, new AnonymousClass9X9(r4, z), r4.getString(R.string.f11nameremoved), r4.getString(R.string.f11nameremoved));
            } else if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1c(i2, R.plurals.f9nameremoved);
                return;
            } else {
                C89644eZ r52 = r5.A00;
                if (r52 instanceof BrazilAccountRecoveryPinActivity) {
                    BrazilAccountRecoveryPinActivity brazilAccountRecoveryPinActivity = (BrazilAccountRecoveryPinActivity) r52;
                    brazilAccountRecoveryPinActivity.A01.setErrorState(true);
                    brazilAccountRecoveryPinActivity.A01.A09();
                    TextView textView = brazilAccountRecoveryPinActivity.A00;
                    Resources resources = brazilAccountRecoveryPinActivity.getResources();
                    Object[] objArr = new Object[1];
                    boolean A1Y = C18300x5.A1Y(objArr, i2);
                    textView.setText(resources.getQuantityString(R.plurals.f9nameremoved, i2, objArr));
                    TextView textView2 = brazilAccountRecoveryPinActivity.A00;
                    AnonymousClass0x2.A0q(textView2.getContext(), textView2, R.color.f5nameremoved);
                    brazilAccountRecoveryPinActivity.A00.setVisibility(A1Y ? 1 : 0);
                    return;
                }
                A002 = AnonymousClass9WM.A00(r52, (DialogInterface.OnDismissListener) null, r52.getString(R.string.f11nameremoved));
            }
        }
        A002.show();
    }
}
