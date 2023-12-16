package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.5nj  reason: invalid class name and case insensitive filesystem */
public class C114865nj implements C185718u8 {
    public final /* synthetic */ LinkedAccountMediaViewFragment A00;

    public C114865nj(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment) {
        this.A00 = linkedAccountMediaViewFragment;
    }

    public AnonymousClass0PJ B1A(int i) {
        LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) linkedAccountMediaViewFragment.A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null);
        ViewGroup A0I = C86644Kx.A0I(viewGroup, R.id.footer);
        AnonymousClass68C r8 = new AnonymousClass68C(linkedAccountMediaViewFragment.A0G(), this, 1);
        r8.A0M = new C989453v(this, 22);
        AnonymousClass0YZ.A0F(r8, AnonymousClass000.A0V("thumb-transition-", ((C108855df) linkedAccountMediaViewFragment.A0G.get(i)).A01.A04, AnonymousClass001.A0o()));
        int i2 = 0;
        viewGroup.addView(r8, 0);
        r8.A0Y = true;
        linkedAccountMediaViewFragment.A0F.A01(r8, ((C108855df) linkedAccountMediaViewFragment.A0G.get(i)).A01, (C181758nH) null, new AnonymousClass93V(r8, 2), 1);
        if (linkedAccountMediaViewFragment.A0I) {
            Object obj = linkedAccountMediaViewFragment.A0G.get(i);
            View inflate = linkedAccountMediaViewFragment.A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null);
            View A02 = C06560Yg.A02(inflate, R.id.message_business_btn);
            inflate.setVisibility(0);
            C109705f3.A00(A02, linkedAccountMediaViewFragment, obj, 21);
            A0I.addView(inflate);
        }
        if (!TextUtils.isEmpty(((C108855df) linkedAccountMediaViewFragment.A0G.get(i)).A02)) {
            View inflate2 = linkedAccountMediaViewFragment.A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null);
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) C06560Yg.A02(inflate2, R.id.caption);
            A0I.addView(inflate2, 0);
            mediaCaptionTextView.setCaptionText(((C108855df) linkedAccountMediaViewFragment.A0G.get(i)).A02);
            C100385As.A01(linkedAccountMediaViewFragment.A0V(), mediaCaptionTextView.A09, inflate2, this, 2);
        }
        if (!linkedAccountMediaViewFragment.A0J) {
            i2 = 8;
        }
        A0I.setVisibility(i2);
        return AnonymousClass0x9.A0G(viewGroup, ((C108855df) linkedAccountMediaViewFragment.A0G.get(i)).A01.A04);
    }

    public void BTY() {
    }

    public int getCount() {
        return this.A00.A0G.size();
    }

    public void B1b(int i) {
    }

    public /* bridge */ /* synthetic */ int BBY(Object obj) {
        return 0;
    }
}
