package X;

/* renamed from: X.803  reason: invalid class name */
public final class AnonymousClass803 implements C15790rw {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass33p A02;

    public AnonymousClass803(AnonymousClass33p r5) {
        C162457s7.A0J(r5, 1);
        this.A02 = r5;
        C183538qC r3 = r5.A01;
        this.A00 = C18300x5.A0B(r3).getBoolean("detect_device_foldable", false);
        this.A01 = C18300x5.A0B(r3).getBoolean("detect_device_foldable_bookmode", false);
    }

    public /* bridge */ /* synthetic */ void AwB(Object obj) {
        C17330vM r2;
        AnonymousClass0P8 r6 = (AnonymousClass0P8) obj;
        AnonymousClass0TV r3 = null;
        if (r6 != null) {
            r2 = AnonymousClass74V.A00(r6);
        } else {
            r2 = null;
        }
        if (!this.A00 && r2 != null) {
            this.A00 = true;
            C18270x1.A0l(C18270x1.A03(this.A02), "detect_device_foldable", true);
        }
        if (!this.A01) {
            if (r2 != null) {
                AnonymousClass0Pg r32 = ((C08880fG) r2).A00;
                if (r32.A02 - r32.A01 > r32.A00 - r32.A03) {
                    r3 = AnonymousClass0TV.A01;
                } else {
                    r3 = AnonymousClass0TV.A02;
                }
            }
            if (C162457s7.A0P(r3, AnonymousClass0TV.A02)) {
                this.A01 = true;
                C18270x1.A0l(C18270x1.A03(this.A02), "detect_device_foldable_bookmode", true);
            }
        }
    }
}
