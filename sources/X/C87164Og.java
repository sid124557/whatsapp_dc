package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.4Og  reason: invalid class name and case insensitive filesystem */
public class C87164Og extends BaseAdapter {
    public static final int A03;
    public final int A00;
    public final int A01;
    public final Calendar A02;

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
        }
        Calendar calendar = this.A02;
        int i2 = i + this.A01;
        int i3 = this.A00;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, A03, C86634Kw.A0E(textView).locale));
        String string = viewGroup.getContext().getString(R.string.f11nameremoved);
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = calendar.getDisplayName(7, 2, Locale.getDefault());
        textView.setContentDescription(String.format(string, A0L));
        return textView;
    }

    static {
        int i = 1;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        }
        A03 = i;
    }

    public int getCount() {
        return this.A00;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        int i2 = this.A00;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.A01;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public C87164Og(int i) {
        Calendar A1O = C86664Kz.A1O();
        this.A02 = A1O;
        this.A00 = A1O.getMaximum(7);
        this.A01 = i;
    }

    public long getItemId(int i) {
        return 0;
    }

    public C87164Og() {
        Calendar A1O = C86664Kz.A1O();
        this.A02 = A1O;
        this.A00 = A1O.getMaximum(7);
        this.A01 = A1O.getFirstDayOfWeek();
    }
}
