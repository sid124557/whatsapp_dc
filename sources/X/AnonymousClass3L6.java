package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.3L6  reason: invalid class name */
public class AnonymousClass3L6 implements C84514Cq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogFragment A01;
    public final /* synthetic */ C55662qi A02;
    public final /* synthetic */ C93314oJ A03;
    public final /* synthetic */ C624134x A04;
    public final /* synthetic */ C58932w3 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public AnonymousClass3L6(Context context, DialogFragment dialogFragment, C55662qi r3, C93314oJ r4, C624134x r5, C58932w3 r6, String str, boolean z) {
        this.A02 = r3;
        this.A01 = dialogFragment;
        this.A06 = str;
        this.A05 = r6;
        this.A07 = z;
        this.A00 = context;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void BLw() {
        this.A01.A1K();
        String str = this.A06;
        if (str != null && !str.isEmpty()) {
            this.A05.A01 = str;
        }
        if (this.A07) {
            this.A02.A03(this.A00, this.A04, this.A05);
            return;
        }
        C93314oJ r4 = this.A03;
        if (r4 != null) {
            this.A02.A01(this.A00, r4, this.A04, this.A05);
        }
    }

    public void BOQ() {
        this.A01.A1K();
    }
}
