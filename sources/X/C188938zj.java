package X;

import java.util.Map;

/* renamed from: X.8zj  reason: invalid class name and case insensitive filesystem */
public class C188938zj extends AnonymousClass8O6 {
    public Object A00;
    public final int A01;

    public Object getOutput(int i) {
        switch (this.A01) {
            case 0:
                return getOutput(this, i);
            case 1:
                return getOutput(i);
            default:
                return getOutput$CompactHashMap$3(this, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C188938zj(AnonymousClass8TF r2, int i) {
        super(r2, (C188938zj) null);
        this.A01 = i;
        this.A00 = r2;
    }

    public static Object getOutput(C188938zj r0, int i) {
        return ((AnonymousClass8TF) r0.A00).key(i);
    }

    public static Object getOutput$CompactHashMap$3(C188938zj r0, int i) {
        return ((AnonymousClass8TF) r0.A00).value(i);
    }

    /* renamed from: getOutput  reason: collision with other method in class */
    public Map.Entry m26getOutput(int i) {
        return new C129326a8((AnonymousClass8TF) this.A00, i);
    }
}
