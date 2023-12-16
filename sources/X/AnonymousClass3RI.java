package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import java.io.ByteArrayInputStream;

/* renamed from: X.3RI  reason: invalid class name */
public final class AnonymousClass3RI implements AnonymousClass668 {
    public final AnonymousClass668 A00;
    public final String A01;
    public final /* synthetic */ C102675Jv A02;

    public void BS4(AnonymousClass583 r2) {
        C162457s7.A0J(r2, 0);
        this.A00.BS4(r2);
    }

    public AnonymousClass3RI(AnonymousClass668 r1, C102675Jv r2, String str) {
        this.A02 = r2;
        this.A01 = str;
        this.A00 = r1;
    }

    public void BdK(byte[] bArr) {
        String A04;
        C102045Hg r5 = this.A02.A02;
        String str = this.A01;
        ByteArrayInputStream A0d = AnonymousClass0x9.A0d(bArr);
        int dimensionPixelSize = C54292oU.A00(r5.A00).getDimensionPixelSize(R.dimen.f6nameremoved);
        Bitmap bitmap = C107245ax.A04((AnonymousClass5QA) null, new AnonymousClass5WB(dimensionPixelSize, dimensionPixelSize), A0d, false).A02;
        if (!(bitmap == null || (A04 = C627236i.A04(str)) == null)) {
            ((AnonymousClass30R) r5.A01.getValue()).A03(bitmap, A04);
        }
        this.A00.BdK(bArr);
    }
}
