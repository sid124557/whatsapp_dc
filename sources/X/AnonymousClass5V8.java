package X;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

/* renamed from: X.5V8  reason: invalid class name */
public class AnonymousClass5V8 {
    public static ImageButton A00(Activity activity, AnonymousClass1VX r4) {
        C162457s7.A0J(r4, 0);
        if (!r4.A0X(4268)) {
            return (ImageButton) C005205m.A00(activity, R.id.emoji_picker_btn);
        }
        AnonymousClass5UY.A01(activity, R.id.input_emoji_picker_right).A06(0);
        ImageButton imageButton = (ImageButton) C005205m.A00(activity, R.id.input_emoji_picker_right);
        C86644Kx.A0k(activity, R.id.emoji_picker_btn);
        return imageButton;
    }

    public static WaImageButton A01(Activity activity, AnonymousClass1VX r5) {
        C162457s7.A0J(r5, 0);
        if (r5.A0X(4268)) {
            AnonymousClass5UY.A01(activity, R.id.input_attach_button_left).A06(0);
            View A00 = C005205m.A00(activity, R.id.entry);
            C86604Kt.A1D(A00, activity.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), A00.getPaddingTop());
            C86664Kz.A0u(activity, R.id.input_attach_button_left).setImageResource(R.drawable.ic_action_add);
            return (WaImageButton) C005205m.A00(activity, R.id.input_attach_button_left);
        }
        WaImageButton waImageButton = (WaImageButton) C005205m.A00(activity, R.id.input_attach_button);
        waImageButton.setVisibility(0);
        return waImageButton;
    }
}
