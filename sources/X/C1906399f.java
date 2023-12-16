package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.List;

/* renamed from: X.99f  reason: invalid class name and case insensitive filesystem */
public final class C1906399f extends AnonymousClass4OR {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1906399f(Context context, C620733j r3, List list) {
        super(context, r3, list, false);
        C18260x0.A0Q(context, r3);
    }

    public int A00() {
        String language = Resources.getSystem().getConfiguration().locale.getLanguage();
        List<C148187Hi> list = this.A02;
        C162457s7.A0D(list);
        int i = 0;
        for (C148187Hi r0 : list) {
            if (C162457s7.A0P(r0.A01, language)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int A01() {
        return this.A00;
    }

    public void A02(int i) {
        this.A00 = i;
    }
}
