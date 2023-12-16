package X;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.95A  reason: invalid class name */
public final class AnonymousClass95A extends AnonymousClass0R6 {
    public final int A00;
    public final Activity A01;
    public final C105365Uq A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass9OK A04;
    public final List A05;
    public final boolean A06;

    public void BNf(C05570Ua r5, int i) {
        TextEmojiLabel textEmojiLabel;
        String A0L;
        C162457s7.A0J(r5, 0);
        int i2 = r5.A02;
        if (i2 == 0) {
            C1902795c r52 = (C1902795c) r5;
            AnonymousClass3ZH r2 = (AnonymousClass3ZH) this.A05.get(i);
            this.A02.A08(r52.A00, r2);
            String A0J = r2.A0J();
            if (A0J == null || A0J.length() == 0) {
                textEmojiLabel = r52.A02;
                A0L = r2.A0L();
            } else {
                textEmojiLabel = r52.A02;
                A0L = r2.A0J();
            }
            textEmojiLabel.setText(A0L);
            if (r2.A0V()) {
                int A002 = AnonymousClass29N.A00(this.A03);
                ImageView imageView = r52.A01;
                imageView.setImageResource(A002);
                imageView.setVisibility(0);
                return;
            }
            r52.A01.setVisibility(8);
        } else if (i2 == 1 && i == 3) {
            C1902595a r53 = (C1902595a) r5;
            r53.A01.setText(R.string.f11nameremoved);
            r53.A00.setImageResource(R.drawable.ic_view_all);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            return new C1902795c(C18310x6.A0I(this.A01.getLayoutInflater(), viewGroup, R.layout.f8nameremoved, false), this.A04);
        }
        if (i == 1) {
            return new C1902595a(C18310x6.A0I(this.A01.getLayoutInflater(), viewGroup, R.layout.f8nameremoved, false), this.A04);
        }
        throw AnonymousClass001.A0c("Invalid view type");
    }

    public int getItemViewType(int i) {
        if (i < 3) {
            return 0;
        }
        return 1;
    }

    public int A0G() {
        int size = this.A05.size();
        if ((!this.A06 || size != 3) && size <= 3) {
            return size;
        }
        return this.A00;
    }

    public AnonymousClass95A(Activity activity, C105365Uq r2, AnonymousClass1VX r3, AnonymousClass9OK r4, List list, int i, boolean z) {
        C18260x0.A0R(activity, r3);
        this.A01 = activity;
        this.A05 = list;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
        this.A06 = z;
        this.A04 = r4;
    }
}
