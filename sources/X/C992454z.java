package X;

import android.app.Activity;
import android.widget.TextView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.54z  reason: invalid class name and case insensitive filesystem */
public class C992454z extends AnonymousClass5ZM {
    public ArrayList A00;
    public final C56962sq A01;
    public final C64773Ex A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String A05;
        if (this.A04.get() != null) {
            String str = this.A03;
            if (!C107575bX.A0F(str)) {
                if (this.A00 == null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    this.A00 = A0s;
                    this.A02.A0b(A0s);
                }
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    AnonymousClass3ZH A0R = C18310x6.A0R(it);
                    C95814uZ r1 = (C95814uZ) AnonymousClass3ZH.A03(A0R);
                    if (r1 != null && !this.A01.A0d.contains(r1) && (A05 = AnonymousClass36P.A05(r1)) != null && A05.equals(str)) {
                        return A0R;
                    }
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3ZH r10 = (AnonymousClass3ZH) obj;
        C112815kQ r5 = (C112815kQ) this.A04.get();
        if (r5 != null) {
            Activity activity = r5.A03;
            if (activity.isFinishing()) {
                return;
            }
            if (r10 != null) {
                C104195Qa r4 = r5.A07;
                r4.A01(r10, activity.getString(R.string.f11nameremoved));
                String string = activity.getString(R.string.f11nameremoved);
                C109465ef r2 = new C109465ef(r5, 30, r10);
                C162457s7.A0J(string, 0);
                TextView textView = r4.A03;
                textView.setText(string);
                textView.setVisibility(0);
                textView.setOnClickListener(r2);
                return;
            }
            String str = r5.A02;
            AnonymousClass31C r7 = r5.A09;
            C66413Li r6 = r5.A08;
            C992955e r22 = new C992955e(r5.A05, r5.A06, r5, r6, r7, str);
            r5.A01 = r22;
            C18270x1.A0w(r22, r5.A0A);
        }
    }

    public C992454z(C56962sq r2, C64773Ex r3, C112815kQ r4, String str) {
        this.A04 = AnonymousClass0x9.A14(r4);
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
    }
}
