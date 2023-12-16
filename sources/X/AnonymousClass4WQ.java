package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4WQ  reason: invalid class name */
public final class AnonymousClass4WQ extends AnonymousClass0R6 {
    public Bitmap A00;
    public List A01;
    public final C179098ib A02;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new AnonymousClass4YN(C18300x5.A0F(C86604Kt.A0E(viewGroup, 0), viewGroup, R.layout.f8nameremoved));
    }

    public int A0G() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r6, int i) {
        AnonymousClass4YN r62 = (AnonymousClass4YN) r6;
        C162457s7.A0J(r62, 0);
        AnonymousClass3ZL r4 = (AnonymousClass3ZL) this.A01.get(i);
        Bitmap bitmap = this.A00;
        C179098ib r2 = this.A02;
        StringBuilder A0g = C18280x3.A0g(r4, 0);
        A0g.append('/');
        r62.A01.setText(AnonymousClass000.A0X(r4.A01, A0g));
        r62.A02.setText(r4.A00);
        r62.A00.setImageBitmap(bitmap);
        C109725f5.A00(r62.A0H, r2, r62, r4, 8);
    }

    public AnonymousClass4WQ(Bitmap bitmap, C179098ib r2, List list) {
        this.A01 = list;
        this.A00 = bitmap;
        this.A02 = r2;
    }
}
