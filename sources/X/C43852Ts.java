package X;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.2Ts  reason: invalid class name and case insensitive filesystem */
public class C43852Ts {
    public Account A00;
    public Account[] A01;
    public final Context A02;
    public final EditText A03;
    public final ImageView A04;
    public final TextInputLayout A05;
    public final C69263Wi A06;
    public final C44772Xk A07;
    public final AnonymousClass5ZR A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass4FS A0A;
    public final WeakReference A0B;

    public C43852Ts(Context context, View view, C69263Wi r6, C44772Xk r7, AnonymousClass49Z r8, AnonymousClass5ZR r9, AnonymousClass1VX r10, AnonymousClass4FS r11) {
        this.A02 = context;
        this.A06 = r6;
        this.A0A = r11;
        this.A09 = r10;
        this.A07 = r7;
        this.A08 = r9;
        this.A0B = AnonymousClass0x9.A14(r8);
        this.A03 = (EditText) C06560Yg.A02(view, R.id.storage_options_field);
        this.A04 = AnonymousClass0x9.A0E(view, R.id.save_to_icon);
        this.A05 = (TextInputLayout) C06560Yg.A02(view, R.id.contacts_storage_options_selector);
        C18310x6.A17(this.A03, this, 20);
        this.A05.setHint((CharSequence) this.A02.getResources().getString(R.string.f11nameremoved));
        this.A0A.BkP(C69963Zi.A00(this, 49));
    }
}
