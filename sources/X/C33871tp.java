package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1tp  reason: invalid class name and case insensitive filesystem */
public class C33871tp extends AnonymousClass5ZM {
    public final C106175Xx A00;
    public final C620433g A01;
    public final C64773Ex A02;
    public final C620633i A03;
    public final C54292oU A04;
    public final C620733j A05;
    public final C55302q8 A06;
    public final C95814uZ A07;
    public final AnonymousClass2ML A08;
    public final WeakReference A09;
    public final List A0A;

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A09);
        if (A0F != null) {
            A0F.BpA(R.string.f11nameremoved, R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C89654ea A0F = C18320x8.A0F(this.A09);
        if (A0F != null) {
            Intent intent = A0F.getIntent();
            C95814uZ r10 = this.A07;
            Bundle A022 = C627636p.A02(C627636p.A0A(intent.getBundleExtra("quoted_message")));
            C27991fJ A042 = AnonymousClass34R.A04(intent.getStringExtra("quoted_group_jid"));
            boolean A1N = AnonymousClass0x9.A1N(intent, "has_number_from_url");
            Intent className = C18320x8.A07().setClassName(A0F.getPackageName(), "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
            className.putExtra("edit_mode", true);
            C627336j.A0D(className, r10, "jid");
            className.putExtra("quoted_message", A022);
            C627336j.A0D(className, A042, "quoted_group_jid");
            className.putExtra("has_number_from_url", A1N);
            className.putStringArrayListExtra("vcard_array", arrayList);
            A0F.BpY(className, 8);
            A0F.BjL();
        }
    }

    public C33871tp(C106175Xx r2, C620433g r3, C64773Ex r4, PhoneContactsSelector phoneContactsSelector, C620633i r6, C54292oU r7, C620733j r8, C55302q8 r9, C95814uZ r10, AnonymousClass2ML r11, List list) {
        this.A04 = r7;
        this.A02 = r4;
        this.A03 = r6;
        this.A05 = r8;
        this.A00 = r2;
        this.A01 = r3;
        this.A08 = r11;
        this.A09 = AnonymousClass0x9.A14(phoneContactsSelector);
        this.A07 = r10;
        this.A0A = list;
        this.A06 = r9;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("phonecontactsselector/onsubmit/convertcontactstask ");
        List<C104215Qc> list = this.A0A;
        A0o.append(list.size());
        AnonymousClass33M A012 = AnonymousClass33M.A01(AnonymousClass000.A0X(" selected contacts", A0o));
        for (C104215Qc r8 : list) {
            if (r8.A02 == null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("phonecontactsselector/onsubmit/convertcontactstask/contact ");
                long j = r8.A04;
                A0o2.append(j);
                C18260x0.A1J(A0o2, " was not pre-populated");
                long uptimeMillis = SystemClock.uptimeMillis();
                C54292oU r12 = this.A04;
                C64773Ex r11 = this.A02;
                C620633i r10 = this.A03;
                C620733j r9 = this.A05;
                C106175Xx r3 = this.A00;
                C620433g r2 = this.A01;
                C104215Qc r20 = r8;
                C64773Ex r19 = r11;
                C620433g r18 = r2;
                C106175Xx r17 = r3;
                r8.A02 = PhoneContactsSelector.A0C(r17, r18, r19, r20, r10, r12, r9, this.A06, this.A08);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("phonecontactsselector/onsubmit/convertcontactstask/processing contact ");
                A0o3.append(j);
                A0o3.append(" took ");
                C18260x0.A1H(A0o3, uptimeMillis2 - uptimeMillis);
            }
            String str = r8.A02;
            if (str != null) {
                A0s.add(str);
            } else {
                StringBuilder A0o4 = AnonymousClass001.A0o();
                A0o4.append("phonecontactsselector/onsubmit/convertcontactstask/could not generate vcard for contact with id ");
                A0o4.append(r8.A04);
                AnonymousClass0x2.A19(A0o4);
            }
        }
        A012.A07();
        return A0s;
    }
}
