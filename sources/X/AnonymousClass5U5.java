package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;

/* renamed from: X.5U5  reason: invalid class name */
public final class AnonymousClass5U5 {
    public Vector A00;
    public Vector A01;
    public JSONObject A02;
    public boolean A03 = true;
    public final AnonymousClass5YC A04 = new AnonymousClass5YC();
    public final HashMap A05 = AnonymousClass001.A0t();

    public final double A00(ArrayList arrayList) {
        AnonymousClass5YC r5 = this.A04;
        int size = r5.A07.size();
        ArrayList A0I = AnonymousClass002.A0I(size);
        for (int i = 0; i < size; i++) {
            A0I.add(Double.valueOf(0.0d));
        }
        r5.A01 = AnonymousClass002.A0J(A0I);
        int size2 = r5.A06.size();
        ArrayList A0I2 = AnonymousClass002.A0I(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            A0I2.add(Boolean.FALSE);
        }
        r5.A00 = AnonymousClass002.A0J(A0I2);
        int size3 = arrayList.size();
        Vector vector = r5.A09;
        if (size3 == vector.size()) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                AnonymousClass3Z6 r1 = (AnonymousClass3Z6) it.next();
                int A0K = AnonymousClass001.A0K(r1.second);
                int A0K2 = AnonymousClass001.A0K(r1.first);
                ArrayList arrayList2 = r5.A01;
                if (arrayList2 == null) {
                    throw C18270x1.A0S("outputValues");
                }
                arrayList2.set(A0K2, arrayList.get(A0K));
            }
            int size4 = this.A05.size();
            ArrayList A0I3 = AnonymousClass002.A0I(size4);
            for (int i3 = 0; i3 < size4; i3++) {
                A0I3.add(Double.valueOf(0.0d));
            }
            ArrayList A0J = AnonymousClass002.A0J(A0I3);
            Vector vector2 = this.A00;
            if (vector2 == null) {
                throw C18270x1.A0S("baseValuesRuleTrees");
            }
            Iterator it2 = vector2.iterator();
            while (it2.hasNext()) {
                C156407gZ r12 = (C156407gZ) it2.next();
                C162457s7.A0H(r12);
                A03(r12, A0J, AnonymousClass8ZS.A00);
            }
            Vector vector3 = this.A01;
            if (vector3 == null) {
                throw C18270x1.A0S("multiplierRuleTrees");
            }
            Iterator it3 = vector3.iterator();
            while (it3.hasNext()) {
                C156407gZ r13 = (C156407gZ) it3.next();
                C162457s7.A0H(r13);
                A03(r13, A0J, AnonymousClass8ZT.A00);
            }
            Iterator it4 = A0J.iterator();
            double d = 0.0d;
            while (it4.hasNext()) {
                d += ((Number) it4.next()).doubleValue();
            }
            return d;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A19("input array has unexpected size. Expected: ", A0o, vector);
        C18260x0.A19(". Actual: ", A0o, arrayList);
        throw new C118205tA(A0o.toString());
    }

    public final Vector A01(HashMap hashMap, JSONObject jSONObject) {
        C156407gZ r1;
        Vector vector = new Vector();
        Iterator<String> keys = jSONObject.keys();
        C162457s7.A0D(keys);
        while (keys.hasNext()) {
            String A0m = AnonymousClass001.A0m(keys);
            Object obj = jSONObject.get(A0m);
            if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                if (!hashMap.containsKey(A0m)) {
                    int size = hashMap.size();
                    Integer valueOf = Integer.valueOf(size);
                    C162457s7.A0H(A0m);
                    hashMap.put(A0m, valueOf);
                    r1 = new C156407gZ(size, obj.toString());
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Multiple base values for variable ");
                    A0o.append(A0m);
                    throw C118205tA.A00(" in config file.", A0o);
                }
            } else if (obj instanceof JSONObject) {
                AnonymousClass5YC r0 = this.A04;
                C18280x3.A12(A0m);
                if (r0.A03.containsKey(A0m)) {
                    r1 = new C156407gZ(A0m, (List) A01(hashMap, (JSONObject) obj));
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Undeclared feature ");
                    A0o2.append(A0m);
                    throw C118205tA.A00(" used as condition in base_values.", A0o2);
                }
            } else {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Variable ");
                A0o3.append(A0m);
                throw C118205tA.A00(" used in base_values has unexpected type.", A0o3);
            }
            vector.add(r1);
        }
        return vector;
    }

    public final Vector A02(JSONObject jSONObject, boolean z) {
        C156407gZ r1;
        Vector vector = new Vector();
        Iterator<String> keys = jSONObject.keys();
        C162457s7.A0D(keys);
        while (keys.hasNext()) {
            String A0m = AnonymousClass001.A0m(keys);
            if (!z || !C162457s7.A0P(A0m, "base_values")) {
                Object obj = jSONObject.get(A0m);
                if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                    HashMap hashMap = this.A05;
                    if (hashMap.containsKey(A0m)) {
                        C162457s7.A0H(A0m);
                        r1 = new C156407gZ(AnonymousClass001.A0K(C57692u3.A02(hashMap, A0m)), obj.toString());
                    }
                } else if (obj instanceof JSONObject) {
                    AnonymousClass5YC r0 = this.A04;
                    C162457s7.A0H(A0m);
                    C162457s7.A0J(A0m, 0);
                    if (r0.A03.containsKey(A0m)) {
                        r1 = new C156407gZ(A0m, (List) A02((JSONObject) obj, false));
                    } else if (z) {
                        vector.addAll(A02((JSONObject) obj, false));
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Undeclared feature ");
                        A0o.append(A0m);
                        throw C118205tA.A00(" used as condition in biz_multiply_values.", A0o);
                    }
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("Variable ");
                    A0o2.append(A0m);
                    throw C118205tA.A00(" used in biz_multiply_values has unexpected type.", A0o2);
                }
                vector.add(r1);
            }
        }
        return vector;
    }

    public final void A03(C156407gZ r7, ArrayList arrayList, AnonymousClass4GR r9) {
        List<C156407gZ> list = r7.A02;
        if (list == null) {
            String str = r7.A01;
            Integer num = r7.A00;
            if (num != null) {
                Double d = null;
                try {
                    C116975rB r1 = C39192Ba.A00;
                    C162457s7.A0J(str, 0);
                    if (C18280x3.A1X(str, r1.nativePattern)) {
                        d = Double.valueOf(Double.parseDouble(str));
                        if (d != null) {
                            int intValue = num.intValue();
                            arrayList.set(intValue, r9.invoke(C86654Ky.A0j(arrayList, intValue), d));
                            return;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                int intValue2 = num.intValue();
                arrayList.set(intValue2, r9.invoke(C86654Ky.A0j(arrayList, intValue2), Double.valueOf(this.A04.A00(str))));
                return;
            }
            throw new C118205tA("ValueModelConfigParser error! Rule tree leaf node has null index!");
        } else if (this.A04.A00(r7.A01) != 0.0d) {
            for (C156407gZ A032 : list) {
                A03(A032, arrayList, r9);
            }
        }
    }

    public AnonymousClass5U5(String str) {
        this.A02 = AnonymousClass0x9.A1H(str);
    }
}
