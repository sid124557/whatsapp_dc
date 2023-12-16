package X;

import android.content.Context;
import android.view.View;
import java.util.Set;

/* renamed from: X.4c9  reason: invalid class name and case insensitive filesystem */
public class C89244c9 extends C88944b3 {
    public final C624134x A00;
    public final Set A01;

    public C89244c9(Context context, C184988ss r8, C69263Wi r9, C620633i r10, C624134x r11, String str, Set set) {
        super(context, r8, r9, r10, str);
        this.A01 = set;
        this.A00 = r11;
    }

    public void onClick(View view) {
        Set set = this.A01;
        if (set != null) {
            ((C89654ea) C111095hX.A04(view)).Boo(C379624s.A00(this.A0A, this.A00.A1J.A01, set));
            return;
        }
        super.onClick(view);
    }
}
