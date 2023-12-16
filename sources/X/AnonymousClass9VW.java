package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import java.util.Arrays;

/* renamed from: X.9VW  reason: invalid class name */
public class AnonymousClass9VW {
    public int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9VW)) {
            return false;
        }
        AnonymousClass9VW r4 = (AnonymousClass9VW) obj;
        return this.A00 == r4.A00 && AnonymousClass75J.A00(this.A01, r4.A01);
    }

    public String A02(Context context) {
        String str = this.A01;
        if (str == null) {
            return context.getString(this.A00);
        }
        return str;
    }

    public AnonymousClass9VW(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public static DialogFragment A00(Context context, AnonymousClass9VW r1) {
        String A02 = r1.A02(context);
        C50472iE r0 = new C50472iE();
        r0.A08 = A02;
        return r0.A00();
    }

    public void A03() {
        this.A00 = R.string.f11nameremoved;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        A0M[1] = this.A01;
        return Arrays.hashCode(A0M);
    }

    public int A01() {
        return this.A00;
    }

    public AnonymousClass9VW(int i) {
        this.A00 = i;
        this.A01 = null;
    }
}
