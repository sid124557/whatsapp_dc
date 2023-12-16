package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.5V7  reason: invalid class name */
public class AnonymousClass5V7 {
    public static View A00(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        A01(inflate, i, 0, R.drawable.gray_circle, i2);
        ImageView A0F = AnonymousClass0x9.A0F(inflate, R.id.contactpicker_row_photo);
        if (A0F != null) {
            C107335b8.A0E(A0F, inflate.getResources().getColor(R.color.f5nameremoved));
        }
        return inflate;
    }

    public static void A01(View view, int i, int i2, int i3, int i4) {
        C107235av.A02(view);
        ThumbnailButton A16 = C86664Kz.A16(view, R.id.contactpicker_row_photo);
        C107335b8.A0C(view.getContext(), A16, i, i2);
        C86664Kz.A1R(A16);
        A16.setBackgroundResource(i3);
        A16.A07 = true;
        TextView A09 = AnonymousClass002.A09(view, R.id.contactpicker_row_name);
        C106905aM.A04(A09);
        A09.setText(i4);
        C86624Kv.A0u(view, R.id.contactpicker_row_status);
    }
}
