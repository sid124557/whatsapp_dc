package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5lg  reason: invalid class name and case insensitive filesystem */
public class C113595lg implements AnonymousClass4E8 {
    public final C105215Ua A00;

    public String BDW() {
        return "DraftVoiceNotesCacheDailyCron";
    }

    public /* synthetic */ void BQW() {
    }

    public void BQX() {
        File[] listFiles;
        C105215Ua r6 = this.A00;
        Log.d("draftvoicenotecache/deleteexpiredvoicenotes");
        File A01 = r6.A01();
        if (A01 != null && (listFiles = A01.listFiles()) != null) {
            for (File file : listFiles) {
                if (file.lastModified() + 604800000 <= System.currentTimeMillis()) {
                    boolean A0O = C627536m.A0O(file);
                    r6.A06.A00(file);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(AnonymousClass0x7.A0p(file, "draftvoicenotecache/deleteexpiredvoicenotes/deleting expired note ", A0o));
                    C18260x0.A1D(" deleted: ", A0o, A0O);
                }
            }
        }
    }

    public C113595lg(C105215Ua r1) {
        this.A00 = r1;
    }
}
