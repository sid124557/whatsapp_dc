package X;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.8TC  reason: invalid class name */
public class AnonymousClass8TC<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public List A00 = Collections.emptyList();
    public Map A01 = Collections.emptyMap();
    public Map A02 = Collections.emptyMap();
    public boolean A03;
    public final int A04;
    public volatile AnonymousClass8TK A05;
    public volatile AnonymousClass8TK A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass8TC)) {
                return super.equals(obj);
            }
            AnonymousClass8TC r8 = (AnonymousClass8TC) obj;
            int size = size();
            if (size == r8.size()) {
                int size2 = this.A00.size();
                if (size2 != r8.A00.size()) {
                    return entrySet().equals(r8.entrySet());
                }
                int i = 0;
                while (i < size2) {
                    if (((Map.Entry) this.A00.get(i)).equals(r8.A00.get(i))) {
                        i++;
                    }
                }
                if (size2 != size) {
                    return this.A01.equals(r8.A01);
                }
            }
            return false;
        }
        return true;
    }

    public final int A00(Comparable comparable) {
        int i;
        int A032 = AnonymousClass002.A03(this.A00);
        if (A032 >= 0) {
            int compareTo = comparable.compareTo(((AnonymousClass8OO) this.A00.get(A032)).A01);
            if (compareTo > 0) {
                i = A032 + 2;
                return -i;
            } else if (compareTo == 0) {
                return A032;
            }
        }
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i2 > A032) {
                break;
            }
            int i3 = (i2 + A032) / 2;
            int compareTo2 = comparable.compareTo(((AnonymousClass8OO) this.A00.get(i3)).A01);
            if (compareTo2 < 0) {
                A032 = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -i;
    }

    public void A04() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.A03) {
            if (this.A01.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.A01);
            }
            this.A01 = unmodifiableMap;
            if (this.A02.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.A02);
            }
            this.A02 = unmodifiableMap2;
            this.A03 = true;
        }
    }

    public final void A05() {
        if (this.A03) {
            throw C18320x8.A0m();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (A00(comparable) >= 0 || this.A01.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set entrySet() {
        if (this.A06 == null) {
            this.A06 = new AnonymousClass8TK(this);
        }
        return this.A06;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((AnonymousClass8OO) this.A00.get(A002)).getValue();
        }
        return this.A01.get(comparable);
    }

    public int hashCode() {
        int size = this.A00.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass002.A02(this.A00.get(i2), i);
        }
        if (this.A01.size() > 0) {
            return i + this.A01.hashCode();
        }
        return i;
    }

    public int size() {
        return this.A00.size() + this.A01.size();
    }

    public AnonymousClass8TC(int i) {
        this.A04 = i;
    }

    public final Object A01(int i) {
        A05();
        Object value = ((AnonymousClass8OO) this.A00.remove(i)).getValue();
        if (!this.A01.isEmpty()) {
            Iterator it = A03().entrySet().iterator();
            List list = this.A00;
            Map.Entry A0w = AnonymousClass001.A0w(it);
            list.add(new AnonymousClass8OO(this, (Comparable) A0w.getKey(), A0w.getValue()));
            it.remove();
        }
        return value;
    }

    public Object A02(Comparable comparable, Object obj) {
        A05();
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((AnonymousClass8OO) this.A00.get(A002)).setValue(obj);
        }
        A05();
        if (this.A00.isEmpty() && !(this.A00 instanceof ArrayList)) {
            this.A00 = AnonymousClass002.A0I(this.A04);
        }
        int i = -(A002 + 1);
        int i2 = this.A04;
        if (i >= i2) {
            return A03().put(comparable, obj);
        }
        if (this.A00.size() == i2) {
            AnonymousClass8OO r0 = (AnonymousClass8OO) this.A00.remove(i2 - 1);
            A03().put(r0.A01, r0.getValue());
        }
        this.A00.add(i, new AnonymousClass8OO(this, comparable, obj));
        return null;
    }

    public final SortedMap A03() {
        A05();
        if (this.A01.isEmpty() && !(this.A01 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.A01 = treeMap;
            this.A02 = treeMap.descendingMap();
        }
        return (SortedMap) this.A01;
    }

    public void clear() {
        A05();
        if (!this.A00.isEmpty()) {
            this.A00.clear();
        }
        if (!this.A01.isEmpty()) {
            this.A01.clear();
        }
    }

    public Object remove(Object obj) {
        A05();
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return A01(A002);
        }
        if (this.A01.isEmpty()) {
            return null;
        }
        return this.A01.remove(comparable);
    }
}
