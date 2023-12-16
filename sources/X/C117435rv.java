package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* renamed from: X.5rv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117435rv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5Ul A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ C624134x A03;
    public final /* synthetic */ C633138t A04;
    public final /* synthetic */ File A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        AnonymousClass5Ul r1 = this.A01;
        C95814uZ r0 = this.A02;
        File file = this.A05;
        C633138t r4 = this.A04;
        boolean z = this.A06;
        C624134x r3 = this.A03;
        boolean z2 = this.A07;
        try {
            r1.A0A((C108845de) null, r3, r4, file, (String) null, Collections.singletonList(r0), this.A00, false, z, z2);
        } catch (IOException e) {
            Log.e("SendMedia/checkSizeAndSend/e", e);
        }
    }

    public /* synthetic */ C117435rv(AnonymousClass5Ul r1, C95814uZ r2, C624134x r3, C633138t r4, File file, int i, boolean z, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = file;
        this.A04 = r4;
        this.A06 = z;
        this.A03 = r3;
        this.A07 = z2;
        this.A00 = i;
    }
}
