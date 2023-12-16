package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Hf  reason: invalid class name and case insensitive filesystem */
public class C125286Hf extends AnonymousClass0R6 {
    public final Resources A00;
    public final AnonymousClass7EW A01;
    public final AnonymousClass4FS A02;
    public final List A03 = AnonymousClass001.A0s();
    public final Map A04 = AnonymousClass001.A0t();

    public int A0G() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r5, int i) {
        AnonymousClass6I6 r52 = (AnonymousClass6I6) r5;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            File file = (File) ((AnonymousClass7IL) this.A03.get(i)).A01;
            C137746pC r53 = (C137746pC) r52;
            C991054l r1 = r53.A00;
            if (r1 != null) {
                r1.A0D(true);
            }
            C991054l r12 = new C991054l(r53.A0H.getContext(), r53.A01, file);
            r53.A00 = r12;
            C18270x1.A0w(r12, r53.A02);
            AnonymousClass6C9.A12(r53.A00, this.A04, i);
        } else if (itemViewType == 1) {
            C137746pC r54 = (C137746pC) r52;
            int A0K = AnonymousClass001.A0K(((AnonymousClass7IL) this.A03.get(i)).A01);
            Resources resources = this.A00;
            C626936e.A06(resources);
            Drawable drawable = resources.getDrawable(A0K);
            C991054l r13 = r54.A00;
            if (r13 != null) {
                r13.A0D(true);
                r54.A00 = null;
            }
            r54.A01.setImageDrawable(drawable);
        } else if (itemViewType == 2) {
            C137736pB r55 = (C137736pB) r52;
            int i2 = 4;
            if (AnonymousClass001.A1Z(((AnonymousClass7IL) this.A03.get(i)).A01)) {
                i2 = 0;
            }
            r55.A00.setVisibility(i2);
            r55.A01.setVisibility(i2);
        }
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass7IL) this.A03.get(i)).A00;
    }

    public C125286Hf(Resources resources, AnonymousClass7EW r3, AnonymousClass4FS r4) {
        this.A02 = r4;
        this.A00 = resources;
        this.A01 = r3;
    }

    public void A0K(AnonymousClass0PJ r5, List list, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(new C137766pE((File) it.next()));
        }
        if (i != 0) {
            if (i == 1) {
                A0s.add(new C137786pG(Boolean.TRUE));
                A0s.add(new C137776pF());
            } else {
                A0s.add(new C137786pG(Boolean.FALSE));
                Object obj = r5.A00;
                C626936e.A06(obj);
                Iterator A0q = C18320x8.A0q(obj);
                while (A0q.hasNext()) {
                    A0s.add(new C137756pD((Integer) A0q.next()));
                }
            }
        }
        List list2 = this.A03;
        C18280x3.A0s(new AnonymousClass6HC(list2, A0s), this, A0s, list2);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C05570Ua r3;
        View view;
        View.OnClickListener onClickListener;
        Context context = viewGroup.getContext();
        if (i == 0 || i == 1) {
            AnonymousClass4FS r2 = this.A02;
            AnonymousClass4ST r1 = new AnonymousClass4ST(context);
            r1.setScaleType(ImageView.ScaleType.CENTER_CROP);
            r3 = new C137746pC(r1, r2);
            view = r3.A0H;
            onClickListener = new AnonymousClass54E(r3, 26, this);
        } else {
            LayoutInflater from = LayoutInflater.from(context);
            if (i == 3) {
                return new C137726pA(from.inflate(R.layout.f8nameremoved, (ViewGroup) null));
            }
            r3 = new C137736pB(from.inflate(R.layout.f8nameremoved, (ViewGroup) null));
            view = r3.A0H;
            onClickListener = new C634139d(this, 37);
        }
        view.setOnClickListener(onClickListener);
        return r3;
    }
}
