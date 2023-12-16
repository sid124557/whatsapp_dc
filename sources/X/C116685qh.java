package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.5qh  reason: invalid class name and case insensitive filesystem */
public final class C116685qh implements C16430tO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass5ZD A01;
    public final /* synthetic */ C55862r2 A02;
    public final /* synthetic */ C55782qu A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ boolean A05;

    public void BPR(AnonymousClass0JP r11) {
        Exception exc;
        C372621o r0;
        C162457s7.A0J(r11, 0);
        AnonymousClass5ZD r5 = this.A01;
        C89654ea A002 = AnonymousClass5ZD.A00(this.A04);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            r5.A05.set(false);
            return;
        }
        C55782qu r4 = this.A03;
        int i = this.A00;
        r4.A05(C137466oj.A00, A00(r11), i);
        r4.A01(i, "editor_callback");
        boolean z = r11 instanceof AnonymousClass0F8;
        if (z) {
            r5.A01.A00 = "com.bloks.www.avatar.editor.cds.launcher.async";
            r5.A06.set(r5.A02.A0H());
            A002.BjL();
            C55862r2 r8 = this.A02;
            boolean z2 = this.A05;
            r8.A05((Integer) null, (String) null, 2, z2);
            r8.A04((Integer) null, (String) null, 4, z2);
        } else {
            C55862r2 r7 = this.A02;
            boolean z3 = this.A05;
            A002.BjL();
            r5.A02(A002, r11);
            int i2 = 1;
            if (!r11.equals(AnonymousClass0F7.A00)) {
                if (r11 instanceof AnonymousClass0F5) {
                    exc = ((AnonymousClass0F5) r11).A00.A02;
                } else if (r11.equals(AnonymousClass0F8.A00)) {
                    throw AnonymousClass001.A0e("Success type should not be converted to error type.");
                } else if (r11 instanceof AnonymousClass0F6) {
                    exc = ((AnonymousClass0F6) r11).A00;
                } else {
                    throw C73153f1.A00();
                }
                if (exc instanceof IOException) {
                    i2 = 0;
                }
            }
            r7.A05(Integer.valueOf(i2), A00(r11), 3, z3);
        }
        r5.A05.set(false);
        if (z) {
            r0 = C372621o.SUCCESS;
        } else {
            r0 = C372621o.FAIL;
        }
        r4.A02(r0, i);
    }

    public C116685qh(AnonymousClass5ZD r1, C55862r2 r2, C55782qu r3, WeakReference weakReference, int i, boolean z) {
        this.A01 = r1;
        this.A04 = weakReference;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = z;
    }

    public static final String A00(AnonymousClass0JP r2) {
        String str;
        if (r2.equals(AnonymousClass0F7.A00)) {
            return "activity_no_longer_active";
        }
        if (r2.equals(AnonymousClass0F8.A00)) {
            return "success";
        }
        if (r2 instanceof AnonymousClass0F5) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("bk_layout_data_error (");
            Exception exc = ((AnonymousClass0F5) r2).A00.A02;
            if (exc == null || (str = exc.getMessage()) == null) {
                str = "no exception attached";
            }
            return C18260x0.A07(str, A0o);
        } else if (r2 instanceof AnonymousClass0F6) {
            return "unknown_error";
        } else {
            throw C73153f1.A00();
        }
    }
}
