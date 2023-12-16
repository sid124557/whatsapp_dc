package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7ke  reason: invalid class name and case insensitive filesystem */
public class C158847ke {
    public final C152047Xi A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;

    public C158847ke A01(Map map, Map map2) {
        Map map3 = map2;
        Map map4 = map;
        if (map == null) {
            if (map2 == null) {
                return this;
            }
            map4 = this.A06;
        } else if (map2 == null) {
            map3 = this.A07;
        }
        return new C158847ke(this.A00, map4, this.A03, map3, this.A02, this.A01, this.A04, this.A05);
    }

    public C158847ke A00(Map map) {
        HashMap hashMap = new HashMap(this.A07);
        hashMap.putAll(map);
        return new C158847ke(this.A00, this.A06, this.A03, hashMap, this.A02, this.A01, this.A04, this.A05);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C158847ke)) {
            return false;
        }
        C158847ke r4 = (C158847ke) obj;
        if (this.A03 == r4.A03 && this.A02 == r4.A02 && this.A06 == r4.A06 && this.A07.equals(r4.A07) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A04 == r4.A04 && this.A05 == r4.A05) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (AnonymousClass6CA.A05(this.A00, (((this.A06.hashCode() ^ this.A03.hashCode()) ^ this.A07.hashCode()) ^ this.A02.hashCode()) ^ this.A01.hashCode()) ^ this.A04.hashCode()) ^ this.A05.hashCode();
    }

    public C158847ke(C152047Xi r1, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7) {
        this.A06 = map;
        this.A03 = map2;
        this.A07 = map3;
        this.A02 = map4;
        this.A01 = map5;
        this.A00 = r1;
        this.A04 = map6;
        this.A05 = map7;
    }

    public C158847ke() {
        this.A06 = Collections.emptyMap();
        this.A03 = Collections.emptyMap();
        this.A07 = Collections.emptyMap();
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyMap();
        this.A00 = AnonymousClass73J.A00(Collections.emptyMap());
        this.A04 = Collections.emptyMap();
        this.A05 = Collections.emptyMap();
    }
}
