package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.StickerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.121  reason: invalid class name */
public class AnonymousClass121 extends AnonymousClass0R6 {
    public int A00;
    public int A01;
    public View A02;
    public RecyclerView A03;
    public C50612iT A04;
    public AnonymousClass2IF A05;
    public List A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final AnonymousClass0O5 A0A = new AnonymousClass4H3(this, 1);
    public final AnonymousClass1VX A0B;
    public final C49912hI A0C;
    public final AnonymousClass33O A0D;
    public final StickerView A0E;
    public final C54722pB A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static List A00(AnonymousClass121 r0) {
        List list = r0.A06;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public void A0C(RecyclerView recyclerView) {
        this.A03 = recyclerView;
        recyclerView.A0q(this.A0A);
    }

    public void A0D(RecyclerView recyclerView) {
        recyclerView.A0r(this.A0A);
        this.A03 = null;
    }

    public int A0G() {
        List list;
        C50612iT r1 = this.A04;
        if (r1 == null) {
            return 0;
        }
        if (r1.A0T || (r1.A0H == null && !r1.A05.isEmpty())) {
            list = this.A04.A05;
        } else {
            list = this.A04.A04;
        }
        int size = list.size();
        int i = this.A00;
        if (i > 0) {
            return Math.min(size, i);
        }
        return size;
    }

    public void A0K() {
        C626936e.A04(this.A03);
        StickerView stickerView = this.A0E;
        if (stickerView != null && stickerView.getVisibility() == 0) {
            stickerView.setSelected(false);
            this.A02.setVisibility(0);
            stickerView.setVisibility(4);
            this.A03.setAlpha(1.0f);
            stickerView.A08();
        }
    }

    public final void A0L() {
        C626936e.A04(this.A03);
        StickerView stickerView = this.A0E;
        if (stickerView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            int i2 = marginLayoutParams.rightMargin;
            int width = this.A03.getWidth();
            int height = this.A03.getHeight();
            C05570Ua A0F2 = this.A03.A0F(this.A01);
            if (A0F2 == null) {
                A0K();
                return;
            }
            View view = A0F2.A0H;
            this.A02 = view;
            float x = view.getX() + ((float) i) + (((float) this.A02.getWidth()) / 2.0f);
            float y = this.A02.getY() + (((float) this.A02.getHeight()) / 2.0f);
            float max = Math.max(x - (((float) stickerView.getWidth()) / 2.0f), 0.0f);
            float max2 = Math.max(y - (((float) stickerView.getHeight()) / 2.0f), 0.0f);
            stickerView.setX(max - Math.max(((((float) stickerView.getWidth()) + max) - ((float) width)) - ((float) i2), 0.0f));
            stickerView.setY(max2 - Math.max((((float) stickerView.getHeight()) + max2) - ((float) height), 0.0f));
        }
    }

    public void A0N(AnonymousClass39M r11, C50612iT r12, int i) {
        C626936e.A04(this.A03);
        C05570Ua A0F2 = this.A03.A0F(i);
        if (A0F2 == null) {
            A0K();
            return;
        }
        View view = A0F2.A0H;
        this.A02 = view;
        ImageView A0F3 = AnonymousClass0x9.A0F(view, R.id.sticker_preview);
        this.A01 = i;
        A0L();
        StickerView stickerView = this.A0E;
        if (stickerView != null) {
            AnonymousClass39M r3 = r11;
            if (r11 == null || r11.A09 == null || (this.A0H ? !r12.A0Q : r12.A00() || !r12.A0O)) {
                stickerView.setImageDrawable(A0F3.getDrawable());
                stickerView.setSelected(true);
            } else {
                this.A0D.A05(stickerView, r3, new AnonymousClass4JR(this, 1), 1, stickerView.getWidth(), stickerView.getHeight(), true, false);
            }
            C626936e.A04(this.A03);
            this.A02.setVisibility(4);
            stickerView.setVisibility(0);
            this.A03.setAlpha(0.2f);
        }
    }

    public final boolean A0P(int i) {
        boolean z;
        DialogFragment starStickerFromPickerDialogFragment;
        if (this.A05 == null || A0O(i)) {
            return true;
        }
        StickerView stickerView = this.A0E;
        if (stickerView != null && stickerView.getVisibility() == 0 && this.A01 != i) {
            return true;
        }
        C50612iT r2 = this.A04;
        C626936e.A06(r2);
        if (r2.A05.size() <= i) {
            return false;
        }
        List A002 = A00(this);
        if (i >= A002.size()) {
            z = false;
        } else {
            z = ((C53082mW) A002.get(i)).A02;
        }
        AnonymousClass2IF r4 = this.A05;
        AnonymousClass39M r3 = (AnonymousClass39M) r2.A05.get(i);
        if (z) {
            starStickerFromPickerDialogFragment = RemoveStickerFromFavoritesDialogFragment.A00(r3);
        } else {
            starStickerFromPickerDialogFragment = new StarStickerFromPickerDialogFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putParcelable("sticker", r3);
            A082.putInt("position", i);
            starStickerFromPickerDialogFragment.A0u(A082);
        }
        r4.A00.Boo(starStickerFromPickerDialogFragment);
        return true;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r13, int i) {
        AnonymousClass39M r5;
        AnonymousClass12V r132 = (AnonymousClass12V) r13;
        ImageView imageView = r132.A01;
        imageView.setImageResource(this.A09);
        boolean A0O = A0O(i);
        r132.A00.setVisibility(AnonymousClass001.A08(A0O ? 1 : 0));
        float f = 1.0f;
        if (A0O) {
            f = 0.0f;
        }
        imageView.setAlpha(f);
        C50612iT r0 = this.A04;
        if (r0 != null) {
            if (r0.A05.size() > i) {
                r5 = (AnonymousClass39M) this.A04.A05.get(i);
                if (r5 != null) {
                    imageView.setContentDescription(AnonymousClass320.A00(imageView.getContext(), r5));
                }
            } else {
                r5 = null;
            }
            C50612iT r1 = this.A04;
            if (r1.A0T || ((r1.A0H == null && !r1.A05.isEmpty()) || !(r5 == null || r5.A09 == null || (!this.A0H && r1.A00())))) {
                AnonymousClass33O r3 = this.A0D;
                C626936e.A06(r5);
                int i2 = this.A08;
                r3.A05(imageView, r5, new C68713Uf(this, i), 1, i2, i2, false, false);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("https://static.whatsapp.net/sticker?img=");
                A0o.append(AnonymousClass001.A0n(this.A04.A04, r132.A01()));
                ImageView imageView2 = imageView;
                this.A0F.A01((Drawable) null, (Drawable) null, imageView2, new AnonymousClass3WW(this, r132), this.A0C.A00(AnonymousClass000.A0X(this.A0B.A0R(C58422vE.A02, 6785), A0o)));
            }
            if (this.A0G) {
                View view = r132.A0H;
                view.setOnLongClickListener(new C635939v(this, i));
                view.setOnClickListener(new C109715f4(this, r5, i, 14));
            }
        }
    }

    public AnonymousClass121(AnonymousClass1VX r4, C49912hI r5, AnonymousClass33O r6, StickerView stickerView, C54722pB r8, int i, int i2, boolean z, boolean z2) {
        this.A0B = r4;
        this.A0D = r6;
        this.A0F = r8;
        this.A08 = i;
        this.A07 = i2;
        this.A00 = 0;
        this.A09 = R.drawable.sticker_store_error;
        this.A0G = z;
        this.A0H = z2;
        this.A0E = stickerView;
        this.A0C = r5;
        if (stickerView != null) {
            C18280x3.A0o(stickerView, this, 13);
            stickerView.setOnLongClickListener(new C85844Hv(this, 1));
        }
    }

    public void A0M(int i, boolean z) {
        List A002 = A00(this);
        if (i >= 0 && i < A002.size()) {
            ((C53082mW) A002.get(i)).A00 = z;
            A06(i);
        }
    }

    public final boolean A0O(int i) {
        List A002 = A00(this);
        if (i < 0 || i >= A002.size()) {
            return false;
        }
        return ((C53082mW) A002.get(i)).A00;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        AnonymousClass12V r5 = new AnonymousClass12V(AnonymousClass001.A0R(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        ImageView imageView = r5.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = this.A08;
        layoutParams.height = i2;
        layoutParams.width = i2;
        imageView.setLayoutParams(layoutParams);
        int i3 = this.A07;
        imageView.setPadding(i3, i3, i3, i3);
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams);
        view.setPadding(i3, i3, i3, i3);
        return r5;
    }
}
