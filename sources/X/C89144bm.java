package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4bm  reason: invalid class name and case insensitive filesystem */
public abstract class C89144bm extends C137656p3 {
    public ViewGroup A00;
    public LinearLayout A01;
    public TextView A02;

    public C131696e2 A76() {
        C131696e2 r3 = new C131696e2();
        C109705f3 r2 = new C109705f3((Object) this, 10, (Object) r3);
        r3.A00 = A75();
        r3.A00(r2, getString(R.string.f11nameremoved), R.drawable.ic_action_copy);
        return r3;
    }

    public C131716e4 A77() {
        C131716e4 r3 = new C131716e4();
        C109705f3 r2 = new C109705f3((Object) this, 8, (Object) r3);
        if (!(this instanceof CallLinkActivity)) {
            AnonymousClass547.A00(this.A01, r2, this, r3, 1);
        }
        r3.A00 = A75();
        r3.A00(r2, getString(R.string.f11nameremoved), R.drawable.ic_share);
        return r3;
    }

    public C131706e3 A78() {
        C131706e3 r4 = new C131706e3();
        C109705f3 r3 = new C109705f3((Object) this, 9, (Object) r4);
        String string = getString(R.string.f11nameremoved);
        r4.A00 = A75();
        r4.A00(r3, C86604Kt.A0m(this, string, R.string.f11nameremoved), R.drawable.ic_action_forward);
        return r4;
    }

    public void A7A(C131716e4 r4) {
        Log.i("sharelinkactivity/sharelink/");
        if (!TextUtils.isEmpty(r4.A02)) {
            Intent A09 = AnonymousClass0x9.A09("android.intent.action.SEND");
            A09.putExtra("android.intent.extra.TEXT", r4.A02);
            if (!TextUtils.isEmpty(r4.A01)) {
                A09.putExtra("android.intent.extra.SUBJECT", r4.A01);
            }
            C86624Kv.A0j(A09);
            startActivity(Intent.createChooser(A09, r4.A00));
        }
    }

    public void A7B(C131706e3 r4) {
        Log.i("sharelinkactivity/sharetostatus/");
        if (!TextUtils.isEmpty(r4.A00)) {
            startActivity(C627736r.A0M(this, (C108845de) null, 17, r4.A00));
        }
    }

    public void A7C(C131706e3 r2) {
        Log.i("sharelinkactivity/sendlink/");
        if (!TextUtils.isEmpty(r2.A00)) {
            startActivity(C627736r.A0r(this, r2.A00));
        }
    }

    public View A75() {
        View A0G = C86654Ky.A0G(this, R.layout.f8nameremoved);
        ViewGroup viewGroup = this.A00;
        C626936e.A04(viewGroup);
        viewGroup.addView(A0G);
        return A0G;
    }

    public void A79() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.f12nameremoved);
        View view = new View(contextThemeWrapper, (AttributeSet) null, R.style.f12nameremoved);
        view.setLayoutParams(new LinearLayout.LayoutParams(contextThemeWrapper, (AttributeSet) null));
        ViewGroup viewGroup = this.A00;
        C626936e.A04(viewGroup);
        viewGroup.addView(view);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setSupportActionBar(AnonymousClass1Hf.A28(this));
        AnonymousClass1Ha.A1z(this);
        this.A00 = C86664Kz.A0k(this, R.id.share_link_root);
        this.A02 = C005205m.A01(this, R.id.link);
        this.A01 = (LinearLayout) C005205m.A00(this, R.id.link_btn);
    }
}
