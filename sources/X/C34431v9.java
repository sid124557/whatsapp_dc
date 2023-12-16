package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1v9  reason: invalid class name and case insensitive filesystem */
public class C34431v9 extends AnonymousClass361 {
    public boolean A01(UserJid userJid, boolean z) {
        C85284Fq A07;
        try {
            A07 = C18630y0.A07(this);
            if (z) {
                ContentValues A072 = AnonymousClass0x9.A07(1);
                AnonymousClass0x2.A0n(A072, userJid, "jid");
                AnonymousClass361.A0B(A072, A07, "wa_block_list");
            } else {
                String[] strArr = new String[1];
                C18280x3.A0w(userJid, strArr, 0);
                AnonymousClass361.A08(A07, "wa_block_list", "jid = ?", strArr);
            }
            A07.close();
            return true;
        } catch (IllegalArgumentException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("contact-mgr-db/unable to update blocked state  ");
            A0o.append(userJid);
            C626936e.A08(AnonymousClass000.A0b(", ", A0o, z), e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A00(Set set) {
        C69833Yo Axl;
        AnonymousClass33M A00 = AnonymousClass33M.A00();
        C85284Fq A07 = C18630y0.A07(this);
        try {
            Axl = A07.Axl();
            AnonymousClass361.A08(A07, "wa_block_list", (String) null, (String[]) null);
            ContentValues A072 = AnonymousClass0x9.A07(1);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass0x2.A0n(A072, C18310x6.A0T(it), "jid");
                AnonymousClass361.A06(A072, A07, "wa_block_list");
            }
            Axl.A00();
            Axl.close();
            AnonymousClass33M.A04(A00, "contact-mgr-db/updated block | time: ", C18280x3.A0f(A07));
            return;
        } catch (Throwable th) {
            try {
                A07.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C34431v9(AnonymousClass1RI r1) {
        super(r1);
    }
}
