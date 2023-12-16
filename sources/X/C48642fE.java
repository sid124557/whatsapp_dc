package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2fE  reason: invalid class name and case insensitive filesystem */
public abstract class C48642fE {
    public Map A00;
    public final Map A01 = AnonymousClass001.A0t();

    public final Object A00(Object obj) {
        Map map = this.A00;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return A01(this.A00, obj);
    }

    public Object A01(Map map, Object obj) {
        Integer num;
        String str;
        String str2;
        int i;
        int i2;
        if (this instanceof C27131dK) {
            C162457s7.A0J(map, 0);
            Iterator A0v = AnonymousClass001.A0v(map);
            if (A0v.hasNext()) {
                i2 = ((C618532n) A0v.next()).A01;
            } else {
                i2 = 2;
            }
            return Integer.valueOf(i2);
        } else if (this instanceof C27121dJ) {
            C162457s7.A0J(map, 0);
            ArrayList A0z = C18290x4.A0z(map);
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                AnonymousClass0x7.A1D(AnonymousClass0x2.A0W(A0q), A0z);
            }
            return C73723fy.A09("\n", A0z);
        } else if (this instanceof C27111dI) {
            C162457s7.A0J(map, 0);
            Iterator A0v2 = AnonymousClass001.A0v(map);
            if (A0v2.hasNext()) {
                i = ((C618532n) A0v2.next()).A01;
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        } else if (this instanceof C27101dH) {
            return AnonymousClass001.A0f();
        } else {
            if (this instanceof C27091dG) {
                Iterator A0v3 = AnonymousClass001.A0v(map);
                if (A0v3.hasNext()) {
                    return Integer.valueOf(((C618532n) A0v3.next()).A01);
                }
                return null;
            } else if (this instanceof C27081dF) {
                int i3 = 4;
                if (!AnonymousClass0x7.A1V(map, 2498024)) {
                    i3 = 3;
                    if (!AnonymousClass0x7.A1V(map, 2498023)) {
                        if (!AnonymousClass0x7.A1V(map, 2498022)) {
                            return null;
                        }
                        i3 = 2;
                    }
                }
                return Integer.valueOf(i3);
            } else if (this instanceof C27071dE) {
                return null;
            } else {
                if (this instanceof C27061dD) {
                    C162457s7.A0J(map, 0);
                    C618532n r0 = (C618532n) AnonymousClass001.A0i(map, 2498014);
                    if (r0 != null && (str2 = r0.A05) != null) {
                        return str2;
                    }
                    C618532n r02 = (C618532n) AnonymousClass001.A0i(map, 2498018);
                    if (r02 != null && (str = r02.A05) != null) {
                        return str;
                    }
                    C618532n r03 = (C618532n) AnonymousClass001.A0i(map, 2498019);
                    if (r03 != null) {
                        return r03.A05;
                    }
                    return null;
                } else if (this instanceof C27051dC) {
                    return "Unable to fetch configuration.";
                } else {
                    if (this instanceof C27151dM) {
                        C27151dM r3 = (C27151dM) this;
                        C162457s7.A0J(map, 0);
                        if (!(!map.isEmpty())) {
                            return new C29641ko();
                        }
                        int size = map.size();
                        Collection<C618532n> values = map.values();
                        if (size <= 1) {
                            return new AnonymousClass1kq(r3.A02((C618532n) C73723fy.A00(values)));
                        }
                        ArrayList A0c = C73783g4.A0c(values);
                        for (C618532n A02 : values) {
                            A0c.add(r3.A02(A02));
                        }
                        return new AnonymousClass1kr(A0c);
                    } else if (this instanceof C27041dB) {
                        C162457s7.A0J(map, 0);
                        if (AnonymousClass0x7.A1V(map, 4177005)) {
                            return new C377823z();
                        }
                        if (AnonymousClass0x7.A1V(map, 1675030)) {
                            return new C377723y();
                        }
                        if (AnonymousClass0x7.A1V(map, 4177007)) {
                            return new AnonymousClass241();
                        }
                        if (AnonymousClass0x7.A1V(map, 4177006)) {
                            return new AnonymousClass240();
                        }
                        if (AnonymousClass0x7.A1V(map, 4177004)) {
                            return new AnonymousClass243();
                        }
                        if (AnonymousClass0x7.A1V(map, 4177001)) {
                            return new AnonymousClass242();
                        }
                        if (!(!map.isEmpty())) {
                            return null;
                        }
                        C618532n r04 = (C618532n) C73723fy.A01(map.values());
                        if (r04 != null) {
                            num = Integer.valueOf(r04.A01);
                        } else {
                            num = null;
                        }
                        return new C377623x(num);
                    } else if (this instanceof C27031dA) {
                        C162457s7.A0J(map, 0);
                        C618532n r05 = (C618532n) C73723fy.A01(map.values());
                        if (r05 != null) {
                            return Integer.valueOf(r05.A01);
                        }
                        return null;
                    } else if (!(this instanceof C27021d9) && (this instanceof C27141dL)) {
                        return ((C27141dL) this).A02((C46202bF) obj, map);
                    } else {
                        return null;
                    }
                }
            }
        }
    }
}
