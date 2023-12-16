package X;

import android.text.TextUtils;
import com.facebook.graphql.calls.GraphQlCallInput;
import java.util.ArrayList;

/* renamed from: X.6L0  reason: invalid class name */
public final class AnonymousClass6L0 extends AnonymousClass7WU {
    public int A00;
    public final ArrayList A01 = AnonymousClass002.A0I(32);

    public final void A04(String str) {
        if (!this.A03) {
            throw AnonymousClass001.A0e("Expected object to be mutable");
        } else if (TextUtils.isEmpty(str)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("key=");
            throw AnonymousClass000.A0F(str, A0o);
        }
    }

    public static void A00(GraphQlCallInput graphQlCallInput, int i) {
        graphQlCallInput.A00().A05("limit", Integer.valueOf(i));
    }

    public void A03(AnonymousClass7WU r1, String str) {
        A04(str);
        r1.A01();
        A05(str, r1);
        r1.A01();
        r1.A00 = this;
    }

    public final void A05(String str, Object obj) {
        A04(str);
        ArrayList arrayList = this.A01;
        arrayList.add(str);
        arrayList.add(obj);
        this.A00++;
    }
}
