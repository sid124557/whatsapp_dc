package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.5HZ  reason: invalid class name */
public final class AnonymousClass5HZ {
    public final Collection A00;
    public final Collection A01;

    public AnonymousClass5HZ(String... strArr) {
        Collection emptySet;
        if (r4 == 0) {
            emptySet = Collections.emptySet();
        } else if (r4 == 1) {
            emptySet = Collections.singleton(strArr[0]);
        } else if (r4 == 2 || r4 == 3 || r4 == 4 || r4 == 5) {
            emptySet = Arrays.asList(strArr);
        } else {
            emptySet = C18280x3.A0h(strArr);
        }
        this.A00 = emptySet;
        this.A01 = AnonymousClass002.A0K();
        for (String str : strArr) {
            Collection collection = this.A01;
            Object[] objArr = (Object[]) C155657fG.A02.A00.get(str);
            C626936e.A06(objArr);
            Collections.addAll(collection, objArr);
        }
    }
}
