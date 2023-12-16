package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import com.whatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.4OY  reason: invalid class name */
public class AnonymousClass4OY extends BaseAdapter {
    public final /* synthetic */ LiveLocationPrivacyActivity A00;

    public AnonymousClass4OY(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        this.A00 = liveLocationPrivacyActivity;
    }

    public int getCount() {
        return this.A00.A0F.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.A0F.get(i);
    }

    public long getItemId(int i) {
        return ((AnonymousClass3ZH) C86654Ky.A0k(this.A00.A0F, i)).A0F();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C149537Mv r0;
        if (view == null) {
            view = AnonymousClass001.A0R(this.A00.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
            r0 = new C149537Mv();
            r0.A02 = C86644Kx.A0M(view, R.id.name);
            r0.A01 = AnonymousClass002.A09(view, R.id.time_left);
            r0.A00 = AnonymousClass0x9.A0F(view, R.id.avatar);
            view.setTag(r0);
        } else {
            r0 = (C149537Mv) view.getTag();
        }
        LiveLocationPrivacyActivity liveLocationPrivacyActivity = this.A00;
        AnonymousClass3ZH r5 = (AnonymousClass3ZH) C86654Ky.A0k(liveLocationPrivacyActivity.A0F, i);
        if (r5 != null) {
            long A0H = liveLocationPrivacyActivity.A06.A0H();
            long A04 = liveLocationPrivacyActivity.A0B.A04(C86604Kt.A0a(r5));
            r0.A03 = r5;
            r0.A01.setText(C107565bW.A0C(liveLocationPrivacyActivity.A00, A04 - A0H));
            r0.A02.setText(liveLocationPrivacyActivity.A00.A0H(liveLocationPrivacyActivity.A06.A0H(r5)));
            AnonymousClass0YY.A06(r0.A00, 2);
            liveLocationPrivacyActivity.A07.A08(r0.A00, r0.A03);
        }
        return view;
    }

    public boolean hasStableIds() {
        return true;
    }
}
