package X;

import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.5Oj  reason: invalid class name and case insensitive filesystem */
public class C103775Oj {
    public float A00;
    public float A01;
    public int A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final CallGridViewModel A07;

    public void A00() {
        int i;
        int i2 = this.A05;
        int i3 = this.A06;
        int i4 = i2 + i3;
        boolean z = this.A03;
        if (z) {
            i = this.A02;
        } else {
            i = 0;
        }
        float f = this.A01;
        if (f < 0.0f) {
            i4 = (int) (((float) i4) + (((float) i3) * f));
            if (z) {
                i = (int) (((float) i) + (((float) this.A02) * f));
            }
        }
        float f2 = this.A00;
        if (f2 > 0.0f) {
            i = (int) (((float) i) + (((float) this.A04) * f2));
        }
        AnonymousClass08M r1 = this.A07.A0N;
        Object A072 = r1.A07();
        C626936e.A06(A072);
        AnonymousClass7Pi r0 = (AnonymousClass7Pi) A072;
        r0.A04 = i4;
        r0.A02 = i;
        r1.A0H(r0);
    }

    public C103775Oj(CallGridViewModel callGridViewModel, int i, int i2, int i3, int i4, boolean z) {
        this.A07 = callGridViewModel;
        this.A05 = i;
        this.A02 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A03 = z;
    }
}
