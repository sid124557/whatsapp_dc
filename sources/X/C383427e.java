package X;

/* renamed from: X.27e  reason: invalid class name and case insensitive filesystem */
public final class C383427e {
    public static final int A00(C56982ss r6, AnonymousClass1VX r7, C624134x r8) {
        AnonymousClass1RL r1;
        C18260x0.A0Q(r6, r7);
        AnonymousClass31A A0A = r6.A0A(r8.A1J.A00, false);
        if ((A0A instanceof AnonymousClass1RL) && (r1 = (AnonymousClass1RL) A0A) != null) {
            long j = r1.A05;
            if (j > 1) {
                return AnonymousClass0x9.A1C().nextInt((int) (Math.log10((double) j) * ((double) r7.A0O(C58422vE.A02, 4369))));
            }
        }
        return 0;
    }
}
