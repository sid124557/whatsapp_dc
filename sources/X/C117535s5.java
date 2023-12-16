package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.5s5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117535s5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass33C A02;
    public final /* synthetic */ C185388tZ A03;
    public final /* synthetic */ AnonymousClass5Ul A04;
    public final /* synthetic */ C108845de A05;
    public final /* synthetic */ C624134x A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ byte[] A0A;

    public final void run() {
        byte b;
        AnonymousClass5Ul r5 = this.A04;
        List list = this.A08;
        AnonymousClass33C r8 = this.A02;
        int i = this.A01;
        boolean z = this.A09;
        String str = this.A07;
        C624134x r10 = this.A06;
        C108845de r9 = this.A05;
        int i2 = this.A00;
        byte[] bArr = this.A0A;
        C55972rD r6 = r5.A0D;
        if (i == 1) {
            b = 81;
        } else {
            b = 3;
            if (z) {
                b = 13;
            }
        }
        AnonymousClass30M A002 = r6.A00((Uri) null, r8, r9, r10, str, list, (List) null, (List) null, b, 0, 0, false);
        A002.A00 = i2;
        r5.A02.A02(A002, (AnonymousClass65N) null, (C30471mV) null, (Integer) null, bArr, false, false, false);
    }

    public /* synthetic */ C117535s5(AnonymousClass33C r1, C185388tZ r2, AnonymousClass5Ul r3, C108845de r4, C624134x r5, String str, List list, byte[] bArr, int i, int i2, boolean z) {
        this.A04 = r3;
        this.A08 = list;
        this.A02 = r1;
        this.A01 = i;
        this.A09 = z;
        this.A07 = str;
        this.A06 = r5;
        this.A05 = r4;
        this.A00 = i2;
        this.A0A = bArr;
        this.A03 = r2;
    }
}
