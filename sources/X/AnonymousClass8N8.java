package X;

import java.security.cert.PolicyNode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8N8  reason: invalid class name */
public class AnonymousClass8N8 implements PolicyNode {
    public int A00;
    public String A01;
    public PolicyNode A02;
    public List A03;
    public Set A04;
    public Set A05;
    public boolean A06;

    public Iterator getChildren() {
        return this.A03.iterator();
    }

    public int getDepth() {
        return this.A00;
    }

    public Set getExpectedPolicies() {
        return this.A04;
    }

    public PolicyNode getParent() {
        return this.A02;
    }

    public Set getPolicyQualifiers() {
        return this.A05;
    }

    public String getValidPolicy() {
        return this.A01;
    }

    public boolean isCritical() {
        return this.A06;
    }

    public String toString() {
        return A00("");
    }

    public AnonymousClass8N8(String str, PolicyNode policyNode, List list, Set set, Set set2, int i, boolean z) {
        this.A03 = list;
        this.A00 = i;
        this.A04 = set;
        this.A02 = policyNode;
        this.A05 = set2;
        this.A01 = str;
        this.A06 = z;
    }

    public String A00(String str) {
        StringBuffer A0i = AnonymousClass6C9.A0i(str);
        A0i.append(this.A01);
        A0i.append(" {\n");
        int i = 0;
        while (true) {
            List list = this.A03;
            if (i < list.size()) {
                A0i.append(((AnonymousClass8N8) list.get(i)).A00(AnonymousClass000.A0X("    ", AnonymousClass000.A0l(str))));
                i++;
            } else {
                A0i.append(str);
                return AnonymousClass6C9.A0f("}\n", A0i);
            }
        }
    }

    public AnonymousClass8N8 A01() {
        HashSet A0K = AnonymousClass002.A0K();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            A0K.add(new String(AnonymousClass001.A0m(it)));
        }
        HashSet A0K2 = AnonymousClass002.A0K();
        Iterator it2 = this.A05.iterator();
        while (it2.hasNext()) {
            A0K2.add(new String(AnonymousClass001.A0m(it2)));
        }
        AnonymousClass8N8 r3 = new AnonymousClass8N8(new String(this.A01), (PolicyNode) null, AnonymousClass001.A0s(), A0K, A0K2, this.A00, this.A06);
        for (AnonymousClass8N8 A012 : this.A03) {
            AnonymousClass8N8 A013 = A012.A01();
            A013.A02 = r3;
            r3.A03.add(A013);
            A013.A02 = r3;
        }
        return r3;
    }

    public Object clone() {
        return A01();
    }
}
