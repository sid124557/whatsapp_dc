package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.io.File;
import java.util.List;
import java.util.Set;

/* renamed from: X.7ai  reason: invalid class name and case insensitive filesystem */
public class C153127ai {
    public int A00 = Integer.MAX_VALUE;
    public AnonymousClass1LX A01;
    public boolean A02 = false;
    public final C69263Wi A03;
    public final C56492s4 A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass4FV A08;
    public final C55002pd A09;
    public final C29011i8 A0A;
    public final Set A0B;

    public void A02(AnonymousClass8EI r3) {
        r3.A03 = true;
        AnonymousClass1LX r0 = this.A01;
        if (r0 != null) {
            r0.A01(r3);
        }
        List list = r3.A02;
        if (list != null && list.size() > 0) {
            for (AnonymousClass8EI A022 : r3.A02) {
                A02(A022);
            }
        }
    }

    public void A00() {
        File A0A2 = AnonymousClass002.A0A(this.A06.A00.getCacheDir(), "linked_account_images");
        AnonymousClass8EE r3 = new AnonymousClass8EE(this.A00);
        C56612sH r4 = this.A05;
        AnonymousClass1VX r5 = this.A07;
        AnonymousClass1LX r0 = new AnonymousClass1LX(this.A03, this.A04, r3, r4, r5, this.A08, this.A09, this.A0A, A0A2, "linked-account-image-loader", 4);
        this.A01 = r0;
        r3.A00 = r0;
    }

    public void A01(ImageView imageView, C108815db r15, C181758nH r16, C181778nJ r17, int i) {
        C108815db r6 = r15;
        ImageView imageView2 = imageView;
        AnonymousClass8EI r4 = new AnonymousClass8EI(imageView2, r6, new AnonymousClass90S(r16, 1, this), new AnonymousClass920(r15, 2), new C170698Ee(r17, this), i, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (this.A01 == null) {
            A00();
        }
        if (this.A01 != null) {
            if (r4.B8H() != null) {
                r4.B8H().setTag(R.id.image_id, r4.A05.A04);
                r4.B8H().setTag(R.id.image_quality, Integer.valueOf(r4.A04));
                if (!r4.BE7().equals(r4.B8H().getTag(R.id.loaded_image_url))) {
                    r4.B8H().setTag(R.id.loaded_image_url, (Object) null);
                }
            }
            this.A01.A02(r4, true);
        }
    }

    public C153127ai(C69263Wi r2, C56492s4 r3, C56612sH r4, C54292oU r5, AnonymousClass1VX r6, AnonymousClass4FV r7, C55002pd r8, C29011i8 r9) {
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        this.A03 = r2;
        this.A04 = r3;
        this.A08 = r7;
        this.A0A = r9;
        this.A09 = r8;
        this.A0B = AnonymousClass002.A0K();
        A00();
    }

    public void finalize() {
        super.finalize();
    }
}
