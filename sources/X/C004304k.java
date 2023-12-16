package X;

import java.util.HashMap;

/* renamed from: X.04k  reason: invalid class name and case insensitive filesystem */
public class C004304k extends C10610iE {
    public HashMap A00 = AnonymousClass001.A0t();

    public C13540nL A00(Object obj) {
        return (C13540nL) this.A00.get(obj);
    }

    public Object A01(Object obj) {
        Object A01 = super.A01(obj);
        this.A00.remove(obj);
        return A01;
    }

    public Object A02(Object obj, Object obj2) {
        C13540nL A002 = A00(obj);
        if (A002 != null) {
            return A002.A03;
        }
        HashMap hashMap = this.A00;
        C13540nL r1 = new C13540nL(obj, obj2);
        this.A00++;
        C13540nL r0 = this.A01;
        if (r0 == null) {
            this.A02 = r1;
        } else {
            r0.A00 = r1;
            r1.A01 = r0;
        }
        this.A01 = r1;
        hashMap.put(obj, r1);
        return null;
    }
}
