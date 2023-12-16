package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.3Mq  reason: invalid class name and case insensitive filesystem */
public class C66753Mq implements C182458oR {
    public final int A00;
    public final AnonymousClass3ZN A01;
    public final String A02;
    public final Set A03;

    public boolean BHT(C45212Zc r4) {
        try {
            AnonymousClass3ZN r1 = new AnonymousClass3ZN(r4.A00(this.A02));
            if (9 - this.A00 == 0) {
                return r1.compareTo(this.A01) >= 0;
            }
            Set set = this.A03;
            C626936e.A06(set);
            return set.contains(r1);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        AnonymousClass000.A1M(objArr, this.A00);
        objArr[2] = this.A01;
        objArr[3] = this.A03;
        return C18310x6.A08(String.class, objArr, 4);
    }

    public C66753Mq(Object obj) {
        this.A00 = 9;
        this.A02 = "app_version";
        this.A01 = new AnonymousClass3ZN(obj);
        this.A03 = null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C66753Mq)) {
            return false;
        }
        C66753Mq r4 = (C66753Mq) obj;
        if (!this.A02.equals(r4.A02) || this.A00 != r4.A00) {
            return false;
        }
        AnonymousClass3ZN r1 = this.A01;
        AnonymousClass3ZN r0 = r4.A01;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
        } else if (!r1.equals(r0)) {
            return false;
        }
        Set set = this.A03;
        Set set2 = r4.A03;
        if (set == null) {
            if (set2 != null) {
                return false;
            }
        } else if (!set.equals(set2)) {
            return false;
        }
        Class<String> cls = String.class;
        if (cls.equals(cls)) {
            return true;
        }
        return false;
    }

    public C66753Mq(String str, List list) {
        this.A00 = 10;
        this.A02 = str;
        this.A03 = C18320x8.A0p(list);
        for (Object r2 : list) {
            this.A03.add(new AnonymousClass3ZN(r2));
        }
        this.A01 = null;
    }
}
