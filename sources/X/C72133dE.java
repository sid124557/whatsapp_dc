package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.3dE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72133dE implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass2z0 A02;
    public final /* synthetic */ C42612Ov A03;
    public final /* synthetic */ C42612Ov A04;
    public final /* synthetic */ AnonymousClass39T A05;
    public final /* synthetic */ C47642da A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;

    public final Object call() {
        C47642da r1 = this.A06;
        AnonymousClass2z0 r3 = this.A02;
        byte[] bArr = this.A08;
        int i = this.A00;
        byte[] bArr2 = this.A09;
        C42612Ov r4 = this.A03;
        C42612Ov r5 = this.A04;
        boolean z = this.A07;
        return r1.A00(DeviceJid.of(this.A05.A02), r3, r4, r5, bArr, bArr2, i, this.A01, z);
    }

    public /* synthetic */ C72133dE(AnonymousClass2z0 r1, C42612Ov r2, C42612Ov r3, AnonymousClass39T r4, C47642da r5, byte[] bArr, byte[] bArr2, int i, int i2, boolean z) {
        this.A06 = r5;
        this.A02 = r1;
        this.A08 = bArr;
        this.A00 = i;
        this.A09 = bArr2;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = z;
        this.A01 = i2;
        this.A05 = r4;
    }
}
