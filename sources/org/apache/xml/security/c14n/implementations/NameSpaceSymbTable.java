package org.apache.xml.security.c14n.implementations;

import X.AnonymousClass002;
import X.AnonymousClass6C9;
import java.util.Collection;
import java.util.List;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;

public class NameSpaceSymbTable {
    public static final SymbMap e;
    public SymbMap a = ((SymbMap) e.clone());
    public int b = 0;
    public List c = AnonymousClass002.A0I(10);
    public boolean d = true;

    static {
        SymbMap symbMap = new SymbMap();
        e = symbMap;
        NameSpaceSymbEntry nameSpaceSymbEntry = new NameSpaceSymbEntry("", (Attr) null, true, "xmlns");
        nameSpaceSymbEntry.d = "";
        symbMap.a("xmlns", nameSpaceSymbEntry);
    }

    public int f() {
        return this.c.size();
    }

    public boolean a(String str, String str2, Attr attr) {
        NameSpaceSymbEntry A0n = AnonymousClass6C9.A0n(str, this);
        boolean z = false;
        if (A0n == null || !str2.equals(A0n.c)) {
            NameSpaceSymbEntry nameSpaceSymbEntry = new NameSpaceSymbEntry(str2, attr, false, str);
            e();
            this.a.a(str, nameSpaceSymbEntry);
            z = true;
            if (A0n != null) {
                nameSpaceSymbEntry.d = A0n.d;
                String str3 = A0n.d;
                if (str3 != null && str3.equals(str2)) {
                    nameSpaceSymbEntry.e = true;
                    return true;
                }
            }
        }
        return z;
    }

    public Node b(String str, String str2, Attr attr) {
        NameSpaceSymbEntry nameSpaceSymbEntry;
        String str3;
        NameSpaceSymbEntry A0n = AnonymousClass6C9.A0n(str, this);
        if (A0n == null || !str2.equals(A0n.c)) {
            nameSpaceSymbEntry = new NameSpaceSymbEntry(str2, attr, true, str);
            nameSpaceSymbEntry.d = str2;
            e();
            this.a.a(str, nameSpaceSymbEntry);
            if (!(A0n == null || (str3 = A0n.d) == null || !str3.equals(str2))) {
                nameSpaceSymbEntry.e = true;
                return null;
            }
        } else {
            if (!A0n.e) {
                nameSpaceSymbEntry = (NameSpaceSymbEntry) A0n.clone();
                e();
                this.a.a(str, nameSpaceSymbEntry);
                nameSpaceSymbEntry.d = str2;
                nameSpaceSymbEntry.e = true;
            }
            return null;
        }
        return nameSpaceSymbEntry.f;
    }

    public void c(String str) {
        if (AnonymousClass6C9.A0n(str, this) != null) {
            e();
            this.a.a(str, (NameSpaceSymbEntry) null);
        }
    }

    public void d(String str) {
        NameSpaceSymbEntry A0n = AnonymousClass6C9.A0n(str, this);
        if (A0n != null && !A0n.e) {
            e();
            this.a.a(str, (NameSpaceSymbEntry) null);
        }
    }

    public boolean e(String str) {
        NameSpaceSymbEntry A0n = AnonymousClass6C9.A0n(str, this);
        if (A0n == null || !A0n.e) {
            return false;
        }
        e();
        this.a.a(str, (NameSpaceSymbEntry) null);
        return false;
    }

    public void a() {
        this.b++;
        c();
    }

    public void b() {
        this.b--;
        d();
    }

    public void c() {
        this.c.add((Object) null);
        this.d = false;
    }

    public void d() {
        boolean z = true;
        int size = this.c.size() - 1;
        Object remove = this.c.remove(size);
        if (remove != null) {
            this.a = (SymbMap) remove;
            if (size != 0) {
                if (this.c.get(size - 1) == this.a) {
                    z = false;
                }
                this.d = z;
                return;
            }
        }
        this.d = false;
    }

    public final void e() {
        if (!this.d) {
            List list = this.c;
            list.set(list.size() - 1, this.a);
            this.a = (SymbMap) this.a.clone();
            this.d = true;
        }
    }

    public void a(Collection collection) {
        for (NameSpaceSymbEntry nameSpaceSymbEntry : this.a.a()) {
            if (!nameSpaceSymbEntry.e && nameSpaceSymbEntry.f != null) {
                NameSpaceSymbEntry nameSpaceSymbEntry2 = (NameSpaceSymbEntry) nameSpaceSymbEntry.clone();
                e();
                this.a.a(nameSpaceSymbEntry2.b, nameSpaceSymbEntry2);
                nameSpaceSymbEntry2.d = nameSpaceSymbEntry2.c;
                nameSpaceSymbEntry2.e = true;
                collection.add(nameSpaceSymbEntry2.f);
            }
        }
    }

    public Attr b(String str) {
        NameSpaceSymbEntry A0n = AnonymousClass6C9.A0n(str, this);
        if (A0n == null || A0n.e) {
            return null;
        }
        return A0n.f;
    }

    public Attr a(String str) {
        NameSpaceSymbEntry A0n = AnonymousClass6C9.A0n(str, this);
        if (A0n == null || A0n.e) {
            return null;
        }
        NameSpaceSymbEntry nameSpaceSymbEntry = (NameSpaceSymbEntry) A0n.clone();
        e();
        this.a.a(str, nameSpaceSymbEntry);
        nameSpaceSymbEntry.e = true;
        nameSpaceSymbEntry.a = this.b;
        nameSpaceSymbEntry.d = nameSpaceSymbEntry.c;
        return nameSpaceSymbEntry.f;
    }
}
