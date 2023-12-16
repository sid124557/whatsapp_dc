package X;

import com.whatsapp.privacy.protocol.xmpp.DisclosureGetStageByIdsWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureMetadataGetWorker;
import com.whatsapp.privacy.protocol.xmpp.DisclosureResultSendWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2lk  reason: invalid class name and case insensitive filesystem */
public class C52602lk {
    public final C34171uL A00;
    public volatile int A01 = 0;
    public volatile int A02;

    public void A01(boolean z, int i) {
        Log.d("PrivacyDisclosureSender/getDisclosureMetadata");
        AnonymousClass0Q9 r1 = new AnonymousClass0Q9();
        r1.A01("disclosure_id", i);
        AnonymousClass0Xq A002 = r1.A00();
        AnonymousClass0XS A07 = C18270x1.A07();
        AnonymousClass0Aw r4 = new AnonymousClass0Aw(DisclosureMetadataGetWorker.class);
        r4.A06("tag.whatsapp.privacy.GetDisclosureMetadata");
        r4.A00.A0B = A002;
        AnonymousClass0FN r3 = AnonymousClass0FN.EXPONENTIAL;
        if (z) {
            r4.A03(r3, TimeUnit.SECONDS, 10);
            r4.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
        } else {
            r4.A03(r3, TimeUnit.MINUTES, 30);
            r4.A04(A07);
        }
        C01460Ay A0I = AnonymousClass0x9.A0I(r4);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("tag.whatsapp.privacy.GetDisclosureMetadata.");
        String A0h = AnonymousClass000.A0h(A0o, this.A01);
        this.A01++;
        if (this.A01 > 1000) {
            this.A01 = 0;
        }
        C72333dY.A07(A0I, this.A00, A0h);
    }

    public void A02(int[] iArr) {
        Log.d("PrivacyDisclosureSender/getDisclosureStageByIds");
        AnonymousClass0Q9 r1 = new AnonymousClass0Q9();
        r1.A02("disclosure_ids", iArr);
        AnonymousClass0Xq A002 = r1.A00();
        AnonymousClass0XS A07 = C18270x1.A07();
        AnonymousClass0Aw r4 = new AnonymousClass0Aw(DisclosureGetStageByIdsWorker.class);
        r4.A06("tag.whatsapp.privacy.GetDisclosureStageByIds");
        r4.A00.A0B = A002;
        r4.A04(A07);
        r4.A03(AnonymousClass0FN.EXPONENTIAL, TimeUnit.MINUTES, 30);
        C01460Ay A0I = AnonymousClass0x9.A0I(r4);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("tag.whatsapp.privacy.GetDisclosureStageByIds.");
        String A0h = AnonymousClass000.A0h(A0o, this.A01);
        this.A01++;
        if (this.A01 > 1000) {
            this.A01 = 0;
        }
        C72333dY.A07(A0I, this.A00, A0h);
    }

    public C52602lk(C34171uL r2) {
        this.A00 = r2;
    }

    public void A00(int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosureSender/sendDisclosureResult/disclosure id: ");
        A0o.append(i);
        C18260x0.A0w(" result: ", A0o, i2);
        AnonymousClass0Q9 r1 = new AnonymousClass0Q9();
        r1.A01("disclosure_id", i);
        r1.A01("result", i2);
        C01460Ay A0P = C18290x4.A0P(C18270x1.A07(), r1.A00(), new AnonymousClass0Aw(DisclosureResultSendWorker.class), "tag.whatsapp.privacy.SendDisclosureResult");
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("tag.whatsapp.privacy.SendDisclosureResult.");
        A0o2.append(i);
        C72333dY.A07(A0P, this.A00, AnonymousClass000.A0Y(".", A0o2, i2));
    }
}
