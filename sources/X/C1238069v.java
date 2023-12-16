package X;

/* renamed from: X.69v  reason: invalid class name and case insensitive filesystem */
public class C1238069v implements AnonymousClass64K {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1238069v(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void B29(boolean z) {
        int i = this.A02;
        Object obj = this.A00;
        if (i != 0) {
            ((AnonymousClass5Q7) obj).A00.BkS(new C117105rO(this.A01, 38));
            return;
        }
        AnonymousClass64K r4 = (AnonymousClass64K) this.A01;
        C186568vZ r3 = ((AnonymousClass5TE) obj).A04.A01;
        r3.markerPoint(551491402, "RETRIEVE_ASYNC_ACTION");
        if (!z) {
            r3.BKg("LOAD_ERROR", 551491402, 87);
        }
        r4.B29(z);
    }
}
