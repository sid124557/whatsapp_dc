package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import java.util.HashSet;

/* renamed from: X.5g6  reason: invalid class name and case insensitive filesystem */
public final class C110355g6 implements C16910uE {
    public Runnable A00;
    public final Context A01;
    public final TextView A02;
    public final /* synthetic */ MediaPickerFragment A03;

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r4) {
        C162457s7.A0J(menuItem, 1);
        if (menuItem.getItemId() != 0) {
            return false;
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        mediaPickerFragment.A1b(mediaPickerFragment.A0L);
        return false;
    }

    public C110355g6(Context context, MediaPickerFragment mediaPickerFragment) {
        this.A03 = mediaPickerFragment;
        this.A01 = context;
        TextView textView = (TextView) C18310x6.A0H(LayoutInflater.from(context), R.layout.f8nameremoved);
        this.A02 = textView;
        C86614Ku.A1H(textView, this, 16);
    }

    public final boolean BQL(Menu menu, AnonymousClass0R2 r8) {
        TextView textView = this.A02;
        r8.A09(textView);
        MediaPickerFragment mediaPickerFragment = this.A03;
        int A022 = AnonymousClass5Yj.A02(mediaPickerFragment.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved);
        Context context = this.A01;
        AnonymousClass0x2.A0q(context, textView, A022);
        C86634Kw.A13(context, C86654Ky.A0J(mediaPickerFragment), AnonymousClass5Yj.A02(mediaPickerFragment.A1D(), R.attr.f3nameremoved, R.color.f5nameremoved));
        return true;
    }

    public final void BQw(AnonymousClass0R2 r4) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        MediaPickerFragment mediaPickerFragment = this.A03;
        if (mediaPickerFragment.A0G) {
            mediaPickerFragment.A0R().finish();
        }
        mediaPickerFragment.A05 = null;
        mediaPickerFragment.A1Y();
        C86634Kw.A13(this.A01, C86654Ky.A0J(mediaPickerFragment), R.color.f5nameremoved);
    }

    public boolean BYg(Menu menu, AnonymousClass0R2 r7) {
        String quantityString;
        MediaPickerFragment mediaPickerFragment = this.A03;
        HashSet hashSet = mediaPickerFragment.A0L;
        if (hashSet.size() == 0) {
            quantityString = C08310eF.A09(mediaPickerFragment).getString(R.string.f11nameremoved);
        } else {
            int size = hashSet.size();
            Resources A09 = C08310eF.A09(mediaPickerFragment);
            Object[] objArr = new Object[1];
            C18270x1.A1Q(objArr, size);
            quantityString = A09.getQuantityString(R.plurals.f9nameremoved, size, objArr);
        }
        TextView textView = this.A02;
        textView.setText(quantityString);
        if (this.A00 == null && !textView.isSelected()) {
            C117095rN r2 = new C117095rN(this, 27);
            this.A00 = r2;
            textView.postDelayed(r2, 1000);
        }
        return true;
    }
}
