package X;

import android.content.ContentValues;
import com.whatsapp.textstatus.AddTextStatusActivity;

/* renamed from: X.3aG  reason: invalid class name and case insensitive filesystem */
public class C70293aG implements Runnable {
    public long A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C70293aG(Object obj, String str, int i, long j) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = j;
    }

    public final void run() {
        if (this.A03 != 0) {
            String str = this.A02;
            long j = this.A00;
            AnonymousClass2H3 r1 = ((C45182Yz) this.A01).A00;
            C626936e.A00();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("draftvoicenotemetadadb/insertorupdate/");
            A0o.append(str);
            C18260x0.A10("/pagenumber=", A0o, j);
            C85284Fq A0C = r1.A00.A0C();
            try {
                ContentValues A06 = AnonymousClass0x9.A06();
                A06.put("chat_jid", str);
                AnonymousClass3H0.A02(A06, A0C, "page_number", j).A0A("draft_voice_note_metadata", "draft_voice_note_metadata.INSERT_OR_PAGE_NUMBER_FOR_CHAT_JID", A06);
                C18260x0.A10("/pagenumber=", AnonymousClass000.A0m("draftvoicenotemetadadb/insertorupdate/", str), j);
                A0C.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A01;
            String str2 = this.A02;
            long j2 = this.A00;
            C162457s7.A0J(str2, 1);
            C54982pb r4 = addTextStatusActivity.A0A;
            if (r4 != null) {
                int i = 60;
                int length = str2.length();
                if (60 > length) {
                    i = length;
                }
                String substring = str2.substring(0, i);
                C162457s7.A0D(substring);
                r4.A02(j2, substring, false, addTextStatusActivity.A0D);
                return;
            }
            throw C18270x1.A0S("myEvolvedAbout");
        }
    }
}
