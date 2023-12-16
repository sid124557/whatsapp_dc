package X;

/* renamed from: X.4KN  reason: invalid class name */
public class AnonymousClass4KN implements C84964Ek {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4KN(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A03 = obj3;
        this.A00 = obj4;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void BQp() {
        C69263Wi r3;
        Object obj;
        Object obj2;
        int i;
        if (this.A04 != 0) {
            AnonymousClass356.A02("UnlinkActionIqHelper/Iq delivery fail");
            r3 = ((C34691vZ) this.A03).A00;
            obj = this.A00;
            obj2 = this.A01;
            i = 30;
        } else {
            AnonymousClass356.A02("LinkActionIqHelper/Iq delivery fail");
            r3 = ((C34681vY) this.A03).A00;
            obj = this.A00;
            obj2 = this.A01;
            i = 27;
        }
        C69263Wi.A07(r3, obj, obj2, i);
    }

    public void BSC(Exception exc, Integer num) {
        C69263Wi r3;
        Object obj;
        Object obj2;
        int i;
        int i2 = this.A04;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i2 != 0) {
            C18280x3.A1I(A0o, "UnlinkActionIqHelper/Iq sent error with code ", num);
            AnonymousClass356.A04(A0o.toString(), exc);
            r3 = ((C34691vZ) this.A03).A00;
            obj = this.A00;
            obj2 = this.A01;
            i = 30;
        } else {
            C18280x3.A1I(A0o, "LinkActionIqHelper/Iq sent error with code ", num);
            AnonymousClass356.A04(A0o.toString(), exc);
            r3 = ((C34681vY) this.A03).A00;
            obj = this.A00;
            obj2 = this.A01;
            i = 27;
        }
        C69263Wi.A07(r3, obj, obj2, i);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C69263Wi r3;
        Object obj2;
        Object obj3;
        int i;
        int i2 = this.A04;
        boolean A1Z = AnonymousClass001.A1Z(obj);
        if (i2 != 0) {
            if (A1Z) {
                r3 = ((C34691vZ) this.A03).A00;
                obj2 = this.A00;
                obj3 = this.A02;
                i = 29;
            } else {
                return;
            }
        } else if (A1Z) {
            r3 = ((C34681vY) this.A03).A00;
            obj2 = this.A00;
            obj3 = this.A02;
            i = 28;
        } else {
            return;
        }
        C69263Wi.A07(r3, obj2, obj3, i);
    }
}
