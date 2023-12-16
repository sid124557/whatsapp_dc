package X;

import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.3Em  reason: invalid class name and case insensitive filesystem */
public class C64683Em implements AnonymousClass4E2 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C55642qg A01;
    public final /* synthetic */ AnonymousClass2S3 A02;

    public C64683Em(C55642qg r1, AnonymousClass2S3 r2, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = r2;
    }

    public void BZp() {
        C55642qg r0 = this.A01;
        C69263Wi r2 = r0.A03;
        AnonymousClass4FK r1 = r0.A0G;
        Objects.requireNonNull(r1);
        C69263Wi.A03(r2, r1, 35);
    }

    public void Bdq() {
        Log.i("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeleted");
        C55642qg r6 = this.A01;
        C64663Ek r5 = r6.A0B;
        long j = this.A00;
        AnonymousClass1XQ r4 = new AnonymousClass1XQ();
        r4.A00 = true;
        r4.A01 = C18310x6.A0f(r5.A02.A0H(), j);
        C64663Ek.A05(r5, r4);
        r6.A09.A07(this);
        r6.A03.A0S(new C70193a6(this, 20, this.A02));
    }

    public void Bdr() {
        Log.e("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeletionFailed");
        C55642qg r6 = this.A01;
        C64663Ek r5 = r6.A0B;
        long j = this.A00;
        AnonymousClass1XQ r4 = new AnonymousClass1XQ();
        r4.A00 = false;
        r4.A01 = C18310x6.A0f(r5.A02.A0H(), j);
        C64663Ek.A05(r5, r4);
        r6.A09.A07(this);
        C69263Wi.A03(r6.A03, this, 36);
    }
}
