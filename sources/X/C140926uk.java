package X;

/* renamed from: X.6uk  reason: invalid class name and case insensitive filesystem */
public enum C140926uk {
    A00(0),
    A02(1),
    A01(2),
    A03(3),
    A06(5),
    A07(6),
    A08(7),
    A09(8),
    A04(9),
    A0A(10),
    A0B(11),
    A05(12);
    
    public final C160347nU mHttpPriority;

    /* access modifiers changed from: public */
    static {
        A00 = new C140926uk(new C160347nU((byte) 3, true), "DEFAULT", 0);
        A02 = new C140926uk(new C160347nU((byte) 4, false), "PREFETCH", 1);
        A01 = new C140926uk(new C160347nU((byte) 3, false), "IMPORTANT_PREFETCH", 2);
        A03 = new C140926uk(new C160347nU((byte) 4, true), "PREFETCH_INCREMENTAL", 3);
        new C140926uk(new C160347nU((byte) 3, true), "IMPORTANT_PREFETCH_INCREMENTAL", 4);
        A06 = new C140926uk(new C160347nU((byte) 5, false), "UNIMPORTANT_PREFETCH", 5);
        A07 = new C140926uk(new C160347nU((byte) 5, true), "UNIMPORTANT_PREFETCH_INCREMENTAL", 6);
        A08 = new C140926uk(new C160347nU((byte) 6, false), "VERY_UNIMPORTANT_PREFETCH", 7);
        A09 = new C140926uk(new C160347nU((byte) 6, true), "VERY_UNIMPORTANT_PREFETCH_INCREMENTAL", 8);
        A04 = new C140926uk(new C160347nU((byte) 0, false), "STREAMING", 9);
        A0A = new C140926uk(new C160347nU((byte) 2, false), "WARMUP", 10);
        A0B = new C140926uk(new C160347nU((byte) 2, true), "WARMUP_INCREMENTAL", 11);
        A05 = new C140926uk(new C160347nU((byte) 0, true), "STREAMING_INCREMENTAL", 12);
    }

    /* access modifiers changed from: public */
    C140926uk(int i) {
        this.mHttpPriority = r1;
    }
}
