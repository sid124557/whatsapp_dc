package X;

import android.view.View;
import com.whatsapp.WaImageButton;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.548  reason: invalid class name */
public class AnonymousClass548 extends C109665ez {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass548(AnonymousClass4Ro r1, WaImageButton waImageButton, List list, int i, int i2) {
        this.A04 = i2;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = list;
        this.A02 = waImageButton;
    }

    public void A07(View view) {
        int i = this.A04;
        AnonymousClass4Ro r3 = (AnonymousClass4Ro) this.A01;
        int i2 = this.A00;
        if (i != 0) {
            r3.A01 = i2;
            Iterator A0q = C18320x8.A0q(this.A03);
            while (A0q.hasNext()) {
                C86654Ky.A0H(A0q).setSelected(false);
            }
        } else {
            r3.A00 = i2;
            Iterator A0q2 = C18320x8.A0q(this.A03);
            while (A0q2.hasNext()) {
                C86654Ky.A0H(A0q2).setSelected(false);
            }
        }
        ((View) this.A02).setSelected(true);
        r3.A04();
    }
}
