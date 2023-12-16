package X;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.5Or  reason: invalid class name and case insensitive filesystem */
public class C103855Or {
    public LinearLayout.LayoutParams A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public final Context A07;
    public final List A08 = AnonymousClass001.A0s();

    public AnonymousClass4Qo A00() {
        Context context = this.A07;
        Integer num = this.A03;
        LinearLayout.LayoutParams layoutParams = this.A00;
        String str = this.A06;
        String str2 = this.A05;
        return new AnonymousClass4Qo(context, layoutParams, num, this.A04, this.A02, this.A01, str, str2, this.A08);
    }

    public C103855Or(Context context) {
        this.A07 = context;
    }
}
