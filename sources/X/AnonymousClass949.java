package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.949  reason: invalid class name */
public class AnonymousClass949 extends ArrayAdapter {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C105365Uq A01;
    public final /* synthetic */ C196399am A02;
    public final /* synthetic */ List A03;

    public int getCount() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass3ZH r2 = (AnonymousClass3ZH) this.A03.get(i);
        C626936e.A06(r2);
        if (view == null) {
            view = AnonymousClass001.A0R(LayoutInflater.from(this.A00), viewGroup, R.layout.f8nameremoved);
        }
        C18300x5.A0G(view, R.id.contact_name).setText(this.A02.A0D.A0H(r2));
        ImageView A0E = AnonymousClass0x9.A0E(view, R.id.contact_row_photo);
        this.A01.A08(A0E, r2);
        AnonymousClass0YY.A06(A0E, 2);
        C107295b4.A04(view, R.string.f11nameremoved);
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass949(Context context, Context context2, C105365Uq r4, C196399am r5, List list, List list2) {
        super(context, R.layout.f8nameremoved, list);
        this.A02 = r5;
        this.A03 = list2;
        this.A00 = context2;
        this.A01 = r4;
    }

    public boolean hasStableIds() {
        return true;
    }
}
