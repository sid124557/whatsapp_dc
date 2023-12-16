package com.whatsapp.contact.picker;

import X.AnonymousClass002;
import X.AnonymousClass0R2;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1Hf;
import X.AnonymousClass1X9;
import X.AnonymousClass317;
import X.AnonymousClass4A6;
import X.AnonymousClass4C1;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass5Ul;
import X.AnonymousClass5VI;
import X.AnonymousClass5XU;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZR;
import X.C08240dc;
import X.C08310eF;
import X.C106685Zz;
import X.C106905aM;
import X.C107405bG;
import X.C108845de;
import X.C111355hx;
import X.C1225564v;
import X.C1226565f;
import X.C135166kE;
import X.C182138nv;
import X.C182148nw;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C187388x8;
import X.C44772Xk;
import X.C57782uC;
import X.C58152un;
import X.C58422vE;
import X.C59852xb;
import X.C621033m;
import X.C624134x;
import X.C626936e;
import X.C627736r;
import X.C66513Ls;
import X.C72333dY;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import X.C89424cv;
import X.C89654ea;
import X.C95814uZ;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment;
import com.whatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContactPicker extends C89424cv implements C1226565f, C1225564v, C182138nv, C182148nw, AnonymousClass4A6, C187388x8 {
    public View A00;
    public FragmentContainerView A01;
    public AnonymousClass5XU A02;
    public AnonymousClass5Ul A03;
    public C621033m A04;
    public C44772Xk A05;
    public BaseSharedPreviewDialogFragment A06;
    public C111355hx A07;
    public ContactPickerFragment A08;
    public AnonymousClass5ZR A09;
    public AnonymousClass4FV A0A;
    public C106685Zz A0B;
    public WhatsAppLibLoader A0C;
    public AnonymousClass317 A0D;

    public boolean A64() {
        return true;
    }

    public void A6O(int i) {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1h(i);
        }
    }

    public C183538qC A74() {
        return new C72333dY(this.A0D, (AnonymousClass4C1) null);
    }

    public void A75() {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1V();
        }
    }

    public void A77(C59852xb r2) {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1W();
            ContactPickerFragment.A3q = false;
        }
    }

    public ContactPickerFragment A79() {
        if (this instanceof AudienceSelectionContactPicker) {
            return new AudienceSelectionContactPickerFragment();
        }
        return new ContactPickerFragment();
    }

    public C111355hx B8B() {
        C111355hx r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C111355hx r02 = new C111355hx(this);
        this.A07 = r02;
        return r02;
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void BRx(int i) {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment != null) {
            C18270x1.A0h(contactPickerFragment.A1v.A00().edit(), "disappearing_mode_duration_for_chat_picker_int", i);
            contactPickerFragment.A1W();
        }
    }

    public void BXG(String str) {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment != null && contactPickerFragment.A3Y && contactPickerFragment.A1x.A0X(691)) {
            contactPickerFragment.A1x(str);
        }
    }

    public void BcV(C108845de r16) {
        List list;
        ArrayList A0J;
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment != null) {
            Log.i("contactpicker/onStatusPrivacyBottomSheetDismissedSuccessful");
            C108845de r1 = r16;
            boolean z = !r1.equals(contactPickerFragment.A1o);
            contactPickerFragment.A1o = r1;
            Map map = contactPickerFragment.A3n;
            C135166kE r12 = C135166kE.A00;
            if (map.containsKey(r12) || contactPickerFragment.A0H == null) {
                contactPickerFragment.A1W();
            } else {
                contactPickerFragment.A1o(contactPickerFragment.A0H, contactPickerFragment.A0w.A07(r12));
            }
            contactPickerFragment.A1a();
            if (z) {
                int i = -1;
                if (contactPickerFragment.A1x.A0Y(C58422vE.A01, 2531)) {
                    i = 0;
                }
                C108845de r2 = contactPickerFragment.A1o;
                int i2 = r2.A00;
                if (i2 == 0) {
                    A0J = null;
                } else {
                    if (i2 == 1) {
                        list = r2.A01;
                    } else {
                        list = r2.A02;
                    }
                    A0J = AnonymousClass002.A0J(list);
                }
                AnonymousClass0x7.A1B(contactPickerFragment.A0Y.A00((C89654ea) contactPickerFragment.A0Q(), A0J, contactPickerFragment.A1o.A00, i, 0, false, false, false, false), contactPickerFragment.A2c);
            }
        }
    }

    public void BlZ(Bundle bundle, String str, List list) {
        C66513Ls r4;
        Intent action;
        boolean z = bundle.getBoolean("load_preview");
        C626936e.A06(Boolean.valueOf(z));
        C108845de r5 = null;
        String str2 = str;
        if (z) {
            r4 = C57782uC.A00(this.A0B.A03(str));
        } else {
            r4 = null;
        }
        boolean z2 = bundle.getBoolean("has_text_from_url");
        C626936e.A06(Boolean.valueOf(z2));
        boolean z3 = bundle.getBoolean("fb_share_wa_redirect");
        ContactPickerFragment contactPickerFragment = this.A08;
        boolean z4 = false;
        if (contactPickerFragment != null) {
            z4 = contactPickerFragment.A2I(false);
            r5 = this.A08.A1o;
        }
        this.A04.A0C(r4, r5, (C624134x) null, str2, list, (List) null, false, z2);
        if (!z3) {
            if (!z4) {
                B8B().A00.Bqv(list);
            }
            if (!bundle.getBoolean("disable_post_send_intent")) {
                if (list.size() == 1) {
                    action = C86664Kz.A1B().A1O(this, (C95814uZ) list.get(0), 0);
                    AnonymousClass5VI.A00(action, "ContactPicker:getPostSendIntent");
                } else {
                    action = C18300x5.A07(this).setAction("com.whatsapp.intent.action.CHATS");
                }
                if (action != null) {
                    startActivity(action);
                }
            }
            finish();
        }
    }

    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment == null || !contactPickerFragment.A28()) {
            super.onBackPressed();
        }
    }

    public Dialog onCreateDialog(int i) {
        Dialog A1J;
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment == null || (A1J = contactPickerFragment.A1J(i)) == null) {
            return super.onCreateDialog(i);
        }
        return A1J;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1X();
        return true;
    }

    public final void A7A() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) getSupportFragmentManager().A0D("ContactPickerFragment");
        this.A08 = contactPickerFragment;
        if (contactPickerFragment == null) {
            this.A08 = A79();
            Intent intent = getIntent();
            Bundle A082 = AnonymousClass002.A08();
            if (intent.getExtras() != null) {
                A082.putAll(intent.getExtras());
                A082.remove("perf_origin");
                A082.remove("perf_start_time_ns");
                A082.remove("key_perf_tracked");
            }
            if (intent.hasExtra("android.intent.extra.shortcut.ID")) {
                A082.putString("jid", intent.getStringExtra("android.intent.extra.shortcut.ID"));
            }
            Bundle A083 = AnonymousClass002.A08();
            A083.putString("action", intent.getAction());
            A083.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, intent.getType());
            A083.putBundle("extras", A082);
            this.A08.A0u(A083);
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A0D(this.A08, "ContactPickerFragment", R.id.fragment);
            A0J.A03();
        }
        if (C86634Kw.A1b(this.A0D)) {
            FragmentContainerView fragmentContainerView = this.A01;
            if (fragmentContainerView != null) {
                fragmentContainerView.setVisibility(0);
            }
            C86604Kt.A1A(this.A00);
        }
    }

    public void BWL(ArrayList arrayList) {
    }

    public void Bdh(AnonymousClass0R2 r1) {
        super.Bdh(r1);
        C107405bG.A04(this);
    }

    public void Bdi(AnonymousClass0R2 r1) {
        super.Bdi(r1);
        AnonymousClass4SG.A34(this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C08310eF A0B2 = getSupportFragmentManager().A0B(R.id.fragment);
        if (A0B2 != null) {
            A0B2.A0k(i, i2, intent);
        }
        if (i == 150 && this.A09.A02("android.permission.GET_ACCOUNTS") == 0 && this.A05.A00()) {
            A7A();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A0C.A03()) {
            Log.i("aborting due to native libraries missing");
        } else if (AnonymousClass4SG.A2b(this) == null || !this.A09.A02()) {
            this.A05.A0H(R.string.f11nameremoved, 1);
            startActivity(C627736r.A03(this));
        } else {
            if (AnonymousClass5XU.A00()) {
                Log.w("contactpicker/device-not-supported");
                Boo(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
            }
            if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
                setTitle(R.string.f11nameremoved);
            }
            setContentView((int) R.layout.f8nameremoved);
            AnonymousClass4SG.A37(this);
            if (!C86634Kw.A1b(this.A0D) || AnonymousClass4SG.A44(this) || AnonymousClass4SG.A45(this) || (this.A09.A02("android.permission.GET_ACCOUNTS") == 0 && this.A05.A00())) {
                A7A();
                return;
            }
            if (this.A00 == null) {
                this.A00 = C86664Kz.A0o(this, R.id.contacts_perm_banner_container).inflate();
                setTitle(R.string.f11nameremoved);
                Toolbar A2T = AnonymousClass4SG.A2T(this);
                A2T.setSubtitle((int) R.string.f11nameremoved);
                setSupportActionBar(A2T);
                boolean A2I = AnonymousClass1Hf.A2I(this);
                C106905aM.A04(C18310x6.A0L(this, R.id.banner_title));
                C18310x6.A17(findViewById(R.id.contacts_perm_sync_btn), this, 27);
                this.A01 = (FragmentContainerView) findViewById(R.id.fragment);
                Integer valueOf = Integer.valueOf(A2I ? 1 : 0);
                AnonymousClass1X9 r1 = new AnonymousClass1X9();
                r1.A00 = valueOf;
                r1.A01 = valueOf;
                this.A0A.BhD(r1);
            }
            View view = this.A00;
            C626936e.A04(view);
            view.setVisibility(0);
            C86604Kt.A1A(this.A01);
            return;
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = this.A06;
            if (baseSharedPreviewDialogFragment != null) {
                baseSharedPreviewDialogFragment.A1K();
                return true;
            }
            ContactPickerFragment contactPickerFragment = this.A08;
            if (contactPickerFragment != null && contactPickerFragment.A28()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public int A5t() {
        return 78318969;
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A08;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1X();
        return true;
    }
}
