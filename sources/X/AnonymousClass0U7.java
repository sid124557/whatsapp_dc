package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0U7  reason: invalid class name */
public class AnonymousClass0U7 {
    public View A00;
    public final ArrayList A01 = AnonymousClass001.A0s();
    public final Map A02 = AnonymousClass001.A0t();

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass0U7) {
            AnonymousClass0U7 r3 = (AnonymousClass0U7) obj;
            if (this.A00 != r3.A00 || !this.A02.equals(r3.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public AnonymousClass0U7(View view) {
        this.A00 = view;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TransitionValues@");
        AnonymousClass001.A1N(A0o, hashCode());
        StringBuilder A0l = AnonymousClass000.A0l(AnonymousClass000.A0X(":\n", A0o));
        A0l.append("    view = ");
        A0l.append(this.A00);
        String A0X = AnonymousClass000.A0X("    values:", AnonymousClass000.A0l(AnonymousClass000.A0X("\n", A0l)));
        Map map = this.A02;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            StringBuilder A0l2 = AnonymousClass000.A0l(A0X);
            A0l2.append("    ");
            A0l2.append(A0m);
            A0l2.append(": ");
            A0l2.append(map.get(A0m));
            A0X = AnonymousClass000.A0X("\n", A0l2);
        }
        return A0X;
    }

    @Deprecated
    public AnonymousClass0U7() {
    }
}
