package X;

/* renamed from: X.1mQ  reason: invalid class name and case insensitive filesystem */
public class C30421mQ extends C624134x implements AnonymousClass4B9, AnonymousClass4BA {
    public String A00;
    public String A01;
    public C42032Mn A02;

    public C30421mQ(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 4, j);
        this.A02 = 0;
    }

    public /* bridge */ /* synthetic */ C624134x Az2(AnonymousClass2z0 r7, long j) {
        return new C30421mQ(r7, this, j, false);
    }

    public /* bridge */ /* synthetic */ C624134x Az3(AnonymousClass2z0 r7) {
        return new C30421mQ(r7, this, this.A0K, true);
    }

    public void A1Z(String str) {
        synchronized (this.A1K) {
            super.A1Z(str);
            this.A01 = str;
        }
    }

    public String A1v() {
        String str;
        synchronized (this.A1K) {
            str = this.A01;
        }
        return str;
    }

    public void A1w(String str) {
        synchronized (this.A1K) {
            this.A01 = str;
            this.A02 = null;
            super.A1Z(str);
        }
    }

    public C30421mQ(AnonymousClass2z0 r8, C30421mQ r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A02 = 0;
        this.A00 = r9.A00;
        this.A01 = r9.A1v();
    }
}
