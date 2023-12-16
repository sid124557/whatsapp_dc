package X;

import java.util.Map;

/* renamed from: X.0vi  reason: invalid class name and case insensitive filesystem */
public class C17520vi extends AnonymousClass0O1 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C17520vi(AnonymousClass0US r1, C04520Op r2, String str, int i) {
        this.A03 = i;
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public void A00(C05880Vi r6, Object obj) {
        int i = this.A03;
        AnonymousClass0US r3 = (AnonymousClass0US) this.A00;
        Map map = r3.A04;
        String str = this.A02;
        Number number = (Number) map.get(str);
        if (i != 0) {
            if (number != null) {
                r3.A00.add(str);
                try {
                    r3.A03((C04520Op) this.A01, r6, obj, number.intValue());
                } catch (Exception e) {
                    r3.A00.remove(str);
                    throw e;
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                A0o.append(this.A01);
                A0o.append(" and input ");
                A0o.append(obj);
                throw AnonymousClass000.A0I(". You must ensure the ActivityResultLauncher is registered before calling launch().", A0o);
            }
        } else if (number != null) {
            r3.A00.add(str);
            r3.A03((C04520Op) this.A01, r6, obj, number.intValue());
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            A0o2.append(this.A01);
            A0o2.append(" and input ");
            A0o2.append(obj);
            throw AnonymousClass000.A0I(". You must ensure the ActivityResultLauncher is registered before calling launch().", A0o2);
        }
    }
}
