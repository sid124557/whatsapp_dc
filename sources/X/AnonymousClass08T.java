package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.08T  reason: invalid class name */
public final class AnonymousClass08T extends C05550Ty {
    public static final C17190ui A06 = new C18040we(0);
    public boolean A00 = false;
    public boolean A01 = false;
    public final HashMap A02 = AnonymousClass001.A0t();
    public final HashMap A03 = AnonymousClass001.A0t();
    public final HashMap A04 = AnonymousClass001.A0t();
    public final boolean A05;

    public static void A00(C08270df r2) {
        r2.A0O = false;
        r2.A0P = false;
        r2.A0A.A01 = false;
    }

    public void A0C() {
        if (C08270df.A05(3)) {
            Log.d("FragmentManager", AnonymousClass000.A0P(this, "onCleared called for ", AnonymousClass001.A0o()));
        }
        this.A00 = true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass08T.class != obj.getClass()) {
                return false;
            }
            AnonymousClass08T r5 = (AnonymousClass08T) obj;
            if (!this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public void A0D(C08310eF r5) {
        String A0P;
        if (this.A01) {
            if (C08270df.A05(2)) {
                A0P = "Ignoring removeRetainedFragment as the state is already saved";
            } else {
                return;
            }
        } else if (this.A03.remove(r5.A0V) != null && C08270df.A05(2)) {
            A0P = AnonymousClass000.A0P(r5, "Updating retained Fragments: Removed ", AnonymousClass001.A0o());
        } else {
            return;
        }
        Log.v("FragmentManager", A0P);
    }

    public final void A0E(String str) {
        HashMap hashMap = this.A02;
        C05550Ty r0 = (C05550Ty) hashMap.get(str);
        if (r0 != null) {
            r0.A0C();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.A04;
        AnonymousClass0N2 r02 = (AnonymousClass0N2) hashMap2.get(str);
        if (r02 != null) {
            r02.A00();
            hashMap2.remove(str);
        }
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A04, AnonymousClass000.A08(this.A02, this.A03.hashCode() * 31));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        AnonymousClass001.A1N(sb, System.identityHashCode(this));
        sb.append("} Fragments (");
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A02.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(AnonymousClass001.A0m(it2));
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A04.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(AnonymousClass001.A0m(it3));
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        return AnonymousClass000.A0c(sb);
    }

    public AnonymousClass08T(boolean z) {
        this.A05 = z;
    }
}
