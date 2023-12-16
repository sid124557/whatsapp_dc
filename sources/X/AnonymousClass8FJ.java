package X;

import java.util.List;

/* renamed from: X.8FJ  reason: invalid class name */
public class AnonymousClass8FJ implements C184248rU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C112305jW A02;
    public final /* synthetic */ C109065e1 A03;
    public final /* synthetic */ List A04;

    public AnonymousClass8FJ(C112305jW r1, C109065e1 r2, List list, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = list;
    }

    public void BWV() {
        C112305jW r4 = this.A02;
        AnonymousClass5LW r3 = r4.A0B;
        r3.A03 = 4;
        AnonymousClass7TY r2 = new AnonymousClass7TY(this.A03, this.A00);
        r3.A07 = r2;
        r2.A00(this.A04, this.A01);
        r4.A06();
    }

    public void BYw(Integer num, Integer num2, Integer num3, Integer num4) {
        C112305jW r4 = this.A02;
        AnonymousClass5LW r3 = r4.A0B;
        r3.A03 = 3;
        AnonymousClass7TY r2 = new AnonymousClass7TY(this.A03, this.A00);
        r3.A07 = r2;
        r2.A00(this.A04, this.A01);
        r3.A09 = num2;
        r3.A0C = num3;
        r3.A0B = num4;
        r3.A0A = num;
        r4.A06();
    }
}
