package X;

/* renamed from: X.4Jf  reason: invalid class name and case insensitive filesystem */
public class C86204Jf implements C84134Bd {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public final void AwB(Object obj) {
        Object obj2;
        int i;
        Object obj3;
        Object obj4 = obj;
        int i2 = this.A04;
        Object obj5 = this.A01;
        if (i2 != 0) {
            long j = this.A00;
            AnonymousClass3QO r4 = (AnonymousClass3QO) this.A02;
            C49322gL r2 = (C49322gL) this.A03;
            Integer num = (Integer) obj4;
            int intValue = num.intValue();
            ((C43832Tq) obj5).A0A.remove(Long.valueOf(j));
            AnonymousClass2QG r3 = (AnonymousClass2QG) r4.A09.A01();
            if (r3 != null && !r3.A02.get()) {
                r3.A01.delete();
            }
            C149897Oi A022 = r4.A02();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("XFamilyCrosspostMediaUploadManager/enqueueUploadImpl MediaJobFinished result: ");
            if (A022 != null) {
                obj3 = Integer.valueOf(A022.A00);
            } else {
                obj3 = "null";
            }
            C106245Ye.A00(AnonymousClass000.A0R(obj3, A0o));
            if ((A022 == null || A022.A01.A04.A0A == null) && (intValue == 17 || intValue == 22 || intValue == 13 || intValue == 33 || intValue == 25)) {
                r2.A01.A00(num, 3, -1, j);
                return;
            }
            if (A022 != null) {
                int i3 = A022.A00;
                if (i3 != 1 && i3 != 32) {
                    if (i3 == 0) {
                        String A032 = A022.A02.A03();
                        if (A032 == null || A032.length() == 0) {
                            r2.A01((Integer) null, -10, j);
                            return;
                        } else {
                            r2.A00(j, A032);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            r2.A01(num, -11, j);
            return;
        }
        long j2 = this.A00;
        AnonymousClass3QO r6 = (AnonymousClass3QO) this.A02;
        C49302gJ r5 = (C49302gJ) this.A03;
        int intValue2 = ((Integer) obj4).intValue();
        ((C43902Tx) obj5).A0B.remove(Long.valueOf(j2));
        AnonymousClass2QG r42 = (AnonymousClass2QG) r6.A09.A01();
        if (r42 != null && !r42.A02.get()) {
            r42.A01.delete();
        }
        C149897Oi A023 = r6.A02();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("CrosspostMediaUploadManager/enqueueUploadImpl MediaJobFinished result: ");
        if (A023 != null) {
            obj2 = Integer.valueOf(A023.A00);
        } else {
            obj2 = "null";
        }
        AnonymousClass356.A01(AnonymousClass000.A0R(obj2, A0o2));
        if ((A023 == null || A023.A01.A04.A0A == null) && (intValue2 == 17 || intValue2 == 22 || intValue2 == 13 || intValue2 == 33 || intValue2 == 25)) {
            r5.A01.A00(3, j2, -1);
            return;
        }
        if (A023 != null) {
            int i4 = A023.A00;
            if (i4 != 1 && i4 != 32) {
                if (i4 == 0) {
                    String A033 = A023.A02.A03();
                    if (A033 == null || A033.length() == 0) {
                        i = -10;
                        r5.A00(i, j2);
                    }
                    r5.A01(j2, A033);
                    return;
                }
            } else {
                return;
            }
        }
        i = -11;
        r5.A00(i, j2);
    }

    public C86204Jf(Object obj, Object obj2, Object obj3, int i, long j) {
        this.A04 = i;
        this.A01 = obj3;
        this.A00 = j;
        this.A02 = obj;
        this.A03 = obj2;
    }
}
