package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.community.CommunityAdminDialogFragment;

/* renamed from: X.1Hf  reason: invalid class name */
public abstract class AnonymousClass1Hf extends C89704el {
    public boolean A00 = false;

    private void A29() {
        AnonymousClass4HY.A00(this, 1);
    }

    public static SharedPreferences A27(C89654ea r0) {
        return (SharedPreferences) r0.A09.A01.get();
    }

    public static void A2C(TextView textView, C89654ea r3, AnonymousClass1VX r4) {
        textView.setMovementMethod(new C86964Mo(r4));
        C06560Yg.A0O(textView, new AnonymousClass4TJ(textView, r3.A08));
    }

    public static void A2D(C004805c r1, int i) {
        r1.A5J(new AnonymousClass68W(r1, i));
    }

    public static void A2F(C64333Db r0, C89654ea r1) {
        r1.A0B = (AnonymousClass487) r0.A00.A9c.get();
    }

    public static void A2G(C64333Db r1, C89654ea r2) {
        r2.A04 = (AnonymousClass4FS) r1.AbX.get();
        r2.A0D = (AnonymousClass1VX) r1.A07.get();
        r2.A05 = (C69263Wi) r1.AG7.get();
        r2.A03 = (C55682qk) r1.A75.get();
        r2.A04 = (C64393Dh) r1.AS1.get();
        r2.A0C = (AnonymousClass5Y0) r1.A8o.get();
        r2.A06 = (C66663Mh) r1.AUd.get();
        r2.A08 = (C620633i) r1.AYG.get();
        r2.A09 = (AnonymousClass33p) r1.Aaj.get();
        r2.A07 = (C29441ip) r1.A68.get();
        r2.A0A = (C54412og) r1.Aam.get();
    }

    public static void A2H(C89654ea r2, boolean z) {
        View view = r2.A00;
        C162457s7.A0D(view);
        Resources resources = r2.getResources();
        C162457s7.A0D(resources);
        C106995aW.A00(resources, view, z);
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C89654ea r1 = (C89654ea) this;
            C64333Db r0 = ((C88834as) AnonymousClass0x9.A0K(this)).A4Z;
            A2G(r0, r1);
            A2F(r0, r1);
        }
    }

    public AnonymousClass1Hf(int i) {
        super(i);
        AnonymousClass4HY.A00(this, 1);
    }

    public static Toolbar A28(C009707r r1) {
        return (Toolbar) r1.findViewById(R.id.toolbar);
    }

    public static void A2A(Activity activity) {
        C107405bG.A08(activity, AnonymousClass34K.A01(activity, R.attr.f3nameremoved));
    }

    public static void A2B(Bundle bundle, C89654ea r3, C44732Xg r4, int i) {
        bundle.putString("positive_button", r3.getString(i));
        bundle.putString("negative_button", r3.getString(R.string.f11nameremoved));
        CommunityAdminDialogFragment communityAdminDialogFragment = new CommunityAdminDialogFragment();
        communityAdminDialogFragment.A0u(bundle);
        C626936e.A06(r4.A00);
        communityAdminDialogFragment.A01 = r4.A00;
        r3.Bon(communityAdminDialogFragment, (String) null);
    }

    public static void A2E(C009707r r1) {
        AnonymousClass0R8 supportActionBar = r1.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
        }
    }

    public static boolean A2I(C009707r r1) {
        AnonymousClass0R8 supportActionBar = r1.getSupportActionBar();
        C626936e.A06(supportActionBar);
        supportActionBar.A0N(true);
        return true;
    }

    public AnonymousClass1Hf() {
        AnonymousClass4HY.A00(this, 1);
    }
}
