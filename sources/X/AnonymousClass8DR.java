package X;

/* renamed from: X.8DR  reason: invalid class name */
public class AnonymousClass8DR implements C181478mp {
    public boolean B2l(C159187lJ r3, C159187lJ r4, AnonymousClass7MS r5) {
        if (r3 instanceof C131426dZ) {
            boolean booleanValue = ((C131426dZ) r3).A00.booleanValue();
            if (r4 instanceof C131426dZ) {
                return AnonymousClass000.A1U(booleanValue ? 1 : 0, ((C131426dZ) r4).A00.booleanValue() ? 1 : 0);
            }
            throw C131316dO.A00("Expected boolean node");
        } else if (r4 instanceof C131426dZ) {
            throw C131316dO.A00("Expected boolean node");
        } else {
            throw new C173678Re("Failed to evaluate exists expression");
        }
    }
}
