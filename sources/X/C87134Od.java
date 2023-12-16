package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.location.PlaceInfo;
import java.util.List;

/* renamed from: X.4Od  reason: invalid class name and case insensitive filesystem */
public class C87134Od extends BaseAdapter {
    public PlaceInfo A00;
    public List A01;
    public final Context A02;
    public final C54722pB A03;
    public final boolean A04 = true;

    public C87134Od(Context context, C54722pB r3) {
        this.A02 = context;
        this.A03 = r3;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.A02).inflate(R.layout.f8nameremoved, (ViewGroup) null);
        }
        TextView A09 = AnonymousClass002.A09(view, R.id.location_name);
        TextView A092 = AnonymousClass002.A09(view, R.id.location_description);
        ImageView A0F = AnonymousClass0x9.A0F(view, R.id.location_icon);
        if (this.A04) {
            Context context = this.A02;
            C86644Kx.A0l(context, A0F, AnonymousClass5Yj.A01(context));
        }
        List list = this.A01;
        if (list != null && i < list.size()) {
            PlaceInfo placeInfo = (PlaceInfo) this.A01.get(i);
            A09.setText(placeInfo.A06);
            int i2 = 0;
            if (!TextUtils.isEmpty(placeInfo.A0B)) {
                A092.setVisibility(0);
                A092.setText(placeInfo.A0B);
                A092.setSingleLine(true);
            } else {
                A092.setVisibility(8);
            }
            if (placeInfo == this.A00) {
                A09.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.pin_location_red, 0);
            } else {
                A09.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (placeInfo.A03 == 3) {
                i2 = this.A02.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            }
            A0F.setPadding(i2, i2, i2, i2);
            String str = placeInfo.A05;
            if (str != null) {
                this.A03.A03(A0F, str);
            } else {
                A0F.setImageDrawable((Drawable) null);
                return view;
            }
        }
        return view;
    }

    public int getCount() {
        return C86614Ku.A08(this.A01);
    }

    public Object getItem(int i) {
        List list = this.A01;
        if (list == null || i >= list.size()) {
            return null;
        }
        return this.A01.get(i);
    }

    public int getViewTypeCount() {
        return 1;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        return 0;
    }
}
