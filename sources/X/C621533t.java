package X;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.whatsapp.R;
import com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment;

/* renamed from: X.33t  reason: invalid class name and case insensitive filesystem */
public class C621533t {
    public static boolean A00(AnonymousClass4FU r5, C48862fb r6) {
        if (r5 == null || r5.BHW() || !(r5 instanceof C89654ea) || !(!(r5 instanceof AnonymousClass47t))) {
            return false;
        }
        DialogFragment A6F = ((C89654ea) r5).A6F(DeviceConfirmationRegAlertDialogFragment.class);
        if (A6F instanceof DeviceConfirmationRegAlertDialogFragment) {
            DeviceConfirmationRegAlertDialogFragment deviceConfirmationRegAlertDialogFragment = (DeviceConfirmationRegAlertDialogFragment) A6F;
            Button button = deviceConfirmationRegAlertDialogFragment.A02;
            if (button != null) {
                button.setVisibility(4);
            }
            Button button2 = deviceConfirmationRegAlertDialogFragment.A01;
            if (button2 != null) {
                button2.setVisibility(4);
            }
            C06560Yg.A02(deviceConfirmationRegAlertDialogFragment.A00, R.id.move_device_alert_info_and_buttons).setVisibility(4);
            C06560Yg.A02(deviceConfirmationRegAlertDialogFragment.A00, R.id.loading_icon_and_message_layout).setVisibility(0);
            deviceConfirmationRegAlertDialogFragment.A00.postDelayed(new C70143a1(deviceConfirmationRegAlertDialogFragment, 16, r6), 1000);
            return true;
        }
        r5.Boo(new DeviceConfirmationRegAlertDialogFragment(r6));
        return true;
    }

    public static boolean A01(AnonymousClass4FU r4, C614930z r5, AnonymousClass1VX r6) {
        if (r4.BHW() || !(r4 instanceof C89654ea) || ((r4 instanceof C835848z) && !((C835848z) r4).BbZ())) {
            return false;
        }
        if (!(!r5.A06()) || !r6.A0Y(C58422vE.A02, 6719)) {
            C89654ea r2 = (C89654ea) r4;
            DialogFragment A6F = r2.A6F(DeviceConfirmationRegAlertDialogFragment.class);
            if (A6F instanceof DeviceConfirmationRegAlertDialogFragment) {
                A6F.A1K();
            }
            r2.A6c("DoNotShareCodeDialogTag");
            r4.Boo(new DisplayExceptionDialogFactory$LoginFailedDialogFragment());
            return true;
        }
        Context context = (Context) r4;
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.loginfailure.LogoutMessageActivity");
        context.startActivity(A07);
        return true;
    }

    public static boolean A02(AnonymousClass4FU r2, C66523Lt r3, C619933b r4) {
        if (r2.BHW() || !(r2 instanceof C89654ea)) {
            return false;
        }
        r4.A03 = true;
        r3.A0F(true, 17);
        r2.Boo(new DisplayExceptionDialogFactory$ClockWrongDialogFragment());
        return true;
    }

    public static boolean A03(AnonymousClass4FU r2, C66523Lt r3, C619933b r4) {
        if (r2.BHW() || !(r2 instanceof C89654ea)) {
            return false;
        }
        r4.A03 = true;
        r3.A0F(true, 17);
        r2.Boo(new DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment());
        return true;
    }
}
