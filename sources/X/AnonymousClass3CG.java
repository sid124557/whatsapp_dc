package X;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.3CG  reason: invalid class name */
public abstract class AnonymousClass3CG implements C835348u {
    public final Set A00;

    public AnonymousClass3CG(String... strArr) {
        C13570nO r1 = new C13570nO(strArr.length);
        this.A00 = r1;
        r1.addAll(Arrays.asList(strArr));
    }

    public static AnonymousClass8DF A00(List list, int i) {
        return ((C155787fV) list.get(i)).A00;
    }
}
