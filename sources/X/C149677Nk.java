package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Nk  reason: invalid class name and case insensitive filesystem */
public final class C149677Nk {
    public final AnonymousClass7S1 A00;
    public final C184958sp A01;
    public final List A02;
    public final Map A03;
    public final Set A04 = AnonymousClass0x9.A17();

    public C149677Nk(AnonymousClass7S1 r3, C184958sp r4, List list, Map map) {
        this.A00 = r3;
        this.A01 = r4;
        C162457s7.A0J(list, 0);
        this.A02 = AnonymousClass002.A0J(list);
        C162457s7.A0J(map, 0);
        this.A03 = new LinkedHashMap(map);
    }
}
