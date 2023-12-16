package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Qo  reason: invalid class name and case insensitive filesystem */
public class C04760Qo {
    public AnonymousClass08T A00;
    public final ArrayList A01 = AnonymousClass001.A0s();
    public final HashMap A02 = AnonymousClass001.A0t();
    public final HashMap A03 = AnonymousClass001.A0t();

    public static Iterator A00(C08270df r0) {
        return r0.A0Y.A05().iterator();
    }

    public static Iterator A01(C04760Qo r0) {
        return r0.A02.values().iterator();
    }

    public C08310eF A02(String str) {
        AnonymousClass0WE r0 = (AnonymousClass0WE) this.A02.get(str);
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public List A05() {
        ArrayList A0J;
        ArrayList arrayList = this.A01;
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList) {
            A0J = AnonymousClass002.A0J(arrayList);
        }
        return A0J;
    }

    public void A06(C08310eF r3) {
        ArrayList arrayList = this.A01;
        if (!arrayList.contains(r3)) {
            synchronized (arrayList) {
                arrayList.add(r3);
            }
            r3.A0W = true;
            return;
        }
        throw AnonymousClass000.A0H(r3, "Fragment already added: ", AnonymousClass001.A0o());
    }

    public void A07(AnonymousClass0WE r4) {
        C08310eF r2 = r4.A02;
        String str = r2.A0V;
        HashMap hashMap = this.A02;
        if (hashMap.get(str) == null) {
            hashMap.put(r2.A0V, r4);
            if (C08270df.A04()) {
                AnonymousClass000.A1K(AnonymousClass001.A0o(), "Added fragment to active set ", r2);
            }
        }
    }

    public void A08(AnonymousClass0WE r5) {
        C08310eF r3 = r5.A02;
        if (r3.A0k) {
            this.A00.A0D(r3);
        }
        if (this.A02.put(r3.A0V, (Object) null) != null && C08270df.A04()) {
            AnonymousClass000.A1K(AnonymousClass001.A0o(), "Removed fragment from active set ", r3);
        }
    }

    public C08310eF A03(String str) {
        C08310eF A0O;
        Iterator A012 = A01(this);
        while (A012.hasNext()) {
            AnonymousClass0WE r0 = (AnonymousClass0WE) A012.next();
            if (r0 != null && (A0O = r0.A02.A0O(str)) != null) {
                return A0O;
            }
        }
        return null;
    }

    public List A04() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A012 = A01(this);
        while (A012.hasNext()) {
            Object next = A012.next();
            if (next != null) {
                A0s.add(next);
            }
        }
        return A0s;
    }
}
