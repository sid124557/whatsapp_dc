package X;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.39i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C634639i implements View.OnClickListener {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ AnonymousClass5L8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void onClick(View view) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        boolean z = this.A03;
        AnonymousClass5L8 r1 = this.A01;
        String str = this.A02;
        Log.i("acceptlink/confirmation/ok");
        if (z) {
            Intent A1O = new C627736r().A1O(acceptInviteLinkActivity, r1.A05, 0);
            AnonymousClass5VI.A00(A1O, "AcceptInviteLinkActivity");
            acceptInviteLinkActivity.A6T(A1O, true);
            return;
        }
        C27991fJ r4 = r1.A05;
        int i = r1.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("acceptlink/sendjoin/");
        A0o.append(str);
        C18260x0.A1R(A0o, " ", r4);
        TextView A0L = C18310x6.A0L(acceptInviteLinkActivity, R.id.progress_text);
        boolean A032 = acceptInviteLinkActivity.A0J.A03(i);
        int i2 = R.string.f11nameremoved;
        if (A032) {
            i2 = R.string.f11nameremoved;
        }
        A0L.setText(i2);
        acceptInviteLinkActivity.findViewById(R.id.progress).setVisibility(0);
        acceptInviteLinkActivity.findViewById(R.id.group_info).setVisibility(4);
        C18280x3.A0r(acceptInviteLinkActivity, R.id.error, 4);
        AtomicReference atomicReference = acceptInviteLinkActivity.A0N;
        atomicReference.set(r4);
        AnonymousClass0x7.A1B(new C33561tK(acceptInviteLinkActivity, acceptInviteLinkActivity.A06, acceptInviteLinkActivity.A0G, str, i), acceptInviteLinkActivity.A04);
        if (acceptInviteLinkActivity.getIntent().getBooleanExtra("is_invite_from_referrer", false)) {
            C24211Wn r2 = new C24211Wn();
            C27991fJ r12 = (C27991fJ) atomicReference.get();
            if (r12 != null) {
                r2.A00 = Integer.valueOf(acceptInviteLinkActivity.A0J.A00(r12));
            }
            acceptInviteLinkActivity.A0E.BhD(r2);
        }
    }

    public /* synthetic */ C634639i(AcceptInviteLinkActivity acceptInviteLinkActivity, AnonymousClass5L8 r2, String str, boolean z) {
        this.A00 = acceptInviteLinkActivity;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = str;
    }
}
