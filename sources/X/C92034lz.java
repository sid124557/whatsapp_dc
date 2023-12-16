package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4lz  reason: invalid class name and case insensitive filesystem */
public final class C92034lz extends AnonymousClass5SS {
    public String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92034lz(String str, List list) {
        super(list, R.string.f11nameremoved, true);
        C162457s7.A0J(list, 2);
        this.A00 = str;
    }

    public String A01(C89634eX r5) {
        String str = this.A00;
        if (str != null) {
            return C18300x5.A0e(r5, str, AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        }
        return C18290x4.A0l(r5, this.A00);
    }
}
