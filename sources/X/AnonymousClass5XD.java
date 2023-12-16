package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.5XD  reason: invalid class name */
public class AnonymousClass5XD {
    public int A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public AnonymousClass5UY A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final ImageView A07;
    public final TextView A08;
    public final /* synthetic */ AnonymousClass4o1 A09;

    public AnonymousClass5XD(View view, AnonymousClass4o1 r5, int i) {
        this.A09 = r5;
        this.A00 = i;
        this.A08 = C18300x5.A0G(view, R.id.date);
        this.A07 = AnonymousClass0x9.A0F(view, R.id.album_thumb_status);
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.thumb);
        this.A06 = A0E;
        C18300x5.A13(view.getContext(), A0E, R.string.f11nameremoved);
        this.A05 = C86644Kx.A0I(view, R.id.album_thumbnail_date_wrapper);
        View findViewById = view.findViewById(R.id.hd_icon);
        if (findViewById != null) {
            this.A04 = new AnonymousClass5UY(findViewById);
        }
        C18320x8.A16(A0E, r5, this, 44);
        C93314oJ.A0q(A0E, r5);
    }

    public static /* synthetic */ void A00(AnonymousClass5XD r9) {
        Bundle A022;
        AnonymousClass4o1 r8 = r9.A09;
        Intent A25 = r8.A25();
        C003203q r4 = (C003203q) C111095hX.A00(r8.getContext());
        if (!C107275b2.A00) {
            A022 = null;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            int i = r9.A00;
            if (i < 3 || r8.A09.size() == 4) {
                A25.putExtra("start_index", i);
                r9.A02((C30471mV) r8.A09.get(i), A0s);
            } else {
                int i2 = 0;
                do {
                    ((AnonymousClass5XD) r8.A0I.get(i2)).A02((C30471mV) r8.A09.get(i2), A0s);
                    i2++;
                } while (i2 < 3);
            }
            A022 = C05880Vi.A01(r4, (AnonymousClass0PJ[]) A0s.toArray(new AnonymousClass0PJ[0])).A02();
            r4.A5c(new AnonymousClass67Z(r4, 0, r9));
        }
        AnonymousClass0RN.A00(r4, A25, A022);
    }

    public void A02(C30471mV r3, ArrayList arrayList) {
        AnonymousClass0x2.A1G(this.A06, C107315b6.A05(r3.A1J), arrayList);
        TextView textView = this.A08;
        if (textView.getVisibility() == 0) {
            AnonymousClass0x2.A1G(textView, C107315b6.A04(r3), arrayList);
        }
        ImageView imageView = this.A07;
        if (imageView != null) {
            AnonymousClass0x2.A1G(imageView, C93244oC.A02(r3), arrayList);
        }
    }

    public final void A01(ImageView imageView, int i, int i2) {
        LinearLayout.LayoutParams A0C = C86624Kv.A0C();
        A0C.gravity = 16;
        imageView.setLayoutParams(A0C);
        C18300x5.A13(imageView.getContext(), imageView, i);
        C107555bV.A05(imageView, this.A09.A0M, 0, i2);
    }
}
