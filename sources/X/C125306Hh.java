package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Hh  reason: invalid class name and case insensitive filesystem */
public class C125306Hh extends AnonymousClass0R6 {
    public int A00 = 0;
    public long A01 = 0;
    public C183128pX A02;
    public List A03;
    public boolean A04 = false;
    public final LayoutInflater A05;
    public final AnonymousClass33O A06;
    public final AnonymousClass4BP A07;
    public final Integer A08;
    public final HashMap A09 = AnonymousClass001.A0t();

    public long A0B(int i) {
        List list;
        Number A0p;
        if (!this.A00 || (list = this.A03) == null || (A0p = AnonymousClass0x9.A0p(((AnonymousClass39M) list.get(i)).A0D, this.A09)) == null) {
            return -1;
        }
        return A0p.longValue();
    }

    public int A0G() {
        return C86614Ku.A08(this.A03);
    }

    public void A0K(List list) {
        this.A03 = list;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
                HashMap hashMap = this.A09;
                if (hashMap.get(A0b.A0D) == null) {
                    long j = this.A01;
                    this.A01 = 1 + j;
                    hashMap.put(A0b.A0D, Long.valueOf(j));
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r13, int i) {
        View view;
        AnonymousClass39M r0;
        C125606Ir r132 = (C125606Ir) r13;
        List list = this.A03;
        if (list != null) {
            AnonymousClass39M r5 = (AnonymousClass39M) list.get(i);
            boolean z = this.A04;
            if (z != r132.A03) {
                r132.A03 = z;
                if (!z) {
                    StickerView stickerView = r132.A07;
                    stickerView.A04 = false;
                    stickerView.A08();
                } else if (r132.A02) {
                    StickerView stickerView2 = r132.A07;
                    stickerView2.A04 = true;
                    stickerView2.A07();
                }
            }
            int i2 = this.A00;
            if (r5 == null || (r0 = r132.A01) == null || !r5.A0D.equals(r0.A0D)) {
                r132.A01 = r5;
                if (r5 == null) {
                    View view2 = r132.A0H;
                    view2.setOnClickListener((View.OnClickListener) null);
                    r132.A07.setImageResource(0);
                    view2.setBackgroundResource(0);
                    view2.setClickable(false);
                } else {
                    String str = r5.A0D;
                    if (str == null || !str.equals("loading-hash")) {
                        view = r132.A0H;
                        view.setOnClickListener(new AnonymousClass54H(r132, r5, i, 3));
                        view.setOnLongClickListener(r132.A04);
                    } else {
                        view = r132.A0H;
                        view.setOnClickListener((View.OnClickListener) null);
                        view.setClickable(false);
                    }
                    view.setBackgroundResource(R.drawable.selector_orange_gradient);
                    view.setContentDescription(AnonymousClass320.A00(view.getContext(), r5));
                    StickerView stickerView3 = r132.A07;
                    int dimensionPixelSize = C18290x4.A0G(stickerView3).getDimensionPixelSize(R.dimen.f6nameremoved);
                    r132.A05.A05(stickerView3, r5, new C171968Jc(r132), i2, dimensionPixelSize, dimensionPixelSize, true, true);
                }
            }
            r132.A00 = new AnonymousClass919(this, 5, r5);
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C125606Ir(this.A05, viewGroup, this.A06, this.A07, this.A08);
    }

    public C125306Hh(Context context, AnonymousClass33O r4, AnonymousClass4BP r5, Integer num, List list) {
        this.A05 = LayoutInflater.from(context);
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = num;
        A0K(list);
        A0E(true);
    }
}
