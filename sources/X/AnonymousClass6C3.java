package X;

import android.view.View;
import com.whatsapp.HomeActivity;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6C3  reason: invalid class name */
public class AnonymousClass6C3 implements C834048g, AnonymousClass4GS {
    public Object A00;
    public final int A01;

    public AnonymousClass6C3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object BGj(Object obj, Object obj2, Object obj3) {
        int i = this.A01;
        Object obj4 = this.A00;
        if (i == 0) {
            return ((HomeActivity) obj4).A7P((String) obj, AnonymousClass001.A0K(obj2), AnonymousClass001.A1Z(obj3));
        }
        C113245l7 r2 = (C113245l7) obj4;
        int A0K = AnonymousClass001.A0K(obj2);
        boolean A1Z = AnonymousClass001.A1Z(obj3);
        View contentView = r2.A2z.getContentView();
        List emptyList = Collections.emptyList();
        return new C110065fd(C113245l7.A05(r2), C88694ab.A02(contentView, (String) obj, A0K), r2.A3G, emptyList, A1Z);
    }
}
