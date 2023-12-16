package X;

import com.whatsapp.xfamily.crossposting.snackbar.CrosspostSnackbarManager$displaySnackBar$1$1;
import java.lang.ref.Reference;

/* renamed from: X.5rs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117405rs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C109665ez A02;
    public final /* synthetic */ C105945Xa A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        C1228966g r3;
        C105945Xa r5 = this.A03;
        String str = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        C109665ez r4 = this.A02;
        boolean z = this.A05;
        C162457s7.A0J(str, 1);
        Reference reference = (Reference) r5.A03.A00.get(str);
        if (reference != null && (r3 = (C1228966g) reference.get()) != null) {
            if (r3.B6S().A00(AnonymousClass0GC.STARTED)) {
                C110065fd A002 = r5.A00(r4, str, i, i2);
                if (A002 != null) {
                    A002.A01();
                }
            } else if (z) {
                r3.getLifecycle().A00(new CrosspostSnackbarManager$displaySnackBar$1$1(r3, r4, r5, str, i, i2));
            }
        }
    }

    public /* synthetic */ C117405rs(C109665ez r1, C105945Xa r2, String str, int i, int i2, boolean z) {
        this.A03 = r2;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A05 = z;
    }
}
