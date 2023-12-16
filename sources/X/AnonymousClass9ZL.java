package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9ZL  reason: invalid class name */
public final class AnonymousClass9ZL implements C184818sb {
    public C185558ts A00;
    public final C194729Ug A01;
    public final C183758qb A02;
    public final C185568tt A03;
    public final HashMap A04 = AnonymousClass001.A0t();

    public boolean A00() {
        C194729Ug r2 = this.A01;
        AnonymousClass9LF r0 = C194729Ug.A0B;
        Object obj = Boolean.FALSE;
        Map map = r2.A00;
        Object obj2 = map.get(r0);
        if (obj2 != null) {
            obj = obj2;
        }
        C162457s7.A0D(obj);
        if (AnonymousClass001.A1Z(obj)) {
            AnonymousClass9LF r02 = C194729Ug.A0D;
            Object obj3 = Boolean.FALSE;
            Object obj4 = map.get(r02);
            if (obj4 != null) {
                obj3 = obj4;
            }
            C162457s7.A0D(obj3);
            if (!AnonymousClass001.A1Z(obj3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C183758qb B0U() {
        C194729Ug r0 = this.A01;
        AnonymousClass9ZD r3 = new AnonymousClass9ZD(r0);
        AnonymousClass9LF r2 = C194729Ug.A07;
        Object obj = Boolean.FALSE;
        Object obj2 = r0.A00.get(r2);
        if (obj2 != null) {
            obj = obj2;
        }
        C162457s7.A0D(obj);
        r3.A02 = AnonymousClass001.A1Z(obj);
        return r3;
    }

    public boolean BsB() {
        C194729Ug r0 = this.A01;
        AnonymousClass9LF r2 = C194729Ug.A0C;
        Object obj = Boolean.FALSE;
        Object obj2 = r0.A00.get(r2);
        if (obj2 != null) {
            obj = obj2;
        }
        C162457s7.A0D(obj);
        return AnonymousClass001.A1Z(obj);
    }

    public AnonymousClass9ZL(C194729Ug r2, C185568tt r3) {
        C183758qb r0;
        this.A03 = r3;
        this.A01 = r2;
        if (BsB()) {
            r0 = B0U();
        } else {
            r0 = null;
        }
        this.A02 = r0;
    }

    public C183758qb B5z() {
        return this.A02;
    }
}
