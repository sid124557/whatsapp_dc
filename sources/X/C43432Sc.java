package X;

import java.util.List;

/* renamed from: X.2Sc  reason: invalid class name and case insensitive filesystem */
public class C43432Sc {
    public C835248t A00;
    public String A01;
    public List A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C43432Sc(AnonymousClass84O r5) {
        List<AnonymousClass84O> A0S;
        String str = "";
        this.A05 = r5 != null ? r5.A0P(38, str) : str;
        this.A03 = r5 != null ? r5.A0P(45, str) : str;
        this.A04 = r5 != null ? r5.A0P(46, str) : str;
        C835248t r1 = null;
        this.A01 = r5 != null ? r5.A0O(42) : null;
        this.A00 = r5 != null ? r5.A0L(43) : r1;
        if (r5 != null && (A0S = r5.A0S(44)) != null) {
            this.A02 = AnonymousClass001.A0s();
            for (AnonymousClass84O r2 : A0S) {
                this.A02.add(new AnonymousClass2PA(r2));
            }
        }
    }
}
