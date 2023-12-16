package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Ub  reason: invalid class name and case insensitive filesystem */
public final class C151267Ub {
    public C155007e8 A00;
    public final C154707dc A01;
    public final C158847ke A02;
    public final AnonymousClass7SC A03;
    public final C154997e7 A04;
    public final AnonymousClass7K6 A05;
    public final AnonymousClass7K6 A06;
    public final C184958sp A07;
    public final C835348u A08;
    public final String A09;
    public final List A0A = AnonymousClass001.A0s();
    public final Map A0B = AnonymousClass001.A0t();
    public final Map A0C;
    public final Set A0D;

    public C151267Ub(C154707dc r5, C158847ke r6, AnonymousClass7SC r7, C154997e7 r8, AnonymousClass7P6 r9, C155007e8 r10, C184958sp r11, C835348u r12, String str) {
        this.A08 = r12;
        this.A00 = r10;
        this.A09 = str;
        this.A01 = r5;
        this.A04 = r8;
        this.A02 = r6;
        this.A03 = r7;
        this.A07 = r11;
        if (r9 != null) {
            AnonymousClass7K6 r1 = r9.A00;
            this.A06 = new AnonymousClass7K6(r1);
            this.A05 = r1;
            this.A0C = r9.A05;
            this.A0D = AnonymousClass002.A0K();
            Iterator A0q = AnonymousClass000.A0q(r9.A04);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                Object key = A0w.getKey();
                if (!AnonymousClass736.A00(A0w.getValue(), r6.A07.get(key))) {
                    this.A0D.add(key);
                }
            }
            return;
        }
        this.A06 = new AnonymousClass7K6((AnonymousClass7K6) null);
        this.A05 = new AnonymousClass7K6((AnonymousClass7K6) null);
        this.A0C = Collections.emptyMap();
    }
}
