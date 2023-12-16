package X;

import android.util.Log;
import com.facebook.rendercore.RootHostView;

/* renamed from: X.8Ex  reason: invalid class name and case insensitive filesystem */
public class C170888Ex implements C184128rI {
    public final /* synthetic */ AnonymousClass6EP A00;

    public C170888Ex(AnonymousClass6EP r1) {
        this.A00 = r1;
    }

    public void BPa(AnonymousClass7r0 r5) {
        C47382dA r2;
        AnonymousClass6EP r3 = this.A00;
        RootHostView rootHostView = r3.A03;
        if (rootHostView != null) {
            rootHostView.setVisibility(0);
        }
        C159037kz r0 = r3.A04;
        if (r0 != null) {
            r0.A05();
        }
        C184138rJ r1 = r3.A08;
        if (r1 != null) {
            r1.Blo(new C147077Cs(r5));
        }
        C08310eF r12 = r3.A02;
        if (!(r12 == null || (r2 = r3.A06) == null || !r12.A16())) {
            r3.A04 = new C54852pO(r12.A0R(), r5, r2).A00();
        }
        r3.A00();
        C181908nY r02 = r3.A07;
        if (r02 != null) {
            r02.BjL();
        }
    }

    public void BSF(String str) {
        Log.e("Whatsapp", str);
        C181908nY r0 = this.A00.A07;
        if (r0 != null) {
            r0.BjL();
        }
    }
}
