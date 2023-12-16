package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.util.concurrent.Callable;

/* renamed from: X.0wO  reason: invalid class name and case insensitive filesystem */
public class C17880wO implements Callable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C17880wO(Object obj, Object obj2, String str, int i, int i2) {
        this.A04 = i2;
        this.A03 = str;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        switch (this.A04) {
            case 0:
                return C05810Vb.A00((Context) this.A01, (C04200Nf) this.A02, this.A03, this.A00);
            case 1:
                try {
                    return C05810Vb.A00((Context) this.A01, (C04200Nf) this.A02, this.A03, this.A00);
                } catch (Throwable unused) {
                    return new C05350Sz(-3);
                }
            default:
                Context context = (Context) ((Reference) this.A02).get();
                if (context == null) {
                    context = (Context) this.A01;
                }
                return AnonymousClass0YR.A00(context, this.A03, this.A00);
        }
    }
}
