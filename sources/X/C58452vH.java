package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2vH  reason: invalid class name and case insensitive filesystem */
public class C58452vH {
    public final int A00;
    public final List A01;

    public C58452vH(List list) {
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = 0;
    }

    public C58452vH(int i) {
        this.A01 = Collections.emptyList();
        this.A00 = i;
    }
}
