package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.1RT  reason: invalid class name */
public class AnonymousClass1RT extends AnonymousClass3ZH {
    public static String A02;
    public final C54292oU A00;
    public final C182358oH A01;

    public AnonymousClass1RT(C54292oU r4, C620733j r5) {
        super(C135216kJ.A00);
        AnonymousClass3FG r2 = new AnonymousClass3FG();
        this.A01 = r2;
        this.A00 = r4;
        this.A08 = 3;
        this.A0A = -2;
        r5.A0A.add(r2);
    }

    public static String A00(Context context, int i) {
        Object[] A0L = AnonymousClass002.A0L();
        String str = A02;
        if (str == null) {
            str = context.getString(R.string.f11nameremoved);
            A02 = str;
        }
        return AnonymousClass002.A0F(context, str, A0L, 0, i);
    }
}
