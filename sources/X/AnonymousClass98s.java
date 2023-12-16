package X;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.98s  reason: invalid class name */
public abstract class AnonymousClass98s extends AnonymousClass97S implements C203299nT, C202399lx {
    public C44122Ut A00;
    public C193949Qw A01;
    public AnonymousClass9VP A02;
    public AnonymousClass64S A03;
    public AnonymousClass5HJ A04;
    public BloksDialogFragment A05;
    public AnonymousClass7UQ A06;
    public AnonymousClass4FV A07;
    public Map A08;
    public final AnonymousClass9VZ A09 = new AnonymousClass9VZ();

    public static void A0a(Intent intent, String str, String str2) {
        HashMap hashMap;
        Serializable serializableExtra = intent.getSerializableExtra("screen_params");
        if (serializableExtra == null) {
            hashMap = AnonymousClass001.A0t();
        } else {
            hashMap = (HashMap) serializableExtra;
        }
        hashMap.put(str, str2);
        intent.putExtra("screen_params", hashMap);
    }

    public AnonymousClass64S A74() {
        AnonymousClass5HJ r2 = this.A04;
        AnonymousClass9VZ r1 = this.A09;
        C56612sH r9 = this.A06;
        C69263Wi r4 = this.A05;
        C56972sr r5 = this.A01;
        AnonymousClass4FV r11 = this.A07;
        C620633i r8 = this.A08;
        C620733j r10 = this.A00;
        C196169aP r0 = new C196169aP(r1, new C196149aN(r4, r5, this.A01, this.A02, r8, r9, r10, r11), r2);
        r2.A00 = r0;
        return r0;
    }

    public void A75() {
        String str = AnonymousClass9KY.A00;
        if (str == null) {
            str = getIntent().getStringExtra("screen_name");
        }
        if (!TextUtils.isEmpty(str)) {
            this.A05 = BloksDialogFragment.A00(str, AnonymousClass9KY.A01);
            AnonymousClass97S.A0L(getSupportFragmentManager(), this).A01();
        }
    }

    public void onBackPressed() {
        AnonymousClass9VZ r5 = this.A09;
        HashMap hashMap = r5.A01;
        C52792m3 r1 = (C52792m3) hashMap.get("backpress");
        if (r1 != null) {
            r1.A00("on_success");
            return;
        }
        C08270df supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.A07() <= 1) {
            setResult(0, C379524r.A00(getIntent()));
            AnonymousClass9KY.A00 = null;
            AnonymousClass9KY.A01 = null;
            finish();
            return;
        }
        supportFragmentManager.A0M();
        supportFragmentManager.A0K();
        AnonymousClass9VZ.A00(hashMap);
        Stack stack = r5.A02;
        stack.pop();
        C08270df supportFragmentManager2 = getSupportFragmentManager();
        this.A05 = BloksDialogFragment.A00(((C08240dc) ((C15060qi) supportFragmentManager2.A0E.get(supportFragmentManager2.A07() - 1))).A0A, (HashMap) stack.peek());
        AnonymousClass97S.A0L(supportFragmentManager, this).A01();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.d("PAY: BloksActivity: onRestoreInstanceState()");
        super.onRestoreInstanceState(bundle);
        AnonymousClass9VZ r2 = this.A09;
        ArrayList arrayList = (ArrayList) bundle.getSerializable("screen_manager_saved_state");
        if (arrayList != null) {
            Stack stack = r2.A02;
            stack.clear();
            stack.addAll(arrayList);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Log.d("PAY: BloksActivity: onSaveInstanceState()");
        super.onSaveInstanceState(bundle);
        Stack stack = this.A09.A02;
        if (!stack.isEmpty()) {
            ArrayList A0y = C18290x4.A0y(stack);
            Iterator it = stack.iterator();
            while (it.hasNext()) {
                A0y.add(new HashMap((Map) it.next()));
            }
            bundle.putSerializable("screen_manager_saved_state", A0y);
        }
    }

    public void onCreate(Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra("screen_params");
        AnonymousClass9VZ r2 = this.A09;
        AnonymousClass9VZ.A00(r2.A01);
        r2.A02.add(AnonymousClass001.A0t());
        if (serializableExtra != null) {
            r2.A02((Map) serializableExtra);
        }
        super.onCreate(bundle);
        try {
            C155137eL.A00(getApplicationContext());
        } catch (IOException unused) {
        }
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A072 = C1899593h.A07(this);
        A072.A07();
        setSupportActionBar(A072);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0o(supportActionBar, "");
        }
        C131666dx A0J = AnonymousClass0x7.A0J(this, this.A00, R.drawable.ic_back);
        A0J.setColorFilter(getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
        A072.setNavigationIcon((Drawable) A0J);
        A072.setNavigationOnClickListener(C204249p3.A00(this, 2));
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass9VZ r2 = this.A09;
        Iterator it = r2.A02.iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
        AnonymousClass9VZ.A00(r2.A01);
        r2.A00.A01.clear();
    }

    public void onPause() {
        super.onPause();
        this.A09.A03(false);
    }

    public void onResume() {
        super.onResume();
        if (this.A03 == null) {
            this.A03 = A74();
        }
        this.A06.A00(getApplicationContext(), this.A03.B3s(), C1899693i.A09(this, getSupportFragmentManager(), this.A00, this.A08));
        this.A09.A03(true);
    }
}
