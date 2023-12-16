package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.7ht  reason: invalid class name and case insensitive filesystem */
public final class C157187ht {
    public final String A00;

    public final String A00(String str) {
        List list;
        C162457s7.A0J(str, 0);
        String str2 = this.A00;
        if (str2 != null) {
            C157307i5 A01 = C159957ml.A01(str2);
            Object A012 = A01.A01("$.length()", new C181468mo[0]);
            C162457s7.A0D(A012);
            int A0K = AnonymousClass001.A0K(A012);
            for (int i = 0; i < A0K; i++) {
                try {
                    list = (List) A01.A01(AnonymousClass000.A0X("].error_equals", C18270x1.A0W(i, "$.[")), new C181468mo[0]);
                } catch (ClassCastException e) {
                    Log.e("FcsStateErrors: Failed to parse error_equals as a List<String>", e);
                    list = C72023d3.A00;
                } catch (C131276dK unused) {
                    list = C72023d3.A00;
                }
                if (list.contains(str) || list.isEmpty()) {
                    return (String) A01.A01(AnonymousClass000.A0X("].next", C18270x1.A0W(i, "$.[")), new C181468mo[0]);
                }
            }
        }
        return null;
    }

    public C157187ht(String str) {
        this.A00 = str;
    }

    public C157187ht() {
        this((String) null);
    }
}
