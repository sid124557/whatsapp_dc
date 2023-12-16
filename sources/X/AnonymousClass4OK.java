package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4OK  reason: invalid class name */
public class AnonymousClass4OK extends ArrayAdapter {
    public final ArrayList A00;
    public final /* synthetic */ SetAboutInfo A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextEmojiLabel A0M;
        if (view == null) {
            Log.d("SetStatus/StatusAdapter/getView");
            view = C18310x6.A0H(C620633i.A00(viewGroup.getContext()), R.layout.f8nameremoved);
        }
        String A1M = C86664Kz.A1M(this.A00, i);
        if (!(A1M == null || (A0M = C86644Kx.A0M(view, R.id.status_row)) == null)) {
            View findViewById = view.findViewById(R.id.status_selected_check);
            SetAboutInfo setAboutInfo = this.A01;
            findViewById.setVisibility(C86634Kw.A01(A1M.equals(setAboutInfo.A01.A00()) ? 1 : 0));
            C18300x5.A13(setAboutInfo, findViewById, R.string.f11nameremoved);
            A0M.A0K((List) null, A1M);
        }
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4OK(Context context, SetAboutInfo setAboutInfo, ArrayList arrayList) {
        super(context, R.id.status_row, arrayList);
        this.A01 = setAboutInfo;
        this.A00 = arrayList;
    }
}
