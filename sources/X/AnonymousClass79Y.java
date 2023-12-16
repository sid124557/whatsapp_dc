package X;

/* renamed from: X.79Y  reason: invalid class name */
public final class AnonymousClass79Y {
    public static final int A00;
    public static final int A01;
    public static final AnonymousClass2XH A02 = new AnonymousClass2XH("BROKEN");
    public static final AnonymousClass2XH A03 = new AnonymousClass2XH("CANCELLED");
    public static final AnonymousClass2XH A04 = new AnonymousClass2XH("PERMIT");
    public static final AnonymousClass2XH A05 = new AnonymousClass2XH("TAKEN");

    static {
        long j = (long) 1;
        long j2 = (long) Integer.MAX_VALUE;
        A00 = (int) AnonymousClass2AS.A00("kotlinx.coroutines.semaphore.maxSpinCycles", (long) 100, j, j2);
        A01 = (int) AnonymousClass2AS.A00("kotlinx.coroutines.semaphore.segmentSize", (long) 16, j, j2);
    }
}
