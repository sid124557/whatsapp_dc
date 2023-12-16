package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.6IU  reason: invalid class name */
public class AnonymousClass6IU extends C05570Ua {
    public final CheckBox A00;
    public final TextView A01;

    public AnonymousClass6IU(View view) {
        super(view);
        this.A01 = C18300x5.A0G(view, R.id.media_section);
        CheckBox checkBox = (CheckBox) C06560Yg.A02(view, R.id.media_select_all_checkbox);
        this.A00 = checkBox;
        checkBox.setText(view.getResources().getText(R.string.f11nameremoved));
        checkBox.setOnCheckedChangeListener(new C167107zm());
    }
}
