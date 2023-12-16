package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CategorizedUserProblemsFragment;
import java.util.List;

/* renamed from: X.4TY  reason: invalid class name */
public final class AnonymousClass4TY extends AnonymousClass0AZ {
    public final List A00;

    public AnonymousClass4TY(C08270df r2, List list) {
        super(r2, 0);
        this.A00 = list;
    }

    public CharSequence A04(int i) {
        return (CharSequence) this.A00.get(i);
    }

    public int A0C() {
        return this.A00.size();
    }

    public C08310eF A0H(int i) {
        CategorizedUserProblemsFragment categorizedUserProblemsFragment = new CategorizedUserProblemsFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("index", i);
        categorizedUserProblemsFragment.A0u(A08);
        return categorizedUserProblemsFragment;
    }
}
