package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.6Ja  reason: invalid class name and case insensitive filesystem */
public abstract class C125696Ja extends Timeline {
    public final int A00;
    public final C186088uj A01;

    public int A0A(int i) {
        if (this instanceof AnonymousClass6JO) {
            return i * ((AnonymousClass6JO) this).A01;
        }
        return ((AnonymousClass6JP) this).A04[i];
    }

    public Timeline A0B(int i) {
        if (this instanceof AnonymousClass6JO) {
            return ((AnonymousClass6JO) this).A03;
        }
        return ((AnonymousClass6JP) this).A06[i];
    }

    public C125696Ja(C186088uj r2) {
        this.A01 = r2;
        this.A00 = r2.getLength();
    }
}
