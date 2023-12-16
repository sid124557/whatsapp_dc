package X;

import android.app.Activity;
import android.content.ContentValues;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.3b4  reason: invalid class name and case insensitive filesystem */
public class C70793b4 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final int A06;

    public C70793b4(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
        this.A05 = z;
        this.A03 = obj4;
    }

    public final void run() {
        ContentValues A07;
        C08310eF A0D;
        switch (this.A06) {
            case 0:
                C95814uZ r5 = (C95814uZ) this.A01;
                String str = this.A04;
                Runnable runnable = (Runnable) this.A02;
                boolean z = this.A05;
                C371321b r4 = (C371321b) this.A03;
                C183538qC r50 = ((C56542sA) this.A00).A02;
                C56922sm r8 = C18310x6.A0Q(r50).A0C;
                C56982ss r6 = r8.A02;
                if (C56982ss.A00(r6, r5) != null) {
                    Log.w("msgstore/createchat/already exists");
                    return;
                }
                AnonymousClass31A r3 = new AnonymousClass31A(r5);
                if (z) {
                    r3.A0F = -1;
                }
                if (!(r5 instanceof C95804uY)) {
                    r3.A00 = 1;
                } else {
                    long j = r3.A0W;
                    long j2 = r3.A0X;
                    C372821q r18 = C372821q.GUEST;
                    C371421c r21 = C371421c.PUBLIC;
                    C371621e r23 = C371621e.NOT_VERIFIED;
                    ArrayList A0s = AnonymousClass001.A0s();
                    C372321l r22 = C372321l.NOT_ENFORCED;
                    AnonymousClass31A r17 = r3;
                    AnonymousClass1RL r15 = new AnonymousClass1RL((C129586aY) null, r17, r18, AnonymousClass599.DEFAULT, C372921r.DEFAULT, r21, r22, r23, (Long) null, r3.A0h, (String) null, (String) null, (String) null, (String) null, (String) null, A0s, j, 0, 0, 0, 0, j2, 0, true, false, false, false);
                    r3 = r15;
                    r15.A00 = 0;
                }
                r6.A0H(r3, r5);
                r3.A04 = 1;
                r3.A0B = -1;
                r3.A0C = -1;
                r3.A0X = System.currentTimeMillis();
                r3.A0h = str;
                if (r3.A0Z == null) {
                    r3.A0Z = r4;
                }
                C623334p r62 = r8.A04;
                synchronized (r3) {
                    A07 = AnonymousClass0x9.A07(8);
                    C18270x1.A0c(A07, "jid_row_id", r62.A05(r3.A0q));
                    A07.put("subject", r3.A0h);
                    C18270x1.A0b(A07, "plaintext_disabled", r3.A00);
                    C18270x1.A0b(A07, "vcard_ui_dismissed", r3.A0B);
                    C18270x1.A0c(A07, "change_number_notified_message_row_id", r3.A0C);
                    C18270x1.A0c(A07, "sort_timestamp", r3.A0X);
                    C18270x1.A0b(A07, "spam_detection", 1);
                }
                long A062 = r8.A06(A07);
                if (A062 == -1) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "msgstore/addchat/insert/failed gid=", r5);
                } else {
                    r3.A0W = A062;
                }
                if (runnable != null) {
                    runnable.run();
                }
                C28871hu r32 = C18310x6.A0Q(r50).A0B;
                r32.A00.BkS(new C70093Zw(r32, 17, r5));
                return;
            case 1:
                AnonymousClass3XX r42 = (AnonymousClass3XX) this.A00;
                String str2 = this.A04;
                boolean z2 = this.A05;
                C162457s7.A0J(str2, 2);
                C64333Db r0 = r42.A00.A00.A01;
                AnonymousClass1VX A4B = C64333Db.A4B(r0);
                new C27311dc(C64333Db.A07(r0), (C60852zH) this.A01, C64333Db.A2s(r0), A4B, C64333Db.A7R(r0), C64333Db.A9V(r0), str2, r0.A9f, r0.A9g).Bh4(new C67213Ok((Activity) this.A02, (C41182Jg) this.A03, r42, z2));
                return;
            default:
                String str3 = this.A04;
                Activity activity = (Activity) this.A00;
                AnonymousClass3XX r52 = (AnonymousClass3XX) this.A01;
                C41182Jg r43 = (C41182Jg) this.A02;
                Map map = (Map) this.A03;
                boolean z3 = this.A05;
                C162457s7.A0J(str3, 0);
                if (str3.equals("error")) {
                    C162457s7.A0K(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    C08310eF A0D2 = ((C003203q) activity).getSupportFragmentManager().A0D("extensions_bottom_sheet_container");
                    if (!(A0D2 == null || (A0D = A0D2.A0T().A0D("BK_FRAGMENT")) == null)) {
                        ((WaBkExtensionsLayoutViewModel) AnonymousClass0x9.A0H(A0D).A01(WaBkExtensionsLayoutViewModel.class)).A0G((C27091dG) null, (String) null, (String) null, "extensions-fetch-catalog-error", z3);
                    }
                }
                r52.A03.A00(r43, "fetch_catalog").A02(str3, map);
                return;
        }
    }
}
